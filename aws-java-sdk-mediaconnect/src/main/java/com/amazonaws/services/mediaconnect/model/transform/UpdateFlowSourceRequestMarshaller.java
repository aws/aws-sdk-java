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
package com.amazonaws.services.mediaconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconnect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFlowSourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFlowSourceRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DECRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decryption").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ENTITLEMENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entitlementArn").build();
    private static final MarshallingInfo<String> FLOWARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("flowArn").build();
    private static final MarshallingInfo<Integer> INGESTPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ingestPort").build();
    private static final MarshallingInfo<Integer> MAXBITRATE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxBitrate").build();
    private static final MarshallingInfo<Integer> MAXLATENCY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxLatency").build();
    private static final MarshallingInfo<String> PROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("protocol").build();
    private static final MarshallingInfo<String> SOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("sourceArn").build();
    private static final MarshallingInfo<String> STREAMID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("streamId").build();
    private static final MarshallingInfo<String> WHITELISTCIDR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("whitelistCidr").build();

    private static final UpdateFlowSourceRequestMarshaller instance = new UpdateFlowSourceRequestMarshaller();

    public static UpdateFlowSourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFlowSourceRequest updateFlowSourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFlowSourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFlowSourceRequest.getDecryption(), DECRYPTION_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getEntitlementArn(), ENTITLEMENTARN_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getFlowArn(), FLOWARN_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getIngestPort(), INGESTPORT_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getMaxBitrate(), MAXBITRATE_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getMaxLatency(), MAXLATENCY_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getProtocol(), PROTOCOL_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getSourceArn(), SOURCEARN_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getStreamId(), STREAMID_BINDING);
            protocolMarshaller.marshall(updateFlowSourceRequest.getWhitelistCidr(), WHITELISTCIDR_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
