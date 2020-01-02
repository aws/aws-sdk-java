/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.eks.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateNodegroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateNodegroupRequestMarshaller {

    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> NODEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nodegroupName").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingConfig").build();
    private static final MarshallingInfo<Integer> DISKSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("diskSize").build();
    private static final MarshallingInfo<List> SUBNETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("subnets").build();
    private static final MarshallingInfo<List> INSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("instanceTypes").build();
    private static final MarshallingInfo<String> AMITYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("amiType").build();
    private static final MarshallingInfo<StructuredPojo> REMOTEACCESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteAccess").build();
    private static final MarshallingInfo<String> NODEROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nodeRole").build();
    private static final MarshallingInfo<Map> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("labels").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> RELEASEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseVersion").build();

    private static final CreateNodegroupRequestMarshaller instance = new CreateNodegroupRequestMarshaller();

    public static CreateNodegroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateNodegroupRequest createNodegroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (createNodegroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createNodegroupRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getNodegroupName(), NODEGROUPNAME_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getScalingConfig(), SCALINGCONFIG_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getDiskSize(), DISKSIZE_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getSubnets(), SUBNETS_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getInstanceTypes(), INSTANCETYPES_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getAmiType(), AMITYPE_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getRemoteAccess(), REMOTEACCESS_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getNodeRole(), NODEROLE_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(createNodegroupRequest.getReleaseVersion(), RELEASEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
