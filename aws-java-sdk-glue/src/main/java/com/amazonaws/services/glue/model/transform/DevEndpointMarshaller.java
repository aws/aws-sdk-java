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
package com.amazonaws.services.glue.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DevEndpointMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DevEndpointMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> YARNENDPOINTADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("YarnEndpointAddress").build();
    private static final MarshallingInfo<String> PRIVATEADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateAddress").build();
    private static final MarshallingInfo<Integer> ZEPPELINREMOTESPARKINTERPRETERPORT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ZeppelinRemoteSparkInterpreterPort").build();
    private static final MarshallingInfo<String> PUBLICADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PublicAddress").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<Integer> NUMBEROFNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfNodes").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AvailabilityZone").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<String> EXTRAPYTHONLIBSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraPythonLibsS3Path").build();
    private static final MarshallingInfo<String> EXTRAJARSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraJarsS3Path").build();
    private static final MarshallingInfo<String> FAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureReason").build();
    private static final MarshallingInfo<String> LASTUPDATESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdateStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> PUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKey").build();
    private static final MarshallingInfo<List> PUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKeys").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<Map> ARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arguments").build();

    private static final DevEndpointMarshaller instance = new DevEndpointMarshaller();

    public static DevEndpointMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DevEndpoint devEndpoint, ProtocolMarshaller protocolMarshaller) {

        if (devEndpoint == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(devEndpoint.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(devEndpoint.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(devEndpoint.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(devEndpoint.getYarnEndpointAddress(), YARNENDPOINTADDRESS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getPrivateAddress(), PRIVATEADDRESS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getZeppelinRemoteSparkInterpreterPort(), ZEPPELINREMOTESPARKINTERPRETERPORT_BINDING);
            protocolMarshaller.marshall(devEndpoint.getPublicAddress(), PUBLICADDRESS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getNumberOfNodes(), NUMBEROFNODES_BINDING);
            protocolMarshaller.marshall(devEndpoint.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(devEndpoint.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(devEndpoint.getExtraPythonLibsS3Path(), EXTRAPYTHONLIBSS3PATH_BINDING);
            protocolMarshaller.marshall(devEndpoint.getExtraJarsS3Path(), EXTRAJARSS3PATH_BINDING);
            protocolMarshaller.marshall(devEndpoint.getFailureReason(), FAILUREREASON_BINDING);
            protocolMarshaller.marshall(devEndpoint.getLastUpdateStatus(), LASTUPDATESTATUS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(devEndpoint.getLastModifiedTimestamp(), LASTMODIFIEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(devEndpoint.getPublicKey(), PUBLICKEY_BINDING);
            protocolMarshaller.marshall(devEndpoint.getPublicKeys(), PUBLICKEYS_BINDING);
            protocolMarshaller.marshall(devEndpoint.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(devEndpoint.getArguments(), ARGUMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
