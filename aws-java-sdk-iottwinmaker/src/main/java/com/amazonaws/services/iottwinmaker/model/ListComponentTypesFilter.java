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
 * An object that filters items in a list of component types.
 * </p>
 * <note>
 * <p>
 * Only one object is accepted as a valid input.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListComponentTypesFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentTypesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The component type that the component types in the list extend.
     * </p>
     */
    private String extendsFrom;
    /**
     * <p>
     * The namespace to which the component types in the list belong.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * A Boolean value that specifies whether the component types in the list are abstract.
     * </p>
     */
    private Boolean isAbstract;

    /**
     * <p>
     * The component type that the component types in the list extend.
     * </p>
     * 
     * @param extendsFrom
     *        The component type that the component types in the list extend.
     */

    public void setExtendsFrom(String extendsFrom) {
        this.extendsFrom = extendsFrom;
    }

    /**
     * <p>
     * The component type that the component types in the list extend.
     * </p>
     * 
     * @return The component type that the component types in the list extend.
     */

    public String getExtendsFrom() {
        return this.extendsFrom;
    }

    /**
     * <p>
     * The component type that the component types in the list extend.
     * </p>
     * 
     * @param extendsFrom
     *        The component type that the component types in the list extend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesFilter withExtendsFrom(String extendsFrom) {
        setExtendsFrom(extendsFrom);
        return this;
    }

    /**
     * <p>
     * The namespace to which the component types in the list belong.
     * </p>
     * 
     * @param namespace
     *        The namespace to which the component types in the list belong.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace to which the component types in the list belong.
     * </p>
     * 
     * @return The namespace to which the component types in the list belong.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace to which the component types in the list belong.
     * </p>
     * 
     * @param namespace
     *        The namespace to which the component types in the list belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesFilter withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component types in the list are abstract.
     * </p>
     * 
     * @param isAbstract
     *        A Boolean value that specifies whether the component types in the list are abstract.
     */

    public void setIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component types in the list are abstract.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component types in the list are abstract.
     */

    public Boolean getIsAbstract() {
        return this.isAbstract;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component types in the list are abstract.
     * </p>
     * 
     * @param isAbstract
     *        A Boolean value that specifies whether the component types in the list are abstract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentTypesFilter withIsAbstract(Boolean isAbstract) {
        setIsAbstract(isAbstract);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether the component types in the list are abstract.
     * </p>
     * 
     * @return A Boolean value that specifies whether the component types in the list are abstract.
     */

    public Boolean isAbstract() {
        return this.isAbstract;
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
        if (getExtendsFrom() != null)
            sb.append("ExtendsFrom: ").append(getExtendsFrom()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getIsAbstract() != null)
            sb.append("IsAbstract: ").append(getIsAbstract());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComponentTypesFilter == false)
            return false;
        ListComponentTypesFilter other = (ListComponentTypesFilter) obj;
        if (other.getExtendsFrom() == null ^ this.getExtendsFrom() == null)
            return false;
        if (other.getExtendsFrom() != null && other.getExtendsFrom().equals(this.getExtendsFrom()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getIsAbstract() == null ^ this.getIsAbstract() == null)
            return false;
        if (other.getIsAbstract() != null && other.getIsAbstract().equals(this.getIsAbstract()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtendsFrom() == null) ? 0 : getExtendsFrom().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getIsAbstract() == null) ? 0 : getIsAbstract().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentTypesFilter clone() {
        try {
            return (ListComponentTypesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ListComponentTypesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
