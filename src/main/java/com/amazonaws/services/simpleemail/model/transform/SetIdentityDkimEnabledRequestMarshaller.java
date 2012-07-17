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
 * Set Identity Dkim Enabled Request Marshaller
 */
public class SetIdentityDkimEnabledRequestMarshaller implements Marshaller<Request<SetIdentityDkimEnabledRequest>, SetIdentityDkimEnabledRequest> {

    public Request<SetIdentityDkimEnabledRequest> marshall(SetIdentityDkimEnabledRequest setIdentityDkimEnabledRequest) {

        if (setIdentityDkimEnabledRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<SetIdentityDkimEnabledRequest> request = new DefaultRequest<SetIdentityDkimEnabledRequest>(setIdentityDkimEnabledRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "SetIdentityDkimEnabled");
        request.addParameter("Version", "2010-12-01");

        if (setIdentityDkimEnabledRequest.getIdentity() != null) {
            request.addParameter("Identity", StringUtils.fromString(setIdentityDkimEnabledRequest.getIdentity()));
        }
        if (setIdentityDkimEnabledRequest.isDkimEnabled() != null) {
            request.addParameter("DkimEnabled", StringUtils.fromBoolean(setIdentityDkimEnabledRequest.isDkimEnabled()));
        }


        return request;
    }
}
