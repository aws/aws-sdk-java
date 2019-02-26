/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ModifyDBSubnetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBSubnetGroupRequestMarshaller implements Marshaller<Request<ModifyDBSubnetGroupRequest>, ModifyDBSubnetGroupRequest> {

    public Request<ModifyDBSubnetGroupRequest> marshall(ModifyDBSubnetGroupRequest modifyDBSubnetGroupRequest) {

        if (modifyDBSubnetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBSubnetGroupRequest> request = new DefaultRequest<ModifyDBSubnetGroupRequest>(modifyDBSubnetGroupRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBSubnetGroup");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBSubnetGroupRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(modifyDBSubnetGroupRequest.getDBSubnetGroupName()));
        }

        if (modifyDBSubnetGroupRequest.getDBSubnetGroupDescription() != null) {
            request.addParameter("DBSubnetGroupDescription", StringUtils.fromString(modifyDBSubnetGroupRequest.getDBSubnetGroupDescription()));
        }

        if (!modifyDBSubnetGroupRequest.getSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBSubnetGroupRequest.getSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBSubnetGroupRequest
                    .getSubnetIds();
            int subnetIdsListIndex = 1;

            for (String subnetIdsListValue : subnetIdsList) {
                if (subnetIdsListValue != null) {
                    request.addParameter("SubnetIds.SubnetIdentifier." + subnetIdsListIndex, StringUtils.fromString(subnetIdsListValue));
                }
                subnetIdsListIndex++;
            }
        }

        return request;
    }

}
