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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ListSourceApiAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSourceApiAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>SourceApiAssociationSummary</code> object data.
     * </p>
     */
    private java.util.List<SourceApiAssociationSummary> sourceApiAssociationSummaries;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The <code>SourceApiAssociationSummary</code> object data.
     * </p>
     * 
     * @return The <code>SourceApiAssociationSummary</code> object data.
     */

    public java.util.List<SourceApiAssociationSummary> getSourceApiAssociationSummaries() {
        return sourceApiAssociationSummaries;
    }

    /**
     * <p>
     * The <code>SourceApiAssociationSummary</code> object data.
     * </p>
     * 
     * @param sourceApiAssociationSummaries
     *        The <code>SourceApiAssociationSummary</code> object data.
     */

    public void setSourceApiAssociationSummaries(java.util.Collection<SourceApiAssociationSummary> sourceApiAssociationSummaries) {
        if (sourceApiAssociationSummaries == null) {
            this.sourceApiAssociationSummaries = null;
            return;
        }

        this.sourceApiAssociationSummaries = new java.util.ArrayList<SourceApiAssociationSummary>(sourceApiAssociationSummaries);
    }

    /**
     * <p>
     * The <code>SourceApiAssociationSummary</code> object data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceApiAssociationSummaries(java.util.Collection)} or
     * {@link #withSourceApiAssociationSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceApiAssociationSummaries
     *        The <code>SourceApiAssociationSummary</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSourceApiAssociationsResult withSourceApiAssociationSummaries(SourceApiAssociationSummary... sourceApiAssociationSummaries) {
        if (this.sourceApiAssociationSummaries == null) {
            setSourceApiAssociationSummaries(new java.util.ArrayList<SourceApiAssociationSummary>(sourceApiAssociationSummaries.length));
        }
        for (SourceApiAssociationSummary ele : sourceApiAssociationSummaries) {
            this.sourceApiAssociationSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>SourceApiAssociationSummary</code> object data.
     * </p>
     * 
     * @param sourceApiAssociationSummaries
     *        The <code>SourceApiAssociationSummary</code> object data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSourceApiAssociationsResult withSourceApiAssociationSummaries(java.util.Collection<SourceApiAssociationSummary> sourceApiAssociationSummaries) {
        setSourceApiAssociationSummaries(sourceApiAssociationSummaries);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which you can use to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which you can use to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which you can use to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which you can use to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSourceApiAssociationsResult withNextToken(String nextToken) {
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
        if (getSourceApiAssociationSummaries() != null)
            sb.append("SourceApiAssociationSummaries: ").append(getSourceApiAssociationSummaries()).append(",");
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

        if (obj instanceof ListSourceApiAssociationsResult == false)
            return false;
        ListSourceApiAssociationsResult other = (ListSourceApiAssociationsResult) obj;
        if (other.getSourceApiAssociationSummaries() == null ^ this.getSourceApiAssociationSummaries() == null)
            return false;
        if (other.getSourceApiAssociationSummaries() != null
                && other.getSourceApiAssociationSummaries().equals(this.getSourceApiAssociationSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSourceApiAssociationSummaries() == null) ? 0 : getSourceApiAssociationSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSourceApiAssociationsResult clone() {
        try {
            return (ListSourceApiAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
