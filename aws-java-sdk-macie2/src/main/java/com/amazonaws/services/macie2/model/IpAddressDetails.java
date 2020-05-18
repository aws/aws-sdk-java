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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The IP address of the device that the entity used to perform the action on the affected resource. This object also
 * provides information such as the owner and geographical location for the IP address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/IpAddressDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String ipAddressV4;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private IpCity ipCity;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private IpCountry ipCountry;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private IpGeoLocation ipGeoLocation;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private IpOwner ipOwner;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipAddressV4
     *        Reserved for future use.
     */

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipAddressV4
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpAddressV4(String ipAddressV4) {
        setIpAddressV4(ipAddressV4);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipCity
     *        Reserved for future use.
     */

    public void setIpCity(IpCity ipCity) {
        this.ipCity = ipCity;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public IpCity getIpCity() {
        return this.ipCity;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipCity
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpCity(IpCity ipCity) {
        setIpCity(ipCity);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipCountry
     *        Reserved for future use.
     */

    public void setIpCountry(IpCountry ipCountry) {
        this.ipCountry = ipCountry;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public IpCountry getIpCountry() {
        return this.ipCountry;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipCountry
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpCountry(IpCountry ipCountry) {
        setIpCountry(ipCountry);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipGeoLocation
     *        Reserved for future use.
     */

    public void setIpGeoLocation(IpGeoLocation ipGeoLocation) {
        this.ipGeoLocation = ipGeoLocation;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public IpGeoLocation getIpGeoLocation() {
        return this.ipGeoLocation;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipGeoLocation
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpGeoLocation(IpGeoLocation ipGeoLocation) {
        setIpGeoLocation(ipGeoLocation);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipOwner
     *        Reserved for future use.
     */

    public void setIpOwner(IpOwner ipOwner) {
        this.ipOwner = ipOwner;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public IpOwner getIpOwner() {
        return this.ipOwner;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param ipOwner
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddressDetails withIpOwner(IpOwner ipOwner) {
        setIpOwner(ipOwner);
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
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: ").append(getIpAddressV4()).append(",");
        if (getIpCity() != null)
            sb.append("IpCity: ").append(getIpCity()).append(",");
        if (getIpCountry() != null)
            sb.append("IpCountry: ").append(getIpCountry()).append(",");
        if (getIpGeoLocation() != null)
            sb.append("IpGeoLocation: ").append(getIpGeoLocation()).append(",");
        if (getIpOwner() != null)
            sb.append("IpOwner: ").append(getIpOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddressDetails == false)
            return false;
        IpAddressDetails other = (IpAddressDetails) obj;
        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        if (other.getIpCity() == null ^ this.getIpCity() == null)
            return false;
        if (other.getIpCity() != null && other.getIpCity().equals(this.getIpCity()) == false)
            return false;
        if (other.getIpCountry() == null ^ this.getIpCountry() == null)
            return false;
        if (other.getIpCountry() != null && other.getIpCountry().equals(this.getIpCountry()) == false)
            return false;
        if (other.getIpGeoLocation() == null ^ this.getIpGeoLocation() == null)
            return false;
        if (other.getIpGeoLocation() != null && other.getIpGeoLocation().equals(this.getIpGeoLocation()) == false)
            return false;
        if (other.getIpOwner() == null ^ this.getIpOwner() == null)
            return false;
        if (other.getIpOwner() != null && other.getIpOwner().equals(this.getIpOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        hashCode = prime * hashCode + ((getIpCity() == null) ? 0 : getIpCity().hashCode());
        hashCode = prime * hashCode + ((getIpCountry() == null) ? 0 : getIpCountry().hashCode());
        hashCode = prime * hashCode + ((getIpGeoLocation() == null) ? 0 : getIpGeoLocation().hashCode());
        hashCode = prime * hashCode + ((getIpOwner() == null) ? 0 : getIpOwner().hashCode());
        return hashCode;
    }

    @Override
    public IpAddressDetails clone() {
        try {
            return (IpAddressDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IpAddressDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
