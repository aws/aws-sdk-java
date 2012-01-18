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
 * Get Item Request Marshaller
 */
public class GetItemRequestMarshaller implements Marshaller<Request<GetItemRequest>, GetItemRequest> {

    public Request<GetItemRequest> marshall(GetItemRequest getItemRequest) {
		if (getItemRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<GetItemRequest> request = new DefaultRequest<GetItemRequest>(getItemRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20111205.GetItem";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (getItemRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(getItemRequest.getTableName());
            }
            if (getItemRequest != null) {
                Key keyKey = getItemRequest.getKey();
                if (keyKey != null) {
                    jsonWriter.key("Key").object();
                    if (keyKey != null) {
                        AttributeValue attributeValueHashKeyElement = keyKey.getHashKeyElement();
                        if (attributeValueHashKeyElement != null) {
                            jsonWriter.key("HashKeyElement").object();
                            if (attributeValueHashKeyElement.getS() != null) {
                                jsonWriter.key("S").value(attributeValueHashKeyElement.getS());
                            }
                            if (attributeValueHashKeyElement.getN() != null) {
                                jsonWriter.key("N").value(attributeValueHashKeyElement.getN());
                            }
                            if (attributeValueHashKeyElement != null) {
                                java.util.List<String> sSList = attributeValueHashKeyElement.getSS();
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
                            if (attributeValueHashKeyElement != null) {
                                java.util.List<String> nSList = attributeValueHashKeyElement.getNS();
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
                    if (keyKey != null) {
                        AttributeValue attributeValueRangeKeyElement = keyKey.getRangeKeyElement();
                        if (attributeValueRangeKeyElement != null) {
                            jsonWriter.key("RangeKeyElement").object();
                            if (attributeValueRangeKeyElement.getS() != null) {
                                jsonWriter.key("S").value(attributeValueRangeKeyElement.getS());
                            }
                            if (attributeValueRangeKeyElement.getN() != null) {
                                jsonWriter.key("N").value(attributeValueRangeKeyElement.getN());
                            }
                            if (attributeValueRangeKeyElement != null) {
                                java.util.List<String> sSList = attributeValueRangeKeyElement.getSS();
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
                            if (attributeValueRangeKeyElement != null) {
                                java.util.List<String> nSList = attributeValueRangeKeyElement.getNS();
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
                    jsonWriter.endObject();
                }
            }
            if (getItemRequest != null) {
                java.util.List<String> attributesToGetList = getItemRequest.getAttributesToGet();
                int attributesToGetListIndex = 0;
                if (attributesToGetList != null && attributesToGetList.size() > 0) {
                    jsonWriter.key("AttributesToGet").array();
                    for (String attributesToGetListValue : attributesToGetList) {
                        if (attributesToGetListValue != null) {
                            jsonWriter.value(attributesToGetListValue);
                        } else jsonWriter.value(null);
                        attributesToGetListIndex++;
                    }
                    jsonWriter.endArray();
                }
            }
            if (getItemRequest.isConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(getItemRequest.isConsistentRead());
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
