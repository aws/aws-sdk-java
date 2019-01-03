/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.MessageAttributeValue;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import com.amazonaws.services.sqs.model.ReceiveMessageResult;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResult;
import com.amazonaws.services.sqs.model.SendMessageBatchResultEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.TimingInfo;

/**
 * SQS operations on sending and receiving messages will return the MD5 digest of the message body.
 * This custom request handler will verify that the message is correctly received by SQS, by
 * comparing the returned MD5 with the calculation according to the original request.
 */
public class MessageMD5ChecksumHandler extends AbstractRequestHandler {

    private static final int INTEGER_SIZE_IN_BYTES = 4;
    private static final byte STRING_TYPE_FIELD_INDEX = 1;
    private static final byte BINARY_TYPE_FIELD_INDEX = 2;
    private static final byte STRING_LIST_TYPE_FIELD_INDEX = 3;
    private static final byte BINARY_LIST_TYPE_FIELD_INDEX = 4;

    /*
     * Constant strings for composing error message.
     */
    private static final String MD5_MISMATCH_ERROR_MESSAGE = "MD5 returned by SQS does not match the calculation on the original request. "
            + "(MD5 calculated by the %s: \"%s\", MD5 checksum returned: \"%s\")";
    private static final String MD5_MISMATCH_ERROR_MESSAGE_WITH_ID = "MD5 returned by SQS does not match the calculation on the original request. "
            + "(Message ID: %s, MD5 calculated by the %s: \"%s\", MD5 checksum returned: \"%s\")";
    private static final String MESSAGE_BODY = "message body";
    private static final String MESSAGE_ATTRIBUTES = "message attributes";

    private static final Log log = LogFactory.getLog(MessageMD5ChecksumHandler.class);

    @Override
    public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo) {
        if (request != null && response != null) {
            // SendMessage
            if (request.getOriginalRequest() instanceof SendMessageRequest && response instanceof SendMessageResult) {
                SendMessageRequest sendMessageRequest = (SendMessageRequest) request.getOriginalRequest();
                SendMessageResult sendMessageResult = (SendMessageResult) response;
                sendMessageOperationMd5Check(sendMessageRequest, sendMessageResult);
            }

            // ReceiveMessage
            else if (request.getOriginalRequest() instanceof ReceiveMessageRequest
                    && response instanceof ReceiveMessageResult) {
                ReceiveMessageResult receiveMessageResult = (ReceiveMessageResult) response;
                receiveMessageResultMd5Check(receiveMessageResult);
            }

            // SendMessageBatch
            else if (request.getOriginalRequest() instanceof SendMessageBatchRequest
                    && response instanceof SendMessageBatchResult) {
                SendMessageBatchRequest sendMessageBatchRequest = (SendMessageBatchRequest) request
                        .getOriginalRequest();
                SendMessageBatchResult sendMessageBatchResult = (SendMessageBatchResult) response;
                sendMessageBatchOperationMd5Check(sendMessageBatchRequest, sendMessageBatchResult);
            }
        }
    }

    /**
     * Throw an exception if the MD5 checksums returned in the SendMessageResult do not match the
     * client-side calculation based on the original message in the SendMessageRequest.
     */
    private static void sendMessageOperationMd5Check(SendMessageRequest sendMessageRequest,
                                                     SendMessageResult sendMessageResult) {
        String messageBodySent = sendMessageRequest.getMessageBody();
        String bodyMd5Returned = sendMessageResult.getMD5OfMessageBody();
        String clientSideBodyMd5 = calculateMessageBodyMd5(messageBodySent);
        if (!clientSideBodyMd5.equals(bodyMd5Returned)) {
            throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE, MESSAGE_BODY, clientSideBodyMd5,
                    bodyMd5Returned));
        }

        Map<String, MessageAttributeValue> messageAttrSent = sendMessageRequest.getMessageAttributes();
        if (messageAttrSent != null && !messageAttrSent.isEmpty()) {
            String clientSideAttrMd5 = calculateMessageAttributesMd5(messageAttrSent);
            String attrMd5Returned = sendMessageResult.getMD5OfMessageAttributes();
            if (!clientSideAttrMd5.equals(attrMd5Returned)) {
                throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE, MESSAGE_ATTRIBUTES,
                        clientSideAttrMd5, attrMd5Returned));
            }
        }
    }

    /**
     * Throw an exception if the MD5 checksums included in the ReceiveMessageResult do not match the
     * client-side calculation on the received messages.
     */
    private static void receiveMessageResultMd5Check(ReceiveMessageResult receiveMessageResult) {
        if (receiveMessageResult.getMessages() != null) {
            for (Message messageReceived : receiveMessageResult.getMessages()) {
                String messageBody = messageReceived.getBody();
                String bodyMd5Returned = messageReceived.getMD5OfBody();
                String clientSideBodyMd5 = calculateMessageBodyMd5(messageBody);
                if (!clientSideBodyMd5.equals(bodyMd5Returned)) {
                    throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE, MESSAGE_BODY,
                            clientSideBodyMd5, bodyMd5Returned));
                }

                Map<String, MessageAttributeValue> messageAttr = messageReceived.getMessageAttributes();
                if (messageAttr != null && !messageAttr.isEmpty()) {
                    String attrMd5Returned = messageReceived.getMD5OfMessageAttributes();
                    String clientSideAttrMd5 = calculateMessageAttributesMd5(messageAttr);
                    if (!clientSideAttrMd5.equals(attrMd5Returned)) {
                        throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE, MESSAGE_ATTRIBUTES,
                                clientSideAttrMd5, attrMd5Returned));
                    }
                }
            }
        }
    }

    /**
     * Throw an exception if the MD5 checksums returned in the SendMessageBatchResult do not match
     * the client-side calculation based on the original messages in the SendMessageBatchRequest.
     */
    private static void sendMessageBatchOperationMd5Check(SendMessageBatchRequest sendMessageBatchRequest,
                                                          SendMessageBatchResult sendMessageBatchResult) {
        Map<String, SendMessageBatchRequestEntry> idToRequestEntryMap = new HashMap<String, SendMessageBatchRequestEntry>();
        if (sendMessageBatchRequest.getEntries() != null) {
            for (SendMessageBatchRequestEntry entry : sendMessageBatchRequest.getEntries()) {
                idToRequestEntryMap.put(entry.getId(), entry);
            }
        }

        if (sendMessageBatchResult.getSuccessful() != null) {
            for (SendMessageBatchResultEntry entry : sendMessageBatchResult.getSuccessful()) {
                String messageBody = idToRequestEntryMap.get(entry.getId()).getMessageBody();
                String bodyMd5Returned = entry.getMD5OfMessageBody();
                String clientSideBodyMd5 = calculateMessageBodyMd5(messageBody);
                if (!clientSideBodyMd5.equals(bodyMd5Returned)) {
                    throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE_WITH_ID, MESSAGE_BODY,
                            entry.getId(), clientSideBodyMd5, bodyMd5Returned));
                }

                Map<String, MessageAttributeValue> messageAttr = idToRequestEntryMap.get(entry.getId())
                        .getMessageAttributes();
                if (messageAttr != null && !messageAttr.isEmpty()) {
                    String attrMd5Returned = entry.getMD5OfMessageAttributes();
                    String clientSideAttrMd5 = calculateMessageAttributesMd5(messageAttr);
                    if (!clientSideAttrMd5.equals(attrMd5Returned)) {
                        throw new AmazonClientException(String.format(MD5_MISMATCH_ERROR_MESSAGE_WITH_ID,
                                MESSAGE_ATTRIBUTES, entry.getId(), clientSideAttrMd5, attrMd5Returned));
                    }
                }
            }
        }
    }

    /**
     * Returns the hex-encoded MD5 hash String of the given message body.
     */
    private static String calculateMessageBodyMd5(String messageBody) {
        if (log.isDebugEnabled()) {
            log.debug("Message body: " + messageBody);
        }
        byte[] expectedMd5;
        try {
            expectedMd5 = Md5Utils.computeMD5Hash(messageBody.getBytes(UTF8));
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate the MD5 hash of the message body. " + e.getMessage(),
                    e);
        }
        String expectedMd5Hex = BinaryUtils.toHex(expectedMd5);
        if (log.isDebugEnabled()) {
            log.debug("Expected  MD5 of message body: " + expectedMd5Hex);
        }
        return expectedMd5Hex;
    }

    /**
     * Returns the hex-encoded MD5 hash String of the given message attributes.
     */
    private static String calculateMessageAttributesMd5(final Map<String, MessageAttributeValue> messageAttributes) {
        if (log.isDebugEnabled()) {
            log.debug("Message attribtues: " + messageAttributes);
        }
        List<String> sortedAttributeNames = new ArrayList<String>(messageAttributes.keySet());
        Collections.sort(sortedAttributeNames);

        MessageDigest md5Digest = null;
        try {
            md5Digest = MessageDigest.getInstance("MD5");

            for (String attrName : sortedAttributeNames) {
                MessageAttributeValue attrValue = messageAttributes.get(attrName);

                // Encoded Name
                updateLengthAndBytes(md5Digest, attrName);
                // Encoded Type
                updateLengthAndBytes(md5Digest, attrValue.getDataType());

                // Encoded Value
                if (attrValue.getStringValue() != null) {
                    md5Digest.update(STRING_TYPE_FIELD_INDEX);
                    updateLengthAndBytes(md5Digest, attrValue.getStringValue());
                } else if (attrValue.getBinaryValue() != null) {
                    md5Digest.update(BINARY_TYPE_FIELD_INDEX);
                    updateLengthAndBytes(md5Digest, attrValue.getBinaryValue());
                } else if (attrValue.getStringListValues().size() > 0) {
                    md5Digest.update(STRING_LIST_TYPE_FIELD_INDEX);
                    for (String strListMember : attrValue.getStringListValues()) {
                        updateLengthAndBytes(md5Digest, strListMember);
                    }
                } else if (attrValue.getBinaryListValues().size() > 0) {
                    md5Digest.update(BINARY_LIST_TYPE_FIELD_INDEX);
                    for (ByteBuffer byteListMember : attrValue.getBinaryListValues()) {
                        updateLengthAndBytes(md5Digest, byteListMember);
                    }
                }
            }
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate the MD5 hash of the message attributes. "
                    + e.getMessage(), e);
        }

        String expectedMd5Hex = BinaryUtils.toHex(md5Digest.digest());
        if (log.isDebugEnabled()) {
            log.debug("Expected  MD5 of message attributes: " + expectedMd5Hex);
        }
        return expectedMd5Hex;
    }

    /**
     * Update the digest using a sequence of bytes that consists of the length (in 4 bytes) of the
     * input String and the actual utf8-encoded byte values.
     */
    private static void updateLengthAndBytes(MessageDigest digest, String str) throws UnsupportedEncodingException {
        byte[] utf8Encoded = str.getBytes(UTF8);
        ByteBuffer lengthBytes = ByteBuffer.allocate(INTEGER_SIZE_IN_BYTES).putInt(utf8Encoded.length);
        digest.update(lengthBytes.array());
        digest.update(utf8Encoded);
    }

    /**
     * Update the digest using a sequence of bytes that consists of the length (in 4 bytes) of the
     * input ByteBuffer and all the bytes it contains.
     */
    private static void updateLengthAndBytes(MessageDigest digest, ByteBuffer binaryValue) {
        ByteBuffer readOnlyBuffer = binaryValue.asReadOnlyBuffer();
        int size = readOnlyBuffer.remaining();
        ByteBuffer lengthBytes = ByteBuffer.allocate(INTEGER_SIZE_IN_BYTES).putInt(size);
        digest.update(lengthBytes.array());
        digest.update(readOnlyBuffer);
    }
}
