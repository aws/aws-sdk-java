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
package com.amazonaws.services.pinpoint.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MultiConditionalSplitActivityMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MultiConditionalSplitActivityMarshaller {

    private static final MarshallingInfo<List> BRANCHES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Branches").build();
    private static final MarshallingInfo<String> DEFAULTACTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultActivity").build();
    private static final MarshallingInfo<StructuredPojo> EVALUATIONWAITTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EvaluationWaitTime").build();

    private static final MultiConditionalSplitActivityMarshaller instance = new MultiConditionalSplitActivityMarshaller();

    public static MultiConditionalSplitActivityMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MultiConditionalSplitActivity multiConditionalSplitActivity, ProtocolMarshaller protocolMarshaller) {

        if (multiConditionalSplitActivity == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(multiConditionalSplitActivity.getBranches(), BRANCHES_BINDING);
            protocolMarshaller.marshall(multiConditionalSplitActivity.getDefaultActivity(), DEFAULTACTIVITY_BINDING);
            protocolMarshaller.marshall(multiConditionalSplitActivity.getEvaluationWaitTime(), EVALUATIONWAITTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
