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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata transfer job status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/MetadataTransferJobStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataTransferJobStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata transfer job state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The metadata transfer job error.
     * </p>
     */
    private ErrorDetails error;
    /**
     * <p>
     * The queued position.
     * </p>
     */
    private Integer queuedPosition;

    /**
     * <p>
     * The metadata transfer job state.
     * </p>
     * 
     * @param state
     *        The metadata transfer job state.
     * @see MetadataTransferJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The metadata transfer job state.
     * </p>
     * 
     * @return The metadata transfer job state.
     * @see MetadataTransferJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The metadata transfer job state.
     * </p>
     * 
     * @param state
     *        The metadata transfer job state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataTransferJobState
     */

    public MetadataTransferJobStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The metadata transfer job state.
     * </p>
     * 
     * @param state
     *        The metadata transfer job state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataTransferJobState
     */

    public MetadataTransferJobStatus withState(MetadataTransferJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The metadata transfer job error.
     * </p>
     * 
     * @param error
     *        The metadata transfer job error.
     */

    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * The metadata transfer job error.
     * </p>
     * 
     * @return The metadata transfer job error.
     */

    public ErrorDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * The metadata transfer job error.
     * </p>
     * 
     * @param error
     *        The metadata transfer job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobStatus withError(ErrorDetails error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The queued position.
     * </p>
     * 
     * @param queuedPosition
     *        The queued position.
     */

    public void setQueuedPosition(Integer queuedPosition) {
        this.queuedPosition = queuedPosition;
    }

    /**
     * <p>
     * The queued position.
     * </p>
     * 
     * @return The queued position.
     */

    public Integer getQueuedPosition() {
        return this.queuedPosition;
    }

    /**
     * <p>
     * The queued position.
     * </p>
     * 
     * @param queuedPosition
     *        The queued position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataTransferJobStatus withQueuedPosition(Integer queuedPosition) {
        setQueuedPosition(queuedPosition);
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
            sb.append("State: ").append(getState()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getQueuedPosition() != null)
            sb.append("QueuedPosition: ").append(getQueuedPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataTransferJobStatus == false)
            return false;
        MetadataTransferJobStatus other = (MetadataTransferJobStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getQueuedPosition() == null ^ this.getQueuedPosition() == null)
            return false;
        if (other.getQueuedPosition() != null && other.getQueuedPosition().equals(this.getQueuedPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getQueuedPosition() == null) ? 0 : getQueuedPosition().hashCode());
        return hashCode;
    }

    @Override
    public MetadataTransferJobStatus clone() {
        try {
            return (MetadataTransferJobStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.MetadataTransferJobStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
