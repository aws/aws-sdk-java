/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/ListChecks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChecksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The aws service associated with the check
     * </p>
     */
    private String awsService;
    /**
     * <p>
     * The ISO 639-1 code for the language that you want your checks to appear in.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The pillar of the check
     * </p>
     */
    private String pillar;
    /**
     * <p>
     * The source of the check
     * </p>
     */
    private String source;

    /**
     * <p>
     * The aws service associated with the check
     * </p>
     * 
     * @param awsService
     *        The aws service associated with the check
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The aws service associated with the check
     * </p>
     * 
     * @return The aws service associated with the check
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * The aws service associated with the check
     * </p>
     * 
     * @param awsService
     *        The aws service associated with the check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChecksRequest withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language that you want your checks to appear in.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language that you want your checks to appear in.
     * @see RecommendationLanguage
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language that you want your checks to appear in.
     * </p>
     * 
     * @return The ISO 639-1 code for the language that you want your checks to appear in.
     * @see RecommendationLanguage
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language that you want your checks to appear in.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language that you want your checks to appear in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationLanguage
     */

    public ListChecksRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language that you want your checks to appear in.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language that you want your checks to appear in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationLanguage
     */

    public ListChecksRequest withLanguage(RecommendationLanguage language) {
        this.language = language.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @return The maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChecksRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChecksRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The pillar of the check
     * </p>
     * 
     * @param pillar
     *        The pillar of the check
     * @see RecommendationPillar
     */

    public void setPillar(String pillar) {
        this.pillar = pillar;
    }

    /**
     * <p>
     * The pillar of the check
     * </p>
     * 
     * @return The pillar of the check
     * @see RecommendationPillar
     */

    public String getPillar() {
        return this.pillar;
    }

    /**
     * <p>
     * The pillar of the check
     * </p>
     * 
     * @param pillar
     *        The pillar of the check
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public ListChecksRequest withPillar(String pillar) {
        setPillar(pillar);
        return this;
    }

    /**
     * <p>
     * The pillar of the check
     * </p>
     * 
     * @param pillar
     *        The pillar of the check
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationPillar
     */

    public ListChecksRequest withPillar(RecommendationPillar pillar) {
        this.pillar = pillar.toString();
        return this;
    }

    /**
     * <p>
     * The source of the check
     * </p>
     * 
     * @param source
     *        The source of the check
     * @see RecommendationSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the check
     * </p>
     * 
     * @return The source of the check
     * @see RecommendationSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the check
     * </p>
     * 
     * @param source
     *        The source of the check
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public ListChecksRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The source of the check
     * </p>
     * 
     * @param source
     *        The source of the check
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSource
     */

    public ListChecksRequest withSource(RecommendationSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPillar() != null)
            sb.append("Pillar: ").append(getPillar()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChecksRequest == false)
            return false;
        ListChecksRequest other = (ListChecksRequest) obj;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPillar() == null ^ this.getPillar() == null)
            return false;
        if (other.getPillar() != null && other.getPillar().equals(this.getPillar()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPillar() == null) ? 0 : getPillar().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public ListChecksRequest clone() {
        return (ListChecksRequest) super.clone();
    }

}
