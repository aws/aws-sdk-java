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
 * ModifySnapshotScheduleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotScheduleRequestMarshaller implements Marshaller<Request<ModifySnapshotScheduleRequest>, ModifySnapshotScheduleRequest> {

    public Request<ModifySnapshotScheduleRequest> marshall(ModifySnapshotScheduleRequest modifySnapshotScheduleRequest) {

        if (modifySnapshotScheduleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifySnapshotScheduleRequest> request = new DefaultRequest<ModifySnapshotScheduleRequest>(modifySnapshotScheduleRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifySnapshotSchedule");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifySnapshotScheduleRequest.getScheduleIdentifier() != null) {
            request.addParameter("ScheduleIdentifier", StringUtils.fromString(modifySnapshotScheduleRequest.getScheduleIdentifier()));
        }

        if (!modifySnapshotScheduleRequest.getScheduleDefinitions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifySnapshotScheduleRequest.getScheduleDefinitions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> scheduleDefinitionsList = (com.amazonaws.internal.SdkInternalList<String>) modifySnapshotScheduleRequest
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

        return request;
    }

}
