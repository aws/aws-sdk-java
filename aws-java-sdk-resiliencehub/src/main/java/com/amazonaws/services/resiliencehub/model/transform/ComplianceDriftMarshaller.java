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
package com.amazonaws.services.resiliencehub.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.resiliencehub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComplianceDriftMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComplianceDriftMarshaller {

    private static final MarshallingInfo<String> ACTUALREFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actualReferenceId").build();
    private static final MarshallingInfo<Map> ACTUALVALUE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("actualValue").build();
    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> APPVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appVersion").build();
    private static final MarshallingInfo<String> DIFFTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("diffType").build();
    private static final MarshallingInfo<String> DRIFTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("driftType").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityId").build();
    private static final MarshallingInfo<String> ENTITYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("entityType").build();
    private static final MarshallingInfo<String> EXPECTEDREFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedReferenceId").build();
    private static final MarshallingInfo<Map> EXPECTEDVALUE_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("expectedValue").build();

    private static final ComplianceDriftMarshaller instance = new ComplianceDriftMarshaller();

    public static ComplianceDriftMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ComplianceDrift complianceDrift, ProtocolMarshaller protocolMarshaller) {

        if (complianceDrift == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(complianceDrift.getActualReferenceId(), ACTUALREFERENCEID_BINDING);
            protocolMarshaller.marshall(complianceDrift.getActualValue(), ACTUALVALUE_BINDING);
            protocolMarshaller.marshall(complianceDrift.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(complianceDrift.getAppVersion(), APPVERSION_BINDING);
            protocolMarshaller.marshall(complianceDrift.getDiffType(), DIFFTYPE_BINDING);
            protocolMarshaller.marshall(complianceDrift.getDriftType(), DRIFTTYPE_BINDING);
            protocolMarshaller.marshall(complianceDrift.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(complianceDrift.getEntityType(), ENTITYTYPE_BINDING);
            protocolMarshaller.marshall(complianceDrift.getExpectedReferenceId(), EXPECTEDREFERENCEID_BINDING);
            protocolMarshaller.marshall(complianceDrift.getExpectedValue(), EXPECTEDVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
