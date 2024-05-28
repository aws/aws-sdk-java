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
package com.amazonaws.services.datazone.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datazone.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RedshiftRunConfigurationOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RedshiftRunConfigurationOutputMarshaller {

    private static final MarshallingInfo<String> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<String> DATAACCESSROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataAccessRole").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTCREDENTIALCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redshiftCredentialConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTSTORAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("redshiftStorage").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("region").build();
    private static final MarshallingInfo<List> RELATIONALFILTERCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalFilterConfigurations").build();

    private static final RedshiftRunConfigurationOutputMarshaller instance = new RedshiftRunConfigurationOutputMarshaller();

    public static RedshiftRunConfigurationOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RedshiftRunConfigurationOutput redshiftRunConfigurationOutput, ProtocolMarshaller protocolMarshaller) {

        if (redshiftRunConfigurationOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getDataAccessRole(), DATAACCESSROLE_BINDING);
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getRedshiftCredentialConfiguration(), REDSHIFTCREDENTIALCONFIGURATION_BINDING);
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getRedshiftStorage(), REDSHIFTSTORAGE_BINDING);
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(redshiftRunConfigurationOutput.getRelationalFilterConfigurations(), RELATIONALFILTERCONFIGURATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
