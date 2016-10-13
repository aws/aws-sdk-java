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

import com.amazonaws.AmazonClientException;
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
 * CreateGameSessionRequest Marshaller
 */
public class CreateGameSessionRequestMarshaller implements Marshaller<Request<CreateGameSessionRequest>, CreateGameSessionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateGameSessionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateGameSessionRequest> marshall(CreateGameSessionRequest createGameSessionRequest) {

        if (createGameSessionRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateGameSessionRequest> request = new DefaultRequest<CreateGameSessionRequest>(createGameSessionRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.CreateGameSession");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createGameSessionRequest.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(createGameSessionRequest.getFleetId());
            }
            if (createGameSessionRequest.getAliasId() != null) {
                jsonGenerator.writeFieldName("AliasId").writeValue(createGameSessionRequest.getAliasId());
            }
            if (createGameSessionRequest.getMaximumPlayerSessionCount() != null) {
                jsonGenerator.writeFieldName("MaximumPlayerSessionCount").writeValue(createGameSessionRequest.getMaximumPlayerSessionCount());
            }
            if (createGameSessionRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(createGameSessionRequest.getName());
            }

            java.util.List<GameProperty> gamePropertiesList = createGameSessionRequest.getGameProperties();
            if (gamePropertiesList != null) {
                jsonGenerator.writeFieldName("GameProperties");
                jsonGenerator.writeStartArray();
                for (GameProperty gamePropertiesListValue : gamePropertiesList) {
                    if (gamePropertiesListValue != null) {

                        GamePropertyJsonMarshaller.getInstance().marshall(gamePropertiesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createGameSessionRequest.getCreatorId() != null) {
                jsonGenerator.writeFieldName("CreatorId").writeValue(createGameSessionRequest.getCreatorId());
            }
            if (createGameSessionRequest.getGameSessionId() != null) {
                jsonGenerator.writeFieldName("GameSessionId").writeValue(createGameSessionRequest.getGameSessionId());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
