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
package com.amazonaws.services.codebuild.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EnvironmentLanguageMarshaller
 */
public class EnvironmentLanguageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EnvironmentLanguage environmentLanguage, StructuredJsonGenerator jsonGenerator) {

        if (environmentLanguage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (environmentLanguage.getLanguage() != null) {
                jsonGenerator.writeFieldName("language").writeValue(environmentLanguage.getLanguage());
            }

            java.util.List<EnvironmentImage> imagesList = environmentLanguage.getImages();
            if (imagesList != null) {
                jsonGenerator.writeFieldName("images");
                jsonGenerator.writeStartArray();
                for (EnvironmentImage imagesListValue : imagesList) {
                    if (imagesListValue != null) {

                        EnvironmentImageJsonMarshaller.getInstance().marshall(imagesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EnvironmentLanguageJsonMarshaller instance;

    public static EnvironmentLanguageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentLanguageJsonMarshaller();
        return instance;
    }

}
