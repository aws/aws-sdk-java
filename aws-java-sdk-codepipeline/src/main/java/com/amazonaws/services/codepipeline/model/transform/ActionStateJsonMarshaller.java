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
 * ActionStateMarshaller
 */
public class ActionStateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ActionState actionState, StructuredJsonGenerator jsonGenerator) {

        if (actionState == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (actionState.getActionName() != null) {
                jsonGenerator.writeFieldName("actionName").writeValue(actionState.getActionName());
            }
            if (actionState.getCurrentRevision() != null) {
                jsonGenerator.writeFieldName("currentRevision");
                ActionRevisionJsonMarshaller.getInstance().marshall(actionState.getCurrentRevision(), jsonGenerator);
            }
            if (actionState.getLatestExecution() != null) {
                jsonGenerator.writeFieldName("latestExecution");
                ActionExecutionJsonMarshaller.getInstance().marshall(actionState.getLatestExecution(), jsonGenerator);
            }
            if (actionState.getEntityUrl() != null) {
                jsonGenerator.writeFieldName("entityUrl").writeValue(actionState.getEntityUrl());
            }
            if (actionState.getRevisionUrl() != null) {
                jsonGenerator.writeFieldName("revisionUrl").writeValue(actionState.getRevisionUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionStateJsonMarshaller instance;

    public static ActionStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionStateJsonMarshaller();
        return instance;
    }

}
