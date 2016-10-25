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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AliasMarshaller
 */
public class AliasJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Alias alias, StructuredJsonGenerator jsonGenerator) {

        if (alias == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (alias.getAliasId() != null) {
                jsonGenerator.writeFieldName("AliasId").writeValue(alias.getAliasId());
            }
            if (alias.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(alias.getName());
            }
            if (alias.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(alias.getDescription());
            }
            if (alias.getRoutingStrategy() != null) {
                jsonGenerator.writeFieldName("RoutingStrategy");
                RoutingStrategyJsonMarshaller.getInstance().marshall(alias.getRoutingStrategy(), jsonGenerator);
            }
            if (alias.getCreationTime() != null) {
                jsonGenerator.writeFieldName("CreationTime").writeValue(alias.getCreationTime());
            }
            if (alias.getLastUpdatedTime() != null) {
                jsonGenerator.writeFieldName("LastUpdatedTime").writeValue(alias.getLastUpdatedTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AliasJsonMarshaller instance;

    public static AliasJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AliasJsonMarshaller();
        return instance;
    }

}
