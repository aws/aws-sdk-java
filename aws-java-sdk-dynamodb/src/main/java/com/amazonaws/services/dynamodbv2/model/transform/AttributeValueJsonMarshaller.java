/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AttributeValueMarshaller
 */
public class AttributeValueJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AttributeValue attributeValue, StructuredJsonGenerator jsonGenerator) {

        if (attributeValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (attributeValue.getS() != null) {
                jsonGenerator.writeFieldName("S").writeValue(attributeValue.getS());
            }
            if (attributeValue.getN() != null) {
                jsonGenerator.writeFieldName("N").writeValue(attributeValue.getN());
            }
            if (attributeValue.getB() != null) {
                jsonGenerator.writeFieldName("B").writeValue(attributeValue.getB());
            }

            java.util.List<String> sSList = attributeValue.getSS();
            if (sSList != null) {
                jsonGenerator.writeFieldName("SS");
                jsonGenerator.writeStartArray();
                for (String sSListValue : sSList) {
                    if (sSListValue != null) {
                        jsonGenerator.writeValue(sSListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<String> nSList = attributeValue.getNS();
            if (nSList != null) {
                jsonGenerator.writeFieldName("NS");
                jsonGenerator.writeStartArray();
                for (String nSListValue : nSList) {
                    if (nSListValue != null) {
                        jsonGenerator.writeValue(nSListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<java.nio.ByteBuffer> bSList = attributeValue.getBS();
            if (bSList != null) {
                jsonGenerator.writeFieldName("BS");
                jsonGenerator.writeStartArray();
                for (java.nio.ByteBuffer bSListValue : bSList) {
                    if (bSListValue != null) {
                        jsonGenerator.writeValue(bSListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.Map<String, AttributeValue> mMap = attributeValue.getM();
            if (mMap != null) {
                jsonGenerator.writeFieldName("M");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, AttributeValue> mMapValue : mMap.entrySet()) {
                    if (mMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(mMapValue.getKey());

                        AttributeValueJsonMarshaller.getInstance().marshall(mMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.List<AttributeValue> lList = attributeValue.getL();
            if (lList != null) {
                jsonGenerator.writeFieldName("L");
                jsonGenerator.writeStartArray();
                for (AttributeValue lListValue : lList) {
                    if (lListValue != null) {

                        AttributeValueJsonMarshaller.getInstance().marshall(lListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (attributeValue.getNULL() != null) {
                jsonGenerator.writeFieldName("NULL").writeValue(attributeValue.getNULL());
            }
            if (attributeValue.getBOOL() != null) {
                jsonGenerator.writeFieldName("BOOL").writeValue(attributeValue.getBOOL());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AttributeValueJsonMarshaller instance;

    public static AttributeValueJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttributeValueJsonMarshaller();
        return instance;
    }

}
