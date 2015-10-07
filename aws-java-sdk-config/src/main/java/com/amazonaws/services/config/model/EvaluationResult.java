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
 * The details of an AWS Config evaluation. Provides the AWS resource
 * that was evaluated, the compliance of the resource, related
 * timestamps, and supplementary information.
 * </p>
 */
public class EvaluationResult implements Serializable, Cloneable {

    /**
     * Uniquely identifies the evaluation result.
     */
    private EvaluationResultIdentifier evaluationResultIdentifier;

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     */
    private String complianceType;

    /**
     * The time when AWS Config recorded the evaluation result.
     */
    private java.util.Date resultRecordedTime;

    /**
     * The time when the AWS Config rule evaluated the AWS resource.
     */
    private java.util.Date configRuleInvokedTime;

    /**
     * Supplementary information about how the evaluation determined the
     * compliance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String annotation;

    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. The token identifies the rule, the AWS resource being evaluated,
     * and the event that triggered the evaluation.
     */
    private String resultToken;

    /**
     * Uniquely identifies the evaluation result.
     *
     * @return Uniquely identifies the evaluation result.
     */
    public EvaluationResultIdentifier getEvaluationResultIdentifier() {
        return evaluationResultIdentifier;
    }
    
    /**
     * Uniquely identifies the evaluation result.
     *
     * @param evaluationResultIdentifier Uniquely identifies the evaluation result.
     */
    public void setEvaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
        this.evaluationResultIdentifier = evaluationResultIdentifier;
    }
    
    /**
     * Uniquely identifies the evaluation result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param evaluationResultIdentifier Uniquely identifies the evaluation result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withEvaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
        this.evaluationResultIdentifier = evaluationResultIdentifier;
        return this;
    }

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @return Indicates whether the AWS resource complies with the AWS Config rule
     *         that evaluated it.
     *
     * @see ComplianceType
     */
    public String getComplianceType() {
        return complianceType;
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that evaluated it.
     *
     * @see ComplianceType
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that evaluated it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public EvaluationResult withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that evaluated it.
     *
     * @see ComplianceType
     */
    public void setComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
    }
    
    /**
     * Indicates whether the AWS resource complies with the AWS Config rule
     * that evaluated it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether the AWS resource complies with the AWS Config rule
     *         that evaluated it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public EvaluationResult withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * The time when AWS Config recorded the evaluation result.
     *
     * @return The time when AWS Config recorded the evaluation result.
     */
    public java.util.Date getResultRecordedTime() {
        return resultRecordedTime;
    }
    
    /**
     * The time when AWS Config recorded the evaluation result.
     *
     * @param resultRecordedTime The time when AWS Config recorded the evaluation result.
     */
    public void setResultRecordedTime(java.util.Date resultRecordedTime) {
        this.resultRecordedTime = resultRecordedTime;
    }
    
    /**
     * The time when AWS Config recorded the evaluation result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultRecordedTime The time when AWS Config recorded the evaluation result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withResultRecordedTime(java.util.Date resultRecordedTime) {
        this.resultRecordedTime = resultRecordedTime;
        return this;
    }

    /**
     * The time when the AWS Config rule evaluated the AWS resource.
     *
     * @return The time when the AWS Config rule evaluated the AWS resource.
     */
    public java.util.Date getConfigRuleInvokedTime() {
        return configRuleInvokedTime;
    }
    
    /**
     * The time when the AWS Config rule evaluated the AWS resource.
     *
     * @param configRuleInvokedTime The time when the AWS Config rule evaluated the AWS resource.
     */
    public void setConfigRuleInvokedTime(java.util.Date configRuleInvokedTime) {
        this.configRuleInvokedTime = configRuleInvokedTime;
    }
    
    /**
     * The time when the AWS Config rule evaluated the AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configRuleInvokedTime The time when the AWS Config rule evaluated the AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withConfigRuleInvokedTime(java.util.Date configRuleInvokedTime) {
        this.configRuleInvokedTime = configRuleInvokedTime;
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
    public EvaluationResult withAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }

    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. The token identifies the rule, the AWS resource being evaluated,
     * and the event that triggered the evaluation.
     *
     * @return An encrypted token that associates an evaluation with an AWS Config
     *         rule. The token identifies the rule, the AWS resource being evaluated,
     *         and the event that triggered the evaluation.
     */
    public String getResultToken() {
        return resultToken;
    }
    
    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. The token identifies the rule, the AWS resource being evaluated,
     * and the event that triggered the evaluation.
     *
     * @param resultToken An encrypted token that associates an evaluation with an AWS Config
     *         rule. The token identifies the rule, the AWS resource being evaluated,
     *         and the event that triggered the evaluation.
     */
    public void setResultToken(String resultToken) {
        this.resultToken = resultToken;
    }
    
    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. The token identifies the rule, the AWS resource being evaluated,
     * and the event that triggered the evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultToken An encrypted token that associates an evaluation with an AWS Config
     *         rule. The token identifies the rule, the AWS resource being evaluated,
     *         and the event that triggered the evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResult withResultToken(String resultToken) {
        this.resultToken = resultToken;
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
        if (getEvaluationResultIdentifier() != null) sb.append("EvaluationResultIdentifier: " + getEvaluationResultIdentifier() + ",");
        if (getComplianceType() != null) sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getResultRecordedTime() != null) sb.append("ResultRecordedTime: " + getResultRecordedTime() + ",");
        if (getConfigRuleInvokedTime() != null) sb.append("ConfigRuleInvokedTime: " + getConfigRuleInvokedTime() + ",");
        if (getAnnotation() != null) sb.append("Annotation: " + getAnnotation() + ",");
        if (getResultToken() != null) sb.append("ResultToken: " + getResultToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationResultIdentifier() == null) ? 0 : getEvaluationResultIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode()); 
        hashCode = prime * hashCode + ((getResultRecordedTime() == null) ? 0 : getResultRecordedTime().hashCode()); 
        hashCode = prime * hashCode + ((getConfigRuleInvokedTime() == null) ? 0 : getConfigRuleInvokedTime().hashCode()); 
        hashCode = prime * hashCode + ((getAnnotation() == null) ? 0 : getAnnotation().hashCode()); 
        hashCode = prime * hashCode + ((getResultToken() == null) ? 0 : getResultToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluationResult == false) return false;
        EvaluationResult other = (EvaluationResult)obj;
        
        if (other.getEvaluationResultIdentifier() == null ^ this.getEvaluationResultIdentifier() == null) return false;
        if (other.getEvaluationResultIdentifier() != null && other.getEvaluationResultIdentifier().equals(this.getEvaluationResultIdentifier()) == false) return false; 
        if (other.getComplianceType() == null ^ this.getComplianceType() == null) return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false) return false; 
        if (other.getResultRecordedTime() == null ^ this.getResultRecordedTime() == null) return false;
        if (other.getResultRecordedTime() != null && other.getResultRecordedTime().equals(this.getResultRecordedTime()) == false) return false; 
        if (other.getConfigRuleInvokedTime() == null ^ this.getConfigRuleInvokedTime() == null) return false;
        if (other.getConfigRuleInvokedTime() != null && other.getConfigRuleInvokedTime().equals(this.getConfigRuleInvokedTime()) == false) return false; 
        if (other.getAnnotation() == null ^ this.getAnnotation() == null) return false;
        if (other.getAnnotation() != null && other.getAnnotation().equals(this.getAnnotation()) == false) return false; 
        if (other.getResultToken() == null ^ this.getResultToken() == null) return false;
        if (other.getResultToken() != null && other.getResultToken().equals(this.getResultToken()) == false) return false; 
        return true;
    }
    
    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    