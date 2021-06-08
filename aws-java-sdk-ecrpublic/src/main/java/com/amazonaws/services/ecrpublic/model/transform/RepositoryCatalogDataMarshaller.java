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
package com.amazonaws.services.ecrpublic.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecrpublic.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RepositoryCatalogDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RepositoryCatalogDataMarshaller {

    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> ARCHITECTURES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("architectures").build();
    private static final MarshallingInfo<List> OPERATINGSYSTEMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("operatingSystems").build();
    private static final MarshallingInfo<String> LOGOURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("logoUrl").build();
    private static final MarshallingInfo<String> ABOUTTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("aboutText").build();
    private static final MarshallingInfo<String> USAGETEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("usageText").build();
    private static final MarshallingInfo<Boolean> MARKETPLACECERTIFIED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("marketplaceCertified").build();

    private static final RepositoryCatalogDataMarshaller instance = new RepositoryCatalogDataMarshaller();

    public static RepositoryCatalogDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RepositoryCatalogData repositoryCatalogData, ProtocolMarshaller protocolMarshaller) {

        if (repositoryCatalogData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(repositoryCatalogData.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getArchitectures(), ARCHITECTURES_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getOperatingSystems(), OPERATINGSYSTEMS_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getLogoUrl(), LOGOURL_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getAboutText(), ABOUTTEXT_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getUsageText(), USAGETEXT_BINDING);
            protocolMarshaller.marshall(repositoryCatalogData.getMarketplaceCertified(), MARKETPLACECERTIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
