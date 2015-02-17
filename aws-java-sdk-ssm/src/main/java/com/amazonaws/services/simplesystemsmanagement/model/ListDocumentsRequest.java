/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#listDocuments(ListDocumentsRequest) ListDocuments operation}.
 * <p>
 * Describes one or more of your configuration documents.
 * </p>
 *
 * @see com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement#listDocuments(ListDocumentsRequest)
 */
public class ListDocumentsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter> documentFilterList;

    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer maxResults;

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     */
    private String nextToken;

    /**
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return One or more filters. Use a filter to return a more specific list of
     *         results.
     */
    public java.util.List<DocumentFilter> getDocumentFilterList() {
        if (documentFilterList == null) {
              documentFilterList = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter>();
              documentFilterList.setAutoConstruct(true);
        }
        return documentFilterList;
    }
    
    /**
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param documentFilterList One or more filters. Use a filter to return a more specific list of
     *         results.
     */
    public void setDocumentFilterList(java.util.Collection<DocumentFilter> documentFilterList) {
        if (documentFilterList == null) {
            this.documentFilterList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter> documentFilterListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter>(documentFilterList.size());
        documentFilterListCopy.addAll(documentFilterList);
        this.documentFilterList = documentFilterListCopy;
    }
    
    /**
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param documentFilterList One or more filters. Use a filter to return a more specific list of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDocumentsRequest withDocumentFilterList(DocumentFilter... documentFilterList) {
        if (getDocumentFilterList() == null) setDocumentFilterList(new java.util.ArrayList<DocumentFilter>(documentFilterList.length));
        for (DocumentFilter value : documentFilterList) {
            getDocumentFilterList().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param documentFilterList One or more filters. Use a filter to return a more specific list of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDocumentsRequest withDocumentFilterList(java.util.Collection<DocumentFilter> documentFilterList) {
        if (documentFilterList == null) {
            this.documentFilterList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter> documentFilterListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DocumentFilter>(documentFilterList.size());
            documentFilterListCopy.addAll(documentFilterList);
            this.documentFilterList = documentFilterListCopy;
        }

        return this;
    }

    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return The maximum number of items to return for this call. The call also
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults The maximum number of items to return for this call. The call also
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the
     * next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults The maximum number of items to return for this call. The call also
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDocumentsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a previous call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDocumentsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDocumentFilterList() != null) sb.append("DocumentFilterList: " + getDocumentFilterList() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDocumentFilterList() == null) ? 0 : getDocumentFilterList().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDocumentsRequest == false) return false;
        ListDocumentsRequest other = (ListDocumentsRequest)obj;
        
        if (other.getDocumentFilterList() == null ^ this.getDocumentFilterList() == null) return false;
        if (other.getDocumentFilterList() != null && other.getDocumentFilterList().equals(this.getDocumentFilterList()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    