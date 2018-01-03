/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Stack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stack implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the stack.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the stack.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for display.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The stack name for display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The time the stack was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     */
    private java.util.List<StorageConnector> storageConnectors;
    /**
     * <p>
     * The errors for the stack.
     * </p>
     */
    private java.util.List<StackError> stackErrors;

    /**
     * <p>
     * The ARN of the stack.
     * </p>
     * 
     * @param arn
     *        The ARN of the stack.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the stack.
     * </p>
     * 
     * @return The ARN of the stack.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the stack.
     * </p>
     * 
     * @param arn
     *        The ARN of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @return The name of the stack.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stack.
     * </p>
     * 
     * @param name
     *        The name of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @return The description for display.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for display.
     * </p>
     * 
     * @param description
     *        The description for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @return The stack name for display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The stack name for display.
     * </p>
     * 
     * @param displayName
     *        The stack name for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param createdTime
     *        The time the stack was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @return The time the stack was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param createdTime
     *        The time the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @return The storage connectors to enable.
     */

    public java.util.List<StorageConnector> getStorageConnectors() {
        return storageConnectors;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     */

    public void setStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        if (storageConnectors == null) {
            this.storageConnectors = null;
            return;
        }

        this.storageConnectors = new java.util.ArrayList<StorageConnector>(storageConnectors);
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageConnectors(java.util.Collection)} or {@link #withStorageConnectors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStorageConnectors(StorageConnector... storageConnectors) {
        if (this.storageConnectors == null) {
            setStorageConnectors(new java.util.ArrayList<StorageConnector>(storageConnectors.length));
        }
        for (StorageConnector ele : storageConnectors) {
            this.storageConnectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage connectors to enable.
     * </p>
     * 
     * @param storageConnectors
     *        The storage connectors to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStorageConnectors(java.util.Collection<StorageConnector> storageConnectors) {
        setStorageConnectors(storageConnectors);
        return this;
    }

    /**
     * <p>
     * The errors for the stack.
     * </p>
     * 
     * @return The errors for the stack.
     */

    public java.util.List<StackError> getStackErrors() {
        return stackErrors;
    }

    /**
     * <p>
     * The errors for the stack.
     * </p>
     * 
     * @param stackErrors
     *        The errors for the stack.
     */

    public void setStackErrors(java.util.Collection<StackError> stackErrors) {
        if (stackErrors == null) {
            this.stackErrors = null;
            return;
        }

        this.stackErrors = new java.util.ArrayList<StackError>(stackErrors);
    }

    /**
     * <p>
     * The errors for the stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackErrors(java.util.Collection)} or {@link #withStackErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stackErrors
     *        The errors for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackErrors(StackError... stackErrors) {
        if (this.stackErrors == null) {
            setStackErrors(new java.util.ArrayList<StackError>(stackErrors.length));
        }
        for (StackError ele : stackErrors) {
            this.stackErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors for the stack.
     * </p>
     * 
     * @param stackErrors
     *        The errors for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackErrors(java.util.Collection<StackError> stackErrors) {
        setStackErrors(stackErrors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getStorageConnectors() != null)
            sb.append("StorageConnectors: ").append(getStorageConnectors()).append(",");
        if (getStackErrors() != null)
            sb.append("StackErrors: ").append(getStackErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stack == false)
            return false;
        Stack other = (Stack) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getStorageConnectors() == null ^ this.getStorageConnectors() == null)
            return false;
        if (other.getStorageConnectors() != null && other.getStorageConnectors().equals(this.getStorageConnectors()) == false)
            return false;
        if (other.getStackErrors() == null ^ this.getStackErrors() == null)
            return false;
        if (other.getStackErrors() != null && other.getStackErrors().equals(this.getStackErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getStorageConnectors() == null) ? 0 : getStorageConnectors().hashCode());
        hashCode = prime * hashCode + ((getStackErrors() == null) ? 0 : getStackErrors().hashCode());
        return hashCode;
    }

    @Override
    public Stack clone() {
        try {
            return (Stack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.StackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
