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
 * InstanceStatusMarshaller
 */
public class InstanceStatusJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(InstanceStatus instanceStatus, StructuredJsonGenerator jsonGenerator) {

        if (instanceStatus == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (instanceStatus.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(instanceStatus.getState());
            }
            if (instanceStatus.getStateChangeReason() != null) {
                jsonGenerator.writeFieldName("StateChangeReason");
                InstanceStateChangeReasonJsonMarshaller.getInstance().marshall(instanceStatus.getStateChangeReason(), jsonGenerator);
            }
            if (instanceStatus.getTimeline() != null) {
                jsonGenerator.writeFieldName("Timeline");
                InstanceTimelineJsonMarshaller.getInstance().marshall(instanceStatus.getTimeline(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InstanceStatusJsonMarshaller instance;

    public static InstanceStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceStatusJsonMarshaller();
        return instance;
    }

}
