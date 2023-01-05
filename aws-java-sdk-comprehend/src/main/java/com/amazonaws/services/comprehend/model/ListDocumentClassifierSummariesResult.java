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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDocumentClassifierSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDocumentClassifierSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     */
    private java.util.List<DocumentClassifierSummary> documentClassifierSummariesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * 
     * @return The list of summaries of document classifiers.
     */

    public java.util.List<DocumentClassifierSummary> getDocumentClassifierSummariesList() {
        return documentClassifierSummariesList;
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * 
     * @param documentClassifierSummariesList
     *        The list of summaries of document classifiers.
     */

    public void setDocumentClassifierSummariesList(java.util.Collection<DocumentClassifierSummary> documentClassifierSummariesList) {
        if (documentClassifierSummariesList == null) {
            this.documentClassifierSummariesList = null;
            return;
        }

        this.documentClassifierSummariesList = new java.util.ArrayList<DocumentClassifierSummary>(documentClassifierSummariesList);
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentClassifierSummariesList(java.util.Collection)} or
     * {@link #withDocumentClassifierSummariesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentClassifierSummariesList
     *        The list of summaries of document classifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentClassifierSummariesResult withDocumentClassifierSummariesList(DocumentClassifierSummary... documentClassifierSummariesList) {
        if (this.documentClassifierSummariesList == null) {
            setDocumentClassifierSummariesList(new java.util.ArrayList<DocumentClassifierSummary>(documentClassifierSummariesList.length));
        }
        for (DocumentClassifierSummary ele : documentClassifierSummariesList) {
            this.documentClassifierSummariesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * 
     * @param documentClassifierSummariesList
     *        The list of summaries of document classifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentClassifierSummariesResult withDocumentClassifierSummariesList(
            java.util.Collection<DocumentClassifierSummary> documentClassifierSummariesList) {
        setDocumentClassifierSummariesList(documentClassifierSummariesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentClassifierSummariesResult withNextToken(String nextToken) {
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
        if (getDocumentClassifierSummariesList() != null)
            sb.append("DocumentClassifierSummariesList: ").append(getDocumentClassifierSummariesList()).append(",");
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

        if (obj instanceof ListDocumentClassifierSummariesResult == false)
            return false;
        ListDocumentClassifierSummariesResult other = (ListDocumentClassifierSummariesResult) obj;
        if (other.getDocumentClassifierSummariesList() == null ^ this.getDocumentClassifierSummariesList() == null)
            return false;
        if (other.getDocumentClassifierSummariesList() != null
                && other.getDocumentClassifierSummariesList().equals(this.getDocumentClassifierSummariesList()) == false)
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

        hashCode = prime * hashCode + ((getDocumentClassifierSummariesList() == null) ? 0 : getDocumentClassifierSummariesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDocumentClassifierSummariesResult clone() {
        try {
            return (ListDocumentClassifierSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
