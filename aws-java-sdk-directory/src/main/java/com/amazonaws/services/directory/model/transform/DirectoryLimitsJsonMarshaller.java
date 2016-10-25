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
package com.amazonaws.services.directory.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DirectoryLimitsMarshaller
 */
public class DirectoryLimitsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DirectoryLimits directoryLimits, StructuredJsonGenerator jsonGenerator) {

        if (directoryLimits == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (directoryLimits.getCloudOnlyDirectoriesLimit() != null) {
                jsonGenerator.writeFieldName("CloudOnlyDirectoriesLimit").writeValue(directoryLimits.getCloudOnlyDirectoriesLimit());
            }
            if (directoryLimits.getCloudOnlyDirectoriesCurrentCount() != null) {
                jsonGenerator.writeFieldName("CloudOnlyDirectoriesCurrentCount").writeValue(directoryLimits.getCloudOnlyDirectoriesCurrentCount());
            }
            if (directoryLimits.getCloudOnlyDirectoriesLimitReached() != null) {
                jsonGenerator.writeFieldName("CloudOnlyDirectoriesLimitReached").writeValue(directoryLimits.getCloudOnlyDirectoriesLimitReached());
            }
            if (directoryLimits.getCloudOnlyMicrosoftADLimit() != null) {
                jsonGenerator.writeFieldName("CloudOnlyMicrosoftADLimit").writeValue(directoryLimits.getCloudOnlyMicrosoftADLimit());
            }
            if (directoryLimits.getCloudOnlyMicrosoftADCurrentCount() != null) {
                jsonGenerator.writeFieldName("CloudOnlyMicrosoftADCurrentCount").writeValue(directoryLimits.getCloudOnlyMicrosoftADCurrentCount());
            }
            if (directoryLimits.getCloudOnlyMicrosoftADLimitReached() != null) {
                jsonGenerator.writeFieldName("CloudOnlyMicrosoftADLimitReached").writeValue(directoryLimits.getCloudOnlyMicrosoftADLimitReached());
            }
            if (directoryLimits.getConnectedDirectoriesLimit() != null) {
                jsonGenerator.writeFieldName("ConnectedDirectoriesLimit").writeValue(directoryLimits.getConnectedDirectoriesLimit());
            }
            if (directoryLimits.getConnectedDirectoriesCurrentCount() != null) {
                jsonGenerator.writeFieldName("ConnectedDirectoriesCurrentCount").writeValue(directoryLimits.getConnectedDirectoriesCurrentCount());
            }
            if (directoryLimits.getConnectedDirectoriesLimitReached() != null) {
                jsonGenerator.writeFieldName("ConnectedDirectoriesLimitReached").writeValue(directoryLimits.getConnectedDirectoriesLimitReached());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryLimitsJsonMarshaller instance;

    public static DirectoryLimitsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryLimitsJsonMarshaller();
        return instance;
    }

}
