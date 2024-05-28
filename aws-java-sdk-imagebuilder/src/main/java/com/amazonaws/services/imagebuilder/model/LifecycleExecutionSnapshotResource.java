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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the state of an impacted snapshot resource that the runtime instance of the lifecycle policy identified for
 * action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecycleExecutionSnapshotResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExecutionSnapshotResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the impacted snapshot resource.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The runtime status of the lifecycle action taken for the snapshot.
     * </p>
     */
    private LifecycleExecutionResourceState state;

    /**
     * <p>
     * Identifies the impacted snapshot resource.
     * </p>
     * 
     * @param snapshotId
     *        Identifies the impacted snapshot resource.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * Identifies the impacted snapshot resource.
     * </p>
     * 
     * @return Identifies the impacted snapshot resource.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * Identifies the impacted snapshot resource.
     * </p>
     * 
     * @param snapshotId
     *        Identifies the impacted snapshot resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionSnapshotResource withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The runtime status of the lifecycle action taken for the snapshot.
     * </p>
     * 
     * @param state
     *        The runtime status of the lifecycle action taken for the snapshot.
     */

    public void setState(LifecycleExecutionResourceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The runtime status of the lifecycle action taken for the snapshot.
     * </p>
     * 
     * @return The runtime status of the lifecycle action taken for the snapshot.
     */

    public LifecycleExecutionResourceState getState() {
        return this.state;
    }

    /**
     * <p>
     * The runtime status of the lifecycle action taken for the snapshot.
     * </p>
     * 
     * @param state
     *        The runtime status of the lifecycle action taken for the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionSnapshotResource withState(LifecycleExecutionResourceState state) {
        setState(state);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
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

        if (obj instanceof LifecycleExecutionSnapshotResource == false)
            return false;
        LifecycleExecutionSnapshotResource other = (LifecycleExecutionSnapshotResource) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleExecutionSnapshotResource clone() {
        try {
            return (LifecycleExecutionSnapshotResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecycleExecutionSnapshotResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
