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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An indication of whether a project creation or deletion is failed or successful.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/ProjectStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phase of completion for a project creation or deletion.
     * </p>
     */
    private String state;
    /**
     * <p>
     * In the case of a project creation or deletion failure, a reason for the failure.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The phase of completion for a project creation or deletion.
     * </p>
     * 
     * @param state
     *        The phase of completion for a project creation or deletion.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The phase of completion for a project creation or deletion.
     * </p>
     * 
     * @return The phase of completion for a project creation or deletion.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The phase of completion for a project creation or deletion.
     * </p>
     * 
     * @param state
     *        The phase of completion for a project creation or deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * In the case of a project creation or deletion failure, a reason for the failure.
     * </p>
     * 
     * @param reason
     *        In the case of a project creation or deletion failure, a reason for the failure.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * In the case of a project creation or deletion failure, a reason for the failure.
     * </p>
     * 
     * @return In the case of a project creation or deletion failure, a reason for the failure.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * In the case of a project creation or deletion failure, a reason for the failure.
     * </p>
     * 
     * @param reason
     *        In the case of a project creation or deletion failure, a reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectStatus withReason(String reason) {
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

        if (obj instanceof ProjectStatus == false)
            return false;
        ProjectStatus other = (ProjectStatus) obj;
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
    public ProjectStatus clone() {
        try {
            return (ProjectStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.ProjectStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
