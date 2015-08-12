/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an association.
 * </p>
 */
public class AssociationDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The date when the association was made.
     * </p>
     */
    private java.util.Date dateValue;
    /**
     * <p>
     * The association status.
     * </p>
     */
    private AssociationStatus status;

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @param name
     *        The name of the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @return The name of the configuration document.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @param name
     *        The name of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssociationDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssociationDescription withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The date when the association was made.
     * </p>
     * 
     * @param dateValue
     *        The date when the association was made.
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * The date when the association was made.
     * </p>
     * 
     * @return The date when the association was made.
     */
    public java.util.Date getDate() {
        return this.dateValue;
    }

    /**
     * <p>
     * The date when the association was made.
     * </p>
     * 
     * @param dateValue
     *        The date when the association was made.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssociationDescription withDate(java.util.Date dateValue) {
        setDate(dateValue);
        return this;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param status
     *        The association status.
     */
    public void setStatus(AssociationStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @return The association status.
     */
    public AssociationStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The association status.
     * </p>
     * 
     * @param status
     *        The association status.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AssociationDescription withStatus(AssociationStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDate() != null)
            sb.append("Date: " + getDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationDescription == false)
            return false;
        AssociationDescription other = (AssociationDescription) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null
                && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AssociationDescription clone() {
        try {
            return (AssociationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}