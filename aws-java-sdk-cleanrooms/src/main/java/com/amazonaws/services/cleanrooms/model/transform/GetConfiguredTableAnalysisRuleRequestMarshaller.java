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
package com.amazonaws.services.cleanrooms.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cleanrooms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetConfiguredTableAnalysisRuleRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetConfiguredTableAnalysisRuleRequestMarshaller {

    private static final MarshallingInfo<String> CONFIGUREDTABLEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("configuredTableIdentifier").build();
    private static final MarshallingInfo<String> ANALYSISRULETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("analysisRuleType").build();

    private static final GetConfiguredTableAnalysisRuleRequestMarshaller instance = new GetConfiguredTableAnalysisRuleRequestMarshaller();

    public static GetConfiguredTableAnalysisRuleRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetConfiguredTableAnalysisRuleRequest getConfiguredTableAnalysisRuleRequest, ProtocolMarshaller protocolMarshaller) {

        if (getConfiguredTableAnalysisRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getConfiguredTableAnalysisRuleRequest.getConfiguredTableIdentifier(), CONFIGUREDTABLEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(getConfiguredTableAnalysisRuleRequest.getAnalysisRuleType(), ANALYSISRULETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
