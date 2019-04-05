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
 * CreateDevEndpointRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDevEndpointRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleArn").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIds").build();
    private static final MarshallingInfo<String> SUBNETID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetId").build();
    private static final MarshallingInfo<String> PUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKey").build();
    private static final MarshallingInfo<List> PUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PublicKeys").build();
    private static final MarshallingInfo<Integer> NUMBEROFNODES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfNodes").build();
    private static final MarshallingInfo<String> EXTRAPYTHONLIBSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraPythonLibsS3Path").build();
    private static final MarshallingInfo<String> EXTRAJARSS3PATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExtraJarsS3Path").build();
    private static final MarshallingInfo<String> SECURITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityConfiguration").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<Map> ARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arguments").build();

    private static final CreateDevEndpointRequestMarshaller instance = new CreateDevEndpointRequestMarshaller();

    public static CreateDevEndpointRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDevEndpointRequest createDevEndpointRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDevEndpointRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDevEndpointRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getSecurityGroupIds(), SECURITYGROUPIDS_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getSubnetId(), SUBNETID_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getPublicKey(), PUBLICKEY_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getPublicKeys(), PUBLICKEYS_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getNumberOfNodes(), NUMBEROFNODES_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getExtraPythonLibsS3Path(), EXTRAPYTHONLIBSS3PATH_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getExtraJarsS3Path(), EXTRAJARSS3PATH_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getSecurityConfiguration(), SECURITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createDevEndpointRequest.getArguments(), ARGUMENTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
