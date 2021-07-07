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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateAssetProperty" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssetPropertyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     */
    private String propertyId;
    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     */
    private String propertyAlias;
    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     * enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting
     * with other services</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * </p>
     */
    private String propertyNotificationState;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to be updated.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * 
     * @return The ID of the asset to be updated.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset to be updated.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetPropertyRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property to be updated.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * 
     * @return The ID of the asset property to be updated.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the asset property to be updated.
     * </p>
     * 
     * @param propertyId
     *        The ID of the asset property to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetPropertyRequest withPropertyId(String propertyId) {
        setPropertyId(propertyId);
        return this;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        If you omit this parameter, the alias is removed from the property.
     */

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * 
     * @return The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *         <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *         industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         If you omit this parameter, the alias is removed from the property.
     */

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    /**
     * <p>
     * The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     * <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping industrial
     * data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the alias is removed from the property.
     * </p>
     * 
     * @param propertyAlias
     *        The alias that identifies the property, such as an OPC-UA server data stream path (for example,
     *        <code>/company/windfarm/3/turbine/7/temperature</code>). For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/connect-data-streams.html">Mapping
     *        industrial data streams to asset properties</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        If you omit this parameter, the alias is removed from the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetPropertyRequest withPropertyAlias(String propertyAlias) {
        setPropertyAlias(propertyAlias);
        return this;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     * enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting
     * with other services</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * </p>
     * 
     * @param propertyNotificationState
     *        The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     *        enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see
     *        <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">
     *        Interacting with other services</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * @see PropertyNotificationState
     */

    public void setPropertyNotificationState(String propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     * enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting
     * with other services</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * </p>
     * 
     * @return The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     *         enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see
     *         <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">
     *         Interacting with other services</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *         <p>
     *         If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * @see PropertyNotificationState
     */

    public String getPropertyNotificationState() {
        return this.propertyNotificationState;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     * enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting
     * with other services</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * </p>
     * 
     * @param propertyNotificationState
     *        The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     *        enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see
     *        <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">
     *        Interacting with other services</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyNotificationState
     */

    public UpdateAssetPropertyRequest withPropertyNotificationState(String propertyNotificationState) {
        setPropertyNotificationState(propertyNotificationState);
        return this;
    }

    /**
     * <p>
     * The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     * enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">Interacting
     * with other services</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * <p>
     * If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * </p>
     * 
     * @param propertyNotificationState
     *        The MQTT notification state (enabled or disabled) for this asset property. When the notification state is
     *        enabled, IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see
     *        <a href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html">
     *        Interacting with other services</a> in the <i>IoT SiteWise User Guide</i>.</p>
     *        <p>
     *        If you omit this parameter, the notification state is set to <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropertyNotificationState
     */

    public UpdateAssetPropertyRequest withPropertyNotificationState(PropertyNotificationState propertyNotificationState) {
        this.propertyNotificationState = propertyNotificationState.toString();
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssetPropertyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId()).append(",");
        if (getPropertyAlias() != null)
            sb.append("PropertyAlias: ").append(getPropertyAlias()).append(",");
        if (getPropertyNotificationState() != null)
            sb.append("PropertyNotificationState: ").append(getPropertyNotificationState()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssetPropertyRequest == false)
            return false;
        UpdateAssetPropertyRequest other = (UpdateAssetPropertyRequest) obj;
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
        if (other.getPropertyNotificationState() == null ^ this.getPropertyNotificationState() == null)
            return false;
        if (other.getPropertyNotificationState() != null && other.getPropertyNotificationState().equals(this.getPropertyNotificationState()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        hashCode = prime * hashCode + ((getPropertyAlias() == null) ? 0 : getPropertyAlias().hashCode());
        hashCode = prime * hashCode + ((getPropertyNotificationState() == null) ? 0 : getPropertyNotificationState().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssetPropertyRequest clone() {
        return (UpdateAssetPropertyRequest) super.clone();
    }

}
