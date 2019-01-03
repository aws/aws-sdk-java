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
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateReceiptFilterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReceiptFilterRequestMarshaller implements Marshaller<Request<CreateReceiptFilterRequest>, CreateReceiptFilterRequest> {

    public Request<CreateReceiptFilterRequest> marshall(CreateReceiptFilterRequest createReceiptFilterRequest) {

        if (createReceiptFilterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateReceiptFilterRequest> request = new DefaultRequest<CreateReceiptFilterRequest>(createReceiptFilterRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "CreateReceiptFilter");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        {
            ReceiptFilter filter = createReceiptFilterRequest.getFilter();
            if (filter != null) {

                if (filter.getName() != null) {
                    request.addParameter("Filter.Name", StringUtils.fromString(filter.getName()));
                }

                {
                    ReceiptIpFilter ipFilter = filter.getIpFilter();
                    if (ipFilter != null) {

                        if (ipFilter.getPolicy() != null) {
                            request.addParameter("Filter.IpFilter.Policy", StringUtils.fromString(ipFilter.getPolicy()));
                        }

                        if (ipFilter.getCidr() != null) {
                            request.addParameter("Filter.IpFilter.Cidr", StringUtils.fromString(ipFilter.getCidr()));
                        }
                    }
                }
            }
        }

        return request;
    }

}
