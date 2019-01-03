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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyTargetGroupAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTargetGroupAttributesRequestMarshaller implements
        Marshaller<Request<ModifyTargetGroupAttributesRequest>, ModifyTargetGroupAttributesRequest> {

    public Request<ModifyTargetGroupAttributesRequest> marshall(ModifyTargetGroupAttributesRequest modifyTargetGroupAttributesRequest) {

        if (modifyTargetGroupAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTargetGroupAttributesRequest> request = new DefaultRequest<ModifyTargetGroupAttributesRequest>(modifyTargetGroupAttributesRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyTargetGroupAttributes");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTargetGroupAttributesRequest.getTargetGroupArn() != null) {
            request.addParameter("TargetGroupArn", StringUtils.fromString(modifyTargetGroupAttributesRequest.getTargetGroupArn()));
        }

        if (modifyTargetGroupAttributesRequest.getAttributes() != null) {
            java.util.List<TargetGroupAttribute> attributesList = modifyTargetGroupAttributesRequest.getAttributes();
            if (attributesList.isEmpty()) {
                request.addParameter("Attributes", "");
            } else {
                int attributesListIndex = 1;

                for (TargetGroupAttribute attributesListValue : attributesList) {

                    if (attributesListValue.getKey() != null) {
                        request.addParameter("Attributes.member." + attributesListIndex + ".Key", StringUtils.fromString(attributesListValue.getKey()));
                    }

                    if (attributesListValue.getValue() != null) {
                        request.addParameter("Attributes.member." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                    }
                    attributesListIndex++;
                }
            }
        }

        return request;
    }

}
