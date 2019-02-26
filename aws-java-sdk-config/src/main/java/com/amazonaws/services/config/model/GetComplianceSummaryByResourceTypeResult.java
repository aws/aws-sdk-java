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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceSummaryByResourceTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The number of resources that are compliant and the number that are noncompliant. If one or more resource types
     * were provided with the request, the numbers are returned for each resource type. The maximum number returned is
     * 100.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceSummaryByResourceType> complianceSummariesByResourceType;

    /**
     * <p>
     * The number of resources that are compliant and the number that are noncompliant. If one or more resource types
     * were provided with the request, the numbers are returned for each resource type. The maximum number returned is
     * 100.
     * </p>
     * 
     * @return The number of resources that are compliant and the number that are noncompliant. If one or more resource
     *         types were provided with the request, the numbers are returned for each resource type. The maximum number
     *         returned is 100.
     */

    public java.util.List<ComplianceSummaryByResourceType> getComplianceSummariesByResourceType() {
        if (complianceSummariesByResourceType == null) {
            complianceSummariesByResourceType = new com.amazonaws.internal.SdkInternalList<ComplianceSummaryByResourceType>();
        }
        return complianceSummariesByResourceType;
    }

    /**
     * <p>
     * The number of resources that are compliant and the number that are noncompliant. If one or more resource types
     * were provided with the request, the numbers are returned for each resource type. The maximum number returned is
     * 100.
     * </p>
     * 
     * @param complianceSummariesByResourceType
     *        The number of resources that are compliant and the number that are noncompliant. If one or more resource
     *        types were provided with the request, the numbers are returned for each resource type. The maximum number
     *        returned is 100.
     */

    public void setComplianceSummariesByResourceType(java.util.Collection<ComplianceSummaryByResourceType> complianceSummariesByResourceType) {
        if (complianceSummariesByResourceType == null) {
            this.complianceSummariesByResourceType = null;
            return;
        }

        this.complianceSummariesByResourceType = new com.amazonaws.internal.SdkInternalList<ComplianceSummaryByResourceType>(complianceSummariesByResourceType);
    }

    /**
     * <p>
     * The number of resources that are compliant and the number that are noncompliant. If one or more resource types
     * were provided with the request, the numbers are returned for each resource type. The maximum number returned is
     * 100.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceSummariesByResourceType(java.util.Collection)} or
     * {@link #withComplianceSummariesByResourceType(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param complianceSummariesByResourceType
     *        The number of resources that are compliant and the number that are noncompliant. If one or more resource
     *        types were provided with the request, the numbers are returned for each resource type. The maximum number
     *        returned is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryByResourceTypeResult withComplianceSummariesByResourceType(ComplianceSummaryByResourceType... complianceSummariesByResourceType) {
        if (this.complianceSummariesByResourceType == null) {
            setComplianceSummariesByResourceType(new com.amazonaws.internal.SdkInternalList<ComplianceSummaryByResourceType>(
                    complianceSummariesByResourceType.length));
        }
        for (ComplianceSummaryByResourceType ele : complianceSummariesByResourceType) {
            this.complianceSummariesByResourceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of resources that are compliant and the number that are noncompliant. If one or more resource types
     * were provided with the request, the numbers are returned for each resource type. The maximum number returned is
     * 100.
     * </p>
     * 
     * @param complianceSummariesByResourceType
     *        The number of resources that are compliant and the number that are noncompliant. If one or more resource
     *        types were provided with the request, the numbers are returned for each resource type. The maximum number
     *        returned is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryByResourceTypeResult withComplianceSummariesByResourceType(
            java.util.Collection<ComplianceSummaryByResourceType> complianceSummariesByResourceType) {
        setComplianceSummariesByResourceType(complianceSummariesByResourceType);
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
        if (getComplianceSummariesByResourceType() != null)
            sb.append("ComplianceSummariesByResourceType: ").append(getComplianceSummariesByResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryByResourceTypeResult == false)
            return false;
        GetComplianceSummaryByResourceTypeResult other = (GetComplianceSummaryByResourceTypeResult) obj;
        if (other.getComplianceSummariesByResourceType() == null ^ this.getComplianceSummariesByResourceType() == null)
            return false;
        if (other.getComplianceSummariesByResourceType() != null
                && other.getComplianceSummariesByResourceType().equals(this.getComplianceSummariesByResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceSummariesByResourceType() == null) ? 0 : getComplianceSummariesByResourceType().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult clone() {
        try {
            return (GetComplianceSummaryByResourceTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
