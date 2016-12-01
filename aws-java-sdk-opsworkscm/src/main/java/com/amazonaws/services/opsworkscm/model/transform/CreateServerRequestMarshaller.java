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
 * CreateServerRequest Marshaller
 */
public class CreateServerRequestMarshaller implements Marshaller<Request<CreateServerRequest>, CreateServerRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateServerRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateServerRequest> marshall(CreateServerRequest createServerRequest) {

        if (createServerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateServerRequest> request = new DefaultRequest<CreateServerRequest>(createServerRequest, "AWSOpsWorksCM");
        request.addHeader("X-Amz-Target", "OpsWorksCM_V2016_11_01.CreateServer");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createServerRequest.getDisableAutomatedBackup() != null) {
                jsonGenerator.writeFieldName("DisableAutomatedBackup").writeValue(createServerRequest.getDisableAutomatedBackup());
            }
            if (createServerRequest.getEngine() != null) {
                jsonGenerator.writeFieldName("Engine").writeValue(createServerRequest.getEngine());
            }
            if (createServerRequest.getEngineModel() != null) {
                jsonGenerator.writeFieldName("EngineModel").writeValue(createServerRequest.getEngineModel());
            }
            if (createServerRequest.getEngineVersion() != null) {
                jsonGenerator.writeFieldName("EngineVersion").writeValue(createServerRequest.getEngineVersion());
            }

            java.util.List<EngineAttribute> engineAttributesList = createServerRequest.getEngineAttributes();
            if (engineAttributesList != null) {
                jsonGenerator.writeFieldName("EngineAttributes");
                jsonGenerator.writeStartArray();
                for (EngineAttribute engineAttributesListValue : engineAttributesList) {
                    if (engineAttributesListValue != null) {

                        EngineAttributeJsonMarshaller.getInstance().marshall(engineAttributesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createServerRequest.getBackupRetentionCount() != null) {
                jsonGenerator.writeFieldName("BackupRetentionCount").writeValue(createServerRequest.getBackupRetentionCount());
            }
            if (createServerRequest.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(createServerRequest.getServerName());
            }
            if (createServerRequest.getInstanceProfileArn() != null) {
                jsonGenerator.writeFieldName("InstanceProfileArn").writeValue(createServerRequest.getInstanceProfileArn());
            }
            if (createServerRequest.getInstanceType() != null) {
                jsonGenerator.writeFieldName("InstanceType").writeValue(createServerRequest.getInstanceType());
            }
            if (createServerRequest.getKeyPair() != null) {
                jsonGenerator.writeFieldName("KeyPair").writeValue(createServerRequest.getKeyPair());
            }
            if (createServerRequest.getPreferredMaintenanceWindow() != null) {
                jsonGenerator.writeFieldName("PreferredMaintenanceWindow").writeValue(createServerRequest.getPreferredMaintenanceWindow());
            }
            if (createServerRequest.getPreferredBackupWindow() != null) {
                jsonGenerator.writeFieldName("PreferredBackupWindow").writeValue(createServerRequest.getPreferredBackupWindow());
            }

            java.util.List<String> securityGroupIdsList = createServerRequest.getSecurityGroupIds();
            if (securityGroupIdsList != null) {
                jsonGenerator.writeFieldName("SecurityGroupIds");
                jsonGenerator.writeStartArray();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(securityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createServerRequest.getServiceRoleArn() != null) {
                jsonGenerator.writeFieldName("ServiceRoleArn").writeValue(createServerRequest.getServiceRoleArn());
            }

            java.util.List<String> subnetIdsList = createServerRequest.getSubnetIds();
            if (subnetIdsList != null) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createServerRequest.getBackupId() != null) {
                jsonGenerator.writeFieldName("BackupId").writeValue(createServerRequest.getBackupId());
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
