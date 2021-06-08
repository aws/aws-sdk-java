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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The name of the project that you updated.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the project was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @return The date and time that the project was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the project was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the project was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the project that you updated.
     * </p>
     * 
     * @param name
     *        The name of the project that you updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the project that you updated.
     * </p>
     * 
     * @return The name of the project that you updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the project that you updated.
     * </p>
     * 
     * @param name
     *        The name of the project that you updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProjectResult withName(String name) {
        setName(name);
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
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProjectResult == false)
            return false;
        UpdateProjectResult other = (UpdateProjectResult) obj;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProjectResult clone() {
        try {
            return (UpdateProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
