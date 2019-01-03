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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyClusterSubnetGroupRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterSubnetGroupRequestMarshaller implements Marshaller<Request<ModifyClusterSubnetGroupRequest>, ModifyClusterSubnetGroupRequest> {

    public Request<ModifyClusterSubnetGroupRequest> marshall(ModifyClusterSubnetGroupRequest modifyClusterSubnetGroupRequest) {

        if (modifyClusterSubnetGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyClusterSubnetGroupRequest> request = new DefaultRequest<ModifyClusterSubnetGroupRequest>(modifyClusterSubnetGroupRequest,
                "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterSubnetGroup");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyClusterSubnetGroupRequest.getClusterSubnetGroupName() != null) {
            request.addParameter("ClusterSubnetGroupName", StringUtils.fromString(modifyClusterSubnetGroupRequest.getClusterSubnetGroupName()));
        }

        if (modifyClusterSubnetGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(modifyClusterSubnetGroupRequest.getDescription()));
        }

        if (!modifyClusterSubnetGroupRequest.getSubnetIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) modifyClusterSubnetGroupRequest.getSubnetIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) modifyClusterSubnetGroupRequest
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
