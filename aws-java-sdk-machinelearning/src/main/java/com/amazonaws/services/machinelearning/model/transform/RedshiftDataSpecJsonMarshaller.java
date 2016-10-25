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
 * RedshiftDataSpecMarshaller
 */
public class RedshiftDataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RedshiftDataSpec redshiftDataSpec, StructuredJsonGenerator jsonGenerator) {

        if (redshiftDataSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (redshiftDataSpec.getDatabaseInformation() != null) {
                jsonGenerator.writeFieldName("DatabaseInformation");
                RedshiftDatabaseJsonMarshaller.getInstance().marshall(redshiftDataSpec.getDatabaseInformation(), jsonGenerator);
            }
            if (redshiftDataSpec.getSelectSqlQuery() != null) {
                jsonGenerator.writeFieldName("SelectSqlQuery").writeValue(redshiftDataSpec.getSelectSqlQuery());
            }
            if (redshiftDataSpec.getDatabaseCredentials() != null) {
                jsonGenerator.writeFieldName("DatabaseCredentials");
                RedshiftDatabaseCredentialsJsonMarshaller.getInstance().marshall(redshiftDataSpec.getDatabaseCredentials(), jsonGenerator);
            }
            if (redshiftDataSpec.getS3StagingLocation() != null) {
                jsonGenerator.writeFieldName("S3StagingLocation").writeValue(redshiftDataSpec.getS3StagingLocation());
            }
            if (redshiftDataSpec.getDataRearrangement() != null) {
                jsonGenerator.writeFieldName("DataRearrangement").writeValue(redshiftDataSpec.getDataRearrangement());
            }
            if (redshiftDataSpec.getDataSchema() != null) {
                jsonGenerator.writeFieldName("DataSchema").writeValue(redshiftDataSpec.getDataSchema());
            }
            if (redshiftDataSpec.getDataSchemaUri() != null) {
                jsonGenerator.writeFieldName("DataSchemaUri").writeValue(redshiftDataSpec.getDataSchemaUri());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RedshiftDataSpecJsonMarshaller instance;

    public static RedshiftDataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDataSpecJsonMarshaller();
        return instance;
    }

}
