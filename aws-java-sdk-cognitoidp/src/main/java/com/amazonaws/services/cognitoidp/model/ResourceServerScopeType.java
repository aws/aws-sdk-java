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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource server scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResourceServerScopeType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceServerScopeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scope.
     * </p>
     */
    private String scopeName;
    /**
     * <p>
     * A description of the scope.
     * </p>
     */
    private String scopeDescription;

    /**
     * <p>
     * The name of the scope.
     * </p>
     * 
     * @param scopeName
     *        The name of the scope.
     */

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * 
     * @return The name of the scope.
     */

    public String getScopeName() {
        return this.scopeName;
    }

    /**
     * <p>
     * The name of the scope.
     * </p>
     * 
     * @param scopeName
     *        The name of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerScopeType withScopeName(String scopeName) {
        setScopeName(scopeName);
        return this;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * 
     * @param scopeDescription
     *        A description of the scope.
     */

    public void setScopeDescription(String scopeDescription) {
        this.scopeDescription = scopeDescription;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * 
     * @return A description of the scope.
     */

    public String getScopeDescription() {
        return this.scopeDescription;
    }

    /**
     * <p>
     * A description of the scope.
     * </p>
     * 
     * @param scopeDescription
     *        A description of the scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceServerScopeType withScopeDescription(String scopeDescription) {
        setScopeDescription(scopeDescription);
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
        if (getScopeName() != null)
            sb.append("ScopeName: ").append(getScopeName()).append(",");
        if (getScopeDescription() != null)
            sb.append("ScopeDescription: ").append(getScopeDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceServerScopeType == false)
            return false;
        ResourceServerScopeType other = (ResourceServerScopeType) obj;
        if (other.getScopeName() == null ^ this.getScopeName() == null)
            return false;
        if (other.getScopeName() != null && other.getScopeName().equals(this.getScopeName()) == false)
            return false;
        if (other.getScopeDescription() == null ^ this.getScopeDescription() == null)
            return false;
        if (other.getScopeDescription() != null && other.getScopeDescription().equals(this.getScopeDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScopeName() == null) ? 0 : getScopeName().hashCode());
        hashCode = prime * hashCode + ((getScopeDescription() == null) ? 0 : getScopeDescription().hashCode());
        return hashCode;
    }

    @Override
    public ResourceServerScopeType clone() {
        try {
            return (ResourceServerScopeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ResourceServerScopeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
