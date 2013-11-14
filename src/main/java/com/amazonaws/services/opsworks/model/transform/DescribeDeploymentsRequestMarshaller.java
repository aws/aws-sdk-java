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
package com.amazonaws.services.opsworks.model.transform;


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
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Describe Deployments Request Marshaller
 */
public class DescribeDeploymentsRequestMarshaller implements Marshaller<Request<DescribeDeploymentsRequest>, DescribeDeploymentsRequest> {

    

    public Request<DescribeDeploymentsRequest> marshall(DescribeDeploymentsRequest describeDeploymentsRequest) {
    if (describeDeploymentsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<DescribeDeploymentsRequest> request = new DefaultRequest<DescribeDeploymentsRequest>(describeDeploymentsRequest, "AWSOpsWorks");
        String target = "OpsWorks_20130218.DescribeDeployments";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

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
          
            if (describeDeploymentsRequest.getStackId() != null) {
                jsonWriter.key("StackId").value(describeDeploymentsRequest.getStackId());
            }
            if (describeDeploymentsRequest.getAppId() != null) {
                jsonWriter.key("AppId").value(describeDeploymentsRequest.getAppId());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> deploymentIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(describeDeploymentsRequest.getDeploymentIds());
            if (deploymentIdsList != null && !(deploymentIdsList.isAutoConstruct() && deploymentIdsList.isEmpty())) {

                jsonWriter.key("DeploymentIds");
                jsonWriter.array();

                for (String deploymentIdsListValue : deploymentIdsList) {
                    if (deploymentIdsListValue != null) {
                        jsonWriter.value(deploymentIdsListValue);
                    }
                }
                jsonWriter.endArray();
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
