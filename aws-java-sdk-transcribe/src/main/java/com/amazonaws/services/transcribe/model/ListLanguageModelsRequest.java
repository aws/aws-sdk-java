/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListLanguageModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLanguageModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When specified, returns only custom language models with the specified status. Language models are ordered by
     * creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom
     * language models ordered by date.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * When specified, the custom language model names returned contain the substring you've specified.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous request was truncated.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of language models to return in the response. If there are fewer results in the list, the
     * response contains only the actual results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only custom language models with the specified status. Language models are ordered by
     * creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom
     * language models ordered by date.
     * </p>
     * 
     * @param statusEquals
     *        When specified, returns only custom language models with the specified status. Language models are ordered
     *        by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns
     *        all custom language models ordered by date.
     * @see ModelStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified status. Language models are ordered by
     * creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom
     * language models ordered by date.
     * </p>
     * 
     * @return When specified, returns only custom language models with the specified status. Language models are
     *         ordered by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe
     *         returns all custom language models ordered by date.
     * @see ModelStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified status. Language models are ordered by
     * creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom
     * language models ordered by date.
     * </p>
     * 
     * @param statusEquals
     *        When specified, returns only custom language models with the specified status. Language models are ordered
     *        by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns
     *        all custom language models ordered by date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ListLanguageModelsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified status. Language models are ordered by
     * creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns all custom
     * language models ordered by date.
     * </p>
     * 
     * @param statusEquals
     *        When specified, returns only custom language models with the specified status. Language models are ordered
     *        by creation date, with the newest models first. If you don't specify a status, Amazon Transcribe returns
     *        all custom language models ordered by date.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelStatus
     */

    public ListLanguageModelsRequest withStatusEquals(ModelStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the substring you've specified.
     * </p>
     * 
     * @param nameContains
     *        When specified, the custom language model names returned contain the substring you've specified.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the substring you've specified.
     * </p>
     * 
     * @return When specified, the custom language model names returned contain the substring you've specified.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the substring you've specified.
     * </p>
     * 
     * @param nameContains
     *        When specified, the custom language model names returned contain the substring you've specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        When included, fetches the next set of jobs if the result of the previous request was truncated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous request was truncated.
     * </p>
     * 
     * @return When included, fetches the next set of jobs if the result of the previous request was truncated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous request was truncated.
     * </p>
     * 
     * @param nextToken
     *        When included, fetches the next set of jobs if the result of the previous request was truncated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of language models to return in the response. If there are fewer results in the list, the
     * response contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of language models to return in the response. If there are fewer results in the list,
     *        the response contains only the actual results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of language models to return in the response. If there are fewer results in the list, the
     * response contains only the actual results.
     * </p>
     * 
     * @return The maximum number of language models to return in the response. If there are fewer results in the list,
     *         the response contains only the actual results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of language models to return in the response. If there are fewer results in the list, the
     * response contains only the actual results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of language models to return in the response. If there are fewer results in the list,
     *        the response contains only the actual results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguageModelsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguageModelsRequest == false)
            return false;
        ListLanguageModelsRequest other = (ListLanguageModelsRequest) obj;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLanguageModelsRequest clone() {
        return (ListLanguageModelsRequest) super.clone();
    }

}
