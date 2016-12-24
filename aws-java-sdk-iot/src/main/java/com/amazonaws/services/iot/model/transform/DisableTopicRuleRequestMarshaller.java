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
package com.amazonaws.services.iot.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DisableTopicRuleRequest Marshaller
 */
public class DisableTopicRuleRequestMarshaller implements Marshaller<Request<DisableTopicRuleRequest>, DisableTopicRuleRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DisableTopicRuleRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DisableTopicRuleRequest> marshall(DisableTopicRuleRequest disableTopicRuleRequest) {

        if (disableTopicRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableTopicRuleRequest> request = new DefaultRequest<DisableTopicRuleRequest>(disableTopicRuleRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/rules/{ruleName}/disable";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "ruleName", disableTopicRuleRequest.getRuleName());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
