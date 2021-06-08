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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateUsageLimitRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUsageLimitRequestMarshaller implements Marshaller<Request<CreateUsageLimitRequest>, CreateUsageLimitRequest> {

    public Request<CreateUsageLimitRequest> marshall(CreateUsageLimitRequest createUsageLimitRequest) {

        if (createUsageLimitRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateUsageLimitRequest> request = new DefaultRequest<CreateUsageLimitRequest>(createUsageLimitRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateUsageLimit");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createUsageLimitRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(createUsageLimitRequest.getClusterIdentifier()));
        }

        if (createUsageLimitRequest.getFeatureType() != null) {
            request.addParameter("FeatureType", StringUtils.fromString(createUsageLimitRequest.getFeatureType()));
        }

        if (createUsageLimitRequest.getLimitType() != null) {
            request.addParameter("LimitType", StringUtils.fromString(createUsageLimitRequest.getLimitType()));
        }

        if (createUsageLimitRequest.getAmount() != null) {
            request.addParameter("Amount", StringUtils.fromLong(createUsageLimitRequest.getAmount()));
        }

        if (createUsageLimitRequest.getPeriod() != null) {
            request.addParameter("Period", StringUtils.fromString(createUsageLimitRequest.getPeriod()));
        }

        if (createUsageLimitRequest.getBreachAction() != null) {
            request.addParameter("BreachAction", StringUtils.fromString(createUsageLimitRequest.getBreachAction()));
        }

        if (!createUsageLimitRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createUsageLimitRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createUsageLimitRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
