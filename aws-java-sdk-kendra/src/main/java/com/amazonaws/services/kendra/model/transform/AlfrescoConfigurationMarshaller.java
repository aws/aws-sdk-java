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
package com.amazonaws.services.kendra.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kendra.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AlfrescoConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AlfrescoConfigurationMarshaller {

    private static final MarshallingInfo<String> SITEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SiteUrl").build();
    private static final MarshallingInfo<String> SITEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SiteId").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<StructuredPojo> SSLCERTIFICATES3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCertificateS3Path").build();
    private static final MarshallingInfo<Boolean> CRAWLSYSTEMFOLDERS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlSystemFolders").build();
    private static final MarshallingInfo<Boolean> CRAWLCOMMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlComments").build();
    private static final MarshallingInfo<List> ENTITYFILTER_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("EntityFilter").build();
    private static final MarshallingInfo<List> DOCUMENTLIBRARYFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentLibraryFieldMappings").build();
    private static final MarshallingInfo<List> BLOGFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlogFieldMappings").build();
    private static final MarshallingInfo<List> WIKIFIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WikiFieldMappings").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();

    private static final AlfrescoConfigurationMarshaller instance = new AlfrescoConfigurationMarshaller();

    public static AlfrescoConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AlfrescoConfiguration alfrescoConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (alfrescoConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(alfrescoConfiguration.getSiteUrl(), SITEURL_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getSiteId(), SITEID_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getSslCertificateS3Path(), SSLCERTIFICATES3PATH_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getCrawlSystemFolders(), CRAWLSYSTEMFOLDERS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getCrawlComments(), CRAWLCOMMENTS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getEntityFilter(), ENTITYFILTER_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getDocumentLibraryFieldMappings(), DOCUMENTLIBRARYFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getBlogFieldMappings(), BLOGFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getWikiFieldMappings(), WIKIFIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(alfrescoConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
