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
 * ModifyDBSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBSnapshotRequestMarshaller implements Marshaller<Request<ModifyDBSnapshotRequest>, ModifyDBSnapshotRequest> {

    public Request<ModifyDBSnapshotRequest> marshall(ModifyDBSnapshotRequest modifyDBSnapshotRequest) {

        if (modifyDBSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBSnapshotRequest> request = new DefaultRequest<ModifyDBSnapshotRequest>(modifyDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBSnapshot");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(modifyDBSnapshotRequest.getDBSnapshotIdentifier()));
        }

        if (modifyDBSnapshotRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils.fromString(modifyDBSnapshotRequest.getEngineVersion()));
        }

        if (modifyDBSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(modifyDBSnapshotRequest.getOptionGroupName()));
        }

        return request;
    }

}
