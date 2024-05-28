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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a named entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NamedEntityDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NamedEntityDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the entity.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The property name to be used for the named entity.
     * </p>
     */
    private String propertyName;
    /**
     * <p>
     * The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * </p>
     */
    private String propertyRole;
    /**
     * <p>
     * The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     * <code>MEASURE</code>.
     * </p>
     */
    private String propertyUsage;
    /**
     * <p>
     * The definition of a metric.
     * </p>
     */
    private NamedEntityDefinitionMetric metric;

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param fieldName
     *        The name of the entity.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @return The name of the entity.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The name of the entity.
     * </p>
     * 
     * @param fieldName
     *        The name of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinition withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The property name to be used for the named entity.
     * </p>
     * 
     * @param propertyName
     *        The property name to be used for the named entity.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * The property name to be used for the named entity.
     * </p>
     * 
     * @return The property name to be used for the named entity.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * The property name to be used for the named entity.
     * </p>
     * 
     * @param propertyName
     *        The property name to be used for the named entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinition withPropertyName(String propertyName) {
        setPropertyName(propertyName);
        return this;
    }

    /**
     * <p>
     * The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * </p>
     * 
     * @param propertyRole
     *        The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * @see PropertyRole
     */

    public void setPropertyRole(String propertyRole) {
        this.propertyRole = propertyRole;
    }

    /**
     * <p>
     * The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * </p>
     * 
     * @return The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * @see PropertyRole
     */

    public String getPropertyRole() {
        return this.propertyRole;
    }

    /**
     * <p>
     * The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * </p>
     * 
     * @param propertyRole
     *        The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyRole
     */

    public NamedEntityDefinition withPropertyRole(String propertyRole) {
        setPropertyRole(propertyRole);
        return this;
    }

    /**
     * <p>
     * The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * </p>
     * 
     * @param propertyRole
     *        The property role. Valid values for this structure are <code>PRIMARY</code> and <code>ID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyRole
     */

    public NamedEntityDefinition withPropertyRole(PropertyRole propertyRole) {
        this.propertyRole = propertyRole.toString();
        return this;
    }

    /**
     * <p>
     * The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param propertyUsage
     *        The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     *        <code>MEASURE</code>.
     * @see PropertyUsage
     */

    public void setPropertyUsage(String propertyUsage) {
        this.propertyUsage = propertyUsage;
    }

    /**
     * <p>
     * The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @return The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     *         <code>MEASURE</code>.
     * @see PropertyUsage
     */

    public String getPropertyUsage() {
        return this.propertyUsage;
    }

    /**
     * <p>
     * The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param propertyUsage
     *        The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     *        <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyUsage
     */

    public NamedEntityDefinition withPropertyUsage(String propertyUsage) {
        setPropertyUsage(propertyUsage);
        return this;
    }

    /**
     * <p>
     * The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param propertyUsage
     *        The property usage. Valid values for this structure are <code>INHERIT</code>, <code>DIMENSION</code>, and
     *        <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyUsage
     */

    public NamedEntityDefinition withPropertyUsage(PropertyUsage propertyUsage) {
        this.propertyUsage = propertyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The definition of a metric.
     * </p>
     * 
     * @param metric
     *        The definition of a metric.
     */

    public void setMetric(NamedEntityDefinitionMetric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The definition of a metric.
     * </p>
     * 
     * @return The definition of a metric.
     */

    public NamedEntityDefinitionMetric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The definition of a metric.
     * </p>
     * 
     * @param metric
     *        The definition of a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NamedEntityDefinition withMetric(NamedEntityDefinitionMetric metric) {
        setMetric(metric);
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName()).append(",");
        if (getPropertyRole() != null)
            sb.append("PropertyRole: ").append(getPropertyRole()).append(",");
        if (getPropertyUsage() != null)
            sb.append("PropertyUsage: ").append(getPropertyUsage()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamedEntityDefinition == false)
            return false;
        NamedEntityDefinition other = (NamedEntityDefinition) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        if (other.getPropertyRole() == null ^ this.getPropertyRole() == null)
            return false;
        if (other.getPropertyRole() != null && other.getPropertyRole().equals(this.getPropertyRole()) == false)
            return false;
        if (other.getPropertyUsage() == null ^ this.getPropertyUsage() == null)
            return false;
        if (other.getPropertyUsage() != null && other.getPropertyUsage().equals(this.getPropertyUsage()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        hashCode = prime * hashCode + ((getPropertyRole() == null) ? 0 : getPropertyRole().hashCode());
        hashCode = prime * hashCode + ((getPropertyUsage() == null) ? 0 : getPropertyUsage().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        return hashCode;
    }

    @Override
    public NamedEntityDefinition clone() {
        try {
            return (NamedEntityDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NamedEntityDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
