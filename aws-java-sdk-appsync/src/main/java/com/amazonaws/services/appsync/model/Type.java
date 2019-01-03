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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/Type" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Type implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type definition.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The type name.
     * </p>
     * 
     * @param name
     *        The type name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type name.
     * </p>
     * 
     * @return The type name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type name.
     * </p>
     * 
     * @param name
     *        The type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type description.
     * </p>
     * 
     * @param description
     *        The type description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The type description.
     * </p>
     * 
     * @return The type description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The type description.
     * </p>
     * 
     * @param description
     *        The type description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type ARN.
     * </p>
     * 
     * @param arn
     *        The type ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The type ARN.
     * </p>
     * 
     * @return The type ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The type ARN.
     * </p>
     * 
     * @param arn
     *        The type ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type definition.
     * </p>
     * 
     * @param definition
     *        The type definition.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The type definition.
     * </p>
     * 
     * @return The type definition.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The type definition.
     * </p>
     * 
     * @param definition
     *        The type definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Type withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @return The type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public Type withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public Type withFormat(TypeDefinitionFormat format) {
        this.format = format.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Type == false)
            return false;
        Type other = (Type) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public Type clone() {
        try {
            return (Type) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.TypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
