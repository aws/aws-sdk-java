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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListSnapshotCopyConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSnapshotCopyConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * All of the returned snapshot copy configurations.
     * </p>
     */
    private java.util.List<SnapshotCopyConfiguration> snapshotCopyConfigurations;

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotCopyConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * All of the returned snapshot copy configurations.
     * </p>
     * 
     * @return All of the returned snapshot copy configurations.
     */

    public java.util.List<SnapshotCopyConfiguration> getSnapshotCopyConfigurations() {
        return snapshotCopyConfigurations;
    }

    /**
     * <p>
     * All of the returned snapshot copy configurations.
     * </p>
     * 
     * @param snapshotCopyConfigurations
     *        All of the returned snapshot copy configurations.
     */

    public void setSnapshotCopyConfigurations(java.util.Collection<SnapshotCopyConfiguration> snapshotCopyConfigurations) {
        if (snapshotCopyConfigurations == null) {
            this.snapshotCopyConfigurations = null;
            return;
        }

        this.snapshotCopyConfigurations = new java.util.ArrayList<SnapshotCopyConfiguration>(snapshotCopyConfigurations);
    }

    /**
     * <p>
     * All of the returned snapshot copy configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotCopyConfigurations(java.util.Collection)} or
     * {@link #withSnapshotCopyConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param snapshotCopyConfigurations
     *        All of the returned snapshot copy configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotCopyConfigurationsResult withSnapshotCopyConfigurations(SnapshotCopyConfiguration... snapshotCopyConfigurations) {
        if (this.snapshotCopyConfigurations == null) {
            setSnapshotCopyConfigurations(new java.util.ArrayList<SnapshotCopyConfiguration>(snapshotCopyConfigurations.length));
        }
        for (SnapshotCopyConfiguration ele : snapshotCopyConfigurations) {
            this.snapshotCopyConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All of the returned snapshot copy configurations.
     * </p>
     * 
     * @param snapshotCopyConfigurations
     *        All of the returned snapshot copy configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotCopyConfigurationsResult withSnapshotCopyConfigurations(java.util.Collection<SnapshotCopyConfiguration> snapshotCopyConfigurations) {
        setSnapshotCopyConfigurations(snapshotCopyConfigurations);
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
        if (getSnapshotCopyConfigurations() != null)
            sb.append("SnapshotCopyConfigurations: ").append(getSnapshotCopyConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSnapshotCopyConfigurationsResult == false)
            return false;
        ListSnapshotCopyConfigurationsResult other = (ListSnapshotCopyConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSnapshotCopyConfigurations() == null ^ this.getSnapshotCopyConfigurations() == null)
            return false;
        if (other.getSnapshotCopyConfigurations() != null && other.getSnapshotCopyConfigurations().equals(this.getSnapshotCopyConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCopyConfigurations() == null) ? 0 : getSnapshotCopyConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public ListSnapshotCopyConfigurationsResult clone() {
        try {
            return (ListSnapshotCopyConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
