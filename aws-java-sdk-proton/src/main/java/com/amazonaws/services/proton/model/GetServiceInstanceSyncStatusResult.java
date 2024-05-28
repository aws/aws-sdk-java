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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetServiceInstanceSyncStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceInstanceSyncStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service instance sync desired state that's returned by Proton
     * </p>
     */
    private Revision desiredState;
    /**
     * <p>
     * The detailed data of the latest successful sync with the service instance.
     * </p>
     */
    private ResourceSyncAttempt latestSuccessfulSync;
    /**
     * <p>
     * The detailed data of the latest sync with the service instance.
     * </p>
     */
    private ResourceSyncAttempt latestSync;

    /**
     * <p>
     * The service instance sync desired state that's returned by Proton
     * </p>
     * 
     * @param desiredState
     *        The service instance sync desired state that's returned by Proton
     */

    public void setDesiredState(Revision desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The service instance sync desired state that's returned by Proton
     * </p>
     * 
     * @return The service instance sync desired state that's returned by Proton
     */

    public Revision getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The service instance sync desired state that's returned by Proton
     * </p>
     * 
     * @param desiredState
     *        The service instance sync desired state that's returned by Proton
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceSyncStatusResult withDesiredState(Revision desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The detailed data of the latest successful sync with the service instance.
     * </p>
     * 
     * @param latestSuccessfulSync
     *        The detailed data of the latest successful sync with the service instance.
     */

    public void setLatestSuccessfulSync(ResourceSyncAttempt latestSuccessfulSync) {
        this.latestSuccessfulSync = latestSuccessfulSync;
    }

    /**
     * <p>
     * The detailed data of the latest successful sync with the service instance.
     * </p>
     * 
     * @return The detailed data of the latest successful sync with the service instance.
     */

    public ResourceSyncAttempt getLatestSuccessfulSync() {
        return this.latestSuccessfulSync;
    }

    /**
     * <p>
     * The detailed data of the latest successful sync with the service instance.
     * </p>
     * 
     * @param latestSuccessfulSync
     *        The detailed data of the latest successful sync with the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceSyncStatusResult withLatestSuccessfulSync(ResourceSyncAttempt latestSuccessfulSync) {
        setLatestSuccessfulSync(latestSuccessfulSync);
        return this;
    }

    /**
     * <p>
     * The detailed data of the latest sync with the service instance.
     * </p>
     * 
     * @param latestSync
     *        The detailed data of the latest sync with the service instance.
     */

    public void setLatestSync(ResourceSyncAttempt latestSync) {
        this.latestSync = latestSync;
    }

    /**
     * <p>
     * The detailed data of the latest sync with the service instance.
     * </p>
     * 
     * @return The detailed data of the latest sync with the service instance.
     */

    public ResourceSyncAttempt getLatestSync() {
        return this.latestSync;
    }

    /**
     * <p>
     * The detailed data of the latest sync with the service instance.
     * </p>
     * 
     * @param latestSync
     *        The detailed data of the latest sync with the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceInstanceSyncStatusResult withLatestSync(ResourceSyncAttempt latestSync) {
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

        if (obj instanceof GetServiceInstanceSyncStatusResult == false)
            return false;
        GetServiceInstanceSyncStatusResult other = (GetServiceInstanceSyncStatusResult) obj;
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
    public GetServiceInstanceSyncStatusResult clone() {
        try {
            return (GetServiceInstanceSyncStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
