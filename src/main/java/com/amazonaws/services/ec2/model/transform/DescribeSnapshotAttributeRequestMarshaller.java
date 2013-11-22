/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Snapshot Attribute Request Marshaller
 */
public class DescribeSnapshotAttributeRequestMarshaller implements Marshaller<Request<DescribeSnapshotAttributeRequest>, DescribeSnapshotAttributeRequest> {

    public Request<DescribeSnapshotAttributeRequest> marshall(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) {

        if (describeSnapshotAttributeRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeSnapshotAttributeRequest> request = new DefaultRequest<DescribeSnapshotAttributeRequest>(describeSnapshotAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSnapshotAttribute");
        request.addParameter("Version", "2013-10-15");

        if (describeSnapshotAttributeRequest.getSnapshotId() != null) {
            request.addParameter("SnapshotId", StringUtils.fromString(describeSnapshotAttributeRequest.getSnapshotId()));
        }
        if (describeSnapshotAttributeRequest.getAttribute() != null) {
            request.addParameter("Attribute", StringUtils.fromString(describeSnapshotAttributeRequest.getAttribute()));
        }


        return request;
    }
}
