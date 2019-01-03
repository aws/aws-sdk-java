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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityIdFormatResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the ID format for the resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IdFormat> statuses;

    /**
     * <p>
     * Information about the ID format for the resources.
     * </p>
     * 
     * @return Information about the ID format for the resources.
     */

    public java.util.List<IdFormat> getStatuses() {
        if (statuses == null) {
            statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>();
        }
        return statuses;
    }

    /**
     * <p>
     * Information about the ID format for the resources.
     * </p>
     * 
     * @param statuses
     *        Information about the ID format for the resources.
     */

    public void setStatuses(java.util.Collection<IdFormat> statuses) {
        if (statuses == null) {
            this.statuses = null;
            return;
        }

        this.statuses = new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses);
    }

    /**
     * <p>
     * Information about the ID format for the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatuses(java.util.Collection)} or {@link #withStatuses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param statuses
     *        Information about the ID format for the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityIdFormatResult withStatuses(IdFormat... statuses) {
        if (this.statuses == null) {
            setStatuses(new com.amazonaws.internal.SdkInternalList<IdFormat>(statuses.length));
        }
        for (IdFormat ele : statuses) {
            this.statuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ID format for the resources.
     * </p>
     * 
     * @param statuses
     *        Information about the ID format for the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityIdFormatResult withStatuses(java.util.Collection<IdFormat> statuses) {
        setStatuses(statuses);
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
        if (getStatuses() != null)
            sb.append("Statuses: ").append(getStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityIdFormatResult == false)
            return false;
        DescribeIdentityIdFormatResult other = (DescribeIdentityIdFormatResult) obj;
        if (other.getStatuses() == null ^ this.getStatuses() == null)
            return false;
        if (other.getStatuses() != null && other.getStatuses().equals(this.getStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatuses() == null) ? 0 : getStatuses().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityIdFormatResult clone() {
        try {
            return (DescribeIdentityIdFormatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
