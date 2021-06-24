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
 * SharePointConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SharePointConfigurationMarshaller {

    private static final MarshallingInfo<String> SHAREPOINTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharePointVersion").build();
    private static final MarshallingInfo<List> URLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Urls").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<Boolean> CRAWLATTACHMENTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlAttachments").build();
    private static final MarshallingInfo<Boolean> USECHANGELOG_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UseChangeLog").build();
    private static final MarshallingInfo<List> INCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InclusionPatterns").build();
    private static final MarshallingInfo<List> EXCLUSIONPATTERNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExclusionPatterns").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcConfiguration").build();
    private static final MarshallingInfo<List> FIELDMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FieldMappings").build();
    private static final MarshallingInfo<String> DOCUMENTTITLEFIELDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentTitleFieldName").build();
    private static final MarshallingInfo<Boolean> DISABLELOCALGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableLocalGroups").build();
    private static final MarshallingInfo<StructuredPojo> SSLCERTIFICATES3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SslCertificateS3Path").build();

    private static final SharePointConfigurationMarshaller instance = new SharePointConfigurationMarshaller();

    public static SharePointConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SharePointConfiguration sharePointConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (sharePointConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sharePointConfiguration.getSharePointVersion(), SHAREPOINTVERSION_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getUrls(), URLS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getCrawlAttachments(), CRAWLATTACHMENTS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getUseChangeLog(), USECHANGELOG_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getInclusionPatterns(), INCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getExclusionPatterns(), EXCLUSIONPATTERNS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getFieldMappings(), FIELDMAPPINGS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getDocumentTitleFieldName(), DOCUMENTTITLEFIELDNAME_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getDisableLocalGroups(), DISABLELOCALGROUPS_BINDING);
            protocolMarshaller.marshall(sharePointConfiguration.getSslCertificateS3Path(), SSLCERTIFICATES3PATH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
