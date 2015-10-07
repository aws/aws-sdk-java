/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * Uniquely identifies an evaluation result.
 * </p>
 */
public class EvaluationResultIdentifier implements Serializable, Cloneable {

    /**
     * Identifies an AWS Config rule used to evaluate an AWS resource, and
     * provides the type and ID of the evaluated resource.
     */
    private EvaluationResultQualifier evaluationResultQualifier;

    /**
     * The time of the event that triggered the evaluation of your AWS
     * resources. The time can indicate when AWS Config delivered a
     * configuration item change notification, or it can indicate when AWS
     * Config delivered the configuration snapshot, depending on which event
     * triggered the evaluation.
     */
    private java.util.Date orderingTimestamp;

    /**
     * Identifies an AWS Config rule used to evaluate an AWS resource, and
     * provides the type and ID of the evaluated resource.
     *
     * @return Identifies an AWS Config rule used to evaluate an AWS resource, and
     *         provides the type and ID of the evaluated resource.
     */
    public EvaluationResultQualifier getEvaluationResultQualifier() {
        return evaluationResultQualifier;
    }
    
    /**
     * Identifies an AWS Config rule used to evaluate an AWS resource, and
     * provides the type and ID of the evaluated resource.
     *
     * @param evaluationResultQualifier Identifies an AWS Config rule used to evaluate an AWS resource, and
     *         provides the type and ID of the evaluated resource.
     */
    public void setEvaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
        this.evaluationResultQualifier = evaluationResultQualifier;
    }
    
    /**
     * Identifies an AWS Config rule used to evaluate an AWS resource, and
     * provides the type and ID of the evaluated resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResultQualifier Identifies an AWS Config rule used to evaluate an AWS resource, and
     *         provides the type and ID of the evaluated resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResultIdentifier withEvaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
        this.evaluationResultQualifier = evaluationResultQualifier;
        return this;
    }

    /**
     * The time of the event that triggered the evaluation of your AWS
     * resources. The time can indicate when AWS Config delivered a
     * configuration item change notification, or it can indicate when AWS
     * Config delivered the configuration snapshot, depending on which event
     * triggered the evaluation.
     *
     * @return The time of the event that triggered the evaluation of your AWS
     *         resources. The time can indicate when AWS Config delivered a
     *         configuration item change notification, or it can indicate when AWS
     *         Config delivered the configuration snapshot, depending on which event
     *         triggered the evaluation.
     */
    public java.util.Date getOrderingTimestamp() {
        return orderingTimestamp;
    }
    
    /**
     * The time of the event that triggered the evaluation of your AWS
     * resources. The time can indicate when AWS Config delivered a
     * configuration item change notification, or it can indicate when AWS
     * Config delivered the configuration snapshot, depending on which event
     * triggered the evaluation.
     *
     * @param orderingTimestamp The time of the event that triggered the evaluation of your AWS
     *         resources. The time can indicate when AWS Config delivered a
     *         configuration item change notification, or it can indicate when AWS
     *         Config delivered the configuration snapshot, depending on which event
     *         triggered the evaluation.
     */
    public void setOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
    }
    
    /**
     * The time of the event that triggered the evaluation of your AWS
     * resources. The time can indicate when AWS Config delivered a
     * configuration item change notification, or it can indicate when AWS
     * Config delivered the configuration snapshot, depending on which event
     * triggered the evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderingTimestamp The time of the event that triggered the evaluation of your AWS
     *         resources. The time can indicate when AWS Config delivered a
     *         configuration item change notification, or it can indicate when AWS
     *         Config delivered the configuration snapshot, depending on which event
     *         triggered the evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResultIdentifier withOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvaluationResultQualifier() != null) sb.append("EvaluationResultQualifier: " + getEvaluationResultQualifier() + ",");
        if (getOrderingTimestamp() != null) sb.append("OrderingTimestamp: " + getOrderingTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationResultQualifier() == null) ? 0 : getEvaluationResultQualifier().hashCode()); 
        hashCode = prime * hashCode + ((getOrderingTimestamp() == null) ? 0 : getOrderingTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluationResultIdentifier == false) return false;
        EvaluationResultIdentifier other = (EvaluationResultIdentifier)obj;
        
        if (other.getEvaluationResultQualifier() == null ^ this.getEvaluationResultQualifier() == null) return false;
        if (other.getEvaluationResultQualifier() != null && other.getEvaluationResultQualifier().equals(this.getEvaluationResultQualifier()) == false) return false; 
        if (other.getOrderingTimestamp() == null ^ this.getOrderingTimestamp() == null) return false;
        if (other.getOrderingTimestamp() != null && other.getOrderingTimestamp().equals(this.getOrderingTimestamp()) == false) return false; 
        return true;
    }
    
    @Override
    public EvaluationResultIdentifier clone() {
        try {
            return (EvaluationResultIdentifier) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    