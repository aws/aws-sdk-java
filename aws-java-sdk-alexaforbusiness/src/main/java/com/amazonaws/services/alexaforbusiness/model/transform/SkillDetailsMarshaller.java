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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.alexaforbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SkillDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SkillDetailsMarshaller {

    private static final MarshallingInfo<String> PRODUCTDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProductDescription").build();
    private static final MarshallingInfo<String> INVOCATIONPHRASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvocationPhrase").build();
    private static final MarshallingInfo<String> RELEASEDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReleaseDate").build();
    private static final MarshallingInfo<String> ENDUSERLICENSEAGREEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EndUserLicenseAgreement").build();
    private static final MarshallingInfo<List> GENERICKEYWORDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenericKeywords").build();
    private static final MarshallingInfo<List> BULLETPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BulletPoints").build();
    private static final MarshallingInfo<List> NEWINTHISVERSIONBULLETPOINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NewInThisVersionBulletPoints").build();
    private static final MarshallingInfo<List> SKILLTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SkillTypes").build();
    private static final MarshallingInfo<Map> REVIEWS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Reviews").build();
    private static final MarshallingInfo<StructuredPojo> DEVELOPERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeveloperInfo").build();

    private static final SkillDetailsMarshaller instance = new SkillDetailsMarshaller();

    public static SkillDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SkillDetails skillDetails, ProtocolMarshaller protocolMarshaller) {

        if (skillDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(skillDetails.getProductDescription(), PRODUCTDESCRIPTION_BINDING);
            protocolMarshaller.marshall(skillDetails.getInvocationPhrase(), INVOCATIONPHRASE_BINDING);
            protocolMarshaller.marshall(skillDetails.getReleaseDate(), RELEASEDATE_BINDING);
            protocolMarshaller.marshall(skillDetails.getEndUserLicenseAgreement(), ENDUSERLICENSEAGREEMENT_BINDING);
            protocolMarshaller.marshall(skillDetails.getGenericKeywords(), GENERICKEYWORDS_BINDING);
            protocolMarshaller.marshall(skillDetails.getBulletPoints(), BULLETPOINTS_BINDING);
            protocolMarshaller.marshall(skillDetails.getNewInThisVersionBulletPoints(), NEWINTHISVERSIONBULLETPOINTS_BINDING);
            protocolMarshaller.marshall(skillDetails.getSkillTypes(), SKILLTYPES_BINDING);
            protocolMarshaller.marshall(skillDetails.getReviews(), REVIEWS_BINDING);
            protocolMarshaller.marshall(skillDetails.getDeveloperInfo(), DEVELOPERINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
