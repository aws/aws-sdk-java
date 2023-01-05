/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DisassociateDataShareConsumerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDataShareConsumerRequestMarshaller implements
        Marshaller<Request<DisassociateDataShareConsumerRequest>, DisassociateDataShareConsumerRequest> {

    public Request<DisassociateDataShareConsumerRequest> marshall(DisassociateDataShareConsumerRequest disassociateDataShareConsumerRequest) {

        if (disassociateDataShareConsumerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateDataShareConsumerRequest> request = new DefaultRequest<DisassociateDataShareConsumerRequest>(disassociateDataShareConsumerRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DisassociateDataShareConsumer");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (disassociateDataShareConsumerRequest.getDataShareArn() != null) {
            request.addParameter("DataShareArn", StringUtils.fromString(disassociateDataShareConsumerRequest.getDataShareArn()));
        }

        if (disassociateDataShareConsumerRequest.getDisassociateEntireAccount() != null) {
            request.addParameter("DisassociateEntireAccount", StringUtils.fromBoolean(disassociateDataShareConsumerRequest.getDisassociateEntireAccount()));
        }

        if (disassociateDataShareConsumerRequest.getConsumerArn() != null) {
            request.addParameter("ConsumerArn", StringUtils.fromString(disassociateDataShareConsumerRequest.getConsumerArn()));
        }

        if (disassociateDataShareConsumerRequest.getConsumerRegion() != null) {
            request.addParameter("ConsumerRegion", StringUtils.fromString(disassociateDataShareConsumerRequest.getConsumerRegion()));
        }

        return request;
    }

}
