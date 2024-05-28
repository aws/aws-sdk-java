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
 * PackageGroupOriginRestrictionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PackageGroupOriginRestrictionMarshaller {

    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<String> EFFECTIVEMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("effectiveMode").build();
    private static final MarshallingInfo<StructuredPojo> INHERITEDFROM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inheritedFrom").build();
    private static final MarshallingInfo<Long> REPOSITORIESCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repositoriesCount").build();

    private static final PackageGroupOriginRestrictionMarshaller instance = new PackageGroupOriginRestrictionMarshaller();

    public static PackageGroupOriginRestrictionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PackageGroupOriginRestriction packageGroupOriginRestriction, ProtocolMarshaller protocolMarshaller) {

        if (packageGroupOriginRestriction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(packageGroupOriginRestriction.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(packageGroupOriginRestriction.getEffectiveMode(), EFFECTIVEMODE_BINDING);
            protocolMarshaller.marshall(packageGroupOriginRestriction.getInheritedFrom(), INHERITEDFROM_BINDING);
            protocolMarshaller.marshall(packageGroupOriginRestriction.getRepositoriesCount(), REPOSITORIESCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
