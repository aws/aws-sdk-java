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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information that relates to the category of the insight. Currently only returned with certain insights having
 * category <code>UPGRADE_READINESS</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/InsightCategorySpecificSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightCategorySpecificSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The summary information about deprecated resource usage for an insight check in the
     * <code>UPGRADE_READINESS</code> category.
     * </p>
     */
    private java.util.List<DeprecationDetail> deprecationDetails;

    /**
     * <p>
     * The summary information about deprecated resource usage for an insight check in the
     * <code>UPGRADE_READINESS</code> category.
     * </p>
     * 
     * @return The summary information about deprecated resource usage for an insight check in the
     *         <code>UPGRADE_READINESS</code> category.
     */

    public java.util.List<DeprecationDetail> getDeprecationDetails() {
        return deprecationDetails;
    }

    /**
     * <p>
     * The summary information about deprecated resource usage for an insight check in the
     * <code>UPGRADE_READINESS</code> category.
     * </p>
     * 
     * @param deprecationDetails
     *        The summary information about deprecated resource usage for an insight check in the
     *        <code>UPGRADE_READINESS</code> category.
     */

    public void setDeprecationDetails(java.util.Collection<DeprecationDetail> deprecationDetails) {
        if (deprecationDetails == null) {
            this.deprecationDetails = null;
            return;
        }

        this.deprecationDetails = new java.util.ArrayList<DeprecationDetail>(deprecationDetails);
    }

    /**
     * <p>
     * The summary information about deprecated resource usage for an insight check in the
     * <code>UPGRADE_READINESS</code> category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeprecationDetails(java.util.Collection)} or {@link #withDeprecationDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param deprecationDetails
     *        The summary information about deprecated resource usage for an insight check in the
     *        <code>UPGRADE_READINESS</code> category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightCategorySpecificSummary withDeprecationDetails(DeprecationDetail... deprecationDetails) {
        if (this.deprecationDetails == null) {
            setDeprecationDetails(new java.util.ArrayList<DeprecationDetail>(deprecationDetails.length));
        }
        for (DeprecationDetail ele : deprecationDetails) {
            this.deprecationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary information about deprecated resource usage for an insight check in the
     * <code>UPGRADE_READINESS</code> category.
     * </p>
     * 
     * @param deprecationDetails
     *        The summary information about deprecated resource usage for an insight check in the
     *        <code>UPGRADE_READINESS</code> category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightCategorySpecificSummary withDeprecationDetails(java.util.Collection<DeprecationDetail> deprecationDetails) {
        setDeprecationDetails(deprecationDetails);
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
        if (getDeprecationDetails() != null)
            sb.append("DeprecationDetails: ").append(getDeprecationDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightCategorySpecificSummary == false)
            return false;
        InsightCategorySpecificSummary other = (InsightCategorySpecificSummary) obj;
        if (other.getDeprecationDetails() == null ^ this.getDeprecationDetails() == null)
            return false;
        if (other.getDeprecationDetails() != null && other.getDeprecationDetails().equals(this.getDeprecationDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeprecationDetails() == null) ? 0 : getDeprecationDetails().hashCode());
        return hashCode;
    }

    @Override
    public InsightCategorySpecificSummary clone() {
        try {
            return (InsightCategorySpecificSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.InsightCategorySpecificSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
