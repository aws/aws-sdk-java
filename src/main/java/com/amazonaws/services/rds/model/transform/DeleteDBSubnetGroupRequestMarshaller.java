/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Delete D B Subnet Group Request Marshaller
 */
public class DeleteDBSubnetGroupRequestMarshaller implements Marshaller<Request<DeleteDBSubnetGroupRequest>, DeleteDBSubnetGroupRequest> {

    public Request<DeleteDBSubnetGroupRequest> marshall(DeleteDBSubnetGroupRequest deleteDBSubnetGroupRequest) {

        if (deleteDBSubnetGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteDBSubnetGroupRequest> request = new DefaultRequest<DeleteDBSubnetGroupRequest>(deleteDBSubnetGroupRequest, "AmazonRDS");
        request.addParameter("Action", "DeleteDBSubnetGroup");
        request.addParameter("Version", "2013-09-09");

        if (deleteDBSubnetGroupRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(deleteDBSubnetGroupRequest.getDBSubnetGroupName()));
        }


        return request;
    }
}
