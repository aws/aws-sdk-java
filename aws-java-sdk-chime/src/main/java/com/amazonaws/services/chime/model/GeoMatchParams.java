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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The country and area code for a proxy phone number in a proxy phone session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GeoMatchParams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The country.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The area code.
     * </p>
     */
    private String areaCode;

    /**
     * <p>
     * The country.
     * </p>
     * 
     * @param country
     *        The country.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country.
     * </p>
     * 
     * @return The country.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country.
     * </p>
     * 
     * @param country
     *        The country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchParams withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * 
     * @param areaCode
     *        The area code.
     */

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * 
     * @return The area code.
     */

    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * <p>
     * The area code.
     * </p>
     * 
     * @param areaCode
     *        The area code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchParams withAreaCode(String areaCode) {
        setAreaCode(areaCode);
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
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getAreaCode() != null)
            sb.append("AreaCode: ").append(getAreaCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchParams == false)
            return false;
        GeoMatchParams other = (GeoMatchParams) obj;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getAreaCode() == null ^ this.getAreaCode() == null)
            return false;
        if (other.getAreaCode() != null && other.getAreaCode().equals(this.getAreaCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchParams clone() {
        try {
            return (GeoMatchParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.GeoMatchParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
