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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the characteristic sets generated in the statistics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/StatisticsSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatisticsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of signatures across all characteristic sets.
     * </p>
     */
    private Integer signatureCount;
    /**
     * <p>
     * The total number of characteristic-set instances.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The total number of unique predicates.
     * </p>
     */
    private Integer predicateCount;

    /**
     * <p>
     * The total number of signatures across all characteristic sets.
     * </p>
     * 
     * @param signatureCount
     *        The total number of signatures across all characteristic sets.
     */

    public void setSignatureCount(Integer signatureCount) {
        this.signatureCount = signatureCount;
    }

    /**
     * <p>
     * The total number of signatures across all characteristic sets.
     * </p>
     * 
     * @return The total number of signatures across all characteristic sets.
     */

    public Integer getSignatureCount() {
        return this.signatureCount;
    }

    /**
     * <p>
     * The total number of signatures across all characteristic sets.
     * </p>
     * 
     * @param signatureCount
     *        The total number of signatures across all characteristic sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsSummary withSignatureCount(Integer signatureCount) {
        setSignatureCount(signatureCount);
        return this;
    }

    /**
     * <p>
     * The total number of characteristic-set instances.
     * </p>
     * 
     * @param instanceCount
     *        The total number of characteristic-set instances.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The total number of characteristic-set instances.
     * </p>
     * 
     * @return The total number of characteristic-set instances.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The total number of characteristic-set instances.
     * </p>
     * 
     * @param instanceCount
     *        The total number of characteristic-set instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsSummary withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The total number of unique predicates.
     * </p>
     * 
     * @param predicateCount
     *        The total number of unique predicates.
     */

    public void setPredicateCount(Integer predicateCount) {
        this.predicateCount = predicateCount;
    }

    /**
     * <p>
     * The total number of unique predicates.
     * </p>
     * 
     * @return The total number of unique predicates.
     */

    public Integer getPredicateCount() {
        return this.predicateCount;
    }

    /**
     * <p>
     * The total number of unique predicates.
     * </p>
     * 
     * @param predicateCount
     *        The total number of unique predicates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatisticsSummary withPredicateCount(Integer predicateCount) {
        setPredicateCount(predicateCount);
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
        if (getSignatureCount() != null)
            sb.append("SignatureCount: ").append(getSignatureCount()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getPredicateCount() != null)
            sb.append("PredicateCount: ").append(getPredicateCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatisticsSummary == false)
            return false;
        StatisticsSummary other = (StatisticsSummary) obj;
        if (other.getSignatureCount() == null ^ this.getSignatureCount() == null)
            return false;
        if (other.getSignatureCount() != null && other.getSignatureCount().equals(this.getSignatureCount()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getPredicateCount() == null ^ this.getPredicateCount() == null)
            return false;
        if (other.getPredicateCount() != null && other.getPredicateCount().equals(this.getPredicateCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignatureCount() == null) ? 0 : getSignatureCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getPredicateCount() == null) ? 0 : getPredicateCount().hashCode());
        return hashCode;
    }

    @Override
    public StatisticsSummary clone() {
        try {
            return (StatisticsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.StatisticsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
