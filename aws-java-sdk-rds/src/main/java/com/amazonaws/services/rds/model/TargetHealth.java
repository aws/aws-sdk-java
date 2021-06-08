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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the connection health of an RDS Proxy target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/TargetHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetHealth implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     * lifecycle example for the states of an RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt; <code>unavailable</code>
     * &gt; <code>available</code>
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy target.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>, a
     * description is not included.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     * lifecycle example for the states of an RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt; <code>unavailable</code>
     * &gt; <code>available</code>
     * </p>
     * 
     * @param state
     *        The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     *        lifecycle example for the states of an RDS Proxy target: </p>
     *        <p>
     *        <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt;
     *        <code>unavailable</code> &gt; <code>available</code>
     * @see TargetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     * lifecycle example for the states of an RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt; <code>unavailable</code>
     * &gt; <code>available</code>
     * </p>
     * 
     * @return The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     *         lifecycle example for the states of an RDS Proxy target: </p>
     *         <p>
     *         <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt;
     *         <code>unavailable</code> &gt; <code>available</code>
     * @see TargetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     * lifecycle example for the states of an RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt; <code>unavailable</code>
     * &gt; <code>available</code>
     * </p>
     * 
     * @param state
     *        The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     *        lifecycle example for the states of an RDS Proxy target: </p>
     *        <p>
     *        <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt;
     *        <code>unavailable</code> &gt; <code>available</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetState
     */

    public TargetHealth withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     * lifecycle example for the states of an RDS Proxy target:
     * </p>
     * <p>
     * <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt; <code>unavailable</code>
     * &gt; <code>available</code>
     * </p>
     * 
     * @param state
     *        The current state of the connection health lifecycle for the RDS Proxy target. The following is a typical
     *        lifecycle example for the states of an RDS Proxy target: </p>
     *        <p>
     *        <code>registering</code> &gt; <code>unavailable</code> &gt; <code>available</code> &gt;
     *        <code>unavailable</code> &gt; <code>available</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetState
     */

    public TargetHealth withState(TargetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy target.
     * </p>
     * 
     * @param reason
     *        The reason for the current health <code>State</code> of the RDS Proxy target.
     * @see TargetHealthReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy target.
     * </p>
     * 
     * @return The reason for the current health <code>State</code> of the RDS Proxy target.
     * @see TargetHealthReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy target.
     * </p>
     * 
     * @param reason
     *        The reason for the current health <code>State</code> of the RDS Proxy target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthReason
     */

    public TargetHealth withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for the current health <code>State</code> of the RDS Proxy target.
     * </p>
     * 
     * @param reason
     *        The reason for the current health <code>State</code> of the RDS Proxy target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetHealthReason
     */

    public TargetHealth withReason(TargetHealthReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>, a
     * description is not included.
     * </p>
     * 
     * @param description
     *        A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>,
     *        a description is not included.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>, a
     * description is not included.
     * </p>
     * 
     * @return A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>,
     *         a description is not included.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>, a
     * description is not included.
     * </p>
     * 
     * @param description
     *        A description of the health of the RDS Proxy target. If the <code>State</code> is <code>AVAILABLE</code>,
     *        a description is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetHealth withDescription(String description) {
        setDescription(description);
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
            sb.append("Reason: ").append(getReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetHealth == false)
            return false;
        TargetHealth other = (TargetHealth) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TargetHealth clone() {
        try {
            return (TargetHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
