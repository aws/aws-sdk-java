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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * CPU utilization metrics for an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CPUUtilization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CPUUtilization implements Serializable, Cloneable {

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     * </p>
     */
    private Double user;
    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     * </p>
     */
    private Double nice;
    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     * </p>
     */
    private Double system;
    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     * </p>
     */
    private Double idle;
    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     * </p>
     */
    private Double iOWait;
    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     * </p>
     */
    private Double iRQ;
    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     * </p>
     */
    private Double softIRQ;
    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     * </p>
     */
    private Double privileged;

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     * </p>
     * 
     * @param user
     *        Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     */

    public void setUser(Double user) {
        this.user = user;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     */

    public Double getUser() {
        return this.user;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     * </p>
     * 
     * @param user
     *        Percentage of time that the CPU has spent in the <code>User</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withUser(Double user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     * </p>
     * 
     * @param nice
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     */

    public void setNice(Double nice) {
        this.nice = nice;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Linux environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     */

    public Double getNice() {
        return this.nice;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     * </p>
     * 
     * @param nice
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>Nice</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withNice(Double nice) {
        setNice(nice);
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     * </p>
     * 
     * @param system
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     */

    public void setSystem(Double system) {
        this.system = system;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Linux environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     */

    public Double getSystem() {
        return this.system;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     * </p>
     * 
     * @param system
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>System</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withSystem(Double system) {
        setSystem(system);
        return this;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     * </p>
     * 
     * @param idle
     *        Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     */

    public void setIdle(Double idle) {
        this.idle = idle;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     */

    public Double getIdle() {
        return this.idle;
    }

    /**
     * <p>
     * Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     * </p>
     * 
     * @param idle
     *        Percentage of time that the CPU has spent in the <code>Idle</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withIdle(Double idle) {
        setIdle(idle);
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     * </p>
     * 
     * @param iOWait
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     */

    public void setIOWait(Double iOWait) {
        this.iOWait = iOWait;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Linux environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     */

    public Double getIOWait() {
        return this.iOWait;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     * </p>
     * 
     * @param iOWait
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>I/O Wait</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withIOWait(Double iOWait) {
        setIOWait(iOWait);
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @param iRQ
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     */

    public void setIRQ(Double iRQ) {
        this.iRQ = iRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Linux environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     */

    public Double getIRQ() {
        return this.iRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @param iRQ
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>IRQ</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withIRQ(Double iRQ) {
        setIRQ(iRQ);
        return this;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @param softIRQ
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     */

    public void setSoftIRQ(Double softIRQ) {
        this.softIRQ = softIRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Linux environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     */

    public Double getSoftIRQ() {
        return this.softIRQ;
    }

    /**
     * <p>
     * Available on Linux environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     * </p>
     * 
     * @param softIRQ
     *        Available on Linux environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>SoftIRQ</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withSoftIRQ(Double softIRQ) {
        setSoftIRQ(softIRQ);
        return this;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     * </p>
     * 
     * @param privileged
     *        Available on Windows environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     */

    public void setPrivileged(Double privileged) {
        this.privileged = privileged;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     * </p>
     * 
     * @return Available on Windows environments only.</p>
     *         <p>
     *         Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     */

    public Double getPrivileged() {
        return this.privileged;
    }

    /**
     * <p>
     * Available on Windows environments only.
     * </p>
     * <p>
     * Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     * </p>
     * 
     * @param privileged
     *        Available on Windows environments only.</p>
     *        <p>
     *        Percentage of time that the CPU has spent in the <code>Privileged</code> state over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CPUUtilization withPrivileged(Double privileged) {
        setPrivileged(privileged);
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
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getNice() != null)
            sb.append("Nice: ").append(getNice()).append(",");
        if (getSystem() != null)
            sb.append("System: ").append(getSystem()).append(",");
        if (getIdle() != null)
            sb.append("Idle: ").append(getIdle()).append(",");
        if (getIOWait() != null)
            sb.append("IOWait: ").append(getIOWait()).append(",");
        if (getIRQ() != null)
            sb.append("IRQ: ").append(getIRQ()).append(",");
        if (getSoftIRQ() != null)
            sb.append("SoftIRQ: ").append(getSoftIRQ()).append(",");
        if (getPrivileged() != null)
            sb.append("Privileged: ").append(getPrivileged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CPUUtilization == false)
            return false;
        CPUUtilization other = (CPUUtilization) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getNice() == null ^ this.getNice() == null)
            return false;
        if (other.getNice() != null && other.getNice().equals(this.getNice()) == false)
            return false;
        if (other.getSystem() == null ^ this.getSystem() == null)
            return false;
        if (other.getSystem() != null && other.getSystem().equals(this.getSystem()) == false)
            return false;
        if (other.getIdle() == null ^ this.getIdle() == null)
            return false;
        if (other.getIdle() != null && other.getIdle().equals(this.getIdle()) == false)
            return false;
        if (other.getIOWait() == null ^ this.getIOWait() == null)
            return false;
        if (other.getIOWait() != null && other.getIOWait().equals(this.getIOWait()) == false)
            return false;
        if (other.getIRQ() == null ^ this.getIRQ() == null)
            return false;
        if (other.getIRQ() != null && other.getIRQ().equals(this.getIRQ()) == false)
            return false;
        if (other.getSoftIRQ() == null ^ this.getSoftIRQ() == null)
            return false;
        if (other.getSoftIRQ() != null && other.getSoftIRQ().equals(this.getSoftIRQ()) == false)
            return false;
        if (other.getPrivileged() == null ^ this.getPrivileged() == null)
            return false;
        if (other.getPrivileged() != null && other.getPrivileged().equals(this.getPrivileged()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getNice() == null) ? 0 : getNice().hashCode());
        hashCode = prime * hashCode + ((getSystem() == null) ? 0 : getSystem().hashCode());
        hashCode = prime * hashCode + ((getIdle() == null) ? 0 : getIdle().hashCode());
        hashCode = prime * hashCode + ((getIOWait() == null) ? 0 : getIOWait().hashCode());
        hashCode = prime * hashCode + ((getIRQ() == null) ? 0 : getIRQ().hashCode());
        hashCode = prime * hashCode + ((getSoftIRQ() == null) ? 0 : getSoftIRQ().hashCode());
        hashCode = prime * hashCode + ((getPrivileged() == null) ? 0 : getPrivileged().hashCode());
        return hashCode;
    }

    @Override
    public CPUUtilization clone() {
        try {
            return (CPUUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
