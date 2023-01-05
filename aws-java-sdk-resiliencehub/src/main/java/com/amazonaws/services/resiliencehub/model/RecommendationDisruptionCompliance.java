/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Defines a disruption compliance recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/RecommendationDisruptionCompliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDisruptionCompliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expected compliance status after applying the recommended configuration change.
     * </p>
     */
    private String expectedComplianceStatus;
    /**
     * <p>
     * The expected Recovery Point Objective (RPO) description after applying the recommended configuration change.
     * </p>
     */
    private String expectedRpoDescription;
    /**
     * <p>
     * The expected RPO after applying the recommended configuration change.
     * </p>
     */
    private Integer expectedRpoInSecs;
    /**
     * <p>
     * The expected Recovery Time Objective (RTO) description after applying the recommended configuration change.
     * </p>
     */
    private String expectedRtoDescription;
    /**
     * <p>
     * The expected RTO after applying the recommended configuration change.
     * </p>
     */
    private Integer expectedRtoInSecs;

    /**
     * <p>
     * The expected compliance status after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedComplianceStatus
     *        The expected compliance status after applying the recommended configuration change.
     * @see ComplianceStatus
     */

    public void setExpectedComplianceStatus(String expectedComplianceStatus) {
        this.expectedComplianceStatus = expectedComplianceStatus;
    }

    /**
     * <p>
     * The expected compliance status after applying the recommended configuration change.
     * </p>
     * 
     * @return The expected compliance status after applying the recommended configuration change.
     * @see ComplianceStatus
     */

    public String getExpectedComplianceStatus() {
        return this.expectedComplianceStatus;
    }

    /**
     * <p>
     * The expected compliance status after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedComplianceStatus
     *        The expected compliance status after applying the recommended configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public RecommendationDisruptionCompliance withExpectedComplianceStatus(String expectedComplianceStatus) {
        setExpectedComplianceStatus(expectedComplianceStatus);
        return this;
    }

    /**
     * <p>
     * The expected compliance status after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedComplianceStatus
     *        The expected compliance status after applying the recommended configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public RecommendationDisruptionCompliance withExpectedComplianceStatus(ComplianceStatus expectedComplianceStatus) {
        this.expectedComplianceStatus = expectedComplianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The expected Recovery Point Objective (RPO) description after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRpoDescription
     *        The expected Recovery Point Objective (RPO) description after applying the recommended configuration
     *        change.
     */

    public void setExpectedRpoDescription(String expectedRpoDescription) {
        this.expectedRpoDescription = expectedRpoDescription;
    }

    /**
     * <p>
     * The expected Recovery Point Objective (RPO) description after applying the recommended configuration change.
     * </p>
     * 
     * @return The expected Recovery Point Objective (RPO) description after applying the recommended configuration
     *         change.
     */

    public String getExpectedRpoDescription() {
        return this.expectedRpoDescription;
    }

    /**
     * <p>
     * The expected Recovery Point Objective (RPO) description after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRpoDescription
     *        The expected Recovery Point Objective (RPO) description after applying the recommended configuration
     *        change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDisruptionCompliance withExpectedRpoDescription(String expectedRpoDescription) {
        setExpectedRpoDescription(expectedRpoDescription);
        return this;
    }

    /**
     * <p>
     * The expected RPO after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRpoInSecs
     *        The expected RPO after applying the recommended configuration change.
     */

    public void setExpectedRpoInSecs(Integer expectedRpoInSecs) {
        this.expectedRpoInSecs = expectedRpoInSecs;
    }

    /**
     * <p>
     * The expected RPO after applying the recommended configuration change.
     * </p>
     * 
     * @return The expected RPO after applying the recommended configuration change.
     */

    public Integer getExpectedRpoInSecs() {
        return this.expectedRpoInSecs;
    }

    /**
     * <p>
     * The expected RPO after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRpoInSecs
     *        The expected RPO after applying the recommended configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDisruptionCompliance withExpectedRpoInSecs(Integer expectedRpoInSecs) {
        setExpectedRpoInSecs(expectedRpoInSecs);
        return this;
    }

    /**
     * <p>
     * The expected Recovery Time Objective (RTO) description after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRtoDescription
     *        The expected Recovery Time Objective (RTO) description after applying the recommended configuration
     *        change.
     */

    public void setExpectedRtoDescription(String expectedRtoDescription) {
        this.expectedRtoDescription = expectedRtoDescription;
    }

    /**
     * <p>
     * The expected Recovery Time Objective (RTO) description after applying the recommended configuration change.
     * </p>
     * 
     * @return The expected Recovery Time Objective (RTO) description after applying the recommended configuration
     *         change.
     */

    public String getExpectedRtoDescription() {
        return this.expectedRtoDescription;
    }

    /**
     * <p>
     * The expected Recovery Time Objective (RTO) description after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRtoDescription
     *        The expected Recovery Time Objective (RTO) description after applying the recommended configuration
     *        change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDisruptionCompliance withExpectedRtoDescription(String expectedRtoDescription) {
        setExpectedRtoDescription(expectedRtoDescription);
        return this;
    }

    /**
     * <p>
     * The expected RTO after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRtoInSecs
     *        The expected RTO after applying the recommended configuration change.
     */

    public void setExpectedRtoInSecs(Integer expectedRtoInSecs) {
        this.expectedRtoInSecs = expectedRtoInSecs;
    }

    /**
     * <p>
     * The expected RTO after applying the recommended configuration change.
     * </p>
     * 
     * @return The expected RTO after applying the recommended configuration change.
     */

    public Integer getExpectedRtoInSecs() {
        return this.expectedRtoInSecs;
    }

    /**
     * <p>
     * The expected RTO after applying the recommended configuration change.
     * </p>
     * 
     * @param expectedRtoInSecs
     *        The expected RTO after applying the recommended configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationDisruptionCompliance withExpectedRtoInSecs(Integer expectedRtoInSecs) {
        setExpectedRtoInSecs(expectedRtoInSecs);
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
        if (getExpectedComplianceStatus() != null)
            sb.append("ExpectedComplianceStatus: ").append(getExpectedComplianceStatus()).append(",");
        if (getExpectedRpoDescription() != null)
            sb.append("ExpectedRpoDescription: ").append(getExpectedRpoDescription()).append(",");
        if (getExpectedRpoInSecs() != null)
            sb.append("ExpectedRpoInSecs: ").append(getExpectedRpoInSecs()).append(",");
        if (getExpectedRtoDescription() != null)
            sb.append("ExpectedRtoDescription: ").append(getExpectedRtoDescription()).append(",");
        if (getExpectedRtoInSecs() != null)
            sb.append("ExpectedRtoInSecs: ").append(getExpectedRtoInSecs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationDisruptionCompliance == false)
            return false;
        RecommendationDisruptionCompliance other = (RecommendationDisruptionCompliance) obj;
        if (other.getExpectedComplianceStatus() == null ^ this.getExpectedComplianceStatus() == null)
            return false;
        if (other.getExpectedComplianceStatus() != null && other.getExpectedComplianceStatus().equals(this.getExpectedComplianceStatus()) == false)
            return false;
        if (other.getExpectedRpoDescription() == null ^ this.getExpectedRpoDescription() == null)
            return false;
        if (other.getExpectedRpoDescription() != null && other.getExpectedRpoDescription().equals(this.getExpectedRpoDescription()) == false)
            return false;
        if (other.getExpectedRpoInSecs() == null ^ this.getExpectedRpoInSecs() == null)
            return false;
        if (other.getExpectedRpoInSecs() != null && other.getExpectedRpoInSecs().equals(this.getExpectedRpoInSecs()) == false)
            return false;
        if (other.getExpectedRtoDescription() == null ^ this.getExpectedRtoDescription() == null)
            return false;
        if (other.getExpectedRtoDescription() != null && other.getExpectedRtoDescription().equals(this.getExpectedRtoDescription()) == false)
            return false;
        if (other.getExpectedRtoInSecs() == null ^ this.getExpectedRtoInSecs() == null)
            return false;
        if (other.getExpectedRtoInSecs() != null && other.getExpectedRtoInSecs().equals(this.getExpectedRtoInSecs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpectedComplianceStatus() == null) ? 0 : getExpectedComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getExpectedRpoDescription() == null) ? 0 : getExpectedRpoDescription().hashCode());
        hashCode = prime * hashCode + ((getExpectedRpoInSecs() == null) ? 0 : getExpectedRpoInSecs().hashCode());
        hashCode = prime * hashCode + ((getExpectedRtoDescription() == null) ? 0 : getExpectedRtoDescription().hashCode());
        hashCode = prime * hashCode + ((getExpectedRtoInSecs() == null) ? 0 : getExpectedRtoInSecs().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationDisruptionCompliance clone() {
        try {
            return (RecommendationDisruptionCompliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.RecommendationDisruptionComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
