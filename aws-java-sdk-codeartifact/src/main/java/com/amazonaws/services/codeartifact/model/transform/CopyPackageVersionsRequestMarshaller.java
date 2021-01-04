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
 * CopyPackageVersionsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CopyPackageVersionsRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain-owner").build();
    private static final MarshallingInfo<String> SOURCEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("source-repository").build();
    private static final MarshallingInfo<String> DESTINATIONREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("destination-repository").build();
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
    private static final MarshallingInfo<Boolean> ALLOWOVERWRITE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowOverwrite").build();
    private static final MarshallingInfo<Boolean> INCLUDEFROMUPSTREAM_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("includeFromUpstream").build();

    private static final CopyPackageVersionsRequestMarshaller instance = new CopyPackageVersionsRequestMarshaller();

    public static CopyPackageVersionsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CopyPackageVersionsRequest copyPackageVersionsRequest, ProtocolMarshaller protocolMarshaller) {

        if (copyPackageVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(copyPackageVersionsRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getSourceRepository(), SOURCEREPOSITORY_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getDestinationRepository(), DESTINATIONREPOSITORY_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getPackage(), PACKAGE_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getVersions(), VERSIONS_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getVersionRevisions(), VERSIONREVISIONS_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getAllowOverwrite(), ALLOWOVERWRITE_BINDING);
            protocolMarshaller.marshall(copyPackageVersionsRequest.getIncludeFromUpstream(), INCLUDEFROMUPSTREAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
