/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model.transform;

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
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Start Task Request Marshaller
 */
public class StartTaskRequestMarshaller implements Marshaller<Request<StartTaskRequest>, StartTaskRequest> {

    public Request<StartTaskRequest> marshall(StartTaskRequest startTaskRequest) {
        if (startTaskRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartTaskRequest> request = new DefaultRequest<StartTaskRequest>(startTaskRequest, "AmazonECS");
        String target = "AmazonEC2ContainerServiceV20141113.StartTask";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (startTaskRequest.getCluster() != null) {
                jsonWriter.key("cluster").value(startTaskRequest.getCluster());
            }
            if (startTaskRequest.getTaskDefinition() != null) {
                jsonWriter.key("taskDefinition").value(startTaskRequest.getTaskDefinition());
            }
            TaskOverride overrides = startTaskRequest.getOverrides();
            if (overrides != null) {

                jsonWriter.key("overrides");
                jsonWriter.object();

                com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride> containerOverridesList = (com.amazonaws.internal.ListWithAutoConstructFlag<ContainerOverride>)(overrides.getContainerOverrides());
                if (containerOverridesList != null && !(containerOverridesList.isAutoConstruct() && containerOverridesList.isEmpty())) {

                    jsonWriter.key("containerOverrides");
                    jsonWriter.array();

                    for (ContainerOverride containerOverridesListValue : containerOverridesList) {
                        if (containerOverridesListValue != null) {
                            jsonWriter.object();
                            if (containerOverridesListValue.getName() != null) {
                                jsonWriter.key("name").value(containerOverridesListValue.getName());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(containerOverridesListValue.getCommand());
                            if (commandList != null && !(commandList.isAutoConstruct() && commandList.isEmpty())) {

                                jsonWriter.key("command");
                                jsonWriter.array();

                                for (String commandListValue : commandList) {
                                    if (commandListValue != null) {
                                        jsonWriter.value(commandListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> containerInstancesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(startTaskRequest.getContainerInstances());
            if (containerInstancesList != null && !(containerInstancesList.isAutoConstruct() && containerInstancesList.isEmpty())) {

                jsonWriter.key("containerInstances");
                jsonWriter.array();

                for (String containerInstancesListValue : containerInstancesList) {
                    if (containerInstancesListValue != null) {
                        jsonWriter.value(containerInstancesListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (startTaskRequest.getStartedBy() != null) {
                jsonWriter.key("startedBy").value(startTaskRequest.getStartedBy());
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
