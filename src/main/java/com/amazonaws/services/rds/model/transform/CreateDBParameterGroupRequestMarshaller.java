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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Create D B Parameter Group Request Marshaller
 */
public class CreateDBParameterGroupRequestMarshaller implements Marshaller<Request<CreateDBParameterGroupRequest>, CreateDBParameterGroupRequest> {

    public Request<CreateDBParameterGroupRequest> marshall(CreateDBParameterGroupRequest createDBParameterGroupRequest) {

        if (createDBParameterGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateDBParameterGroupRequest> request = new DefaultRequest<CreateDBParameterGroupRequest>(createDBParameterGroupRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBParameterGroup");
        request.addParameter("Version", "2012-01-15");

        if (createDBParameterGroupRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils.fromString(createDBParameterGroupRequest.getDBParameterGroupName()));
        }
        if (createDBParameterGroupRequest.getDBParameterGroupFamily() != null) {
            request.addParameter("DBParameterGroupFamily", StringUtils.fromString(createDBParameterGroupRequest.getDBParameterGroupFamily()));
        }
        if (createDBParameterGroupRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createDBParameterGroupRequest.getDescription()));
        }


        return request;
    }
}
