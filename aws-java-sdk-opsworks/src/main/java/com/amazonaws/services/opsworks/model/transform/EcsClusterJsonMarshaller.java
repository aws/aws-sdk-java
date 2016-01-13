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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * EcsClusterMarshaller
 */
public class EcsClusterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(EcsCluster ecsCluster, JSONWriter jsonWriter) {
        if (ecsCluster == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (ecsCluster.getEcsClusterArn() != null) {
                jsonWriter.key("EcsClusterArn").value(
                        ecsCluster.getEcsClusterArn());
            }

            if (ecsCluster.getEcsClusterName() != null) {
                jsonWriter.key("EcsClusterName").value(
                        ecsCluster.getEcsClusterName());
            }

            if (ecsCluster.getStackId() != null) {
                jsonWriter.key("StackId").value(ecsCluster.getStackId());
            }

            if (ecsCluster.getRegisteredAt() != null) {
                jsonWriter.key("RegisteredAt").value(
                        ecsCluster.getRegisteredAt());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EcsClusterJsonMarshaller instance;

    public static EcsClusterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EcsClusterJsonMarshaller();
        return instance;
    }

}
