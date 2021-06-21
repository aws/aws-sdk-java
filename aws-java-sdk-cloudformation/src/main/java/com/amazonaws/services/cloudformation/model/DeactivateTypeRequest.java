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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DeactivateType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeactivateTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type name of the extension, in this account and region. If you specified a type name alias when enabling the
     * extension, use the type name alias.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The type name of the extension, in this account and region. If you specified a type name alias when enabling the
     * extension, use the type name alias.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The type name of the extension, in this account and region. If you specified a type name alias when
     *        enabling the extension, use the type name alias.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The type name of the extension, in this account and region. If you specified a type name alias when enabling the
     * extension, use the type name alias.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The type name of the extension, in this account and region. If you specified a type name alias when
     *         enabling the extension, use the type name alias.</p>
     *         <p>
     *         Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The type name of the extension, in this account and region. If you specified a type name alias when enabling the
     * extension, use the type name alias.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The type name of the extension, in this account and region. If you specified a type name alias when
     *        enabling the extension, use the type name alias.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivateTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @see ThirdPartyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The extension type.</p>
     *         <p>
     *         Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @see ThirdPartyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public DeactivateTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The extension type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param type
     *        The extension type.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public DeactivateTypeRequest withType(ThirdPartyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *         <p>
     *         Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *        <p>
     *        Conditional: You must specify either <code>Arn</code>, or <code>TypeName</code> and <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeactivateTypeRequest withArn(String arn) {
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof DeactivateTypeRequest == false)
            return false;
        DeactivateTypeRequest other = (DeactivateTypeRequest) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public DeactivateTypeRequest clone() {
        return (DeactivateTypeRequest) super.clone();
    }

}
