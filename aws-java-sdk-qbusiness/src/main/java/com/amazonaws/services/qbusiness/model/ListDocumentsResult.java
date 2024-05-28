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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDocumentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of document details.
     * </p>
     */
    private java.util.List<DocumentDetails> documentDetailList;
    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of document details.
     * </p>
     * 
     * @return A list of document details.
     */

    public java.util.List<DocumentDetails> getDocumentDetailList() {
        return documentDetailList;
    }

    /**
     * <p>
     * A list of document details.
     * </p>
     * 
     * @param documentDetailList
     *        A list of document details.
     */

    public void setDocumentDetailList(java.util.Collection<DocumentDetails> documentDetailList) {
        if (documentDetailList == null) {
            this.documentDetailList = null;
            return;
        }

        this.documentDetailList = new java.util.ArrayList<DocumentDetails>(documentDetailList);
    }

    /**
     * <p>
     * A list of document details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentDetailList(java.util.Collection)} or {@link #withDocumentDetailList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param documentDetailList
     *        A list of document details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsResult withDocumentDetailList(DocumentDetails... documentDetailList) {
        if (this.documentDetailList == null) {
            setDocumentDetailList(new java.util.ArrayList<DocumentDetails>(documentDetailList.length));
        }
        for (DocumentDetails ele : documentDetailList) {
            this.documentDetailList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of document details.
     * </p>
     * 
     * @param documentDetailList
     *        A list of document details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsResult withDocumentDetailList(java.util.Collection<DocumentDetails> documentDetailList) {
        setDocumentDetailList(documentDetailList);
        return this;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of documents.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @return If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *         Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *         next set of documents.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q Business
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * documents.
     * </p>
     * 
     * @param nextToken
     *        If the <code>maxResults</code> response was incomplete because there is more data to retrieve, Amazon Q
     *        Business returns a pagination token in the response. You can use this pagination token to retrieve the
     *        next set of documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsResult withNextToken(String nextToken) {
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
        if (getDocumentDetailList() != null)
            sb.append("DocumentDetailList: ").append(getDocumentDetailList()).append(",");
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

        if (obj instanceof ListDocumentsResult == false)
            return false;
        ListDocumentsResult other = (ListDocumentsResult) obj;
        if (other.getDocumentDetailList() == null ^ this.getDocumentDetailList() == null)
            return false;
        if (other.getDocumentDetailList() != null && other.getDocumentDetailList().equals(this.getDocumentDetailList()) == false)
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

        hashCode = prime * hashCode + ((getDocumentDetailList() == null) ? 0 : getDocumentDetailList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDocumentsResult clone() {
        try {
            return (ListDocumentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
