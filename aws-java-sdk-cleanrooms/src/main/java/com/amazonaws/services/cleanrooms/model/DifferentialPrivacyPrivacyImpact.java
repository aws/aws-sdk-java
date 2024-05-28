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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the number of aggregation functions that the member who can query can run given the epsilon and
 * noise parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DifferentialPrivacyPrivacyImpact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DifferentialPrivacyPrivacyImpact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of aggregation functions that you can perform.
     * </p>
     */
    private java.util.List<DifferentialPrivacyPreviewAggregation> aggregations;

    /**
     * <p>
     * The number of aggregation functions that you can perform.
     * </p>
     * 
     * @return The number of aggregation functions that you can perform.
     */

    public java.util.List<DifferentialPrivacyPreviewAggregation> getAggregations() {
        return aggregations;
    }

    /**
     * <p>
     * The number of aggregation functions that you can perform.
     * </p>
     * 
     * @param aggregations
     *        The number of aggregation functions that you can perform.
     */

    public void setAggregations(java.util.Collection<DifferentialPrivacyPreviewAggregation> aggregations) {
        if (aggregations == null) {
            this.aggregations = null;
            return;
        }

        this.aggregations = new java.util.ArrayList<DifferentialPrivacyPreviewAggregation>(aggregations);
    }

    /**
     * <p>
     * The number of aggregation functions that you can perform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregations(java.util.Collection)} or {@link #withAggregations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregations
     *        The number of aggregation functions that you can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyImpact withAggregations(DifferentialPrivacyPreviewAggregation... aggregations) {
        if (this.aggregations == null) {
            setAggregations(new java.util.ArrayList<DifferentialPrivacyPreviewAggregation>(aggregations.length));
        }
        for (DifferentialPrivacyPreviewAggregation ele : aggregations) {
            this.aggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of aggregation functions that you can perform.
     * </p>
     * 
     * @param aggregations
     *        The number of aggregation functions that you can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DifferentialPrivacyPrivacyImpact withAggregations(java.util.Collection<DifferentialPrivacyPreviewAggregation> aggregations) {
        setAggregations(aggregations);
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
        if (getAggregations() != null)
            sb.append("Aggregations: ").append(getAggregations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DifferentialPrivacyPrivacyImpact == false)
            return false;
        DifferentialPrivacyPrivacyImpact other = (DifferentialPrivacyPrivacyImpact) obj;
        if (other.getAggregations() == null ^ this.getAggregations() == null)
            return false;
        if (other.getAggregations() != null && other.getAggregations().equals(this.getAggregations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregations() == null) ? 0 : getAggregations().hashCode());
        return hashCode;
    }

    @Override
    public DifferentialPrivacyPrivacyImpact clone() {
        try {
            return (DifferentialPrivacyPrivacyImpact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.DifferentialPrivacyPrivacyImpactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
