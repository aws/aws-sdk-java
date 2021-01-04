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
import com.amazonaws.util.StringUtils;

import com.amazonaws.util.XMLWriter;

/**
 * UpdateCachePolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCachePolicyRequestMarshaller implements Marshaller<Request<UpdateCachePolicyRequest>, UpdateCachePolicyRequest> {

    public Request<UpdateCachePolicyRequest> marshall(UpdateCachePolicyRequest updateCachePolicyRequest) {

        if (updateCachePolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCachePolicyRequest> request = new DefaultRequest<UpdateCachePolicyRequest>(updateCachePolicyRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.PUT);

        if (updateCachePolicyRequest.getIfMatch() != null) {
            request.addHeader("If-Match", StringUtils.fromString(updateCachePolicyRequest.getIfMatch()));
        }

        String uriResourcePath = "/2020-05-31/cache-policy/{Id}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "Id", updateCachePolicyRequest.getId());
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2020-05-31/");

            CachePolicyConfig cachePolicyConfig = updateCachePolicyRequest.getCachePolicyConfig();
            if (cachePolicyConfig != null) {
                xmlWriter.startElement("CachePolicyConfig");

                if (cachePolicyConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(cachePolicyConfig.getComment()).endElement();
                }

                if (cachePolicyConfig.getName() != null) {
                    xmlWriter.startElement("Name").value(cachePolicyConfig.getName()).endElement();
                }

                if (cachePolicyConfig.getDefaultTTL() != null) {
                    xmlWriter.startElement("DefaultTTL").value(cachePolicyConfig.getDefaultTTL()).endElement();
                }

                if (cachePolicyConfig.getMaxTTL() != null) {
                    xmlWriter.startElement("MaxTTL").value(cachePolicyConfig.getMaxTTL()).endElement();
                }

                if (cachePolicyConfig.getMinTTL() != null) {
                    xmlWriter.startElement("MinTTL").value(cachePolicyConfig.getMinTTL()).endElement();
                }

                {
                    ParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin = cachePolicyConfig
                            .getParametersInCacheKeyAndForwardedToOrigin();
                    if (parametersInCacheKeyAndForwardedToOrigin != null) {
                        xmlWriter.startElement("ParametersInCacheKeyAndForwardedToOrigin");

                        if (parametersInCacheKeyAndForwardedToOrigin.getEnableAcceptEncodingGzip() != null) {
                            xmlWriter.startElement("EnableAcceptEncodingGzip").value(parametersInCacheKeyAndForwardedToOrigin.getEnableAcceptEncodingGzip())
                                    .endElement();
                        }

                        if (parametersInCacheKeyAndForwardedToOrigin.getEnableAcceptEncodingBrotli() != null) {
                            xmlWriter.startElement("EnableAcceptEncodingBrotli")
                                    .value(parametersInCacheKeyAndForwardedToOrigin.getEnableAcceptEncodingBrotli()).endElement();
                        }

                        {
                            CachePolicyHeadersConfig headersConfig = parametersInCacheKeyAndForwardedToOrigin.getHeadersConfig();
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
                            CachePolicyCookiesConfig cookiesConfig = parametersInCacheKeyAndForwardedToOrigin.getCookiesConfig();
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
                            CachePolicyQueryStringsConfig queryStringsConfig = parametersInCacheKeyAndForwardedToOrigin.getQueryStringsConfig();
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
