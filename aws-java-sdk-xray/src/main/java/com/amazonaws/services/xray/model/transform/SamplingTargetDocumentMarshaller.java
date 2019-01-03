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
package com.amazonaws.services.xray.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.xray.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SamplingTargetDocumentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SamplingTargetDocumentMarshaller {

    private static final MarshallingInfo<String> RULENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RuleName").build();
    private static final MarshallingInfo<Double> FIXEDRATE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FixedRate").build();
    private static final MarshallingInfo<Integer> RESERVOIRQUOTA_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservoirQuota").build();
    private static final MarshallingInfo<java.util.Date> RESERVOIRQUOTATTL_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReservoirQuotaTTL").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> INTERVAL_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Interval").build();

    private static final SamplingTargetDocumentMarshaller instance = new SamplingTargetDocumentMarshaller();

    public static SamplingTargetDocumentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SamplingTargetDocument samplingTargetDocument, ProtocolMarshaller protocolMarshaller) {

        if (samplingTargetDocument == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(samplingTargetDocument.getRuleName(), RULENAME_BINDING);
            protocolMarshaller.marshall(samplingTargetDocument.getFixedRate(), FIXEDRATE_BINDING);
            protocolMarshaller.marshall(samplingTargetDocument.getReservoirQuota(), RESERVOIRQUOTA_BINDING);
            protocolMarshaller.marshall(samplingTargetDocument.getReservoirQuotaTTL(), RESERVOIRQUOTATTL_BINDING);
            protocolMarshaller.marshall(samplingTargetDocument.getInterval(), INTERVAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
