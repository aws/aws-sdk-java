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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePatchGroupStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     */
    private Integer instances;
    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     */
    private Integer instancesWithInstalledPatches;
    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     */
    private Integer instancesWithInstalledOtherPatches;
    /**
     * <p>
     * The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     * installation. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer instancesWithInstalledPendingRebootPatches;
    /**
     * <p>
     * The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     */
    private Integer instancesWithInstalledRejectedPatches;
    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     */
    private Integer instancesWithMissingPatches;
    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     */
    private Integer instancesWithFailedPatches;
    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     */
    private Integer instancesWithNotApplicablePatches;
    /**
     * <p>
     * The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't reported
     * by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     * </p>
     */
    private Integer instancesWithUnreportedNotApplicablePatches;
    /**
     * <p>
     * The number of instances where patches that are specified as <code>Critical</code> for compliance reporting in the
     * patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer instancesWithCriticalNonCompliantPatches;
    /**
     * <p>
     * The number of instances where patches that are specified as <code>Security</code> in a patch advisory aren't
     * installed. These patches might be missing, have failed installation, were rejected, or were installed but
     * awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer instancesWithSecurityNonCompliantPatches;
    /**
     * <p>
     * The number of instances with patches installed that are specified as other than <code>Critical</code> or
     * <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     * <code>NON_COMPLIANT</code>.
     * </p>
     */
    private Integer instancesWithOtherNonCompliantPatches;

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @param instances
     *        The number of instances in the patch group.
     */

    public void setInstances(Integer instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @return The number of instances in the patch group.
     */

    public Integer getInstances() {
        return this.instances;
    }

    /**
     * <p>
     * The number of instances in the patch group.
     * </p>
     * 
     * @param instances
     *        The number of instances in the patch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstances(Integer instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @param instancesWithInstalledPatches
     *        The number of instances with installed patches.
     */

    public void setInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        this.instancesWithInstalledPatches = instancesWithInstalledPatches;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @return The number of instances with installed patches.
     */

    public Integer getInstancesWithInstalledPatches() {
        return this.instancesWithInstalledPatches;
    }

    /**
     * <p>
     * The number of instances with installed patches.
     * </p>
     * 
     * @param instancesWithInstalledPatches
     *        The number of instances with installed patches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledPatches(Integer instancesWithInstalledPatches) {
        setInstancesWithInstalledPatches(instancesWithInstalledPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @param instancesWithInstalledOtherPatches
     *        The number of instances with patches installed that aren't defined in the patch baseline.
     */

    public void setInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        this.instancesWithInstalledOtherPatches = instancesWithInstalledOtherPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @return The number of instances with patches installed that aren't defined in the patch baseline.
     */

    public Integer getInstancesWithInstalledOtherPatches() {
        return this.instancesWithInstalledOtherPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that aren't defined in the patch baseline.
     * </p>
     * 
     * @param instancesWithInstalledOtherPatches
     *        The number of instances with patches installed that aren't defined in the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledOtherPatches(Integer instancesWithInstalledOtherPatches) {
        setInstancesWithInstalledOtherPatches(instancesWithInstalledOtherPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     * installation. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithInstalledPendingRebootPatches
     *        The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     *        installation. The status of these instances is <code>NON_COMPLIANT</code>.
     */

    public void setInstancesWithInstalledPendingRebootPatches(Integer instancesWithInstalledPendingRebootPatches) {
        this.instancesWithInstalledPendingRebootPatches = instancesWithInstalledPendingRebootPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     * installation. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances with patches installed by Patch Manager that haven't been rebooted after the
     *         patch installation. The status of these instances is <code>NON_COMPLIANT</code>.
     */

    public Integer getInstancesWithInstalledPendingRebootPatches() {
        return this.instancesWithInstalledPendingRebootPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     * installation. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithInstalledPendingRebootPatches
     *        The number of instances with patches installed by Patch Manager that haven't been rebooted after the patch
     *        installation. The status of these instances is <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledPendingRebootPatches(Integer instancesWithInstalledPendingRebootPatches) {
        setInstancesWithInstalledPendingRebootPatches(instancesWithInstalledPendingRebootPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @param instancesWithInstalledRejectedPatches
     *        The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list.
     *        Patches with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added
     *        to a <code>RejectedPatches</code> list.</p> <note>
     *        <p>
     *        If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *        value of <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     *        </p>
     */

    public void setInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        this.instancesWithInstalledRejectedPatches = instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @return The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list.
     *         Patches with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added
     *         to a <code>RejectedPatches</code> list.</p> <note>
     *         <p>
     *         If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *         value of <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     *         </p>
     */

    public Integer getInstancesWithInstalledRejectedPatches() {
        return this.instancesWithInstalledRejectedPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list. Patches
     * with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added to a
     * <code>RejectedPatches</code> list.
     * </p>
     * <note>
     * <p>
     * If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the value of
     * <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     * </p>
     * </note>
     * 
     * @param instancesWithInstalledRejectedPatches
     *        The number of instances with patches installed that are specified in a <code>RejectedPatches</code> list.
     *        Patches with a status of <code>INSTALLED_REJECTED</code> were typically installed before they were added
     *        to a <code>RejectedPatches</code> list.</p> <note>
     *        <p>
     *        If <code>ALLOW_AS_DEPENDENCY</code> is the specified option for <code>RejectedPatchesAction</code>, the
     *        value of <code>InstancesWithInstalledRejectedPatches</code> will always be <code>0</code> (zero).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithInstalledRejectedPatches(Integer instancesWithInstalledRejectedPatches) {
        setInstancesWithInstalledRejectedPatches(instancesWithInstalledRejectedPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @param instancesWithMissingPatches
     *        The number of instances with missing patches from the patch baseline.
     */

    public void setInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        this.instancesWithMissingPatches = instancesWithMissingPatches;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @return The number of instances with missing patches from the patch baseline.
     */

    public Integer getInstancesWithMissingPatches() {
        return this.instancesWithMissingPatches;
    }

    /**
     * <p>
     * The number of instances with missing patches from the patch baseline.
     * </p>
     * 
     * @param instancesWithMissingPatches
     *        The number of instances with missing patches from the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithMissingPatches(Integer instancesWithMissingPatches) {
        setInstancesWithMissingPatches(instancesWithMissingPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @param instancesWithFailedPatches
     *        The number of instances with patches from the patch baseline that failed to install.
     */

    public void setInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        this.instancesWithFailedPatches = instancesWithFailedPatches;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @return The number of instances with patches from the patch baseline that failed to install.
     */

    public Integer getInstancesWithFailedPatches() {
        return this.instancesWithFailedPatches;
    }

    /**
     * <p>
     * The number of instances with patches from the patch baseline that failed to install.
     * </p>
     * 
     * @param instancesWithFailedPatches
     *        The number of instances with patches from the patch baseline that failed to install.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithFailedPatches(Integer instancesWithFailedPatches) {
        setInstancesWithFailedPatches(instancesWithFailedPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @param instancesWithNotApplicablePatches
     *        The number of instances with patches that aren't applicable.
     */

    public void setInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        this.instancesWithNotApplicablePatches = instancesWithNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @return The number of instances with patches that aren't applicable.
     */

    public Integer getInstancesWithNotApplicablePatches() {
        return this.instancesWithNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with patches that aren't applicable.
     * </p>
     * 
     * @param instancesWithNotApplicablePatches
     *        The number of instances with patches that aren't applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithNotApplicablePatches(Integer instancesWithNotApplicablePatches) {
        setInstancesWithNotApplicablePatches(instancesWithNotApplicablePatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't reported
     * by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     * </p>
     * 
     * @param instancesWithUnreportedNotApplicablePatches
     *        The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't
     *        reported by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     */

    public void setInstancesWithUnreportedNotApplicablePatches(Integer instancesWithUnreportedNotApplicablePatches) {
        this.instancesWithUnreportedNotApplicablePatches = instancesWithUnreportedNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't reported
     * by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     * </p>
     * 
     * @return The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't
     *         reported by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     */

    public Integer getInstancesWithUnreportedNotApplicablePatches() {
        return this.instancesWithUnreportedNotApplicablePatches;
    }

    /**
     * <p>
     * The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't reported
     * by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     * </p>
     * 
     * @param instancesWithUnreportedNotApplicablePatches
     *        The number of instances with <code>NotApplicable</code> patches beyond the supported limit, which aren't
     *        reported by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithUnreportedNotApplicablePatches(Integer instancesWithUnreportedNotApplicablePatches) {
        setInstancesWithUnreportedNotApplicablePatches(instancesWithUnreportedNotApplicablePatches);
        return this;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Critical</code> for compliance reporting in the
     * patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithCriticalNonCompliantPatches
     *        The number of instances where patches that are specified as <code>Critical</code> for compliance reporting
     *        in the patch baseline aren't installed. These patches might be missing, have failed installation, were
     *        rejected, or were installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     */

    public void setInstancesWithCriticalNonCompliantPatches(Integer instancesWithCriticalNonCompliantPatches) {
        this.instancesWithCriticalNonCompliantPatches = instancesWithCriticalNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Critical</code> for compliance reporting in the
     * patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances where patches that are specified as <code>Critical</code> for compliance
     *         reporting in the patch baseline aren't installed. These patches might be missing, have failed
     *         installation, were rejected, or were installed but awaiting a required instance reboot. The status of
     *         these instances is <code>NON_COMPLIANT</code>.
     */

    public Integer getInstancesWithCriticalNonCompliantPatches() {
        return this.instancesWithCriticalNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Critical</code> for compliance reporting in the
     * patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were
     * installed but awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithCriticalNonCompliantPatches
     *        The number of instances where patches that are specified as <code>Critical</code> for compliance reporting
     *        in the patch baseline aren't installed. These patches might be missing, have failed installation, were
     *        rejected, or were installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithCriticalNonCompliantPatches(Integer instancesWithCriticalNonCompliantPatches) {
        setInstancesWithCriticalNonCompliantPatches(instancesWithCriticalNonCompliantPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Security</code> in a patch advisory aren't
     * installed. These patches might be missing, have failed installation, were rejected, or were installed but
     * awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithSecurityNonCompliantPatches
     *        The number of instances where patches that are specified as <code>Security</code> in a patch advisory
     *        aren't installed. These patches might be missing, have failed installation, were rejected, or were
     *        installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     */

    public void setInstancesWithSecurityNonCompliantPatches(Integer instancesWithSecurityNonCompliantPatches) {
        this.instancesWithSecurityNonCompliantPatches = instancesWithSecurityNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Security</code> in a patch advisory aren't
     * installed. These patches might be missing, have failed installation, were rejected, or were installed but
     * awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances where patches that are specified as <code>Security</code> in a patch advisory
     *         aren't installed. These patches might be missing, have failed installation, were rejected, or were
     *         installed but awaiting a required instance reboot. The status of these instances is
     *         <code>NON_COMPLIANT</code>.
     */

    public Integer getInstancesWithSecurityNonCompliantPatches() {
        return this.instancesWithSecurityNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances where patches that are specified as <code>Security</code> in a patch advisory aren't
     * installed. These patches might be missing, have failed installation, were rejected, or were installed but
     * awaiting a required instance reboot. The status of these instances is <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithSecurityNonCompliantPatches
     *        The number of instances where patches that are specified as <code>Security</code> in a patch advisory
     *        aren't installed. These patches might be missing, have failed installation, were rejected, or were
     *        installed but awaiting a required instance reboot. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithSecurityNonCompliantPatches(Integer instancesWithSecurityNonCompliantPatches) {
        setInstancesWithSecurityNonCompliantPatches(instancesWithSecurityNonCompliantPatches);
        return this;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than <code>Critical</code> or
     * <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     * <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithOtherNonCompliantPatches
     *        The number of instances with patches installed that are specified as other than <code>Critical</code> or
     *        <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     */

    public void setInstancesWithOtherNonCompliantPatches(Integer instancesWithOtherNonCompliantPatches) {
        this.instancesWithOtherNonCompliantPatches = instancesWithOtherNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than <code>Critical</code> or
     * <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     * <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return The number of instances with patches installed that are specified as other than <code>Critical</code> or
     *         <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     *         <code>NON_COMPLIANT</code>.
     */

    public Integer getInstancesWithOtherNonCompliantPatches() {
        return this.instancesWithOtherNonCompliantPatches;
    }

    /**
     * <p>
     * The number of instances with patches installed that are specified as other than <code>Critical</code> or
     * <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     * <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param instancesWithOtherNonCompliantPatches
     *        The number of instances with patches installed that are specified as other than <code>Critical</code> or
     *        <code>Security</code> but aren't compliant with the patch baseline. The status of these instances is
     *        <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePatchGroupStateResult withInstancesWithOtherNonCompliantPatches(Integer instancesWithOtherNonCompliantPatches) {
        setInstancesWithOtherNonCompliantPatches(instancesWithOtherNonCompliantPatches);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getInstancesWithInstalledPatches() != null)
            sb.append("InstancesWithInstalledPatches: ").append(getInstancesWithInstalledPatches()).append(",");
        if (getInstancesWithInstalledOtherPatches() != null)
            sb.append("InstancesWithInstalledOtherPatches: ").append(getInstancesWithInstalledOtherPatches()).append(",");
        if (getInstancesWithInstalledPendingRebootPatches() != null)
            sb.append("InstancesWithInstalledPendingRebootPatches: ").append(getInstancesWithInstalledPendingRebootPatches()).append(",");
        if (getInstancesWithInstalledRejectedPatches() != null)
            sb.append("InstancesWithInstalledRejectedPatches: ").append(getInstancesWithInstalledRejectedPatches()).append(",");
        if (getInstancesWithMissingPatches() != null)
            sb.append("InstancesWithMissingPatches: ").append(getInstancesWithMissingPatches()).append(",");
        if (getInstancesWithFailedPatches() != null)
            sb.append("InstancesWithFailedPatches: ").append(getInstancesWithFailedPatches()).append(",");
        if (getInstancesWithNotApplicablePatches() != null)
            sb.append("InstancesWithNotApplicablePatches: ").append(getInstancesWithNotApplicablePatches()).append(",");
        if (getInstancesWithUnreportedNotApplicablePatches() != null)
            sb.append("InstancesWithUnreportedNotApplicablePatches: ").append(getInstancesWithUnreportedNotApplicablePatches()).append(",");
        if (getInstancesWithCriticalNonCompliantPatches() != null)
            sb.append("InstancesWithCriticalNonCompliantPatches: ").append(getInstancesWithCriticalNonCompliantPatches()).append(",");
        if (getInstancesWithSecurityNonCompliantPatches() != null)
            sb.append("InstancesWithSecurityNonCompliantPatches: ").append(getInstancesWithSecurityNonCompliantPatches()).append(",");
        if (getInstancesWithOtherNonCompliantPatches() != null)
            sb.append("InstancesWithOtherNonCompliantPatches: ").append(getInstancesWithOtherNonCompliantPatches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePatchGroupStateResult == false)
            return false;
        DescribePatchGroupStateResult other = (DescribePatchGroupStateResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getInstancesWithInstalledPatches() == null ^ this.getInstancesWithInstalledPatches() == null)
            return false;
        if (other.getInstancesWithInstalledPatches() != null
                && other.getInstancesWithInstalledPatches().equals(this.getInstancesWithInstalledPatches()) == false)
            return false;
        if (other.getInstancesWithInstalledOtherPatches() == null ^ this.getInstancesWithInstalledOtherPatches() == null)
            return false;
        if (other.getInstancesWithInstalledOtherPatches() != null
                && other.getInstancesWithInstalledOtherPatches().equals(this.getInstancesWithInstalledOtherPatches()) == false)
            return false;
        if (other.getInstancesWithInstalledPendingRebootPatches() == null ^ this.getInstancesWithInstalledPendingRebootPatches() == null)
            return false;
        if (other.getInstancesWithInstalledPendingRebootPatches() != null
                && other.getInstancesWithInstalledPendingRebootPatches().equals(this.getInstancesWithInstalledPendingRebootPatches()) == false)
            return false;
        if (other.getInstancesWithInstalledRejectedPatches() == null ^ this.getInstancesWithInstalledRejectedPatches() == null)
            return false;
        if (other.getInstancesWithInstalledRejectedPatches() != null
                && other.getInstancesWithInstalledRejectedPatches().equals(this.getInstancesWithInstalledRejectedPatches()) == false)
            return false;
        if (other.getInstancesWithMissingPatches() == null ^ this.getInstancesWithMissingPatches() == null)
            return false;
        if (other.getInstancesWithMissingPatches() != null && other.getInstancesWithMissingPatches().equals(this.getInstancesWithMissingPatches()) == false)
            return false;
        if (other.getInstancesWithFailedPatches() == null ^ this.getInstancesWithFailedPatches() == null)
            return false;
        if (other.getInstancesWithFailedPatches() != null && other.getInstancesWithFailedPatches().equals(this.getInstancesWithFailedPatches()) == false)
            return false;
        if (other.getInstancesWithNotApplicablePatches() == null ^ this.getInstancesWithNotApplicablePatches() == null)
            return false;
        if (other.getInstancesWithNotApplicablePatches() != null
                && other.getInstancesWithNotApplicablePatches().equals(this.getInstancesWithNotApplicablePatches()) == false)
            return false;
        if (other.getInstancesWithUnreportedNotApplicablePatches() == null ^ this.getInstancesWithUnreportedNotApplicablePatches() == null)
            return false;
        if (other.getInstancesWithUnreportedNotApplicablePatches() != null
                && other.getInstancesWithUnreportedNotApplicablePatches().equals(this.getInstancesWithUnreportedNotApplicablePatches()) == false)
            return false;
        if (other.getInstancesWithCriticalNonCompliantPatches() == null ^ this.getInstancesWithCriticalNonCompliantPatches() == null)
            return false;
        if (other.getInstancesWithCriticalNonCompliantPatches() != null
                && other.getInstancesWithCriticalNonCompliantPatches().equals(this.getInstancesWithCriticalNonCompliantPatches()) == false)
            return false;
        if (other.getInstancesWithSecurityNonCompliantPatches() == null ^ this.getInstancesWithSecurityNonCompliantPatches() == null)
            return false;
        if (other.getInstancesWithSecurityNonCompliantPatches() != null
                && other.getInstancesWithSecurityNonCompliantPatches().equals(this.getInstancesWithSecurityNonCompliantPatches()) == false)
            return false;
        if (other.getInstancesWithOtherNonCompliantPatches() == null ^ this.getInstancesWithOtherNonCompliantPatches() == null)
            return false;
        if (other.getInstancesWithOtherNonCompliantPatches() != null
                && other.getInstancesWithOtherNonCompliantPatches().equals(this.getInstancesWithOtherNonCompliantPatches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledPatches() == null) ? 0 : getInstancesWithInstalledPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledOtherPatches() == null) ? 0 : getInstancesWithInstalledOtherPatches().hashCode());
        hashCode = prime * hashCode
                + ((getInstancesWithInstalledPendingRebootPatches() == null) ? 0 : getInstancesWithInstalledPendingRebootPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithInstalledRejectedPatches() == null) ? 0 : getInstancesWithInstalledRejectedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithMissingPatches() == null) ? 0 : getInstancesWithMissingPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithFailedPatches() == null) ? 0 : getInstancesWithFailedPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithNotApplicablePatches() == null) ? 0 : getInstancesWithNotApplicablePatches().hashCode());
        hashCode = prime * hashCode
                + ((getInstancesWithUnreportedNotApplicablePatches() == null) ? 0 : getInstancesWithUnreportedNotApplicablePatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithCriticalNonCompliantPatches() == null) ? 0 : getInstancesWithCriticalNonCompliantPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithSecurityNonCompliantPatches() == null) ? 0 : getInstancesWithSecurityNonCompliantPatches().hashCode());
        hashCode = prime * hashCode + ((getInstancesWithOtherNonCompliantPatches() == null) ? 0 : getInstancesWithOtherNonCompliantPatches().hashCode());
        return hashCode;
    }

    @Override
    public DescribePatchGroupStateResult clone() {
        try {
            return (DescribePatchGroupStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
