/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The function response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/FunctionResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The required properties of the function.
     * </p>
     */
    private java.util.List<String> requiredProperties;
    /**
     * <p>
     * The scope of the function.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The data connector.
     * </p>
     */
    private DataConnector implementedBy;
    /**
     * <p>
     * Indicates whether this function is inherited.
     * </p>
     */
    private Boolean isInherited;

    /**
     * <p>
     * The required properties of the function.
     * </p>
     * 
     * @return The required properties of the function.
     */

    public java.util.List<String> getRequiredProperties() {
        return requiredProperties;
    }

    /**
     * <p>
     * The required properties of the function.
     * </p>
     * 
     * @param requiredProperties
     *        The required properties of the function.
     */

    public void setRequiredProperties(java.util.Collection<String> requiredProperties) {
        if (requiredProperties == null) {
            this.requiredProperties = null;
            return;
        }

        this.requiredProperties = new java.util.ArrayList<String>(requiredProperties);
    }

    /**
     * <p>
     * The required properties of the function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredProperties(java.util.Collection)} or {@link #withRequiredProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param requiredProperties
     *        The required properties of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionResponse withRequiredProperties(String... requiredProperties) {
        if (this.requiredProperties == null) {
            setRequiredProperties(new java.util.ArrayList<String>(requiredProperties.length));
        }
        for (String ele : requiredProperties) {
            this.requiredProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The required properties of the function.
     * </p>
     * 
     * @param requiredProperties
     *        The required properties of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionResponse withRequiredProperties(java.util.Collection<String> requiredProperties) {
        setRequiredProperties(requiredProperties);
        return this;
    }

    /**
     * <p>
     * The scope of the function.
     * </p>
     * 
     * @param scope
     *        The scope of the function.
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the function.
     * </p>
     * 
     * @return The scope of the function.
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the function.
     * </p>
     * 
     * @param scope
     *        The scope of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public FunctionResponse withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of the function.
     * </p>
     * 
     * @param scope
     *        The scope of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public FunctionResponse withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The data connector.
     * </p>
     * 
     * @param implementedBy
     *        The data connector.
     */

    public void setImplementedBy(DataConnector implementedBy) {
        this.implementedBy = implementedBy;
    }

    /**
     * <p>
     * The data connector.
     * </p>
     * 
     * @return The data connector.
     */

    public DataConnector getImplementedBy() {
        return this.implementedBy;
    }

    /**
     * <p>
     * The data connector.
     * </p>
     * 
     * @param implementedBy
     *        The data connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionResponse withImplementedBy(DataConnector implementedBy) {
        setImplementedBy(implementedBy);
        return this;
    }

    /**
     * <p>
     * Indicates whether this function is inherited.
     * </p>
     * 
     * @param isInherited
     *        Indicates whether this function is inherited.
     */

    public void setIsInherited(Boolean isInherited) {
        this.isInherited = isInherited;
    }

    /**
     * <p>
     * Indicates whether this function is inherited.
     * </p>
     * 
     * @return Indicates whether this function is inherited.
     */

    public Boolean getIsInherited() {
        return this.isInherited;
    }

    /**
     * <p>
     * Indicates whether this function is inherited.
     * </p>
     * 
     * @param isInherited
     *        Indicates whether this function is inherited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionResponse withIsInherited(Boolean isInherited) {
        setIsInherited(isInherited);
        return this;
    }

    /**
     * <p>
     * Indicates whether this function is inherited.
     * </p>
     * 
     * @return Indicates whether this function is inherited.
     */

    public Boolean isInherited() {
        return this.isInherited;
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
        if (getRequiredProperties() != null)
            sb.append("RequiredProperties: ").append(getRequiredProperties()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getImplementedBy() != null)
            sb.append("ImplementedBy: ").append(getImplementedBy()).append(",");
        if (getIsInherited() != null)
            sb.append("IsInherited: ").append(getIsInherited());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionResponse == false)
            return false;
        FunctionResponse other = (FunctionResponse) obj;
        if (other.getRequiredProperties() == null ^ this.getRequiredProperties() == null)
            return false;
        if (other.getRequiredProperties() != null && other.getRequiredProperties().equals(this.getRequiredProperties()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getImplementedBy() == null ^ this.getImplementedBy() == null)
            return false;
        if (other.getImplementedBy() != null && other.getImplementedBy().equals(this.getImplementedBy()) == false)
            return false;
        if (other.getIsInherited() == null ^ this.getIsInherited() == null)
            return false;
        if (other.getIsInherited() != null && other.getIsInherited().equals(this.getIsInherited()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequiredProperties() == null) ? 0 : getRequiredProperties().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getImplementedBy() == null) ? 0 : getImplementedBy().hashCode());
        hashCode = prime * hashCode + ((getIsInherited() == null) ? 0 : getIsInherited().hashCode());
        return hashCode;
    }

    @Override
    public FunctionResponse clone() {
        try {
            return (FunctionResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.FunctionResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
