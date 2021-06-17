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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * WebCrawlerConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WebCrawlerConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> URLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Urls").build();
    private static final MarshallingInfo<Integer> CRAWLDEPTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlDepth").build();
    private static final MarshallingInfo<Integer> MAXLINKSPERPAGE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxLinksPerPage").build();
    private static final MarshallingInfo<Float> MAXCONTENTSIZEPERPAGEINMEGABYTES_BINDING = MarshallingInfo.builder(MarshallingType.FLOAT)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxContentSizePerPageInMegaBytes").build();
    private static final MarshallingInfo<Integer> MAXURLSPERMINUTECRAWLRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxUrlsPerMinuteCrawlRate").build();
    private static final MarshallingInfo<List> URLINCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UrlInclusionPatterns").build();
    private static final MarshallingInfo<List> URLEXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UrlExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> PROXYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProxyConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> AUTHENTICATIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationConfiguration").build();

    private static final WebCrawlerConfigurationMarshaller instance = new WebCrawlerConfigurationMarshaller();

    public static WebCrawlerConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WebCrawlerConfiguration webCrawlerConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (webCrawlerConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(webCrawlerConfiguration.getUrls(), URLS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getCrawlDepth(), CRAWLDEPTH_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getMaxLinksPerPage(), MAXLINKSPERPAGE_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getMaxContentSizePerPageInMegaBytes(), MAXCONTENTSIZEPERPAGEINMEGABYTES_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getMaxUrlsPerMinuteCrawlRate(), MAXURLSPERMINUTECRAWLRATE_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getUrlInclusionPatterns(), URLINCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getUrlExclusionPatterns(), URLEXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getProxyConfiguration(), PROXYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(webCrawlerConfiguration.getAuthenticationConfiguration(), AUTHENTICATIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
