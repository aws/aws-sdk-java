/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.comprehendmedical.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartICD10CMInferenceJobRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartICD10CMInferenceJobRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputDataConfig").build();
    private static final MarshallingInfo<String> DATAACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataAccessRoleArn").build();
    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobName").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> KMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KMSKey").build();
    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();

    private static final StartICD10CMInferenceJobRequestMarshaller instance = new StartICD10CMInferenceJobRequestMarshaller();

    public static StartICD10CMInferenceJobRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartICD10CMInferenceJobRequest startICD10CMInferenceJobRequest, ProtocolMarshaller protocolMarshaller) {

        if (startICD10CMInferenceJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getOutputDataConfig(), OUTPUTDATACONFIG_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getDataAccessRoleArn(), DATAACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getKMSKey(), KMSKEY_BINDING);
            protocolMarshaller.marshall(startICD10CMInferenceJobRequest.getLanguageCode(), LANGUAGECODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
