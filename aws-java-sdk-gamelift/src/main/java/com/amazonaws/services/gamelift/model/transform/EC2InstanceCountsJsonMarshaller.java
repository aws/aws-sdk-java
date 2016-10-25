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
package com.amazonaws.services.gamelift.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EC2InstanceCountsMarshaller
 */
public class EC2InstanceCountsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EC2InstanceCounts eC2InstanceCounts, StructuredJsonGenerator jsonGenerator) {

        if (eC2InstanceCounts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (eC2InstanceCounts.getDESIRED() != null) {
                jsonGenerator.writeFieldName("DESIRED").writeValue(eC2InstanceCounts.getDESIRED());
            }
            if (eC2InstanceCounts.getMINIMUM() != null) {
                jsonGenerator.writeFieldName("MINIMUM").writeValue(eC2InstanceCounts.getMINIMUM());
            }
            if (eC2InstanceCounts.getMAXIMUM() != null) {
                jsonGenerator.writeFieldName("MAXIMUM").writeValue(eC2InstanceCounts.getMAXIMUM());
            }
            if (eC2InstanceCounts.getPENDING() != null) {
                jsonGenerator.writeFieldName("PENDING").writeValue(eC2InstanceCounts.getPENDING());
            }
            if (eC2InstanceCounts.getACTIVE() != null) {
                jsonGenerator.writeFieldName("ACTIVE").writeValue(eC2InstanceCounts.getACTIVE());
            }
            if (eC2InstanceCounts.getIDLE() != null) {
                jsonGenerator.writeFieldName("IDLE").writeValue(eC2InstanceCounts.getIDLE());
            }
            if (eC2InstanceCounts.getTERMINATING() != null) {
                jsonGenerator.writeFieldName("TERMINATING").writeValue(eC2InstanceCounts.getTERMINATING());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EC2InstanceCountsJsonMarshaller instance;

    public static EC2InstanceCountsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2InstanceCountsJsonMarshaller();
        return instance;
    }

}
