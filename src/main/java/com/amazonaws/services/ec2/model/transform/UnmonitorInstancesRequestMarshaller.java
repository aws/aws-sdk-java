/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Unmonitor Instances Request Marshaller
 */
public class UnmonitorInstancesRequestMarshaller implements Marshaller<Request<UnmonitorInstancesRequest>, UnmonitorInstancesRequest> {

    public Request<UnmonitorInstancesRequest> marshall(UnmonitorInstancesRequest unmonitorInstancesRequest) {
        Request<UnmonitorInstancesRequest> request = new DefaultRequest<UnmonitorInstancesRequest>(unmonitorInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "UnmonitorInstances");
        request.addParameter("Version", "2010-08-31");
        if (unmonitorInstancesRequest != null) {
            java.util.List<String> instanceIdsList = unmonitorInstancesRequest.getInstanceIds();
            int instanceIdsListIndex = 1;
            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(instanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }


        return request;
    }
}
