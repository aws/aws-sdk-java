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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRelatedResourcesForAuditFindingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The related resources.
     * </p>
     */
    private java.util.List<RelatedResource> relatedResources;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The related resources.
     * </p>
     * 
     * @return The related resources.
     */

    public java.util.List<RelatedResource> getRelatedResources() {
        return relatedResources;
    }

    /**
     * <p>
     * The related resources.
     * </p>
     * 
     * @param relatedResources
     *        The related resources.
     */

    public void setRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        if (relatedResources == null) {
            this.relatedResources = null;
            return;
        }

        this.relatedResources = new java.util.ArrayList<RelatedResource>(relatedResources);
    }

    /**
     * <p>
     * The related resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedResources(java.util.Collection)} or {@link #withRelatedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relatedResources
     *        The related resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedResourcesForAuditFindingResult withRelatedResources(RelatedResource... relatedResources) {
        if (this.relatedResources == null) {
            setRelatedResources(new java.util.ArrayList<RelatedResource>(relatedResources.length));
        }
        for (RelatedResource ele : relatedResources) {
            this.relatedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The related resources.
     * </p>
     * 
     * @param relatedResources
     *        The related resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedResourcesForAuditFindingResult withRelatedResources(java.util.Collection<RelatedResource> relatedResources) {
        setRelatedResources(relatedResources);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> for the first API
     *         call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> for the first API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRelatedResourcesForAuditFindingResult withNextToken(String nextToken) {
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
        if (getRelatedResources() != null)
            sb.append("RelatedResources: ").append(getRelatedResources()).append(",");
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

        if (obj instanceof ListRelatedResourcesForAuditFindingResult == false)
            return false;
        ListRelatedResourcesForAuditFindingResult other = (ListRelatedResourcesForAuditFindingResult) obj;
        if (other.getRelatedResources() == null ^ this.getRelatedResources() == null)
            return false;
        if (other.getRelatedResources() != null && other.getRelatedResources().equals(this.getRelatedResources()) == false)
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

        hashCode = prime * hashCode + ((getRelatedResources() == null) ? 0 : getRelatedResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRelatedResourcesForAuditFindingResult clone() {
        try {
            return (ListRelatedResourcesForAuditFindingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
