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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure used to create or updata a user-defined function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UserDefinedFunctionInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDefinedFunctionInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the function.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     */
    private String className;
    /**
     * <p>
     * The owner of the function.
     * </p>
     */
    private String ownerName;
    /**
     * <p>
     * The owner type.
     * </p>
     */
    private String ownerType;
    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     */
    private java.util.List<ResourceUri> resourceUris;

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @return The name of the function.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function.
     * </p>
     * 
     * @param functionName
     *        The name of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDefinedFunctionInput withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * 
     * @param className
     *        The Java class that contains the function code.
     */

    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * 
     * @return The Java class that contains the function code.
     */

    public String getClassName() {
        return this.className;
    }

    /**
     * <p>
     * The Java class that contains the function code.
     * </p>
     * 
     * @param className
     *        The Java class that contains the function code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDefinedFunctionInput withClassName(String className) {
        setClassName(className);
        return this;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * 
     * @param ownerName
     *        The owner of the function.
     */

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * 
     * @return The owner of the function.
     */

    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * <p>
     * The owner of the function.
     * </p>
     * 
     * @param ownerName
     *        The owner of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDefinedFunctionInput withOwnerName(String ownerName) {
        setOwnerName(ownerName);
        return this;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * 
     * @param ownerType
     *        The owner type.
     * @see PrincipalType
     */

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * 
     * @return The owner type.
     * @see PrincipalType
     */

    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * 
     * @param ownerType
     *        The owner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public UserDefinedFunctionInput withOwnerType(String ownerType) {
        setOwnerType(ownerType);
        return this;
    }

    /**
     * <p>
     * The owner type.
     * </p>
     * 
     * @param ownerType
     *        The owner type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public UserDefinedFunctionInput withOwnerType(PrincipalType ownerType) {
        this.ownerType = ownerType.toString();
        return this;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * 
     * @return The resource URIs for the function.
     */

    public java.util.List<ResourceUri> getResourceUris() {
        return resourceUris;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * 
     * @param resourceUris
     *        The resource URIs for the function.
     */

    public void setResourceUris(java.util.Collection<ResourceUri> resourceUris) {
        if (resourceUris == null) {
            this.resourceUris = null;
            return;
        }

        this.resourceUris = new java.util.ArrayList<ResourceUri>(resourceUris);
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceUris(java.util.Collection)} or {@link #withResourceUris(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceUris
     *        The resource URIs for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDefinedFunctionInput withResourceUris(ResourceUri... resourceUris) {
        if (this.resourceUris == null) {
            setResourceUris(new java.util.ArrayList<ResourceUri>(resourceUris.length));
        }
        for (ResourceUri ele : resourceUris) {
            this.resourceUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource URIs for the function.
     * </p>
     * 
     * @param resourceUris
     *        The resource URIs for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserDefinedFunctionInput withResourceUris(java.util.Collection<ResourceUri> resourceUris) {
        setResourceUris(resourceUris);
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
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getClassName() != null)
            sb.append("ClassName: ").append(getClassName()).append(",");
        if (getOwnerName() != null)
            sb.append("OwnerName: ").append(getOwnerName()).append(",");
        if (getOwnerType() != null)
            sb.append("OwnerType: ").append(getOwnerType()).append(",");
        if (getResourceUris() != null)
            sb.append("ResourceUris: ").append(getResourceUris());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserDefinedFunctionInput == false)
            return false;
        UserDefinedFunctionInput other = (UserDefinedFunctionInput) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getClassName() == null ^ this.getClassName() == null)
            return false;
        if (other.getClassName() != null && other.getClassName().equals(this.getClassName()) == false)
            return false;
        if (other.getOwnerName() == null ^ this.getOwnerName() == null)
            return false;
        if (other.getOwnerName() != null && other.getOwnerName().equals(this.getOwnerName()) == false)
            return false;
        if (other.getOwnerType() == null ^ this.getOwnerType() == null)
            return false;
        if (other.getOwnerType() != null && other.getOwnerType().equals(this.getOwnerType()) == false)
            return false;
        if (other.getResourceUris() == null ^ this.getResourceUris() == null)
            return false;
        if (other.getResourceUris() != null && other.getResourceUris().equals(this.getResourceUris()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getClassName() == null) ? 0 : getClassName().hashCode());
        hashCode = prime * hashCode + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());
        hashCode = prime * hashCode + ((getOwnerType() == null) ? 0 : getOwnerType().hashCode());
        hashCode = prime * hashCode + ((getResourceUris() == null) ? 0 : getResourceUris().hashCode());
        return hashCode;
    }

    @Override
    public UserDefinedFunctionInput clone() {
        try {
            return (UserDefinedFunctionInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.UserDefinedFunctionInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
