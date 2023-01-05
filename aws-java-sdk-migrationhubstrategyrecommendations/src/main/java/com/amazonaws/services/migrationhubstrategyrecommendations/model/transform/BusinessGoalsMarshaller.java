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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BusinessGoalsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BusinessGoalsMarshaller {

    private static final MarshallingInfo<Integer> LICENSECOSTREDUCTION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("licenseCostReduction").build();
    private static final MarshallingInfo<Integer> MODERNIZEINFRASTRUCTUREWITHCLOUDNATIVETECHNOLOGIES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modernizeInfrastructureWithCloudNativeTechnologies").build();
    private static final MarshallingInfo<Integer> REDUCEOPERATIONALOVERHEADWITHMANAGEDSERVICES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("reduceOperationalOverheadWithManagedServices").build();
    private static final MarshallingInfo<Integer> SPEEDOFMIGRATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("speedOfMigration").build();

    private static final BusinessGoalsMarshaller instance = new BusinessGoalsMarshaller();

    public static BusinessGoalsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BusinessGoals businessGoals, ProtocolMarshaller protocolMarshaller) {

        if (businessGoals == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(businessGoals.getLicenseCostReduction(), LICENSECOSTREDUCTION_BINDING);
            protocolMarshaller.marshall(businessGoals.getModernizeInfrastructureWithCloudNativeTechnologies(),
                    MODERNIZEINFRASTRUCTUREWITHCLOUDNATIVETECHNOLOGIES_BINDING);
            protocolMarshaller.marshall(businessGoals.getReduceOperationalOverheadWithManagedServices(), REDUCEOPERATIONALOVERHEADWITHMANAGEDSERVICES_BINDING);
            protocolMarshaller.marshall(businessGoals.getSpeedOfMigration(), SPEEDOFMIGRATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
