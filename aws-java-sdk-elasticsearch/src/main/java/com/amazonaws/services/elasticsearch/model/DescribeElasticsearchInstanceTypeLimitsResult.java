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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Container for the parameters received from <code> <a>DescribeElasticsearchInstanceTypeLimits</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeElasticsearchInstanceTypeLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    private java.util.Map<String, Limits> limitsByRole;

    /**
     * @return
     */

    public java.util.Map<String, Limits> getLimitsByRole() {
        return limitsByRole;
    }

    /**
     * @param limitsByRole
     */

    public void setLimitsByRole(java.util.Map<String, Limits> limitsByRole) {
        this.limitsByRole = limitsByRole;
    }

    /**
     * @param limitsByRole
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeElasticsearchInstanceTypeLimitsResult withLimitsByRole(java.util.Map<String, Limits> limitsByRole) {
        setLimitsByRole(limitsByRole);
        return this;
    }

    public DescribeElasticsearchInstanceTypeLimitsResult addLimitsByRoleEntry(String key, Limits value) {
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

    public DescribeElasticsearchInstanceTypeLimitsResult clearLimitsByRoleEntries() {
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

        if (obj instanceof DescribeElasticsearchInstanceTypeLimitsResult == false)
            return false;
        DescribeElasticsearchInstanceTypeLimitsResult other = (DescribeElasticsearchInstanceTypeLimitsResult) obj;
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
    public DescribeElasticsearchInstanceTypeLimitsResult clone() {
        try {
            return (DescribeElasticsearchInstanceTypeLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
