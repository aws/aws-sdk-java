/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetReceiptRulePositionRequest Marshaller
 */

public class SetReceiptRulePositionRequestMarshaller implements Marshaller<Request<SetReceiptRulePositionRequest>, SetReceiptRulePositionRequest> {

    public Request<SetReceiptRulePositionRequest> marshall(SetReceiptRulePositionRequest setReceiptRulePositionRequest) {

        if (setReceiptRulePositionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetReceiptRulePositionRequest> request = new DefaultRequest<SetReceiptRulePositionRequest>(setReceiptRulePositionRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "SetReceiptRulePosition");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setReceiptRulePositionRequest.getRuleSetName() != null) {
            request.addParameter("RuleSetName", StringUtils.fromString(setReceiptRulePositionRequest.getRuleSetName()));
        }

        if (setReceiptRulePositionRequest.getRuleName() != null) {
            request.addParameter("RuleName", StringUtils.fromString(setReceiptRulePositionRequest.getRuleName()));
        }

        if (setReceiptRulePositionRequest.getAfter() != null) {
            request.addParameter("After", StringUtils.fromString(setReceiptRulePositionRequest.getAfter()));
        }

        return request;
    }

}
