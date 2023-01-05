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
package com.amazonaws.services.backup.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.backup.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportSettingMarshaller {

    private static final MarshallingInfo<String> REPORTTEMPLATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportTemplate").build();
    private static final MarshallingInfo<List> FRAMEWORKARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FrameworkArns").build();
    private static final MarshallingInfo<Integer> NUMBEROFFRAMEWORKS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NumberOfFrameworks").build();
    private static final MarshallingInfo<List> ACCOUNTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Accounts").build();
    private static final MarshallingInfo<List> ORGANIZATIONUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationUnits").build();
    private static final MarshallingInfo<List> REGIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Regions").build();

    private static final ReportSettingMarshaller instance = new ReportSettingMarshaller();

    public static ReportSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportSetting reportSetting, ProtocolMarshaller protocolMarshaller) {

        if (reportSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportSetting.getReportTemplate(), REPORTTEMPLATE_BINDING);
            protocolMarshaller.marshall(reportSetting.getFrameworkArns(), FRAMEWORKARNS_BINDING);
            protocolMarshaller.marshall(reportSetting.getNumberOfFrameworks(), NUMBEROFFRAMEWORKS_BINDING);
            protocolMarshaller.marshall(reportSetting.getAccounts(), ACCOUNTS_BINDING);
            protocolMarshaller.marshall(reportSetting.getOrganizationUnits(), ORGANIZATIONUNITS_BINDING);
            protocolMarshaller.marshall(reportSetting.getRegions(), REGIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
