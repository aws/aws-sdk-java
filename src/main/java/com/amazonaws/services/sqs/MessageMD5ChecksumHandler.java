/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;
import com.amazonaws.services.sqs.model.Message;
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
 * SQS operations on sending and receiving messages will return the MD5 digest
 * of the message body. This custom request handler will verify that the message
 * is correctly received by SQS, by comparing the returned MD5 with the
 * calculation according to the original request.
 */
public class MessageMD5ChecksumHandler extends AbstractRequestHandler {
	
	private static final Log log = LogFactory.getLog(MessageMD5ChecksumHandler.class);
	
    @Override
    public void afterResponse(Request<?> request, Object response, TimingInfo timingInfo) {
    	if (null != request && null != response) {
    		// SendMessage
        	if (request.getOriginalRequest() instanceof SendMessageRequest
        			&& response instanceof SendMessageResult) {
        		if (log.isDebugEnabled())
        			log.debug("Checking the MD5 digest returned in SendMessageResult.");
        		SendMessageRequest sendMessageRequest = (SendMessageRequest)request.getOriginalRequest();
        		SendMessageResult sendMessageResult = (SendMessageResult)response;
        		String messageSent = sendMessageRequest.getMessageBody();
        		String md5Returned = sendMessageResult.getMD5OfMessageBody();
        		if ( !checkMessageMd5(messageSent, md5Returned) )
        			throw new AmazonClientException("MD5 returned by SQS does not match the calculation on the original request.(Message body: \""
        					+ messageSent + "\", MD5 returned: \"" + md5Returned + "\")");
        	}
        	// ReceiveMessage
        	else if (request.getOriginalRequest() instanceof ReceiveMessageRequest
        			&& response instanceof ReceiveMessageResult) {
        		if (log.isDebugEnabled())
        			log.debug("Checking the MD5 digest returned in ReceiveMessageResult.");
        		ReceiveMessageResult receiveMessageResult = (ReceiveMessageResult)response;
        		if (null != receiveMessageResult.getMessages()) {
        			for (Message messageReceived : receiveMessageResult.getMessages()) {
            			String messageBody = messageReceived.getBody();
            			String md5 = messageReceived.getMD5OfBody();
            			if ( !checkMessageMd5(messageBody, md5) )
            				throw new AmazonClientException("MD5 returned by SQS does not match the calculation on the original request.(Message body: \""
                					+ messageBody + "\", MD5 returned: \"" + md5 + "\")");
            		}
        		}
        	}
        	// SendMessageBatchs
        	else if (request.getOriginalRequest() instanceof SendMessageBatchRequest
        			&& response instanceof SendMessageBatchResult) {
        		if (log.isDebugEnabled())
        			log.debug("Checking the MD5 digest returned in SendMessageBatchResult.");
        		SendMessageBatchRequest sendMessageBatchRequest = (SendMessageBatchRequest)request.getOriginalRequest();
        		SendMessageBatchResult sendMessageBatchResult = (SendMessageBatchResult)response;
        		Map<String, String> idToMessageBodyMap = new HashMap<String, String>();
        		if (null != sendMessageBatchRequest.getEntries()) {
        			for (SendMessageBatchRequestEntry entry : sendMessageBatchRequest.getEntries()) {
            			idToMessageBodyMap.put(entry.getId(), entry.getMessageBody());
            		}
        		}
        		if (null != sendMessageBatchResult.getSuccessful()) {
        			for (SendMessageBatchResultEntry entry : sendMessageBatchResult.getSuccessful()) {
        				if ( !checkMessageMd5(idToMessageBodyMap.get(entry.getId()), entry.getMD5OfMessageBody()) )
        					throw new AmazonClientException("MD5 returned by SQS does not match the calculation on the original request.(Message body: \""
                					+ idToMessageBodyMap.get(entry.getId()) 
                					+ "\", MD5 returned: \"" + entry.getMD5OfMessageBody() + "\")");
        			}
        		}
        	}
    	}
    }
    
    private boolean checkMessageMd5(String messageBody, String md5) {
    	if (log.isDebugEnabled()) {
    		log.debug("Raw Message: " + messageBody);
    	}
		byte[] expectedMd5;
		try {
			expectedMd5 = Md5Utils.computeMD5Hash(messageBody.getBytes("UTF-8"));
		} catch (Exception e) {
            throw new AmazonClientException(
                    "Unable to calculate MD5 hash: " + e.getMessage(), e);
		}
		String expectedMd5Hex = BinaryUtils.toHex(expectedMd5);
		if (log.isDebugEnabled()) {
    		log.debug("Expected  MD5: " + expectedMd5Hex);
    		log.debug("From Response: " + md5);
    	}
		return expectedMd5Hex.equals(md5);
    }
}
