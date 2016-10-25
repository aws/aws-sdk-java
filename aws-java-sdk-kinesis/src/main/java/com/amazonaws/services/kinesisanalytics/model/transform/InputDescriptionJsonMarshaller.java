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
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InputDescriptionMarshaller
 */
public class InputDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InputDescription inputDescription, StructuredJsonGenerator jsonGenerator) {

        if (inputDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inputDescription.getInputId() != null) {
                jsonGenerator.writeFieldName("InputId").writeValue(inputDescription.getInputId());
            }
            if (inputDescription.getNamePrefix() != null) {
                jsonGenerator.writeFieldName("NamePrefix").writeValue(inputDescription.getNamePrefix());
            }

            java.util.List<String> inAppStreamNamesList = inputDescription.getInAppStreamNames();
            if (inAppStreamNamesList != null) {
                jsonGenerator.writeFieldName("InAppStreamNames");
                jsonGenerator.writeStartArray();
                for (String inAppStreamNamesListValue : inAppStreamNamesList) {
                    if (inAppStreamNamesListValue != null) {
                        jsonGenerator.writeValue(inAppStreamNamesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (inputDescription.getKinesisStreamsInputDescription() != null) {
                jsonGenerator.writeFieldName("KinesisStreamsInputDescription");
                KinesisStreamsInputDescriptionJsonMarshaller.getInstance().marshall(inputDescription.getKinesisStreamsInputDescription(), jsonGenerator);
            }
            if (inputDescription.getKinesisFirehoseInputDescription() != null) {
                jsonGenerator.writeFieldName("KinesisFirehoseInputDescription");
                KinesisFirehoseInputDescriptionJsonMarshaller.getInstance().marshall(inputDescription.getKinesisFirehoseInputDescription(), jsonGenerator);
            }
            if (inputDescription.getInputSchema() != null) {
                jsonGenerator.writeFieldName("InputSchema");
                SourceSchemaJsonMarshaller.getInstance().marshall(inputDescription.getInputSchema(), jsonGenerator);
            }
            if (inputDescription.getInputParallelism() != null) {
                jsonGenerator.writeFieldName("InputParallelism");
                InputParallelismJsonMarshaller.getInstance().marshall(inputDescription.getInputParallelism(), jsonGenerator);
            }
            if (inputDescription.getInputStartingPositionConfiguration() != null) {
                jsonGenerator.writeFieldName("InputStartingPositionConfiguration");
                InputStartingPositionConfigurationJsonMarshaller.getInstance()
                        .marshall(inputDescription.getInputStartingPositionConfiguration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InputDescriptionJsonMarshaller instance;

    public static InputDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputDescriptionJsonMarshaller();
        return instance;
    }

}
