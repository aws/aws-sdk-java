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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that identifies ways in which you want to restrict distribution of your content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Restrictions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Restrictions implements Serializable, Cloneable {

    private GeoRestriction geoRestriction;

    /**
     * Default constructor for Restrictions object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Restrictions() {
    }

    /**
     * Constructs a new Restrictions object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param geoRestriction
     */
    public Restrictions(GeoRestriction geoRestriction) {
        setGeoRestriction(geoRestriction);
    }

    /**
     * @param geoRestriction
     */

    public void setGeoRestriction(GeoRestriction geoRestriction) {
        this.geoRestriction = geoRestriction;
    }

    /**
     * @return
     */

    public GeoRestriction getGeoRestriction() {
        return this.geoRestriction;
    }

    /**
     * @param geoRestriction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Restrictions withGeoRestriction(GeoRestriction geoRestriction) {
        setGeoRestriction(geoRestriction);
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
        if (getGeoRestriction() != null)
            sb.append("GeoRestriction: ").append(getGeoRestriction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Restrictions == false)
            return false;
        Restrictions other = (Restrictions) obj;
        if (other.getGeoRestriction() == null ^ this.getGeoRestriction() == null)
            return false;
        if (other.getGeoRestriction() != null && other.getGeoRestriction().equals(this.getGeoRestriction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoRestriction() == null) ? 0 : getGeoRestriction().hashCode());
        return hashCode;
    }

    @Override
    public Restrictions clone() {
        try {
            return (Restrictions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
