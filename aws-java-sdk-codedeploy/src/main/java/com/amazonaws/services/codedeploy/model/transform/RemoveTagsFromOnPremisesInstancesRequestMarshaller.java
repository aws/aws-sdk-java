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
 * Remove Tags From On Premises Instances Request Marshaller
 */
public class RemoveTagsFromOnPremisesInstancesRequestMarshaller implements Marshaller<Request<RemoveTagsFromOnPremisesInstancesRequest>, RemoveTagsFromOnPremisesInstancesRequest> {

    public Request<RemoveTagsFromOnPremisesInstancesRequest> marshall(RemoveTagsFromOnPremisesInstancesRequest removeTagsFromOnPremisesInstancesRequest) {
        if (removeTagsFromOnPremisesInstancesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemoveTagsFromOnPremisesInstancesRequest> request = new DefaultRequest<RemoveTagsFromOnPremisesInstancesRequest>(removeTagsFromOnPremisesInstancesRequest, "AmazonCodeDeploy");
        String target = "CodeDeploy_20141006.RemoveTagsFromOnPremisesInstances";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();

            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Tag>)(removeTagsFromOnPremisesInstancesRequest.getTags());
            if (tagsList != null && !(tagsList.isAutoConstruct() && tagsList.isEmpty())) {

                jsonWriter.key("tags");
                jsonWriter.array();

                for (Tag tagsListValue : tagsList) {
                    if (tagsListValue != null) {
                        jsonWriter.object();
                        if (tagsListValue.getKey() != null) {
                            jsonWriter.key("Key").value(tagsListValue.getKey());
                        }
                        if (tagsListValue.getValue() != null) {
                            jsonWriter.key("Value").value(tagsListValue.getValue());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceNamesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(removeTagsFromOnPremisesInstancesRequest.getInstanceNames());
            if (instanceNamesList != null && !(instanceNamesList.isAutoConstruct() && instanceNamesList.isEmpty())) {

                jsonWriter.key("instanceNames");
                jsonWriter.array();

                for (String instanceNamesListValue : instanceNamesList) {
                    if (instanceNamesListValue != null) {
                        jsonWriter.value(instanceNamesListValue);
                    }
                }
                jsonWriter.endArray();
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
