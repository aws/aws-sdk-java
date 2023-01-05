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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListVocabularies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVocabulariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     * creation date, with the newest vocabulary first.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information about the custom vocabularies that match the criteria specified in your request.
     * </p>
     */
    private java.util.List<VocabularyInfo> vocabularies;

    /**
     * <p>
     * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     * creation date, with the newest vocabulary first.
     * </p>
     * 
     * @param status
     *        Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     *        creation date, with the newest vocabulary first.
     * @see VocabularyState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     * creation date, with the newest vocabulary first.
     * </p>
     * 
     * @return Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     *         creation date, with the newest vocabulary first.
     * @see VocabularyState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     * creation date, with the newest vocabulary first.
     * </p>
     * 
     * @param status
     *        Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     *        creation date, with the newest vocabulary first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListVocabulariesResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     * creation date, with the newest vocabulary first.
     * </p>
     * 
     * @param status
     *        Lists all custom vocabularies that have the status specified in your request. Vocabularies are ordered by
     *        creation date, with the newest vocabulary first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListVocabulariesResult withStatus(VocabularyState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @return If <code>NextToken</code> is present in your response, it indicates that not all results are displayed.
     *         To view the next set of results, copy the string associated with the <code>NextToken</code> parameter in
     *         your results output, then run your request again including <code>NextToken</code> with the value of the
     *         copied string. Repeat as needed to view all your results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To view
     * the next set of results, copy the string associated with the <code>NextToken</code> parameter in your results
     * output, then run your request again including <code>NextToken</code> with the value of the copied string. Repeat
     * as needed to view all your results.
     * </p>
     * 
     * @param nextToken
     *        If <code>NextToken</code> is present in your response, it indicates that not all results are displayed. To
     *        view the next set of results, copy the string associated with the <code>NextToken</code> parameter in your
     *        results output, then run your request again including <code>NextToken</code> with the value of the copied
     *        string. Repeat as needed to view all your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabulariesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information about the custom vocabularies that match the criteria specified in your request.
     * </p>
     * 
     * @return Provides information about the custom vocabularies that match the criteria specified in your request.
     */

    public java.util.List<VocabularyInfo> getVocabularies() {
        return vocabularies;
    }

    /**
     * <p>
     * Provides information about the custom vocabularies that match the criteria specified in your request.
     * </p>
     * 
     * @param vocabularies
     *        Provides information about the custom vocabularies that match the criteria specified in your request.
     */

    public void setVocabularies(java.util.Collection<VocabularyInfo> vocabularies) {
        if (vocabularies == null) {
            this.vocabularies = null;
            return;
        }

        this.vocabularies = new java.util.ArrayList<VocabularyInfo>(vocabularies);
    }

    /**
     * <p>
     * Provides information about the custom vocabularies that match the criteria specified in your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVocabularies(java.util.Collection)} or {@link #withVocabularies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vocabularies
     *        Provides information about the custom vocabularies that match the criteria specified in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabulariesResult withVocabularies(VocabularyInfo... vocabularies) {
        if (this.vocabularies == null) {
            setVocabularies(new java.util.ArrayList<VocabularyInfo>(vocabularies.length));
        }
        for (VocabularyInfo ele : vocabularies) {
            this.vocabularies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the custom vocabularies that match the criteria specified in your request.
     * </p>
     * 
     * @param vocabularies
     *        Provides information about the custom vocabularies that match the criteria specified in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVocabulariesResult withVocabularies(java.util.Collection<VocabularyInfo> vocabularies) {
        setVocabularies(vocabularies);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVocabularies() != null)
            sb.append("Vocabularies: ").append(getVocabularies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVocabulariesResult == false)
            return false;
        ListVocabulariesResult other = (ListVocabulariesResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVocabularies() == null ^ this.getVocabularies() == null)
            return false;
        if (other.getVocabularies() != null && other.getVocabularies().equals(this.getVocabularies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVocabularies() == null) ? 0 : getVocabularies().hashCode());
        return hashCode;
    }

    @Override
    public ListVocabulariesResult clone() {
        try {
            return (ListVocabulariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
