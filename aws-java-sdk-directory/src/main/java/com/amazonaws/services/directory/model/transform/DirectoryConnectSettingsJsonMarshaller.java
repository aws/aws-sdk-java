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

package com.amazonaws.services.directory.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * DirectoryConnectSettingsMarshaller
 */
public class DirectoryConnectSettingsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(DirectoryConnectSettings directoryConnectSettings,
            JSONWriter jsonWriter) {
        if (directoryConnectSettings == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (directoryConnectSettings.getVpcId() != null) {
                jsonWriter.key("VpcId").value(
                        directoryConnectSettings.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettings
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonWriter.key("SubnetIds");
                jsonWriter.array();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonWriter.value(subnetIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> customerDnsIpsList = (com.amazonaws.internal.SdkInternalList<String>) directoryConnectSettings
                    .getCustomerDnsIps();
            if (!customerDnsIpsList.isEmpty()
                    || !customerDnsIpsList.isAutoConstruct()) {
                jsonWriter.key("CustomerDnsIps");
                jsonWriter.array();
                for (String customerDnsIpsListValue : customerDnsIpsList) {
                    if (customerDnsIpsListValue != null) {
                        jsonWriter.value(customerDnsIpsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (directoryConnectSettings.getCustomerUserName() != null) {
                jsonWriter.key("CustomerUserName").value(
                        directoryConnectSettings.getCustomerUserName());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DirectoryConnectSettingsJsonMarshaller instance;

    public static DirectoryConnectSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectoryConnectSettingsJsonMarshaller();
        return instance;
    }

}
