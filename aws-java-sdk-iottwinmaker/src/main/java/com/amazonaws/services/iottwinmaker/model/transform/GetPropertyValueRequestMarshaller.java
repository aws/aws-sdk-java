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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iottwinmaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetPropertyValueRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetPropertyValueRequestMarshaller {

    private static final MarshallingInfo<String> COMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentName").build();
    private static final MarshallingInfo<String> COMPONENTTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("componentTypeId").build();
    private static final MarshallingInfo<String> ENTITYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("entityId").build();
    private static final MarshallingInfo<List> SELECTEDPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("selectedProperties").build();
    private static final MarshallingInfo<String> WORKSPACEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("workspaceId").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maxResults").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();
    private static final MarshallingInfo<String> PROPERTYGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("propertyGroupName").build();
    private static final MarshallingInfo<StructuredPojo> TABULARCONDITIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tabularConditions").build();

    private static final GetPropertyValueRequestMarshaller instance = new GetPropertyValueRequestMarshaller();

    public static GetPropertyValueRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetPropertyValueRequest getPropertyValueRequest, ProtocolMarshaller protocolMarshaller) {

        if (getPropertyValueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getPropertyValueRequest.getComponentName(), COMPONENTNAME_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getComponentTypeId(), COMPONENTTYPEID_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getEntityId(), ENTITYID_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getSelectedProperties(), SELECTEDPROPERTIES_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getWorkspaceId(), WORKSPACEID_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getPropertyGroupName(), PROPERTYGROUPNAME_BINDING);
            protocolMarshaller.marshall(getPropertyValueRequest.getTabularConditions(), TABULARCONDITIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
