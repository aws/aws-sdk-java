/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Get Template Request Marshaller
 */
public class GetTemplateRequestMarshaller implements Marshaller<Request<GetTemplateRequest>, GetTemplateRequest> {

    public Request<GetTemplateRequest> marshall(GetTemplateRequest getTemplateRequest) {
        Request<GetTemplateRequest> request = new DefaultRequest<GetTemplateRequest>(getTemplateRequest, "AmazonCloudFormation");
        request.addParameter("Action", "GetTemplate");
        request.addParameter("Version", "2010-05-15");
        if (getTemplateRequest != null) {
            if (getTemplateRequest.getStackName() != null) {
                request.addParameter("StackName", StringUtils.fromString(getTemplateRequest.getStackName()));
            }
        }


        return request;
    }
}
