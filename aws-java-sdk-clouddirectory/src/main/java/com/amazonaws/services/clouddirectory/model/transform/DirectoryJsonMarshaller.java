/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.clouddirectory.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DirectoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectoryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Directory directory, StructuredJsonGenerator jsonGenerator) {

        if (directory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directory.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(directory.getName());
            }
            if (directory.getDirectoryArn() != null) {
                jsonGenerator.writeFieldName("DirectoryArn").writeValue(directory.getDirectoryArn());
            }
            if (directory.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(directory.getState());
            }
            if (directory.getCreationDateTime() != null) {
                jsonGenerator.writeFieldName("CreationDateTime").writeValue(directory.getCreationDateTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryJsonMarshaller instance;

    public static DirectoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryJsonMarshaller();
        return instance;
    }

}
