/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MitigationActionParamsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MitigationActionParamsMarshaller {

    private static final MarshallingInfo<StructuredPojo> UPDATEDEVICECERTIFICATEPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateDeviceCertificateParams").build();
    private static final MarshallingInfo<StructuredPojo> UPDATECACERTIFICATEPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updateCACertificateParams").build();
    private static final MarshallingInfo<StructuredPojo> ADDTHINGSTOTHINGGROUPPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addThingsToThingGroupParams").build();
    private static final MarshallingInfo<StructuredPojo> REPLACEDEFAULTPOLICYVERSIONPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replaceDefaultPolicyVersionParams").build();
    private static final MarshallingInfo<StructuredPojo> ENABLEIOTLOGGINGPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableIoTLoggingParams").build();
    private static final MarshallingInfo<StructuredPojo> PUBLISHFINDINGTOSNSPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publishFindingToSnsParams").build();

    private static final MitigationActionParamsMarshaller instance = new MitigationActionParamsMarshaller();

    public static MitigationActionParamsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MitigationActionParams mitigationActionParams, ProtocolMarshaller protocolMarshaller) {

        if (mitigationActionParams == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mitigationActionParams.getUpdateDeviceCertificateParams(), UPDATEDEVICECERTIFICATEPARAMS_BINDING);
            protocolMarshaller.marshall(mitigationActionParams.getUpdateCACertificateParams(), UPDATECACERTIFICATEPARAMS_BINDING);
            protocolMarshaller.marshall(mitigationActionParams.getAddThingsToThingGroupParams(), ADDTHINGSTOTHINGGROUPPARAMS_BINDING);
            protocolMarshaller.marshall(mitigationActionParams.getReplaceDefaultPolicyVersionParams(), REPLACEDEFAULTPOLICYVERSIONPARAMS_BINDING);
            protocolMarshaller.marshall(mitigationActionParams.getEnableIoTLoggingParams(), ENABLEIOTLOGGINGPARAMS_BINDING);
            protocolMarshaller.marshall(mitigationActionParams.getPublishFindingToSnsParams(), PUBLISHFINDINGTOSNSPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
