/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchVocabulariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
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
     * The current state of the custom vocabulary.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The starting pattern of the name of the vocabulary.
     * </p>
     */
    private String nameStartsWith;
    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVocabulariesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public SearchVocabulariesRequest withMaxResults(Integer maxResults) {
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

    public SearchVocabulariesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @return The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public SearchVocabulariesRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public SearchVocabulariesRequest withState(VocabularyState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The starting pattern of the name of the vocabulary.
     * </p>
     * 
     * @param nameStartsWith
     *        The starting pattern of the name of the vocabulary.
     */

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    /**
     * <p>
     * The starting pattern of the name of the vocabulary.
     * </p>
     * 
     * @return The starting pattern of the name of the vocabulary.
     */

    public String getNameStartsWith() {
        return this.nameStartsWith;
    }

    /**
     * <p>
     * The starting pattern of the name of the vocabulary.
     * </p>
     * 
     * @param nameStartsWith
     *        The starting pattern of the name of the vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVocabulariesRequest withNameStartsWith(String nameStartsWith) {
        setNameStartsWith(nameStartsWith);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @return The language code of the vocabulary entries. For a list of languages and their corresponding language
     *         codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *         Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public SearchVocabulariesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public SearchVocabulariesRequest withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getNameStartsWith() != null)
            sb.append("NameStartsWith: ").append(getNameStartsWith()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchVocabulariesRequest == false)
            return false;
        SearchVocabulariesRequest other = (SearchVocabulariesRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getNameStartsWith() == null ^ this.getNameStartsWith() == null)
            return false;
        if (other.getNameStartsWith() != null && other.getNameStartsWith().equals(this.getNameStartsWith()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getNameStartsWith() == null) ? 0 : getNameStartsWith().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public SearchVocabulariesRequest clone() {
        return (SearchVocabulariesRequest) super.clone();
    }

}
