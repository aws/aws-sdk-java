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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * SourceMarshaller
 */
public class SourceJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Source source, StructuredJsonGenerator jsonGenerator) {

        if (source == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (source.getType() != null) {
                jsonGenerator.writeFieldName("Type").writeValue(source.getType());
            }
            if (source.getUrl() != null) {
                jsonGenerator.writeFieldName("Url").writeValue(source.getUrl());
            }
            if (source.getUsername() != null) {
                jsonGenerator.writeFieldName("Username").writeValue(source.getUsername());
            }
            if (source.getPassword() != null) {
                jsonGenerator.writeFieldName("Password").writeValue(source.getPassword());
            }
            if (source.getSshKey() != null) {
                jsonGenerator.writeFieldName("SshKey").writeValue(source.getSshKey());
            }
            if (source.getRevision() != null) {
                jsonGenerator.writeFieldName("Revision").writeValue(source.getRevision());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SourceJsonMarshaller instance;

    public static SourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceJsonMarshaller();
        return instance;
    }

}
