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
 * InstancesCountMarshaller
 */
public class InstancesCountJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstancesCount instancesCount, StructuredJsonGenerator jsonGenerator) {

        if (instancesCount == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instancesCount.getAssigning() != null) {
                jsonGenerator.writeFieldName("Assigning").writeValue(instancesCount.getAssigning());
            }
            if (instancesCount.getBooting() != null) {
                jsonGenerator.writeFieldName("Booting").writeValue(instancesCount.getBooting());
            }
            if (instancesCount.getConnectionLost() != null) {
                jsonGenerator.writeFieldName("ConnectionLost").writeValue(instancesCount.getConnectionLost());
            }
            if (instancesCount.getDeregistering() != null) {
                jsonGenerator.writeFieldName("Deregistering").writeValue(instancesCount.getDeregistering());
            }
            if (instancesCount.getOnline() != null) {
                jsonGenerator.writeFieldName("Online").writeValue(instancesCount.getOnline());
            }
            if (instancesCount.getPending() != null) {
                jsonGenerator.writeFieldName("Pending").writeValue(instancesCount.getPending());
            }
            if (instancesCount.getRebooting() != null) {
                jsonGenerator.writeFieldName("Rebooting").writeValue(instancesCount.getRebooting());
            }
            if (instancesCount.getRegistered() != null) {
                jsonGenerator.writeFieldName("Registered").writeValue(instancesCount.getRegistered());
            }
            if (instancesCount.getRegistering() != null) {
                jsonGenerator.writeFieldName("Registering").writeValue(instancesCount.getRegistering());
            }
            if (instancesCount.getRequested() != null) {
                jsonGenerator.writeFieldName("Requested").writeValue(instancesCount.getRequested());
            }
            if (instancesCount.getRunningSetup() != null) {
                jsonGenerator.writeFieldName("RunningSetup").writeValue(instancesCount.getRunningSetup());
            }
            if (instancesCount.getSetupFailed() != null) {
                jsonGenerator.writeFieldName("SetupFailed").writeValue(instancesCount.getSetupFailed());
            }
            if (instancesCount.getShuttingDown() != null) {
                jsonGenerator.writeFieldName("ShuttingDown").writeValue(instancesCount.getShuttingDown());
            }
            if (instancesCount.getStartFailed() != null) {
                jsonGenerator.writeFieldName("StartFailed").writeValue(instancesCount.getStartFailed());
            }
            if (instancesCount.getStopped() != null) {
                jsonGenerator.writeFieldName("Stopped").writeValue(instancesCount.getStopped());
            }
            if (instancesCount.getStopping() != null) {
                jsonGenerator.writeFieldName("Stopping").writeValue(instancesCount.getStopping());
            }
            if (instancesCount.getTerminated() != null) {
                jsonGenerator.writeFieldName("Terminated").writeValue(instancesCount.getTerminated());
            }
            if (instancesCount.getTerminating() != null) {
                jsonGenerator.writeFieldName("Terminating").writeValue(instancesCount.getTerminating());
            }
            if (instancesCount.getUnassigning() != null) {
                jsonGenerator.writeFieldName("Unassigning").writeValue(instancesCount.getUnassigning());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstancesCountJsonMarshaller instance;

    public static InstancesCountJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstancesCountJsonMarshaller();
        return instance;
    }

}
