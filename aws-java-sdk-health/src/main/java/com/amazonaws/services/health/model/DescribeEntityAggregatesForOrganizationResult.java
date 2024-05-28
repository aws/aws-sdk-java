/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregatesForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntityAggregatesForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The list of entity aggregates for each of the specified accounts that are affected by each of the specified
     * events.
     * </p>
     */
    private java.util.List<OrganizationEntityAggregate> organizationEntityAggregates;

    /**
     * <p>
     * The list of entity aggregates for each of the specified accounts that are affected by each of the specified
     * events.
     * </p>
     * 
     * @return The list of entity aggregates for each of the specified accounts that are affected by each of the
     *         specified events.
     */

    public java.util.List<OrganizationEntityAggregate> getOrganizationEntityAggregates() {
        return organizationEntityAggregates;
    }

    /**
     * <p>
     * The list of entity aggregates for each of the specified accounts that are affected by each of the specified
     * events.
     * </p>
     * 
     * @param organizationEntityAggregates
     *        The list of entity aggregates for each of the specified accounts that are affected by each of the
     *        specified events.
     */

    public void setOrganizationEntityAggregates(java.util.Collection<OrganizationEntityAggregate> organizationEntityAggregates) {
        if (organizationEntityAggregates == null) {
            this.organizationEntityAggregates = null;
            return;
        }

        this.organizationEntityAggregates = new java.util.ArrayList<OrganizationEntityAggregate>(organizationEntityAggregates);
    }

    /**
     * <p>
     * The list of entity aggregates for each of the specified accounts that are affected by each of the specified
     * events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationEntityAggregates(java.util.Collection)} or
     * {@link #withOrganizationEntityAggregates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationEntityAggregates
     *        The list of entity aggregates for each of the specified accounts that are affected by each of the
     *        specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityAggregatesForOrganizationResult withOrganizationEntityAggregates(OrganizationEntityAggregate... organizationEntityAggregates) {
        if (this.organizationEntityAggregates == null) {
            setOrganizationEntityAggregates(new java.util.ArrayList<OrganizationEntityAggregate>(organizationEntityAggregates.length));
        }
        for (OrganizationEntityAggregate ele : organizationEntityAggregates) {
            this.organizationEntityAggregates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of entity aggregates for each of the specified accounts that are affected by each of the specified
     * events.
     * </p>
     * 
     * @param organizationEntityAggregates
     *        The list of entity aggregates for each of the specified accounts that are affected by each of the
     *        specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityAggregatesForOrganizationResult withOrganizationEntityAggregates(
            java.util.Collection<OrganizationEntityAggregate> organizationEntityAggregates) {
        setOrganizationEntityAggregates(organizationEntityAggregates);
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
        if (getOrganizationEntityAggregates() != null)
            sb.append("OrganizationEntityAggregates: ").append(getOrganizationEntityAggregates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityAggregatesForOrganizationResult == false)
            return false;
        DescribeEntityAggregatesForOrganizationResult other = (DescribeEntityAggregatesForOrganizationResult) obj;
        if (other.getOrganizationEntityAggregates() == null ^ this.getOrganizationEntityAggregates() == null)
            return false;
        if (other.getOrganizationEntityAggregates() != null && other.getOrganizationEntityAggregates().equals(this.getOrganizationEntityAggregates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationEntityAggregates() == null) ? 0 : getOrganizationEntityAggregates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEntityAggregatesForOrganizationResult clone() {
        try {
            return (DescribeEntityAggregatesForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
