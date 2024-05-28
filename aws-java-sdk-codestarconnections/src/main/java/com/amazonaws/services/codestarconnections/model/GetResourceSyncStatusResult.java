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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/GetResourceSyncStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceSyncStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     * </p>
     */
    private Revision desiredState;
    /**
     * <p>
     * The latest successful sync for the sync status with the Git repository.
     * </p>
     */
    private ResourceSyncAttempt latestSuccessfulSync;
    /**
     * <p>
     * The latest sync for the sync status with the Git repository, whether successful or not.
     * </p>
     */
    private ResourceSyncAttempt latestSync;

    /**
     * <p>
     * The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     * </p>
     * 
     * @param desiredState
     *        The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     */

    public void setDesiredState(Revision desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     * </p>
     * 
     * @return The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     */

    public Revision getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     * </p>
     * 
     * @param desiredState
     *        The desired state of the Amazon Web Services resource for the sync status with the Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSyncStatusResult withDesiredState(Revision desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The latest successful sync for the sync status with the Git repository.
     * </p>
     * 
     * @param latestSuccessfulSync
     *        The latest successful sync for the sync status with the Git repository.
     */

    public void setLatestSuccessfulSync(ResourceSyncAttempt latestSuccessfulSync) {
        this.latestSuccessfulSync = latestSuccessfulSync;
    }

    /**
     * <p>
     * The latest successful sync for the sync status with the Git repository.
     * </p>
     * 
     * @return The latest successful sync for the sync status with the Git repository.
     */

    public ResourceSyncAttempt getLatestSuccessfulSync() {
        return this.latestSuccessfulSync;
    }

    /**
     * <p>
     * The latest successful sync for the sync status with the Git repository.
     * </p>
     * 
     * @param latestSuccessfulSync
     *        The latest successful sync for the sync status with the Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSyncStatusResult withLatestSuccessfulSync(ResourceSyncAttempt latestSuccessfulSync) {
        setLatestSuccessfulSync(latestSuccessfulSync);
        return this;
    }

    /**
     * <p>
     * The latest sync for the sync status with the Git repository, whether successful or not.
     * </p>
     * 
     * @param latestSync
     *        The latest sync for the sync status with the Git repository, whether successful or not.
     */

    public void setLatestSync(ResourceSyncAttempt latestSync) {
        this.latestSync = latestSync;
    }

    /**
     * <p>
     * The latest sync for the sync status with the Git repository, whether successful or not.
     * </p>
     * 
     * @return The latest sync for the sync status with the Git repository, whether successful or not.
     */

    public ResourceSyncAttempt getLatestSync() {
        return this.latestSync;
    }

    /**
     * <p>
     * The latest sync for the sync status with the Git repository, whether successful or not.
     * </p>
     * 
     * @param latestSync
     *        The latest sync for the sync status with the Git repository, whether successful or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSyncStatusResult withLatestSync(ResourceSyncAttempt latestSync) {
        setLatestSync(latestSync);
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
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getLatestSuccessfulSync() != null)
            sb.append("LatestSuccessfulSync: ").append(getLatestSuccessfulSync()).append(",");
        if (getLatestSync() != null)
            sb.append("LatestSync: ").append(getLatestSync());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceSyncStatusResult == false)
            return false;
        GetResourceSyncStatusResult other = (GetResourceSyncStatusResult) obj;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getLatestSuccessfulSync() == null ^ this.getLatestSuccessfulSync() == null)
            return false;
        if (other.getLatestSuccessfulSync() != null && other.getLatestSuccessfulSync().equals(this.getLatestSuccessfulSync()) == false)
            return false;
        if (other.getLatestSync() == null ^ this.getLatestSync() == null)
            return false;
        if (other.getLatestSync() != null && other.getLatestSync().equals(this.getLatestSync()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getLatestSuccessfulSync() == null) ? 0 : getLatestSuccessfulSync().hashCode());
        hashCode = prime * hashCode + ((getLatestSync() == null) ? 0 : getLatestSync().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceSyncStatusResult clone() {
        try {
            return (GetResourceSyncStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
