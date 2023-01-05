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
 * DeauthorizeDataShareRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeauthorizeDataShareRequestMarshaller implements Marshaller<Request<DeauthorizeDataShareRequest>, DeauthorizeDataShareRequest> {

    public Request<DeauthorizeDataShareRequest> marshall(DeauthorizeDataShareRequest deauthorizeDataShareRequest) {

        if (deauthorizeDataShareRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeauthorizeDataShareRequest> request = new DefaultRequest<DeauthorizeDataShareRequest>(deauthorizeDataShareRequest, "AmazonRedshift");
        request.addParameter("Action", "DeauthorizeDataShare");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deauthorizeDataShareRequest.getDataShareArn() != null) {
            request.addParameter("DataShareArn", StringUtils.fromString(deauthorizeDataShareRequest.getDataShareArn()));
        }

        if (deauthorizeDataShareRequest.getConsumerIdentifier() != null) {
            request.addParameter("ConsumerIdentifier", StringUtils.fromString(deauthorizeDataShareRequest.getConsumerIdentifier()));
        }

        return request;
    }

}
