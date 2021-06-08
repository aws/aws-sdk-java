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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PackageVersionDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PackageVersionDescriptionMarshaller {

    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("format").build();
    private static final MarshallingInfo<String> NAMESPACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("namespace").build();
    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("packageName").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> SUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("summary").build();
    private static final MarshallingInfo<String> HOMEPAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("homePage").build();
    private static final MarshallingInfo<String> SOURCECODEREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeRepository").build();
    private static final MarshallingInfo<java.util.Date> PUBLISHEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publishedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LICENSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("licenses").build();
    private static final MarshallingInfo<String> REVISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("revision").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final PackageVersionDescriptionMarshaller instance = new PackageVersionDescriptionMarshaller();

    public static PackageVersionDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PackageVersionDescription packageVersionDescription, ProtocolMarshaller protocolMarshaller) {

        if (packageVersionDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(packageVersionDescription.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getNamespace(), NAMESPACE_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getSummary(), SUMMARY_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getHomePage(), HOMEPAGE_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getSourceCodeRepository(), SOURCECODEREPOSITORY_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getPublishedTime(), PUBLISHEDTIME_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getLicenses(), LICENSES_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getRevision(), REVISION_BINDING);
            protocolMarshaller.marshall(packageVersionDescription.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
