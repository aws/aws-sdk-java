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
 * Indicates whether an AWS resource or AWS Config rule is compliant and
 * provides the number of contributors that affect the compliance.
 * </p>
 */
public class Compliance implements Serializable, Cloneable {

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     */
    private String complianceType;

    /**
     * The number of AWS resources or AWS Config rules that cause a result of
     * <code>NON_COMPLIANT</code>, up to a maximum of 25.
     */
    private ComplianceContributorCount complianceContributorCount;

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @return Indicates whether an AWS resource or AWS Config rule is compliant.
     *         <p>A resource is compliant if it complies with all of the AWS Config
     *         rules that evaluate it, and it is noncompliant if it does not comply
     *         with one or more of these rules. <p>A rule is compliant if all of the
     *         resources that the rule evaluates comply with it, and it is
     *         noncompliant if any of these resources do not comply.
     *
     * @see ComplianceType
     */
    public String getComplianceType() {
        return complianceType;
    }
    
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether an AWS resource or AWS Config rule is compliant.
     *         <p>A resource is compliant if it complies with all of the AWS Config
     *         rules that evaluate it, and it is noncompliant if it does not comply
     *         with one or more of these rules. <p>A rule is compliant if all of the
     *         resources that the rule evaluates comply with it, and it is
     *         noncompliant if any of these resources do not comply.
     *
     * @see ComplianceType
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }
    
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether an AWS resource or AWS Config rule is compliant.
     *         <p>A resource is compliant if it complies with all of the AWS Config
     *         rules that evaluate it, and it is noncompliant if it does not comply
     *         with one or more of these rules. <p>A rule is compliant if all of the
     *         resources that the rule evaluates comply with it, and it is
     *         noncompliant if any of these resources do not comply.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public Compliance withComplianceType(String complianceType) {
        this.complianceType = complianceType;
        return this;
    }

    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether an AWS resource or AWS Config rule is compliant.
     *         <p>A resource is compliant if it complies with all of the AWS Config
     *         rules that evaluate it, and it is noncompliant if it does not comply
     *         with one or more of these rules. <p>A rule is compliant if all of the
     *         resources that the rule evaluates comply with it, and it is
     *         noncompliant if any of these resources do not comply.
     *
     * @see ComplianceType
     */
    public void setComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
    }
    
    /**
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * <p>A resource is compliant if it complies with all of the AWS Config
     * rules that evaluate it, and it is noncompliant if it does not comply
     * with one or more of these rules. <p>A rule is compliant if all of the
     * resources that the rule evaluates comply with it, and it is
     * noncompliant if any of these resources do not comply.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLIANT, NON_COMPLIANT, NOT_APPLICABLE, INSUFFICIENT_DATA
     *
     * @param complianceType Indicates whether an AWS resource or AWS Config rule is compliant.
     *         <p>A resource is compliant if it complies with all of the AWS Config
     *         rules that evaluate it, and it is noncompliant if it does not comply
     *         with one or more of these rules. <p>A rule is compliant if all of the
     *         resources that the rule evaluates comply with it, and it is
     *         noncompliant if any of these resources do not comply.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ComplianceType
     */
    public Compliance withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * The number of AWS resources or AWS Config rules that cause a result of
     * <code>NON_COMPLIANT</code>, up to a maximum of 25.
     *
     * @return The number of AWS resources or AWS Config rules that cause a result of
     *         <code>NON_COMPLIANT</code>, up to a maximum of 25.
     */
    public ComplianceContributorCount getComplianceContributorCount() {
        return complianceContributorCount;
    }
    
    /**
     * The number of AWS resources or AWS Config rules that cause a result of
     * <code>NON_COMPLIANT</code>, up to a maximum of 25.
     *
     * @param complianceContributorCount The number of AWS resources or AWS Config rules that cause a result of
     *         <code>NON_COMPLIANT</code>, up to a maximum of 25.
     */
    public void setComplianceContributorCount(ComplianceContributorCount complianceContributorCount) {
        this.complianceContributorCount = complianceContributorCount;
    }
    
    /**
     * The number of AWS resources or AWS Config rules that cause a result of
     * <code>NON_COMPLIANT</code>, up to a maximum of 25.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param complianceContributorCount The number of AWS resources or AWS Config rules that cause a result of
     *         <code>NON_COMPLIANT</code>, up to a maximum of 25.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Compliance withComplianceContributorCount(ComplianceContributorCount complianceContributorCount) {
        this.complianceContributorCount = complianceContributorCount;
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
        if (getComplianceType() != null) sb.append("ComplianceType: " + getComplianceType() + ",");
        if (getComplianceContributorCount() != null) sb.append("ComplianceContributorCount: " + getComplianceContributorCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode()); 
        hashCode = prime * hashCode + ((getComplianceContributorCount() == null) ? 0 : getComplianceContributorCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Compliance == false) return false;
        Compliance other = (Compliance)obj;
        
        if (other.getComplianceType() == null ^ this.getComplianceType() == null) return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false) return false; 
        if (other.getComplianceContributorCount() == null ^ this.getComplianceContributorCount() == null) return false;
        if (other.getComplianceContributorCount() != null && other.getComplianceContributorCount().equals(this.getComplianceContributorCount()) == false) return false; 
        return true;
    }
    
    @Override
    public Compliance clone() {
        try {
            return (Compliance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    