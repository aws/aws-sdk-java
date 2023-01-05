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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SyncJob status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/SyncJobStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncJobStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SyncJob status state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The SyncJob error.
     * </p>
     */
    private ErrorDetails error;

    /**
     * <p>
     * The SyncJob status state.
     * </p>
     * 
     * @param state
     *        The SyncJob status state.
     * @see SyncJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The SyncJob status state.
     * </p>
     * 
     * @return The SyncJob status state.
     * @see SyncJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The SyncJob status state.
     * </p>
     * 
     * @param state
     *        The SyncJob status state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncJobState
     */

    public SyncJobStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The SyncJob status state.
     * </p>
     * 
     * @param state
     *        The SyncJob status state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncJobState
     */

    public SyncJobStatus withState(SyncJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The SyncJob error.
     * </p>
     * 
     * @param error
     *        The SyncJob error.
     */

    public void setError(ErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * The SyncJob error.
     * </p>
     * 
     * @return The SyncJob error.
     */

    public ErrorDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * The SyncJob error.
     * </p>
     * 
     * @param error
     *        The SyncJob error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncJobStatus withError(ErrorDetails error) {
        setError(error);
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
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncJobStatus == false)
            return false;
        SyncJobStatus other = (SyncJobStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public SyncJobStatus clone() {
        try {
            return (SyncJobStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.SyncJobStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
