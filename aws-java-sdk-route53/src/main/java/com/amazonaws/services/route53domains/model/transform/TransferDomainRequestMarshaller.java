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

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * TransferDomainRequest Marshaller
 */
public class TransferDomainRequestMarshaller implements Marshaller<Request<TransferDomainRequest>, TransferDomainRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public TransferDomainRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<TransferDomainRequest> marshall(TransferDomainRequest transferDomainRequest) {

        if (transferDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TransferDomainRequest> request = new DefaultRequest<TransferDomainRequest>(transferDomainRequest, "AmazonRoute53Domains");
        request.addHeader("X-Amz-Target", "Route53Domains_v20140515.TransferDomain");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (transferDomainRequest.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(transferDomainRequest.getDomainName());
            }
            if (transferDomainRequest.getIdnLangCode() != null) {
                jsonGenerator.writeFieldName("IdnLangCode").writeValue(transferDomainRequest.getIdnLangCode());
            }
            if (transferDomainRequest.getDurationInYears() != null) {
                jsonGenerator.writeFieldName("DurationInYears").writeValue(transferDomainRequest.getDurationInYears());
            }

            com.amazonaws.internal.SdkInternalList<Nameserver> nameserversList = (com.amazonaws.internal.SdkInternalList<Nameserver>) transferDomainRequest
                    .getNameservers();
            if (!nameserversList.isEmpty() || !nameserversList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Nameservers");
                jsonGenerator.writeStartArray();
                for (Nameserver nameserversListValue : nameserversList) {
                    if (nameserversListValue != null) {

                        NameserverJsonMarshaller.getInstance().marshall(nameserversListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (transferDomainRequest.getAuthCode() != null) {
                jsonGenerator.writeFieldName("AuthCode").writeValue(transferDomainRequest.getAuthCode());
            }
            if (transferDomainRequest.getAutoRenew() != null) {
                jsonGenerator.writeFieldName("AutoRenew").writeValue(transferDomainRequest.getAutoRenew());
            }
            if (transferDomainRequest.getAdminContact() != null) {
                jsonGenerator.writeFieldName("AdminContact");
                ContactDetailJsonMarshaller.getInstance().marshall(transferDomainRequest.getAdminContact(), jsonGenerator);
            }
            if (transferDomainRequest.getRegistrantContact() != null) {
                jsonGenerator.writeFieldName("RegistrantContact");
                ContactDetailJsonMarshaller.getInstance().marshall(transferDomainRequest.getRegistrantContact(), jsonGenerator);
            }
            if (transferDomainRequest.getTechContact() != null) {
                jsonGenerator.writeFieldName("TechContact");
                ContactDetailJsonMarshaller.getInstance().marshall(transferDomainRequest.getTechContact(), jsonGenerator);
            }
            if (transferDomainRequest.getPrivacyProtectAdminContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectAdminContact").writeValue(transferDomainRequest.getPrivacyProtectAdminContact());
            }
            if (transferDomainRequest.getPrivacyProtectRegistrantContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectRegistrantContact").writeValue(transferDomainRequest.getPrivacyProtectRegistrantContact());
            }
            if (transferDomainRequest.getPrivacyProtectTechContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectTechContact").writeValue(transferDomainRequest.getPrivacyProtectTechContact());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
