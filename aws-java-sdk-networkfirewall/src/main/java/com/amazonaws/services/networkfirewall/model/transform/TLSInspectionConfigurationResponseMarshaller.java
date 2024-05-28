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
package com.amazonaws.services.networkfirewall.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkfirewall.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TLSInspectionConfigurationResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TLSInspectionConfigurationResponseMarshaller {

    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationArn").build();
    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationName").build();
    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationId").build();
    private static final MarshallingInfo<String> TLSINSPECTIONCONFIGURATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TLSInspectionConfigurationStatus").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Integer> NUMBEROFASSOCIATIONS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfAssociations").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionConfiguration").build();
    private static final MarshallingInfo<List> CERTIFICATES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Certificates").build();
    private static final MarshallingInfo<StructuredPojo> CERTIFICATEAUTHORITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthority").build();

    private static final TLSInspectionConfigurationResponseMarshaller instance = new TLSInspectionConfigurationResponseMarshaller();

    public static TLSInspectionConfigurationResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse, ProtocolMarshaller protocolMarshaller) {

        if (tLSInspectionConfigurationResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getTLSInspectionConfigurationArn(), TLSINSPECTIONCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getTLSInspectionConfigurationName(), TLSINSPECTIONCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getTLSInspectionConfigurationId(), TLSINSPECTIONCONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getTLSInspectionConfigurationStatus(), TLSINSPECTIONCONFIGURATIONSTATUS_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getNumberOfAssociations(), NUMBEROFASSOCIATIONS_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getEncryptionConfiguration(), ENCRYPTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getCertificates(), CERTIFICATES_BINDING);
            protocolMarshaller.marshall(tLSInspectionConfigurationResponse.getCertificateAuthority(), CERTIFICATEAUTHORITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
