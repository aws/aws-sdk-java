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

package com.amazonaws.services.machinelearning.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * RDSDataSpecMarshaller
 */
public class RDSDataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(RDSDataSpec rDSDataSpec, JSONWriter jsonWriter) {
        if (rDSDataSpec == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (rDSDataSpec.getDatabaseInformation() != null) {
                jsonWriter.key("DatabaseInformation");
                RDSDatabaseJsonMarshaller.getInstance().marshall(
                        rDSDataSpec.getDatabaseInformation(), jsonWriter);
            }

            if (rDSDataSpec.getSelectSqlQuery() != null) {
                jsonWriter.key("SelectSqlQuery").value(
                        rDSDataSpec.getSelectSqlQuery());
            }

            if (rDSDataSpec.getDatabaseCredentials() != null) {
                jsonWriter.key("DatabaseCredentials");
                RDSDatabaseCredentialsJsonMarshaller.getInstance().marshall(
                        rDSDataSpec.getDatabaseCredentials(), jsonWriter);
            }

            if (rDSDataSpec.getS3StagingLocation() != null) {
                jsonWriter.key("S3StagingLocation").value(
                        rDSDataSpec.getS3StagingLocation());
            }

            if (rDSDataSpec.getDataRearrangement() != null) {
                jsonWriter.key("DataRearrangement").value(
                        rDSDataSpec.getDataRearrangement());
            }

            if (rDSDataSpec.getDataSchema() != null) {
                jsonWriter.key("DataSchema").value(rDSDataSpec.getDataSchema());
            }

            if (rDSDataSpec.getDataSchemaUri() != null) {
                jsonWriter.key("DataSchemaUri").value(
                        rDSDataSpec.getDataSchemaUri());
            }

            if (rDSDataSpec.getResourceRole() != null) {
                jsonWriter.key("ResourceRole").value(
                        rDSDataSpec.getResourceRole());
            }

            if (rDSDataSpec.getServiceRole() != null) {
                jsonWriter.key("ServiceRole").value(
                        rDSDataSpec.getServiceRole());
            }

            if (rDSDataSpec.getSubnetId() != null) {
                jsonWriter.key("SubnetId").value(rDSDataSpec.getSubnetId());
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) rDSDataSpec
                    .getSecurityGroupIds();
            if (!securityGroupIdsList.isEmpty()
                    || !securityGroupIdsList.isAutoConstruct()) {
                jsonWriter.key("SecurityGroupIds");
                jsonWriter.array();
                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        jsonWriter.value(securityGroupIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RDSDataSpecJsonMarshaller instance;

    public static RDSDataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RDSDataSpecJsonMarshaller();
        return instance;
    }

}
