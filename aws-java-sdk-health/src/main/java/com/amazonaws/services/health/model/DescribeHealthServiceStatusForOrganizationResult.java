/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeHealthServiceStatusForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHealthServiceStatusForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     */
    private String healthServiceAccessStatusForOrganization;

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     * 
     * @param healthServiceAccessStatusForOrganization
     *        Information about the status of enabling or disabling AWS Health Organizational View in your
     *        organization.</p>
     *        <p>
     *        Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     */

    public void setHealthServiceAccessStatusForOrganization(String healthServiceAccessStatusForOrganization) {
        this.healthServiceAccessStatusForOrganization = healthServiceAccessStatusForOrganization;
    }

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     * 
     * @return Information about the status of enabling or disabling AWS Health Organizational View in your
     *         organization.</p>
     *         <p>
     *         Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     */

    public String getHealthServiceAccessStatusForOrganization() {
        return this.healthServiceAccessStatusForOrganization;
    }

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     * 
     * @param healthServiceAccessStatusForOrganization
     *        Information about the status of enabling or disabling AWS Health Organizational View in your
     *        organization.</p>
     *        <p>
     *        Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHealthServiceStatusForOrganizationResult withHealthServiceAccessStatusForOrganization(String healthServiceAccessStatusForOrganization) {
        setHealthServiceAccessStatusForOrganization(healthServiceAccessStatusForOrganization);
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
        if (getHealthServiceAccessStatusForOrganization() != null)
            sb.append("HealthServiceAccessStatusForOrganization: ").append(getHealthServiceAccessStatusForOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHealthServiceStatusForOrganizationResult == false)
            return false;
        DescribeHealthServiceStatusForOrganizationResult other = (DescribeHealthServiceStatusForOrganizationResult) obj;
        if (other.getHealthServiceAccessStatusForOrganization() == null ^ this.getHealthServiceAccessStatusForOrganization() == null)
            return false;
        if (other.getHealthServiceAccessStatusForOrganization() != null
                && other.getHealthServiceAccessStatusForOrganization().equals(this.getHealthServiceAccessStatusForOrganization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthServiceAccessStatusForOrganization() == null) ? 0 : getHealthServiceAccessStatusForOrganization().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHealthServiceStatusForOrganizationResult clone() {
        try {
            return (DescribeHealthServiceStatusForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
