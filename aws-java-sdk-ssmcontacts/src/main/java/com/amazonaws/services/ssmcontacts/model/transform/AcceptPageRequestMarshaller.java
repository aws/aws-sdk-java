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
package com.amazonaws.services.ssmcontacts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmcontacts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AcceptPageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AcceptPageRequestMarshaller {

    private static final MarshallingInfo<String> PAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PageId").build();
    private static final MarshallingInfo<String> CONTACTCHANNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactChannelId").build();
    private static final MarshallingInfo<String> ACCEPTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptType").build();
    private static final MarshallingInfo<String> NOTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Note").build();
    private static final MarshallingInfo<String> ACCEPTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AcceptCode").build();

    private static final AcceptPageRequestMarshaller instance = new AcceptPageRequestMarshaller();

    public static AcceptPageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AcceptPageRequest acceptPageRequest, ProtocolMarshaller protocolMarshaller) {

        if (acceptPageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(acceptPageRequest.getPageId(), PAGEID_BINDING);
            protocolMarshaller.marshall(acceptPageRequest.getContactChannelId(), CONTACTCHANNELID_BINDING);
            protocolMarshaller.marshall(acceptPageRequest.getAcceptType(), ACCEPTTYPE_BINDING);
            protocolMarshaller.marshall(acceptPageRequest.getNote(), NOTE_BINDING);
            protocolMarshaller.marshall(acceptPageRequest.getAcceptCode(), ACCEPTCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
