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
package com.amazonaws.services.inspector2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CoverageFilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CoverageFilterCriteriaMarshaller {

    private static final MarshallingInfo<List> ACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("accountId").build();
    private static final MarshallingInfo<List> EC2INSTANCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceTags").build();
    private static final MarshallingInfo<List> ECRIMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecrImageTags").build();
    private static final MarshallingInfo<List> ECRREPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrRepositoryName").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionName").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONRUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionRuntime").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONTAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionTags").build();
    private static final MarshallingInfo<List> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceId").build();
    private static final MarshallingInfo<List> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> SCANSTATUSCODE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStatusCode").build();
    private static final MarshallingInfo<List> SCANSTATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scanStatusReason").build();
    private static final MarshallingInfo<List> SCANTYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scanType").build();

    private static final CoverageFilterCriteriaMarshaller instance = new CoverageFilterCriteriaMarshaller();

    public static CoverageFilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CoverageFilterCriteria coverageFilterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (coverageFilterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(coverageFilterCriteria.getAccountId(), ACCOUNTID_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getEc2InstanceTags(), EC2INSTANCETAGS_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getEcrImageTags(), ECRIMAGETAGS_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getEcrRepositoryName(), ECRREPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getLambdaFunctionName(), LAMBDAFUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getLambdaFunctionRuntime(), LAMBDAFUNCTIONRUNTIME_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getLambdaFunctionTags(), LAMBDAFUNCTIONTAGS_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getScanStatusCode(), SCANSTATUSCODE_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getScanStatusReason(), SCANSTATUSREASON_BINDING);
            protocolMarshaller.marshall(coverageFilterCriteria.getScanType(), SCANTYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
