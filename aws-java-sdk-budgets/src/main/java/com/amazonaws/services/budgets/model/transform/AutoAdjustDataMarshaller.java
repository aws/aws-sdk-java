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
package com.amazonaws.services.budgets.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AutoAdjustDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AutoAdjustDataMarshaller {

    private static final MarshallingInfo<String> AUTOADJUSTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoAdjustType").build();
    private static final MarshallingInfo<StructuredPojo> HISTORICALOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistoricalOptions").build();
    private static final MarshallingInfo<java.util.Date> LASTAUTOADJUSTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastAutoAdjustTime").timestampFormat("unixTimestamp").build();

    private static final AutoAdjustDataMarshaller instance = new AutoAdjustDataMarshaller();

    public static AutoAdjustDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AutoAdjustData autoAdjustData, ProtocolMarshaller protocolMarshaller) {

        if (autoAdjustData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(autoAdjustData.getAutoAdjustType(), AUTOADJUSTTYPE_BINDING);
            protocolMarshaller.marshall(autoAdjustData.getHistoricalOptions(), HISTORICALOPTIONS_BINDING);
            protocolMarshaller.marshall(autoAdjustData.getLastAutoAdjustTime(), LASTAUTOADJUSTTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
