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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TemplateVersionDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TemplateVersionDefinitionMarshaller {

    private static final MarshallingInfo<List> DATASETCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSetConfigurations").build();
    private static final MarshallingInfo<List> SHEETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sheets").build();
    private static final MarshallingInfo<List> CALCULATEDFIELDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedFields").build();
    private static final MarshallingInfo<List> PARAMETERDECLARATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParameterDeclarations").build();
    private static final MarshallingInfo<List> FILTERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FilterGroups").build();
    private static final MarshallingInfo<List> COLUMNCONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ColumnConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> ANALYSISDEFAULTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalysisDefaults").build();

    private static final TemplateVersionDefinitionMarshaller instance = new TemplateVersionDefinitionMarshaller();

    public static TemplateVersionDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TemplateVersionDefinition templateVersionDefinition, ProtocolMarshaller protocolMarshaller) {

        if (templateVersionDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(templateVersionDefinition.getDataSetConfigurations(), DATASETCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getSheets(), SHEETS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getCalculatedFields(), CALCULATEDFIELDS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getParameterDeclarations(), PARAMETERDECLARATIONS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getFilterGroups(), FILTERGROUPS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getColumnConfigurations(), COLUMNCONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(templateVersionDefinition.getAnalysisDefaults(), ANALYSISDEFAULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
