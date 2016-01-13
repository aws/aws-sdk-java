/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.codepipeline.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ActionConfigurationPropertyMarshaller
 */
public class ActionConfigurationPropertyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(
            ActionConfigurationProperty actionConfigurationProperty,
            JSONWriter jsonWriter) {
        if (actionConfigurationProperty == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (actionConfigurationProperty.getName() != null) {
                jsonWriter.key("name").value(
                        actionConfigurationProperty.getName());
            }

            if (actionConfigurationProperty.getRequired() != null) {
                jsonWriter.key("required").value(
                        actionConfigurationProperty.getRequired());
            }

            if (actionConfigurationProperty.getKey() != null) {
                jsonWriter.key("key").value(
                        actionConfigurationProperty.getKey());
            }

            if (actionConfigurationProperty.getSecret() != null) {
                jsonWriter.key("secret").value(
                        actionConfigurationProperty.getSecret());
            }

            if (actionConfigurationProperty.getQueryable() != null) {
                jsonWriter.key("queryable").value(
                        actionConfigurationProperty.getQueryable());
            }

            if (actionConfigurationProperty.getDescription() != null) {
                jsonWriter.key("description").value(
                        actionConfigurationProperty.getDescription());
            }

            if (actionConfigurationProperty.getType() != null) {
                jsonWriter.key("type").value(
                        actionConfigurationProperty.getType());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ActionConfigurationPropertyJsonMarshaller instance;

    public static ActionConfigurationPropertyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionConfigurationPropertyJsonMarshaller();
        return instance;
    }

}
