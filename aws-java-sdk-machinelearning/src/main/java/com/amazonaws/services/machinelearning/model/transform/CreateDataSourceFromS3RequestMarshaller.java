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
package com.amazonaws.services.machinelearning.model.transform;

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
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Data Source From S3 Request Marshaller
 */
public class CreateDataSourceFromS3RequestMarshaller implements Marshaller<Request<CreateDataSourceFromS3Request>, CreateDataSourceFromS3Request> {

    public Request<CreateDataSourceFromS3Request> marshall(CreateDataSourceFromS3Request createDataSourceFromS3Request) {
        if (createDataSourceFromS3Request == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDataSourceFromS3Request> request = new DefaultRequest<CreateDataSourceFromS3Request>(createDataSourceFromS3Request, "AmazonMachineLearning");
        String target = "AmazonML_20141212.CreateDataSourceFromS3";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createDataSourceFromS3Request.getDataSourceId() != null) {
                jsonWriter.key("DataSourceId").value(createDataSourceFromS3Request.getDataSourceId());
            }
            if (createDataSourceFromS3Request.getDataSourceName() != null) {
                jsonWriter.key("DataSourceName").value(createDataSourceFromS3Request.getDataSourceName());
            }
            S3DataSpec dataSpec = createDataSourceFromS3Request.getDataSpec();
            if (dataSpec != null) {

                jsonWriter.key("DataSpec");
                jsonWriter.object();

                if (dataSpec.getDataLocationS3() != null) {
                    jsonWriter.key("DataLocationS3").value(dataSpec.getDataLocationS3());
                }
                if (dataSpec.getDataRearrangement() != null) {
                    jsonWriter.key("DataRearrangement").value(dataSpec.getDataRearrangement());
                }
                if (dataSpec.getDataSchema() != null) {
                    jsonWriter.key("DataSchema").value(dataSpec.getDataSchema());
                }
                if (dataSpec.getDataSchemaLocationS3() != null) {
                    jsonWriter.key("DataSchemaLocationS3").value(dataSpec.getDataSchemaLocationS3());
                }
                jsonWriter.endObject();
            }
            if (createDataSourceFromS3Request.isComputeStatistics() != null) {
                jsonWriter.key("ComputeStatistics").value(createDataSourceFromS3Request.isComputeStatistics());
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
