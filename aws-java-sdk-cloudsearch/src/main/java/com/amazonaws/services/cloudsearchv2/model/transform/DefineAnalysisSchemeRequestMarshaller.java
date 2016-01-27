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
 * Define Analysis Scheme Request Marshaller
 */
public class DefineAnalysisSchemeRequestMarshaller implements Marshaller<Request<DefineAnalysisSchemeRequest>, DefineAnalysisSchemeRequest> {

    public Request<DefineAnalysisSchemeRequest> marshall(DefineAnalysisSchemeRequest defineAnalysisSchemeRequest) {

        if (defineAnalysisSchemeRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DefineAnalysisSchemeRequest> request = new DefaultRequest<DefineAnalysisSchemeRequest>(defineAnalysisSchemeRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "DefineAnalysisScheme");
        request.addParameter("Version", "2013-01-01");

        if (defineAnalysisSchemeRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils.fromString(defineAnalysisSchemeRequest.getDomainName()));
        }
        AnalysisScheme analysisSchemeAnalysisScheme = defineAnalysisSchemeRequest.getAnalysisScheme();
        if (analysisSchemeAnalysisScheme != null) {
            if (analysisSchemeAnalysisScheme.getAnalysisSchemeName() != null) {
                request.addParameter("AnalysisScheme.AnalysisSchemeName", StringUtils.fromString(analysisSchemeAnalysisScheme.getAnalysisSchemeName()));
            }
            if (analysisSchemeAnalysisScheme.getAnalysisSchemeLanguage() != null) {
                request.addParameter("AnalysisScheme.AnalysisSchemeLanguage", StringUtils.fromString(analysisSchemeAnalysisScheme.getAnalysisSchemeLanguage()));
            }
            AnalysisOptions analysisOptionsAnalysisOptions = analysisSchemeAnalysisScheme.getAnalysisOptions();
            if (analysisOptionsAnalysisOptions != null) {
                if (analysisOptionsAnalysisOptions.getSynonyms() != null) {
                    request.addParameter("AnalysisScheme.AnalysisOptions.Synonyms", StringUtils.fromString(analysisOptionsAnalysisOptions.getSynonyms()));
                }
                if (analysisOptionsAnalysisOptions.getStopwords() != null) {
                    request.addParameter("AnalysisScheme.AnalysisOptions.Stopwords", StringUtils.fromString(analysisOptionsAnalysisOptions.getStopwords()));
                }
                if (analysisOptionsAnalysisOptions.getStemmingDictionary() != null) {
                    request.addParameter("AnalysisScheme.AnalysisOptions.StemmingDictionary", StringUtils.fromString(analysisOptionsAnalysisOptions.getStemmingDictionary()));
                }
                if (analysisOptionsAnalysisOptions.getJapaneseTokenizationDictionary() != null) {
                    request.addParameter("AnalysisScheme.AnalysisOptions.JapaneseTokenizationDictionary", StringUtils.fromString(analysisOptionsAnalysisOptions.getJapaneseTokenizationDictionary()));
                }
                if (analysisOptionsAnalysisOptions.getAlgorithmicStemming() != null) {
                    request.addParameter("AnalysisScheme.AnalysisOptions.AlgorithmicStemming", StringUtils.fromString(analysisOptionsAnalysisOptions.getAlgorithmicStemming()));
                }
            }
        }

        return request;
    }
}
