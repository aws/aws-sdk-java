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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Directory structure that includes the directory name and directory ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/Directory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Directory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the directory.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time when the directory was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @param name
     *        The name of the directory.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @return The name of the directory.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the directory.
     * </p>
     * 
     * @param name
     *        The name of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Directory withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the directory. For more information, see
     *        <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the directory. For more information, see
     *         <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the directory. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Directory withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or
     *        <code>Deleted</code>.
     * @see DirectoryState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     * 
     * @return The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or
     *         <code>Deleted</code>.
     * @see DirectoryState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or
     *        <code>Deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryState
     */

    public Directory withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or
     *        <code>Deleted</code>.
     * @see DirectoryState
     */

    public void setState(DirectoryState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or <code>Deleted</code>.
     * </p>
     * 
     * @param state
     *        The state of the directory. Can be either <code>Enabled</code>, <code>Disabled</code>, or
     *        <code>Deleted</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryState
     */

    public Directory withState(DirectoryState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the directory was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the directory was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the directory was created.
     * </p>
     * 
     * @return The date and time when the directory was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the directory was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the directory was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Directory withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Directory == false)
            return false;
        Directory other = (Directory) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public Directory clone() {
        try {
            return (Directory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.DirectoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
