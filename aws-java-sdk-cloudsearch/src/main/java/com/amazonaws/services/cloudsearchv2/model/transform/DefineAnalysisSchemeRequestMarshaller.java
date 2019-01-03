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
 * DefineAnalysisSchemeRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefineAnalysisSchemeRequestMarshaller implements Marshaller<Request<DefineAnalysisSchemeRequest>, DefineAnalysisSchemeRequest> {

    public Request<DefineAnalysisSchemeRequest> marshall(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) {

        if (defineAnalysisSchemeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineAnalysisSchemeRequest> request = new DefaultRequest<DefineAnalysisSchemeRequest>(defineAnalysisSchemeRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineAnalysisScheme");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (defineAnalysisSchemeRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineAnalysisSchemeRequest.getDomainName()));
        }

        {
            AnalysisScheme analysisScheme = defineAnalysisSchemeRequest.getAnalysisScheme();
            if (analysisScheme != null) {

                if (analysisScheme.getAnalysisSchemeName() != null) {
                    request.addParameter("AnalysisScheme.AnalysisSchemeName", StringUtils.fromString(analysisScheme.getAnalysisSchemeName()));
                }

                if (analysisScheme.getAnalysisSchemeLanguage() != null) {
                    request.addParameter("AnalysisScheme.AnalysisSchemeLanguage", StringUtils.fromString(analysisScheme.getAnalysisSchemeLanguage()));
                }

                {
                    AnalysisOptions analysisOptions = analysisScheme.getAnalysisOptions();
                    if (analysisOptions != null) {

                        if (analysisOptions.getSynonyms() != null) {
                            request.addParameter("AnalysisScheme.AnalysisOptions.Synonyms", StringUtils.fromString(analysisOptions.getSynonyms()));
                        }

                        if (analysisOptions.getStopwords() != null) {
                            request.addParameter("AnalysisScheme.AnalysisOptions.Stopwords", StringUtils.fromString(analysisOptions.getStopwords()));
                        }

                        if (analysisOptions.getStemmingDictionary() != null) {
                            request.addParameter("AnalysisScheme.AnalysisOptions.StemmingDictionary",
                                    StringUtils.fromString(analysisOptions.getStemmingDictionary()));
                        }

                        if (analysisOptions.getJapaneseTokenizationDictionary() != null) {
                            request.addParameter("AnalysisScheme.AnalysisOptions.JapaneseTokenizationDictionary",
                                    StringUtils.fromString(analysisOptions.getJapaneseTokenizationDictionary()));
                        }

                        if (analysisOptions.getAlgorithmicStemming() != null) {
                            request.addParameter("AnalysisScheme.AnalysisOptions.AlgorithmicStemming",
                                    StringUtils.fromString(analysisOptions.getAlgorithmicStemming()));
                        }
                    }
                }
            }
        }

        return request;
    }

}
