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
package com.amazonaws.services.codedeploy.model.transform;

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
import com.amazonaws.services.codedeploy.model.*;
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

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(createDeploymentRequest, "AmazonCodeDeploy");
        String target = "CodeDeploy_20141006.CreateDeployment";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createDeploymentRequest.getApplicationName() != null) {
                jsonWriter.key("applicationName").value(createDeploymentRequest.getApplicationName());
            }
            if (createDeploymentRequest.getDeploymentGroupName() != null) {
                jsonWriter.key("deploymentGroupName").value(createDeploymentRequest.getDeploymentGroupName());
            }
            RevisionLocation revision = createDeploymentRequest.getRevision();
            if (revision != null) {

                jsonWriter.key("revision");
                jsonWriter.object();

                if (revision.getRevisionType() != null) {
                    jsonWriter.key("revisionType").value(revision.getRevisionType());
                }
                S3Location s3Location = revision.getS3Location();
                if (s3Location != null) {

                    jsonWriter.key("s3Location");
                    jsonWriter.object();

                    if (s3Location.getBucket() != null) {
                        jsonWriter.key("bucket").value(s3Location.getBucket());
                    }
                    if (s3Location.getKey() != null) {
                        jsonWriter.key("key").value(s3Location.getKey());
                    }
                    if (s3Location.getBundleType() != null) {
                        jsonWriter.key("bundleType").value(s3Location.getBundleType());
                    }
                    if (s3Location.getVersion() != null) {
                        jsonWriter.key("version").value(s3Location.getVersion());
                    }
                    if (s3Location.getETag() != null) {
                        jsonWriter.key("eTag").value(s3Location.getETag());
                    }
                    jsonWriter.endObject();
                }
                GitHubLocation gitHubLocation = revision.getGitHubLocation();
                if (gitHubLocation != null) {

                    jsonWriter.key("gitHubLocation");
                    jsonWriter.object();

                    if (gitHubLocation.getRepository() != null) {
                        jsonWriter.key("repository").value(gitHubLocation.getRepository());
                    }
                    if (gitHubLocation.getCommitId() != null) {
                        jsonWriter.key("commitId").value(gitHubLocation.getCommitId());
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            if (createDeploymentRequest.getDeploymentConfigName() != null) {
                jsonWriter.key("deploymentConfigName").value(createDeploymentRequest.getDeploymentConfigName());
            }
            if (createDeploymentRequest.getDescription() != null) {
                jsonWriter.key("description").value(createDeploymentRequest.getDescription());
            }
            if (createDeploymentRequest.isIgnoreApplicationStopFailures() != null) {
                jsonWriter.key("ignoreApplicationStopFailures").value(createDeploymentRequest.isIgnoreApplicationStopFailures());
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
