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
            Key key = getItemRequest.getKey();
            if (key != null) {
                jsonWriter.key("Key").object();
                AttributeValue hashKeyElement = key.getHashKeyElement();
                if (hashKeyElement != null) {
                    jsonWriter.key("HashKeyElement").object();
                    if (hashKeyElement.getS() != null) {
                        jsonWriter.key("S").value(hashKeyElement.getS());
                    }
                    if (hashKeyElement.getN() != null) {
                        jsonWriter.key("N").value(hashKeyElement.getN());
                    }

                    java.util.List<String> sSList = hashKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {
                        jsonWriter.key("SS").array();
                        for (String sSListValue : sSList) {
                            jsonWriter.value(sSListValue);
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = hashKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {
                        jsonWriter.key("NS").array();
                        for (String nSListValue : nSList) {
                            jsonWriter.value(nSListValue);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                AttributeValue rangeKeyElement = key.getRangeKeyElement();
                if (rangeKeyElement != null) {
                    jsonWriter.key("RangeKeyElement").object();
                    if (rangeKeyElement.getS() != null) {
                        jsonWriter.key("S").value(rangeKeyElement.getS());
                    }
                    if (rangeKeyElement.getN() != null) {
                        jsonWriter.key("N").value(rangeKeyElement.getN());
                    }

                    java.util.List<String> sSList = rangeKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {
                        jsonWriter.key("SS").array();
                        for (String sSListValue : sSList) {
                            jsonWriter.value(sSListValue);
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = rangeKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {
                        jsonWriter.key("NS").array();
                        for (String nSListValue : nSList) {
                            jsonWriter.value(nSListValue);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }

            java.util.List<String> attributesToGetList = getItemRequest.getAttributesToGet();
            if (attributesToGetList != null && attributesToGetList.size() > 0) {
                jsonWriter.key("AttributesToGet").array();
                for (String attributesToGetListValue : attributesToGetList) {
                    jsonWriter.value(attributesToGetListValue);
                }
                jsonWriter.endArray();
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
