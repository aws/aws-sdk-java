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
 * Create Data Source From R D S Request Marshaller
 */
public class CreateDataSourceFromRDSRequestMarshaller implements Marshaller<Request<CreateDataSourceFromRDSRequest>, CreateDataSourceFromRDSRequest> {

    public Request<CreateDataSourceFromRDSRequest> marshall(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) {
        if (createDataSourceFromRDSRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateDataSourceFromRDSRequest> request = new DefaultRequest<CreateDataSourceFromRDSRequest>(createDataSourceFromRDSRequest, "AmazonMachineLearning");
        String target = "AmazonML_20141212.CreateDataSourceFromRDS";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createDataSourceFromRDSRequest.getDataSourceId() != null) {
                jsonWriter.key("DataSourceId").value(createDataSourceFromRDSRequest.getDataSourceId());
            }
            if (createDataSourceFromRDSRequest.getDataSourceName() != null) {
                jsonWriter.key("DataSourceName").value(createDataSourceFromRDSRequest.getDataSourceName());
            }
            RDSDataSpec rDSData = createDataSourceFromRDSRequest.getRDSData();
            if (rDSData != null) {

                jsonWriter.key("RDSData");
                jsonWriter.object();

                RDSDatabase databaseInformation = rDSData.getDatabaseInformation();
                if (databaseInformation != null) {

                    jsonWriter.key("DatabaseInformation");
                    jsonWriter.object();

                    if (databaseInformation.getInstanceIdentifier() != null) {
                        jsonWriter.key("InstanceIdentifier").value(databaseInformation.getInstanceIdentifier());
                    }
                    if (databaseInformation.getDatabaseName() != null) {
                        jsonWriter.key("DatabaseName").value(databaseInformation.getDatabaseName());
                    }
                    jsonWriter.endObject();
                }
                if (rDSData.getSelectSqlQuery() != null) {
                    jsonWriter.key("SelectSqlQuery").value(rDSData.getSelectSqlQuery());
                }
                RDSDatabaseCredentials databaseCredentials = rDSData.getDatabaseCredentials();
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
                if (rDSData.getS3StagingLocation() != null) {
                    jsonWriter.key("S3StagingLocation").value(rDSData.getS3StagingLocation());
                }
                if (rDSData.getDataRearrangement() != null) {
                    jsonWriter.key("DataRearrangement").value(rDSData.getDataRearrangement());
                }
                if (rDSData.getDataSchema() != null) {
                    jsonWriter.key("DataSchema").value(rDSData.getDataSchema());
                }
                if (rDSData.getDataSchemaUri() != null) {
                    jsonWriter.key("DataSchemaUri").value(rDSData.getDataSchemaUri());
                }
                if (rDSData.getResourceRole() != null) {
                    jsonWriter.key("ResourceRole").value(rDSData.getResourceRole());
                }
                if (rDSData.getServiceRole() != null) {
                    jsonWriter.key("ServiceRole").value(rDSData.getServiceRole());
                }
                if (rDSData.getSubnetId() != null) {
                    jsonWriter.key("SubnetId").value(rDSData.getSubnetId());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(rDSData.getSecurityGroupIds());
                if (securityGroupIdsList != null && !(securityGroupIdsList.isAutoConstruct() && securityGroupIdsList.isEmpty())) {

                    jsonWriter.key("SecurityGroupIds");
                    jsonWriter.array();

                    for (String securityGroupIdsListValue : securityGroupIdsList) {
                        if (securityGroupIdsListValue != null) {
                            jsonWriter.value(securityGroupIdsListValue);
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            if (createDataSourceFromRDSRequest.getRoleARN() != null) {
                jsonWriter.key("RoleARN").value(createDataSourceFromRDSRequest.getRoleARN());
            }
            if (createDataSourceFromRDSRequest.isComputeStatistics() != null) {
                jsonWriter.key("ComputeStatistics").value(createDataSourceFromRDSRequest.isComputeStatistics());
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
