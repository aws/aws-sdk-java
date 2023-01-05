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
package com.amazonaws.services.voiceid.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.voiceid.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartFraudsterRegistrationJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartFraudsterRegistrationJobRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<String> DOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DomainId").build();
    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> REGISTRATIONCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegistrationConfig").build();

    private static final StartFraudsterRegistrationJobRequestMarshaller instance = new StartFraudsterRegistrationJobRequestMarshaller();

    public static StartFraudsterRegistrationJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartFraudsterRegistrationJobRequest startFraudsterRegistrationJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startFraudsterRegistrationJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getDomainId(), DOMAINID_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(startFraudsterRegistrationJobRequest.getRegistrationConfig(), REGISTRATIONCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
