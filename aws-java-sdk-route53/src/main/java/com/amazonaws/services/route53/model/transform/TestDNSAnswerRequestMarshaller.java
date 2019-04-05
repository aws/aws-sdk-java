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
package com.amazonaws.services.route53.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

/**
 * TestDNSAnswerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestDNSAnswerRequestMarshaller implements Marshaller<Request<TestDNSAnswerRequest>, TestDNSAnswerRequest> {

    public Request<TestDNSAnswerRequest> marshall(TestDNSAnswerRequest testDNSAnswerRequest) {

        if (testDNSAnswerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TestDNSAnswerRequest> request = new DefaultRequest<TestDNSAnswerRequest>(testDNSAnswerRequest, "AmazonRoute53");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-04-01/testdnsanswer";

        request.setResourcePath(uriResourcePath);

        if (testDNSAnswerRequest.getHostedZoneId() != null) {
            request.addParameter("hostedzoneid", StringUtils.fromString(testDNSAnswerRequest.getHostedZoneId()));
        }

        if (testDNSAnswerRequest.getRecordName() != null) {
            request.addParameter("recordname", StringUtils.fromString(testDNSAnswerRequest.getRecordName()));
        }

        if (testDNSAnswerRequest.getRecordType() != null) {
            request.addParameter("recordtype", StringUtils.fromString(testDNSAnswerRequest.getRecordType()));
        }

        if (testDNSAnswerRequest.getResolverIP() != null) {
            request.addParameter("resolverip", StringUtils.fromString(testDNSAnswerRequest.getResolverIP()));
        }

        if (testDNSAnswerRequest.getEDNS0ClientSubnetIP() != null) {
            request.addParameter("edns0clientsubnetip", StringUtils.fromString(testDNSAnswerRequest.getEDNS0ClientSubnetIP()));
        }

        if (testDNSAnswerRequest.getEDNS0ClientSubnetMask() != null) {
            request.addParameter("edns0clientsubnetmask", StringUtils.fromString(testDNSAnswerRequest.getEDNS0ClientSubnetMask()));
        }

        return request;
    }

}
