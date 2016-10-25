/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateFleetRequest Marshaller
 */
public class CreateFleetRequestMarshaller implements Marshaller<Request<CreateFleetRequest>, CreateFleetRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateFleetRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateFleetRequest> marshall(CreateFleetRequest createFleetRequest) {

        if (createFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateFleetRequest> request = new DefaultRequest<CreateFleetRequest>(createFleetRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.CreateFleet");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createFleetRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createFleetRequest.getName());
            }
            if (createFleetRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(createFleetRequest.getDescription());
            }
            if (createFleetRequest.getBuildId() != null) {
                jsonGenerator.writeFieldName("BuildId").writeValue(createFleetRequest.getBuildId());
            }
            if (createFleetRequest.getServerLaunchPath() != null) {
                jsonGenerator.writeFieldName("ServerLaunchPath").writeValue(createFleetRequest.getServerLaunchPath());
            }
            if (createFleetRequest.getServerLaunchParameters() != null) {
                jsonGenerator.writeFieldName("ServerLaunchParameters").writeValue(createFleetRequest.getServerLaunchParameters());
            }

            java.util.List<String> logPathsList = createFleetRequest.getLogPaths();
            if (logPathsList != null) {
                jsonGenerator.writeFieldName("LogPaths");
                jsonGenerator.writeStartArray();
                for (String logPathsListValue : logPathsList) {
                    if (logPathsListValue != null) {
                        jsonGenerator.writeValue(logPathsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createFleetRequest.getEC2InstanceType() != null) {
                jsonGenerator.writeFieldName("EC2InstanceType").writeValue(createFleetRequest.getEC2InstanceType());
            }

            java.util.List<IpPermission> eC2InboundPermissionsList = createFleetRequest.getEC2InboundPermissions();
            if (eC2InboundPermissionsList != null) {
                jsonGenerator.writeFieldName("EC2InboundPermissions");
                jsonGenerator.writeStartArray();
                for (IpPermission eC2InboundPermissionsListValue : eC2InboundPermissionsList) {
                    if (eC2InboundPermissionsListValue != null) {

                        IpPermissionJsonMarshaller.getInstance().marshall(eC2InboundPermissionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createFleetRequest.getNewGameSessionProtectionPolicy() != null) {
                jsonGenerator.writeFieldName("NewGameSessionProtectionPolicy").writeValue(createFleetRequest.getNewGameSessionProtectionPolicy());
            }
            if (createFleetRequest.getRuntimeConfiguration() != null) {
                jsonGenerator.writeFieldName("RuntimeConfiguration");
                RuntimeConfigurationJsonMarshaller.getInstance().marshall(createFleetRequest.getRuntimeConfiguration(), jsonGenerator);
            }
            if (createFleetRequest.getResourceCreationLimitPolicy() != null) {
                jsonGenerator.writeFieldName("ResourceCreationLimitPolicy");
                ResourceCreationLimitPolicyJsonMarshaller.getInstance().marshall(createFleetRequest.getResourceCreationLimitPolicy(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
