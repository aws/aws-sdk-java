/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model.transform;


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
import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

import static com.amazonaws.http.HttpMethodName.POST;

/**
 * Put Item Request Marshaller
 */
public class PutItemRequestMarshaller implements Marshaller<Request<PutItemRequest>, PutItemRequest> {

    public Request<PutItemRequest> marshall(PutItemRequest putItemRequest) {
		if (putItemRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PutItemRequest> request = new DefaultRequest<PutItemRequest>(putItemRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20111205.PutItem";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (putItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(putItemRequest.getTableName());
            }
            if (putItemRequest.getItem() != null) {
                int itemEntryIndex = 1;
                jsonWriter.key("Item").object();
                for (Map.Entry<String, AttributeValue> itemListValue : putItemRequest.getItem().entrySet()) {
                    jsonWriter.key(itemListValue.getKey());
                    jsonWriter.object();
                    if (itemListValue.getValue().getS() != null) {
                        jsonWriter.key("S").value(itemListValue.getValue().getS());
                    }
                    if (itemListValue.getValue().getN() != null) {
                        jsonWriter.key("N").value(itemListValue.getValue().getN());
                    }
                    if (itemListValue.getValue() != null) {
                        java.util.List<String> sSList = itemListValue.getValue().getSS();
                        int sSListIndex = 0;
                        if (sSList != null && sSList.size() > 0) {
                            jsonWriter.key("SS").array();
                            for (String sSListValue : sSList) {
                                if (sSListValue != null) {
                                    jsonWriter.value(sSListValue);
                                } else jsonWriter.value(null);
                                sSListIndex++;
                            }
                            jsonWriter.endArray();
                        }
                    }
                    if (itemListValue.getValue() != null) {
                        java.util.List<String> nSList = itemListValue.getValue().getNS();
                        int nSListIndex = 0;
                        if (nSList != null && nSList.size() > 0) {
                            jsonWriter.key("NS").array();
                            for (String nSListValue : nSList) {
                                if (nSListValue != null) {
                                    jsonWriter.value(nSListValue);
                                } else jsonWriter.value(null);
                                nSListIndex++;
                            }
                            jsonWriter.endArray();
                        }
                    }
                    jsonWriter.endObject();
                    ++itemEntryIndex;
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getExpected() != null) {
                int expectedEntryIndex = 1;
                jsonWriter.key("Expected").object();
                for (Map.Entry<String, ExpectedAttributeValue> expectedListValue : putItemRequest.getExpected().entrySet()) {
                    jsonWriter.key(expectedListValue.getKey());
                    jsonWriter.object();
                    if (expectedListValue.getValue() != null) {
                        AttributeValue attributeValueValue = expectedListValue.getValue().getValue();
                        if (attributeValueValue != null) {
                            jsonWriter.key("Value").object();
                            if (attributeValueValue.getS() != null) {
                                jsonWriter.key("S").value(attributeValueValue.getS());
                            }
                            if (attributeValueValue.getN() != null) {
                                jsonWriter.key("N").value(attributeValueValue.getN());
                            }
                            if (attributeValueValue != null) {
                                java.util.List<String> sSList = attributeValueValue.getSS();
                                int sSListIndex = 0;
                                if (sSList != null && sSList.size() > 0) {
                                    jsonWriter.key("SS").array();
                                    for (String sSListValue : sSList) {
                                        if (sSListValue != null) {
                                            jsonWriter.value(sSListValue);
                                        } else jsonWriter.value(null);
                                        sSListIndex++;
                                    }
                                    jsonWriter.endArray();
                                }
                            }
                            if (attributeValueValue != null) {
                                java.util.List<String> nSList = attributeValueValue.getNS();
                                int nSListIndex = 0;
                                if (nSList != null && nSList.size() > 0) {
                                    jsonWriter.key("NS").array();
                                    for (String nSListValue : nSList) {
                                        if (nSListValue != null) {
                                            jsonWriter.value(nSListValue);
                                        } else jsonWriter.value(null);
                                        nSListIndex++;
                                    }
                                    jsonWriter.endArray();
                                }
                            }
                            jsonWriter.endObject();
                        }
                    }
                    if (expectedListValue.getValue().isExists() != null) {
                        jsonWriter.key("Exists").value(expectedListValue.getValue().isExists());
                    }
                    jsonWriter.endObject();
                    ++expectedEntryIndex;
                }
                jsonWriter.endObject();
            }
            if (putItemRequest.getReturnValues() != null) {
                jsonWriter.key("ReturnValues").value(putItemRequest.getReturnValues());
            }

    	    jsonWriter.endObject();

    	    String snippet = stringWriter.toString();
    	    byte[] content = snippet.getBytes("UTF-8");
        	request.setContent(new StringInputStream(snippet));
	        request.addHeader("Content-Length", Integer.toString(content.length));
            return request;
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }
}
