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
package com.amazonaws.services.transfer.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transfer.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribedSecurityPolicyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribedSecurityPolicyMarshaller {

    private static final MarshallingInfo<Boolean> FIPS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Fips").build();
    private static final MarshallingInfo<String> SECURITYPOLICYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityPolicyName").build();
    private static final MarshallingInfo<List> SSHCIPHERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SshCiphers").build();
    private static final MarshallingInfo<List> SSHKEXS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SshKexs").build();
    private static final MarshallingInfo<List> SSHMACS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SshMacs").build();
    private static final MarshallingInfo<List> TLSCIPHERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TlsCiphers").build();

    private static final DescribedSecurityPolicyMarshaller instance = new DescribedSecurityPolicyMarshaller();

    public static DescribedSecurityPolicyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribedSecurityPolicy describedSecurityPolicy, ProtocolMarshaller protocolMarshaller) {

        if (describedSecurityPolicy == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describedSecurityPolicy.getFips(), FIPS_BINDING);
            protocolMarshaller.marshall(describedSecurityPolicy.getSecurityPolicyName(), SECURITYPOLICYNAME_BINDING);
            protocolMarshaller.marshall(describedSecurityPolicy.getSshCiphers(), SSHCIPHERS_BINDING);
            protocolMarshaller.marshall(describedSecurityPolicy.getSshKexs(), SSHKEXS_BINDING);
            protocolMarshaller.marshall(describedSecurityPolicy.getSshMacs(), SSHMACS_BINDING);
            protocolMarshaller.marshall(describedSecurityPolicy.getTlsCiphers(), TLSCIPHERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
