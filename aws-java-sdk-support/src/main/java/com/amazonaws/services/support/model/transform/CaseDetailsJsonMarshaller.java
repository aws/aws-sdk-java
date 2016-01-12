/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.support.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CaseDetailsMarshaller
 */
public class CaseDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(CaseDetails caseDetails, JSONWriter jsonWriter) {
        if (caseDetails == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (caseDetails.getCaseId() != null) {
                jsonWriter.key("caseId").value(caseDetails.getCaseId());
            }

            if (caseDetails.getDisplayId() != null) {
                jsonWriter.key("displayId").value(caseDetails.getDisplayId());
            }

            if (caseDetails.getSubject() != null) {
                jsonWriter.key("subject").value(caseDetails.getSubject());
            }

            if (caseDetails.getStatus() != null) {
                jsonWriter.key("status").value(caseDetails.getStatus());
            }

            if (caseDetails.getServiceCode() != null) {
                jsonWriter.key("serviceCode").value(
                        caseDetails.getServiceCode());
            }

            if (caseDetails.getCategoryCode() != null) {
                jsonWriter.key("categoryCode").value(
                        caseDetails.getCategoryCode());
            }

            if (caseDetails.getSeverityCode() != null) {
                jsonWriter.key("severityCode").value(
                        caseDetails.getSeverityCode());
            }

            if (caseDetails.getSubmittedBy() != null) {
                jsonWriter.key("submittedBy").value(
                        caseDetails.getSubmittedBy());
            }

            if (caseDetails.getTimeCreated() != null) {
                jsonWriter.key("timeCreated").value(
                        caseDetails.getTimeCreated());
            }

            if (caseDetails.getRecentCommunications() != null) {
                jsonWriter.key("recentCommunications");
                RecentCaseCommunicationsJsonMarshaller.getInstance().marshall(
                        caseDetails.getRecentCommunications(), jsonWriter);
            }

            com.amazonaws.internal.SdkInternalList<String> ccEmailAddressesList = (com.amazonaws.internal.SdkInternalList<String>) caseDetails
                    .getCcEmailAddresses();
            if (!ccEmailAddressesList.isEmpty()
                    || !ccEmailAddressesList.isAutoConstruct()) {
                jsonWriter.key("ccEmailAddresses");
                jsonWriter.array();
                for (String ccEmailAddressesListValue : ccEmailAddressesList) {
                    if (ccEmailAddressesListValue != null) {
                        jsonWriter.value(ccEmailAddressesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (caseDetails.getLanguage() != null) {
                jsonWriter.key("language").value(caseDetails.getLanguage());
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CaseDetailsJsonMarshaller instance;

    public static CaseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CaseDetailsJsonMarshaller();
        return instance;
    }

}
