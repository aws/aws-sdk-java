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
 * Create Data Source From Redshift Request Marshaller
 */
public class CreateDataSourceFromRedshiftRequestMarshaller implements Marshaller<Request<CreateDataSourceFromRedshiftRequest>, CreateDataSourceFromRedshiftRequest> {

    public Request<CreateDataSourceFromRedshiftRequest> marshall(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) {
        if (createDataSourceFromRedshiftRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDataSourceFromRedshiftRequest> request = new DefaultRequest<CreateDataSourceFromRedshiftRequest>(createDataSourceFromRedshiftRequest, "AmazonMachineLearning");
        String target = "AmazonML_20141212.CreateDataSourceFromRedshift";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createDataSourceFromRedshiftRequest.getDataSourceId() != null) {
                jsonWriter.key("DataSourceId").value(createDataSourceFromRedshiftRequest.getDataSourceId());
            }
            if (createDataSourceFromRedshiftRequest.getDataSourceName() != null) {
                jsonWriter.key("DataSourceName").value(createDataSourceFromRedshiftRequest.getDataSourceName());
            }
            RedshiftDataSpec dataSpec = createDataSourceFromRedshiftRequest.getDataSpec();
            if (dataSpec != null) {

                jsonWriter.key("DataSpec");
                jsonWriter.object();

                RedshiftDatabase databaseInformation = dataSpec.getDatabaseInformation();
                if (databaseInformation != null) {

                    jsonWriter.key("DatabaseInformation");
                    jsonWriter.object();

                    if (databaseInformation.getDatabaseName() != null) {
                        jsonWriter.key("DatabaseName").value(databaseInformation.getDatabaseName());
                    }
                    if (databaseInformation.getClusterIdentifier() != null) {
                        jsonWriter.key("ClusterIdentifier").value(databaseInformation.getClusterIdentifier());
                    }
                    jsonWriter.endObject();
                }
                if (dataSpec.getSelectSqlQuery() != null) {
                    jsonWriter.key("SelectSqlQuery").value(dataSpec.getSelectSqlQuery());
                }
                RedshiftDatabaseCredentials databaseCredentials = dataSpec.getDatabaseCredentials();
                if (databaseCredentials != null) {

                    jsonWriter.key("DatabaseCredentials");
                    jsonWriter.object();

                    if (databaseCredentials.getUsername() != null) {
                        jsonWriter.key("Username").value(databaseCredentials.getUsername());
                    }
                    if (databaseCredentials.getPassword() != null) {
                        jsonWriter.key("Password").value(databaseCredentials.getPassword());
                    }
                    jsonWriter.endObject();
                }
                if (dataSpec.getS3StagingLocation() != null) {
                    jsonWriter.key("S3StagingLocation").value(dataSpec.getS3StagingLocation());
                }
                if (dataSpec.getDataRearrangement() != null) {
                    jsonWriter.key("DataRearrangement").value(dataSpec.getDataRearrangement());
                }
                if (dataSpec.getDataSchema() != null) {
                    jsonWriter.key("DataSchema").value(dataSpec.getDataSchema());
                }
                if (dataSpec.getDataSchemaUri() != null) {
                    jsonWriter.key("DataSchemaUri").value(dataSpec.getDataSchemaUri());
                }
                jsonWriter.endObject();
            }
            if (createDataSourceFromRedshiftRequest.getRoleARN() != null) {
                jsonWriter.key("RoleARN").value(createDataSourceFromRedshiftRequest.getRoleARN());
            }
            if (createDataSourceFromRedshiftRequest.isComputeStatistics() != null) {
                jsonWriter.key("ComputeStatistics").value(createDataSourceFromRedshiftRequest.isComputeStatistics());
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
