/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateInstanceEventWindowRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceEventWindowRequestMarshaller implements Marshaller<Request<CreateInstanceEventWindowRequest>, CreateInstanceEventWindowRequest> {

    public Request<CreateInstanceEventWindowRequest> marshall(CreateInstanceEventWindowRequest createInstanceEventWindowRequest) {

        if (createInstanceEventWindowRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateInstanceEventWindowRequest> request = new DefaultRequest<CreateInstanceEventWindowRequest>(createInstanceEventWindowRequest, "AmazonEC2");
        request.addParameter("Action", "CreateInstanceEventWindow");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createInstanceEventWindowRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createInstanceEventWindowRequest.getName()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest> createInstanceEventWindowRequestTimeRangesList = (com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRangeRequest>) createInstanceEventWindowRequest
                .getTimeRanges();
        if (!createInstanceEventWindowRequestTimeRangesList.isEmpty() || !createInstanceEventWindowRequestTimeRangesList.isAutoConstruct()) {
            int timeRangesListIndex = 1;

            for (InstanceEventWindowTimeRangeRequest createInstanceEventWindowRequestTimeRangesListValue : createInstanceEventWindowRequestTimeRangesList) {

                if (createInstanceEventWindowRequestTimeRangesListValue.getStartWeekDay() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".StartWeekDay",
                            StringUtils.fromString(createInstanceEventWindowRequestTimeRangesListValue.getStartWeekDay()));
                }

                if (createInstanceEventWindowRequestTimeRangesListValue.getStartHour() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".StartHour",
                            StringUtils.fromInteger(createInstanceEventWindowRequestTimeRangesListValue.getStartHour()));
                }

                if (createInstanceEventWindowRequestTimeRangesListValue.getEndWeekDay() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".EndWeekDay",
                            StringUtils.fromString(createInstanceEventWindowRequestTimeRangesListValue.getEndWeekDay()));
                }

                if (createInstanceEventWindowRequestTimeRangesListValue.getEndHour() != null) {
                    request.addParameter("TimeRange." + timeRangesListIndex + ".EndHour",
                            StringUtils.fromInteger(createInstanceEventWindowRequestTimeRangesListValue.getEndHour()));
                }
                timeRangesListIndex++;
            }
        }

        if (createInstanceEventWindowRequest.getCronExpression() != null) {
            request.addParameter("CronExpression", StringUtils.fromString(createInstanceEventWindowRequest.getCronExpression()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createInstanceEventWindowRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createInstanceEventWindowRequest
                .getTagSpecifications();
        if (!createInstanceEventWindowRequestTagSpecificationsList.isEmpty() || !createInstanceEventWindowRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createInstanceEventWindowRequestTagSpecificationsListValue : createInstanceEventWindowRequestTagSpecificationsList) {

                if (createInstanceEventWindowRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createInstanceEventWindowRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createInstanceEventWindowRequestTagSpecificationsListValue
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

        return request;
    }

}
