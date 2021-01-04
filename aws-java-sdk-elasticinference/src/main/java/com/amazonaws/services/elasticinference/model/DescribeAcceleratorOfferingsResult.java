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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAcceleratorOfferingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     */
    private java.util.List<AcceleratorTypeOffering> acceleratorTypeOfferings;

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * 
     * @return The list of accelerator type offerings for a specific location.
     */

    public java.util.List<AcceleratorTypeOffering> getAcceleratorTypeOfferings() {
        return acceleratorTypeOfferings;
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * 
     * @param acceleratorTypeOfferings
     *        The list of accelerator type offerings for a specific location.
     */

    public void setAcceleratorTypeOfferings(java.util.Collection<AcceleratorTypeOffering> acceleratorTypeOfferings) {
        if (acceleratorTypeOfferings == null) {
            this.acceleratorTypeOfferings = null;
            return;
        }

        this.acceleratorTypeOfferings = new java.util.ArrayList<AcceleratorTypeOffering>(acceleratorTypeOfferings);
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypeOfferings(java.util.Collection)} or
     * {@link #withAcceleratorTypeOfferings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypeOfferings
     *        The list of accelerator type offerings for a specific location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorOfferingsResult withAcceleratorTypeOfferings(AcceleratorTypeOffering... acceleratorTypeOfferings) {
        if (this.acceleratorTypeOfferings == null) {
            setAcceleratorTypeOfferings(new java.util.ArrayList<AcceleratorTypeOffering>(acceleratorTypeOfferings.length));
        }
        for (AcceleratorTypeOffering ele : acceleratorTypeOfferings) {
            this.acceleratorTypeOfferings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accelerator type offerings for a specific location.
     * </p>
     * 
     * @param acceleratorTypeOfferings
     *        The list of accelerator type offerings for a specific location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorOfferingsResult withAcceleratorTypeOfferings(java.util.Collection<AcceleratorTypeOffering> acceleratorTypeOfferings) {
        setAcceleratorTypeOfferings(acceleratorTypeOfferings);
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
        if (getAcceleratorTypeOfferings() != null)
            sb.append("AcceleratorTypeOfferings: ").append(getAcceleratorTypeOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorOfferingsResult == false)
            return false;
        DescribeAcceleratorOfferingsResult other = (DescribeAcceleratorOfferingsResult) obj;
        if (other.getAcceleratorTypeOfferings() == null ^ this.getAcceleratorTypeOfferings() == null)
            return false;
        if (other.getAcceleratorTypeOfferings() != null && other.getAcceleratorTypeOfferings().equals(this.getAcceleratorTypeOfferings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorTypeOfferings() == null) ? 0 : getAcceleratorTypeOfferings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAcceleratorOfferingsResult clone() {
        try {
            return (DescribeAcceleratorOfferingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
