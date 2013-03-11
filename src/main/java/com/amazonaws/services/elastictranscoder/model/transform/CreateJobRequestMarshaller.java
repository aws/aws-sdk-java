/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elastictranscoder.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Job Request Marshaller
 */
public class CreateJobRequestMarshaller implements Marshaller<Request<CreateJobRequest>, CreateJobRequest> {

    

    public Request<CreateJobRequest> marshall(CreateJobRequest createJobRequest) {
    if (createJobRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateJobRequest> request = new DefaultRequest<CreateJobRequest>(createJobRequest, "AmazonElasticTranscoder");
        String target = "EtsCustomerService.CreateJob";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = "2012-09-25/jobs"; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (createJobRequest.getPipelineId() != null) {
                jsonWriter.key("PipelineId").value(createJobRequest.getPipelineId());
            }
            JobInput input = createJobRequest.getInput();
            if (input != null) {

                jsonWriter.key("Input");
                jsonWriter.object();

                if (input.getKey() != null) {
                    jsonWriter.key("Key").value(input.getKey());
                }
                if (input.getFrameRate() != null) {
                    jsonWriter.key("FrameRate").value(input.getFrameRate());
                }
                if (input.getResolution() != null) {
                    jsonWriter.key("Resolution").value(input.getResolution());
                }
                if (input.getAspectRatio() != null) {
                    jsonWriter.key("AspectRatio").value(input.getAspectRatio());
                }
                if (input.getInterlaced() != null) {
                    jsonWriter.key("Interlaced").value(input.getInterlaced());
                }
                if (input.getContainer() != null) {
                    jsonWriter.key("Container").value(input.getContainer());
                }
                jsonWriter.endObject();
            }
            CreateJobOutput output = createJobRequest.getOutput();
            if (output != null) {

                jsonWriter.key("Output");
                jsonWriter.object();

                if (output.getKey() != null) {
                    jsonWriter.key("Key").value(output.getKey());
                }
                if (output.getThumbnailPattern() != null) {
                    jsonWriter.key("ThumbnailPattern").value(output.getThumbnailPattern());
                }
                if (output.getRotate() != null) {
                    jsonWriter.key("Rotate").value(output.getRotate());
                }
                if (output.getPresetId() != null) {
                    jsonWriter.key("PresetId").value(output.getPresetId());
                }
                jsonWriter.endObject();
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
