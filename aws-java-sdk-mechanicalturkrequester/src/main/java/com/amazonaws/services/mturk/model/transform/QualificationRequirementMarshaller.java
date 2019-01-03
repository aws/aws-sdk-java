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
package com.amazonaws.services.mturk.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mturk.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * QualificationRequirementMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QualificationRequirementMarshaller {

    private static final MarshallingInfo<String> QUALIFICATIONTYPEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("QualificationTypeId").build();
    private static final MarshallingInfo<String> COMPARATOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Comparator").build();
    private static final MarshallingInfo<List> INTEGERVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("IntegerValues").build();
    private static final MarshallingInfo<List> LOCALEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LocaleValues").build();
    private static final MarshallingInfo<Boolean> REQUIREDTOPREVIEW_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RequiredToPreview").build();
    private static final MarshallingInfo<String> ACTIONSGUARDED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActionsGuarded").build();

    private static final QualificationRequirementMarshaller instance = new QualificationRequirementMarshaller();

    public static QualificationRequirementMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QualificationRequirement qualificationRequirement, ProtocolMarshaller protocolMarshaller) {

        if (qualificationRequirement == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(qualificationRequirement.getQualificationTypeId(), QUALIFICATIONTYPEID_BINDING);
            protocolMarshaller.marshall(qualificationRequirement.getComparator(), COMPARATOR_BINDING);
            protocolMarshaller.marshall(qualificationRequirement.getIntegerValues(), INTEGERVALUES_BINDING);
            protocolMarshaller.marshall(qualificationRequirement.getLocaleValues(), LOCALEVALUES_BINDING);
            protocolMarshaller.marshall(qualificationRequirement.getRequiredToPreview(), REQUIREDTOPREVIEW_BINDING);
            protocolMarshaller.marshall(qualificationRequirement.getActionsGuarded(), ACTIONSGUARDED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
