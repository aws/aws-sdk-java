/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Set Identity Notification Topic Request Marshaller
 */
public class SetIdentityNotificationTopicRequestMarshaller implements Marshaller<Request<SetIdentityNotificationTopicRequest>, SetIdentityNotificationTopicRequest> {

    public Request<SetIdentityNotificationTopicRequest> marshall(SetIdentityNotificationTopicRequest setIdentityNotificationTopicRequest) {

        if (setIdentityNotificationTopicRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<SetIdentityNotificationTopicRequest> request = new DefaultRequest<SetIdentityNotificationTopicRequest>(setIdentityNotificationTopicRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetIdentityNotificationTopic");
        request.addParameter("Version", "2010-12-01");

        if (setIdentityNotificationTopicRequest.getIdentity() != null) {
            request.addParameter("Identity", StringUtils.fromString(setIdentityNotificationTopicRequest.getIdentity()));
        }
        if (setIdentityNotificationTopicRequest.getNotificationType() != null) {
            request.addParameter("NotificationType", StringUtils.fromString(setIdentityNotificationTopicRequest.getNotificationType()));
        }
        if (setIdentityNotificationTopicRequest.getSnsTopic() != null) {
            request.addParameter("SnsTopic", StringUtils.fromString(setIdentityNotificationTopicRequest.getSnsTopic()));
        }


        return request;
    }
}
