/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sqs.buffered;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonServiceException.ErrorType;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.sqs.model.BatchResultErrorEntry;
import com.amazonaws.services.sqs.model.SendMessageBatchResultEntry;
import com.amazonaws.services.sqs.model.SendMessageResult;

/** this class converts sqs batch entry results to individual results */
class ResultConverter {

    static SendMessageResult convert(SendMessageBatchResultEntry br) {
        SendMessageResult toReturn = new SendMessageResult();
        toReturn.setMD5OfMessageBody(br.getMD5OfMessageBody());
        toReturn.setMessageId(br.getMessageId());
        toReturn.setMD5OfMessageAttributes(br.getMD5OfMessageAttributes());
        return toReturn;
    }

    static Exception convert(BatchResultErrorEntry be) {
        AmazonServiceException toReturn = new AmazonServiceException(be.getMessage());

        toReturn.setErrorCode(be.getCode());
        toReturn.setErrorType(be.isSenderFault() ? ErrorType.Client : ErrorType.Service);
        toReturn.setServiceName("AmazonSQS");

        return toReturn;

    }

    public static <X extends AmazonWebServiceRequest> X appendUserAgent(X request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
        return request;
    }

}
