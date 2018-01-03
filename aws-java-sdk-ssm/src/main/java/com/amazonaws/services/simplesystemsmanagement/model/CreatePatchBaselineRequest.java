/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePatchBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     */
    private PatchFilterGroup globalFilters;
    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     */
    private PatchRuleGroup approvalRules;
    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> approvedPatches;
    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     */
    private String approvedPatchesComplianceLevel;
    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rejectedPatches;
    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     * 
     * @param operatingSystem
     *        Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     * 
     * @return Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     * 
     * @param operatingSystem
     *        Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreatePatchBaselineRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     * 
     * @param operatingSystem
     *        Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * </p>
     * 
     * @param operatingSystem
     *        Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreatePatchBaselineRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param name
     *        The name of the patch baseline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @return The name of the patch baseline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * 
     * @param name
     *        The name of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to exclude patches from the baseline.
     */

    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @return A set of global filters used to exclude patches from the baseline.
     */

    public PatchFilterGroup getGlobalFilters() {
        return this.globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to exclude patches from the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to exclude patches from the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withGlobalFilters(PatchFilterGroup globalFilters) {
        setGlobalFilters(globalFilters);
        return this;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @param approvalRules
     *        A set of rules used to include patches in the baseline.
     */

    public void setApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @return A set of rules used to include patches in the baseline.
     */

    public PatchRuleGroup getApprovalRules() {
        return this.approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * 
     * @param approvalRules
     *        A set of rules used to include patches in the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withApprovalRules(PatchRuleGroup approvalRules) {
        setApprovalRules(approvalRules);
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @return A list of explicitly approved patches for the baseline.
     */

    public java.util.List<String> getApprovedPatches() {
        if (approvedPatches == null) {
            approvedPatches = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return approvedPatches;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     */

    public void setApprovedPatches(java.util.Collection<String> approvedPatches) {
        if (approvedPatches == null) {
            this.approvedPatches = null;
            return;
        }

        this.approvedPatches = new com.amazonaws.internal.SdkInternalList<String>(approvedPatches);
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovedPatches(java.util.Collection)} or {@link #withApprovedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withApprovedPatches(String... approvedPatches) {
        if (this.approvedPatches == null) {
            setApprovedPatches(new com.amazonaws.internal.SdkInternalList<String>(approvedPatches.length));
        }
        for (String ele : approvedPatches) {
            this.approvedPatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. Valid compliance severity levels include the
     *        following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     * 
     * @return Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *         missing, this is the severity of the compliance violation. Valid compliance severity levels include the
     *         following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. Valid compliance severity levels include the
     *        following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public CreatePatchBaselineRequest withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        setApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. Valid compliance severity levels include the
     *        following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        withApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. Valid compliance severity levels include the following:
     * CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. Valid compliance severity levels include the
     *        following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, UNSPECIFIED. The default value is UNSPECIFIED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public CreatePatchBaselineRequest withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @return A list of explicitly rejected patches for the baseline.
     */

    public java.util.List<String> getRejectedPatches() {
        if (rejectedPatches == null) {
            rejectedPatches = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return rejectedPatches;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     */

    public void setRejectedPatches(java.util.Collection<String> rejectedPatches) {
        if (rejectedPatches == null) {
            this.rejectedPatches = null;
            return;
        }

        this.rejectedPatches = new com.amazonaws.internal.SdkInternalList<String>(rejectedPatches);
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRejectedPatches(java.util.Collection)} or {@link #withRejectedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withRejectedPatches(String... rejectedPatches) {
        if (this.rejectedPatches == null) {
            setRejectedPatches(new com.amazonaws.internal.SdkInternalList<String>(rejectedPatches.length));
        }
        for (String ele : rejectedPatches) {
            this.rejectedPatches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withRejectedPatches(java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @param description
     *        A description of the patch baseline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @return A description of the patch baseline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * 
     * @param description
     *        A description of the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGlobalFilters() != null)
            sb.append("GlobalFilters: ").append(getGlobalFilters()).append(",");
        if (getApprovalRules() != null)
            sb.append("ApprovalRules: ").append(getApprovalRules()).append(",");
        if (getApprovedPatches() != null)
            sb.append("ApprovedPatches: ").append(getApprovedPatches()).append(",");
        if (getApprovedPatchesComplianceLevel() != null)
            sb.append("ApprovedPatchesComplianceLevel: ").append(getApprovedPatchesComplianceLevel()).append(",");
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: ").append(getRejectedPatches()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePatchBaselineRequest == false)
            return false;
        CreatePatchBaselineRequest other = (CreatePatchBaselineRequest) obj;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGlobalFilters() == null ^ this.getGlobalFilters() == null)
            return false;
        if (other.getGlobalFilters() != null && other.getGlobalFilters().equals(this.getGlobalFilters()) == false)
            return false;
        if (other.getApprovalRules() == null ^ this.getApprovalRules() == null)
            return false;
        if (other.getApprovalRules() != null && other.getApprovalRules().equals(this.getApprovalRules()) == false)
            return false;
        if (other.getApprovedPatches() == null ^ this.getApprovedPatches() == null)
            return false;
        if (other.getApprovedPatches() != null && other.getApprovedPatches().equals(this.getApprovedPatches()) == false)
            return false;
        if (other.getApprovedPatchesComplianceLevel() == null ^ this.getApprovedPatchesComplianceLevel() == null)
            return false;
        if (other.getApprovedPatchesComplianceLevel() != null
                && other.getApprovedPatchesComplianceLevel().equals(this.getApprovedPatchesComplianceLevel()) == false)
            return false;
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesComplianceLevel() == null) ? 0 : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreatePatchBaselineRequest clone() {
        return (CreatePatchBaselineRequest) super.clone();
    }

}
