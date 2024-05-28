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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetworkAclEntrySetMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetworkAclEntrySetMarshaller {

    private static final MarshallingInfo<List> FIRSTENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstEntries").build();
    private static final MarshallingInfo<Boolean> FORCEREMEDIATEFORFIRSTENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceRemediateForFirstEntries").build();
    private static final MarshallingInfo<List> LASTENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastEntries").build();
    private static final MarshallingInfo<Boolean> FORCEREMEDIATEFORLASTENTRIES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ForceRemediateForLastEntries").build();

    private static final NetworkAclEntrySetMarshaller instance = new NetworkAclEntrySetMarshaller();

    public static NetworkAclEntrySetMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetworkAclEntrySet networkAclEntrySet, ProtocolMarshaller protocolMarshaller) {

        if (networkAclEntrySet == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(networkAclEntrySet.getFirstEntries(), FIRSTENTRIES_BINDING);
            protocolMarshaller.marshall(networkAclEntrySet.getForceRemediateForFirstEntries(), FORCEREMEDIATEFORFIRSTENTRIES_BINDING);
            protocolMarshaller.marshall(networkAclEntrySet.getLastEntries(), LASTENTRIES_BINDING);
            protocolMarshaller.marshall(networkAclEntrySet.getForceRemediateForLastEntries(), FORCEREMEDIATEFORLASTENTRIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
