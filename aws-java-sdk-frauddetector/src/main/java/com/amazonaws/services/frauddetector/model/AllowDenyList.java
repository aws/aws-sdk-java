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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of a list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/AllowDenyList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowDenyList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The variable type of the list.
     * </p>
     */
    private String variableType;
    /**
     * <p>
     * The time the list was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The time the list was last updated.
     * </p>
     */
    private String updatedTime;
    /**
     * <p>
     * The ARN of the list.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @param name
     *        The name of the list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @return The name of the list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the list.
     * </p>
     * 
     * @param name
     *        The name of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @param description
     *        The description of the list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @return The description of the list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the list.
     * </p>
     * 
     * @param description
     *        The description of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The variable type of the list.
     * </p>
     * 
     * @param variableType
     *        The variable type of the list.
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type of the list.
     * </p>
     * 
     * @return The variable type of the list.
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The variable type of the list.
     * </p>
     * 
     * @param variableType
     *        The variable type of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withVariableType(String variableType) {
        setVariableType(variableType);
        return this;
    }

    /**
     * <p>
     * The time the list was created.
     * </p>
     * 
     * @param createdTime
     *        The time the list was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time the list was created.
     * </p>
     * 
     * @return The time the list was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time the list was created.
     * </p>
     * 
     * @param createdTime
     *        The time the list was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time the list was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time the list was last updated.
     */

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time the list was last updated.
     * </p>
     * 
     * @return The time the list was last updated.
     */

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The time the list was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time the list was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withUpdatedTime(String updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the list.
     * </p>
     * 
     * @param arn
     *        The ARN of the list.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the list.
     * </p>
     * 
     * @return The ARN of the list.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the list.
     * </p>
     * 
     * @param arn
     *        The ARN of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowDenyList withArn(String arn) {
        setArn(arn);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowDenyList == false)
            return false;
        AllowDenyList other = (AllowDenyList) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public AllowDenyList clone() {
        try {
            return (AllowDenyList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.AllowDenyListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
