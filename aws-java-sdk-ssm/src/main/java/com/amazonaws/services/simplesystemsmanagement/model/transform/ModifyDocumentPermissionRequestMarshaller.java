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
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ModifyDocumentPermissionRequest Marshaller
 */
public class ModifyDocumentPermissionRequestMarshaller implements Marshaller<Request<ModifyDocumentPermissionRequest>, ModifyDocumentPermissionRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ModifyDocumentPermissionRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ModifyDocumentPermissionRequest> marshall(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest) {

        if (modifyDocumentPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDocumentPermissionRequest> request = new DefaultRequest<ModifyDocumentPermissionRequest>(modifyDocumentPermissionRequest,
                "AWSSimpleSystemsManagement");
        request.addHeader("X-Amz-Target", "AmazonSSM.ModifyDocumentPermission");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (modifyDocumentPermissionRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(modifyDocumentPermissionRequest.getName());
            }
            if (modifyDocumentPermissionRequest.getPermissionType() != null) {
                jsonGenerator.writeFieldName("PermissionType").writeValue(modifyDocumentPermissionRequest.getPermissionType());
            }

            com.amazonaws.internal.SdkInternalList<String> accountIdsToAddList = (com.amazonaws.internal.SdkInternalList<String>) modifyDocumentPermissionRequest
                    .getAccountIdsToAdd();
            if (!accountIdsToAddList.isEmpty() || !accountIdsToAddList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AccountIdsToAdd");
                jsonGenerator.writeStartArray();
                for (String accountIdsToAddListValue : accountIdsToAddList) {
                    if (accountIdsToAddListValue != null) {
                        jsonGenerator.writeValue(accountIdsToAddListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> accountIdsToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyDocumentPermissionRequest
                    .getAccountIdsToRemove();
            if (!accountIdsToRemoveList.isEmpty() || !accountIdsToRemoveList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AccountIdsToRemove");
                jsonGenerator.writeStartArray();
                for (String accountIdsToRemoveListValue : accountIdsToRemoveList) {
                    if (accountIdsToRemoveListValue != null) {
                        jsonGenerator.writeValue(accountIdsToRemoveListValue);
                    }
                }
                jsonGenerator.writeEndArray();
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
