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
 * Create Table Request Marshaller
 */
public class CreateTableRequestMarshaller implements Marshaller<Request<CreateTableRequest>, CreateTableRequest> {

    public Request<CreateTableRequest> marshall(CreateTableRequest createTableRequest) {
		if (createTableRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateTableRequest> request = new DefaultRequest<CreateTableRequest>(createTableRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20111205.CreateTable";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (createTableRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(createTableRequest.getTableName());
            }
            KeySchema keySchema = createTableRequest.getKeySchema();
            if (keySchema != null) {
                jsonWriter.key("KeySchema").object();
                KeySchemaElement hashKeyElement = keySchema.getHashKeyElement();
                if (hashKeyElement != null) {
                    jsonWriter.key("HashKeyElement").object();
                    if (hashKeyElement.getAttributeName() != null) {
                        jsonWriter.key("AttributeName").value(hashKeyElement.getAttributeName());
                    }
                    if (hashKeyElement.getAttributeType() != null) {
                        jsonWriter.key("AttributeType").value(hashKeyElement.getAttributeType());
                    }
                    jsonWriter.endObject();
                }
                KeySchemaElement rangeKeyElement = keySchema.getRangeKeyElement();
                if (rangeKeyElement != null) {
                    jsonWriter.key("RangeKeyElement").object();
                    if (rangeKeyElement.getAttributeName() != null) {
                        jsonWriter.key("AttributeName").value(rangeKeyElement.getAttributeName());
                    }
                    if (rangeKeyElement.getAttributeType() != null) {
                        jsonWriter.key("AttributeType").value(rangeKeyElement.getAttributeType());
                    }
                    jsonWriter.endObject();
                }
                jsonWriter.endObject();
            }
            ProvisionedThroughput provisionedThroughput = createTableRequest.getProvisionedThroughput();
            if (provisionedThroughput != null) {
                jsonWriter.key("ProvisionedThroughput").object();
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
            return request;
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }
}
