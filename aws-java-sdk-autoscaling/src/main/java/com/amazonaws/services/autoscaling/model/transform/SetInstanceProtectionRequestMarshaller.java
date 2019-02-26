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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SetInstanceProtectionRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetInstanceProtectionRequestMarshaller implements Marshaller<Request<SetInstanceProtectionRequest>, SetInstanceProtectionRequest> {

    public Request<SetInstanceProtectionRequest> marshall(SetInstanceProtectionRequest setInstanceProtectionRequest) {

        if (setInstanceProtectionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetInstanceProtectionRequest> request = new DefaultRequest<SetInstanceProtectionRequest>(setInstanceProtectionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "SetInstanceProtection");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!setInstanceProtectionRequest.getInstanceIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) setInstanceProtectionRequest.getInstanceIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> instanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) setInstanceProtectionRequest
                    .getInstanceIds();
            int instanceIdsListIndex = 1;

            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceIds.member." + instanceIdsListIndex, StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (setInstanceProtectionRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(setInstanceProtectionRequest.getAutoScalingGroupName()));
        }

        if (setInstanceProtectionRequest.getProtectedFromScaleIn() != null) {
            request.addParameter("ProtectedFromScaleIn", StringUtils.fromBoolean(setInstanceProtectionRequest.getProtectedFromScaleIn()));
        }

        return request;
    }

}
