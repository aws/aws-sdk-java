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
package com.amazonaws.services.forecast.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.forecast.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDatasetGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDatasetGroupRequestMarshaller {

    private static final MarshallingInfo<String> DATASETGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetGroupName").build();
    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Domain").build();
    private static final MarshallingInfo<List> DATASETARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DatasetArns").build();

    private static final CreateDatasetGroupRequestMarshaller instance = new CreateDatasetGroupRequestMarshaller();

    public static CreateDatasetGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDatasetGroupRequest createDatasetGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDatasetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDatasetGroupRequest.getDatasetGroupName(), DATASETGROUPNAME_BINDING);
            protocolMarshaller.marshall(createDatasetGroupRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(createDatasetGroupRequest.getDatasetArns(), DATASETARNS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
