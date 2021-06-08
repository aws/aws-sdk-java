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
 * The identifer of the input routed from AWS IoT SiteWise.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/IotSiteWiseInputIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotSiteWiseInputIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the AWS IoT SiteWise asset model property.
     * </p>
     */
    private IotSiteWiseAssetModelPropertyIdentifier iotSiteWiseAssetModelPropertyIdentifier;

    /**
     * <p>
     * The identifier of the AWS IoT SiteWise asset model property.
     * </p>
     * 
     * @param iotSiteWiseAssetModelPropertyIdentifier
     *        The identifier of the AWS IoT SiteWise asset model property.
     */

    public void setIotSiteWiseAssetModelPropertyIdentifier(IotSiteWiseAssetModelPropertyIdentifier iotSiteWiseAssetModelPropertyIdentifier) {
        this.iotSiteWiseAssetModelPropertyIdentifier = iotSiteWiseAssetModelPropertyIdentifier;
    }

    /**
     * <p>
     * The identifier of the AWS IoT SiteWise asset model property.
     * </p>
     * 
     * @return The identifier of the AWS IoT SiteWise asset model property.
     */

    public IotSiteWiseAssetModelPropertyIdentifier getIotSiteWiseAssetModelPropertyIdentifier() {
        return this.iotSiteWiseAssetModelPropertyIdentifier;
    }

    /**
     * <p>
     * The identifier of the AWS IoT SiteWise asset model property.
     * </p>
     * 
     * @param iotSiteWiseAssetModelPropertyIdentifier
     *        The identifier of the AWS IoT SiteWise asset model property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotSiteWiseInputIdentifier withIotSiteWiseAssetModelPropertyIdentifier(
            IotSiteWiseAssetModelPropertyIdentifier iotSiteWiseAssetModelPropertyIdentifier) {
        setIotSiteWiseAssetModelPropertyIdentifier(iotSiteWiseAssetModelPropertyIdentifier);
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
        if (getIotSiteWiseAssetModelPropertyIdentifier() != null)
            sb.append("IotSiteWiseAssetModelPropertyIdentifier: ").append(getIotSiteWiseAssetModelPropertyIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotSiteWiseInputIdentifier == false)
            return false;
        IotSiteWiseInputIdentifier other = (IotSiteWiseInputIdentifier) obj;
        if (other.getIotSiteWiseAssetModelPropertyIdentifier() == null ^ this.getIotSiteWiseAssetModelPropertyIdentifier() == null)
            return false;
        if (other.getIotSiteWiseAssetModelPropertyIdentifier() != null
                && other.getIotSiteWiseAssetModelPropertyIdentifier().equals(this.getIotSiteWiseAssetModelPropertyIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotSiteWiseAssetModelPropertyIdentifier() == null) ? 0 : getIotSiteWiseAssetModelPropertyIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public IotSiteWiseInputIdentifier clone() {
        try {
            return (IotSiteWiseInputIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.IotSiteWiseInputIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
