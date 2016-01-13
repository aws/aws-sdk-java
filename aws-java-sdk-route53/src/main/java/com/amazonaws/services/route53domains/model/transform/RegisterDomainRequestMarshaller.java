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
 * RegisterDomainRequest Marshaller
 */
public class RegisterDomainRequestMarshaller implements
        Marshaller<Request<RegisterDomainRequest>, RegisterDomainRequest> {

    public Request<RegisterDomainRequest> marshall(
            RegisterDomainRequest registerDomainRequest) {

        if (registerDomainRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RegisterDomainRequest> request = new DefaultRequest<RegisterDomainRequest>(
                registerDomainRequest, "AmazonRoute53Domains");
        request.addHeader("X-Amz-Target",
                "Route53Domains_v20140515.RegisterDomain");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (registerDomainRequest.getDomainName() != null) {
                jsonWriter.key("DomainName").value(
                        registerDomainRequest.getDomainName());
            }

            if (registerDomainRequest.getIdnLangCode() != null) {
                jsonWriter.key("IdnLangCode").value(
                        registerDomainRequest.getIdnLangCode());
            }

            if (registerDomainRequest.getDurationInYears() != null) {
                jsonWriter.key("DurationInYears").value(
                        registerDomainRequest.getDurationInYears());
            }

            if (registerDomainRequest.getAutoRenew() != null) {
                jsonWriter.key("AutoRenew").value(
                        registerDomainRequest.getAutoRenew());
            }

            if (registerDomainRequest.getAdminContact() != null) {
                jsonWriter.key("AdminContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        registerDomainRequest.getAdminContact(), jsonWriter);
            }

            if (registerDomainRequest.getRegistrantContact() != null) {
                jsonWriter.key("RegistrantContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        registerDomainRequest.getRegistrantContact(),
                        jsonWriter);
            }

            if (registerDomainRequest.getTechContact() != null) {
                jsonWriter.key("TechContact");
                ContactDetailJsonMarshaller.getInstance().marshall(
                        registerDomainRequest.getTechContact(), jsonWriter);
            }

            if (registerDomainRequest.getPrivacyProtectAdminContact() != null) {
                jsonWriter.key("PrivacyProtectAdminContact").value(
                        registerDomainRequest.getPrivacyProtectAdminContact());
            }

            if (registerDomainRequest.getPrivacyProtectRegistrantContact() != null) {
                jsonWriter.key("PrivacyProtectRegistrantContact").value(
                        registerDomainRequest
                                .getPrivacyProtectRegistrantContact());
            }

            if (registerDomainRequest.getPrivacyProtectTechContact() != null) {
                jsonWriter.key("PrivacyProtectTechContact").value(
                        registerDomainRequest.getPrivacyProtectTechContact());
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
