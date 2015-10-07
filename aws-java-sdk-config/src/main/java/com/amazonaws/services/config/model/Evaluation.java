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
 * Identifies an AWS resource and indicates whether it complies with the
 * AWS Config rule that it was evaluated against.
 * </p>
 */
public class Evaluation implements Serializable, Cloneable {

    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String complianceResourceType;

    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String complianceResourceId;

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     */
    private String complianceType;

    /**
     * Supplementary information about how the evaluation determined the
     * compliance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String annotation;

    /**
     * The time of the event in AWS Config that triggered the evaluation. For
     * event-based evaluations, the time indicates when AWS Config created
     * the configuration item that triggered the evaluation. For periodic
     * evaluations, the time indicates when AWS Config delivered the
     * configuration snapshot that triggered the evaluation.
     */
    private java.util.Date orderingTimestamp;

    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The type of AWS resource that was evaluated.
     */
    public String getComplianceResourceType() {
        return complianceResourceType;
    }
    
    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceType The type of AWS resource that was evaluated.
     */
    public void setComplianceResourceType(String complianceResourceType) {
        this.complianceResourceType = complianceResourceType;
    }
    
    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceType The type of AWS resource that was evaluated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withComplianceResourceType(String complianceResourceType) {
        this.complianceResourceType = complianceResourceType;
        return this;
    }

    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The ID of the AWS resource that was evaluated.
     */
    public String getComplianceResourceId() {
        return complianceResourceId;
    }
    
    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceId The ID of the AWS resource that was evaluated.
     */
    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }
    
    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param complianceResourceId The ID of the AWS resource that was evaluated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
        return this;
    }

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @return Indicates whether the AWS resource complies with the AWS Config rule
     *         that it was evaluated against.
     *
     * @see ComplianceType
     */
    public String getComplianceType() {
        return complianceType;
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that it was evaluated against.
     *
     * @see ComplianceType
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that it was evaluated against.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public Evaluation withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that it was evaluated against.
     *
     * @see ComplianceType
     */
    public void setComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that it was evaluated against.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that it was evaluated against.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public Evaluation withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * Supplementary information about how the evaluation determined the
     * compliance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Supplementary information about how the evaluation determined the
     *         compliance.
     */
    public String getAnnotation() {
        return annotation;
    }
    
    /**
     * Supplementary information about how the evaluation determined the
     * compliance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param annotation Supplementary information about how the evaluation determined the
     *         compliance.
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
    
    /**
     * Supplementary information about how the evaluation determined the
     * compliance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param annotation Supplementary information about how the evaluation determined the
     *         compliance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }

    /**
     * The time of the event in AWS Config that triggered the evaluation. For
     * event-based evaluations, the time indicates when AWS Config created
     * the configuration item that triggered the evaluation. For periodic
     * evaluations, the time indicates when AWS Config delivered the
     * configuration snapshot that triggered the evaluation.
     *
     * @return The time of the event in AWS Config that triggered the evaluation. For
     *         event-based evaluations, the time indicates when AWS Config created
     *         the configuration item that triggered the evaluation. For periodic
     *         evaluations, the time indicates when AWS Config delivered the
     *         configuration snapshot that triggered the evaluation.
     */
    public java.util.Date getOrderingTimestamp() {
        return orderingTimestamp;
    }
    
    /**
     * The time of the event in AWS Config that triggered the evaluation. For
     * event-based evaluations, the time indicates when AWS Config created
     * the configuration item that triggered the evaluation. For periodic
     * evaluations, the time indicates when AWS Config delivered the
     * configuration snapshot that triggered the evaluation.
     *
     * @param orderingTimestamp The time of the event in AWS Config that triggered the evaluation. For
     *         event-based evaluations, the time indicates when AWS Config created
     *         the configuration item that triggered the evaluation. For periodic
     *         evaluations, the time indicates when AWS Config delivered the
     *         configuration snapshot that triggered the evaluation.
     */
    public void setOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
    }
    
    /**
     * The time of the event in AWS Config that triggered the evaluation. For
     * event-based evaluations, the time indicates when AWS Config created
     * the configuration item that triggered the evaluation. For periodic
     * evaluations, the time indicates when AWS Config delivered the
     * configuration snapshot that triggered the evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param orderingTimestamp The time of the event in AWS Config that triggered the evaluation. For
     *         event-based evaluations, the time indicates when AWS Config created
     *         the configuration item that triggered the evaluation. For periodic
     *         evaluations, the time indicates when AWS Config delivered the
     *         configuration snapshot that triggered the evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Evaluation withOrderingTimestamp(java.util.Date orderingTimestamp) {
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
        if (getComplianceResourceType() != null) sb.append("ComplianceResourceType: " + getComplianceResourceType() + ",");
        if (getComplianceResourceId() != null) sb.append("ComplianceResourceId: " + getComplianceResourceId() + ",");
        if (getComplianceType() != null) sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getAnnotation() != null) sb.append("Annotation: " + getAnnotation() + ",");
        if (getOrderingTimestamp() != null) sb.append("OrderingTimestamp: " + getOrderingTimestamp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComplianceResourceType() == null) ? 0 : getComplianceResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceResourceId() == null) ? 0 : getComplianceResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode()); 
        hashCode = prime * hashCode + ((getAnnotation() == null) ? 0 : getAnnotation().hashCode()); 
        hashCode = prime * hashCode + ((getOrderingTimestamp() == null) ? 0 : getOrderingTimestamp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Evaluation == false) return false;
        Evaluation other = (Evaluation)obj;
        
        if (other.getComplianceResourceType() == null ^ this.getComplianceResourceType() == null) return false;
        if (other.getComplianceResourceType() != null && other.getComplianceResourceType().equals(this.getComplianceResourceType()) == false) return false; 
        if (other.getComplianceResourceId() == null ^ this.getComplianceResourceId() == null) return false;
        if (other.getComplianceResourceId() != null && other.getComplianceResourceId().equals(this.getComplianceResourceId()) == false) return false; 
        if (other.getComplianceType() == null ^ this.getComplianceType() == null) return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false) return false; 
        if (other.getAnnotation() == null ^ this.getAnnotation() == null) return false;
        if (other.getAnnotation() != null && other.getAnnotation().equals(this.getAnnotation()) == false) return false; 
        if (other.getOrderingTimestamp() == null ^ this.getOrderingTimestamp() == null) return false;
        if (other.getOrderingTimestamp() != null && other.getOrderingTimestamp().equals(this.getOrderingTimestamp()) == false) return false; 
        return true;
    }
    
    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    