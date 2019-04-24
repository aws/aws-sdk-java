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
     * A set of global filters used to include patches in the baseline.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
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
     * Indicates whether the list of approved patches includes non-security updates that should be applied to the
     * instances. The default value is 'false'. Applies to Linux instances only.
     * </p>
     */
    private Boolean approvedPatchesEnableNonSecurity;
    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> rejectedPatches;
    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String rejectedPatchesAction;
    /**
     * <p>
     * A description of the patch baseline.
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
     * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     */
    private Boolean replace;

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
     * A set of global filters used to include patches in the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to include patches in the baseline.
     */

    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     * 
     * @return A set of global filters used to include patches in the baseline.
     */

    public PatchFilterGroup getGlobalFilters() {
        return this.globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     * 
     * @param globalFilters
     *        A set of global filters used to include patches in the baseline.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return A list of explicitly approved patches for the baseline.</p>
     *         <p>
     *         For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
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
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
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
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
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
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param approvedPatches
     *        A list of explicitly approved patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
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

    public UpdatePatchBaselineRequest withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @return A list of explicitly rejected patches for the baseline.</p>
     *         <p>
     *         For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *         Guide</i>.
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
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
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
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
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
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
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
     * <p>
     * For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param rejectedPatches
     *        A list of explicitly rejected patches for the baseline.</p>
     *        <p>
     *        For information about accepted formats for lists of approved patches and rejected patches, see <a href=
     *        "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *        >Package Name Formats for Approved and Rejected Patch Lists</a> in the <i>AWS Systems Manager User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineRequest withRejectedPatches(java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the RejectedPackages list.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency
     *        of another package. It is considered compliant with the patch baseline, and its status is reported as
     *        <i>InstalledOther</i>. This is the default action if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are
     *        not installed under any circumstances. If a package was installed before it was added to the Rejected
     *        patches list, it is considered non-compliant with the patch baseline, and its status is reported as
     *        <i>InstalledRejected</i>.
     *        </p>
     *        </li>
     * @see PatchAction
     */

    public void setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The action for Patch Manager to take on patches included in the RejectedPackages list.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a
     *         dependency of another package. It is considered compliant with the patch baseline, and its status is
     *         reported as <i>InstalledOther</i>. This is the default action if no option is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are
     *         not installed under any circumstances. If a package was installed before it was added to the Rejected
     *         patches list, it is considered non-compliant with the patch baseline, and its status is reported as
     *         <i>InstalledRejected</i>.
     *         </p>
     *         </li>
     * @see PatchAction
     */

    public String getRejectedPatchesAction() {
        return this.rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the RejectedPackages list.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency
     *        of another package. It is considered compliant with the patch baseline, and its status is reported as
     *        <i>InstalledOther</i>. This is the default action if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are
     *        not installed under any circumstances. If a package was installed before it was added to the Rejected
     *        patches list, it is considered non-compliant with the patch baseline, and its status is reported as
     *        <i>InstalledRejected</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public UpdatePatchBaselineRequest withRejectedPatchesAction(String rejectedPatchesAction) {
        setRejectedPatchesAction(rejectedPatchesAction);
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the RejectedPackages list.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency
     *        of another package. It is considered compliant with the patch baseline, and its status is reported as
     *        <i>InstalledOther</i>. This is the default action if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are
     *        not installed under any circumstances. If a package was installed before it was added to the Rejected
     *        patches list, it is considered non-compliant with the patch baseline, and its status is reported as
     *        <i>InstalledRejected</i>.
     *        </p>
     *        </li>
     * @see PatchAction
     */

    public void setRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        withRejectedPatchesAction(rejectedPatchesAction);
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency of
     * another package. It is considered compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are not
     * installed under any circumstances. If a package was installed before it was added to the Rejected patches list,
     * it is considered non-compliant with the patch baseline, and its status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rejectedPatchesAction
     *        The action for Patch Manager to take on patches included in the RejectedPackages list.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is installed only if it is a dependency
     *        of another package. It is considered compliant with the patch baseline, and its status is reported as
     *        <i>InstalledOther</i>. This is the default action if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that include them as dependencies, are
     *        not installed under any circumstances. If a package was installed before it was added to the Rejected
     *        patches list, it is considered non-compliant with the patch baseline, and its status is reported as
     *        <i>InstalledRejected</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchAction
     */

    public UpdatePatchBaselineRequest withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
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

    public UpdatePatchBaselineRequest withSources(PatchSource... sources) {
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

    public UpdatePatchBaselineRequest withSources(java.util.Collection<PatchSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the CreatePatchBaseline action are also required for this
     *        API request. Optional fields that are not specified are set to null.
     */

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the CreatePatchBaseline action are also required for this
     *         API request. Optional fields that are not specified are set to null.
     */

    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @param replace
     *        If True, then all fields that are required by the CreatePatchBaseline action are also required for this
     *        API request. Optional fields that are not specified are set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePatchBaselineRequest withReplace(Boolean replace) {
        setReplace(replace);
        return this;
    }

    /**
     * <p>
     * If True, then all fields that are required by the CreatePatchBaseline action are also required for this API
     * request. Optional fields that are not specified are set to null.
     * </p>
     * 
     * @return If True, then all fields that are required by the CreatePatchBaseline action are also required for this
     *         API request. Optional fields that are not specified are set to null.
     */

    public Boolean isReplace() {
        return this.replace;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getReplace() != null)
            sb.append("Replace: ").append(getReplace());
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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
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
        hashCode = prime * hashCode + ((getApprovedPatchesEnableNonSecurity() == null) ? 0 : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePatchBaselineRequest clone() {
        return (UpdatePatchBaselineRequest) super.clone();
    }

}
