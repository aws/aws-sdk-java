/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyDBRecommendationRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBRecommendationRequestMarshaller implements Marshaller<Request<ModifyDBRecommendationRequest>, ModifyDBRecommendationRequest> {

    public Request<ModifyDBRecommendationRequest> marshall(ModifyDBRecommendationRequest modifyDBRecommendationRequest) {

        if (modifyDBRecommendationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBRecommendationRequest> request = new DefaultRequest<ModifyDBRecommendationRequest>(modifyDBRecommendationRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBRecommendation");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBRecommendationRequest.getRecommendationId() != null) {
            request.addParameter("RecommendationId", StringUtils.fromString(modifyDBRecommendationRequest.getRecommendationId()));
        }

        if (modifyDBRecommendationRequest.getLocale() != null) {
            request.addParameter("Locale", StringUtils.fromString(modifyDBRecommendationRequest.getLocale()));
        }

        if (modifyDBRecommendationRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(modifyDBRecommendationRequest.getStatus()));
        }

        if (!modifyDBRecommendationRequest.getRecommendedActionUpdates().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate>) modifyDBRecommendationRequest.getRecommendedActionUpdates())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate> recommendedActionUpdatesList = (com.amazonaws.internal.SdkInternalList<RecommendedActionUpdate>) modifyDBRecommendationRequest
                    .getRecommendedActionUpdates();
            int recommendedActionUpdatesListIndex = 1;

            for (RecommendedActionUpdate recommendedActionUpdatesListValue : recommendedActionUpdatesList) {
                if (recommendedActionUpdatesListValue != null) {

                    if (recommendedActionUpdatesListValue.getActionId() != null) {
                        request.addParameter("RecommendedActionUpdates.member." + recommendedActionUpdatesListIndex + ".ActionId",
                                StringUtils.fromString(recommendedActionUpdatesListValue.getActionId()));
                    }

                    if (recommendedActionUpdatesListValue.getStatus() != null) {
                        request.addParameter("RecommendedActionUpdates.member." + recommendedActionUpdatesListIndex + ".Status",
                                StringUtils.fromString(recommendedActionUpdatesListValue.getStatus()));
                    }
                }
                recommendedActionUpdatesListIndex++;
            }
        }

        return request;
    }

}
