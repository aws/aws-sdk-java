/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Thing group indexing configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingGroupIndexingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     */
    private String thingGroupIndexingMode;
    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;
    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any managed fields. Use the
     * GetIndexingConfiguration API to get a list of managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @see ThingGroupIndexingMode
     */

    public void setThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @return Thing group indexing mode.
     * @see ThingGroupIndexingMode
     */

    public String getThingGroupIndexingMode() {
        return this.thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingGroupIndexingMode
     */

    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(String thingGroupIndexingMode) {
        setThingGroupIndexingMode(thingGroupIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingGroupIndexingMode
     */

    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @return Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     */

    public java.util.List<Field> getManagedFields() {
        return managedFields;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     */

    public void setManagedFields(java.util.Collection<Field> managedFields) {
        if (managedFields == null) {
            this.managedFields = null;
            return;
        }

        this.managedFields = new java.util.ArrayList<Field>(managedFields);
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedFields(java.util.Collection)} or {@link #withManagedFields(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupIndexingConfiguration withManagedFields(Field... managedFields) {
        if (this.managedFields == null) {
            setManagedFields(new java.util.ArrayList<Field>(managedFields.length));
        }
        for (Field ele : managedFields) {
            this.managedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     * 
     * @param managedFields
     *        Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupIndexingConfiguration withManagedFields(java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any managed fields. Use the
     * GetIndexingConfiguration API to get a list of managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @return A list of thing group fields to index. This list cannot contain any managed fields. Use the
     *         GetIndexingConfiguration API to get a list of managed fields.</p>
     *         <p>
     *         Contains custom field names and their data type.
     */

    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any managed fields. Use the
     * GetIndexingConfiguration API to get a list of managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
     *        A list of thing group fields to index. This list cannot contain any managed fields. Use the
     *        GetIndexingConfiguration API to get a list of managed fields.</p>
     *        <p>
     *        Contains custom field names and their data type.
     */

    public void setCustomFields(java.util.Collection<Field> customFields) {
        if (customFields == null) {
            this.customFields = null;
            return;
        }

        this.customFields = new java.util.ArrayList<Field>(customFields);
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any managed fields. Use the
     * GetIndexingConfiguration API to get a list of managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomFields(java.util.Collection)} or {@link #withCustomFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customFields
     *        A list of thing group fields to index. This list cannot contain any managed fields. Use the
     *        GetIndexingConfiguration API to get a list of managed fields.</p>
     *        <p>
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupIndexingConfiguration withCustomFields(Field... customFields) {
        if (this.customFields == null) {
            setCustomFields(new java.util.ArrayList<Field>(customFields.length));
        }
        for (Field ele : customFields) {
            this.customFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of thing group fields to index. This list cannot contain any managed fields. Use the
     * GetIndexingConfiguration API to get a list of managed fields.
     * </p>
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
     *        A list of thing group fields to index. This list cannot contain any managed fields. Use the
     *        GetIndexingConfiguration API to get a list of managed fields.</p>
     *        <p>
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingGroupIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
        setCustomFields(customFields);
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
        if (getThingGroupIndexingMode() != null)
            sb.append("ThingGroupIndexingMode: ").append(getThingGroupIndexingMode()).append(",");
        if (getManagedFields() != null)
            sb.append("ManagedFields: ").append(getManagedFields()).append(",");
        if (getCustomFields() != null)
            sb.append("CustomFields: ").append(getCustomFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupIndexingConfiguration == false)
            return false;
        ThingGroupIndexingConfiguration other = (ThingGroupIndexingConfiguration) obj;
        if (other.getThingGroupIndexingMode() == null ^ this.getThingGroupIndexingMode() == null)
            return false;
        if (other.getThingGroupIndexingMode() != null && other.getThingGroupIndexingMode().equals(this.getThingGroupIndexingMode()) == false)
            return false;
        if (other.getManagedFields() == null ^ this.getManagedFields() == null)
            return false;
        if (other.getManagedFields() != null && other.getManagedFields().equals(this.getManagedFields()) == false)
            return false;
        if (other.getCustomFields() == null ^ this.getCustomFields() == null)
            return false;
        if (other.getCustomFields() != null && other.getCustomFields().equals(this.getCustomFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupIndexingMode() == null) ? 0 : getThingGroupIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getManagedFields() == null) ? 0 : getManagedFields().hashCode());
        hashCode = prime * hashCode + ((getCustomFields() == null) ? 0 : getCustomFields().hashCode());
        return hashCode;
    }

    @Override
    public ThingGroupIndexingConfiguration clone() {
        try {
            return (ThingGroupIndexingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingGroupIndexingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
