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
package com.amazonaws.services.opsworkscm.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.opsworkscm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * UpdateServerRequest Marshaller
 */
public class UpdateServerRequestMarshaller implements Marshaller<Request<UpdateServerRequest>, UpdateServerRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public UpdateServerRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateServerRequest> marshall(UpdateServerRequest updateServerRequest) {

        if (updateServerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateServerRequest> request = new DefaultRequest<UpdateServerRequest>(updateServerRequest, "AWSOpsWorksCM");
        request.addHeader("X-Amz-Target", "OpsWorksCM_V2016_11_01.UpdateServer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (updateServerRequest.getDisableAutomatedBackup() != null) {
                jsonGenerator.writeFieldName("DisableAutomatedBackup").writeValue(updateServerRequest.getDisableAutomatedBackup());
            }
            if (updateServerRequest.getBackupRetentionCount() != null) {
                jsonGenerator.writeFieldName("BackupRetentionCount").writeValue(updateServerRequest.getBackupRetentionCount());
            }
            if (updateServerRequest.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(updateServerRequest.getServerName());
            }
            if (updateServerRequest.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow").writeValue(updateServerRequest.getPreferredMaintenanceWindow());
            }
            if (updateServerRequest.getPreferredBackupWindow() != null) {
                jsonGenerator.writeFieldName("PreferredBackupWindow").writeValue(updateServerRequest.getPreferredBackupWindow());
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
