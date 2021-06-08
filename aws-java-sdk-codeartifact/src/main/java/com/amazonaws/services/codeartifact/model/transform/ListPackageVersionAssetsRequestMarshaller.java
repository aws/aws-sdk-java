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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListPackageVersionAssetsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListPackageVersionAssetsRequestMarshaller {

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
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("max-results").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();

    private static final ListPackageVersionAssetsRequestMarshaller instance = new ListPackageVersionAssetsRequestMarshaller();

    public static ListPackageVersionAssetsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListPackageVersionAssetsRequest listPackageVersionAssetsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listPackageVersionAssetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getPackage(), PACKAGE_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getPackageVersion(), PACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listPackageVersionAssetsRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
