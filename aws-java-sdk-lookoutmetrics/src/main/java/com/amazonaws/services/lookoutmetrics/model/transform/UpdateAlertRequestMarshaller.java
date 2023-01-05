/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutmetrics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAlertRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAlertRequestMarshaller {

    private static final MarshallingInfo<String> ALERTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AlertArn").build();
    private static final MarshallingInfo<String> ALERTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertDescription").build();
    private static final MarshallingInfo<Integer> ALERTSENSITIVITYTHRESHOLD_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertSensitivityThreshold").build();
    private static final MarshallingInfo<StructuredPojo> ACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Action").build();
    private static final MarshallingInfo<StructuredPojo> ALERTFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AlertFilters").build();

    private static final UpdateAlertRequestMarshaller instance = new UpdateAlertRequestMarshaller();

    public static UpdateAlertRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAlertRequest updateAlertRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAlertRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAlertRequest.getAlertArn(), ALERTARN_BINDING);
            protocolMarshaller.marshall(updateAlertRequest.getAlertDescription(), ALERTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAlertRequest.getAlertSensitivityThreshold(), ALERTSENSITIVITYTHRESHOLD_BINDING);
            protocolMarshaller.marshall(updateAlertRequest.getAction(), ACTION_BINDING);
            protocolMarshaller.marshall(updateAlertRequest.getAlertFilters(), ALERTFILTERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
