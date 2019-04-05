/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SetSMSAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSMSAttributesRequestMarshaller implements Marshaller<Request<SetSMSAttributesRequest>, SetSMSAttributesRequest> {

    public Request<SetSMSAttributesRequest> marshall(SetSMSAttributesRequest setSMSAttributesRequest) {

        if (setSMSAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetSMSAttributesRequest> request = new DefaultRequest<SetSMSAttributesRequest>(setSMSAttributesRequest, "AmazonSNS");
        request.addParameter("Action", "SetSMSAttributes");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        java.util.Map<String, String> attributes = setSMSAttributesRequest.getAttributes();
        int attributesListIndex = 1;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("attributes.entry." + attributesListIndex + ".key", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {
                request.addParameter("attributes.entry." + attributesListIndex + ".value", StringUtils.fromString(entry.getValue()));
            }
            attributesListIndex++;
        }

        return request;
    }

}
