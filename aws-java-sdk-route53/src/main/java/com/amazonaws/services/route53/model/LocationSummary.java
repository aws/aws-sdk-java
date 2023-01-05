/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about the CIDR location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/LocationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationSummary implements Serializable, Cloneable {

    /**
     * <p>
     * A string that specifies a location name.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * A string that specifies a location name.
     * </p>
     * 
     * @param locationName
     *        A string that specifies a location name.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * A string that specifies a location name.
     * </p>
     * 
     * @return A string that specifies a location name.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * A string that specifies a location name.
     * </p>
     * 
     * @param locationName
     *        A string that specifies a location name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationSummary withLocationName(String locationName) {
        setLocationName(locationName);
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
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationSummary == false)
            return false;
        LocationSummary other = (LocationSummary) obj;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        return hashCode;
    }

    @Override
    public LocationSummary clone() {
        try {
            return (LocationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
