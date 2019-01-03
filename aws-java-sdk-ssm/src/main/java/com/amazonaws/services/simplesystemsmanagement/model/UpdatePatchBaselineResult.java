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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePatchBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the deleted patch baseline.
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
     * The operating system rule used by the updated patch baseline.
     * </p>
     */
    private String operatingSystem;
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
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     */
    private String approvedPatchesComplianceLevel;
    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     */
    private Boolean approvedPatchesEnableNonSecurity;
    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rejectedPatches;
    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     */
    private String rejectedPatchesAction;
    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     */
    private java.util.Date modifiedDate;
    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchSource> sources;

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the deleted patch baseline.
     */

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * 
     * @return The ID of the deleted patch baseline.
     */

    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * <p>
     * The ID of the deleted patch baseline.
     * </p>
     * 
     * @param baselineId
     *        The ID of the deleted patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withBaselineId(String baselineId) {
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

    public UpdatePatchBaselineResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the updated patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * 
     * @return The operating system rule used by the updated patch baseline.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the updated patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public UpdatePatchBaselineResult withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the updated patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * The operating system rule used by the updated patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the updated patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public UpdatePatchBaselineResult withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
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

    public UpdatePatchBaselineResult withGlobalFilters(PatchFilterGroup globalFilters) {
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

    public UpdatePatchBaselineResult withApprovalRules(PatchRuleGroup approvalRules) {
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

    public UpdatePatchBaselineResult withApprovedPatches(String... approvedPatches) {
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

    public UpdatePatchBaselineResult withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        The compliance severity level assigned to the patch baseline after the update completed.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     * 
     * @return The compliance severity level assigned to the patch baseline after the update completed.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        The compliance severity level assigned to the patch baseline after the update completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public UpdatePatchBaselineResult withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        setApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
        return this;
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        The compliance severity level assigned to the patch baseline after the update completed.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        withApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
    }

    /**
     * <p>
     * The compliance severity level assigned to the patch baseline after the update completed.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        The compliance severity level assigned to the patch baseline after the update completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public UpdatePatchBaselineResult withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @param approvedPatchesEnableNonSecurity
     *        Indicates whether the list of approved patches includes non-security updates that should be applied to the
     *        instances. The default value is 'false'. Applies to Linux instances only.
     */

    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to
     *         the instances. The default value is 'false'. Applies to Linux instances only.
     */

    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @param approvedPatchesEnableNonSecurity
     *        Indicates whether the list of approved patches includes non-security updates that should be applied to the
     *        instances. The default value is 'false'. Applies to Linux instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        setApprovedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity);
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     * 
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to
     *         the instances. The default value is 'false'. Applies to Linux instances only.
     */

    public Boolean isApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
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

    public UpdatePatchBaselineResult withRejectedPatches(String... rejectedPatches) {
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

    public UpdatePatchBaselineResult withRejectedPatches(java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only
     *        if it is a dependency of another package, or blocked entirely along with packages that include it as a
     *        dependency.
     * @see PatchAction
     */

    public void setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     * 
     * @return The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only
     *         if it is a dependency of another package, or blocked entirely along with packages that include it as a
     *         dependency.
     * @see PatchAction
     */

    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only
     *        if it is a dependency of another package, or blocked entirely along with packages that include it as a
     *        dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public UpdatePatchBaselineResult withRejectedPatchesAction(String rejectedPatchesAction) {
        setRejectedPatchesAction(rejectedPatchesAction);
        return this;
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only
     *        if it is a dependency of another package, or blocked entirely along with packages that include it as a
     *        dependency.
     * @see PatchAction
     */

    public void setRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        withRejectedPatchesAction(rejectedPatchesAction);
    }

    /**
     * <p>
     * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it
     * is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only
     *        if it is a dependency of another package, or blocked entirely along with packages that include it as a
     *        dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public UpdatePatchBaselineResult withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
        return this;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the patch baseline was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     * 
     * @return The date when the patch baseline was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the patch baseline was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the patch baseline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     * 
     * @param modifiedDate
     *        The date when the patch baseline was last modified.
     */

    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     * 
     * @return The date when the patch baseline was last modified.
     */

    public java.util.Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * <p>
     * The date when the patch baseline was last modified.
     * </p>
     * 
     * @param modifiedDate
     *        The date when the patch baseline was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withModifiedDate(java.util.Date modifiedDate) {
        setModifiedDate(modifiedDate);
        return this;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * 
     * @param description
     *        A description of the Patch Baseline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * 
     * @return A description of the Patch Baseline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the Patch Baseline.
     * </p>
     * 
     * @param description
     *        A description of the Patch Baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     * 
     * @return Information about the patches to use to update the instances, including target operating systems and
     *         source repositories. Applies to Linux instances only.
     */

    public java.util.List<PatchSource> getSources() {
        if (sources == null) {
            sources = new com.amazonaws.internal.SdkInternalList<PatchSource>();
        }
        return sources;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     * 
     * @param sources
     *        Information about the patches to use to update the instances, including target operating systems and
     *        source repositories. Applies to Linux instances only.
     */

    public void setSources(java.util.Collection<PatchSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new com.amazonaws.internal.SdkInternalList<PatchSource>(sources);
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Information about the patches to use to update the instances, including target operating systems and
     *        source repositories. Applies to Linux instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withSources(PatchSource... sources) {
        if (this.sources == null) {
            setSources(new com.amazonaws.internal.SdkInternalList<PatchSource>(sources.length));
        }
        for (PatchSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     * 
     * @param sources
     *        Information about the patches to use to update the instances, including target operating systems and
     *        source repositories. Applies to Linux instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineResult withSources(java.util.Collection<PatchSource> sources) {
        setSources(sources);
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
        if (getBaselineId() != null)
            sb.append("BaselineId: ").append(getBaselineId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getGlobalFilters() != null)
            sb.append("GlobalFilters: ").append(getGlobalFilters()).append(",");
        if (getApprovalRules() != null)
            sb.append("ApprovalRules: ").append(getApprovalRules()).append(",");
        if (getApprovedPatches() != null)
            sb.append("ApprovedPatches: ").append(getApprovedPatches()).append(",");
        if (getApprovedPatchesComplianceLevel() != null)
            sb.append("ApprovedPatchesComplianceLevel: ").append(getApprovedPatchesComplianceLevel()).append(",");
        if (getApprovedPatchesEnableNonSecurity() != null)
            sb.append("ApprovedPatchesEnableNonSecurity: ").append(getApprovedPatchesEnableNonSecurity()).append(",");
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: ").append(getRejectedPatches()).append(",");
        if (getRejectedPatchesAction() != null)
            sb.append("RejectedPatchesAction: ").append(getRejectedPatchesAction()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getModifiedDate() != null)
            sb.append("ModifiedDate: ").append(getModifiedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePatchBaselineResult == false)
            return false;
        UpdatePatchBaselineResult other = (UpdatePatchBaselineResult) obj;
        if (other.getBaselineId() == null ^ this.getBaselineId() == null)
            return false;
        if (other.getBaselineId() != null && other.getBaselineId().equals(this.getBaselineId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
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
        if (other.getApprovedPatchesEnableNonSecurity() == null ^ this.getApprovedPatchesEnableNonSecurity() == null)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() != null
                && other.getApprovedPatchesEnableNonSecurity().equals(this.getApprovedPatchesEnableNonSecurity()) == false)
            return false;
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getRejectedPatchesAction() == null ^ this.getRejectedPatchesAction() == null)
            return false;
        if (other.getRejectedPatchesAction() != null && other.getRejectedPatchesAction().equals(this.getRejectedPatchesAction()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getModifiedDate() == null ^ this.getModifiedDate() == null)
            return false;
        if (other.getModifiedDate() != null && other.getModifiedDate().equals(this.getModifiedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineId() == null) ? 0 : getBaselineId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesComplianceLevel() == null) ? 0 : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesEnableNonSecurity() == null) ? 0 : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getModifiedDate() == null) ? 0 : getModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePatchBaselineResult clone() {
        try {
            return (UpdatePatchBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
