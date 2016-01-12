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

package com.amazonaws.services.elasticmapreduce.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * HadoopStepConfigMarshaller
 */
public class HadoopStepConfigJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(HadoopStepConfig hadoopStepConfig,
            JSONWriter jsonWriter) {
        if (hadoopStepConfig == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (hadoopStepConfig.getJar() != null) {
                jsonWriter.key("Jar").value(hadoopStepConfig.getJar());
            }

            com.amazonaws.internal.SdkInternalMap<String, String> propertiesMap = (com.amazonaws.internal.SdkInternalMap<String, String>) hadoopStepConfig
                    .getProperties();
            if (!propertiesMap.isEmpty() || !propertiesMap.isAutoConstruct()) {
                jsonWriter.key("Properties");
                jsonWriter.object();

                for (Map.Entry<String, String> propertiesMapValue : propertiesMap
                        .entrySet()) {
                    if (propertiesMapValue.getValue() != null) {
                        jsonWriter.key(propertiesMapValue.getKey());

                        jsonWriter.value(propertiesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (hadoopStepConfig.getMainClass() != null) {
                jsonWriter.key("MainClass").value(
                        hadoopStepConfig.getMainClass());
            }

            com.amazonaws.internal.SdkInternalList<String> argsList = (com.amazonaws.internal.SdkInternalList<String>) hadoopStepConfig
                    .getArgs();
            if (!argsList.isEmpty() || !argsList.isAutoConstruct()) {
                jsonWriter.key("Args");
                jsonWriter.array();
                for (String argsListValue : argsList) {
                    if (argsListValue != null) {
                        jsonWriter.value(argsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static HadoopStepConfigJsonMarshaller instance;

    public static HadoopStepConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HadoopStepConfigJsonMarshaller();
        return instance;
    }

}
