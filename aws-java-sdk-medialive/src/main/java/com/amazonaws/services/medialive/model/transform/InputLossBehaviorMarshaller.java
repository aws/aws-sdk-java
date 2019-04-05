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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputLossBehaviorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputLossBehaviorMarshaller {

    private static final MarshallingInfo<Integer> BLACKFRAMEMSEC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("blackFrameMsec").build();
    private static final MarshallingInfo<String> INPUTLOSSIMAGECOLOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossImageColor").build();
    private static final MarshallingInfo<StructuredPojo> INPUTLOSSIMAGESLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossImageSlate").build();
    private static final MarshallingInfo<String> INPUTLOSSIMAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputLossImageType").build();
    private static final MarshallingInfo<Integer> REPEATFRAMEMSEC_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("repeatFrameMsec").build();

    private static final InputLossBehaviorMarshaller instance = new InputLossBehaviorMarshaller();

    public static InputLossBehaviorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputLossBehavior inputLossBehavior, ProtocolMarshaller protocolMarshaller) {

        if (inputLossBehavior == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputLossBehavior.getBlackFrameMsec(), BLACKFRAMEMSEC_BINDING);
            protocolMarshaller.marshall(inputLossBehavior.getInputLossImageColor(), INPUTLOSSIMAGECOLOR_BINDING);
            protocolMarshaller.marshall(inputLossBehavior.getInputLossImageSlate(), INPUTLOSSIMAGESLATE_BINDING);
            protocolMarshaller.marshall(inputLossBehavior.getInputLossImageType(), INPUTLOSSIMAGETYPE_BINDING);
            protocolMarshaller.marshall(inputLossBehavior.getRepeatFrameMsec(), REPEATFRAMEMSEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
