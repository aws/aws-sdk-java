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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchVocabularies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchVocabulariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     */
    private java.util.List<VocabularySummary> vocabularySummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * 
     * @return The list of the available custom vocabularies.
     */

    public java.util.List<VocabularySummary> getVocabularySummaryList() {
        return vocabularySummaryList;
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * 
     * @param vocabularySummaryList
     *        The list of the available custom vocabularies.
     */

    public void setVocabularySummaryList(java.util.Collection<VocabularySummary> vocabularySummaryList) {
        if (vocabularySummaryList == null) {
            this.vocabularySummaryList = null;
            return;
        }

        this.vocabularySummaryList = new java.util.ArrayList<VocabularySummary>(vocabularySummaryList);
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVocabularySummaryList(java.util.Collection)} or
     * {@link #withVocabularySummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vocabularySummaryList
     *        The list of the available custom vocabularies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVocabulariesResult withVocabularySummaryList(VocabularySummary... vocabularySummaryList) {
        if (this.vocabularySummaryList == null) {
            setVocabularySummaryList(new java.util.ArrayList<VocabularySummary>(vocabularySummaryList.length));
        }
        for (VocabularySummary ele : vocabularySummaryList) {
            this.vocabularySummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the available custom vocabularies.
     * </p>
     * 
     * @param vocabularySummaryList
     *        The list of the available custom vocabularies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVocabulariesResult withVocabularySummaryList(java.util.Collection<VocabularySummary> vocabularySummaryList) {
        setVocabularySummaryList(vocabularySummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchVocabulariesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getVocabularySummaryList() != null)
            sb.append("VocabularySummaryList: ").append(getVocabularySummaryList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchVocabulariesResult == false)
            return false;
        SearchVocabulariesResult other = (SearchVocabulariesResult) obj;
        if (other.getVocabularySummaryList() == null ^ this.getVocabularySummaryList() == null)
            return false;
        if (other.getVocabularySummaryList() != null && other.getVocabularySummaryList().equals(this.getVocabularySummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularySummaryList() == null) ? 0 : getVocabularySummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchVocabulariesResult clone() {
        try {
            return (SearchVocabulariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
