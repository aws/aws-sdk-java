/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of the data set contents and the reason they are in this state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetContentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetContentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason the data set contents are in this state.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * </p>
     * 
     * @param state
     *        The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * @see DatasetContentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * </p>
     * 
     * @return The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * @see DatasetContentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * </p>
     * 
     * @param state
     *        The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetContentState
     */

    public DatasetContentStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * </p>
     * 
     * @param state
     *        The state of the data set contents. Can be one of "READY", "CREATING", "SUCCEEDED" or "FAILED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetContentState
     */

    public DatasetContentStatus withState(DatasetContentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason the data set contents are in this state.
     * </p>
     * 
     * @param reason
     *        The reason the data set contents are in this state.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason the data set contents are in this state.
     * </p>
     * 
     * @return The reason the data set contents are in this state.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason the data set contents are in this state.
     * </p>
     * 
     * @param reason
     *        The reason the data set contents are in this state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentStatus withReason(String reason) {
        setReason(reason);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetContentStatus == false)
            return false;
        DatasetContentStatus other = (DatasetContentStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public DatasetContentStatus clone() {
        try {
            return (DatasetContentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetContentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
