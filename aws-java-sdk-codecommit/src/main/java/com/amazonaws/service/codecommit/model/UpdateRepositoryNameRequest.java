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

package com.amazonaws.service.codecommit.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an update repository description operation.
 * </p>
 */
public class UpdateRepositoryNameRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String oldName;

    private String newName;

    /**
     * Sets the value of the OldName property for this object.
     * 
     * @param oldName
     *        The new value for the OldName property for this object.
     */
    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    /**
     * Returns the value of the OldName property for this object.
     * 
     * @return The value of the OldName property for this object.
     */
    public String getOldName() {
        return this.oldName;
    }

    /**
     * Sets the value of the OldName property for this object.
     * 
     * @param oldName
     *        The new value for the OldName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryNameRequest withOldName(String oldName) {
        setOldName(oldName);
        return this;
    }

    /**
     * Sets the value of the NewName property for this object.
     * 
     * @param newName
     *        The new value for the NewName property for this object.
     */
    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * Returns the value of the NewName property for this object.
     * 
     * @return The value of the NewName property for this object.
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * Sets the value of the NewName property for this object.
     * 
     * @param newName
     *        The new value for the NewName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateRepositoryNameRequest withNewName(String newName) {
        setNewName(newName);
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
        if (getOldName() != null)
            sb.append("OldName: " + getOldName() + ",");
        if (getNewName() != null)
            sb.append("NewName: " + getNewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryNameRequest == false)
            return false;
        UpdateRepositoryNameRequest other = (UpdateRepositoryNameRequest) obj;
        if (other.getOldName() == null ^ this.getOldName() == null)
            return false;
        if (other.getOldName() != null
                && other.getOldName().equals(this.getOldName()) == false)
            return false;
        if (other.getNewName() == null ^ this.getNewName() == null)
            return false;
        if (other.getNewName() != null
                && other.getNewName().equals(this.getNewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOldName() == null) ? 0 : getOldName().hashCode());
        hashCode = prime * hashCode
                + ((getNewName() == null) ? 0 : getNewName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryNameRequest clone() {
        return (UpdateRepositoryNameRequest) super.clone();
    }
}