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
package com.amazonaws.services.codepipeline.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * StageDeclarationMarshaller
 */
public class StageDeclarationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StageDeclaration stageDeclaration, StructuredJsonGenerator jsonGenerator) {

        if (stageDeclaration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (stageDeclaration.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(stageDeclaration.getName());
            }

            java.util.List<BlockerDeclaration> blockersList = stageDeclaration.getBlockers();
            if (blockersList != null) {
                jsonGenerator.writeFieldName("blockers");
                jsonGenerator.writeStartArray();
                for (BlockerDeclaration blockersListValue : blockersList) {
                    if (blockersListValue != null) {

                        BlockerDeclarationJsonMarshaller.getInstance().marshall(blockersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<ActionDeclaration> actionsList = stageDeclaration.getActions();
            if (actionsList != null) {
                jsonGenerator.writeFieldName("actions");
                jsonGenerator.writeStartArray();
                for (ActionDeclaration actionsListValue : actionsList) {
                    if (actionsListValue != null) {

                        ActionDeclarationJsonMarshaller.getInstance().marshall(actionsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StageDeclarationJsonMarshaller instance;

    public static StageDeclarationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageDeclarationJsonMarshaller();
        return instance;
    }

}
