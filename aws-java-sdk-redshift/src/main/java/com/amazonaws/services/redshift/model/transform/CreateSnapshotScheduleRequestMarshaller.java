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
 * CreateSnapshotScheduleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotScheduleRequestMarshaller implements Marshaller<Request<CreateSnapshotScheduleRequest>, CreateSnapshotScheduleRequest> {

    public Request<CreateSnapshotScheduleRequest> marshall(CreateSnapshotScheduleRequest createSnapshotScheduleRequest) {

        if (createSnapshotScheduleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateSnapshotScheduleRequest> request = new DefaultRequest<CreateSnapshotScheduleRequest>(createSnapshotScheduleRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateSnapshotSchedule");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!createSnapshotScheduleRequest.getScheduleDefinitions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) createSnapshotScheduleRequest.getScheduleDefinitions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> scheduleDefinitionsList = (com.amazonaws.internal.SdkInternalList<String>) createSnapshotScheduleRequest
                    .getScheduleDefinitions();
            int scheduleDefinitionsListIndex = 1;

            for (String scheduleDefinitionsListValue : scheduleDefinitionsList) {
                if (scheduleDefinitionsListValue != null) {
                    request.addParameter("ScheduleDefinitions.ScheduleDefinition." + scheduleDefinitionsListIndex,
                            StringUtils.fromString(scheduleDefinitionsListValue));
                }
                scheduleDefinitionsListIndex++;
            }
        }

        if (createSnapshotScheduleRequest.getScheduleIdentifier() != null) {
            request.addParameter("ScheduleIdentifier", StringUtils.fromString(createSnapshotScheduleRequest.getScheduleIdentifier()));
        }

        if (createSnapshotScheduleRequest.getScheduleDescription() != null) {
            request.addParameter("ScheduleDescription", StringUtils.fromString(createSnapshotScheduleRequest.getScheduleDescription()));
        }

        if (!createSnapshotScheduleRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createSnapshotScheduleRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createSnapshotScheduleRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (createSnapshotScheduleRequest.getDryRun() != null) {
            request.addParameter("DryRun", StringUtils.fromBoolean(createSnapshotScheduleRequest.getDryRun()));
        }

        if (createSnapshotScheduleRequest.getNextInvocations() != null) {
            request.addParameter("NextInvocations", StringUtils.fromInteger(createSnapshotScheduleRequest.getNextInvocations()));
        }

        return request;
    }

}
