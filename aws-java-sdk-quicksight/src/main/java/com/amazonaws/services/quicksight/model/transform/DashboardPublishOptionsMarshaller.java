/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DashboardPublishOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DashboardPublishOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> ADHOCFILTERINGOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdHocFilteringOption").build();
    private static final MarshallingInfo<StructuredPojo> EXPORTTOCSVOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportToCSVOption").build();
    private static final MarshallingInfo<StructuredPojo> SHEETCONTROLSOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SheetControlsOption").build();

    private static final DashboardPublishOptionsMarshaller instance = new DashboardPublishOptionsMarshaller();

    public static DashboardPublishOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DashboardPublishOptions dashboardPublishOptions, ProtocolMarshaller protocolMarshaller) {

        if (dashboardPublishOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dashboardPublishOptions.getAdHocFilteringOption(), ADHOCFILTERINGOPTION_BINDING);
            protocolMarshaller.marshall(dashboardPublishOptions.getExportToCSVOption(), EXPORTTOCSVOPTION_BINDING);
            protocolMarshaller.marshall(dashboardPublishOptions.getSheetControlsOption(), SHEETCONTROLSOPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
