/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The VPC that Firewall Manager was applying a DNS Fireall policy to reached the limit for associated DNS Firewall rule
 * groups. Firewall Manager tried to associate another rule group with the VPC and failed due to the limit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DnsRuleGroupLimitExceededViolation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRuleGroupLimitExceededViolation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     */
    private String violationTarget;
    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     */
    private String violationTargetDescription;
    /**
     * <p>
     * The number of rule groups currently associated with the VPC.
     * </p>
     */
    private Integer numberOfRuleGroupsAlreadyAssociated;

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param violationTarget
     *        Information about the VPC ID.
     */

    public void setViolationTarget(String violationTarget) {
        this.violationTarget = violationTarget;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @return Information about the VPC ID.
     */

    public String getViolationTarget() {
        return this.violationTarget;
    }

    /**
     * <p>
     * Information about the VPC ID.
     * </p>
     * 
     * @param violationTarget
     *        Information about the VPC ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupLimitExceededViolation withViolationTarget(String violationTarget) {
        setViolationTarget(violationTarget);
        return this;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the rule group and VPC.
     */

    public void setViolationTargetDescription(String violationTargetDescription) {
        this.violationTargetDescription = violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @return A description of the violation that specifies the rule group and VPC.
     */

    public String getViolationTargetDescription() {
        return this.violationTargetDescription;
    }

    /**
     * <p>
     * A description of the violation that specifies the rule group and VPC.
     * </p>
     * 
     * @param violationTargetDescription
     *        A description of the violation that specifies the rule group and VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupLimitExceededViolation withViolationTargetDescription(String violationTargetDescription) {
        setViolationTargetDescription(violationTargetDescription);
        return this;
    }

    /**
     * <p>
     * The number of rule groups currently associated with the VPC.
     * </p>
     * 
     * @param numberOfRuleGroupsAlreadyAssociated
     *        The number of rule groups currently associated with the VPC.
     */

    public void setNumberOfRuleGroupsAlreadyAssociated(Integer numberOfRuleGroupsAlreadyAssociated) {
        this.numberOfRuleGroupsAlreadyAssociated = numberOfRuleGroupsAlreadyAssociated;
    }

    /**
     * <p>
     * The number of rule groups currently associated with the VPC.
     * </p>
     * 
     * @return The number of rule groups currently associated with the VPC.
     */

    public Integer getNumberOfRuleGroupsAlreadyAssociated() {
        return this.numberOfRuleGroupsAlreadyAssociated;
    }

    /**
     * <p>
     * The number of rule groups currently associated with the VPC.
     * </p>
     * 
     * @param numberOfRuleGroupsAlreadyAssociated
     *        The number of rule groups currently associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRuleGroupLimitExceededViolation withNumberOfRuleGroupsAlreadyAssociated(Integer numberOfRuleGroupsAlreadyAssociated) {
        setNumberOfRuleGroupsAlreadyAssociated(numberOfRuleGroupsAlreadyAssociated);
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
        if (getViolationTarget() != null)
            sb.append("ViolationTarget: ").append(getViolationTarget()).append(",");
        if (getViolationTargetDescription() != null)
            sb.append("ViolationTargetDescription: ").append(getViolationTargetDescription()).append(",");
        if (getNumberOfRuleGroupsAlreadyAssociated() != null)
            sb.append("NumberOfRuleGroupsAlreadyAssociated: ").append(getNumberOfRuleGroupsAlreadyAssociated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRuleGroupLimitExceededViolation == false)
            return false;
        DnsRuleGroupLimitExceededViolation other = (DnsRuleGroupLimitExceededViolation) obj;
        if (other.getViolationTarget() == null ^ this.getViolationTarget() == null)
            return false;
        if (other.getViolationTarget() != null && other.getViolationTarget().equals(this.getViolationTarget()) == false)
            return false;
        if (other.getViolationTargetDescription() == null ^ this.getViolationTargetDescription() == null)
            return false;
        if (other.getViolationTargetDescription() != null && other.getViolationTargetDescription().equals(this.getViolationTargetDescription()) == false)
            return false;
        if (other.getNumberOfRuleGroupsAlreadyAssociated() == null ^ this.getNumberOfRuleGroupsAlreadyAssociated() == null)
            return false;
        if (other.getNumberOfRuleGroupsAlreadyAssociated() != null
                && other.getNumberOfRuleGroupsAlreadyAssociated().equals(this.getNumberOfRuleGroupsAlreadyAssociated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationTarget() == null) ? 0 : getViolationTarget().hashCode());
        hashCode = prime * hashCode + ((getViolationTargetDescription() == null) ? 0 : getViolationTargetDescription().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRuleGroupsAlreadyAssociated() == null) ? 0 : getNumberOfRuleGroupsAlreadyAssociated().hashCode());
        return hashCode;
    }

    @Override
    public DnsRuleGroupLimitExceededViolation clone() {
        try {
            return (DnsRuleGroupLimitExceededViolation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.DnsRuleGroupLimitExceededViolationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
