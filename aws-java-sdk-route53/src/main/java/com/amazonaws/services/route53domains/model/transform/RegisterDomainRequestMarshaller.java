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
 * RegisterDomainRequest Marshaller
 */
public class RegisterDomainRequestMarshaller implements Marshaller<Request<RegisterDomainRequest>, RegisterDomainRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public RegisterDomainRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterDomainRequest> marshall(RegisterDomainRequest registerDomainRequest) {

        if (registerDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterDomainRequest> request = new DefaultRequest<RegisterDomainRequest>(registerDomainRequest, "AmazonRoute53Domains");
        request.addHeader("X-Amz-Target", "Route53Domains_v20140515.RegisterDomain");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (registerDomainRequest.getDomainName() != null) {
                jsonGenerator.writeFieldName("DomainName").writeValue(registerDomainRequest.getDomainName());
            }
            if (registerDomainRequest.getIdnLangCode() != null) {
                jsonGenerator.writeFieldName("IdnLangCode").writeValue(registerDomainRequest.getIdnLangCode());
            }
            if (registerDomainRequest.getDurationInYears() != null) {
                jsonGenerator.writeFieldName("DurationInYears").writeValue(registerDomainRequest.getDurationInYears());
            }
            if (registerDomainRequest.getAutoRenew() != null) {
                jsonGenerator.writeFieldName("AutoRenew").writeValue(registerDomainRequest.getAutoRenew());
            }
            if (registerDomainRequest.getAdminContact() != null) {
                jsonGenerator.writeFieldName("AdminContact");
                ContactDetailJsonMarshaller.getInstance().marshall(registerDomainRequest.getAdminContact(), jsonGenerator);
            }
            if (registerDomainRequest.getRegistrantContact() != null) {
                jsonGenerator.writeFieldName("RegistrantContact");
                ContactDetailJsonMarshaller.getInstance().marshall(registerDomainRequest.getRegistrantContact(), jsonGenerator);
            }
            if (registerDomainRequest.getTechContact() != null) {
                jsonGenerator.writeFieldName("TechContact");
                ContactDetailJsonMarshaller.getInstance().marshall(registerDomainRequest.getTechContact(), jsonGenerator);
            }
            if (registerDomainRequest.getPrivacyProtectAdminContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectAdminContact").writeValue(registerDomainRequest.getPrivacyProtectAdminContact());
            }
            if (registerDomainRequest.getPrivacyProtectRegistrantContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectRegistrantContact").writeValue(registerDomainRequest.getPrivacyProtectRegistrantContact());
            }
            if (registerDomainRequest.getPrivacyProtectTechContact() != null) {
                jsonGenerator.writeFieldName("PrivacyProtectTechContact").writeValue(registerDomainRequest.getPrivacyProtectTechContact());
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
