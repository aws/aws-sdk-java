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

package com.amazonaws.services.dynamodbv2.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * AttributeValueMarshaller
 */
public class AttributeValueJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(AttributeValue attributeValue, JSONWriter jsonWriter) {
        if (attributeValue == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (attributeValue.getS() != null) {
                jsonWriter.key("S").value(attributeValue.getS());
            }

            if (attributeValue.getN() != null) {
                jsonWriter.key("N").value(attributeValue.getN());
            }

            if (attributeValue.getB() != null) {
                jsonWriter.key("B").value(attributeValue.getB());
            }

            java.util.List<String> sSList = attributeValue.getSS();
            if (sSList != null) {
                jsonWriter.key("SS");
                jsonWriter.array();
                for (String sSListValue : sSList) {
                    if (sSListValue != null) {
                        jsonWriter.value(sSListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<String> nSList = attributeValue.getNS();
            if (nSList != null) {
                jsonWriter.key("NS");
                jsonWriter.array();
                for (String nSListValue : nSList) {
                    if (nSListValue != null) {
                        jsonWriter.value(nSListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.List<java.nio.ByteBuffer> bSList = attributeValue.getBS();
            if (bSList != null) {
                jsonWriter.key("BS");
                jsonWriter.array();
                for (java.nio.ByteBuffer bSListValue : bSList) {
                    if (bSListValue != null) {
                        jsonWriter.value(bSListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.Map<String, AttributeValue> mMap = attributeValue.getM();
            if (mMap != null) {
                jsonWriter.key("M");
                jsonWriter.object();

                for (Map.Entry<String, AttributeValue> mMapValue : mMap
                        .entrySet()) {
                    if (mMapValue.getValue() != null) {
                        jsonWriter.key(mMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                mMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            java.util.List<AttributeValue> lList = attributeValue.getL();
            if (lList != null) {
                jsonWriter.key("L");
                jsonWriter.array();
                for (AttributeValue lListValue : lList) {
                    if (lListValue != null) {

                        AttributeValueJsonMarshaller.getInstance().marshall(
                                lListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (attributeValue.getNULL() != null) {
                jsonWriter.key("NULL").value(attributeValue.getNULL());
            }

            if (attributeValue.getBOOL() != null) {
                jsonWriter.key("BOOL").value(attributeValue.getBOOL());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttributeValueJsonMarshaller instance;

    public static AttributeValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueJsonMarshaller();
        return instance;
    }

}
