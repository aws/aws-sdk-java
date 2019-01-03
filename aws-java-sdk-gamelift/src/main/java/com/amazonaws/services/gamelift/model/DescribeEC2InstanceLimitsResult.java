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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEC2InstanceLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that contains the maximum number of instances for the specified instance type.
     * </p>
     */
    private java.util.List<EC2InstanceLimit> eC2InstanceLimits;

    /**
     * <p>
     * Object that contains the maximum number of instances for the specified instance type.
     * </p>
     * 
     * @return Object that contains the maximum number of instances for the specified instance type.
     */

    public java.util.List<EC2InstanceLimit> getEC2InstanceLimits() {
        return eC2InstanceLimits;
    }

    /**
     * <p>
     * Object that contains the maximum number of instances for the specified instance type.
     * </p>
     * 
     * @param eC2InstanceLimits
     *        Object that contains the maximum number of instances for the specified instance type.
     */

    public void setEC2InstanceLimits(java.util.Collection<EC2InstanceLimit> eC2InstanceLimits) {
        if (eC2InstanceLimits == null) {
            this.eC2InstanceLimits = null;
            return;
        }

        this.eC2InstanceLimits = new java.util.ArrayList<EC2InstanceLimit>(eC2InstanceLimits);
    }

    /**
     * <p>
     * Object that contains the maximum number of instances for the specified instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2InstanceLimits(java.util.Collection)} or {@link #withEC2InstanceLimits(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eC2InstanceLimits
     *        Object that contains the maximum number of instances for the specified instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEC2InstanceLimitsResult withEC2InstanceLimits(EC2InstanceLimit... eC2InstanceLimits) {
        if (this.eC2InstanceLimits == null) {
            setEC2InstanceLimits(new java.util.ArrayList<EC2InstanceLimit>(eC2InstanceLimits.length));
        }
        for (EC2InstanceLimit ele : eC2InstanceLimits) {
            this.eC2InstanceLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Object that contains the maximum number of instances for the specified instance type.
     * </p>
     * 
     * @param eC2InstanceLimits
     *        Object that contains the maximum number of instances for the specified instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEC2InstanceLimitsResult withEC2InstanceLimits(java.util.Collection<EC2InstanceLimit> eC2InstanceLimits) {
        setEC2InstanceLimits(eC2InstanceLimits);
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
        if (getEC2InstanceLimits() != null)
            sb.append("EC2InstanceLimits: ").append(getEC2InstanceLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEC2InstanceLimitsResult == false)
            return false;
        DescribeEC2InstanceLimitsResult other = (DescribeEC2InstanceLimitsResult) obj;
        if (other.getEC2InstanceLimits() == null ^ this.getEC2InstanceLimits() == null)
            return false;
        if (other.getEC2InstanceLimits() != null && other.getEC2InstanceLimits().equals(this.getEC2InstanceLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEC2InstanceLimits() == null) ? 0 : getEC2InstanceLimits().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEC2InstanceLimitsResult clone() {
        try {
            return (DescribeEC2InstanceLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
