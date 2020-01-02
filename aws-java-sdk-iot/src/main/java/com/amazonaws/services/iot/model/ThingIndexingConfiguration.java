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
 * The thing indexing configuration. For more information, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html">Managing Thing Indexing</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingIndexingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String thingIndexingMode;
    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String thingConnectivityIndexingMode;
    /**
     * <p>
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
     * </p>
     */
    private java.util.List<Field> managedFields;
    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     */
    private java.util.List<Field> customFields;

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @see ThingIndexingMode
     */

    public void setThingIndexingMode(String thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Thing indexing mode. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         REGISTRY – Your thing index contains registry data only.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing indexing is disabled.
     *         </p>
     *         </li>
     * @see ThingIndexingMode
     */

    public String getThingIndexingMode() {
        return this.thingIndexingMode;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingIndexingMode
     */

    public ThingIndexingConfiguration withThingIndexingMode(String thingIndexingMode) {
        setThingIndexingMode(thingIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * REGISTRY – Your thing index contains registry data only.
     * </p>
     * </li>
     * <li>
     * <p>
     * REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingIndexingMode
     *        Thing indexing mode. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        REGISTRY – Your thing index contains registry data only.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingIndexingMode
     */

    public ThingIndexingConfiguration withThingIndexingMode(ThingIndexingMode thingIndexingMode) {
        this.thingIndexingMode = thingIndexingMode.toString();
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @see ThingConnectivityIndexingMode
     */

    public void setThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Thing connectivity indexing mode. Valid values are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *         thingIndexMode must not be set to OFF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OFF - Thing connectivity status indexing is disabled.
     *         </p>
     *         </li>
     * @see ThingConnectivityIndexingMode
     */

    public String getThingConnectivityIndexingMode() {
        return this.thingConnectivityIndexingMode;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingConnectivityIndexingMode
     */

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
        setThingConnectivityIndexingMode(thingConnectivityIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing connectivity indexing mode. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode
     * must not be set to OFF.
     * </p>
     * </li>
     * <li>
     * <p>
     * OFF - Thing connectivity status indexing is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param thingConnectivityIndexingMode
     *        Thing connectivity indexing mode. Valid values are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing,
     *        thingIndexMode must not be set to OFF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OFF - Thing connectivity status indexing is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingConnectivityIndexingMode
     */

    public ThingIndexingConfiguration withThingConnectivityIndexingMode(ThingConnectivityIndexingMode thingConnectivityIndexingMode) {
        this.thingConnectivityIndexingMode = thingConnectivityIndexingMode.toString();
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

    public ThingIndexingConfiguration withManagedFields(Field... managedFields) {
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

    public ThingIndexingConfiguration withManagedFields(java.util.Collection<Field> managedFields) {
        setManagedFields(managedFields);
        return this;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @return Contains custom field names and their data type.
     */

    public java.util.List<Field> getCustomFields() {
        return customFields;
    }

    /**
     * <p>
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
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
     * Contains custom field names and their data type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomFields(java.util.Collection)} or {@link #withCustomFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customFields
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withCustomFields(Field... customFields) {
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
     * Contains custom field names and their data type.
     * </p>
     * 
     * @param customFields
     *        Contains custom field names and their data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingIndexingConfiguration withCustomFields(java.util.Collection<Field> customFields) {
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
        if (getThingIndexingMode() != null)
            sb.append("ThingIndexingMode: ").append(getThingIndexingMode()).append(",");
        if (getThingConnectivityIndexingMode() != null)
            sb.append("ThingConnectivityIndexingMode: ").append(getThingConnectivityIndexingMode()).append(",");
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

        if (obj instanceof ThingIndexingConfiguration == false)
            return false;
        ThingIndexingConfiguration other = (ThingIndexingConfiguration) obj;
        if (other.getThingIndexingMode() == null ^ this.getThingIndexingMode() == null)
            return false;
        if (other.getThingIndexingMode() != null && other.getThingIndexingMode().equals(this.getThingIndexingMode()) == false)
            return false;
        if (other.getThingConnectivityIndexingMode() == null ^ this.getThingConnectivityIndexingMode() == null)
            return false;
        if (other.getThingConnectivityIndexingMode() != null
                && other.getThingConnectivityIndexingMode().equals(this.getThingConnectivityIndexingMode()) == false)
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

        hashCode = prime * hashCode + ((getThingIndexingMode() == null) ? 0 : getThingIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getThingConnectivityIndexingMode() == null) ? 0 : getThingConnectivityIndexingMode().hashCode());
        hashCode = prime * hashCode + ((getManagedFields() == null) ? 0 : getManagedFields().hashCode());
        hashCode = prime * hashCode + ((getCustomFields() == null) ? 0 : getCustomFields().hashCode());
        return hashCode;
    }

    @Override
    public ThingIndexingConfiguration clone() {
        try {
            return (ThingIndexingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingIndexingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
