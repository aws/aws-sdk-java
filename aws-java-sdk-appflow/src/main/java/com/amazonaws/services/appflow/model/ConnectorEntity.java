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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The high-level entity that can be queried in Amazon AppFlow. For example, a Salesforce entity might be an
 * <i>Account</i> or <i>Opportunity</i>, whereas a ServiceNow entity might be an <i>Incident</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connector entity.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The label applied to the connector entity.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If
     * another call is made with <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then
     * it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a
     * recursive fashion.
     * </p>
     */
    private Boolean hasNestedEntities;

    /**
     * <p>
     * The name of the connector entity.
     * </p>
     * 
     * @param name
     *        The name of the connector entity.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the connector entity.
     * </p>
     * 
     * @return The name of the connector entity.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the connector entity.
     * </p>
     * 
     * @param name
     *        The name of the connector entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntity withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The label applied to the connector entity.
     * </p>
     * 
     * @param label
     *        The label applied to the connector entity.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label applied to the connector entity.
     * </p>
     * 
     * @return The label applied to the connector entity.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label applied to the connector entity.
     * </p>
     * 
     * @param label
     *        The label applied to the connector entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntity withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If
     * another call is made with <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then
     * it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a
     * recursive fashion.
     * </p>
     * 
     * @param hasNestedEntities
     *        Specifies whether the connector entity is a parent or a category and has more entities nested underneath
     *        it. If another call is made with
     *        <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then it returns the
     *        nested entities underneath it. This provides a way to retrieve all supported entities in a recursive
     *        fashion.
     */

    public void setHasNestedEntities(Boolean hasNestedEntities) {
        this.hasNestedEntities = hasNestedEntities;
    }

    /**
     * <p>
     * Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If
     * another call is made with <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then
     * it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a
     * recursive fashion.
     * </p>
     * 
     * @return Specifies whether the connector entity is a parent or a category and has more entities nested underneath
     *         it. If another call is made with
     *         <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then it returns the
     *         nested entities underneath it. This provides a way to retrieve all supported entities in a recursive
     *         fashion.
     */

    public Boolean getHasNestedEntities() {
        return this.hasNestedEntities;
    }

    /**
     * <p>
     * Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If
     * another call is made with <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then
     * it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a
     * recursive fashion.
     * </p>
     * 
     * @param hasNestedEntities
     *        Specifies whether the connector entity is a parent or a category and has more entities nested underneath
     *        it. If another call is made with
     *        <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then it returns the
     *        nested entities underneath it. This provides a way to retrieve all supported entities in a recursive
     *        fashion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorEntity withHasNestedEntities(Boolean hasNestedEntities) {
        setHasNestedEntities(hasNestedEntities);
        return this;
    }

    /**
     * <p>
     * Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If
     * another call is made with <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then
     * it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a
     * recursive fashion.
     * </p>
     * 
     * @return Specifies whether the connector entity is a parent or a category and has more entities nested underneath
     *         it. If another call is made with
     *         <code>entitiesPath = "the_current_entity_name_with_hasNestedEntities_true"</code>, then it returns the
     *         nested entities underneath it. This provides a way to retrieve all supported entities in a recursive
     *         fashion.
     */

    public Boolean isHasNestedEntities() {
        return this.hasNestedEntities;
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getHasNestedEntities() != null)
            sb.append("HasNestedEntities: ").append(getHasNestedEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorEntity == false)
            return false;
        ConnectorEntity other = (ConnectorEntity) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getHasNestedEntities() == null ^ this.getHasNestedEntities() == null)
            return false;
        if (other.getHasNestedEntities() != null && other.getHasNestedEntities().equals(this.getHasNestedEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getHasNestedEntities() == null) ? 0 : getHasNestedEntities().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorEntity clone() {
        try {
            return (ConnectorEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
