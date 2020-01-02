/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RegisterDBProxyTargetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterDBProxyTargetsRequestMarshaller implements Marshaller<Request<RegisterDBProxyTargetsRequest>, RegisterDBProxyTargetsRequest> {

    public Request<RegisterDBProxyTargetsRequest> marshall(RegisterDBProxyTargetsRequest registerDBProxyTargetsRequest) {

        if (registerDBProxyTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterDBProxyTargetsRequest> request = new DefaultRequest<RegisterDBProxyTargetsRequest>(registerDBProxyTargetsRequest, "AmazonRDS");
        request.addParameter("Action", "RegisterDBProxyTargets");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (registerDBProxyTargetsRequest.getDBProxyName() != null) {
            request.addParameter("DBProxyName", StringUtils.fromString(registerDBProxyTargetsRequest.getDBProxyName()));
        }

        if (registerDBProxyTargetsRequest.getTargetGroupName() != null) {
            request.addParameter("TargetGroupName", StringUtils.fromString(registerDBProxyTargetsRequest.getTargetGroupName()));
        }

        if (!registerDBProxyTargetsRequest.getDBInstanceIdentifiers().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) registerDBProxyTargetsRequest.getDBInstanceIdentifiers()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dBInstanceIdentifiersList = (com.amazonaws.internal.SdkInternalList<String>) registerDBProxyTargetsRequest
                    .getDBInstanceIdentifiers();
            int dBInstanceIdentifiersListIndex = 1;

            for (String dBInstanceIdentifiersListValue : dBInstanceIdentifiersList) {
                if (dBInstanceIdentifiersListValue != null) {
                    request.addParameter("DBInstanceIdentifiers.member." + dBInstanceIdentifiersListIndex,
                            StringUtils.fromString(dBInstanceIdentifiersListValue));
                }
                dBInstanceIdentifiersListIndex++;
            }
        }

        if (!registerDBProxyTargetsRequest.getDBClusterIdentifiers().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) registerDBProxyTargetsRequest.getDBClusterIdentifiers()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> dBClusterIdentifiersList = (com.amazonaws.internal.SdkInternalList<String>) registerDBProxyTargetsRequest
                    .getDBClusterIdentifiers();
            int dBClusterIdentifiersListIndex = 1;

            for (String dBClusterIdentifiersListValue : dBClusterIdentifiersList) {
                if (dBClusterIdentifiersListValue != null) {
                    request.addParameter("DBClusterIdentifiers.member." + dBClusterIdentifiersListIndex, StringUtils.fromString(dBClusterIdentifiersListValue));
                }
                dBClusterIdentifiersListIndex++;
            }
        }

        return request;
    }

}
