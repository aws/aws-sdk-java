/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringInputStream;

import com.amazonaws.util.XMLWriter;

/**
 * CreateResponseHeadersPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResponseHeadersPolicyRequestMarshaller implements
        Marshaller<Request<CreateResponseHeadersPolicyRequest>, CreateResponseHeadersPolicyRequest> {

    public Request<CreateResponseHeadersPolicyRequest> marshall(CreateResponseHeadersPolicyRequest createResponseHeadersPolicyRequest) {

        if (createResponseHeadersPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateResponseHeadersPolicyRequest> request = new DefaultRequest<CreateResponseHeadersPolicyRequest>(createResponseHeadersPolicyRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2020-05-31/response-headers-policy";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            ResponseHeadersPolicyConfig responseHeadersPolicyConfig = createResponseHeadersPolicyRequest.getResponseHeadersPolicyConfig();
            if (responseHeadersPolicyConfig != null) {
                xmlWriter.startElement("ResponseHeadersPolicyConfig");

                if (responseHeadersPolicyConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(responseHeadersPolicyConfig.getComment()).endElement();
                }

                if (responseHeadersPolicyConfig.getName() != null) {
                    xmlWriter.startElement("Name").value(responseHeadersPolicyConfig.getName()).endElement();
                }

                {
                    ResponseHeadersPolicyCorsConfig corsConfig = responseHeadersPolicyConfig.getCorsConfig();
                    if (corsConfig != null) {
                        xmlWriter.startElement("CorsConfig");

                        {
                            ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins = corsConfig.getAccessControlAllowOrigins();
                            if (accessControlAllowOrigins != null) {
                                xmlWriter.startElement("AccessControlAllowOrigins");

                                if (accessControlAllowOrigins.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(accessControlAllowOrigins.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> responseHeadersPolicyAccessControlAllowOriginsItemsList = (com.amazonaws.internal.SdkInternalList<String>) accessControlAllowOrigins
                                        .getItems();
                                if (!responseHeadersPolicyAccessControlAllowOriginsItemsList.isEmpty()
                                        || !responseHeadersPolicyAccessControlAllowOriginsItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String responseHeadersPolicyAccessControlAllowOriginsItemsListValue : responseHeadersPolicyAccessControlAllowOriginsItemsList) {
                                        xmlWriter.startElement("Origin");
                                        xmlWriter.value(responseHeadersPolicyAccessControlAllowOriginsItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders = corsConfig.getAccessControlAllowHeaders();
                            if (accessControlAllowHeaders != null) {
                                xmlWriter.startElement("AccessControlAllowHeaders");

                                if (accessControlAllowHeaders.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(accessControlAllowHeaders.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> responseHeadersPolicyAccessControlAllowHeadersItemsList = (com.amazonaws.internal.SdkInternalList<String>) accessControlAllowHeaders
                                        .getItems();
                                if (!responseHeadersPolicyAccessControlAllowHeadersItemsList.isEmpty()
                                        || !responseHeadersPolicyAccessControlAllowHeadersItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String responseHeadersPolicyAccessControlAllowHeadersItemsListValue : responseHeadersPolicyAccessControlAllowHeadersItemsList) {
                                        xmlWriter.startElement("Header");
                                        xmlWriter.value(responseHeadersPolicyAccessControlAllowHeadersItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods = corsConfig.getAccessControlAllowMethods();
                            if (accessControlAllowMethods != null) {
                                xmlWriter.startElement("AccessControlAllowMethods");

                                if (accessControlAllowMethods.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(accessControlAllowMethods.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> responseHeadersPolicyAccessControlAllowMethodsItemsList = (com.amazonaws.internal.SdkInternalList<String>) accessControlAllowMethods
                                        .getItems();
                                if (!responseHeadersPolicyAccessControlAllowMethodsItemsList.isEmpty()
                                        || !responseHeadersPolicyAccessControlAllowMethodsItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String responseHeadersPolicyAccessControlAllowMethodsItemsListValue : responseHeadersPolicyAccessControlAllowMethodsItemsList) {
                                        xmlWriter.startElement("Method");
                                        xmlWriter.value(responseHeadersPolicyAccessControlAllowMethodsItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (corsConfig.getAccessControlAllowCredentials() != null) {
                            xmlWriter.startElement("AccessControlAllowCredentials").value(corsConfig.getAccessControlAllowCredentials()).endElement();
                        }

                        {
                            ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders = corsConfig.getAccessControlExposeHeaders();
                            if (accessControlExposeHeaders != null) {
                                xmlWriter.startElement("AccessControlExposeHeaders");

                                if (accessControlExposeHeaders.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(accessControlExposeHeaders.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> responseHeadersPolicyAccessControlExposeHeadersItemsList = (com.amazonaws.internal.SdkInternalList<String>) accessControlExposeHeaders
                                        .getItems();
                                if (!responseHeadersPolicyAccessControlExposeHeadersItemsList.isEmpty()
                                        || !responseHeadersPolicyAccessControlExposeHeadersItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String responseHeadersPolicyAccessControlExposeHeadersItemsListValue : responseHeadersPolicyAccessControlExposeHeadersItemsList) {
                                        xmlWriter.startElement("Header");
                                        xmlWriter.value(responseHeadersPolicyAccessControlExposeHeadersItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        if (corsConfig.getAccessControlMaxAgeSec() != null) {
                            xmlWriter.startElement("AccessControlMaxAgeSec").value(corsConfig.getAccessControlMaxAgeSec()).endElement();
                        }

                        if (corsConfig.getOriginOverride() != null) {
                            xmlWriter.startElement("OriginOverride").value(corsConfig.getOriginOverride()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig = responseHeadersPolicyConfig.getSecurityHeadersConfig();
                    if (securityHeadersConfig != null) {
                        xmlWriter.startElement("SecurityHeadersConfig");

                        {
                            ResponseHeadersPolicyXSSProtection xSSProtection = securityHeadersConfig.getXSSProtection();
                            if (xSSProtection != null) {
                                xmlWriter.startElement("XSSProtection");

                                if (xSSProtection.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(xSSProtection.getOverride()).endElement();
                                }

                                if (xSSProtection.getProtection() != null) {
                                    xmlWriter.startElement("Protection").value(xSSProtection.getProtection()).endElement();
                                }

                                if (xSSProtection.getModeBlock() != null) {
                                    xmlWriter.startElement("ModeBlock").value(xSSProtection.getModeBlock()).endElement();
                                }

                                if (xSSProtection.getReportUri() != null) {
                                    xmlWriter.startElement("ReportUri").value(xSSProtection.getReportUri()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyFrameOptions frameOptions = securityHeadersConfig.getFrameOptions();
                            if (frameOptions != null) {
                                xmlWriter.startElement("FrameOptions");

                                if (frameOptions.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(frameOptions.getOverride()).endElement();
                                }

                                if (frameOptions.getFrameOption() != null) {
                                    xmlWriter.startElement("FrameOption").value(frameOptions.getFrameOption()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyReferrerPolicy referrerPolicy = securityHeadersConfig.getReferrerPolicy();
                            if (referrerPolicy != null) {
                                xmlWriter.startElement("ReferrerPolicy");

                                if (referrerPolicy.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(referrerPolicy.getOverride()).endElement();
                                }

                                if (referrerPolicy.getReferrerPolicy() != null) {
                                    xmlWriter.startElement("ReferrerPolicy").value(referrerPolicy.getReferrerPolicy()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy = securityHeadersConfig.getContentSecurityPolicy();
                            if (contentSecurityPolicy != null) {
                                xmlWriter.startElement("ContentSecurityPolicy");

                                if (contentSecurityPolicy.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(contentSecurityPolicy.getOverride()).endElement();
                                }

                                if (contentSecurityPolicy.getContentSecurityPolicy() != null) {
                                    xmlWriter.startElement("ContentSecurityPolicy").value(contentSecurityPolicy.getContentSecurityPolicy()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyContentTypeOptions contentTypeOptions = securityHeadersConfig.getContentTypeOptions();
                            if (contentTypeOptions != null) {
                                xmlWriter.startElement("ContentTypeOptions");

                                if (contentTypeOptions.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(contentTypeOptions.getOverride()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }

                        {
                            ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity = securityHeadersConfig.getStrictTransportSecurity();
                            if (strictTransportSecurity != null) {
                                xmlWriter.startElement("StrictTransportSecurity");

                                if (strictTransportSecurity.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(strictTransportSecurity.getOverride()).endElement();
                                }

                                if (strictTransportSecurity.getIncludeSubdomains() != null) {
                                    xmlWriter.startElement("IncludeSubdomains").value(strictTransportSecurity.getIncludeSubdomains()).endElement();
                                }

                                if (strictTransportSecurity.getPreload() != null) {
                                    xmlWriter.startElement("Preload").value(strictTransportSecurity.getPreload()).endElement();
                                }

                                if (strictTransportSecurity.getAccessControlMaxAgeSec() != null) {
                                    xmlWriter.startElement("AccessControlMaxAgeSec").value(strictTransportSecurity.getAccessControlMaxAgeSec()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    ResponseHeadersPolicyServerTimingHeadersConfig serverTimingHeadersConfig = responseHeadersPolicyConfig.getServerTimingHeadersConfig();
                    if (serverTimingHeadersConfig != null) {
                        xmlWriter.startElement("ServerTimingHeadersConfig");

                        if (serverTimingHeadersConfig.getEnabled() != null) {
                            xmlWriter.startElement("Enabled").value(serverTimingHeadersConfig.getEnabled()).endElement();
                        }

                        if (serverTimingHeadersConfig.getSamplingRate() != null) {
                            xmlWriter.startElement("SamplingRate").value(serverTimingHeadersConfig.getSamplingRate()).endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig = responseHeadersPolicyConfig.getCustomHeadersConfig();
                    if (customHeadersConfig != null) {
                        xmlWriter.startElement("CustomHeadersConfig");

                        if (customHeadersConfig.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(customHeadersConfig.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicyCustomHeader> responseHeadersPolicyCustomHeadersConfigItemsList = (com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicyCustomHeader>) customHeadersConfig
                                .getItems();
                        if (!responseHeadersPolicyCustomHeadersConfigItemsList.isEmpty()
                                || !responseHeadersPolicyCustomHeadersConfigItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (ResponseHeadersPolicyCustomHeader responseHeadersPolicyCustomHeadersConfigItemsListValue : responseHeadersPolicyCustomHeadersConfigItemsList) {
                                xmlWriter.startElement("ResponseHeadersPolicyCustomHeader");

                                if (responseHeadersPolicyCustomHeadersConfigItemsListValue.getHeader() != null) {
                                    xmlWriter.startElement("Header").value(responseHeadersPolicyCustomHeadersConfigItemsListValue.getHeader()).endElement();
                                }

                                if (responseHeadersPolicyCustomHeadersConfigItemsListValue.getValue() != null) {
                                    xmlWriter.startElement("Value").value(responseHeadersPolicyCustomHeadersConfigItemsListValue.getValue()).endElement();
                                }

                                if (responseHeadersPolicyCustomHeadersConfigItemsListValue.getOverride() != null) {
                                    xmlWriter.startElement("Override").value(responseHeadersPolicyCustomHeadersConfigItemsListValue.getOverride()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    ResponseHeadersPolicyRemoveHeadersConfig removeHeadersConfig = responseHeadersPolicyConfig.getRemoveHeadersConfig();
                    if (removeHeadersConfig != null) {
                        xmlWriter.startElement("RemoveHeadersConfig");

                        if (removeHeadersConfig.getQuantity() != null) {
                            xmlWriter.startElement("Quantity").value(removeHeadersConfig.getQuantity()).endElement();
                        }

                        com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicyRemoveHeader> responseHeadersPolicyRemoveHeadersConfigItemsList = (com.amazonaws.internal.SdkInternalList<ResponseHeadersPolicyRemoveHeader>) removeHeadersConfig
                                .getItems();
                        if (!responseHeadersPolicyRemoveHeadersConfigItemsList.isEmpty()
                                || !responseHeadersPolicyRemoveHeadersConfigItemsList.isAutoConstruct()) {
                            xmlWriter.startElement("Items");

                            for (ResponseHeadersPolicyRemoveHeader responseHeadersPolicyRemoveHeadersConfigItemsListValue : responseHeadersPolicyRemoveHeadersConfigItemsList) {
                                xmlWriter.startElement("ResponseHeadersPolicyRemoveHeader");

                                if (responseHeadersPolicyRemoveHeadersConfigItemsListValue.getHeader() != null) {
                                    xmlWriter.startElement("Header").value(responseHeadersPolicyRemoveHeadersConfigItemsListValue.getHeader()).endElement();
                                }
                                xmlWriter.endElement();
                            }
                            xmlWriter.endElement();
                        }
                        xmlWriter.endElement();
                    }
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
            request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
