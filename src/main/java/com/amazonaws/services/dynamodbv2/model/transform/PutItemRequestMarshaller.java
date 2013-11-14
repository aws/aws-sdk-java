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
 * Put Item Request Marshaller
 */
public class PutItemRequestMarshaller implements Marshaller<Request<PutItemRequest>, PutItemRequest> {

    

    public Request<PutItemRequest> marshall(PutItemRequest putItemRequest) {
    if (putItemRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<PutItemRequest> request = new DefaultRequest<PutItemRequest>(putItemRequest, "AmazonDynamoDBv2");
        String target = "DynamoDB_20120810.PutItem";
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
          
            if (putItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(putItemRequest.getTableName());
            }
            if (putItemRequest.getItem() != null) {
                jsonWriter.key("Item");
                jsonWriter.object();
                for (Map.Entry<String, AttributeValue> itemListValue : putItemRequest.getItem().entrySet()) {
                    if (itemListValue.getValue() != null) {
                        jsonWriter.key(itemListValue.getKey());

                        jsonWriter.object();
                        if (itemListValue.getValue().getS() != null) {
                            jsonWriter.key("S").value(itemListValue.getValue().getS());
                        }
                        if (itemListValue.getValue().getN() != null) {
                            jsonWriter.key("N").value(itemListValue.getValue().getN());
                        }
                        if (itemListValue.getValue().getB() != null) {
                            jsonWriter.key("B").value(itemListValue.getValue().getB());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> sSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(itemListValue.getValue().getSS());
                        if (sSList != null && !(sSList.isAutoConstruct() && sSList.isEmpty())) {

                            jsonWriter.key("SS");
                            jsonWriter.array();

                            for (String sSListValue : sSList) {
                                if (sSListValue != null) {
                                    jsonWriter.value(sSListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> nSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(itemListValue.getValue().getNS());
                        if (nSList != null && !(nSList.isAutoConstruct() && nSList.isEmpty())) {

                            jsonWriter.key("NS");
                            jsonWriter.array();

                            for (String nSListValue : nSList) {
                                if (nSListValue != null) {
                                    jsonWriter.value(nSListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bSList = (com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer>)(itemListValue.getValue().getBS());
                        if (bSList != null && !(bSList.isAutoConstruct() && bSList.isEmpty())) {

                            jsonWriter.key("BS");
                            jsonWriter.array();

                            for (java.nio.ByteBuffer bSListValue : bSList) {
                                if (bSListValue != null) {
                                    jsonWriter.value(bSListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getExpected() != null) {
                jsonWriter.key("Expected");
                jsonWriter.object();
                for (Map.Entry<String, ExpectedAttributeValue> expectedListValue : putItemRequest.getExpected().entrySet()) {
                    if (expectedListValue.getValue() != null) {
                        jsonWriter.key(expectedListValue.getKey());

                        jsonWriter.object();
                        AttributeValue value = expectedListValue.getValue().getValue();
                        if (value != null) {

                            jsonWriter.key("Value");
                            jsonWriter.object();

                            if (value.getS() != null) {
                                jsonWriter.key("S").value(value.getS());
                            }
                            if (value.getN() != null) {
                                jsonWriter.key("N").value(value.getN());
                            }
                            if (value.getB() != null) {
                                jsonWriter.key("B").value(value.getB());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> sSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(value.getSS());
                            if (sSList != null && !(sSList.isAutoConstruct() && sSList.isEmpty())) {

                                jsonWriter.key("SS");
                                jsonWriter.array();

                                for (String sSListValue : sSList) {
                                    if (sSListValue != null) {
                                        jsonWriter.value(sSListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> nSList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(value.getNS());
                            if (nSList != null && !(nSList.isAutoConstruct() && nSList.isEmpty())) {

                                jsonWriter.key("NS");
                                jsonWriter.array();

                                for (String nSListValue : nSList) {
                                    if (nSListValue != null) {
                                        jsonWriter.value(nSListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer> bSList = (com.amazonaws.internal.ListWithAutoConstructFlag<java.nio.ByteBuffer>)(value.getBS());
                            if (bSList != null && !(bSList.isAutoConstruct() && bSList.isEmpty())) {

                                jsonWriter.key("BS");
                                jsonWriter.array();

                                for (java.nio.ByteBuffer bSListValue : bSList) {
                                    if (bSListValue != null) {
                                        jsonWriter.value(bSListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        if (expectedListValue.getValue().isExists() != null) {
                            jsonWriter.key("Exists").value(expectedListValue.getValue().isExists());
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getReturnValues() != null) {
                jsonWriter.key("ReturnValues").value(putItemRequest.getReturnValues());
            }
            if (putItemRequest.getReturnConsumedCapacity() != null) {
                jsonWriter.key("ReturnConsumedCapacity").value(putItemRequest.getReturnConsumedCapacity());
            }
            if (putItemRequest.getReturnItemCollectionMetrics() != null) {
                jsonWriter.key("ReturnItemCollectionMetrics").value(putItemRequest.getReturnItemCollectionMetrics());
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
