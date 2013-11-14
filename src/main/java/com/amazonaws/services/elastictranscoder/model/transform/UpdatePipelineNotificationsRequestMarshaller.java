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
 * Update Pipeline Notifications Request Marshaller
 */
public class UpdatePipelineNotificationsRequestMarshaller implements Marshaller<Request<UpdatePipelineNotificationsRequest>, UpdatePipelineNotificationsRequest> {

    

    public Request<UpdatePipelineNotificationsRequest> marshall(UpdatePipelineNotificationsRequest updatePipelineNotificationsRequest) {
    if (updatePipelineNotificationsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<UpdatePipelineNotificationsRequest> request = new DefaultRequest<UpdatePipelineNotificationsRequest>(updatePipelineNotificationsRequest, "AmazonElasticTranscoder");
        String target = "EtsCustomerService.UpdatePipelineNotifications";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = "2012-09-25/pipelines/{Id}/notifications"; 
        uriResourcePath = uriResourcePath.replace("{Id}", (updatePipelineNotificationsRequest.getId() == null) ? "" : StringUtils.fromString(updatePipelineNotificationsRequest.getId())); 

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
          
            Notifications notifications = updatePipelineNotificationsRequest.getNotifications();
            if (notifications != null) {

                jsonWriter.key("Notifications");
                jsonWriter.object();

                if (notifications.getProgressing() != null) {
                    jsonWriter.key("Progressing").value(notifications.getProgressing());
                }
                if (notifications.getCompleted() != null) {
                    jsonWriter.key("Completed").value(notifications.getCompleted());
                }
                if (notifications.getWarning() != null) {
                    jsonWriter.key("Warning").value(notifications.getWarning());
                }
                if (notifications.getError() != null) {
                    jsonWriter.key("Error").value(notifications.getError());
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
}
