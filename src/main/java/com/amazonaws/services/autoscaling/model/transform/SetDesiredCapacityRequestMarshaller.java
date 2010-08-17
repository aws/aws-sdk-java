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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Set Desired Capacity Request Marshaller
 */
public class SetDesiredCapacityRequestMarshaller implements Marshaller<Request<SetDesiredCapacityRequest>, SetDesiredCapacityRequest> {

    public Request<SetDesiredCapacityRequest> marshall(SetDesiredCapacityRequest setDesiredCapacityRequest) {
        Request<SetDesiredCapacityRequest> request = new DefaultRequest<SetDesiredCapacityRequest>(setDesiredCapacityRequest, "AmazonAutoScaling");
        request.addParameter("Action", "SetDesiredCapacity");
        request.addParameter("Version", "2009-05-15");
        if (setDesiredCapacityRequest != null) {
            if (setDesiredCapacityRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(setDesiredCapacityRequest.getAutoScalingGroupName()));
            }
        }
        if (setDesiredCapacityRequest != null) {
            if (setDesiredCapacityRequest.getDesiredCapacity() != null) {
                request.addParameter("DesiredCapacity", StringUtils.fromInteger(setDesiredCapacityRequest.getDesiredCapacity()));
            }
        }


        return request;
    }
}
