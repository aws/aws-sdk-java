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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends information about the detector model instance and the event that triggered the action to a specified asset
 * property in AWS IoT SiteWise.
 * </p>
 * <p>
 * You must use expressions for all parameters in <code>IotSiteWiseAction</code>. The expressions accept literals,
 * operators, functions, references, and substitutions templates.
 * </p>
 * <p class="title">
 * <b>Examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For literal values, the expressions must contain single quotes. For example, the value for the
 * <code>propertyAlias</code> parameter can be <code>'/company/windfarm/3/turbine/7/temperature'</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For references, you must specify either variables or input values. For example, the value for the
 * <code>assetId</code> parameter can be <code>$input.TurbineInput.assetId1</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a substitution template, you must use <code>${}</code>, and the template must be in single quotes. A substitution
 * template can also contain a combination of literals, operators, functions, references, and substitution templates.
 * </p>
 * <p>
 * In the following example, the value for the <code>propertyAlias</code> parameter uses a substitution template.
 * </p>
 * <p>
 * <code>'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/ ${$input.TemperatureInput.sensorData.turbineID}/temperature'</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You must specify either <code>propertyAlias</code> or both <code>assetId</code> and <code>propertyId</code> to
 * identify the target asset property in AWS IoT SiteWise.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html">Expressions</a> in the
 * <i>AWS IoT Events Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/IotSiteWiseAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of
     * failure. The default is a new unique identifier.
     * </p>
     */
    private String entryId;
    /**
     * <p>
     * The ID of the asset that has the specified property.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset property.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The alias of the asset property.
     * </p>
     */
    private String propertyAlias;
    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information.
     * </p>
     */
    private AssetPropertyValue propertyValue;

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of
     * failure. The default is a new unique identifier.
     * </p>
     * 
     * @param entryId
     *        A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in
     *        case of failure. The default is a new unique identifier.
     */

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of
     * failure. The default is a new unique identifier.
     * </p>
     * 
     * @return A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in
     *         case of failure. The default is a new unique identifier.
     */

    public String getEntryId() {
        return this.entryId;
    }

    /**
     * <p>
     * A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in case of
     * failure. The default is a new unique identifier.
     * </p>
     * 
     * @param entryId
     *        A unique identifier for this entry. You can use the entry ID to track which data entry causes an error in
     *        case of failure. The default is a new unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withEntryId(String entryId) {
        setEntryId(entryId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset that has the specified property.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property.
     * </p>
     * 
     * @return The ID of the asset that has the specified property.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset that has the specified property.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset that has the specified property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @return The ID of the asset property.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The alias of the asset property.
     * </p>
     * 
     * @param propertyAlias
     *        The alias of the asset property.
     */

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The alias of the asset property.
     * </p>
     * 
     * @return The alias of the asset property.
     */

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    /**
     * <p>
     * The alias of the asset property.
     * </p>
     * 
     * @param propertyAlias
     *        The alias of the asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @param propertyValue
     *        The value to send to the asset property. This value contains timestamp, quality, and value (TQV)
     *        information.
     */

    public void setPropertyValue(AssetPropertyValue propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @return The value to send to the asset property. This value contains timestamp, quality, and value (TQV)
     *         information.
     */

    public AssetPropertyValue getPropertyValue() {
        return this.propertyValue;
    }

    /**
     * <p>
     * The value to send to the asset property. This value contains timestamp, quality, and value (TQV) information.
     * </p>
     * 
     * @param propertyValue
     *        The value to send to the asset property. This value contains timestamp, quality, and value (TQV)
     *        information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAction withPropertyValue(AssetPropertyValue propertyValue) {
        setPropertyValue(propertyValue);
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
        if (getEntryId() != null)
            sb.append("EntryId: ").append(getEntryId()).append(",");
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getPropertyAlias() != null)
            sb.append("PropertyAlias: ").append(getPropertyAlias()).append(",");
        if (getPropertyValue() != null)
            sb.append("PropertyValue: ").append(getPropertyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseAction == false)
            return false;
        IotSiteWiseAction other = (IotSiteWiseAction) obj;
        if (other.getEntryId() == null ^ this.getEntryId() == null)
            return false;
        if (other.getEntryId() != null && other.getEntryId().equals(this.getEntryId()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        if (other.getPropertyAlias() == null ^ this.getPropertyAlias() == null)
            return false;
        if (other.getPropertyAlias() != null && other.getPropertyAlias().equals(this.getPropertyAlias()) == false)
            return false;
        if (other.getPropertyValue() == null ^ this.getPropertyValue() == null)
            return false;
        if (other.getPropertyValue() != null && other.getPropertyValue().equals(this.getPropertyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getPropertyValue() == null) ? 0 : getPropertyValue().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseAction clone() {
        try {
            return (IotSiteWiseAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.IotSiteWiseActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
