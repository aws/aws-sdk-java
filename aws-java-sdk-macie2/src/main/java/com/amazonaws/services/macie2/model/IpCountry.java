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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the country that an IP address originated from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/IpCountry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpCountry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For
     * example, US for the United States.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The name of the country that the IP address originated from.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For
     * example, US for the United States.
     * </p>
     * 
     * @param code
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from.
     *        For example, US for the United States.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For
     * example, US for the United States.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated
     *         from. For example, US for the United States.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from. For
     * example, US for the United States.
     * </p>
     * 
     * @param code
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country that the IP address originated from.
     *        For example, US for the United States.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpCountry withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The name of the country that the IP address originated from.
     * </p>
     * 
     * @param name
     *        The name of the country that the IP address originated from.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the country that the IP address originated from.
     * </p>
     * 
     * @return The name of the country that the IP address originated from.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the country that the IP address originated from.
     * </p>
     * 
     * @param name
     *        The name of the country that the IP address originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpCountry withName(String name) {
        setName(name);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpCountry == false)
            return false;
        IpCountry other = (IpCountry) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public IpCountry clone() {
        try {
            return (IpCountry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IpCountryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
