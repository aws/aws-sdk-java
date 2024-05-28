/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmsap.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssmsap.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ComponentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ComponentMarshaller {

    private static final MarshallingInfo<String> COMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentId").build();
    private static final MarshallingInfo<String> SID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sid").build();
    private static final MarshallingInfo<String> SYSTEMNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SystemNumber").build();
    private static final MarshallingInfo<String> PARENTCOMPONENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentComponent").build();
    private static final MarshallingInfo<List> CHILDCOMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChildComponents").build();
    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationId").build();
    private static final MarshallingInfo<String> COMPONENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComponentType").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> SAPHOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SapHostname").build();
    private static final MarshallingInfo<String> SAPFEATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SapFeature").build();
    private static final MarshallingInfo<String> SAPKERNELVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SapKernelVersion").build();
    private static final MarshallingInfo<String> HDBVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HdbVersion").build();
    private static final MarshallingInfo<StructuredPojo> RESILIENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Resilience").build();
    private static final MarshallingInfo<StructuredPojo> ASSOCIATEDHOST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatedHost").build();
    private static final MarshallingInfo<List> DATABASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Databases").build();
    private static final MarshallingInfo<List> HOSTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hosts").build();
    private static final MarshallingInfo<String> PRIMARYHOST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryHost").build();
    private static final MarshallingInfo<StructuredPojo> DATABASECONNECTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatabaseConnection").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Arn").build();

    private static final ComponentMarshaller instance = new ComponentMarshaller();

    public static ComponentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Component component, ProtocolMarshaller protocolMarshaller) {

        if (component == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(component.getComponentId(), COMPONENTID_BINDING);
            protocolMarshaller.marshall(component.getSid(), SID_BINDING);
            protocolMarshaller.marshall(component.getSystemNumber(), SYSTEMNUMBER_BINDING);
            protocolMarshaller.marshall(component.getParentComponent(), PARENTCOMPONENT_BINDING);
            protocolMarshaller.marshall(component.getChildComponents(), CHILDCOMPONENTS_BINDING);
            protocolMarshaller.marshall(component.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(component.getComponentType(), COMPONENTTYPE_BINDING);
            protocolMarshaller.marshall(component.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(component.getSapHostname(), SAPHOSTNAME_BINDING);
            protocolMarshaller.marshall(component.getSapFeature(), SAPFEATURE_BINDING);
            protocolMarshaller.marshall(component.getSapKernelVersion(), SAPKERNELVERSION_BINDING);
            protocolMarshaller.marshall(component.getHdbVersion(), HDBVERSION_BINDING);
            protocolMarshaller.marshall(component.getResilience(), RESILIENCE_BINDING);
            protocolMarshaller.marshall(component.getAssociatedHost(), ASSOCIATEDHOST_BINDING);
            protocolMarshaller.marshall(component.getDatabases(), DATABASES_BINDING);
            protocolMarshaller.marshall(component.getHosts(), HOSTS_BINDING);
            protocolMarshaller.marshall(component.getPrimaryHost(), PRIMARYHOST_BINDING);
            protocolMarshaller.marshall(component.getDatabaseConnection(), DATABASECONNECTION_BINDING);
            protocolMarshaller.marshall(component.getLastUpdated(), LASTUPDATED_BINDING);
            protocolMarshaller.marshall(component.getArn(), ARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
