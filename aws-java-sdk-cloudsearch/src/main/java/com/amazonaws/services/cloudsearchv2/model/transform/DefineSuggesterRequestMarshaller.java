/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Define Suggester Request Marshaller
 */
public class DefineSuggesterRequestMarshaller implements Marshaller<Request<DefineSuggesterRequest>, DefineSuggesterRequest> {

    public Request<DefineSuggesterRequest> marshall(DefineSuggesterRequest defineSuggesterRequest) {

        if (defineSuggesterRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineSuggesterRequest> request = new DefaultRequest<DefineSuggesterRequest>(defineSuggesterRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineSuggester");
        request.addParameter("Version", "2013-01-01");

        if (defineSuggesterRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineSuggesterRequest.getDomainName()));
        }
        Suggester suggesterSuggester = defineSuggesterRequest.getSuggester();
        if (suggesterSuggester != null) {
            if (suggesterSuggester.getSuggesterName() != null) {
                request.addParameter("Suggester.SuggesterName", StringUtils.fromString(suggesterSuggester.getSuggesterName()));
            }
            DocumentSuggesterOptions documentSuggesterOptionsDocumentSuggesterOptions = suggesterSuggester.getDocumentSuggesterOptions();
            if (documentSuggesterOptionsDocumentSuggesterOptions != null) {
                if (documentSuggesterOptionsDocumentSuggesterOptions.getSourceField() != null) {
                    request.addParameter("Suggester.DocumentSuggesterOptions.SourceField", StringUtils.fromString(documentSuggesterOptionsDocumentSuggesterOptions.getSourceField()));
                }
                if (documentSuggesterOptionsDocumentSuggesterOptions.getFuzzyMatching() != null) {
                    request.addParameter("Suggester.DocumentSuggesterOptions.FuzzyMatching", StringUtils.fromString(documentSuggesterOptionsDocumentSuggesterOptions.getFuzzyMatching()));
                }
                if (documentSuggesterOptionsDocumentSuggesterOptions.getSortExpression() != null) {
                    request.addParameter("Suggester.DocumentSuggesterOptions.SortExpression", StringUtils.fromString(documentSuggesterOptionsDocumentSuggesterOptions.getSortExpression()));
                }
            }
        }

        return request;
    }
}
