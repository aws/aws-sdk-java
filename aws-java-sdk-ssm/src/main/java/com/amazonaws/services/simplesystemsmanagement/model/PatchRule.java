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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an approval rule for a patch baseline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PatchRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     */
    private PatchFilterGroup patchFilterGroup;
    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     */
    private String complianceLevel;
    /**
     * <p>
     * The number of days after the release date of each patch matched by the rule that the patch is marked as approved
     * in the patch baseline. For example, a value of <code>7</code> means that patches are approved seven days after
     * they are released.
     * </p>
     */
    private Integer approveAfterDays;
    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates
     * available in the specified repository. The default value is 'false'. Applies to Linux instances only.
     * </p>
     */
    private Boolean enableNonSecurity;

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     * 
     * @param patchFilterGroup
     *        The patch filter group that defines the criteria for the rule.
     */

    public void setPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
    }

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     * 
     * @return The patch filter group that defines the criteria for the rule.
     */

    public PatchFilterGroup getPatchFilterGroup() {
        return this.patchFilterGroup;
    }

    /**
     * <p>
     * The patch filter group that defines the criteria for the rule.
     * </p>
     * 
     * @param patchFilterGroup
     *        The patch filter group that defines the criteria for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchRule withPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        setPatchFilterGroup(patchFilterGroup);
        return this;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     * 
     * @param complianceLevel
     *        A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     *        include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * @see PatchComplianceLevel
     */

    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     * 
     * @return A compliance severity level for all approved patches in a patch baseline. Valid compliance severity
     *         levels include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * @see PatchComplianceLevel
     */

    public String getComplianceLevel() {
        return this.complianceLevel;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     * 
     * @param complianceLevel
     *        A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     *        include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public PatchRule withComplianceLevel(String complianceLevel) {
        setComplianceLevel(complianceLevel);
        return this;
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     * 
     * @param complianceLevel
     *        A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     *        include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * @see PatchComplianceLevel
     */

    public void setComplianceLevel(PatchComplianceLevel complianceLevel) {
        withComplianceLevel(complianceLevel);
    }

    /**
     * <p>
     * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     * include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * </p>
     * 
     * @param complianceLevel
     *        A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels
     *        include the following: Unspecified, Critical, High, Medium, Low, and Informational.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public PatchRule withComplianceLevel(PatchComplianceLevel complianceLevel) {
        this.complianceLevel = complianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the rule that the patch is marked as approved
     * in the patch baseline. For example, a value of <code>7</code> means that patches are approved seven days after
     * they are released.
     * </p>
     * 
     * @param approveAfterDays
     *        The number of days after the release date of each patch matched by the rule that the patch is marked as
     *        approved in the patch baseline. For example, a value of <code>7</code> means that patches are approved
     *        seven days after they are released.
     */

    public void setApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the rule that the patch is marked as approved
     * in the patch baseline. For example, a value of <code>7</code> means that patches are approved seven days after
     * they are released.
     * </p>
     * 
     * @return The number of days after the release date of each patch matched by the rule that the patch is marked as
     *         approved in the patch baseline. For example, a value of <code>7</code> means that patches are approved
     *         seven days after they are released.
     */

    public Integer getApproveAfterDays() {
        return this.approveAfterDays;
    }

    /**
     * <p>
     * The number of days after the release date of each patch matched by the rule that the patch is marked as approved
     * in the patch baseline. For example, a value of <code>7</code> means that patches are approved seven days after
     * they are released.
     * </p>
     * 
     * @param approveAfterDays
     *        The number of days after the release date of each patch matched by the rule that the patch is marked as
     *        approved in the patch baseline. For example, a value of <code>7</code> means that patches are approved
     *        seven days after they are released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchRule withApproveAfterDays(Integer approveAfterDays) {
        setApproveAfterDays(approveAfterDays);
        return this;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates
     * available in the specified repository. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @param enableNonSecurity
     *        For instances identified by the approval rule filters, enables a patch baseline to apply non-security
     *        updates available in the specified repository. The default value is 'false'. Applies to Linux instances
     *        only.
     */

    public void setEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates
     * available in the specified repository. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @return For instances identified by the approval rule filters, enables a patch baseline to apply non-security
     *         updates available in the specified repository. The default value is 'false'. Applies to Linux instances
     *         only.
     */

    public Boolean getEnableNonSecurity() {
        return this.enableNonSecurity;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates
     * available in the specified repository. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @param enableNonSecurity
     *        For instances identified by the approval rule filters, enables a patch baseline to apply non-security
     *        updates available in the specified repository. The default value is 'false'. Applies to Linux instances
     *        only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchRule withEnableNonSecurity(Boolean enableNonSecurity) {
        setEnableNonSecurity(enableNonSecurity);
        return this;
    }

    /**
     * <p>
     * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates
     * available in the specified repository. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @return For instances identified by the approval rule filters, enables a patch baseline to apply non-security
     *         updates available in the specified repository. The default value is 'false'. Applies to Linux instances
     *         only.
     */

    public Boolean isEnableNonSecurity() {
        return this.enableNonSecurity;
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
        if (getPatchFilterGroup() != null)
            sb.append("PatchFilterGroup: ").append(getPatchFilterGroup()).append(",");
        if (getComplianceLevel() != null)
            sb.append("ComplianceLevel: ").append(getComplianceLevel()).append(",");
        if (getApproveAfterDays() != null)
            sb.append("ApproveAfterDays: ").append(getApproveAfterDays()).append(",");
        if (getEnableNonSecurity() != null)
            sb.append("EnableNonSecurity: ").append(getEnableNonSecurity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchRule == false)
            return false;
        PatchRule other = (PatchRule) obj;
        if (other.getPatchFilterGroup() == null ^ this.getPatchFilterGroup() == null)
            return false;
        if (other.getPatchFilterGroup() != null && other.getPatchFilterGroup().equals(this.getPatchFilterGroup()) == false)
            return false;
        if (other.getComplianceLevel() == null ^ this.getComplianceLevel() == null)
            return false;
        if (other.getComplianceLevel() != null && other.getComplianceLevel().equals(this.getComplianceLevel()) == false)
            return false;
        if (other.getApproveAfterDays() == null ^ this.getApproveAfterDays() == null)
            return false;
        if (other.getApproveAfterDays() != null && other.getApproveAfterDays().equals(this.getApproveAfterDays()) == false)
            return false;
        if (other.getEnableNonSecurity() == null ^ this.getEnableNonSecurity() == null)
            return false;
        if (other.getEnableNonSecurity() != null && other.getEnableNonSecurity().equals(this.getEnableNonSecurity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPatchFilterGroup() == null) ? 0 : getPatchFilterGroup().hashCode());
        hashCode = prime * hashCode + ((getComplianceLevel() == null) ? 0 : getComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getApproveAfterDays() == null) ? 0 : getApproveAfterDays().hashCode());
        hashCode = prime * hashCode + ((getEnableNonSecurity() == null) ? 0 : getEnableNonSecurity().hashCode());
        return hashCode;
    }

    @Override
    public PatchRule clone() {
        try {
            return (PatchRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.PatchRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
