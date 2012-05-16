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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Verify Domain Identity Request Marshaller
 */
public class VerifyDomainIdentityRequestMarshaller implements Marshaller<Request<VerifyDomainIdentityRequest>, VerifyDomainIdentityRequest> {

    public Request<VerifyDomainIdentityRequest> marshall(VerifyDomainIdentityRequest verifyDomainIdentityRequest) {

        if (verifyDomainIdentityRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<VerifyDomainIdentityRequest> request = new DefaultRequest<VerifyDomainIdentityRequest>(verifyDomainIdentityRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "VerifyDomainIdentity");
        request.addParameter("Version", "2010-12-01");

        if (verifyDomainIdentityRequest.getDomain() != null) {
            request.addParameter("Domain", StringUtils.fromString(verifyDomainIdentityRequest.getDomain()));
        }


        return request;
    }
}
