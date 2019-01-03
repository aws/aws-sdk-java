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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * MonitorInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitorInstancesRequestMarshaller implements Marshaller<Request<MonitorInstancesRequest>, MonitorInstancesRequest> {

    public Request<MonitorInstancesRequest> marshall(MonitorInstancesRequest monitorInstancesRequest) {

        if (monitorInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<MonitorInstancesRequest> request = new DefaultRequest<MonitorInstancesRequest>(monitorInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "MonitorInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> monitorInstancesRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) monitorInstancesRequest
                .getInstanceIds();
        if (!monitorInstancesRequestInstanceIdsList.isEmpty() || !monitorInstancesRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String monitorInstancesRequestInstanceIdsListValue : monitorInstancesRequestInstanceIdsList) {
                if (monitorInstancesRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(monitorInstancesRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        return request;
    }

}
