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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A remote location where a multi-location fleet can deploy EC2 instances for game hosting.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateFleet</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/LocationConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        An AWS Region code, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @return An AWS Region code, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * An AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        An AWS Region code, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationConfiguration withLocation(String location) {
        setLocation(location);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationConfiguration == false)
            return false;
        LocationConfiguration other = (LocationConfiguration) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public LocationConfiguration clone() {
        try {
            return (LocationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.LocationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
