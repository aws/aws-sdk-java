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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Event Subscription Request Marshaller
 */
public class ModifyEventSubscriptionRequestMarshaller implements Marshaller<Request<ModifyEventSubscriptionRequest>, ModifyEventSubscriptionRequest> {

    public Request<ModifyEventSubscriptionRequest> marshall(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {

        if (modifyEventSubscriptionRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyEventSubscriptionRequest> request = new DefaultRequest<ModifyEventSubscriptionRequest>(modifyEventSubscriptionRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyEventSubscription");
        request.addParameter("Version", "2012-12-01");

        if (modifyEventSubscriptionRequest.getSubscriptionName() != null) {
            request.addParameter("SubscriptionName", StringUtils.fromString(modifyEventSubscriptionRequest.getSubscriptionName()));
        }
        if (modifyEventSubscriptionRequest.getSnsTopicArn() != null) {
            request.addParameter("SnsTopicArn", StringUtils.fromString(modifyEventSubscriptionRequest.getSnsTopicArn()));
        }
        if (modifyEventSubscriptionRequest.getSourceType() != null) {
            request.addParameter("SourceType", StringUtils.fromString(modifyEventSubscriptionRequest.getSourceType()));
        }

        java.util.List<String> sourceIdsList = modifyEventSubscriptionRequest.getSourceIds();
        int sourceIdsListIndex = 1;

        for (String sourceIdsListValue : sourceIdsList) {
            if (sourceIdsListValue != null) {
                request.addParameter("SourceIds.SourceId." + sourceIdsListIndex, StringUtils.fromString(sourceIdsListValue));
            }

            sourceIdsListIndex++;
        }

        java.util.List<String> eventCategoriesList = modifyEventSubscriptionRequest.getEventCategories();
        int eventCategoriesListIndex = 1;

        for (String eventCategoriesListValue : eventCategoriesList) {
            if (eventCategoriesListValue != null) {
                request.addParameter("EventCategories.EventCategory." + eventCategoriesListIndex, StringUtils.fromString(eventCategoriesListValue));
            }

            eventCategoriesListIndex++;
        }
        if (modifyEventSubscriptionRequest.getSeverity() != null) {
            request.addParameter("Severity", StringUtils.fromString(modifyEventSubscriptionRequest.getSeverity()));
        }
        if (modifyEventSubscriptionRequest.isEnabled() != null) {
            request.addParameter("Enabled", StringUtils.fromBoolean(modifyEventSubscriptionRequest.isEnabled()));
        }


        return request;
    }
}
