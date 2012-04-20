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
package com.amazonaws.services.cloudsearch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudsearch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Update Synonym Options Request Marshaller
 */
public class UpdateSynonymOptionsRequestMarshaller implements Marshaller<Request<UpdateSynonymOptionsRequest>, UpdateSynonymOptionsRequest> {

    public Request<UpdateSynonymOptionsRequest> marshall(UpdateSynonymOptionsRequest updateSynonymOptionsRequest) {

        if (updateSynonymOptionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UpdateSynonymOptionsRequest> request = new DefaultRequest<UpdateSynonymOptionsRequest>(updateSynonymOptionsRequest, "AmazonCloudSearch");
        request.addParameter("Action", "UpdateSynonymOptions");
        request.addParameter("Version", "2011-02-01");

        if (updateSynonymOptionsRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(updateSynonymOptionsRequest.getDomainName()));
        }
        if (updateSynonymOptionsRequest.getSynonyms() != null) {
            request.addParameter("Synonyms", StringUtils.fromString(updateSynonymOptionsRequest.getSynonyms()));
        }


        return request;
    }
}
