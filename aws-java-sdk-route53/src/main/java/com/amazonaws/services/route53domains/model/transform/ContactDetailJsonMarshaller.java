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
 * ContactDetailMarshaller
 */
public class ContactDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ContactDetail contactDetail, StructuredJsonGenerator jsonGenerator) {

        if (contactDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (contactDetail.getFirstName() != null) {
                jsonGenerator.writeFieldName("FirstName").writeValue(contactDetail.getFirstName());
            }
            if (contactDetail.getLastName() != null) {
                jsonGenerator.writeFieldName("LastName").writeValue(contactDetail.getLastName());
            }
            if (contactDetail.getContactType() != null) {
                jsonGenerator.writeFieldName("ContactType").writeValue(contactDetail.getContactType());
            }
            if (contactDetail.getOrganizationName() != null) {
                jsonGenerator.writeFieldName("OrganizationName").writeValue(contactDetail.getOrganizationName());
            }
            if (contactDetail.getAddressLine1() != null) {
                jsonGenerator.writeFieldName("AddressLine1").writeValue(contactDetail.getAddressLine1());
            }
            if (contactDetail.getAddressLine2() != null) {
                jsonGenerator.writeFieldName("AddressLine2").writeValue(contactDetail.getAddressLine2());
            }
            if (contactDetail.getCity() != null) {
                jsonGenerator.writeFieldName("City").writeValue(contactDetail.getCity());
            }
            if (contactDetail.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(contactDetail.getState());
            }
            if (contactDetail.getCountryCode() != null) {
                jsonGenerator.writeFieldName("CountryCode").writeValue(contactDetail.getCountryCode());
            }
            if (contactDetail.getZipCode() != null) {
                jsonGenerator.writeFieldName("ZipCode").writeValue(contactDetail.getZipCode());
            }
            if (contactDetail.getPhoneNumber() != null) {
                jsonGenerator.writeFieldName("PhoneNumber").writeValue(contactDetail.getPhoneNumber());
            }
            if (contactDetail.getEmail() != null) {
                jsonGenerator.writeFieldName("Email").writeValue(contactDetail.getEmail());
            }
            if (contactDetail.getFax() != null) {
                jsonGenerator.writeFieldName("Fax").writeValue(contactDetail.getFax());
            }

            com.amazonaws.internal.SdkInternalList<ExtraParam> extraParamsList = (com.amazonaws.internal.SdkInternalList<ExtraParam>) contactDetail
                    .getExtraParams();
            if (!extraParamsList.isEmpty() || !extraParamsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ExtraParams");
                jsonGenerator.writeStartArray();
                for (ExtraParam extraParamsListValue : extraParamsList) {
                    if (extraParamsListValue != null) {

                        ExtraParamJsonMarshaller.getInstance().marshall(extraParamsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContactDetailJsonMarshaller instance;

    public static ContactDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactDetailJsonMarshaller();
        return instance;
    }

}
