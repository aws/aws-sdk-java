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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WebCrawlerConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebCrawlerConfigurationJsonUnmarshaller implements Unmarshaller<WebCrawlerConfiguration, JsonUnmarshallerContext> {

    public WebCrawlerConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        WebCrawlerConfiguration webCrawlerConfiguration = new WebCrawlerConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Urls", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setUrls(UrlsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CrawlDepth", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setCrawlDepth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxLinksPerPage", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setMaxLinksPerPage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxContentSizePerPageInMegaBytes", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setMaxContentSizePerPageInMegaBytes(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("MaxUrlsPerMinuteCrawlRate", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setMaxUrlsPerMinuteCrawlRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UrlInclusionPatterns", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setUrlInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("UrlExclusionPatterns", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setUrlExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ProxyConfiguration", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setProxyConfiguration(ProxyConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AuthenticationConfiguration", targetDepth)) {
                    context.nextToken();
                    webCrawlerConfiguration.setAuthenticationConfiguration(AuthenticationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return webCrawlerConfiguration;
    }

    private static WebCrawlerConfigurationJsonUnmarshaller instance;

    public static WebCrawlerConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebCrawlerConfigurationJsonUnmarshaller();
        return instance;
    }
}
