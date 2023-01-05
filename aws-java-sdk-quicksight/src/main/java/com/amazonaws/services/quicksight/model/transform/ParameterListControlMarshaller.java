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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ParameterListControlMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ParameterListControlMarshaller {

    private static final MarshallingInfo<String> PARAMETERCONTROLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterControlId").build();
    private static final MarshallingInfo<String> TITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Title").build();
    private static final MarshallingInfo<String> SOURCEPARAMETERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceParameterName").build();
    private static final MarshallingInfo<StructuredPojo> DISPLAYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayOptions").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> SELECTABLEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectableValues").build();
    private static final MarshallingInfo<StructuredPojo> CASCADINGCONTROLCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CascadingControlConfiguration").build();

    private static final ParameterListControlMarshaller instance = new ParameterListControlMarshaller();

    public static ParameterListControlMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ParameterListControl parameterListControl, ProtocolMarshaller protocolMarshaller) {

        if (parameterListControl == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(parameterListControl.getParameterControlId(), PARAMETERCONTROLID_BINDING);
            protocolMarshaller.marshall(parameterListControl.getTitle(), TITLE_BINDING);
            protocolMarshaller.marshall(parameterListControl.getSourceParameterName(), SOURCEPARAMETERNAME_BINDING);
            protocolMarshaller.marshall(parameterListControl.getDisplayOptions(), DISPLAYOPTIONS_BINDING);
            protocolMarshaller.marshall(parameterListControl.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(parameterListControl.getSelectableValues(), SELECTABLEVALUES_BINDING);
            protocolMarshaller.marshall(parameterListControl.getCascadingControlConfiguration(), CASCADINGCONTROLCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
