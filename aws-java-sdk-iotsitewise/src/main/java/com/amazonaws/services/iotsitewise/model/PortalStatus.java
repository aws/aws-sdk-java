/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the current status of a portal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PortalStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortalStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of the portal.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     */
    private MonitorErrorDetails error;

    /**
     * <p>
     * The current state of the portal.
     * </p>
     * 
     * @param state
     *        The current state of the portal.
     * @see PortalState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the portal.
     * </p>
     * 
     * @return The current state of the portal.
     * @see PortalState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the portal.
     * </p>
     * 
     * @param state
     *        The current state of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortalState
     */

    public PortalStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the portal.
     * </p>
     * 
     * @param state
     *        The current state of the portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortalState
     */

    public PortalStatus withState(PortalState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     * 
     * @param error
     *        Contains associated error information, if any.
     */

    public void setError(MonitorErrorDetails error) {
        this.error = error;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     * 
     * @return Contains associated error information, if any.
     */

    public MonitorErrorDetails getError() {
        return this.error;
    }

    /**
     * <p>
     * Contains associated error information, if any.
     * </p>
     * 
     * @param error
     *        Contains associated error information, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortalStatus withError(MonitorErrorDetails error) {
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

        if (obj instanceof PortalStatus == false)
            return false;
        PortalStatus other = (PortalStatus) obj;
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
    public PortalStatus clone() {
        try {
            return (PortalStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PortalStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
