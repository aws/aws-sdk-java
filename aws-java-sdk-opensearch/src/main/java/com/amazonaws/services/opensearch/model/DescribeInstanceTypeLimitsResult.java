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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the parameters received from the <code>DescribeInstanceTypeLimits</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypeLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.<code>master</code>
     * refers to dedicated master nodes.
     * </p>
     */
    private java.util.Map<String, Limits> limitsByRole;

    /**
     * <p>
     * Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.<code>master</code>
     * refers to dedicated master nodes.
     * </p>
     * 
     * @return Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.
     *         <code>master</code> refers to dedicated master nodes.
     */

    public java.util.Map<String, Limits> getLimitsByRole() {
        return limitsByRole;
    }

    /**
     * <p>
     * Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.<code>master</code>
     * refers to dedicated master nodes.
     * </p>
     * 
     * @param limitsByRole
     *        Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.
     *        <code>master</code> refers to dedicated master nodes.
     */

    public void setLimitsByRole(java.util.Map<String, Limits> limitsByRole) {
        this.limitsByRole = limitsByRole;
    }

    /**
     * <p>
     * Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.<code>master</code>
     * refers to dedicated master nodes.
     * </p>
     * 
     * @param limitsByRole
     *        Map that contains all applicable instance type limits.<code>data</code> refers to data nodes.
     *        <code>master</code> refers to dedicated master nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeLimitsResult withLimitsByRole(java.util.Map<String, Limits> limitsByRole) {
        setLimitsByRole(limitsByRole);
        return this;
    }

    /**
     * Add a single LimitsByRole entry
     *
     * @see DescribeInstanceTypeLimitsResult#withLimitsByRole
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeLimitsResult addLimitsByRoleEntry(String key, Limits value) {
        if (null == this.limitsByRole) {
            this.limitsByRole = new java.util.HashMap<String, Limits>();
        }
        if (this.limitsByRole.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.limitsByRole.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LimitsByRole.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeLimitsResult clearLimitsByRoleEntries() {
        this.limitsByRole = null;
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
        if (getLimitsByRole() != null)
            sb.append("LimitsByRole: ").append(getLimitsByRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceTypeLimitsResult == false)
            return false;
        DescribeInstanceTypeLimitsResult other = (DescribeInstanceTypeLimitsResult) obj;
        if (other.getLimitsByRole() == null ^ this.getLimitsByRole() == null)
            return false;
        if (other.getLimitsByRole() != null && other.getLimitsByRole().equals(this.getLimitsByRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimitsByRole() == null) ? 0 : getLimitsByRole().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTypeLimitsResult clone() {
        try {
            return (DescribeInstanceTypeLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
