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
 * InputUpdateMarshaller
 */
public class InputUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InputUpdate inputUpdate, StructuredJsonGenerator jsonGenerator) {

        if (inputUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (inputUpdate.getInputId() != null) {
                jsonGenerator.writeFieldName("InputId").writeValue(inputUpdate.getInputId());
            }
            if (inputUpdate.getNamePrefixUpdate() != null) {
                jsonGenerator.writeFieldName("NamePrefixUpdate").writeValue(inputUpdate.getNamePrefixUpdate());
            }
            if (inputUpdate.getKinesisStreamsInputUpdate() != null) {
                jsonGenerator.writeFieldName("KinesisStreamsInputUpdate");
                KinesisStreamsInputUpdateJsonMarshaller.getInstance().marshall(inputUpdate.getKinesisStreamsInputUpdate(), jsonGenerator);
            }
            if (inputUpdate.getKinesisFirehoseInputUpdate() != null) {
                jsonGenerator.writeFieldName("KinesisFirehoseInputUpdate");
                KinesisFirehoseInputUpdateJsonMarshaller.getInstance().marshall(inputUpdate.getKinesisFirehoseInputUpdate(), jsonGenerator);
            }
            if (inputUpdate.getInputSchemaUpdate() != null) {
                jsonGenerator.writeFieldName("InputSchemaUpdate");
                InputSchemaUpdateJsonMarshaller.getInstance().marshall(inputUpdate.getInputSchemaUpdate(), jsonGenerator);
            }
            if (inputUpdate.getInputParallelismUpdate() != null) {
                jsonGenerator.writeFieldName("InputParallelismUpdate");
                InputParallelismUpdateJsonMarshaller.getInstance().marshall(inputUpdate.getInputParallelismUpdate(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InputUpdateJsonMarshaller instance;

    public static InputUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputUpdateJsonMarshaller();
        return instance;
    }

}
