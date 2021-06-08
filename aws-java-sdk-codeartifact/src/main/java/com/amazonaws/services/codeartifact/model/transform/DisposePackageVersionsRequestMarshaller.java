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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DisposePackageVersionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DisposePackageVersionsRequestMarshaller {

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
    private static final MarshallingInfo<List> VERSIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("versions").build();
    private static final MarshallingInfo<Map> VERSIONREVISIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionRevisions").build();
    private static final MarshallingInfo<String> EXPECTEDSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedStatus").build();

    private static final DisposePackageVersionsRequestMarshaller instance = new DisposePackageVersionsRequestMarshaller();

    public static DisposePackageVersionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DisposePackageVersionsRequest disposePackageVersionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (disposePackageVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(disposePackageVersionsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getRepository(), REPOSITORY_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getPackage(), PACKAGE_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getVersions(), VERSIONS_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getVersionRevisions(), VERSIONREVISIONS_BINDING);
            protocolMarshaller.marshall(disposePackageVersionsRequest.getExpectedStatus(), EXPECTEDSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
