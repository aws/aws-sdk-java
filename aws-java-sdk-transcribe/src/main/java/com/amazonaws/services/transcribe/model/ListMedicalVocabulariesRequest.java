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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMedicalVocabulariesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of vocabularies to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified vocabulary
     * state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * </p>
     */
    private String stateEquals;
    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     * <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "<code>VocabularyName</code>
     * ".
     * </p>
     */
    private String nameContains;

    /**
     * <p>
     * If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * 
     * @param nextToken
     *        If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of vocabularies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * 
     * @return If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     *         <code>NextToken</code> to fetch the next set of vocabularies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     * <code>NextToken</code> to fetch the next set of vocabularies.
     * </p>
     * 
     * @param nextToken
     *        If the result of your previous request to <code>ListMedicalVocabularies</code> was truncated, include the
     *        <code>NextToken</code> to fetch the next set of vocabularies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of vocabularies to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response.
     * </p>
     * 
     * @return The maximum number of vocabularies to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of vocabularies to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of vocabularies to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified vocabulary
     * state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * </p>
     * 
     * @param stateEquals
     *        When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified
     *        vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * @see VocabularyState
     */

    public void setStateEquals(String stateEquals) {
        this.stateEquals = stateEquals;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified vocabulary
     * state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * </p>
     * 
     * @return When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified
     *         vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * @see VocabularyState
     */

    public String getStateEquals() {
        return this.stateEquals;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified vocabulary
     * state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * </p>
     * 
     * @param stateEquals
     *        When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified
     *        vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListMedicalVocabulariesRequest withStateEquals(String stateEquals) {
        setStateEquals(stateEquals);
        return this;
    }

    /**
     * <p>
     * When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified vocabulary
     * state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * </p>
     * 
     * @param stateEquals
     *        When specified, returns only vocabularies with the <code>VocabularyState</code> equal to the specified
     *        vocabulary state. Use this field to see which vocabularies are ready for your medical transcription jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListMedicalVocabulariesRequest withStateEquals(VocabularyState stateEquals) {
        this.stateEquals = stateEquals.toString();
        return this;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     * <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "<code>VocabularyName</code>
     * ".
     * </p>
     * 
     * @param nameContains
     *        Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     *        <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "
     *        <code>VocabularyName</code>".
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     * <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "<code>VocabularyName</code>
     * ".
     * </p>
     * 
     * @return Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     *         <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "
     *         <code>VocabularyName</code>".
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     * <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "<code>VocabularyName</code>
     * ".
     * </p>
     * 
     * @param nameContains
     *        Returns vocabularies whose names contain the specified string. The search is not case sensitive.
     *        <code>ListMedicalVocabularies</code> returns both "<code>vocabularyname</code>" and "
     *        <code>VocabularyName</code>".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStateEquals() != null)
            sb.append("StateEquals: ").append(getStateEquals()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMedicalVocabulariesRequest == false)
            return false;
        ListMedicalVocabulariesRequest other = (ListMedicalVocabulariesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStateEquals() == null ^ this.getStateEquals() == null)
            return false;
        if (other.getStateEquals() != null && other.getStateEquals().equals(this.getStateEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStateEquals() == null) ? 0 : getStateEquals().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public ListMedicalVocabulariesRequest clone() {
        return (ListMedicalVocabulariesRequest) super.clone();
    }

}
