/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.route53domains.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ContactDetailMarshaller
 */
public class ContactDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ContactDetail contactDetail, JSONWriter jsonWriter) {
        if (contactDetail == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (contactDetail.getFirstName() != null) {
                jsonWriter.key("FirstName").value(contactDetail.getFirstName());
            }

            if (contactDetail.getLastName() != null) {
                jsonWriter.key("LastName").value(contactDetail.getLastName());
            }

            if (contactDetail.getContactType() != null) {
                jsonWriter.key("ContactType").value(
                        contactDetail.getContactType());
            }

            if (contactDetail.getOrganizationName() != null) {
                jsonWriter.key("OrganizationName").value(
                        contactDetail.getOrganizationName());
            }

            if (contactDetail.getAddressLine1() != null) {
                jsonWriter.key("AddressLine1").value(
                        contactDetail.getAddressLine1());
            }

            if (contactDetail.getAddressLine2() != null) {
                jsonWriter.key("AddressLine2").value(
                        contactDetail.getAddressLine2());
            }

            if (contactDetail.getCity() != null) {
                jsonWriter.key("City").value(contactDetail.getCity());
            }

            if (contactDetail.getState() != null) {
                jsonWriter.key("State").value(contactDetail.getState());
            }

            if (contactDetail.getCountryCode() != null) {
                jsonWriter.key("CountryCode").value(
                        contactDetail.getCountryCode());
            }

            if (contactDetail.getZipCode() != null) {
                jsonWriter.key("ZipCode").value(contactDetail.getZipCode());
            }

            if (contactDetail.getPhoneNumber() != null) {
                jsonWriter.key("PhoneNumber").value(
                        contactDetail.getPhoneNumber());
            }

            if (contactDetail.getEmail() != null) {
                jsonWriter.key("Email").value(contactDetail.getEmail());
            }

            if (contactDetail.getFax() != null) {
                jsonWriter.key("Fax").value(contactDetail.getFax());
            }

            com.amazonaws.internal.SdkInternalList<ExtraParam> extraParamsList = (com.amazonaws.internal.SdkInternalList<ExtraParam>) contactDetail
                    .getExtraParams();
            if (!extraParamsList.isEmpty()
                    || !extraParamsList.isAutoConstruct()) {
                jsonWriter.key("ExtraParams");
                jsonWriter.array();
                for (ExtraParam extraParamsListValue : extraParamsList) {
                    if (extraParamsListValue != null) {

                        ExtraParamJsonMarshaller.getInstance().marshall(
                                extraParamsListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ContactDetailJsonMarshaller instance;

    public static ContactDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ContactDetailJsonMarshaller();
        return instance;
    }

}
