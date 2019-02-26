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
package com.amazonaws.services.cloudsearchv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DefineSuggesterRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineSuggesterRequestMarshaller implements Marshaller<Request<DefineSuggesterRequest>, DefineSuggesterRequest> {

    public Request<DefineSuggesterRequest> marshall(DefineSuggesterRequest defineSuggesterRequest) {

        if (defineSuggesterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineSuggesterRequest> request = new DefaultRequest<DefineSuggesterRequest>(defineSuggesterRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineSuggester");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (defineSuggesterRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineSuggesterRequest.getDomainName()));
        }

        {
            Suggester suggester = defineSuggesterRequest.getSuggester();
            if (suggester != null) {

                if (suggester.getSuggesterName() != null) {
                    request.addParameter("Suggester.SuggesterName", StringUtils.fromString(suggester.getSuggesterName()));
                }

                {
                    DocumentSuggesterOptions documentSuggesterOptions = suggester.getDocumentSuggesterOptions();
                    if (documentSuggesterOptions != null) {

                        if (documentSuggesterOptions.getSourceField() != null) {
                            request.addParameter("Suggester.DocumentSuggesterOptions.SourceField",
                                    StringUtils.fromString(documentSuggesterOptions.getSourceField()));
                        }

                        if (documentSuggesterOptions.getFuzzyMatching() != null) {
                            request.addParameter("Suggester.DocumentSuggesterOptions.FuzzyMatching",
                                    StringUtils.fromString(documentSuggesterOptions.getFuzzyMatching()));
                        }

                        if (documentSuggesterOptions.getSortExpression() != null) {
                            request.addParameter("Suggester.DocumentSuggesterOptions.SortExpression",
                                    StringUtils.fromString(documentSuggesterOptions.getSortExpression()));
                        }
                    }
                }
            }
        }

        return request;
    }

}
