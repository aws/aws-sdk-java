/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PublishPackageVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PublishPackageVersionRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain-owner").build();
    private static final MarshallingInfo<String> REPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("repository").build();
    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("format").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("namespace").build();
    private static final MarshallingInfo<String> PACKAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("package").build();
    private static final MarshallingInfo<String> PACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("version").build();
    private static final MarshallingInfo<java.io.InputStream> ASSETCONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STREAM)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<String> ASSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("asset").build();
    private static final MarshallingInfo<String> ASSETSHA256_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-content-sha256").build();
    private static final MarshallingInfo<Boolean> UNFINISHED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("unfinished").build();

    private static final PublishPackageVersionRequestMarshaller instance = new PublishPackageVersionRequestMarshaller();

    public static PublishPackageVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PublishPackageVersionRequest publishPackageVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (publishPackageVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(publishPackageVersionRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getPackage(), PACKAGE_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getPackageVersion(), PACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getAssetContent(), ASSETCONTENT_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getAssetName(), ASSETNAME_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getAssetSHA256(), ASSETSHA256_BINDING);
            protocolMarshaller.marshall(publishPackageVersionRequest.getUnfinished(), UNFINISHED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
