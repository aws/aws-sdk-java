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
package com.amazonaws.services.elastictranscoder.model.transform;

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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * UpdatePipelineRequest Marshaller
 */
public class UpdatePipelineRequestMarshaller implements Marshaller<Request<UpdatePipelineRequest>, UpdatePipelineRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdatePipelineRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdatePipelineRequest> marshall(UpdatePipelineRequest updatePipelineRequest) {

        if (updatePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdatePipelineRequest> request = new DefaultRequest<UpdatePipelineRequest>(updatePipelineRequest, "AmazonElasticTranscoder");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/2012-09-25/pipelines/{Id}";

        uriResourcePath = uriResourcePath.replace("{Id}",
                (updatePipelineRequest.getId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(updatePipelineRequest.getId()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updatePipelineRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updatePipelineRequest.getName());
            }
            if (updatePipelineRequest.getInputBucket() != null) {
                jsonGenerator.writeFieldName("InputBucket").writeValue(updatePipelineRequest.getInputBucket());
            }
            if (updatePipelineRequest.getRole() != null) {
                jsonGenerator.writeFieldName("Role").writeValue(updatePipelineRequest.getRole());
            }
            if (updatePipelineRequest.getAwsKmsKeyArn() != null) {
                jsonGenerator.writeFieldName("AwsKmsKeyArn").writeValue(updatePipelineRequest.getAwsKmsKeyArn());
            }
            if (updatePipelineRequest.getNotifications() != null) {
                jsonGenerator.writeFieldName("Notifications");
                NotificationsJsonMarshaller.getInstance().marshall(updatePipelineRequest.getNotifications(), jsonGenerator);
            }
            if (updatePipelineRequest.getContentConfig() != null) {
                jsonGenerator.writeFieldName("ContentConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(updatePipelineRequest.getContentConfig(), jsonGenerator);
            }
            if (updatePipelineRequest.getThumbnailConfig() != null) {
                jsonGenerator.writeFieldName("ThumbnailConfig");
                PipelineOutputConfigJsonMarshaller.getInstance().marshall(updatePipelineRequest.getThumbnailConfig(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
