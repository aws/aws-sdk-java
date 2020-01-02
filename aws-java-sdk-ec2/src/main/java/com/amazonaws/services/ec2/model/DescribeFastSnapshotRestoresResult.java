/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastSnapshotRestoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the state of fast snapshot restores.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DescribeFastSnapshotRestoreSuccessItem> fastSnapshotRestores;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the state of fast snapshot restores.
     * </p>
     * 
     * @return Information about the state of fast snapshot restores.
     */

    public java.util.List<DescribeFastSnapshotRestoreSuccessItem> getFastSnapshotRestores() {
        if (fastSnapshotRestores == null) {
            fastSnapshotRestores = new com.amazonaws.internal.SdkInternalList<DescribeFastSnapshotRestoreSuccessItem>();
        }
        return fastSnapshotRestores;
    }

    /**
     * <p>
     * Information about the state of fast snapshot restores.
     * </p>
     * 
     * @param fastSnapshotRestores
     *        Information about the state of fast snapshot restores.
     */

    public void setFastSnapshotRestores(java.util.Collection<DescribeFastSnapshotRestoreSuccessItem> fastSnapshotRestores) {
        if (fastSnapshotRestores == null) {
            this.fastSnapshotRestores = null;
            return;
        }

        this.fastSnapshotRestores = new com.amazonaws.internal.SdkInternalList<DescribeFastSnapshotRestoreSuccessItem>(fastSnapshotRestores);
    }

    /**
     * <p>
     * Information about the state of fast snapshot restores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFastSnapshotRestores(java.util.Collection)} or {@link #withFastSnapshotRestores(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param fastSnapshotRestores
     *        Information about the state of fast snapshot restores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresResult withFastSnapshotRestores(DescribeFastSnapshotRestoreSuccessItem... fastSnapshotRestores) {
        if (this.fastSnapshotRestores == null) {
            setFastSnapshotRestores(new com.amazonaws.internal.SdkInternalList<DescribeFastSnapshotRestoreSuccessItem>(fastSnapshotRestores.length));
        }
        for (DescribeFastSnapshotRestoreSuccessItem ele : fastSnapshotRestores) {
            this.fastSnapshotRestores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the state of fast snapshot restores.
     * </p>
     * 
     * @param fastSnapshotRestores
     *        Information about the state of fast snapshot restores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresResult withFastSnapshotRestores(java.util.Collection<DescribeFastSnapshotRestoreSuccessItem> fastSnapshotRestores) {
        setFastSnapshotRestores(fastSnapshotRestores);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresResult withNextToken(String nextToken) {
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
        if (getFastSnapshotRestores() != null)
            sb.append("FastSnapshotRestores: ").append(getFastSnapshotRestores()).append(",");
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

        if (obj instanceof DescribeFastSnapshotRestoresResult == false)
            return false;
        DescribeFastSnapshotRestoresResult other = (DescribeFastSnapshotRestoresResult) obj;
        if (other.getFastSnapshotRestores() == null ^ this.getFastSnapshotRestores() == null)
            return false;
        if (other.getFastSnapshotRestores() != null && other.getFastSnapshotRestores().equals(this.getFastSnapshotRestores()) == false)
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

        hashCode = prime * hashCode + ((getFastSnapshotRestores() == null) ? 0 : getFastSnapshotRestores().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFastSnapshotRestoresResult clone() {
        try {
            return (DescribeFastSnapshotRestoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
