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
 * InstancesCountMarshaller
 */
public class InstancesCountJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(InstancesCount instancesCount, JSONWriter jsonWriter) {
        if (instancesCount == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (instancesCount.getAssigning() != null) {
                jsonWriter.key("Assigning")
                        .value(instancesCount.getAssigning());
            }

            if (instancesCount.getBooting() != null) {
                jsonWriter.key("Booting").value(instancesCount.getBooting());
            }

            if (instancesCount.getConnectionLost() != null) {
                jsonWriter.key("ConnectionLost").value(
                        instancesCount.getConnectionLost());
            }

            if (instancesCount.getDeregistering() != null) {
                jsonWriter.key("Deregistering").value(
                        instancesCount.getDeregistering());
            }

            if (instancesCount.getOnline() != null) {
                jsonWriter.key("Online").value(instancesCount.getOnline());
            }

            if (instancesCount.getPending() != null) {
                jsonWriter.key("Pending").value(instancesCount.getPending());
            }

            if (instancesCount.getRebooting() != null) {
                jsonWriter.key("Rebooting")
                        .value(instancesCount.getRebooting());
            }

            if (instancesCount.getRegistered() != null) {
                jsonWriter.key("Registered").value(
                        instancesCount.getRegistered());
            }

            if (instancesCount.getRegistering() != null) {
                jsonWriter.key("Registering").value(
                        instancesCount.getRegistering());
            }

            if (instancesCount.getRequested() != null) {
                jsonWriter.key("Requested")
                        .value(instancesCount.getRequested());
            }

            if (instancesCount.getRunningSetup() != null) {
                jsonWriter.key("RunningSetup").value(
                        instancesCount.getRunningSetup());
            }

            if (instancesCount.getSetupFailed() != null) {
                jsonWriter.key("SetupFailed").value(
                        instancesCount.getSetupFailed());
            }

            if (instancesCount.getShuttingDown() != null) {
                jsonWriter.key("ShuttingDown").value(
                        instancesCount.getShuttingDown());
            }

            if (instancesCount.getStartFailed() != null) {
                jsonWriter.key("StartFailed").value(
                        instancesCount.getStartFailed());
            }

            if (instancesCount.getStopped() != null) {
                jsonWriter.key("Stopped").value(instancesCount.getStopped());
            }

            if (instancesCount.getStopping() != null) {
                jsonWriter.key("Stopping").value(instancesCount.getStopping());
            }

            if (instancesCount.getTerminated() != null) {
                jsonWriter.key("Terminated").value(
                        instancesCount.getTerminated());
            }

            if (instancesCount.getTerminating() != null) {
                jsonWriter.key("Terminating").value(
                        instancesCount.getTerminating());
            }

            if (instancesCount.getUnassigning() != null) {
                jsonWriter.key("Unassigning").value(
                        instancesCount.getUnassigning());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstancesCountJsonMarshaller instance;

    public static InstancesCountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancesCountJsonMarshaller();
        return instance;
    }

}
