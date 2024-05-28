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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details new geolocations used either at the resource or account level. For example, lists an observed geolocation
 * that is an infrequent or unused location based on previous user activity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/NewGeolocationDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewGeolocationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Location where the resource was accessed.
     * </p>
     */
    private String location;
    /**
     * <p>
     * IP address using which the resource was accessed.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Checks if the geolocation is new for the entire account.
     * </p>
     */
    private Boolean isNewForEntireAccount;

    /**
     * <p>
     * Location where the resource was accessed.
     * </p>
     * 
     * @param location
     *        Location where the resource was accessed.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Location where the resource was accessed.
     * </p>
     * 
     * @return Location where the resource was accessed.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Location where the resource was accessed.
     * </p>
     * 
     * @param location
     *        Location where the resource was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGeolocationDetail withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * IP address using which the resource was accessed.
     * </p>
     * 
     * @param ipAddress
     *        IP address using which the resource was accessed.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address using which the resource was accessed.
     * </p>
     * 
     * @return IP address using which the resource was accessed.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address using which the resource was accessed.
     * </p>
     * 
     * @param ipAddress
     *        IP address using which the resource was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGeolocationDetail withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Checks if the geolocation is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the geolocation is new for the entire account.
     */

    public void setIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        this.isNewForEntireAccount = isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the geolocation is new for the entire account.
     * </p>
     * 
     * @return Checks if the geolocation is new for the entire account.
     */

    public Boolean getIsNewForEntireAccount() {
        return this.isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the geolocation is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the geolocation is new for the entire account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewGeolocationDetail withIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        setIsNewForEntireAccount(isNewForEntireAccount);
        return this;
    }

    /**
     * <p>
     * Checks if the geolocation is new for the entire account.
     * </p>
     * 
     * @return Checks if the geolocation is new for the entire account.
     */

    public Boolean isNewForEntireAccount() {
        return this.isNewForEntireAccount;
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getIsNewForEntireAccount() != null)
            sb.append("IsNewForEntireAccount: ").append(getIsNewForEntireAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewGeolocationDetail == false)
            return false;
        NewGeolocationDetail other = (NewGeolocationDetail) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getIsNewForEntireAccount() == null ^ this.getIsNewForEntireAccount() == null)
            return false;
        if (other.getIsNewForEntireAccount() != null && other.getIsNewForEntireAccount().equals(this.getIsNewForEntireAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getIsNewForEntireAccount() == null) ? 0 : getIsNewForEntireAccount().hashCode());
        return hashCode;
    }

    @Override
    public NewGeolocationDetail clone() {
        try {
            return (NewGeolocationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.NewGeolocationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
