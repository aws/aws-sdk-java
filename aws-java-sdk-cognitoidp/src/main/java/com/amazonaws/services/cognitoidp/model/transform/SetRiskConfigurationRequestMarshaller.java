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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SetRiskConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SetRiskConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<StructuredPojo> COMPROMISEDCREDENTIALSRISKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompromisedCredentialsRiskConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> ACCOUNTTAKEOVERRISKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountTakeoverRiskConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> RISKEXCEPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RiskExceptionConfiguration").build();

    private static final SetRiskConfigurationRequestMarshaller instance = new SetRiskConfigurationRequestMarshaller();

    public static SetRiskConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SetRiskConfigurationRequest setRiskConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (setRiskConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(setRiskConfigurationRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(setRiskConfigurationRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(setRiskConfigurationRequest.getCompromisedCredentialsRiskConfiguration(),
                    COMPROMISEDCREDENTIALSRISKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(setRiskConfigurationRequest.getAccountTakeoverRiskConfiguration(), ACCOUNTTAKEOVERRISKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(setRiskConfigurationRequest.getRiskExceptionConfiguration(), RISKEXCEPTIONCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
