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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resiliency score of each scoring component. For more information about scoring component, see <a
 * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/calculate-score.html">Calculating resiliency
 * score</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ScoringComponentResiliencyScore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScoringComponentResiliencyScore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of recommendations that were excluded from the assessment.
     * </p>
     * <p>
     * For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates that 7
     * Amazon CloudWatch alarms are excluded from the assessment.
     * </p>
     */
    private Long excludedCount;
    /**
     * <p>
     * Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     * component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented. For
     * compliance, these are the number of Application Components that have breached the resiliency policy.
     * </p>
     * <p>
     * For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates that 5
     * Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     * </p>
     */
    private Long outstandingCount;
    /**
     * <p>
     * Maximum possible score that can be obtained for the scoring component.
     * </p>
     * <p>
     * For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you can
     * achieve for the scoring component when you run a new assessment after implementing all the Resilience Hub
     * recommendations.
     * </p>
     */
    private Double possibleScore;
    /**
     * <p>
     * Resiliency score points given for the scoring component. The score is always less than or equal to the
     * <code>possibleScore</code>.
     * </p>
     */
    private Double score;

    /**
     * <p>
     * Number of recommendations that were excluded from the assessment.
     * </p>
     * <p>
     * For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates that 7
     * Amazon CloudWatch alarms are excluded from the assessment.
     * </p>
     * 
     * @param excludedCount
     *        Number of recommendations that were excluded from the assessment.</p>
     *        <p>
     *        For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates
     *        that 7 Amazon CloudWatch alarms are excluded from the assessment.
     */

    public void setExcludedCount(Long excludedCount) {
        this.excludedCount = excludedCount;
    }

    /**
     * <p>
     * Number of recommendations that were excluded from the assessment.
     * </p>
     * <p>
     * For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates that 7
     * Amazon CloudWatch alarms are excluded from the assessment.
     * </p>
     * 
     * @return Number of recommendations that were excluded from the assessment.</p>
     *         <p>
     *         For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates
     *         that 7 Amazon CloudWatch alarms are excluded from the assessment.
     */

    public Long getExcludedCount() {
        return this.excludedCount;
    }

    /**
     * <p>
     * Number of recommendations that were excluded from the assessment.
     * </p>
     * <p>
     * For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates that 7
     * Amazon CloudWatch alarms are excluded from the assessment.
     * </p>
     * 
     * @param excludedCount
     *        Number of recommendations that were excluded from the assessment.</p>
     *        <p>
     *        For example, if the <code>excludedCount</code> for Alarms coverage scoring component is 7, it indicates
     *        that 7 Amazon CloudWatch alarms are excluded from the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScoringComponentResiliencyScore withExcludedCount(Long excludedCount) {
        setExcludedCount(excludedCount);
        return this;
    }

    /**
     * <p>
     * Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     * component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented. For
     * compliance, these are the number of Application Components that have breached the resiliency policy.
     * </p>
     * <p>
     * For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates that 5
     * Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     * </p>
     * 
     * @param outstandingCount
     *        Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     *        component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented.
     *        For compliance, these are the number of Application Components that have breached the resiliency
     *        policy.</p>
     *        <p>
     *        For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates
     *        that 5 Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     */

    public void setOutstandingCount(Long outstandingCount) {
        this.outstandingCount = outstandingCount;
    }

    /**
     * <p>
     * Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     * component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented. For
     * compliance, these are the number of Application Components that have breached the resiliency policy.
     * </p>
     * <p>
     * For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates that 5
     * Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     * </p>
     * 
     * @return Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     *         component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented.
     *         For compliance, these are the number of Application Components that have breached the resiliency
     *         policy.</p>
     *         <p>
     *         For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it
     *         indicates that 5 Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     */

    public Long getOutstandingCount() {
        return this.outstandingCount;
    }

    /**
     * <p>
     * Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     * component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented. For
     * compliance, these are the number of Application Components that have breached the resiliency policy.
     * </p>
     * <p>
     * For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates that 5
     * Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     * </p>
     * 
     * @param outstandingCount
     *        Number of recommendations that must be implemented to obtain the maximum possible score for the scoring
     *        component. For SOPs, alarms, and tests, these are the number of recommendations that must be implemented.
     *        For compliance, these are the number of Application Components that have breached the resiliency
     *        policy.</p>
     *        <p>
     *        For example, if the <code>outstandingCount</code> for Alarms coverage scoring component is 5, it indicates
     *        that 5 Amazon CloudWatch alarms need to be implemented to achieve the maximum possible score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScoringComponentResiliencyScore withOutstandingCount(Long outstandingCount) {
        setOutstandingCount(outstandingCount);
        return this;
    }

    /**
     * <p>
     * Maximum possible score that can be obtained for the scoring component.
     * </p>
     * <p>
     * For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you can
     * achieve for the scoring component when you run a new assessment after implementing all the Resilience Hub
     * recommendations.
     * </p>
     * 
     * @param possibleScore
     *        Maximum possible score that can be obtained for the scoring component. </p>
     *        <p>
     *        For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you
     *        can achieve for the scoring component when you run a new assessment after implementing all the Resilience
     *        Hub recommendations.
     */

    public void setPossibleScore(Double possibleScore) {
        this.possibleScore = possibleScore;
    }

    /**
     * <p>
     * Maximum possible score that can be obtained for the scoring component.
     * </p>
     * <p>
     * For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you can
     * achieve for the scoring component when you run a new assessment after implementing all the Resilience Hub
     * recommendations.
     * </p>
     * 
     * @return Maximum possible score that can be obtained for the scoring component. </p>
     *         <p>
     *         For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you
     *         can achieve for the scoring component when you run a new assessment after implementing all the Resilience
     *         Hub recommendations.
     */

    public Double getPossibleScore() {
        return this.possibleScore;
    }

    /**
     * <p>
     * Maximum possible score that can be obtained for the scoring component.
     * </p>
     * <p>
     * For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you can
     * achieve for the scoring component when you run a new assessment after implementing all the Resilience Hub
     * recommendations.
     * </p>
     * 
     * @param possibleScore
     *        Maximum possible score that can be obtained for the scoring component. </p>
     *        <p>
     *        For example, if the <code>possibleScore</code> is 20 points, it indicates the maximum possible score you
     *        can achieve for the scoring component when you run a new assessment after implementing all the Resilience
     *        Hub recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScoringComponentResiliencyScore withPossibleScore(Double possibleScore) {
        setPossibleScore(possibleScore);
        return this;
    }

    /**
     * <p>
     * Resiliency score points given for the scoring component. The score is always less than or equal to the
     * <code>possibleScore</code>.
     * </p>
     * 
     * @param score
     *        Resiliency score points given for the scoring component. The score is always less than or equal to the
     *        <code>possibleScore</code>.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * Resiliency score points given for the scoring component. The score is always less than or equal to the
     * <code>possibleScore</code>.
     * </p>
     * 
     * @return Resiliency score points given for the scoring component. The score is always less than or equal to the
     *         <code>possibleScore</code>.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * Resiliency score points given for the scoring component. The score is always less than or equal to the
     * <code>possibleScore</code>.
     * </p>
     * 
     * @param score
     *        Resiliency score points given for the scoring component. The score is always less than or equal to the
     *        <code>possibleScore</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScoringComponentResiliencyScore withScore(Double score) {
        setScore(score);
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
        if (getExcludedCount() != null)
            sb.append("ExcludedCount: ").append(getExcludedCount()).append(",");
        if (getOutstandingCount() != null)
            sb.append("OutstandingCount: ").append(getOutstandingCount()).append(",");
        if (getPossibleScore() != null)
            sb.append("PossibleScore: ").append(getPossibleScore()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScoringComponentResiliencyScore == false)
            return false;
        ScoringComponentResiliencyScore other = (ScoringComponentResiliencyScore) obj;
        if (other.getExcludedCount() == null ^ this.getExcludedCount() == null)
            return false;
        if (other.getExcludedCount() != null && other.getExcludedCount().equals(this.getExcludedCount()) == false)
            return false;
        if (other.getOutstandingCount() == null ^ this.getOutstandingCount() == null)
            return false;
        if (other.getOutstandingCount() != null && other.getOutstandingCount().equals(this.getOutstandingCount()) == false)
            return false;
        if (other.getPossibleScore() == null ^ this.getPossibleScore() == null)
            return false;
        if (other.getPossibleScore() != null && other.getPossibleScore().equals(this.getPossibleScore()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludedCount() == null) ? 0 : getExcludedCount().hashCode());
        hashCode = prime * hashCode + ((getOutstandingCount() == null) ? 0 : getOutstandingCount().hashCode());
        hashCode = prime * hashCode + ((getPossibleScore() == null) ? 0 : getPossibleScore().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public ScoringComponentResiliencyScore clone() {
        try {
            return (ScoringComponentResiliencyScore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ScoringComponentResiliencyScoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
