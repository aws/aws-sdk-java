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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBillingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the billing group.
     * </p>
     */
    private String billingGroupName;

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group.
     */

    public void setBillingGroupName(String billingGroupName) {
        this.billingGroupName = billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @return The name of the billing group.
     */

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    /**
     * <p>
     * The name of the billing group.
     * </p>
     * 
     * @param billingGroupName
     *        The name of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBillingGroupRequest withBillingGroupName(String billingGroupName) {
        setBillingGroupName(billingGroupName);
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
        if (getBillingGroupName() != null)
            sb.append("BillingGroupName: ").append(getBillingGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBillingGroupRequest == false)
            return false;
        DescribeBillingGroupRequest other = (DescribeBillingGroupRequest) obj;
        if (other.getBillingGroupName() == null ^ this.getBillingGroupName() == null)
            return false;
        if (other.getBillingGroupName() != null && other.getBillingGroupName().equals(this.getBillingGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBillingGroupName() == null) ? 0 : getBillingGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBillingGroupRequest clone() {
        return (DescribeBillingGroupRequest) super.clone();
    }

}
