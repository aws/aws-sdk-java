/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the file system location for the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/FileSystemLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileSystemLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The file path.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The type of file.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The location name.
     * </p>
     * 
     * @param name
     *        The location name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The location name.
     * </p>
     * 
     * @return The location name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The location name.
     * </p>
     * 
     * @param name
     *        The location name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemLocation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @param path
     *        The file path.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @return The file path.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The file path.
     * </p>
     * 
     * @param path
     *        The file path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileSystemLocation withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The type of file.
     * </p>
     * 
     * @param type
     *        The type of file.
     * @see FileSystemLocationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of file.
     * </p>
     * 
     * @return The type of file.
     * @see FileSystemLocationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of file.
     * </p>
     * 
     * @param type
     *        The type of file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLocationType
     */

    public FileSystemLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of file.
     * </p>
     * 
     * @param type
     *        The type of file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileSystemLocationType
     */

    public FileSystemLocation withType(FileSystemLocationType type) {
        this.type = type.toString();
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
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileSystemLocation == false)
            return false;
        FileSystemLocation other = (FileSystemLocation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FileSystemLocation clone() {
        try {
            return (FileSystemLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.FileSystemLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
