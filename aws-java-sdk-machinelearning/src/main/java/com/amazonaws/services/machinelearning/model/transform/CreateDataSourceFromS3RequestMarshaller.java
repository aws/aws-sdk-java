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
package com.amazonaws.services.machinelearning.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateDataSourceFromS3Request Marshaller
 */
public class CreateDataSourceFromS3RequestMarshaller implements Marshaller<Request<CreateDataSourceFromS3Request>, CreateDataSourceFromS3Request> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateDataSourceFromS3RequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateDataSourceFromS3Request> marshall(CreateDataSourceFromS3Request createDataSourceFromS3Request) {

        if (createDataSourceFromS3Request == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDataSourceFromS3Request> request = new DefaultRequest<CreateDataSourceFromS3Request>(createDataSourceFromS3Request,
                "AmazonMachineLearning");
        request.addHeader("X-Amz-Target", "AmazonML_20141212.CreateDataSourceFromS3");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createDataSourceFromS3Request.getDataSourceId() != null) {
                jsonGenerator.writeFieldName("DataSourceId").writeValue(createDataSourceFromS3Request.getDataSourceId());
            }
            if (createDataSourceFromS3Request.getDataSourceName() != null) {
                jsonGenerator.writeFieldName("DataSourceName").writeValue(createDataSourceFromS3Request.getDataSourceName());
            }
            if (createDataSourceFromS3Request.getDataSpec() != null) {
                jsonGenerator.writeFieldName("DataSpec");
                S3DataSpecJsonMarshaller.getInstance().marshall(createDataSourceFromS3Request.getDataSpec(), jsonGenerator);
            }
            if (createDataSourceFromS3Request.getComputeStatistics() != null) {
                jsonGenerator.writeFieldName("ComputeStatistics").writeValue(createDataSourceFromS3Request.getComputeStatistics());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
