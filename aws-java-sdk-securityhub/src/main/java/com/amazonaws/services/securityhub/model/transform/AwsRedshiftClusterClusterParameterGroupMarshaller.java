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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsRedshiftClusterClusterParameterGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsRedshiftClusterClusterParameterGroupMarshaller {

    private static final MarshallingInfo<List> CLUSTERPARAMETERSTATUSLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterParameterStatusList").build();
    private static final MarshallingInfo<String> PARAMETERAPPLYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterApplyStatus").build();
    private static final MarshallingInfo<String> PARAMETERGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterGroupName").build();

    private static final AwsRedshiftClusterClusterParameterGroupMarshaller instance = new AwsRedshiftClusterClusterParameterGroupMarshaller();

    public static AwsRedshiftClusterClusterParameterGroupMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsRedshiftClusterClusterParameterGroup awsRedshiftClusterClusterParameterGroup, ProtocolMarshaller protocolMarshaller) {

        if (awsRedshiftClusterClusterParameterGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsRedshiftClusterClusterParameterGroup.getClusterParameterStatusList(), CLUSTERPARAMETERSTATUSLIST_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterClusterParameterGroup.getParameterApplyStatus(), PARAMETERAPPLYSTATUS_BINDING);
            protocolMarshaller.marshall(awsRedshiftClusterClusterParameterGroup.getParameterGroupName(), PARAMETERGROUPNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
