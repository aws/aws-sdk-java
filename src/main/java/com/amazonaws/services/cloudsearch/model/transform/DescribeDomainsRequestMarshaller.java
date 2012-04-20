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
 * Describe Domains Request Marshaller
 */
public class DescribeDomainsRequestMarshaller implements Marshaller<Request<DescribeDomainsRequest>, DescribeDomainsRequest> {

    public Request<DescribeDomainsRequest> marshall(DescribeDomainsRequest describeDomainsRequest) {

        if (describeDomainsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeDomainsRequest> request = new DefaultRequest<DescribeDomainsRequest>(describeDomainsRequest, "AmazonCloudSearch");
        request.addParameter("Action", "DescribeDomains");
        request.addParameter("Version", "2011-02-01");


        java.util.List<String> domainNamesList = describeDomainsRequest.getDomainNames();
        int domainNamesListIndex = 1;

        for (String domainNamesListValue : domainNamesList) {
            if (domainNamesListValue != null) {
                request.addParameter("DomainNames.member." + domainNamesListIndex, StringUtils.fromString(domainNamesListValue));
            }

            domainNamesListIndex++;
        }


        return request;
    }
}
