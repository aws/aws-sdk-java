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
 * The asset model property identifer of the input routed from AWS IoT SiteWise.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/IotSiteWiseAssetModelPropertyIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseAssetModelPropertyIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset model.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset property.
     * </p>
     */
    private String propertyId;

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the AWS IoT SiteWise asset model.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset model.
     * </p>
     * 
     * @return The ID of the AWS IoT SiteWise asset model.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the AWS IoT SiteWise asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAssetModelPropertyIdentifier withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the AWS IoT SiteWise asset property.
     */

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset property.
     * </p>
     * 
     * @return The ID of the AWS IoT SiteWise asset property.
     */

    public String getPropertyId() {
        return this.propertyId;
    }

    /**
     * <p>
     * The ID of the AWS IoT SiteWise asset property.
     * </p>
     * 
     * @param propertyId
     *        The ID of the AWS IoT SiteWise asset property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseAssetModelPropertyIdentifier withPropertyId(String propertyId) {
        setPropertyId(propertyId);
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
        if (getPropertyId() != null)
            sb.append("PropertyId: ").append(getPropertyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseAssetModelPropertyIdentifier == false)
            return false;
        IotSiteWiseAssetModelPropertyIdentifier other = (IotSiteWiseAssetModelPropertyIdentifier) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
            return false;
        if (other.getPropertyId() == null ^ this.getPropertyId() == null)
            return false;
        if (other.getPropertyId() != null && other.getPropertyId().equals(this.getPropertyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getPropertyId() == null) ? 0 : getPropertyId().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseAssetModelPropertyIdentifier clone() {
        try {
            return (IotSiteWiseAssetModelPropertyIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.IotSiteWiseAssetModelPropertyIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
