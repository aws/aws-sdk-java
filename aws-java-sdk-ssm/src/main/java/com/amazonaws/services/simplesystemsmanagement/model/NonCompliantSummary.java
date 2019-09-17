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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of resources that are not compliant. The summary is organized according to resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/NonCompliantSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NonCompliantSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of compliance items that are not compliant.
     * </p>
     */
    private Integer nonCompliantCount;
    /**
     * <p>
     * A summary of the non-compliance severity by compliance type
     * </p>
     */
    private SeveritySummary severitySummary;

    /**
     * <p>
     * The total number of compliance items that are not compliant.
     * </p>
     * 
     * @param nonCompliantCount
     *        The total number of compliance items that are not compliant.
     */

    public void setNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
    }

    /**
     * <p>
     * The total number of compliance items that are not compliant.
     * </p>
     * 
     * @return The total number of compliance items that are not compliant.
     */

    public Integer getNonCompliantCount() {
        return this.nonCompliantCount;
    }

    /**
     * <p>
     * The total number of compliance items that are not compliant.
     * </p>
     * 
     * @param nonCompliantCount
     *        The total number of compliance items that are not compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonCompliantSummary withNonCompliantCount(Integer nonCompliantCount) {
        setNonCompliantCount(nonCompliantCount);
        return this;
    }

    /**
     * <p>
     * A summary of the non-compliance severity by compliance type
     * </p>
     * 
     * @param severitySummary
     *        A summary of the non-compliance severity by compliance type
     */

    public void setSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
    }

    /**
     * <p>
     * A summary of the non-compliance severity by compliance type
     * </p>
     * 
     * @return A summary of the non-compliance severity by compliance type
     */

    public SeveritySummary getSeveritySummary() {
        return this.severitySummary;
    }

    /**
     * <p>
     * A summary of the non-compliance severity by compliance type
     * </p>
     * 
     * @param severitySummary
     *        A summary of the non-compliance severity by compliance type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NonCompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
        setSeveritySummary(severitySummary);
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
        if (getNonCompliantCount() != null)
            sb.append("NonCompliantCount: ").append(getNonCompliantCount()).append(",");
        if (getSeveritySummary() != null)
            sb.append("SeveritySummary: ").append(getSeveritySummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NonCompliantSummary == false)
            return false;
        NonCompliantSummary other = (NonCompliantSummary) obj;
        if (other.getNonCompliantCount() == null ^ this.getNonCompliantCount() == null)
            return false;
        if (other.getNonCompliantCount() != null && other.getNonCompliantCount().equals(this.getNonCompliantCount()) == false)
            return false;
        if (other.getSeveritySummary() == null ^ this.getSeveritySummary() == null)
            return false;
        if (other.getSeveritySummary() != null && other.getSeveritySummary().equals(this.getSeveritySummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNonCompliantCount() == null) ? 0 : getNonCompliantCount().hashCode());
        hashCode = prime * hashCode + ((getSeveritySummary() == null) ? 0 : getSeveritySummary().hashCode());
        return hashCode;
    }

    @Override
    public NonCompliantSummary clone() {
        try {
            return (NonCompliantSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.NonCompliantSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
