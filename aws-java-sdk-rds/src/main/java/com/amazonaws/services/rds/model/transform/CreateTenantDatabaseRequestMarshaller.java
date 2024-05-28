/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateTenantDatabaseRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTenantDatabaseRequestMarshaller implements Marshaller<Request<CreateTenantDatabaseRequest>, CreateTenantDatabaseRequest> {

    public Request<CreateTenantDatabaseRequest> marshall(CreateTenantDatabaseRequest createTenantDatabaseRequest) {

        if (createTenantDatabaseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTenantDatabaseRequest> request = new DefaultRequest<CreateTenantDatabaseRequest>(createTenantDatabaseRequest, "AmazonRDS");
        request.addParameter("Action", "CreateTenantDatabase");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTenantDatabaseRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(createTenantDatabaseRequest.getDBInstanceIdentifier()));
        }

        if (createTenantDatabaseRequest.getTenantDBName() != null) {
            request.addParameter("TenantDBName", StringUtils.fromString(createTenantDatabaseRequest.getTenantDBName()));
        }

        if (createTenantDatabaseRequest.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils.fromString(createTenantDatabaseRequest.getMasterUsername()));
        }

        if (createTenantDatabaseRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword", StringUtils.fromString(createTenantDatabaseRequest.getMasterUserPassword()));
        }

        if (createTenantDatabaseRequest.getCharacterSetName() != null) {
            request.addParameter("CharacterSetName", StringUtils.fromString(createTenantDatabaseRequest.getCharacterSetName()));
        }

        if (createTenantDatabaseRequest.getNcharCharacterSetName() != null) {
            request.addParameter("NcharCharacterSetName", StringUtils.fromString(createTenantDatabaseRequest.getNcharCharacterSetName()));
        }

        if (!createTenantDatabaseRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) createTenantDatabaseRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createTenantDatabaseRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.Tag." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
