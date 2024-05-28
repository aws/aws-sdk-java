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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetParameterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetParameterMarshaller {

    private static final MarshallingInfo<StructuredPojo> STRINGDATASETPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StringDatasetParameter").build();
    private static final MarshallingInfo<StructuredPojo> DECIMALDATASETPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalDatasetParameter").build();
    private static final MarshallingInfo<StructuredPojo> INTEGERDATASETPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IntegerDatasetParameter").build();
    private static final MarshallingInfo<StructuredPojo> DATETIMEDATASETPARAMETER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateTimeDatasetParameter").build();

    private static final DatasetParameterMarshaller instance = new DatasetParameterMarshaller();

    public static DatasetParameterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetParameter datasetParameter, ProtocolMarshaller protocolMarshaller) {

        if (datasetParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetParameter.getStringDatasetParameter(), STRINGDATASETPARAMETER_BINDING);
            protocolMarshaller.marshall(datasetParameter.getDecimalDatasetParameter(), DECIMALDATASETPARAMETER_BINDING);
            protocolMarshaller.marshall(datasetParameter.getIntegerDatasetParameter(), INTEGERDATASETPARAMETER_BINDING);
            protocolMarshaller.marshall(datasetParameter.getDateTimeDatasetParameter(), DATETIMEDATASETPARAMETER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
