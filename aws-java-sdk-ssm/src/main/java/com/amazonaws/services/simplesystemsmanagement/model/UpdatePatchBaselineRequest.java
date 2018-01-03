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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePatchBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the patch baseline to update.
     * </p>
     */
    private String baselineId;
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
     * Assigns a new compliance severity level to an existing patch baseline.
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
     * The ID of the patch baseline to update.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline to update.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to update.
     * </p>
     * 
     * @return The ID of the patch baseline to update.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the patch baseline to update.
     * </p>
     * 
     * @param baselineId
     *        The ID of the patch baseline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineRequest withBaselineId(String baselineId) {
        setBaselineId(baselineId);
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

    public UpdatePatchBaselineRequest withName(String name) {
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

    public UpdatePatchBaselineRequest withGlobalFilters(PatchFilterGroup globalFilters) {
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

    public UpdatePatchBaselineRequest withApprovalRules(PatchRuleGroup approvalRules) {
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

    public UpdatePatchBaselineRequest withApprovedPatches(String... approvedPatches) {
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

    public UpdatePatchBaselineRequest withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Assigns a new compliance severity level to an existing patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Assigns a new compliance severity level to an existing patch baseline.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Assigns a new compliance severity level to an existing patch baseline.
     * </p>
     * 
     * @return Assigns a new compliance severity level to an existing patch baseline.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Assigns a new compliance severity level to an existing patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Assigns a new compliance severity level to an existing patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public UpdatePatchBaselineRequest withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        setApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
        return this;
    }

    /**
     * <p>
     * Assigns a new compliance severity level to an existing patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Assigns a new compliance severity level to an existing patch baseline.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        withApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
    }

    /**
     * <p>
     * Assigns a new compliance severity level to an existing patch baseline.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Assigns a new compliance severity level to an existing patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public UpdatePatchBaselineRequest withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
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

    public UpdatePatchBaselineRequest withRejectedPatches(String... rejectedPatches) {
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

    public UpdatePatchBaselineRequest withRejectedPatches(java.util.Collection<String> rejectedPatches) {
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

    public UpdatePatchBaselineRequest withDescription(String description) {
        setDescription(description);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
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
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePatchBaselineRequest == false)
            return false;
        UpdatePatchBaselineRequest other = (UpdatePatchBaselineRequest) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesComplianceLevel() == null) ? 0 : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePatchBaselineRequest clone() {
        return (UpdatePatchBaselineRequest) super.clone();
    }

}
