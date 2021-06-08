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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GeneralNameMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeneralNameMarshaller {

    private static final MarshallingInfo<StructuredPojo> OTHERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OtherName").build();
    private static final MarshallingInfo<String> RFC822NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Rfc822Name").build();
    private static final MarshallingInfo<String> DNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsName").build();
    private static final MarshallingInfo<StructuredPojo> DIRECTORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryName").build();
    private static final MarshallingInfo<StructuredPojo> EDIPARTYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EdiPartyName").build();
    private static final MarshallingInfo<String> UNIFORMRESOURCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UniformResourceIdentifier").build();
    private static final MarshallingInfo<String> IPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IpAddress").build();
    private static final MarshallingInfo<String> REGISTEREDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredId").build();

    private static final GeneralNameMarshaller instance = new GeneralNameMarshaller();

    public static GeneralNameMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeneralName generalName, ProtocolMarshaller protocolMarshaller) {

        if (generalName == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generalName.getOtherName(), OTHERNAME_BINDING);
            protocolMarshaller.marshall(generalName.getRfc822Name(), RFC822NAME_BINDING);
            protocolMarshaller.marshall(generalName.getDnsName(), DNSNAME_BINDING);
            protocolMarshaller.marshall(generalName.getDirectoryName(), DIRECTORYNAME_BINDING);
            protocolMarshaller.marshall(generalName.getEdiPartyName(), EDIPARTYNAME_BINDING);
            protocolMarshaller.marshall(generalName.getUniformResourceIdentifier(), UNIFORMRESOURCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(generalName.getIpAddress(), IPADDRESS_BINDING);
            protocolMarshaller.marshall(generalName.getRegisteredId(), REGISTEREDID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
