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
import com.amazonaws.util.IdempotentUtils;

/**
 * StartNetworkInsightsAnalysisRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartNetworkInsightsAnalysisRequestMarshaller implements
        Marshaller<Request<StartNetworkInsightsAnalysisRequest>, StartNetworkInsightsAnalysisRequest> {

    public Request<StartNetworkInsightsAnalysisRequest> marshall(StartNetworkInsightsAnalysisRequest startNetworkInsightsAnalysisRequest) {

        if (startNetworkInsightsAnalysisRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartNetworkInsightsAnalysisRequest> request = new DefaultRequest<StartNetworkInsightsAnalysisRequest>(startNetworkInsightsAnalysisRequest,
                "AmazonEC2");
        request.addParameter("Action", "StartNetworkInsightsAnalysis");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (startNetworkInsightsAnalysisRequest.getNetworkInsightsPathId() != null) {
            request.addParameter("NetworkInsightsPathId", StringUtils.fromString(startNetworkInsightsAnalysisRequest.getNetworkInsightsPathId()));
        }

        com.amazonaws.internal.SdkInternalList<String> startNetworkInsightsAnalysisRequestFilterInArnsList = (com.amazonaws.internal.SdkInternalList<String>) startNetworkInsightsAnalysisRequest
                .getFilterInArns();
        if (!startNetworkInsightsAnalysisRequestFilterInArnsList.isEmpty() || !startNetworkInsightsAnalysisRequestFilterInArnsList.isAutoConstruct()) {
            int filterInArnsListIndex = 1;

            for (String startNetworkInsightsAnalysisRequestFilterInArnsListValue : startNetworkInsightsAnalysisRequestFilterInArnsList) {
                if (startNetworkInsightsAnalysisRequestFilterInArnsListValue != null) {
                    request.addParameter("FilterInArn." + filterInArnsListIndex,
                            StringUtils.fromString(startNetworkInsightsAnalysisRequestFilterInArnsListValue));
                }
                filterInArnsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> startNetworkInsightsAnalysisRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) startNetworkInsightsAnalysisRequest
                .getTagSpecifications();
        if (!startNetworkInsightsAnalysisRequestTagSpecificationsList.isEmpty() || !startNetworkInsightsAnalysisRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification startNetworkInsightsAnalysisRequestTagSpecificationsListValue : startNetworkInsightsAnalysisRequestTagSpecificationsList) {

                if (startNetworkInsightsAnalysisRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(startNetworkInsightsAnalysisRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) startNetworkInsightsAnalysisRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        request.addParameter("ClientToken", IdempotentUtils.resolveString(startNetworkInsightsAnalysisRequest.getClientToken()));

        return request;
    }

}
