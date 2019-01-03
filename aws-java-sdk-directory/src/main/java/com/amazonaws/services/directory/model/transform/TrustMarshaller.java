/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TrustMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TrustMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> TRUSTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrustId").build();
    private static final MarshallingInfo<String> REMOTEDOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoteDomainName").build();
    private static final MarshallingInfo<String> TRUSTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("TrustType").build();
    private static final MarshallingInfo<String> TRUSTDIRECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustDirection").build();
    private static final MarshallingInfo<String> TRUSTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustState").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STATELASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateLastUpdatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TRUSTSTATEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustStateReason").build();
    private static final MarshallingInfo<String> SELECTIVEAUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectiveAuth").build();

    private static final TrustMarshaller instance = new TrustMarshaller();

    public static TrustMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Trust trust, ProtocolMarshaller protocolMarshaller) {

        if (trust == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(trust.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(trust.getTrustId(), TRUSTID_BINDING);
            protocolMarshaller.marshall(trust.getRemoteDomainName(), REMOTEDOMAINNAME_BINDING);
            protocolMarshaller.marshall(trust.getTrustType(), TRUSTTYPE_BINDING);
            protocolMarshaller.marshall(trust.getTrustDirection(), TRUSTDIRECTION_BINDING);
            protocolMarshaller.marshall(trust.getTrustState(), TRUSTSTATE_BINDING);
            protocolMarshaller.marshall(trust.getCreatedDateTime(), CREATEDDATETIME_BINDING);
            protocolMarshaller.marshall(trust.getLastUpdatedDateTime(), LASTUPDATEDDATETIME_BINDING);
            protocolMarshaller.marshall(trust.getStateLastUpdatedDateTime(), STATELASTUPDATEDDATETIME_BINDING);
            protocolMarshaller.marshall(trust.getTrustStateReason(), TRUSTSTATEREASON_BINDING);
            protocolMarshaller.marshall(trust.getSelectiveAuth(), SELECTIVEAUTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
