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
 * ApplicationUpdateMarshaller
 */
public class ApplicationUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ApplicationUpdate applicationUpdate, StructuredJsonGenerator jsonGenerator) {

        if (applicationUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            java.util.List<InputUpdate> inputUpdatesList = applicationUpdate.getInputUpdates();
            if (inputUpdatesList != null) {
                jsonGenerator.writeFieldName("InputUpdates");
                jsonGenerator.writeStartArray();
                for (InputUpdate inputUpdatesListValue : inputUpdatesList) {
                    if (inputUpdatesListValue != null) {

                        InputUpdateJsonMarshaller.getInstance().marshall(inputUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (applicationUpdate.getApplicationCodeUpdate() != null) {
                jsonGenerator.writeFieldName("ApplicationCodeUpdate").writeValue(applicationUpdate.getApplicationCodeUpdate());
            }

            java.util.List<OutputUpdate> outputUpdatesList = applicationUpdate.getOutputUpdates();
            if (outputUpdatesList != null) {
                jsonGenerator.writeFieldName("OutputUpdates");
                jsonGenerator.writeStartArray();
                for (OutputUpdate outputUpdatesListValue : outputUpdatesList) {
                    if (outputUpdatesListValue != null) {

                        OutputUpdateJsonMarshaller.getInstance().marshall(outputUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<ReferenceDataSourceUpdate> referenceDataSourceUpdatesList = applicationUpdate.getReferenceDataSourceUpdates();
            if (referenceDataSourceUpdatesList != null) {
                jsonGenerator.writeFieldName("ReferenceDataSourceUpdates");
                jsonGenerator.writeStartArray();
                for (ReferenceDataSourceUpdate referenceDataSourceUpdatesListValue : referenceDataSourceUpdatesList) {
                    if (referenceDataSourceUpdatesListValue != null) {

                        ReferenceDataSourceUpdateJsonMarshaller.getInstance().marshall(referenceDataSourceUpdatesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ApplicationUpdateJsonMarshaller instance;

    public static ApplicationUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationUpdateJsonMarshaller();
        return instance;
    }

}
