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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * InstanceGroupStatusMarshaller
 */
public class InstanceGroupStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceGroupStatus instanceGroupStatus, StructuredJsonGenerator jsonGenerator) {

        if (instanceGroupStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceGroupStatus.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(instanceGroupStatus.getState());
            }
            if (instanceGroupStatus.getStateChangeReason() != null) {
                jsonGenerator.writeFieldName("StateChangeReason");
                InstanceGroupStateChangeReasonJsonMarshaller.getInstance().marshall(instanceGroupStatus.getStateChangeReason(), jsonGenerator);
            }
            if (instanceGroupStatus.getTimeline() != null) {
                jsonGenerator.writeFieldName("Timeline");
                InstanceGroupTimelineJsonMarshaller.getInstance().marshall(instanceGroupStatus.getTimeline(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceGroupStatusJsonMarshaller instance;

    public static InstanceGroupStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupStatusJsonMarshaller();
        return instance;
    }

}
