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

package com.amazonaws.services.codedeploy.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * InstanceInfoMarshaller
 */
public class InstanceInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(InstanceInfo instanceInfo, JSONWriter jsonWriter) {
        if (instanceInfo == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instanceInfo.getInstanceName() != null) {
                jsonWriter.key("instanceName").value(
                        instanceInfo.getInstanceName());
            }

            if (instanceInfo.getIamUserArn() != null) {
                jsonWriter.key("iamUserArn")
                        .value(instanceInfo.getIamUserArn());
            }

            if (instanceInfo.getInstanceArn() != null) {
                jsonWriter.key("instanceArn").value(
                        instanceInfo.getInstanceArn());
            }

            if (instanceInfo.getRegisterTime() != null) {
                jsonWriter.key("registerTime").value(
                        instanceInfo.getRegisterTime());
            }

            if (instanceInfo.getDeregisterTime() != null) {
                jsonWriter.key("deregisterTime").value(
                        instanceInfo.getDeregisterTime());
            }

            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) instanceInfo
                    .getTags();
            if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
                jsonWriter.key("tags");
                jsonWriter.array();
                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        TagJsonMarshaller.getInstance().marshall(tagsListValue,
                                jsonWriter);
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

    private static InstanceInfoJsonMarshaller instance;

    public static InstanceInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInfoJsonMarshaller();
        return instance;
    }

}
