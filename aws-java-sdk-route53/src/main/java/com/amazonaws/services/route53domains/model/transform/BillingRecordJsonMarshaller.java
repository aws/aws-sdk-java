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
package com.amazonaws.services.route53domains.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * BillingRecordMarshaller
 */
public class BillingRecordJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(BillingRecord billingRecord, StructuredJsonGenerator jsonGenerator) {

        if (billingRecord == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (billingRecord.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(billingRecord.getDomainName());
            }
            if (billingRecord.getOperation() != null) {
                jsonGenerator.writeFieldName("Operation").writeValue(billingRecord.getOperation());
            }
            if (billingRecord.getInvoiceId() != null) {
                jsonGenerator.writeFieldName("InvoiceId").writeValue(billingRecord.getInvoiceId());
            }
            if (billingRecord.getBillDate() != null) {
                jsonGenerator.writeFieldName("BillDate").writeValue(billingRecord.getBillDate());
            }
            if (billingRecord.getPrice() != null) {
                jsonGenerator.writeFieldName("Price").writeValue(billingRecord.getPrice());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static BillingRecordJsonMarshaller instance;

    public static BillingRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BillingRecordJsonMarshaller();
        return instance;
    }

}
