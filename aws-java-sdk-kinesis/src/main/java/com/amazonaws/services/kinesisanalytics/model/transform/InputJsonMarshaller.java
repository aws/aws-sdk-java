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
 * InputMarshaller
 */
public class InputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Input input, StructuredJsonGenerator jsonGenerator) {

        if (input == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (input.getNamePrefix() != null) {
                jsonGenerator.writeFieldName("NamePrefix").writeValue(input.getNamePrefix());
            }
            if (input.getKinesisStreamsInput() != null) {
                jsonGenerator.writeFieldName("KinesisStreamsInput");
                KinesisStreamsInputJsonMarshaller.getInstance().marshall(input.getKinesisStreamsInput(), jsonGenerator);
            }
            if (input.getKinesisFirehoseInput() != null) {
                jsonGenerator.writeFieldName("KinesisFirehoseInput");
                KinesisFirehoseInputJsonMarshaller.getInstance().marshall(input.getKinesisFirehoseInput(), jsonGenerator);
            }
            if (input.getInputParallelism() != null) {
                jsonGenerator.writeFieldName("InputParallelism");
                InputParallelismJsonMarshaller.getInstance().marshall(input.getInputParallelism(), jsonGenerator);
            }
            if (input.getInputSchema() != null) {
                jsonGenerator.writeFieldName("InputSchema");
                SourceSchemaJsonMarshaller.getInstance().marshall(input.getInputSchema(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InputJsonMarshaller instance;

    public static InputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonMarshaller();
        return instance;
    }

}
