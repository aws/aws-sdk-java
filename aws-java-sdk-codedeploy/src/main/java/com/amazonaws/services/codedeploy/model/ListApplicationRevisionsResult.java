/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a list application revisions operation.
 * </p>
 */
public class ListApplicationRevisionsResult implements Serializable {

    /**
     * A list of revision locations that contain the matching revisions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation> revisions;

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list application revisions call to return the next set of application
     * revisions in the list.
     */
    private String nextToken;

    /**
     * A list of revision locations that contain the matching revisions.
     *
     * @return A list of revision locations that contain the matching revisions.
     */
    public java.util.List<RevisionLocation> getRevisions() {
        if (revisions == null) {
              revisions = new com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation>();
              revisions.setAutoConstruct(true);
        }
        return revisions;
    }
    
    /**
     * A list of revision locations that contain the matching revisions.
     *
     * @param revisions A list of revision locations that contain the matching revisions.
     */
    public void setRevisions(java.util.Collection<RevisionLocation> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation> revisionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation>(revisions.size());
        revisionsCopy.addAll(revisions);
        this.revisions = revisionsCopy;
    }
    
    /**
     * A list of revision locations that contain the matching revisions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revisions A list of revision locations that contain the matching revisions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsResult withRevisions(RevisionLocation... revisions) {
        if (getRevisions() == null) setRevisions(new java.util.ArrayList<RevisionLocation>(revisions.length));
        for (RevisionLocation value : revisions) {
            getRevisions().add(value);
        }
        return this;
    }
    
    /**
     * A list of revision locations that contain the matching revisions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revisions A list of revision locations that contain the matching revisions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsResult withRevisions(java.util.Collection<RevisionLocation> revisions) {
        if (revisions == null) {
            this.revisions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation> revisionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RevisionLocation>(revisions.size());
            revisionsCopy.addAll(revisions);
            this.revisions = revisionsCopy;
        }

        return this;
    }

    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list application revisions call to return the next set of application
     * revisions in the list.
     *
     * @return If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list application revisions call to return the next set of application
     *         revisions in the list.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list application revisions call to return the next set of application
     * revisions in the list.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list application revisions call to return the next set of application
     *         revisions in the list.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If the amount of information that is returned is significantly large,
     * an identifier will also be returned, which can be used in a subsequent
     * list application revisions call to return the next set of application
     * revisions in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If the amount of information that is returned is significantly large,
     *         an identifier will also be returned, which can be used in a subsequent
     *         list application revisions call to return the next set of application
     *         revisions in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListApplicationRevisionsResult withNextToken(String nextToken) {
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
        if (getRevisions() != null) sb.append("Revisions: " + getRevisions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListApplicationRevisionsResult == false) return false;
        ListApplicationRevisionsResult other = (ListApplicationRevisionsResult)obj;
        
        if (other.getRevisions() == null ^ this.getRevisions() == null) return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    