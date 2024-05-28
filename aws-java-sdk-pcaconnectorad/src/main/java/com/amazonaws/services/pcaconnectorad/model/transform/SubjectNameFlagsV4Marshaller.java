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
package com.amazonaws.services.pcaconnectorad.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SubjectNameFlagsV4Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SubjectNameFlagsV4Marshaller {

    private static final MarshallingInfo<Boolean> REQUIRECOMMONNAME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireCommonName").build();
    private static final MarshallingInfo<Boolean> REQUIREDIRECTORYPATH_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireDirectoryPath").build();
    private static final MarshallingInfo<Boolean> REQUIREDNSASCN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireDnsAsCn").build();
    private static final MarshallingInfo<Boolean> REQUIREEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequireEmail").build();
    private static final MarshallingInfo<Boolean> SANREQUIREDIRECTORYGUID_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireDirectoryGuid").build();
    private static final MarshallingInfo<Boolean> SANREQUIREDNS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireDns").build();
    private static final MarshallingInfo<Boolean> SANREQUIREDOMAINDNS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireDomainDns").build();
    private static final MarshallingInfo<Boolean> SANREQUIREEMAIL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireEmail").build();
    private static final MarshallingInfo<Boolean> SANREQUIRESPN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireSpn").build();
    private static final MarshallingInfo<Boolean> SANREQUIREUPN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SanRequireUpn").build();

    private static final SubjectNameFlagsV4Marshaller instance = new SubjectNameFlagsV4Marshaller();

    public static SubjectNameFlagsV4Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SubjectNameFlagsV4 subjectNameFlagsV4, ProtocolMarshaller protocolMarshaller) {

        if (subjectNameFlagsV4 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(subjectNameFlagsV4.getRequireCommonName(), REQUIRECOMMONNAME_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getRequireDirectoryPath(), REQUIREDIRECTORYPATH_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getRequireDnsAsCn(), REQUIREDNSASCN_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getRequireEmail(), REQUIREEMAIL_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireDirectoryGuid(), SANREQUIREDIRECTORYGUID_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireDns(), SANREQUIREDNS_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireDomainDns(), SANREQUIREDOMAINDNS_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireEmail(), SANREQUIREEMAIL_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireSpn(), SANREQUIRESPN_BINDING);
            protocolMarshaller.marshall(subjectNameFlagsV4.getSanRequireUpn(), SANREQUIREUPN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
