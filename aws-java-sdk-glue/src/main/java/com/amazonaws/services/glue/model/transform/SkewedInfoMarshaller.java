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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SkewedInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SkewedInfoMarshaller {

    private static final MarshallingInfo<List> SKEWEDCOLUMNNAMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkewedColumnNames").build();
    private static final MarshallingInfo<List> SKEWEDCOLUMNVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkewedColumnValues").build();
    private static final MarshallingInfo<Map> SKEWEDCOLUMNVALUELOCATIONMAPS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkewedColumnValueLocationMaps").build();

    private static final SkewedInfoMarshaller instance = new SkewedInfoMarshaller();

    public static SkewedInfoMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SkewedInfo skewedInfo, ProtocolMarshaller protocolMarshaller) {

        if (skewedInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(skewedInfo.getSkewedColumnNames(), SKEWEDCOLUMNNAMES_BINDING);
            protocolMarshaller.marshall(skewedInfo.getSkewedColumnValues(), SKEWEDCOLUMNVALUES_BINDING);
            protocolMarshaller.marshall(skewedInfo.getSkewedColumnValueLocationMaps(), SKEWEDCOLUMNVALUELOCATIONMAPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
