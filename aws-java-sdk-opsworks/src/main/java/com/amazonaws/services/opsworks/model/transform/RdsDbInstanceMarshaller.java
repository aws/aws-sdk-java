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
package com.amazonaws.services.opsworks.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RdsDbInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RdsDbInstanceMarshaller {

    private static final MarshallingInfo<String> RDSDBINSTANCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RdsDbInstanceArn").build();
    private static final MarshallingInfo<String> DBINSTANCEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbInstanceIdentifier").build();
    private static final MarshallingInfo<String> DBUSER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DbUser").build();
    private static final MarshallingInfo<String> DBPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DbPassword").build();
    private static final MarshallingInfo<String> REGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Region").build();
    private static final MarshallingInfo<String> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Engine").build();
    private static final MarshallingInfo<String> STACKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StackId").build();
    private static final MarshallingInfo<Boolean> MISSINGONRDS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MissingOnRds").build();

    private static final RdsDbInstanceMarshaller instance = new RdsDbInstanceMarshaller();

    public static RdsDbInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RdsDbInstance rdsDbInstance, ProtocolMarshaller protocolMarshaller) {

        if (rdsDbInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rdsDbInstance.getRdsDbInstanceArn(), RDSDBINSTANCEARN_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getDbInstanceIdentifier(), DBINSTANCEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getDbUser(), DBUSER_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getDbPassword(), DBPASSWORD_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getRegion(), REGION_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getStackId(), STACKID_BINDING);
            protocolMarshaller.marshall(rdsDbInstance.getMissingOnRds(), MISSINGONRDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
