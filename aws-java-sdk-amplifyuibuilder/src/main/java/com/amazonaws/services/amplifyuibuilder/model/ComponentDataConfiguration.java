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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for binding a component's properties to data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentDataConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentDataConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than
     * data retrieved from a query.
     * </p>
     */
    private java.util.List<String> identifiers;
    /**
     * <p>
     * The name of the data model to use to bind data to a component.
     * </p>
     */
    private String model;
    /**
     * <p>
     * Represents the conditional logic to use when binding data to a component. Use this property to retrieve only a
     * subset of the data in a collection.
     * </p>
     */
    private Predicate predicate;
    /**
     * <p>
     * Describes how to sort the component's properties.
     * </p>
     */
    private java.util.List<SortProperty> sort;

    /**
     * <p>
     * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than
     * data retrieved from a query.
     * </p>
     * 
     * @return A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data,
     *         rather than data retrieved from a query.
     */

    public java.util.List<String> getIdentifiers() {
        return identifiers;
    }

    /**
     * <p>
     * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than
     * data retrieved from a query.
     * </p>
     * 
     * @param identifiers
     *        A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data,
     *        rather than data retrieved from a query.
     */

    public void setIdentifiers(java.util.Collection<String> identifiers) {
        if (identifiers == null) {
            this.identifiers = null;
            return;
        }

        this.identifiers = new java.util.ArrayList<String>(identifiers);
    }

    /**
     * <p>
     * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than
     * data retrieved from a query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdentifiers(java.util.Collection)} or {@link #withIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param identifiers
     *        A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data,
     *        rather than data retrieved from a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withIdentifiers(String... identifiers) {
        if (this.identifiers == null) {
            setIdentifiers(new java.util.ArrayList<String>(identifiers.length));
        }
        for (String ele : identifiers) {
            this.identifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data, rather than
     * data retrieved from a query.
     * </p>
     * 
     * @param identifiers
     *        A list of IDs to use to bind data to a component. Use this property to bind specifically chosen data,
     *        rather than data retrieved from a query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withIdentifiers(java.util.Collection<String> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    /**
     * <p>
     * The name of the data model to use to bind data to a component.
     * </p>
     * 
     * @param model
     *        The name of the data model to use to bind data to a component.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The name of the data model to use to bind data to a component.
     * </p>
     * 
     * @return The name of the data model to use to bind data to a component.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The name of the data model to use to bind data to a component.
     * </p>
     * 
     * @param model
     *        The name of the data model to use to bind data to a component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * Represents the conditional logic to use when binding data to a component. Use this property to retrieve only a
     * subset of the data in a collection.
     * </p>
     * 
     * @param predicate
     *        Represents the conditional logic to use when binding data to a component. Use this property to retrieve
     *        only a subset of the data in a collection.
     */

    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * Represents the conditional logic to use when binding data to a component. Use this property to retrieve only a
     * subset of the data in a collection.
     * </p>
     * 
     * @return Represents the conditional logic to use when binding data to a component. Use this property to retrieve
     *         only a subset of the data in a collection.
     */

    public Predicate getPredicate() {
        return this.predicate;
    }

    /**
     * <p>
     * Represents the conditional logic to use when binding data to a component. Use this property to retrieve only a
     * subset of the data in a collection.
     * </p>
     * 
     * @param predicate
     *        Represents the conditional logic to use when binding data to a component. Use this property to retrieve
     *        only a subset of the data in a collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withPredicate(Predicate predicate) {
        setPredicate(predicate);
        return this;
    }

    /**
     * <p>
     * Describes how to sort the component's properties.
     * </p>
     * 
     * @return Describes how to sort the component's properties.
     */

    public java.util.List<SortProperty> getSort() {
        return sort;
    }

    /**
     * <p>
     * Describes how to sort the component's properties.
     * </p>
     * 
     * @param sort
     *        Describes how to sort the component's properties.
     */

    public void setSort(java.util.Collection<SortProperty> sort) {
        if (sort == null) {
            this.sort = null;
            return;
        }

        this.sort = new java.util.ArrayList<SortProperty>(sort);
    }

    /**
     * <p>
     * Describes how to sort the component's properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSort(java.util.Collection)} or {@link #withSort(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sort
     *        Describes how to sort the component's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withSort(SortProperty... sort) {
        if (this.sort == null) {
            setSort(new java.util.ArrayList<SortProperty>(sort.length));
        }
        for (SortProperty ele : sort) {
            this.sort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes how to sort the component's properties.
     * </p>
     * 
     * @param sort
     *        Describes how to sort the component's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDataConfiguration withSort(java.util.Collection<SortProperty> sort) {
        setSort(sort);
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
        if (getIdentifiers() != null)
            sb.append("Identifiers: ").append(getIdentifiers()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getPredicate() != null)
            sb.append("Predicate: ").append(getPredicate()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentDataConfiguration == false)
            return false;
        ComponentDataConfiguration other = (ComponentDataConfiguration) obj;
        if (other.getIdentifiers() == null ^ this.getIdentifiers() == null)
            return false;
        if (other.getIdentifiers() != null && other.getIdentifiers().equals(this.getIdentifiers()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifiers() == null) ? 0 : getIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        return hashCode;
    }

    @Override
    public ComponentDataConfiguration clone() {
        try {
            return (ComponentDataConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentDataConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
