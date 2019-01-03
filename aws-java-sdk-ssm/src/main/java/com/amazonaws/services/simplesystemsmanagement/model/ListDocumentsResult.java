/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocuments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDocumentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the Systems Manager documents.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentIdentifier> documentIdentifiers;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the Systems Manager documents.
     * </p>
     * 
     * @return The names of the Systems Manager documents.
     */

    public java.util.List<DocumentIdentifier> getDocumentIdentifiers() {
        if (documentIdentifiers == null) {
            documentIdentifiers = new com.amazonaws.internal.SdkInternalList<DocumentIdentifier>();
        }
        return documentIdentifiers;
    }

    /**
     * <p>
     * The names of the Systems Manager documents.
     * </p>
     * 
     * @param documentIdentifiers
     *        The names of the Systems Manager documents.
     */

    public void setDocumentIdentifiers(java.util.Collection<DocumentIdentifier> documentIdentifiers) {
        if (documentIdentifiers == null) {
            this.documentIdentifiers = null;
            return;
        }

        this.documentIdentifiers = new com.amazonaws.internal.SdkInternalList<DocumentIdentifier>(documentIdentifiers);
    }

    /**
     * <p>
     * The names of the Systems Manager documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentIdentifiers(java.util.Collection)} or {@link #withDocumentIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param documentIdentifiers
     *        The names of the Systems Manager documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsResult withDocumentIdentifiers(DocumentIdentifier... documentIdentifiers) {
        if (this.documentIdentifiers == null) {
            setDocumentIdentifiers(new com.amazonaws.internal.SdkInternalList<DocumentIdentifier>(documentIdentifiers.length));
        }
        for (DocumentIdentifier ele : documentIdentifiers) {
            this.documentIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Systems Manager documents.
     * </p>
     * 
     * @param documentIdentifiers
     *        The names of the Systems Manager documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDocumentsResult withDocumentIdentifiers(java.util.Collection<DocumentIdentifier> documentIdentifiers) {
        setDocumentIdentifiers(documentIdentifiers);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
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
        if (getDocumentIdentifiers() != null)
            sb.append("DocumentIdentifiers: ").append(getDocumentIdentifiers()).append(",");
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
        if (other.getDocumentIdentifiers() == null ^ this.getDocumentIdentifiers() == null)
            return false;
        if (other.getDocumentIdentifiers() != null && other.getDocumentIdentifiers().equals(this.getDocumentIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getDocumentIdentifiers() == null) ? 0 : getDocumentIdentifiers().hashCode());
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
