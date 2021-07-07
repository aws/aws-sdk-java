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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains asset property information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Property" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Property implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The asset property's notification topic and state. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     */
    private PropertyNotification notification;
    /**
     * <p>
     * The property data type.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains one type.
     * </p>
     */
    private PropertyType type;

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param id
     *        The ID of the asset property.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @return The ID of the asset property.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param id
     *        The ID of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @return The name of the property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the property.
     * </p>
     * 
     * @param name
     *        The name of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param alias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *         industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param alias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * 
     * @param notification
     *        The asset property's notification topic and state. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *        >UpdateAssetProperty</a>.
     */

    public void setNotification(PropertyNotification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * 
     * @return The asset property's notification topic and state. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *         >UpdateAssetProperty</a>.
     */

    public PropertyNotification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The asset property's notification topic and state. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     * >UpdateAssetProperty</a>.
     * </p>
     * 
     * @param notification
     *        The asset property's notification topic and state. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_UpdateAssetProperty.html"
     *        >UpdateAssetProperty</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withNotification(PropertyNotification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * 
     * @param dataType
     *        The property data type.
     * @see PropertyDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * 
     * @return The property data type.
     * @see PropertyDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * 
     * @param dataType
     *        The property data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public Property withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The property data type.
     * </p>
     * 
     * @param dataType
     *        The property data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyDataType
     */

    public Property withDataType(PropertyDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     * </p>
     * 
     * @param unit
     *        The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     * </p>
     * 
     * @return The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     * </p>
     * 
     * @param unit
     *        The unit (such as <code>Newtons</code> or <code>RPM</code>) of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains one type.
     * </p>
     * 
     * @param type
     *        The property type (see <code>PropertyType</code>). A property contains one type.
     */

    public void setType(PropertyType type) {
        this.type = type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains one type.
     * </p>
     * 
     * @return The property type (see <code>PropertyType</code>). A property contains one type.
     */

    public PropertyType getType() {
        return this.type;
    }

    /**
     * <p>
     * The property type (see <code>PropertyType</code>). A property contains one type.
     * </p>
     * 
     * @param type
     *        The property type (see <code>PropertyType</code>). A property contains one type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Property withType(PropertyType type) {
        setType(type);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Property == false)
            return false;
        Property other = (Property) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Property clone() {
        try {
            return (Property) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.PropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
