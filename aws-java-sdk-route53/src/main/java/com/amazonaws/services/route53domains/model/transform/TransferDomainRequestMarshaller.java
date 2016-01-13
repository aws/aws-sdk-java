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
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * TransferDomainRequest Marshaller
 */
public class TransferDomainRequestMarshaller implements
        Marshaller<Request<TransferDomainRequest>, TransferDomainRequest> {

    public Request<TransferDomainRequest> marshall(
            TransferDomainRequest transferDomainRequest) {

        if (transferDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<TransferDomainRequest> request = new DefaultRequest<TransferDomainRequest>(
                transferDomainRequest, "AmazonRoute53Domains");
        request.addHeader("X-Amz-Target",
                "Route53Domains_v20140515.TransferDomain");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (transferDomainRequest.getDomainName() != null) {
                jsonWriter.key("DomainName").value(
                        transferDomainRequest.getDomainName());
            }

            if (transferDomainRequest.getIdnLangCode() != null) {
                jsonWriter.key("IdnLangCode").value(
                        transferDomainRequest.getIdnLangCode());
            }

            if (transferDomainRequest.getDurationInYears() != null) {
                jsonWriter.key("DurationInYears").value(
                        transferDomainRequest.getDurationInYears());
            }

            com.amazonaws.internal.SdkInternalList<Nameserver> nameserversList = (com.amazonaws.internal.SdkInternalList<Nameserver>) transferDomainRequest
                    .getNameservers();
            if (!nameserversList.isEmpty()
                    || !nameserversList.isAutoConstruct()) {
                jsonWriter.key("Nameservers");
                jsonWriter.array();
                for (Nameserver nameserversListValue : nameserversList) {
                    if (nameserversListValue != null) {

                        NameserverJsonMarshaller.getInstance().marshall(
                                nameserversListValue, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            if (transferDomainRequest.getAuthCode() != null) {
                jsonWriter.key("AuthCode").value(
                        transferDomainRequest.getAuthCode());
            }

            if (transferDomainRequest.getAutoRenew() != null) {
                jsonWriter.key("AutoRenew").value(
                        transferDomainRequest.getAutoRenew());
            }

            if (transferDomainRequest.getAdminContact() != null) {
                jsonWriter.key("AdminContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        transferDomainRequest.getAdminContact(), jsonWriter);
            }

            if (transferDomainRequest.getRegistrantContact() != null) {
                jsonWriter.key("RegistrantContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        transferDomainRequest.getRegistrantContact(),
                        jsonWriter);
            }

            if (transferDomainRequest.getTechContact() != null) {
                jsonWriter.key("TechContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        transferDomainRequest.getTechContact(), jsonWriter);
            }

            if (transferDomainRequest.getPrivacyProtectAdminContact() != null) {
                jsonWriter.key("PrivacyProtectAdminContact").value(
                        transferDomainRequest.getPrivacyProtectAdminContact());
            }

            if (transferDomainRequest.getPrivacyProtectRegistrantContact() != null) {
                jsonWriter.key("PrivacyProtectRegistrantContact").value(
                        transferDomainRequest
                                .getPrivacyProtectRegistrantContact());
            }

            if (transferDomainRequest.getPrivacyProtectTechContact() != null) {
                jsonWriter.key("PrivacyProtectTechContact").value(
                        transferDomainRequest.getPrivacyProtectTechContact());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
