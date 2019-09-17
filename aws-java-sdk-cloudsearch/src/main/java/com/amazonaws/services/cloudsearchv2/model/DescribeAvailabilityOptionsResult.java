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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeAvailabilityOptions</code> request. Indicates whether or not the Multi-AZ option is
 * enabled for the domain specified in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAvailabilityOptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     * </p>
     */
    private AvailabilityOptionsStatus availabilityOptions;

    /**
     * <p>
     * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     * </p>
     * 
     * @param availabilityOptions
     *        The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     */

    public void setAvailabilityOptions(AvailabilityOptionsStatus availabilityOptions) {
        this.availabilityOptions = availabilityOptions;
    }

    /**
     * <p>
     * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     * </p>
     * 
     * @return The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     */

    public AvailabilityOptionsStatus getAvailabilityOptions() {
        return this.availabilityOptions;
    }

    /**
     * <p>
     * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     * </p>
     * 
     * @param availabilityOptions
     *        The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAvailabilityOptionsResult withAvailabilityOptions(AvailabilityOptionsStatus availabilityOptions) {
        setAvailabilityOptions(availabilityOptions);
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
        if (getAvailabilityOptions() != null)
            sb.append("AvailabilityOptions: ").append(getAvailabilityOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAvailabilityOptionsResult == false)
            return false;
        DescribeAvailabilityOptionsResult other = (DescribeAvailabilityOptionsResult) obj;
        if (other.getAvailabilityOptions() == null ^ this.getAvailabilityOptions() == null)
            return false;
        if (other.getAvailabilityOptions() != null && other.getAvailabilityOptions().equals(this.getAvailabilityOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityOptions() == null) ? 0 : getAvailabilityOptions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAvailabilityOptionsResult clone() {
        try {
            return (DescribeAvailabilityOptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
