/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RegisterInstanceEventNotificationAttributesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterInstanceEventNotificationAttributesRequestMarshaller implements
        Marshaller<Request<RegisterInstanceEventNotificationAttributesRequest>, RegisterInstanceEventNotificationAttributesRequest> {

    public Request<RegisterInstanceEventNotificationAttributesRequest> marshall(
            RegisterInstanceEventNotificationAttributesRequest registerInstanceEventNotificationAttributesRequest) {

        if (registerInstanceEventNotificationAttributesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterInstanceEventNotificationAttributesRequest> request = new DefaultRequest<RegisterInstanceEventNotificationAttributesRequest>(
                registerInstanceEventNotificationAttributesRequest, "AmazonEC2");
        request.addParameter("Action", "RegisterInstanceEventNotificationAttributes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        RegisterInstanceTagAttributeRequest instanceTagAttribute = registerInstanceEventNotificationAttributesRequest.getInstanceTagAttribute();
        if (instanceTagAttribute != null) {

            if (instanceTagAttribute.getIncludeAllTagsOfInstance() != null) {
                request.addParameter("InstanceTagAttribute.IncludeAllTagsOfInstance",
                        StringUtils.fromBoolean(instanceTagAttribute.getIncludeAllTagsOfInstance()));
            }

            com.amazonaws.internal.SdkInternalList<String> registerInstanceTagAttributeRequestInstanceTagKeysList = (com.amazonaws.internal.SdkInternalList<String>) instanceTagAttribute
                    .getInstanceTagKeys();
            if (!registerInstanceTagAttributeRequestInstanceTagKeysList.isEmpty() || !registerInstanceTagAttributeRequestInstanceTagKeysList.isAutoConstruct()) {
                int instanceTagKeysListIndex = 1;

                for (String registerInstanceTagAttributeRequestInstanceTagKeysListValue : registerInstanceTagAttributeRequestInstanceTagKeysList) {
                    if (registerInstanceTagAttributeRequestInstanceTagKeysListValue != null) {
                        request.addParameter("InstanceTagAttribute.InstanceTagKey." + instanceTagKeysListIndex,
                                StringUtils.fromString(registerInstanceTagAttributeRequestInstanceTagKeysListValue));
                    }
                    instanceTagKeysListIndex++;
                }
            }
        }

        return request;
    }

}
