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
        request.setHttpMethod(POST);

        try {
        	StringWriter stringWriter = new StringWriter();
        	JSONWriter jsonWriter = new JSONWriter(stringWriter);
        	jsonWriter.object();
	        
            if (queryRequest.getTableName() != null) {
                jsonWriter.key("TableName").value(queryRequest.getTableName());
            }
            if (queryRequest != null) {
                java.util.List<String> attributesToGetList = queryRequest.getAttributesToGet();
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
            if (queryRequest.getLimit() != null) {
                jsonWriter.key("Limit").value(queryRequest.getLimit());
            }
            if (queryRequest.isConsistentRead() != null) {
                jsonWriter.key("ConsistentRead").value(queryRequest.isConsistentRead());
            }
            if (queryRequest.isCount() != null) {
                jsonWriter.key("Count").value(queryRequest.isCount());
            }
            if (queryRequest != null) {
                AttributeValue attributeValueHashKeyValue = queryRequest.getHashKeyValue();
                if (attributeValueHashKeyValue != null) {
                    jsonWriter.key("HashKeyValue").object();
                    if (attributeValueHashKeyValue.getS() != null) {
                        jsonWriter.key("S").value(attributeValueHashKeyValue.getS());
                    }
                    if (attributeValueHashKeyValue.getN() != null) {
                        jsonWriter.key("N").value(attributeValueHashKeyValue.getN());
                    }
                    if (attributeValueHashKeyValue != null) {
                        java.util.List<String> sSList = attributeValueHashKeyValue.getSS();
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
                    if (attributeValueHashKeyValue != null) {
                        java.util.List<String> nSList = attributeValueHashKeyValue.getNS();
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
            if (queryRequest != null) {
                Condition conditionRangeKeyCondition = queryRequest.getRangeKeyCondition();
                if (conditionRangeKeyCondition != null) {
                    jsonWriter.key("RangeKeyCondition").object();

                    if (conditionRangeKeyCondition != null) {
                        java.util.List<AttributeValue> attributeValueListList = conditionRangeKeyCondition.getAttributeValueList();
                        if (attributeValueListList != null && attributeValueListList.size() > 0) {
                            int attributeValueListListIndex = 1;
                            jsonWriter.key("AttributeValueList").array();
                            for (AttributeValue attributeValueListListValue : attributeValueListList) {



                                jsonWriter.object();
                                if (attributeValueListListValue.getS() != null) {
                                    jsonWriter.key("S").value(attributeValueListListValue.getS());
                                }
                                if (attributeValueListListValue.getN() != null) {
                                    jsonWriter.key("N").value(attributeValueListListValue.getN());
                                }
                                if (attributeValueListListValue != null) {
                                    java.util.List<String> sSList = attributeValueListListValue.getSS();
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
                                if (attributeValueListListValue != null) {
                                    java.util.List<String> nSList = attributeValueListListValue.getNS();
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

                                attributeValueListListIndex++;
                            }
                            jsonWriter.endArray();
                        }
                    }
                    if (conditionRangeKeyCondition.getComparisonOperator() != null) {
                        jsonWriter.key("ComparisonOperator").value(conditionRangeKeyCondition.getComparisonOperator());
                    }
                    jsonWriter.endObject();
                }
            }
            if (queryRequest.isScanIndexForward() != null) {
                jsonWriter.key("ScanIndexForward").value(queryRequest.isScanIndexForward());
            }
            if (queryRequest != null) {
                Key keyExclusiveStartKey = queryRequest.getExclusiveStartKey();
                if (keyExclusiveStartKey != null) {
                    jsonWriter.key("ExclusiveStartKey").object();
                    if (keyExclusiveStartKey != null) {
                        AttributeValue attributeValueHashKeyElement = keyExclusiveStartKey.getHashKeyElement();
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
                    if (keyExclusiveStartKey != null) {
                        AttributeValue attributeValueRangeKeyElement = keyExclusiveStartKey.getRangeKeyElement();
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
