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
package com.amazonaws.services.connect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.connect.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HierarchyStructureMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HierarchyStructureMarshaller {

    private static final MarshallingInfo<StructuredPojo> LEVELONE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LevelOne").build();
    private static final MarshallingInfo<StructuredPojo> LEVELTWO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LevelTwo").build();
    private static final MarshallingInfo<StructuredPojo> LEVELTHREE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LevelThree").build();
    private static final MarshallingInfo<StructuredPojo> LEVELFOUR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LevelFour").build();
    private static final MarshallingInfo<StructuredPojo> LEVELFIVE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LevelFive").build();

    private static final HierarchyStructureMarshaller instance = new HierarchyStructureMarshaller();

    public static HierarchyStructureMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HierarchyStructure hierarchyStructure, ProtocolMarshaller protocolMarshaller) {

        if (hierarchyStructure == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hierarchyStructure.getLevelOne(), LEVELONE_BINDING);
            protocolMarshaller.marshall(hierarchyStructure.getLevelTwo(), LEVELTWO_BINDING);
            protocolMarshaller.marshall(hierarchyStructure.getLevelThree(), LEVELTHREE_BINDING);
            protocolMarshaller.marshall(hierarchyStructure.getLevelFour(), LEVELFOUR_BINDING);
            protocolMarshaller.marshall(hierarchyStructure.getLevelFive(), LEVELFIVE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
