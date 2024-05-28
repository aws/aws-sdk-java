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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TestExecutionResultItemsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TestExecutionResultItemsMarshaller {

    private static final MarshallingInfo<StructuredPojo> OVERALLTESTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("overallTestResults").build();
    private static final MarshallingInfo<StructuredPojo> CONVERSATIONLEVELTESTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationLevelTestResults").build();
    private static final MarshallingInfo<StructuredPojo> INTENTCLASSIFICATIONTESTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentClassificationTestResults").build();
    private static final MarshallingInfo<StructuredPojo> INTENTLEVELSLOTRESOLUTIONTESTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentLevelSlotResolutionTestResults").build();
    private static final MarshallingInfo<StructuredPojo> UTTERANCELEVELTESTRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceLevelTestResults").build();

    private static final TestExecutionResultItemsMarshaller instance = new TestExecutionResultItemsMarshaller();

    public static TestExecutionResultItemsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TestExecutionResultItems testExecutionResultItems, ProtocolMarshaller protocolMarshaller) {

        if (testExecutionResultItems == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(testExecutionResultItems.getOverallTestResults(), OVERALLTESTRESULTS_BINDING);
            protocolMarshaller.marshall(testExecutionResultItems.getConversationLevelTestResults(), CONVERSATIONLEVELTESTRESULTS_BINDING);
            protocolMarshaller.marshall(testExecutionResultItems.getIntentClassificationTestResults(), INTENTCLASSIFICATIONTESTRESULTS_BINDING);
            protocolMarshaller.marshall(testExecutionResultItems.getIntentLevelSlotResolutionTestResults(), INTENTLEVELSLOTRESOLUTIONTESTRESULTS_BINDING);
            protocolMarshaller.marshall(testExecutionResultItems.getUtteranceLevelTestResults(), UTTERANCELEVELTESTRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
