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
package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ProblemMarshaller
 */
public class ProblemJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Problem problem, StructuredJsonGenerator jsonGenerator) {

        if (problem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (problem.getRun() != null) {
                jsonGenerator.writeFieldName("run");
                ProblemDetailJsonMarshaller.getInstance().marshall(problem.getRun(), jsonGenerator);
            }
            if (problem.getJob() != null) {
                jsonGenerator.writeFieldName("job");
                ProblemDetailJsonMarshaller.getInstance().marshall(problem.getJob(), jsonGenerator);
            }
            if (problem.getSuite() != null) {
                jsonGenerator.writeFieldName("suite");
                ProblemDetailJsonMarshaller.getInstance().marshall(problem.getSuite(), jsonGenerator);
            }
            if (problem.getTest() != null) {
                jsonGenerator.writeFieldName("test");
                ProblemDetailJsonMarshaller.getInstance().marshall(problem.getTest(), jsonGenerator);
            }
            if (problem.getDevice() != null) {
                jsonGenerator.writeFieldName("device");
                DeviceJsonMarshaller.getInstance().marshall(problem.getDevice(), jsonGenerator);
            }
            if (problem.getResult() != null) {
                jsonGenerator.writeFieldName("result").writeValue(problem.getResult());
            }
            if (problem.getMessage() != null) {
                jsonGenerator.writeFieldName("message").writeValue(problem.getMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProblemJsonMarshaller instance;

    public static ProblemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProblemJsonMarshaller();
        return instance;
    }

}
