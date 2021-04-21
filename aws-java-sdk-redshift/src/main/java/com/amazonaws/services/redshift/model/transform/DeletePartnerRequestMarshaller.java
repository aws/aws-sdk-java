/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DeletePartnerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePartnerRequestMarshaller implements Marshaller<Request<DeletePartnerRequest>, DeletePartnerRequest> {

    public Request<DeletePartnerRequest> marshall(DeletePartnerRequest deletePartnerRequest) {

        if (deletePartnerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeletePartnerRequest> request = new DefaultRequest<DeletePartnerRequest>(deletePartnerRequest, "AmazonRedshift");
        request.addParameter("Action", "DeletePartner");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (deletePartnerRequest.getAccountId() != null) {
            request.addParameter("AccountId", StringUtils.fromString(deletePartnerRequest.getAccountId()));
        }

        if (deletePartnerRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(deletePartnerRequest.getClusterIdentifier()));
        }

        if (deletePartnerRequest.getDatabaseName() != null) {
            request.addParameter("DatabaseName", StringUtils.fromString(deletePartnerRequest.getDatabaseName()));
        }

        if (deletePartnerRequest.getPartnerName() != null) {
            request.addParameter("PartnerName", StringUtils.fromString(deletePartnerRequest.getPartnerName()));
        }

        return request;
    }

}
