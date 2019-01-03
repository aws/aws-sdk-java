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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an update repository description operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryName" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The existing name of the repository.
     * </p>
     */
    private String oldName;
    /**
     * <p>
     * The new name for the repository.
     * </p>
     */
    private String newName;

    /**
     * <p>
     * The existing name of the repository.
     * </p>
     * 
     * @param oldName
     *        The existing name of the repository.
     */

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    /**
     * <p>
     * The existing name of the repository.
     * </p>
     * 
     * @return The existing name of the repository.
     */

    public String getOldName() {
        return this.oldName;
    }

    /**
     * <p>
     * The existing name of the repository.
     * </p>
     * 
     * @param oldName
     *        The existing name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryNameRequest withOldName(String oldName) {
        setOldName(oldName);
        return this;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * 
     * @param newName
     *        The new name for the repository.
     */

    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * 
     * @return The new name for the repository.
     */

    public String getNewName() {
        return this.newName;
    }

    /**
     * <p>
     * The new name for the repository.
     * </p>
     * 
     * @param newName
     *        The new name for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryNameRequest withNewName(String newName) {
        setNewName(newName);
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
        if (getOldName() != null)
            sb.append("OldName: ").append(getOldName()).append(",");
        if (getNewName() != null)
            sb.append("NewName: ").append(getNewName());
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
        if (other.getOldName() != null && other.getOldName().equals(this.getOldName()) == false)
            return false;
        if (other.getNewName() == null ^ this.getNewName() == null)
            return false;
        if (other.getNewName() != null && other.getNewName().equals(this.getNewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOldName() == null) ? 0 : getOldName().hashCode());
        hashCode = prime * hashCode + ((getNewName() == null) ? 0 : getNewName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryNameRequest clone() {
        return (UpdateRepositoryNameRequest) super.clone();
    }

}
