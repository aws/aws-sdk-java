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
 * InstanceGroupMarshaller
 */
public class InstanceGroupJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(InstanceGroup instanceGroup, JSONWriter jsonWriter) {
        if (instanceGroup == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instanceGroup.getId() != null) {
                jsonWriter.key("Id").value(instanceGroup.getId());
            }

            if (instanceGroup.getName() != null) {
                jsonWriter.key("Name").value(instanceGroup.getName());
            }

            if (instanceGroup.getMarket() != null) {
                jsonWriter.key("Market").value(instanceGroup.getMarket());
            }

            if (instanceGroup.getInstanceGroupType() != null) {
                jsonWriter.key("InstanceGroupType").value(
                        instanceGroup.getInstanceGroupType());
            }

            if (instanceGroup.getBidPrice() != null) {
                jsonWriter.key("BidPrice").value(instanceGroup.getBidPrice());
            }

            if (instanceGroup.getInstanceType() != null) {
                jsonWriter.key("InstanceType").value(
                        instanceGroup.getInstanceType());
            }

            if (instanceGroup.getRequestedInstanceCount() != null) {
                jsonWriter.key("RequestedInstanceCount").value(
                        instanceGroup.getRequestedInstanceCount());
            }

            if (instanceGroup.getRunningInstanceCount() != null) {
                jsonWriter.key("RunningInstanceCount").value(
                        instanceGroup.getRunningInstanceCount());
            }

            if (instanceGroup.getStatus() != null) {
                jsonWriter.key("Status");
                InstanceGroupStatusJsonMarshaller.getInstance().marshall(
                        instanceGroup.getStatus(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<Configuration> configurationsList = (com.amazonaws.internal.SdkInternalList<Configuration>) instanceGroup
                    .getConfigurations();
            if (!configurationsList.isEmpty()
                    || !configurationsList.isAutoConstruct()) {
                jsonWriter.key("Configurations");
                jsonWriter.array();
                for (Configuration configurationsListValue : configurationsList) {
                    if (configurationsListValue != null) {

                        ConfigurationJsonMarshaller.getInstance().marshall(
                                configurationsListValue, jsonWriter);
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

    private static InstanceGroupJsonMarshaller instance;

    public static InstanceGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupJsonMarshaller();
        return instance;
    }

}
