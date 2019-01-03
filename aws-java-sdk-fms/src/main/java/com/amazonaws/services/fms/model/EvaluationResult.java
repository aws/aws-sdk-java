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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the compliance status for the account. An account is considered non-compliant if it includes resources that
 * are not protected by the specified policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EvaluationResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if
     * it is not associated with the specified policy.
     * </p>
     */
    private Long violatorCount;
    /**
     * <p>
     * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     */
    private Boolean evaluationLimitExceeded;

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param complianceStatus
     *        Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * @see PolicyComplianceStatusType
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * </p>
     * 
     * @return Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * @see PolicyComplianceStatusType
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param complianceStatus
     *        Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyComplianceStatusType
     */

    public EvaluationResult withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param complianceStatus
     *        Describes an AWS account's compliance with the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyComplianceStatusType
     */

    public EvaluationResult withComplianceStatus(PolicyComplianceStatusType complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if
     * it is not associated with the specified policy.
     * </p>
     * 
     * @param violatorCount
     *        Number of resources that are non-compliant with the specified policy. A resource is considered
     *        non-compliant if it is not associated with the specified policy.
     */

    public void setViolatorCount(Long violatorCount) {
        this.violatorCount = violatorCount;
    }

    /**
     * <p>
     * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if
     * it is not associated with the specified policy.
     * </p>
     * 
     * @return Number of resources that are non-compliant with the specified policy. A resource is considered
     *         non-compliant if it is not associated with the specified policy.
     */

    public Long getViolatorCount() {
        return this.violatorCount;
    }

    /**
     * <p>
     * Number of resources that are non-compliant with the specified policy. A resource is considered non-compliant if
     * it is not associated with the specified policy.
     * </p>
     * 
     * @param violatorCount
     *        Number of resources that are non-compliant with the specified policy. A resource is considered
     *        non-compliant if it is not associated with the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withViolatorCount(Long violatorCount) {
        setViolatorCount(violatorCount);
        return this;
    }

    /**
     * <p>
     * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param evaluationLimitExceeded
     *        Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public void setEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @return Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public Boolean getEvaluationLimitExceeded() {
        return this.evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param evaluationLimitExceeded
     *        Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        setEvaluationLimitExceeded(evaluationLimitExceeded);
        return this;
    }

    /**
     * <p>
     * Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @return Indicates that over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public Boolean isEvaluationLimitExceeded() {
        return this.evaluationLimitExceeded;
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
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getViolatorCount() != null)
            sb.append("ViolatorCount: ").append(getViolatorCount()).append(",");
        if (getEvaluationLimitExceeded() != null)
            sb.append("EvaluationLimitExceeded: ").append(getEvaluationLimitExceeded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getViolatorCount() == null ^ this.getViolatorCount() == null)
            return false;
        if (other.getViolatorCount() != null && other.getViolatorCount().equals(this.getViolatorCount()) == false)
            return false;
        if (other.getEvaluationLimitExceeded() == null ^ this.getEvaluationLimitExceeded() == null)
            return false;
        if (other.getEvaluationLimitExceeded() != null && other.getEvaluationLimitExceeded().equals(this.getEvaluationLimitExceeded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getViolatorCount() == null) ? 0 : getViolatorCount().hashCode());
        hashCode = prime * hashCode + ((getEvaluationLimitExceeded() == null) ? 0 : getEvaluationLimitExceeded().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EvaluationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
