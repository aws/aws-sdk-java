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
 * ModifyDBClusterSnapshotAttributeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterSnapshotAttributeRequestMarshaller implements
        Marshaller<Request<ModifyDBClusterSnapshotAttributeRequest>, ModifyDBClusterSnapshotAttributeRequest> {

    public Request<ModifyDBClusterSnapshotAttributeRequest> marshall(ModifyDBClusterSnapshotAttributeRequest modifyDBClusterSnapshotAttributeRequest) {

        if (modifyDBClusterSnapshotAttributeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyDBClusterSnapshotAttributeRequest> request = new DefaultRequest<ModifyDBClusterSnapshotAttributeRequest>(
                modifyDBClusterSnapshotAttributeRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyDBClusterSnapshotAttribute");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyDBClusterSnapshotAttributeRequest.getDBClusterSnapshotIdentifier() != null) {
            request.addParameter("DBClusterSnapshotIdentifier",
                    StringUtils.fromString(modifyDBClusterSnapshotAttributeRequest.getDBClusterSnapshotIdentifier()));
        }

        if (modifyDBClusterSnapshotAttributeRequest.getAttributeName() != null) {
            request.addParameter("AttributeName", StringUtils.fromString(modifyDBClusterSnapshotAttributeRequest.getAttributeName()));
        }

        if (!modifyDBClusterSnapshotAttributeRequest.getValuesToAdd().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterSnapshotAttributeRequest.getValuesToAdd()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> valuesToAddList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterSnapshotAttributeRequest
                    .getValuesToAdd();
            int valuesToAddListIndex = 1;

            for (String valuesToAddListValue : valuesToAddList) {
                if (valuesToAddListValue != null) {
                    request.addParameter("ValuesToAdd.AttributeValue." + valuesToAddListIndex, StringUtils.fromString(valuesToAddListValue));
                }
                valuesToAddListIndex++;
            }
        }

        if (!modifyDBClusterSnapshotAttributeRequest.getValuesToRemove().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterSnapshotAttributeRequest.getValuesToRemove()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> valuesToRemoveList = (com.amazonaws.internal.SdkInternalList<String>) modifyDBClusterSnapshotAttributeRequest
                    .getValuesToRemove();
            int valuesToRemoveListIndex = 1;

            for (String valuesToRemoveListValue : valuesToRemoveList) {
                if (valuesToRemoveListValue != null) {
                    request.addParameter("ValuesToRemove.AttributeValue." + valuesToRemoveListIndex, StringUtils.fromString(valuesToRemoveListValue));
                }
                valuesToRemoveListIndex++;
            }
        }

        return request;
    }

}
