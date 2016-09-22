/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The number of AWS resources of a specific type that are compliant or noncompliant, up to a maximum of 100 for each
 * compliance.
 * </p>
 */
public class ComplianceSummaryByResourceType implements Serializable, Cloneable {

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each compliance.
     * </p>
     */
    private ComplianceSummary complianceSummary;

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @return The type of AWS resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummaryByResourceType withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each compliance.
     * </p>
     * 
     * @param complianceSummary
     *        The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each
     *        compliance.
     */

    public void setComplianceSummary(ComplianceSummary complianceSummary) {
        this.complianceSummary = complianceSummary;
    }

    /**
     * <p>
     * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each compliance.
     * </p>
     * 
     * @return The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each
     *         compliance.
     */

    public ComplianceSummary getComplianceSummary() {
        return this.complianceSummary;
    }

    /**
     * <p>
     * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each compliance.
     * </p>
     * 
     * @param complianceSummary
     *        The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each
     *        compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceSummaryByResourceType withComplianceSummary(ComplianceSummary complianceSummary) {
        setComplianceSummary(complianceSummary);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getComplianceSummary() != null)
            sb.append("ComplianceSummary: " + getComplianceSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceSummaryByResourceType == false)
            return false;
        ComplianceSummaryByResourceType other = (ComplianceSummaryByResourceType) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getComplianceSummary() == null ^ this.getComplianceSummary() == null)
            return false;
        if (other.getComplianceSummary() != null && other.getComplianceSummary().equals(this.getComplianceSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getComplianceSummary() == null) ? 0 : getComplianceSummary().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceSummaryByResourceType clone() {
        try {
            return (ComplianceSummaryByResourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
