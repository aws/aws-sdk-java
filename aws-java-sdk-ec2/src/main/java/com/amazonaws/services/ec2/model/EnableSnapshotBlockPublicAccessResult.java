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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableSnapshotBlockPublicAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The state of block public access for snapshots for the account and Region. Returns either
     * <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The state of block public access for snapshots for the account and Region. Returns either
     * <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * </p>
     * 
     * @param state
     *        The state of block public access for snapshots for the account and Region. Returns either
     *        <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * @see SnapshotBlockPublicAccessState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of block public access for snapshots for the account and Region. Returns either
     * <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * </p>
     * 
     * @return The state of block public access for snapshots for the account and Region. Returns either
     *         <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * @see SnapshotBlockPublicAccessState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of block public access for snapshots for the account and Region. Returns either
     * <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * </p>
     * 
     * @param state
     *        The state of block public access for snapshots for the account and Region. Returns either
     *        <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public EnableSnapshotBlockPublicAccessResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of block public access for snapshots for the account and Region. Returns either
     * <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * </p>
     * 
     * @param state
     *        The state of block public access for snapshots for the account and Region. Returns either
     *        <code>block-all-sharing</code> or <code>block-new-sharing</code> if the request succeeds.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public EnableSnapshotBlockPublicAccessResult withState(SnapshotBlockPublicAccessState state) {
        this.state = state.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSnapshotBlockPublicAccessResult == false)
            return false;
        EnableSnapshotBlockPublicAccessResult other = (EnableSnapshotBlockPublicAccessResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public EnableSnapshotBlockPublicAccessResult clone() {
        try {
            return (EnableSnapshotBlockPublicAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
