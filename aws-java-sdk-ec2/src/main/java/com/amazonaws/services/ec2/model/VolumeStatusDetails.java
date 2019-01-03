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
 * Describes a volume status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VolumeStatusDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeStatusDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the volume status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * 
     * @param name
     *        The name of the volume status.
     * @see VolumeStatusName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * 
     * @return The name of the volume status.
     * @see VolumeStatusName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * 
     * @param name
     *        The name of the volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStatusName
     */

    public VolumeStatusDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * 
     * @param name
     *        The name of the volume status.
     * @see VolumeStatusName
     */

    public void setName(VolumeStatusName name) {
        withName(name);
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * 
     * @param name
     *        The name of the volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeStatusName
     */

    public VolumeStatusDetails withName(VolumeStatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     * 
     * @param status
     *        The intended status of the volume status.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     * 
     * @return The intended status of the volume status.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     * 
     * @param status
     *        The intended status of the volume status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VolumeStatusDetails withStatus(String status) {
        setStatus(status);
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

        if (obj instanceof VolumeStatusDetails == false)
            return false;
        VolumeStatusDetails other = (VolumeStatusDetails) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VolumeStatusDetails clone() {
        try {
            return (VolumeStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
