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
package com.amazonaws.services.stepfunctions.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.stepfunctions.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InspectionDataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InspectionDataMarshaller {

    private static final MarshallingInfo<String> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("input").build();
    private static final MarshallingInfo<String> AFTERINPUTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterInputPath").build();
    private static final MarshallingInfo<String> AFTERPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterParameters").build();
    private static final MarshallingInfo<String> RESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("result").build();
    private static final MarshallingInfo<String> AFTERRESULTSELECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterResultSelector").build();
    private static final MarshallingInfo<String> AFTERRESULTPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("afterResultPath").build();
    private static final MarshallingInfo<StructuredPojo> REQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("request").build();
    private static final MarshallingInfo<StructuredPojo> RESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("response").build();

    private static final InspectionDataMarshaller instance = new InspectionDataMarshaller();

    public static InspectionDataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InspectionData inspectionData, ProtocolMarshaller protocolMarshaller) {

        if (inspectionData == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inspectionData.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(inspectionData.getAfterInputPath(), AFTERINPUTPATH_BINDING);
            protocolMarshaller.marshall(inspectionData.getAfterParameters(), AFTERPARAMETERS_BINDING);
            protocolMarshaller.marshall(inspectionData.getResult(), RESULT_BINDING);
            protocolMarshaller.marshall(inspectionData.getAfterResultSelector(), AFTERRESULTSELECTOR_BINDING);
            protocolMarshaller.marshall(inspectionData.getAfterResultPath(), AFTERRESULTPATH_BINDING);
            protocolMarshaller.marshall(inspectionData.getRequest(), REQUEST_BINDING);
            protocolMarshaller.marshall(inspectionData.getResponse(), RESPONSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
