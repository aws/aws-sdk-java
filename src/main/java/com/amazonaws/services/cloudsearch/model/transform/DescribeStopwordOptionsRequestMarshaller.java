/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Stopword Options Request Marshaller
 */
public class DescribeStopwordOptionsRequestMarshaller implements Marshaller<Request<DescribeStopwordOptionsRequest>, DescribeStopwordOptionsRequest> {

    public Request<DescribeStopwordOptionsRequest> marshall(DescribeStopwordOptionsRequest describeStopwordOptionsRequest) {

        if (describeStopwordOptionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeStopwordOptionsRequest> request = new DefaultRequest<DescribeStopwordOptionsRequest>(describeStopwordOptionsRequest, "AmazonCloudSearch");
        request.addParameter("Action", "DescribeStopwordOptions");
        request.addParameter("Version", "2011-02-01");

        if (describeStopwordOptionsRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(describeStopwordOptionsRequest.getDomainName()));
        }


        return request;
    }
}
