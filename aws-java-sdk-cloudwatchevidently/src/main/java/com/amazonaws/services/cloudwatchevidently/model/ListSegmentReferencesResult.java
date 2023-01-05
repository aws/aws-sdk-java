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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSegmentReferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of structures, where each structure contains information about one experiment or launch that uses this
     * segment.
     * </p>
     */
    private java.util.List<RefResource> referencedBy;

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListSegmentReferences</code> operation to return the next set of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one experiment or launch that uses this
     * segment.
     * </p>
     * 
     * @return An array of structures, where each structure contains information about one experiment or launch that
     *         uses this segment.
     */

    public java.util.List<RefResource> getReferencedBy() {
        return referencedBy;
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one experiment or launch that uses this
     * segment.
     * </p>
     * 
     * @param referencedBy
     *        An array of structures, where each structure contains information about one experiment or launch that uses
     *        this segment.
     */

    public void setReferencedBy(java.util.Collection<RefResource> referencedBy) {
        if (referencedBy == null) {
            this.referencedBy = null;
            return;
        }

        this.referencedBy = new java.util.ArrayList<RefResource>(referencedBy);
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one experiment or launch that uses this
     * segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferencedBy(java.util.Collection)} or {@link #withReferencedBy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param referencedBy
     *        An array of structures, where each structure contains information about one experiment or launch that uses
     *        this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesResult withReferencedBy(RefResource... referencedBy) {
        if (this.referencedBy == null) {
            setReferencedBy(new java.util.ArrayList<RefResource>(referencedBy.length));
        }
        for (RefResource ele : referencedBy) {
            this.referencedBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures, where each structure contains information about one experiment or launch that uses this
     * segment.
     * </p>
     * 
     * @param referencedBy
     *        An array of structures, where each structure contains information about one experiment or launch that uses
     *        this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesResult withReferencedBy(java.util.Collection<RefResource> referencedBy) {
        setReferencedBy(referencedBy);
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
        if (getReferencedBy() != null)
            sb.append("ReferencedBy: ").append(getReferencedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSegmentReferencesResult == false)
            return false;
        ListSegmentReferencesResult other = (ListSegmentReferencesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReferencedBy() == null ^ this.getReferencedBy() == null)
            return false;
        if (other.getReferencedBy() != null && other.getReferencedBy().equals(this.getReferencedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReferencedBy() == null) ? 0 : getReferencedBy().hashCode());
        return hashCode;
    }

    @Override
    public ListSegmentReferencesResult clone() {
        try {
            return (ListSegmentReferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
