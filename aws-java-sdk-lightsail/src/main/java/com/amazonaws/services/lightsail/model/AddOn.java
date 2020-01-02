/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an add-on that is enabled for an Amazon Lightsail resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AddOn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddOn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the add-on.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the add-on.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     */
    private String snapshotTimeOfDay;
    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     */
    private String nextSnapshotTimeOfDay;

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param name
     *        The name of the add-on.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @return The name of the add-on.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the add-on.
     * </p>
     * 
     * @param name
     *        The name of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOn withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @param status
     *        The status of the add-on.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @return The status of the add-on.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the add-on.
     * </p>
     * 
     * @param status
     *        The status of the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOn withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @param snapshotTimeOfDay
     *        The daily time when an automatic snapshot is created.</p>
     *        <p>
     *        The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *        </p>
     *        <p>
     *        The snapshot is automatically created between the time shown and up to 45 minutes after.
     */

    public void setSnapshotTimeOfDay(String snapshotTimeOfDay) {
        this.snapshotTimeOfDay = snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @return The daily time when an automatic snapshot is created.</p>
     *         <p>
     *         The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *         </p>
     *         <p>
     *         The snapshot is automatically created between the time shown and up to 45 minutes after.
     */

    public String getSnapshotTimeOfDay() {
        return this.snapshotTimeOfDay;
    }

    /**
     * <p>
     * The daily time when an automatic snapshot is created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @param snapshotTimeOfDay
     *        The daily time when an automatic snapshot is created.</p>
     *        <p>
     *        The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *        </p>
     *        <p>
     *        The snapshot is automatically created between the time shown and up to 45 minutes after.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOn withSnapshotTimeOfDay(String snapshotTimeOfDay) {
        setSnapshotTimeOfDay(snapshotTimeOfDay);
        return this;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @param nextSnapshotTimeOfDay
     *        The next daily time an automatic snapshot will be created.</p>
     *        <p>
     *        The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *        </p>
     *        <p>
     *        The snapshot is automatically created between the time shown and up to 45 minutes after.
     */

    public void setNextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
        this.nextSnapshotTimeOfDay = nextSnapshotTimeOfDay;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @return The next daily time an automatic snapshot will be created.</p>
     *         <p>
     *         The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *         </p>
     *         <p>
     *         The snapshot is automatically created between the time shown and up to 45 minutes after.
     */

    public String getNextSnapshotTimeOfDay() {
        return this.nextSnapshotTimeOfDay;
    }

    /**
     * <p>
     * The next daily time an automatic snapshot will be created.
     * </p>
     * <p>
     * The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     * </p>
     * <p>
     * The snapshot is automatically created between the time shown and up to 45 minutes after.
     * </p>
     * 
     * @param nextSnapshotTimeOfDay
     *        The next daily time an automatic snapshot will be created.</p>
     *        <p>
     *        The time shown is in <code>HH:00</code> format, and in Coordinated Universal Time (UTC).
     *        </p>
     *        <p>
     *        The snapshot is automatically created between the time shown and up to 45 minutes after.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddOn withNextSnapshotTimeOfDay(String nextSnapshotTimeOfDay) {
        setNextSnapshotTimeOfDay(nextSnapshotTimeOfDay);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSnapshotTimeOfDay() != null)
            sb.append("SnapshotTimeOfDay: ").append(getSnapshotTimeOfDay()).append(",");
        if (getNextSnapshotTimeOfDay() != null)
            sb.append("NextSnapshotTimeOfDay: ").append(getNextSnapshotTimeOfDay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddOn == false)
            return false;
        AddOn other = (AddOn) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSnapshotTimeOfDay() == null ^ this.getSnapshotTimeOfDay() == null)
            return false;
        if (other.getSnapshotTimeOfDay() != null && other.getSnapshotTimeOfDay().equals(this.getSnapshotTimeOfDay()) == false)
            return false;
        if (other.getNextSnapshotTimeOfDay() == null ^ this.getNextSnapshotTimeOfDay() == null)
            return false;
        if (other.getNextSnapshotTimeOfDay() != null && other.getNextSnapshotTimeOfDay().equals(this.getNextSnapshotTimeOfDay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSnapshotTimeOfDay() == null) ? 0 : getSnapshotTimeOfDay().hashCode());
        hashCode = prime * hashCode + ((getNextSnapshotTimeOfDay() == null) ? 0 : getNextSnapshotTimeOfDay().hashCode());
        return hashCode;
    }

    @Override
    public AddOn clone() {
        try {
            return (AddOn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AddOnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
