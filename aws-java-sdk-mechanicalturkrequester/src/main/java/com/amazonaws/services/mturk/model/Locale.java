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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Locale data structure represents a geographical region or location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/Locale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Locale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United
     * States of America.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to
     * the state of Washington.
     * </p>
     */
    private String subdivision;

    /**
     * <p>
     * The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United
     * States of America.
     * </p>
     * 
     * @param country
     *        The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the
     *        United States of America.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United
     * States of America.
     * </p>
     * 
     * @return The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the
     *         United States of America.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United
     * States of America.
     * </p>
     * 
     * @param country
     *        The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the
     *        United States of America.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Locale withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to
     * the state of Washington.
     * </p>
     * 
     * @param subdivision
     *        The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA
     *        refers to the state of Washington.
     */

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    /**
     * <p>
     * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to
     * the state of Washington.
     * </p>
     * 
     * @return The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA
     *         refers to the state of Washington.
     */

    public String getSubdivision() {
        return this.subdivision;
    }

    /**
     * <p>
     * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to
     * the state of Washington.
     * </p>
     * 
     * @param subdivision
     *        The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA
     *        refers to the state of Washington.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Locale withSubdivision(String subdivision) {
        setSubdivision(subdivision);
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
        if (getSubdivision() != null)
            sb.append("Subdivision: ").append(getSubdivision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Locale == false)
            return false;
        Locale other = (Locale) obj;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getSubdivision() == null ^ this.getSubdivision() == null)
            return false;
        if (other.getSubdivision() != null && other.getSubdivision().equals(this.getSubdivision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getSubdivision() == null) ? 0 : getSubdivision().hashCode());
        return hashCode;
    }

    @Override
    public Locale clone() {
        try {
            return (Locale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.LocaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
