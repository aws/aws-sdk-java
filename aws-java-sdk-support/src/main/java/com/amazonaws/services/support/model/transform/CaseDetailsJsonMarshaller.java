/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CaseDetailsMarshaller
 */
public class CaseDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CaseDetails caseDetails, StructuredJsonGenerator jsonGenerator) {

        if (caseDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (caseDetails.getCaseId() != null) {
                jsonGenerator.writeFieldName("caseId").writeValue(caseDetails.getCaseId());
            }
            if (caseDetails.getDisplayId() != null) {
                jsonGenerator.writeFieldName("displayId").writeValue(caseDetails.getDisplayId());
            }
            if (caseDetails.getSubject() != null) {
                jsonGenerator.writeFieldName("subject").writeValue(caseDetails.getSubject());
            }
            if (caseDetails.getStatus() != null) {
                jsonGenerator.writeFieldName("status").writeValue(caseDetails.getStatus());
            }
            if (caseDetails.getServiceCode() != null) {
                jsonGenerator.writeFieldName("serviceCode").writeValue(caseDetails.getServiceCode());
            }
            if (caseDetails.getCategoryCode() != null) {
                jsonGenerator.writeFieldName("categoryCode").writeValue(caseDetails.getCategoryCode());
            }
            if (caseDetails.getSeverityCode() != null) {
                jsonGenerator.writeFieldName("severityCode").writeValue(caseDetails.getSeverityCode());
            }
            if (caseDetails.getSubmittedBy() != null) {
                jsonGenerator.writeFieldName("submittedBy").writeValue(caseDetails.getSubmittedBy());
            }
            if (caseDetails.getTimeCreated() != null) {
                jsonGenerator.writeFieldName("timeCreated").writeValue(caseDetails.getTimeCreated());
            }
            if (caseDetails.getRecentCommunications() != null) {
                jsonGenerator.writeFieldName("recentCommunications");
                RecentCaseCommunicationsJsonMarshaller.getInstance().marshall(caseDetails.getRecentCommunications(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> ccEmailAddressesList = (com.amazonaws.internal.SdkInternalList<String>) caseDetails
                    .getCcEmailAddresses();
            if (!ccEmailAddressesList.isEmpty() || !ccEmailAddressesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ccEmailAddresses");
                jsonGenerator.writeStartArray();
                for (String ccEmailAddressesListValue : ccEmailAddressesList) {
                    if (ccEmailAddressesListValue != null) {
                        jsonGenerator.writeValue(ccEmailAddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (caseDetails.getLanguage() != null) {
                jsonGenerator.writeFieldName("language").writeValue(caseDetails.getLanguage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CaseDetailsJsonMarshaller instance;

    public static CaseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaseDetailsJsonMarshaller();
        return instance;
    }

}
