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
package com.amazonaws.services.xray.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * EdgeStatisticsMarshaller
 */
public class EdgeStatisticsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EdgeStatistics edgeStatistics, StructuredJsonGenerator jsonGenerator) {

        if (edgeStatistics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (edgeStatistics.getOkCount() != null) {
                jsonGenerator.writeFieldName("OkCount").writeValue(edgeStatistics.getOkCount());
            }
            if (edgeStatistics.getErrorStatistics() != null) {
                jsonGenerator.writeFieldName("ErrorStatistics");
                ErrorStatisticsJsonMarshaller.getInstance().marshall(edgeStatistics.getErrorStatistics(), jsonGenerator);
            }
            if (edgeStatistics.getFaultStatistics() != null) {
                jsonGenerator.writeFieldName("FaultStatistics");
                FaultStatisticsJsonMarshaller.getInstance().marshall(edgeStatistics.getFaultStatistics(), jsonGenerator);
            }
            if (edgeStatistics.getTotalCount() != null) {
                jsonGenerator.writeFieldName("TotalCount").writeValue(edgeStatistics.getTotalCount());
            }
            if (edgeStatistics.getTotalResponseTime() != null) {
                jsonGenerator.writeFieldName("TotalResponseTime").writeValue(edgeStatistics.getTotalResponseTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EdgeStatisticsJsonMarshaller instance;

    public static EdgeStatisticsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EdgeStatisticsJsonMarshaller();
        return instance;
    }

}
