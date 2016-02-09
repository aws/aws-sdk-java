/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.gamelift.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateFleetRequest Marshaller
 */
public class CreateFleetRequestMarshaller implements
        Marshaller<Request<CreateFleetRequest>, CreateFleetRequest> {

    public Request<CreateFleetRequest> marshall(
            CreateFleetRequest createFleetRequest) {

        if (createFleetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateFleetRequest> request = new DefaultRequest<CreateFleetRequest>(
                createFleetRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.CreateFleet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createFleetRequest.getName() != null) {
                jsonWriter.key("Name").value(createFleetRequest.getName());
            }

            if (createFleetRequest.getDescription() != null) {
                jsonWriter.key("Description").value(
                        createFleetRequest.getDescription());
            }

            if (createFleetRequest.getBuildId() != null) {
                jsonWriter.key("BuildId")
                        .value(createFleetRequest.getBuildId());
            }

            if (createFleetRequest.getServerLaunchPath() != null) {
                jsonWriter.key("ServerLaunchPath").value(
                        createFleetRequest.getServerLaunchPath());
            }

            if (createFleetRequest.getServerLaunchParameters() != null) {
                jsonWriter.key("ServerLaunchParameters").value(
                        createFleetRequest.getServerLaunchParameters());
            }

            java.util.List<String> logPathsList = createFleetRequest
                    .getLogPaths();
            if (logPathsList != null) {
                jsonWriter.key("LogPaths");
                jsonWriter.array();
                for (String logPathsListValue : logPathsList) {
                    if (logPathsListValue != null) {
                        jsonWriter.value(logPathsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (createFleetRequest.getEC2InstanceType() != null) {
                jsonWriter.key("EC2InstanceType").value(
                        createFleetRequest.getEC2InstanceType());
            }

            java.util.List<IpPermission> eC2InboundPermissionsList = createFleetRequest
                    .getEC2InboundPermissions();
            if (eC2InboundPermissionsList != null) {
                jsonWriter.key("EC2InboundPermissions");
                jsonWriter.array();
                for (IpPermission eC2InboundPermissionsListValue : eC2InboundPermissionsList) {
                    if (eC2InboundPermissionsListValue != null) {

                        IpPermissionJsonMarshaller.getInstance().marshall(
                                eC2InboundPermissionsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
