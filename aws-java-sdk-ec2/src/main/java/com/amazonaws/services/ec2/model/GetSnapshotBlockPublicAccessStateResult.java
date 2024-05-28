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
public class GetSnapshotBlockPublicAccessStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current state of block public access for snapshots. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't request
     * new public sharing. Additionally, snapshots that were already publicly shared are treated as private and are not
     * publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account can't
     * request new public sharing. However, snapshots that were already publicly shared, remain publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The current state of block public access for snapshots. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't request
     * new public sharing. Additionally, snapshots that were already publicly shared are treated as private and are not
     * publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account can't
     * request new public sharing. However, snapshots that were already publicly shared, remain publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of block public access for snapshots. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't
     *        request new public sharing. Additionally, snapshots that were already publicly shared are treated as
     *        private and are not publicly available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account
     *        can't request new public sharing. However, snapshots that were already publicly shared, remain publicly
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     *        </p>
     *        </li>
     * @see SnapshotBlockPublicAccessState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of block public access for snapshots. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't request
     * new public sharing. Additionally, snapshots that were already publicly shared are treated as private and are not
     * publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account can't
     * request new public sharing. However, snapshots that were already publicly shared, remain publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of block public access for snapshots. Possible values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't
     *         request new public sharing. Additionally, snapshots that were already publicly shared are treated as
     *         private and are not publicly available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account
     *         can't request new public sharing. However, snapshots that were already publicly shared, remain publicly
     *         available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     *         </p>
     *         </li>
     * @see SnapshotBlockPublicAccessState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of block public access for snapshots. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't request
     * new public sharing. Additionally, snapshots that were already publicly shared are treated as private and are not
     * publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account can't
     * request new public sharing. However, snapshots that were already publicly shared, remain publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of block public access for snapshots. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't
     *        request new public sharing. Additionally, snapshots that were already publicly shared are treated as
     *        private and are not publicly available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account
     *        can't request new public sharing. However, snapshots that were already publicly shared, remain publicly
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public GetSnapshotBlockPublicAccessStateResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of block public access for snapshots. Possible values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't request
     * new public sharing. Additionally, snapshots that were already publicly shared are treated as private and are not
     * publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account can't
     * request new public sharing. However, snapshots that were already publicly shared, remain publicly available.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The current state of block public access for snapshots. Possible values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-all-sharing</code> - All public sharing of snapshots is blocked. Users in the account can't
     *        request new public sharing. Additionally, snapshots that were already publicly shared are treated as
     *        private and are not publicly available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Only new public sharing of snapshots is blocked. Users in the account
     *        can't request new public sharing. However, snapshots that were already publicly shared, remain publicly
     *        available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unblocked</code> - Public sharing is not blocked. Users can publicly share snapshots.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotBlockPublicAccessState
     */

    public GetSnapshotBlockPublicAccessStateResult withState(SnapshotBlockPublicAccessState state) {
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

        if (obj instanceof GetSnapshotBlockPublicAccessStateResult == false)
            return false;
        GetSnapshotBlockPublicAccessStateResult other = (GetSnapshotBlockPublicAccessStateResult) obj;
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
    public GetSnapshotBlockPublicAccessStateResult clone() {
        try {
            return (GetSnapshotBlockPublicAccessStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
