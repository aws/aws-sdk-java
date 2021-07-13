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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the basic information about a patch baseline override.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/BaselineOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaselineOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operating system rule used by the patch baseline override.
     * </p>
     */
    private String operatingSystem;

    private PatchFilterGroup globalFilters;

    private PatchRuleGroup approvalRules;
    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> approvedPatches;
    /**
     * <p>
     * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value
     * describes the severity of the compliance violation.
     * </p>
     */
    private String approvedPatchesComplianceLevel;
    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rejectedPatches;
    /**
     * <p>
     * The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A patch can
     * be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it
     * as a dependency.
     * </p>
     */
    private String rejectedPatchesAction;
    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is <code>false</code>. Applies to Linux instances only.
     * </p>
     */
    private Boolean approvedPatchesEnableNonSecurity;
    /**
     * <p>
     * Information about the patches to use to update the instances, including target operating systems and source
     * repositories. Applies to Linux instances only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PatchSource> sources;

    /**
     * <p>
     * The operating system rule used by the patch baseline override.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the patch baseline override.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the patch baseline override.
     * </p>
     * 
     * @return The operating system rule used by the patch baseline override.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system rule used by the patch baseline override.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the patch baseline override.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public BaselineOverride withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system rule used by the patch baseline override.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system rule used by the patch baseline override.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public BaselineOverride withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * @param globalFilters
     */

    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * @return
     */

    public PatchFilterGroup getGlobalFilters() {
        return this.globalFilters;
    }

    /**
     * @param globalFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withGlobalFilters(PatchFilterGroup globalFilters) {
        setGlobalFilters(globalFilters);
        return this;
    }

    /**
     * @param approvalRules
     */

    public void setApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    /**
     * @return
     */

    public PatchRuleGroup getApprovalRules() {
        return this.approvalRules;
    }

    /**
     * @param approvalRules
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withApprovalRules(PatchRuleGroup approvalRules) {
        setApprovalRules(approvalRules);
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @return A list of explicitly approved patches for the baseline.</p>
     *         <p>
     *         For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *         Systems Manager User Guide</i>.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
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
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovedPatches(java.util.Collection)} or {@link #withApprovedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withApprovedPatches(String... approvedPatches) {
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value
     * describes the severity of the compliance violation.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. When an approved patch is reported as missing, this
     *        value describes the severity of the compliance violation.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value
     * describes the severity of the compliance violation.
     * </p>
     * 
     * @return Defines the compliance level for approved patches. When an approved patch is reported as missing, this
     *         value describes the severity of the compliance violation.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value
     * describes the severity of the compliance violation.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. When an approved patch is reported as missing, this
     *        value describes the severity of the compliance violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public BaselineOverride withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        setApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. When an approved patch is reported as missing, this value
     * describes the severity of the compliance violation.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. When an approved patch is reported as missing, this
     *        value describes the severity of the compliance violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public BaselineOverride withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @return A list of explicitly rejected patches for the baseline.</p>
     *         <p>
     *         For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *         Systems Manager User Guide</i>.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
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
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRejectedPatches(java.util.Collection)} or {@link #withRejectedPatches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withRejectedPatches(String... rejectedPatches) {
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >About package name formats for approved and rejected patch lists</a> in the <i>Amazon Web Services
     *        Systems Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withRejectedPatches(java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A patch can
     * be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it
     * as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A
     *        patch can be allowed only if it is a dependency of another package, or blocked entirely along with
     *        packages that include it as a dependency.
     * @see PatchAction
     */

    public void setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A patch can
     * be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it
     * as a dependency.
     * </p>
     * 
     * @return The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A
     *         patch can be allowed only if it is a dependency of another package, or blocked entirely along with
     *         packages that include it as a dependency.
     * @see PatchAction
     */

    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A patch can
     * be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it
     * as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A
     *        patch can be allowed only if it is a dependency of another package, or blocked entirely along with
     *        packages that include it as a dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public BaselineOverride withRejectedPatchesAction(String rejectedPatchesAction) {
        setRejectedPatchesAction(rejectedPatchesAction);
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A patch can
     * be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it
     * as a dependency.
     * </p>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the <code>RejectedPackages</code> list. A
     *        patch can be allowed only if it is a dependency of another package, or blocked entirely along with
     *        packages that include it as a dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public BaselineOverride withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is <code>false</code>. Applies to Linux instances only.
     * </p>
     * 
     * @param approvedPatchesEnableNonSecurity
     *        Indicates whether the list of approved patches includes non-security updates that should be applied to the
     *        instances. The default value is <code>false</code>. Applies to Linux instances only.
     */

    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is <code>false</code>. Applies to Linux instances only.
     * </p>
     * 
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to
     *         the instances. The default value is <code>false</code>. Applies to Linux instances only.
     */

    public Boolean getApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is <code>false</code>. Applies to Linux instances only.
     * </p>
     * 
     * @param approvedPatchesEnableNonSecurity
     *        Indicates whether the list of approved patches includes non-security updates that should be applied to the
     *        instances. The default value is <code>false</code>. Applies to Linux instances only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaselineOverride withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        setApprovedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity);
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is <code>false</code>. Applies to Linux instances only.
     * </p>
     * 
     * @return Indicates whether the list of approved patches includes non-security updates that should be applied to
     *         the instances. The default value is <code>false</code>. Applies to Linux instances only.
     */

    public Boolean isApprovedPatchesEnableNonSecurity() {
        return this.approvedPatchesEnableNonSecurity;
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

    public BaselineOverride withSources(PatchSource... sources) {
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

    public BaselineOverride withSources(java.util.Collection<PatchSource> sources) {
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
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: ").append(getRejectedPatches()).append(",");
        if (getRejectedPatchesAction() != null)
            sb.append("RejectedPatchesAction: ").append(getRejectedPatchesAction()).append(",");
        if (getApprovedPatchesEnableNonSecurity() != null)
            sb.append("ApprovedPatchesEnableNonSecurity: ").append(getApprovedPatchesEnableNonSecurity()).append(",");
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

        if (obj instanceof BaselineOverride == false)
            return false;
        BaselineOverride other = (BaselineOverride) obj;
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
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getRejectedPatchesAction() == null ^ this.getRejectedPatchesAction() == null)
            return false;
        if (other.getRejectedPatchesAction() != null && other.getRejectedPatchesAction().equals(this.getRejectedPatchesAction()) == false)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() == null ^ this.getApprovedPatchesEnableNonSecurity() == null)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() != null
                && other.getApprovedPatchesEnableNonSecurity().equals(this.getApprovedPatchesEnableNonSecurity()) == false)
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

        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesComplianceLevel() == null) ? 0 : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode + ((getApprovedPatchesEnableNonSecurity() == null) ? 0 : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public BaselineOverride clone() {
        try {
            return (BaselineOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.BaselineOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
