/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that identifies ways in which you want to restrict
 * distribution of your content.
 * </p>
 */
public class Restrictions implements Serializable {

    /**
     * A complex type that controls the countries in which your content is
     * distributed. For more information about geo restriction, go to
     * Customizing Error Responses in the Amazon CloudFront Developer Guide.
     * CloudFront determines the location of your users using MaxMind GeoIP
     * databases. For information about the accuracy of these databases, see
     * How accurate are your GeoIP databases? on the MaxMind website.
     */
    private GeoRestriction geoRestriction;

    /**
     * Default constructor for a new Restrictions object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Restrictions() {}
    
    /**
     * Constructs a new Restrictions object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param geoRestriction A complex type that controls the countries in
     * which your content is distributed. For more information about geo
     * restriction, go to Customizing Error Responses in the Amazon
     * CloudFront Developer Guide. CloudFront determines the location of your
     * users using MaxMind GeoIP databases. For information about the
     * accuracy of these databases, see How accurate are your GeoIP
     * databases? on the MaxMind website.
     */
    public Restrictions(GeoRestriction geoRestriction) {
        setGeoRestriction(geoRestriction);
    }

    /**
     * A complex type that controls the countries in which your content is
     * distributed. For more information about geo restriction, go to
     * Customizing Error Responses in the Amazon CloudFront Developer Guide.
     * CloudFront determines the location of your users using MaxMind GeoIP
     * databases. For information about the accuracy of these databases, see
     * How accurate are your GeoIP databases? on the MaxMind website.
     *
     * @return A complex type that controls the countries in which your content is
     *         distributed. For more information about geo restriction, go to
     *         Customizing Error Responses in the Amazon CloudFront Developer Guide.
     *         CloudFront determines the location of your users using MaxMind GeoIP
     *         databases. For information about the accuracy of these databases, see
     *         How accurate are your GeoIP databases? on the MaxMind website.
     */
    public GeoRestriction getGeoRestriction() {
        return geoRestriction;
    }
    
    /**
     * A complex type that controls the countries in which your content is
     * distributed. For more information about geo restriction, go to
     * Customizing Error Responses in the Amazon CloudFront Developer Guide.
     * CloudFront determines the location of your users using MaxMind GeoIP
     * databases. For information about the accuracy of these databases, see
     * How accurate are your GeoIP databases? on the MaxMind website.
     *
     * @param geoRestriction A complex type that controls the countries in which your content is
     *         distributed. For more information about geo restriction, go to
     *         Customizing Error Responses in the Amazon CloudFront Developer Guide.
     *         CloudFront determines the location of your users using MaxMind GeoIP
     *         databases. For information about the accuracy of these databases, see
     *         How accurate are your GeoIP databases? on the MaxMind website.
     */
    public void setGeoRestriction(GeoRestriction geoRestriction) {
        this.geoRestriction = geoRestriction;
    }
    
    /**
     * A complex type that controls the countries in which your content is
     * distributed. For more information about geo restriction, go to
     * Customizing Error Responses in the Amazon CloudFront Developer Guide.
     * CloudFront determines the location of your users using MaxMind GeoIP
     * databases. For information about the accuracy of these databases, see
     * How accurate are your GeoIP databases? on the MaxMind website.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param geoRestriction A complex type that controls the countries in which your content is
     *         distributed. For more information about geo restriction, go to
     *         Customizing Error Responses in the Amazon CloudFront Developer Guide.
     *         CloudFront determines the location of your users using MaxMind GeoIP
     *         databases. For information about the accuracy of these databases, see
     *         How accurate are your GeoIP databases? on the MaxMind website.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Restrictions withGeoRestriction(GeoRestriction geoRestriction) {
        this.geoRestriction = geoRestriction;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGeoRestriction() != null) sb.append("GeoRestriction: " + getGeoRestriction() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGeoRestriction() == null) ? 0 : getGeoRestriction().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Restrictions == false) return false;
        Restrictions other = (Restrictions)obj;
        
        if (other.getGeoRestriction() == null ^ this.getGeoRestriction() == null) return false;
        if (other.getGeoRestriction() != null && other.getGeoRestriction().equals(this.getGeoRestriction()) == false) return false; 
        return true;
    }
    
}
    