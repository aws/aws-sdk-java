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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.dynamodb.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Query Request Marshaller
 */
public class QueryRequestMarshaller implements Marshaller<Request<QueryRequest>, QueryRequest> {

    

    public Request<QueryRequest> marshall(QueryRequest queryRequest) {
		if (queryRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<QueryRequest> request = new DefaultRequest<QueryRequest>(queryRequest, "AmazonDynamoDB");
        String target = "DynamoDB_20111205.Query";
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
        	
            if (queryRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(queryRequest.getTableName());
            }

            java.util.List<String> attributesToGetList = queryRequest.getAttributesToGet();
            if (attributesToGetList != null && attributesToGetList.size() > 0) {

                jsonWriter.key("AttributesToGet");
                jsonWriter.array();

                for (String attributesToGetListValue : attributesToGetList) {
                    if (attributesToGetListValue != null) {
                        jsonWriter.value(attributesToGetListValue);
                    }
                }
                jsonWriter.endArray();
            }
            if (queryRequest.getLimit() != null) {
                jsonWriter.key("Limit").value(queryRequest.getLimit());
            }
            if (queryRequest.isConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(queryRequest.isConsistentRead());
            }
            if (queryRequest.isCount() != null) {
                jsonWriter.key("Count").value(queryRequest.isCount());
            }
            AttributeValue hashKeyValue = queryRequest.getHashKeyValue();
            if (hashKeyValue != null) {

                jsonWriter.key("HashKeyValue");
                jsonWriter.object();

                if (hashKeyValue.getS() != null) {
                    jsonWriter.key("S").value(hashKeyValue.getS());
                }
                if (hashKeyValue.getN() != null) {
                    jsonWriter.key("N").value(hashKeyValue.getN());
                }
                if (hashKeyValue.getB() != null) {
                    jsonWriter.key("B").value(hashKeyValue.getB());
                }

                java.util.List<String> sSList = hashKeyValue.getSS();
                if (sSList != null && sSList.size() > 0) {

                    jsonWriter.key("SS");
                    jsonWriter.array();

                    for (String sSListValue : sSList) {
                        if (sSListValue != null) {
                            jsonWriter.value(sSListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                java.util.List<String> nSList = hashKeyValue.getNS();
                if (nSList != null && nSList.size() > 0) {

                    jsonWriter.key("NS");
                    jsonWriter.array();

                    for (String nSListValue : nSList) {
                        if (nSListValue != null) {
                            jsonWriter.value(nSListValue);
                        }
                    }
                    jsonWriter.endArray();
                }

                java.util.List<java.nio.ByteBuffer> bSList = hashKeyValue.getBS();
                if (bSList != null && bSList.size() > 0) {

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
            Condition rangeKeyCondition = queryRequest.getRangeKeyCondition();
            if (rangeKeyCondition != null) {

                jsonWriter.key("RangeKeyCondition");
                jsonWriter.object();


                java.util.List<AttributeValue> attributeValueListList = rangeKeyCondition.getAttributeValueList();
                if (attributeValueListList != null && attributeValueListList.size() > 0) {

                    jsonWriter.key("AttributeValueList");
                    jsonWriter.array();

                    for (AttributeValue attributeValueListListValue : attributeValueListList) {
                        if (attributeValueListListValue != null) {
                            jsonWriter.object();
                            if (attributeValueListListValue.getS() != null) {
                                jsonWriter.key("S").value(attributeValueListListValue.getS());
                            }
                            if (attributeValueListListValue.getN() != null) {
                                jsonWriter.key("N").value(attributeValueListListValue.getN());
                            }
                            if (attributeValueListListValue.getB() != null) {
                                jsonWriter.key("B").value(attributeValueListListValue.getB());
                            }

                            java.util.List<String> sSList = attributeValueListListValue.getSS();
                            if (sSList != null && sSList.size() > 0) {

                                jsonWriter.key("SS");
                                jsonWriter.array();

                                for (String sSListValue : sSList) {
                                    if (sSListValue != null) {
                                        jsonWriter.value(sSListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }

                            java.util.List<String> nSList = attributeValueListListValue.getNS();
                            if (nSList != null && nSList.size() > 0) {

                                jsonWriter.key("NS");
                                jsonWriter.array();

                                for (String nSListValue : nSList) {
                                    if (nSListValue != null) {
                                        jsonWriter.value(nSListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }

                            java.util.List<java.nio.ByteBuffer> bSList = attributeValueListListValue.getBS();
                            if (bSList != null && bSList.size() > 0) {

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
                    jsonWriter.endArray();
                }
                if (rangeKeyCondition.getComparisonOperator() != null) {
                    jsonWriter.key("ComparisonOperator").value(rangeKeyCondition.getComparisonOperator());
                }
                jsonWriter.endObject();
            }
            if (queryRequest.isScanIndexForward() != null) {
                jsonWriter.key("ScanIndexForward").value(queryRequest.isScanIndexForward());
            }
            Key exclusiveStartKey = queryRequest.getExclusiveStartKey();
            if (exclusiveStartKey != null) {

                jsonWriter.key("ExclusiveStartKey");
                jsonWriter.object();

                AttributeValue hashKeyElement = exclusiveStartKey.getHashKeyElement();
                if (hashKeyElement != null) {

                    jsonWriter.key("HashKeyElement");
                    jsonWriter.object();

                    if (hashKeyElement.getS() != null) {
                        jsonWriter.key("S").value(hashKeyElement.getS());
                    }
                    if (hashKeyElement.getN() != null) {
                        jsonWriter.key("N").value(hashKeyElement.getN());
                    }
                    if (hashKeyElement.getB() != null) {
                        jsonWriter.key("B").value(hashKeyElement.getB());
                    }

                    java.util.List<String> sSList = hashKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {

                        jsonWriter.key("SS");
                        jsonWriter.array();

                        for (String sSListValue : sSList) {
                            if (sSListValue != null) {
                                jsonWriter.value(sSListValue);
                            }
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = hashKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {

                        jsonWriter.key("NS");
                        jsonWriter.array();

                        for (String nSListValue : nSList) {
                            if (nSListValue != null) {
                                jsonWriter.value(nSListValue);
                            }
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<java.nio.ByteBuffer> bSList = hashKeyElement.getBS();
                    if (bSList != null && bSList.size() > 0) {

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
                AttributeValue rangeKeyElement = exclusiveStartKey.getRangeKeyElement();
                if (rangeKeyElement != null) {

                    jsonWriter.key("RangeKeyElement");
                    jsonWriter.object();

                    if (rangeKeyElement.getS() != null) {
                        jsonWriter.key("S").value(rangeKeyElement.getS());
                    }
                    if (rangeKeyElement.getN() != null) {
                        jsonWriter.key("N").value(rangeKeyElement.getN());
                    }
                    if (rangeKeyElement.getB() != null) {
                        jsonWriter.key("B").value(rangeKeyElement.getB());
                    }

                    java.util.List<String> sSList = rangeKeyElement.getSS();
                    if (sSList != null && sSList.size() > 0) {

                        jsonWriter.key("SS");
                        jsonWriter.array();

                        for (String sSListValue : sSList) {
                            if (sSListValue != null) {
                                jsonWriter.value(sSListValue);
                            }
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<String> nSList = rangeKeyElement.getNS();
                    if (nSList != null && nSList.size() > 0) {

                        jsonWriter.key("NS");
                        jsonWriter.array();

                        for (String nSListValue : nSList) {
                            if (nSListValue != null) {
                                jsonWriter.value(nSListValue);
                            }
                        }
                        jsonWriter.endArray();
                    }

                    java.util.List<java.nio.ByteBuffer> bSList = rangeKeyElement.getBS();
                    if (bSList != null && bSList.size() > 0) {

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

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
