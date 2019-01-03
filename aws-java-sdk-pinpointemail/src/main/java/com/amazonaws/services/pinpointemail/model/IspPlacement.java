/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes how email sent during the predictive inbox placement test was handled by a certain email
 * provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/IspPlacement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IspPlacement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     */
    private String ispName;
    /**
     * <p>
     * An object that contains inbox placement metrics for a specific email provider.
     * </p>
     */
    private PlacementStatistics placementStatistics;

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param ispName
     *        The name of the email provider that the inbox placement data applies to.
     */

    public void setIspName(String ispName) {
        this.ispName = ispName;
    }

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @return The name of the email provider that the inbox placement data applies to.
     */

    public String getIspName() {
        return this.ispName;
    }

    /**
     * <p>
     * The name of the email provider that the inbox placement data applies to.
     * </p>
     * 
     * @param ispName
     *        The name of the email provider that the inbox placement data applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IspPlacement withIspName(String ispName) {
        setIspName(ispName);
        return this;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific email provider.
     * </p>
     * 
     * @param placementStatistics
     *        An object that contains inbox placement metrics for a specific email provider.
     */

    public void setPlacementStatistics(PlacementStatistics placementStatistics) {
        this.placementStatistics = placementStatistics;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific email provider.
     * </p>
     * 
     * @return An object that contains inbox placement metrics for a specific email provider.
     */

    public PlacementStatistics getPlacementStatistics() {
        return this.placementStatistics;
    }

    /**
     * <p>
     * An object that contains inbox placement metrics for a specific email provider.
     * </p>
     * 
     * @param placementStatistics
     *        An object that contains inbox placement metrics for a specific email provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IspPlacement withPlacementStatistics(PlacementStatistics placementStatistics) {
        setPlacementStatistics(placementStatistics);
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
        if (getIspName() != null)
            sb.append("IspName: ").append(getIspName()).append(",");
        if (getPlacementStatistics() != null)
            sb.append("PlacementStatistics: ").append(getPlacementStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IspPlacement == false)
            return false;
        IspPlacement other = (IspPlacement) obj;
        if (other.getIspName() == null ^ this.getIspName() == null)
            return false;
        if (other.getIspName() != null && other.getIspName().equals(this.getIspName()) == false)
            return false;
        if (other.getPlacementStatistics() == null ^ this.getPlacementStatistics() == null)
            return false;
        if (other.getPlacementStatistics() != null && other.getPlacementStatistics().equals(this.getPlacementStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIspName() == null) ? 0 : getIspName().hashCode());
        hashCode = prime * hashCode + ((getPlacementStatistics() == null) ? 0 : getPlacementStatistics().hashCode());
        return hashCode;
    }

    @Override
    public IspPlacement clone() {
        try {
            return (IspPlacement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.IspPlacementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
