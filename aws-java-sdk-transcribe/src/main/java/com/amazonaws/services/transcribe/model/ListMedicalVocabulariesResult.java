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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListMedicalVocabularies" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMedicalVocabulariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the maximum
     * number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there are more jobs in
     * the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. To return the
     * next page of vocabularies, include the token in the next request to the <code>ListMedicalVocabularies</code>
     * operation .
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search criteria.
     * </p>
     */
    private java.util.List<VocabularyInfo> vocabularies;

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * 
     * @param status
     *        The requested vocabulary state.
     * @see VocabularyState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * 
     * @return The requested vocabulary state.
     * @see VocabularyState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * 
     * @param status
     *        The requested vocabulary state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListMedicalVocabulariesResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The requested vocabulary state.
     * </p>
     * 
     * @param status
     *        The requested vocabulary state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public ListMedicalVocabulariesResult withStatus(VocabularyState status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the maximum
     * number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there are more jobs in
     * the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. To return the
     * next page of vocabularies, include the token in the next request to the <code>ListMedicalVocabularies</code>
     * operation .
     * </p>
     * 
     * @param nextToken
     *        The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the
     *        maximum number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there
     *        are more jobs in the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code>
     *        token. To return the next page of vocabularies, include the token in the next request to the
     *        <code>ListMedicalVocabularies</code> operation .
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the maximum
     * number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there are more jobs in
     * the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. To return the
     * next page of vocabularies, include the token in the next request to the <code>ListMedicalVocabularies</code>
     * operation .
     * </p>
     * 
     * @return The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the
     *         maximum number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there
     *         are more jobs in the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code>
     *         token. To return the next page of vocabularies, include the token in the next request to the
     *         <code>ListMedicalVocabularies</code> operation .
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the maximum
     * number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there are more jobs in
     * the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code> token. To return the
     * next page of vocabularies, include the token in the next request to the <code>ListMedicalVocabularies</code>
     * operation .
     * </p>
     * 
     * @param nextToken
     *        The <code>ListMedicalVocabularies</code> operation returns a page of vocabularies at a time. You set the
     *        maximum number of vocabularies to return on a page with the <code>MaxResults</code> parameter. If there
     *        are more jobs in the list will fit on a page, Amazon Transcribe Medical returns the <code>NextPage</code>
     *        token. To return the next page of vocabularies, include the token in the next request to the
     *        <code>ListMedicalVocabularies</code> operation .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search criteria.
     * </p>
     * 
     * @return A list of objects that describe the vocabularies that match your search criteria.
     */

    public java.util.List<VocabularyInfo> getVocabularies() {
        return vocabularies;
    }

    /**
     * <p>
     * A list of objects that describe the vocabularies that match your search criteria.
     * </p>
     * 
     * @param vocabularies
     *        A list of objects that describe the vocabularies that match your search criteria.
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
     * A list of objects that describe the vocabularies that match your search criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVocabularies(java.util.Collection)} or {@link #withVocabularies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vocabularies
     *        A list of objects that describe the vocabularies that match your search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesResult withVocabularies(VocabularyInfo... vocabularies) {
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
     * A list of objects that describe the vocabularies that match your search criteria.
     * </p>
     * 
     * @param vocabularies
     *        A list of objects that describe the vocabularies that match your search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMedicalVocabulariesResult withVocabularies(java.util.Collection<VocabularyInfo> vocabularies) {
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

        if (obj instanceof ListMedicalVocabulariesResult == false)
            return false;
        ListMedicalVocabulariesResult other = (ListMedicalVocabulariesResult) obj;
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
    public ListMedicalVocabulariesResult clone() {
        try {
            return (ListMedicalVocabulariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
