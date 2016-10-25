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
package com.amazonaws.services.snowball.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AddressMarshaller
 */
public class AddressJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Address address, StructuredJsonGenerator jsonGenerator) {

        if (address == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (address.getAddressId() != null) {
                jsonGenerator.writeFieldName("AddressId").writeValue(address.getAddressId());
            }
            if (address.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(address.getName());
            }
            if (address.getCompany() != null) {
                jsonGenerator.writeFieldName("Company").writeValue(address.getCompany());
            }
            if (address.getStreet1() != null) {
                jsonGenerator.writeFieldName("Street1").writeValue(address.getStreet1());
            }
            if (address.getStreet2() != null) {
                jsonGenerator.writeFieldName("Street2").writeValue(address.getStreet2());
            }
            if (address.getStreet3() != null) {
                jsonGenerator.writeFieldName("Street3").writeValue(address.getStreet3());
            }
            if (address.getCity() != null) {
                jsonGenerator.writeFieldName("City").writeValue(address.getCity());
            }
            if (address.getStateOrProvince() != null) {
                jsonGenerator.writeFieldName("StateOrProvince").writeValue(address.getStateOrProvince());
            }
            if (address.getPrefectureOrDistrict() != null) {
                jsonGenerator.writeFieldName("PrefectureOrDistrict").writeValue(address.getPrefectureOrDistrict());
            }
            if (address.getLandmark() != null) {
                jsonGenerator.writeFieldName("Landmark").writeValue(address.getLandmark());
            }
            if (address.getCountry() != null) {
                jsonGenerator.writeFieldName("Country").writeValue(address.getCountry());
            }
            if (address.getPostalCode() != null) {
                jsonGenerator.writeFieldName("PostalCode").writeValue(address.getPostalCode());
            }
            if (address.getPhoneNumber() != null) {
                jsonGenerator.writeFieldName("PhoneNumber").writeValue(address.getPhoneNumber());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AddressJsonMarshaller instance;

    public static AddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonMarshaller();
        return instance;
    }

}
