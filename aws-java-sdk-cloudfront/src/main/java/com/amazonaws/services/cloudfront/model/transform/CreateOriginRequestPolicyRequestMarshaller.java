/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateOriginRequestPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOriginRequestPolicyRequestMarshaller implements Marshaller<Request<CreateOriginRequestPolicyRequest>, CreateOriginRequestPolicyRequest> {

    public Request<CreateOriginRequestPolicyRequest> marshall(CreateOriginRequestPolicyRequest createOriginRequestPolicyRequest) {

        if (createOriginRequestPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateOriginRequestPolicyRequest> request = new DefaultRequest<CreateOriginRequestPolicyRequest>(createOriginRequestPolicyRequest,
                "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2020-05-31/origin-request-policy";

        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            OriginRequestPolicyConfig originRequestPolicyConfig = createOriginRequestPolicyRequest.getOriginRequestPolicyConfig();
            if (originRequestPolicyConfig != null) {
                xmlWriter.startElement("OriginRequestPolicyConfig");

                if (originRequestPolicyConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(originRequestPolicyConfig.getComment()).endElement();
                }

                if (originRequestPolicyConfig.getName() != null) {
                    xmlWriter.startElement("Name").value(originRequestPolicyConfig.getName()).endElement();
                }

                {
                    OriginRequestPolicyHeadersConfig headersConfig = originRequestPolicyConfig.getHeadersConfig();
                    if (headersConfig != null) {
                        xmlWriter.startElement("HeadersConfig");

                        if (headersConfig.getHeaderBehavior() != null) {
                            xmlWriter.startElement("HeaderBehavior").value(headersConfig.getHeaderBehavior()).endElement();
                        }

                        {
                            Headers headers = headersConfig.getHeaders();
                            if (headers != null) {
                                xmlWriter.startElement("Headers");

                                if (headers.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(headers.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> headersItemsList = (com.amazonaws.internal.SdkInternalList<String>) headers
                                        .getItems();
                                if (!headersItemsList.isEmpty() || !headersItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String headersItemsListValue : headersItemsList) {
                                        xmlWriter.startElement("Name");
                                        xmlWriter.value(headersItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    OriginRequestPolicyCookiesConfig cookiesConfig = originRequestPolicyConfig.getCookiesConfig();
                    if (cookiesConfig != null) {
                        xmlWriter.startElement("CookiesConfig");

                        if (cookiesConfig.getCookieBehavior() != null) {
                            xmlWriter.startElement("CookieBehavior").value(cookiesConfig.getCookieBehavior()).endElement();
                        }

                        {
                            CookieNames cookies = cookiesConfig.getCookies();
                            if (cookies != null) {
                                xmlWriter.startElement("Cookies");

                                if (cookies.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(cookies.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> cookieNamesItemsList = (com.amazonaws.internal.SdkInternalList<String>) cookies
                                        .getItems();
                                if (!cookieNamesItemsList.isEmpty() || !cookieNamesItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String cookieNamesItemsListValue : cookieNamesItemsList) {
                                        xmlWriter.startElement("Name");
                                        xmlWriter.value(cookieNamesItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
                        }
                        xmlWriter.endElement();
                    }
                }

                {
                    OriginRequestPolicyQueryStringsConfig queryStringsConfig = originRequestPolicyConfig.getQueryStringsConfig();
                    if (queryStringsConfig != null) {
                        xmlWriter.startElement("QueryStringsConfig");

                        if (queryStringsConfig.getQueryStringBehavior() != null) {
                            xmlWriter.startElement("QueryStringBehavior").value(queryStringsConfig.getQueryStringBehavior()).endElement();
                        }

                        {
                            QueryStringNames queryStrings = queryStringsConfig.getQueryStrings();
                            if (queryStrings != null) {
                                xmlWriter.startElement("QueryStrings");

                                if (queryStrings.getQuantity() != null) {
                                    xmlWriter.startElement("Quantity").value(queryStrings.getQuantity()).endElement();
                                }

                                com.amazonaws.internal.SdkInternalList<String> queryStringNamesItemsList = (com.amazonaws.internal.SdkInternalList<String>) queryStrings
                                        .getItems();
                                if (!queryStringNamesItemsList.isEmpty() || !queryStringNamesItemsList.isAutoConstruct()) {
                                    xmlWriter.startElement("Items");

                                    for (String queryStringNamesItemsListValue : queryStringNamesItemsList) {
                                        xmlWriter.startElement("Name");
                                        xmlWriter.value(queryStringNamesItemsListValue);
                                        xmlWriter.endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                                xmlWriter.endElement();
                            }
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
