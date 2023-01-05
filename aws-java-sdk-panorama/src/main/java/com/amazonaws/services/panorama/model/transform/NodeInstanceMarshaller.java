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
package com.amazonaws.services.panorama.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.panorama.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NodeInstanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NodeInstanceMarshaller {

    private static final MarshallingInfo<String> CURRENTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentStatus").build();
    private static final MarshallingInfo<String> NODEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeId").build();
    private static final MarshallingInfo<String> NODEINSTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NodeInstanceId").build();
    private static final MarshallingInfo<String> NODENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NodeName").build();
    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageName").build();
    private static final MarshallingInfo<String> PACKAGEPATCHVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackagePatchVersion").build();
    private static final MarshallingInfo<String> PACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageVersion").build();

    private static final NodeInstanceMarshaller instance = new NodeInstanceMarshaller();

    public static NodeInstanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NodeInstance nodeInstance, ProtocolMarshaller protocolMarshaller) {

        if (nodeInstance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(nodeInstance.getCurrentStatus(), CURRENTSTATUS_BINDING);
            protocolMarshaller.marshall(nodeInstance.getNodeId(), NODEID_BINDING);
            protocolMarshaller.marshall(nodeInstance.getNodeInstanceId(), NODEINSTANCEID_BINDING);
            protocolMarshaller.marshall(nodeInstance.getNodeName(), NODENAME_BINDING);
            protocolMarshaller.marshall(nodeInstance.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(nodeInstance.getPackagePatchVersion(), PACKAGEPATCHVERSION_BINDING);
            protocolMarshaller.marshall(nodeInstance.getPackageVersion(), PACKAGEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
