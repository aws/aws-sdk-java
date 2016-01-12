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

package com.amazonaws.services.config.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * GetComplianceDetailsByResourceRequest Marshaller
 */
public class GetComplianceDetailsByResourceRequestMarshaller
        implements
        Marshaller<Request<GetComplianceDetailsByResourceRequest>, GetComplianceDetailsByResourceRequest> {

    public Request<GetComplianceDetailsByResourceRequest> marshall(
            GetComplianceDetailsByResourceRequest getComplianceDetailsByResourceRequest) {

        if (getComplianceDetailsByResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<GetComplianceDetailsByResourceRequest> request = new DefaultRequest<GetComplianceDetailsByResourceRequest>(
                getComplianceDetailsByResourceRequest, "AmazonConfig");
        request.addHeader("X-Amz-Target",
                "StarlingDoveService.GetComplianceDetailsByResource");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (getComplianceDetailsByResourceRequest.getResourceType() != null) {
                jsonWriter.key("ResourceType")
                        .value(getComplianceDetailsByResourceRequest
                                .getResourceType());
            }

            if (getComplianceDetailsByResourceRequest.getResourceId() != null) {
                jsonWriter.key("ResourceId").value(
                        getComplianceDetailsByResourceRequest.getResourceId());
            }

            com.amazonaws.internal.SdkInternalList<String> complianceTypesList = (com.amazonaws.internal.SdkInternalList<String>) getComplianceDetailsByResourceRequest
                    .getComplianceTypes();
            if (!complianceTypesList.isEmpty()
                    || !complianceTypesList.isAutoConstruct()) {
                jsonWriter.key("ComplianceTypes");
                jsonWriter.array();
                for (String complianceTypesListValue : complianceTypesList) {
                    if (complianceTypesListValue != null) {
                        jsonWriter.value(complianceTypesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            if (getComplianceDetailsByResourceRequest.getNextToken() != null) {
                jsonWriter.key("NextToken").value(
                        getComplianceDetailsByResourceRequest.getNextToken());
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
