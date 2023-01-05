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
 * FilterCriteriaMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FilterCriteriaMarshaller {

    private static final MarshallingInfo<List> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<List> COMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("componentId").build();
    private static final MarshallingInfo<List> COMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("componentType").build();
    private static final MarshallingInfo<List> EC2INSTANCEIMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceImageId").build();
    private static final MarshallingInfo<List> EC2INSTANCESUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceSubnetId").build();
    private static final MarshallingInfo<List> EC2INSTANCEVPCID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2InstanceVpcId").build();
    private static final MarshallingInfo<List> ECRIMAGEARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrImageArchitecture").build();
    private static final MarshallingInfo<List> ECRIMAGEHASH_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecrImageHash").build();
    private static final MarshallingInfo<List> ECRIMAGEPUSHEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrImagePushedAt").build();
    private static final MarshallingInfo<List> ECRIMAGEREGISTRY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrImageRegistry").build();
    private static final MarshallingInfo<List> ECRIMAGEREPOSITORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrImageRepositoryName").build();
    private static final MarshallingInfo<List> ECRIMAGETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ecrImageTags").build();
    private static final MarshallingInfo<List> EXPLOITAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("exploitAvailable").build();
    private static final MarshallingInfo<List> FINDINGARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("findingArn").build();
    private static final MarshallingInfo<List> FINDINGSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("findingStatus").build();
    private static final MarshallingInfo<List> FINDINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("findingType").build();
    private static final MarshallingInfo<List> FIRSTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("firstObservedAt").build();
    private static final MarshallingInfo<List> FIXAVAILABLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("fixAvailable").build();
    private static final MarshallingInfo<List> INSPECTORSCORE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inspectorScore").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionExecutionRoleArn").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONLASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionLastModifiedAt").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONLAYERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionLayers").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionName").build();
    private static final MarshallingInfo<List> LAMBDAFUNCTIONRUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunctionRuntime").build();
    private static final MarshallingInfo<List> LASTOBSERVEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastObservedAt").build();
    private static final MarshallingInfo<List> NETWORKPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkProtocol").build();
    private static final MarshallingInfo<List> PORTRANGE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("portRange").build();
    private static final MarshallingInfo<List> RELATEDVULNERABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relatedVulnerabilities").build();
    private static final MarshallingInfo<List> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceId").build();
    private static final MarshallingInfo<List> RESOURCETAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceTags").build();
    private static final MarshallingInfo<List> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> SEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("severity").build();
    private static final MarshallingInfo<List> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("title").build();
    private static final MarshallingInfo<List> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("updatedAt").build();
    private static final MarshallingInfo<List> VENDORSEVERITY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vendorSeverity").build();
    private static final MarshallingInfo<List> VULNERABILITYID_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vulnerabilityId").build();
    private static final MarshallingInfo<List> VULNERABILITYSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vulnerabilitySource").build();
    private static final MarshallingInfo<List> VULNERABLEPACKAGES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vulnerablePackages").build();

    private static final FilterCriteriaMarshaller instance = new FilterCriteriaMarshaller();

    public static FilterCriteriaMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FilterCriteria filterCriteria, ProtocolMarshaller protocolMarshaller) {

        if (filterCriteria == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(filterCriteria.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getComponentId(), COMPONENTID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getComponentType(), COMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEc2InstanceImageId(), EC2INSTANCEIMAGEID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEc2InstanceSubnetId(), EC2INSTANCESUBNETID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEc2InstanceVpcId(), EC2INSTANCEVPCID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImageArchitecture(), ECRIMAGEARCHITECTURE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImageHash(), ECRIMAGEHASH_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImagePushedAt(), ECRIMAGEPUSHEDAT_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImageRegistry(), ECRIMAGEREGISTRY_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImageRepositoryName(), ECRIMAGEREPOSITORYNAME_BINDING);
            protocolMarshaller.marshall(filterCriteria.getEcrImageTags(), ECRIMAGETAGS_BINDING);
            protocolMarshaller.marshall(filterCriteria.getExploitAvailable(), EXPLOITAVAILABLE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getFindingArn(), FINDINGARN_BINDING);
            protocolMarshaller.marshall(filterCriteria.getFindingStatus(), FINDINGSTATUS_BINDING);
            protocolMarshaller.marshall(filterCriteria.getFindingType(), FINDINGTYPE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getFirstObservedAt(), FIRSTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(filterCriteria.getFixAvailable(), FIXAVAILABLE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getInspectorScore(), INSPECTORSCORE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLambdaFunctionExecutionRoleArn(), LAMBDAFUNCTIONEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLambdaFunctionLastModifiedAt(), LAMBDAFUNCTIONLASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLambdaFunctionLayers(), LAMBDAFUNCTIONLAYERS_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLambdaFunctionName(), LAMBDAFUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLambdaFunctionRuntime(), LAMBDAFUNCTIONRUNTIME_BINDING);
            protocolMarshaller.marshall(filterCriteria.getLastObservedAt(), LASTOBSERVEDAT_BINDING);
            protocolMarshaller.marshall(filterCriteria.getNetworkProtocol(), NETWORKPROTOCOL_BINDING);
            protocolMarshaller.marshall(filterCriteria.getPortRange(), PORTRANGE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getRelatedVulnerabilities(), RELATEDVULNERABILITIES_BINDING);
            protocolMarshaller.marshall(filterCriteria.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getResourceTags(), RESOURCETAGS_BINDING);
            protocolMarshaller.marshall(filterCriteria.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getSeverity(), SEVERITY_BINDING);
            protocolMarshaller.marshall(filterCriteria.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(filterCriteria.getVendorSeverity(), VENDORSEVERITY_BINDING);
            protocolMarshaller.marshall(filterCriteria.getVulnerabilityId(), VULNERABILITYID_BINDING);
            protocolMarshaller.marshall(filterCriteria.getVulnerabilitySource(), VULNERABILITYSOURCE_BINDING);
            protocolMarshaller.marshall(filterCriteria.getVulnerablePackages(), VULNERABLEPACKAGES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
