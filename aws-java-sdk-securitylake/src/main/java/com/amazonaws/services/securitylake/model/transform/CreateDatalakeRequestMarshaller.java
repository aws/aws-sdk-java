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
package com.amazonaws.services.securitylake.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securitylake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDatalakeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDatalakeRequestMarshaller {

    private static final MarshallingInfo<Map> CONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("configurations").build();
    private static final MarshallingInfo<Boolean> ENABLEALL_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("enableAll").build();
    private static final MarshallingInfo<String> METASTOREMANAGERROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("metaStoreManagerRoleArn").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regions").build();

    private static final CreateDatalakeRequestMarshaller instance = new CreateDatalakeRequestMarshaller();

    public static CreateDatalakeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDatalakeRequest createDatalakeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDatalakeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDatalakeRequest.getConfigurations(), CONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createDatalakeRequest.getEnableAll(), ENABLEALL_BINDING);
            protocolMarshaller.marshall(createDatalakeRequest.getMetaStoreManagerRoleArn(), METASTOREMANAGERROLEARN_BINDING);
            protocolMarshaller.marshall(createDatalakeRequest.getRegions(), REGIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
