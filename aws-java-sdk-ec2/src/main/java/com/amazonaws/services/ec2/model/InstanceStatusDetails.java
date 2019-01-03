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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the instance status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceStatusDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStatusDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched and impaired, this is the time when the
     * instance was launched.
     * </p>
     */
    private java.util.Date impairedSince;
    /**
     * <p>
     * The type of instance status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched and impaired, this is the time when the
     * instance was launched.
     * </p>
     * 
     * @param impairedSince
     *        The time when a status check failed. For an instance that was launched and impaired, this is the time when
     *        the instance was launched.
     */

    public void setImpairedSince(java.util.Date impairedSince) {
        this.impairedSince = impairedSince;
    }

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched and impaired, this is the time when the
     * instance was launched.
     * </p>
     * 
     * @return The time when a status check failed. For an instance that was launched and impaired, this is the time
     *         when the instance was launched.
     */

    public java.util.Date getImpairedSince() {
        return this.impairedSince;
    }

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched and impaired, this is the time when the
     * instance was launched.
     * </p>
     * 
     * @param impairedSince
     *        The time when a status check failed. For an instance that was launched and impaired, this is the time when
     *        the instance was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatusDetails withImpairedSince(java.util.Date impairedSince) {
        setImpairedSince(impairedSince);
        return this;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * 
     * @param name
     *        The type of instance status.
     * @see StatusName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * 
     * @return The type of instance status.
     * @see StatusName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * 
     * @param name
     *        The type of instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusName
     */

    public InstanceStatusDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * 
     * @param name
     *        The type of instance status.
     * @see StatusName
     */

    public void setName(StatusName name) {
        withName(name);
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * 
     * @param name
     *        The type of instance status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusName
     */

    public InstanceStatusDetails withName(StatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see StatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see StatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public InstanceStatusDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see StatusType
     */

    public void setStatus(StatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public InstanceStatusDetails withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getImpairedSince() != null)
            sb.append("ImpairedSince: ").append(getImpairedSince()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatusDetails == false)
            return false;
        InstanceStatusDetails other = (InstanceStatusDetails) obj;
        if (other.getImpairedSince() == null ^ this.getImpairedSince() == null)
            return false;
        if (other.getImpairedSince() != null && other.getImpairedSince().equals(this.getImpairedSince()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImpairedSince() == null) ? 0 : getImpairedSince().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStatusDetails clone() {
        try {
            return (InstanceStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
