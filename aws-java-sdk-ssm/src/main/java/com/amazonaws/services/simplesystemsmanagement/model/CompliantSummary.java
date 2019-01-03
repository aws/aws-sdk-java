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
 * A summary of resources that are compliant. The summary is organized according to the resource count for each
 * compliance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CompliantSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompliantSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     */
    private Integer compliantCount;
    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     */
    private SeveritySummary severitySummary;

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     * 
     * @param compliantCount
     *        The total number of resources that are compliant.
     */

    public void setCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
    }

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     * 
     * @return The total number of resources that are compliant.
     */

    public Integer getCompliantCount() {
        return this.compliantCount;
    }

    /**
     * <p>
     * The total number of resources that are compliant.
     * </p>
     * 
     * @param compliantCount
     *        The total number of resources that are compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompliantSummary withCompliantCount(Integer compliantCount) {
        setCompliantCount(compliantCount);
        return this;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     * 
     * @param severitySummary
     *        A summary of the compliance severity by compliance type.
     */

    public void setSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     * 
     * @return A summary of the compliance severity by compliance type.
     */

    public SeveritySummary getSeveritySummary() {
        return this.severitySummary;
    }

    /**
     * <p>
     * A summary of the compliance severity by compliance type.
     * </p>
     * 
     * @param severitySummary
     *        A summary of the compliance severity by compliance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
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
        if (getCompliantCount() != null)
            sb.append("CompliantCount: ").append(getCompliantCount()).append(",");
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

        if (obj instanceof CompliantSummary == false)
            return false;
        CompliantSummary other = (CompliantSummary) obj;
        if (other.getCompliantCount() == null ^ this.getCompliantCount() == null)
            return false;
        if (other.getCompliantCount() != null && other.getCompliantCount().equals(this.getCompliantCount()) == false)
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

        hashCode = prime * hashCode + ((getCompliantCount() == null) ? 0 : getCompliantCount().hashCode());
        hashCode = prime * hashCode + ((getSeveritySummary() == null) ? 0 : getSeveritySummary().hashCode());
        return hashCode;
    }

    @Override
    public CompliantSummary clone() {
        try {
            return (CompliantSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.CompliantSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
