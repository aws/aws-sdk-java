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
 * InstanceGroupDetailMarshaller
 */
public class InstanceGroupDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(InstanceGroupDetail instanceGroupDetail,
            JSONWriter jsonWriter) {
        if (instanceGroupDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instanceGroupDetail.getInstanceGroupId() != null) {
                jsonWriter.key("InstanceGroupId").value(
                        instanceGroupDetail.getInstanceGroupId());
            }

            if (instanceGroupDetail.getName() != null) {
                jsonWriter.key("Name").value(instanceGroupDetail.getName());
            }

            if (instanceGroupDetail.getMarket() != null) {
                jsonWriter.key("Market").value(instanceGroupDetail.getMarket());
            }

            if (instanceGroupDetail.getInstanceRole() != null) {
                jsonWriter.key("InstanceRole").value(
                        instanceGroupDetail.getInstanceRole());
            }

            if (instanceGroupDetail.getBidPrice() != null) {
                jsonWriter.key("BidPrice").value(
                        instanceGroupDetail.getBidPrice());
            }

            if (instanceGroupDetail.getInstanceType() != null) {
                jsonWriter.key("InstanceType").value(
                        instanceGroupDetail.getInstanceType());
            }

            if (instanceGroupDetail.getInstanceRequestCount() != null) {
                jsonWriter.key("InstanceRequestCount").value(
                        instanceGroupDetail.getInstanceRequestCount());
            }

            if (instanceGroupDetail.getInstanceRunningCount() != null) {
                jsonWriter.key("InstanceRunningCount").value(
                        instanceGroupDetail.getInstanceRunningCount());
            }

            if (instanceGroupDetail.getState() != null) {
                jsonWriter.key("State").value(instanceGroupDetail.getState());
            }

            if (instanceGroupDetail.getLastStateChangeReason() != null) {
                jsonWriter.key("LastStateChangeReason").value(
                        instanceGroupDetail.getLastStateChangeReason());
            }

            if (instanceGroupDetail.getCreationDateTime() != null) {
                jsonWriter.key("CreationDateTime").value(
                        instanceGroupDetail.getCreationDateTime());
            }

            if (instanceGroupDetail.getStartDateTime() != null) {
                jsonWriter.key("StartDateTime").value(
                        instanceGroupDetail.getStartDateTime());
            }

            if (instanceGroupDetail.getReadyDateTime() != null) {
                jsonWriter.key("ReadyDateTime").value(
                        instanceGroupDetail.getReadyDateTime());
            }

            if (instanceGroupDetail.getEndDateTime() != null) {
                jsonWriter.key("EndDateTime").value(
                        instanceGroupDetail.getEndDateTime());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceGroupDetailJsonMarshaller instance;

    public static InstanceGroupDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupDetailJsonMarshaller();
        return instance;
    }

}
