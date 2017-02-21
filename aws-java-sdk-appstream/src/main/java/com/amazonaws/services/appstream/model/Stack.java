/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Details about a stack.
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
     * The unique identifier of the stack.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A meaningful description for the stack.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A display name for the stack.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The timestamp when the stack was created.
     * </p>
     */
    private java.util.Date createdTime;

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
     * The unique identifier of the stack.
     * </p>
     * 
     * @param name
     *        The unique identifier of the stack.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier of the stack.
     * </p>
     * 
     * @return The unique identifier of the stack.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier of the stack.
     * </p>
     * 
     * @param name
     *        The unique identifier of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A meaningful description for the stack.
     * </p>
     * 
     * @param description
     *        A meaningful description for the stack.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A meaningful description for the stack.
     * </p>
     * 
     * @return A meaningful description for the stack.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A meaningful description for the stack.
     * </p>
     * 
     * @param description
     *        A meaningful description for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A display name for the stack.
     * </p>
     * 
     * @param displayName
     *        A display name for the stack.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * A display name for the stack.
     * </p>
     * 
     * @return A display name for the stack.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * A display name for the stack.
     * </p>
     * 
     * @param displayName
     *        A display name for the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The timestamp when the stack was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the stack was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the stack was created.
     * </p>
     * 
     * @return The timestamp when the stack was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the stack was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
            sb.append("CreatedTime: ").append(getCreatedTime());
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
