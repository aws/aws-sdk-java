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
package com.amazonaws.services.dynamodbv2.model.transform;


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
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Table Request Marshaller
 */
public class CreateTableRequestMarshaller implements Marshaller<Request<CreateTableRequest>, CreateTableRequest> {

    

    public Request<CreateTableRequest> marshall(CreateTableRequest createTableRequest) {
    if (createTableRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateTableRequest> request = new DefaultRequest<CreateTableRequest>(createTableRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.CreateTable";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
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
          

            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition> attributeDefinitionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<AttributeDefinition>)(createTableRequest.getAttributeDefinitions());
            if (attributeDefinitionsList != null && !(attributeDefinitionsList.isAutoConstruct() && attributeDefinitionsList.isEmpty())) {

                jsonWriter.key("AttributeDefinitions");
                jsonWriter.array();

                for (AttributeDefinition attributeDefinitionsListValue : attributeDefinitionsList) {
                    if (attributeDefinitionsListValue != null) {
                        jsonWriter.object();
                        if (attributeDefinitionsListValue.getAttributeName() != null) {
                            jsonWriter.key("AttributeName").value(attributeDefinitionsListValue.getAttributeName());
                        }
                        if (attributeDefinitionsListValue.getAttributeType() != null) {
                            jsonWriter.key("AttributeType").value(attributeDefinitionsListValue.getAttributeType());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (createTableRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(createTableRequest.getTableName());
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaList = (com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>)(createTableRequest.getKeySchema());
            if (keySchemaList != null && !(keySchemaList.isAutoConstruct() && keySchemaList.isEmpty())) {

                jsonWriter.key("KeySchema");
                jsonWriter.array();

                for (KeySchemaElement keySchemaListValue : keySchemaList) {
                    if (keySchemaListValue != null) {
                        jsonWriter.object();
                        if (keySchemaListValue.getAttributeName() != null) {
                            jsonWriter.key("AttributeName").value(keySchemaListValue.getAttributeName());
                        }
                        if (keySchemaListValue.getKeyType() != null) {
                            jsonWriter.key("KeyType").value(keySchemaListValue.getKeyType());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex> localSecondaryIndexesList = (com.amazonaws.internal.ListWithAutoConstructFlag<LocalSecondaryIndex>)(createTableRequest.getLocalSecondaryIndexes());
            if (localSecondaryIndexesList != null && !(localSecondaryIndexesList.isAutoConstruct() && localSecondaryIndexesList.isEmpty())) {

                jsonWriter.key("LocalSecondaryIndexes");
                jsonWriter.array();

                for (LocalSecondaryIndex localSecondaryIndexesListValue : localSecondaryIndexesList) {
                    if (localSecondaryIndexesListValue != null) {
                        jsonWriter.object();
                        if (localSecondaryIndexesListValue.getIndexName() != null) {
                            jsonWriter.key("IndexName").value(localSecondaryIndexesListValue.getIndexName());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema2List = (com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>)(localSecondaryIndexesListValue.getKeySchema());
                        if (keySchema2List != null && !(keySchema2List.isAutoConstruct() && keySchema2List.isEmpty())) {

                            jsonWriter.key("KeySchema");
                            jsonWriter.array();

                            for (KeySchemaElement keySchema2ListValue : keySchema2List) {
                                if (keySchema2ListValue != null) {
                                    jsonWriter.object();
                                    if (keySchema2ListValue.getAttributeName() != null) {
                                        jsonWriter.key("AttributeName").value(keySchema2ListValue.getAttributeName());
                                    }
                                    if (keySchema2ListValue.getKeyType() != null) {
                                        jsonWriter.key("KeyType").value(keySchema2ListValue.getKeyType());
                                    }
                                    jsonWriter.endObject();
                                }
                            }
                            jsonWriter.endArray();
                        }
                        Projection projection = localSecondaryIndexesListValue.getProjection();
                        if (projection != null) {

                            jsonWriter.key("Projection");
                            jsonWriter.object();

                            if (projection.getProjectionType() != null) {
                                jsonWriter.key("ProjectionType").value(projection.getProjectionType());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> nonKeyAttributesList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(projection.getNonKeyAttributes());
                            if (nonKeyAttributesList != null && !(nonKeyAttributesList.isAutoConstruct() && nonKeyAttributesList.isEmpty())) {

                                jsonWriter.key("NonKeyAttributes");
                                jsonWriter.array();

                                for (String nonKeyAttributesListValue : nonKeyAttributesList) {
                                    if (nonKeyAttributesListValue != null) {
                                        jsonWriter.value(nonKeyAttributesListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            ProvisionedThroughput provisionedThroughput = createTableRequest.getProvisionedThroughput();
            if (provisionedThroughput != null) {

                jsonWriter.key("ProvisionedThroughput");
                jsonWriter.object();

                if (provisionedThroughput.getReadCapacityUnits() != null) {
                    jsonWriter.key("ReadCapacityUnits").value(provisionedThroughput.getReadCapacityUnits());
                }
                if (provisionedThroughput.getWriteCapacityUnits() != null) {
                    jsonWriter.key("WriteCapacityUnits").value(provisionedThroughput.getWriteCapacityUnits());
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
