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
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
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
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the
     * severity level of patches it specifies and the operating system family it applies to. In this case, you could
     * specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public CreatePatchBaselineRequest withApprovedPatches(java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * </p>
     * 
     * @return Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *         missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public String getApprovedPatchesComplianceLevel() {
        return this.approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
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
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * @see PatchComplianceLevel
     */

    public void setApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
        withApprovedPatchesComplianceLevel(approvedPatchesComplianceLevel);
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing,
     * this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * </p>
     * 
     * @param approvedPatchesComplianceLevel
     *        Defines the compliance level for approved patches. This means that if an approved patch is reported as
     *        missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchComplianceLevel
     */

    public CreatePatchBaselineRequest withApprovedPatchesComplianceLevel(PatchComplianceLevel approvedPatchesComplianceLevel) {
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

    public CreatePatchBaselineRequest withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
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

    public CreatePatchBaselineRequest withRejectedPatches(java.util.Collection<String> rejectedPatches) {
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

    public CreatePatchBaselineRequest withRejectedPatchesAction(String rejectedPatchesAction) {
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

    public CreatePatchBaselineRequest withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
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

    public CreatePatchBaselineRequest withDescription(String description) {
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

    public CreatePatchBaselineRequest withSources(PatchSource... sources) {
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

    public CreatePatchBaselineRequest withSources(java.util.Collection<PatchSource> sources) {
        setSources(sources);
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
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the
     * severity level of patches it specifies and the operating system family it applies to. In this case, you could
     * specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @return Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *         ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to
     *         identify the severity level of patches it specifies and the operating system family it applies to. In
     *         this case, you could specify the following key name/value pairs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=PatchSeverity,Value=Critical</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the
     * severity level of patches it specifies and the operating system family it applies to. In this case, you could
     * specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to
     *        identify the severity level of patches it specifies and the operating system family it applies to. In this
     *        case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=PatchSeverity,Value=Critical</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the
     * severity level of patches it specifies and the operating system family it applies to. In this case, you could
     * specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to
     *        identify the severity level of patches it specifies and the operating system family it applies to. In this
     *        case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=PatchSeverity,Value=Critical</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such
     * as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the
     * severity level of patches it specifies and the operating system family it applies to. In this case, you could
     * specify the following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * 
     * @param tags
     *        Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different
     *        ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to
     *        identify the severity level of patches it specifies and the operating system family it applies to. In this
     *        case, you could specify the following key name/value pairs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key=PatchSeverity,Value=Critical</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key=OS,Value=Windows</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        To add tags to an existing patch baseline, use the <a>AddTagsToResource</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePatchBaselineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getApprovedPatchesEnableNonSecurity() == null) ? 0 : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePatchBaselineRequest clone() {
        return (CreatePatchBaselineRequest) super.clone();
    }

}
