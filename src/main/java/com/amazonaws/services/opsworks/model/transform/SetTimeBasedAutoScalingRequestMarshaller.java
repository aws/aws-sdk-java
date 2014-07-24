/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Set Time Based Auto Scaling Request Marshaller
 */
public class SetTimeBasedAutoScalingRequestMarshaller implements Marshaller<Request<SetTimeBasedAutoScalingRequest>, SetTimeBasedAutoScalingRequest> {

    public Request<SetTimeBasedAutoScalingRequest> marshall(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) {
        if (setTimeBasedAutoScalingRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetTimeBasedAutoScalingRequest> request = new DefaultRequest<SetTimeBasedAutoScalingRequest>(setTimeBasedAutoScalingRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.SetTimeBasedAutoScaling";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (setTimeBasedAutoScalingRequest.getInstanceId() != null) {
                jsonWriter.key("InstanceId").value(setTimeBasedAutoScalingRequest.getInstanceId());
            }
            WeeklyAutoScalingSchedule autoScalingSchedule = setTimeBasedAutoScalingRequest.getAutoScalingSchedule();
            if (autoScalingSchedule != null) {

                jsonWriter.key("AutoScalingSchedule");
                jsonWriter.object();

                if (autoScalingSchedule.getMonday() != null) {
                    jsonWriter.key("Monday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> mondayListValue : autoScalingSchedule.getMonday().entrySet()) {
                        if (mondayListValue.getValue() != null) {
                            jsonWriter.key(mondayListValue.getKey());

                            jsonWriter.value(mondayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getTuesday() != null) {
                    jsonWriter.key("Tuesday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> tuesdayListValue : autoScalingSchedule.getTuesday().entrySet()) {
                        if (tuesdayListValue.getValue() != null) {
                            jsonWriter.key(tuesdayListValue.getKey());

                            jsonWriter.value(tuesdayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getWednesday() != null) {
                    jsonWriter.key("Wednesday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> wednesdayListValue : autoScalingSchedule.getWednesday().entrySet()) {
                        if (wednesdayListValue.getValue() != null) {
                            jsonWriter.key(wednesdayListValue.getKey());

                            jsonWriter.value(wednesdayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getThursday() != null) {
                    jsonWriter.key("Thursday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> thursdayListValue : autoScalingSchedule.getThursday().entrySet()) {
                        if (thursdayListValue.getValue() != null) {
                            jsonWriter.key(thursdayListValue.getKey());

                            jsonWriter.value(thursdayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getFriday() != null) {
                    jsonWriter.key("Friday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> fridayListValue : autoScalingSchedule.getFriday().entrySet()) {
                        if (fridayListValue.getValue() != null) {
                            jsonWriter.key(fridayListValue.getKey());

                            jsonWriter.value(fridayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getSaturday() != null) {
                    jsonWriter.key("Saturday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> saturdayListValue : autoScalingSchedule.getSaturday().entrySet()) {
                        if (saturdayListValue.getValue() != null) {
                            jsonWriter.key(saturdayListValue.getKey());

                            jsonWriter.value(saturdayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                if (autoScalingSchedule.getSunday() != null) {
                    jsonWriter.key("Sunday");
                    jsonWriter.object();
                    for (Map.Entry<String, String> sundayListValue : autoScalingSchedule.getSunday().entrySet()) {
                        if (sundayListValue.getValue() != null) {
                            jsonWriter.key(sundayListValue.getKey());

                            jsonWriter.value(sundayListValue.getValue());
                        }
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
