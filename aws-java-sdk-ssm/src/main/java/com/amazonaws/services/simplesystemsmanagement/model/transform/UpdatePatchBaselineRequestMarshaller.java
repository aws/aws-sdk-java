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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * UpdatePatchBaselineRequest Marshaller
 */
public class UpdatePatchBaselineRequestMarshaller implements Marshaller<Request<UpdatePatchBaselineRequest>, UpdatePatchBaselineRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdatePatchBaselineRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdatePatchBaselineRequest> marshall(UpdatePatchBaselineRequest updatePatchBaselineRequest) {

        if (updatePatchBaselineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdatePatchBaselineRequest> request = new DefaultRequest<UpdatePatchBaselineRequest>(updatePatchBaselineRequest, "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.UpdatePatchBaseline");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updatePatchBaselineRequest.getBaselineId() != null) {
                jsonGenerator.writeFieldName("BaselineId").writeValue(updatePatchBaselineRequest.getBaselineId());
            }
            if (updatePatchBaselineRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(updatePatchBaselineRequest.getName());
            }
            if (updatePatchBaselineRequest.getGlobalFilters() != null) {
                jsonGenerator.writeFieldName("GlobalFilters");
                PatchFilterGroupJsonMarshaller.getInstance().marshall(updatePatchBaselineRequest.getGlobalFilters(), jsonGenerator);
            }
            if (updatePatchBaselineRequest.getApprovalRules() != null) {
                jsonGenerator.writeFieldName("ApprovalRules");
                PatchRuleGroupJsonMarshaller.getInstance().marshall(updatePatchBaselineRequest.getApprovalRules(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> approvedPatchesList = (com.amazonaws.internal.SdkInternalList<String>) updatePatchBaselineRequest
                    .getApprovedPatches();
            if (!approvedPatchesList.isEmpty() || !approvedPatchesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ApprovedPatches");
                jsonGenerator.writeStartArray();
                for (String approvedPatchesListValue : approvedPatchesList) {
                    if (approvedPatchesListValue != null) {
                        jsonGenerator.writeValue(approvedPatchesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> rejectedPatchesList = (com.amazonaws.internal.SdkInternalList<String>) updatePatchBaselineRequest
                    .getRejectedPatches();
            if (!rejectedPatchesList.isEmpty() || !rejectedPatchesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("RejectedPatches");
                jsonGenerator.writeStartArray();
                for (String rejectedPatchesListValue : rejectedPatchesList) {
                    if (rejectedPatchesListValue != null) {
                        jsonGenerator.writeValue(rejectedPatchesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (updatePatchBaselineRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(updatePatchBaselineRequest.getDescription());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
