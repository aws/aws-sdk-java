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
package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * RDSDataSpecMarshaller
 */
public class RDSDataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RDSDataSpec rDSDataSpec, StructuredJsonGenerator jsonGenerator) {

        if (rDSDataSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (rDSDataSpec.getDatabaseInformation() != null) {
                jsonGenerator.writeFieldName("DatabaseInformation");
                RDSDatabaseJsonMarshaller.getInstance().marshall(rDSDataSpec.getDatabaseInformation(), jsonGenerator);
            }
            if (rDSDataSpec.getSelectSqlQuery() != null) {
                jsonGenerator.writeFieldName("SelectSqlQuery").writeValue(rDSDataSpec.getSelectSqlQuery());
            }
            if (rDSDataSpec.getDatabaseCredentials() != null) {
                jsonGenerator.writeFieldName("DatabaseCredentials");
                RDSDatabaseCredentialsJsonMarshaller.getInstance().marshall(rDSDataSpec.getDatabaseCredentials(), jsonGenerator);
            }
            if (rDSDataSpec.getS3StagingLocation() != null) {
                jsonGenerator.writeFieldName("S3StagingLocation").writeValue(rDSDataSpec.getS3StagingLocation());
            }
            if (rDSDataSpec.getDataRearrangement() != null) {
                jsonGenerator.writeFieldName("DataRearrangement").writeValue(rDSDataSpec.getDataRearrangement());
            }
            if (rDSDataSpec.getDataSchema() != null) {
                jsonGenerator.writeFieldName("DataSchema").writeValue(rDSDataSpec.getDataSchema());
            }
            if (rDSDataSpec.getDataSchemaUri() != null) {
                jsonGenerator.writeFieldName("DataSchemaUri").writeValue(rDSDataSpec.getDataSchemaUri());
            }
            if (rDSDataSpec.getResourceRole() != null) {
                jsonGenerator.writeFieldName("ResourceRole").writeValue(rDSDataSpec.getResourceRole());
            }
            if (rDSDataSpec.getServiceRole() != null) {
                jsonGenerator.writeFieldName("ServiceRole").writeValue(rDSDataSpec.getServiceRole());
            }
            if (rDSDataSpec.getSubnetId() != null) {
                jsonGenerator.writeFieldName("SubnetId").writeValue(rDSDataSpec.getSubnetId());
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) rDSDataSpec
                    .getSecurityGroupIds();
            if (!securityGroupIdsList.isEmpty() || !securityGroupIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SecurityGroupIds");
                jsonGenerator.writeStartArray();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonGenerator.writeValue(securityGroupIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RDSDataSpecJsonMarshaller instance;

    public static RDSDataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RDSDataSpecJsonMarshaller();
        return instance;
    }

}
