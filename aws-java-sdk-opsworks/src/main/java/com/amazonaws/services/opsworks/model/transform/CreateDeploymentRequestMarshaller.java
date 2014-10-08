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
 * Create Deployment Request Marshaller
 */
public class CreateDeploymentRequestMarshaller implements Marshaller<Request<CreateDeploymentRequest>, CreateDeploymentRequest> {

    public Request<CreateDeploymentRequest> marshall(CreateDeploymentRequest createDeploymentRequest) {
        if (createDeploymentRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(createDeploymentRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.CreateDeployment";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createDeploymentRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(createDeploymentRequest.getStackId());
            }
            if (createDeploymentRequest.getAppId() != null) {
                jsonWriter.key("AppId").value(createDeploymentRequest.getAppId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(createDeploymentRequest.getInstanceIds());
            if (instanceIdsList != null && !(instanceIdsList.isAutoConstruct() && instanceIdsList.isEmpty())) {

                jsonWriter.key("InstanceIds");
                jsonWriter.array();

                for (String instanceIdsListValue : instanceIdsList) {
                    if (instanceIdsListValue != null) {
                        jsonWriter.value(instanceIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }
            DeploymentCommand command = createDeploymentRequest.getCommand();
            if (command != null) {

                jsonWriter.key("Command");
                jsonWriter.object();

                if (command.getName() != null) {
                    jsonWriter.key("Name").value(command.getName());
                }
                if (command.getArgs() != null) {
                    jsonWriter.key("Args");
                    jsonWriter.object();
                    for (Map.Entry<String, java.util.List<String>> argsListValue : command.getArgs().entrySet()) {
                        if (argsListValue.getValue() != null) {
                            jsonWriter.key(argsListValue.getKey());

                            jsonWriter.array();
                            for (String valueListValue : argsListValue.getValue()) {
                                if (valueListValue != null) {
                                    jsonWriter.value(valueListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            if (createDeploymentRequest.getComment() != null) {
                jsonWriter.key("Comment").value(createDeploymentRequest.getComment());
            }
            if (createDeploymentRequest.getCustomJson() != null) {
                jsonWriter.key("CustomJson").value(createDeploymentRequest.getCustomJson());
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
