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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details about the compliance status for a patch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSsmComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSsmComplianceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current patch compliance status.
     * </p>
     * <p>
     * The possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSPECIFIED_DATA</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     * </p>
     */
    private Integer compliantCriticalCount;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     */
    private Integer compliantHighCount;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     */
    private Integer compliantMediumCount;
    /**
     * <p>
     * The type of execution that was used determine compliance.
     * </p>
     */
    private String executionType;
    /**
     * <p>
     * For the patch items that are noncompliant, the number of items that have a severity of <code>CRITICAL</code>.
     * </p>
     */
    private Integer nonCompliantCriticalCount;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     */
    private Integer compliantInformationalCount;
    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     */
    private Integer nonCompliantInformationalCount;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     */
    private Integer compliantUnspecifiedCount;
    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     * </p>
     */
    private Integer nonCompliantLowCount;
    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     */
    private Integer nonCompliantHighCount;
    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     * </p>
     */
    private Integer compliantLowCount;
    /**
     * <p>
     * The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     * <code>ComplianceType</code> is <code>Patch</code>.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The identifier of the patch baseline. The patch baseline lists the patches that are approved for installation.
     * </p>
     */
    private String patchBaselineId;
    /**
     * <p>
     * The highest severity for the patches.
     * </p>
     */
    private String overallSeverity;
    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     */
    private Integer nonCompliantMediumCount;
    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     */
    private Integer nonCompliantUnspecifiedCount;
    /**
     * <p>
     * The identifier of the patch group for which compliance was determined. A patch group uses tags to group EC2
     * instances that should have the same patch compliance.
     * </p>
     */
    private String patchGroup;

    /**
     * <p>
     * The current patch compliance status.
     * </p>
     * <p>
     * The possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSPECIFIED_DATA</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current patch compliance status.</p>
     *        <p>
     *        The possible status values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLIANT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_COMPLIANT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSPECIFIED_DATA</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current patch compliance status.
     * </p>
     * <p>
     * The possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSPECIFIED_DATA</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current patch compliance status.</p>
     *         <p>
     *         The possible status values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLIANT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_COMPLIANT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNSPECIFIED_DATA</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current patch compliance status.
     * </p>
     * <p>
     * The possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_COMPLIANT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNSPECIFIED_DATA</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current patch compliance status.</p>
     *        <p>
     *        The possible status values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLIANT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_COMPLIANT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNSPECIFIED_DATA</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @param compliantCriticalCount
     *        For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     */

    public void setCompliantCriticalCount(Integer compliantCriticalCount) {
        this.compliantCriticalCount = compliantCriticalCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     */

    public Integer getCompliantCriticalCount() {
        return this.compliantCriticalCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @param compliantCriticalCount
     *        For the patches that are compliant, the number that have a severity of <code>CRITICAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantCriticalCount(Integer compliantCriticalCount) {
        setCompliantCriticalCount(compliantCriticalCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @param compliantHighCount
     *        For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     */

    public void setCompliantHighCount(Integer compliantHighCount) {
        this.compliantHighCount = compliantHighCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     */

    public Integer getCompliantHighCount() {
        return this.compliantHighCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @param compliantHighCount
     *        For the patches that are compliant, the number that have a severity of <code>HIGH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantHighCount(Integer compliantHighCount) {
        setCompliantHighCount(compliantHighCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @param compliantMediumCount
     *        For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     */

    public void setCompliantMediumCount(Integer compliantMediumCount) {
        this.compliantMediumCount = compliantMediumCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     */

    public Integer getCompliantMediumCount() {
        return this.compliantMediumCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @param compliantMediumCount
     *        For the patches that are compliant, the number that have a severity of <code>MEDIUM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantMediumCount(Integer compliantMediumCount) {
        setCompliantMediumCount(compliantMediumCount);
        return this;
    }

    /**
     * <p>
     * The type of execution that was used determine compliance.
     * </p>
     * 
     * @param executionType
     *        The type of execution that was used determine compliance.
     */

    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     * <p>
     * The type of execution that was used determine compliance.
     * </p>
     * 
     * @return The type of execution that was used determine compliance.
     */

    public String getExecutionType() {
        return this.executionType;
    }

    /**
     * <p>
     * The type of execution that was used determine compliance.
     * </p>
     * 
     * @param executionType
     *        The type of execution that was used determine compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withExecutionType(String executionType) {
        setExecutionType(executionType);
        return this;
    }

    /**
     * <p>
     * For the patch items that are noncompliant, the number of items that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @param nonCompliantCriticalCount
     *        For the patch items that are noncompliant, the number of items that have a severity of
     *        <code>CRITICAL</code>.
     */

    public void setNonCompliantCriticalCount(Integer nonCompliantCriticalCount) {
        this.nonCompliantCriticalCount = nonCompliantCriticalCount;
    }

    /**
     * <p>
     * For the patch items that are noncompliant, the number of items that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @return For the patch items that are noncompliant, the number of items that have a severity of
     *         <code>CRITICAL</code>.
     */

    public Integer getNonCompliantCriticalCount() {
        return this.nonCompliantCriticalCount;
    }

    /**
     * <p>
     * For the patch items that are noncompliant, the number of items that have a severity of <code>CRITICAL</code>.
     * </p>
     * 
     * @param nonCompliantCriticalCount
     *        For the patch items that are noncompliant, the number of items that have a severity of
     *        <code>CRITICAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantCriticalCount(Integer nonCompliantCriticalCount) {
        setNonCompliantCriticalCount(nonCompliantCriticalCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @param compliantInformationalCount
     *        For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     */

    public void setCompliantInformationalCount(Integer compliantInformationalCount) {
        this.compliantInformationalCount = compliantInformationalCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     */

    public Integer getCompliantInformationalCount() {
        return this.compliantInformationalCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @param compliantInformationalCount
     *        For the patches that are compliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantInformationalCount(Integer compliantInformationalCount) {
        setCompliantInformationalCount(compliantInformationalCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @param nonCompliantInformationalCount
     *        For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     */

    public void setNonCompliantInformationalCount(Integer nonCompliantInformationalCount) {
        this.nonCompliantInformationalCount = nonCompliantInformationalCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @return For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     */

    public Integer getNonCompliantInformationalCount() {
        return this.nonCompliantInformationalCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * </p>
     * 
     * @param nonCompliantInformationalCount
     *        For the patches that are noncompliant, the number that have a severity of <code>INFORMATIONAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantInformationalCount(Integer nonCompliantInformationalCount) {
        setNonCompliantInformationalCount(nonCompliantInformationalCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @param compliantUnspecifiedCount
     *        For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     */

    public void setCompliantUnspecifiedCount(Integer compliantUnspecifiedCount) {
        this.compliantUnspecifiedCount = compliantUnspecifiedCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     */

    public Integer getCompliantUnspecifiedCount() {
        return this.compliantUnspecifiedCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @param compliantUnspecifiedCount
     *        For the patches that are compliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantUnspecifiedCount(Integer compliantUnspecifiedCount) {
        setCompliantUnspecifiedCount(compliantUnspecifiedCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @param nonCompliantLowCount
     *        For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     */

    public void setNonCompliantLowCount(Integer nonCompliantLowCount) {
        this.nonCompliantLowCount = nonCompliantLowCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @return For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     */

    public Integer getNonCompliantLowCount() {
        return this.nonCompliantLowCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @param nonCompliantLowCount
     *        For the patches that are noncompliant, the number that have a severity of <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantLowCount(Integer nonCompliantLowCount) {
        setNonCompliantLowCount(nonCompliantLowCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @param nonCompliantHighCount
     *        For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     */

    public void setNonCompliantHighCount(Integer nonCompliantHighCount) {
        this.nonCompliantHighCount = nonCompliantHighCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @return For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     */

    public Integer getNonCompliantHighCount() {
        return this.nonCompliantHighCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     * </p>
     * 
     * @param nonCompliantHighCount
     *        For the patches that are noncompliant, the number that have a severity of <code>HIGH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantHighCount(Integer nonCompliantHighCount) {
        setNonCompliantHighCount(nonCompliantHighCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @param compliantLowCount
     *        For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     */

    public void setCompliantLowCount(Integer compliantLowCount) {
        this.compliantLowCount = compliantLowCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @return For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     */

    public Integer getCompliantLowCount() {
        return this.compliantLowCount;
    }

    /**
     * <p>
     * For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     * </p>
     * 
     * @param compliantLowCount
     *        For the patches that are compliant, the number that have a severity of <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withCompliantLowCount(Integer compliantLowCount) {
        setCompliantLowCount(compliantLowCount);
        return this;
    }

    /**
     * <p>
     * The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     * <code>ComplianceType</code> is <code>Patch</code>.
     * </p>
     * 
     * @param complianceType
     *        The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     *        <code>ComplianceType</code> is <code>Patch</code>.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     * <code>ComplianceType</code> is <code>Patch</code>.
     * </p>
     * 
     * @return The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     *         <code>ComplianceType</code> is <code>Patch</code>.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     * <code>ComplianceType</code> is <code>Patch</code>.
     * </p>
     * 
     * @param complianceType
     *        The type of resource for which the compliance was determined. For <code>AwsSsmPatchCompliance</code>,
     *        <code>ComplianceType</code> is <code>Patch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The identifier of the patch baseline. The patch baseline lists the patches that are approved for installation.
     * </p>
     * 
     * @param patchBaselineId
     *        The identifier of the patch baseline. The patch baseline lists the patches that are approved for
     *        installation.
     */

    public void setPatchBaselineId(String patchBaselineId) {
        this.patchBaselineId = patchBaselineId;
    }

    /**
     * <p>
     * The identifier of the patch baseline. The patch baseline lists the patches that are approved for installation.
     * </p>
     * 
     * @return The identifier of the patch baseline. The patch baseline lists the patches that are approved for
     *         installation.
     */

    public String getPatchBaselineId() {
        return this.patchBaselineId;
    }

    /**
     * <p>
     * The identifier of the patch baseline. The patch baseline lists the patches that are approved for installation.
     * </p>
     * 
     * @param patchBaselineId
     *        The identifier of the patch baseline. The patch baseline lists the patches that are approved for
     *        installation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withPatchBaselineId(String patchBaselineId) {
        setPatchBaselineId(patchBaselineId);
        return this;
    }

    /**
     * <p>
     * The highest severity for the patches.
     * </p>
     * 
     * @param overallSeverity
     *        The highest severity for the patches.
     */

    public void setOverallSeverity(String overallSeverity) {
        this.overallSeverity = overallSeverity;
    }

    /**
     * <p>
     * The highest severity for the patches.
     * </p>
     * 
     * @return The highest severity for the patches.
     */

    public String getOverallSeverity() {
        return this.overallSeverity;
    }

    /**
     * <p>
     * The highest severity for the patches.
     * </p>
     * 
     * @param overallSeverity
     *        The highest severity for the patches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withOverallSeverity(String overallSeverity) {
        setOverallSeverity(overallSeverity);
        return this;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @param nonCompliantMediumCount
     *        For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     */

    public void setNonCompliantMediumCount(Integer nonCompliantMediumCount) {
        this.nonCompliantMediumCount = nonCompliantMediumCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @return For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     */

    public Integer getNonCompliantMediumCount() {
        return this.nonCompliantMediumCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     * </p>
     * 
     * @param nonCompliantMediumCount
     *        For the patches that are noncompliant, the number that have a severity of <code>MEDIUM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantMediumCount(Integer nonCompliantMediumCount) {
        setNonCompliantMediumCount(nonCompliantMediumCount);
        return this;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @param nonCompliantUnspecifiedCount
     *        For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     */

    public void setNonCompliantUnspecifiedCount(Integer nonCompliantUnspecifiedCount) {
        this.nonCompliantUnspecifiedCount = nonCompliantUnspecifiedCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @return For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     */

    public Integer getNonCompliantUnspecifiedCount() {
        return this.nonCompliantUnspecifiedCount;
    }

    /**
     * <p>
     * For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * </p>
     * 
     * @param nonCompliantUnspecifiedCount
     *        For the patches that are noncompliant, the number that have a severity of <code>UNSPECIFIED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withNonCompliantUnspecifiedCount(Integer nonCompliantUnspecifiedCount) {
        setNonCompliantUnspecifiedCount(nonCompliantUnspecifiedCount);
        return this;
    }

    /**
     * <p>
     * The identifier of the patch group for which compliance was determined. A patch group uses tags to group EC2
     * instances that should have the same patch compliance.
     * </p>
     * 
     * @param patchGroup
     *        The identifier of the patch group for which compliance was determined. A patch group uses tags to group
     *        EC2 instances that should have the same patch compliance.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The identifier of the patch group for which compliance was determined. A patch group uses tags to group EC2
     * instances that should have the same patch compliance.
     * </p>
     * 
     * @return The identifier of the patch group for which compliance was determined. A patch group uses tags to group
     *         EC2 instances that should have the same patch compliance.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The identifier of the patch group for which compliance was determined. A patch group uses tags to group EC2
     * instances that should have the same patch compliance.
     * </p>
     * 
     * @param patchGroup
     *        The identifier of the patch group for which compliance was determined. A patch group uses tags to group
     *        EC2 instances that should have the same patch compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSsmComplianceSummary withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCompliantCriticalCount() != null)
            sb.append("CompliantCriticalCount: ").append(getCompliantCriticalCount()).append(",");
        if (getCompliantHighCount() != null)
            sb.append("CompliantHighCount: ").append(getCompliantHighCount()).append(",");
        if (getCompliantMediumCount() != null)
            sb.append("CompliantMediumCount: ").append(getCompliantMediumCount()).append(",");
        if (getExecutionType() != null)
            sb.append("ExecutionType: ").append(getExecutionType()).append(",");
        if (getNonCompliantCriticalCount() != null)
            sb.append("NonCompliantCriticalCount: ").append(getNonCompliantCriticalCount()).append(",");
        if (getCompliantInformationalCount() != null)
            sb.append("CompliantInformationalCount: ").append(getCompliantInformationalCount()).append(",");
        if (getNonCompliantInformationalCount() != null)
            sb.append("NonCompliantInformationalCount: ").append(getNonCompliantInformationalCount()).append(",");
        if (getCompliantUnspecifiedCount() != null)
            sb.append("CompliantUnspecifiedCount: ").append(getCompliantUnspecifiedCount()).append(",");
        if (getNonCompliantLowCount() != null)
            sb.append("NonCompliantLowCount: ").append(getNonCompliantLowCount()).append(",");
        if (getNonCompliantHighCount() != null)
            sb.append("NonCompliantHighCount: ").append(getNonCompliantHighCount()).append(",");
        if (getCompliantLowCount() != null)
            sb.append("CompliantLowCount: ").append(getCompliantLowCount()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getPatchBaselineId() != null)
            sb.append("PatchBaselineId: ").append(getPatchBaselineId()).append(",");
        if (getOverallSeverity() != null)
            sb.append("OverallSeverity: ").append(getOverallSeverity()).append(",");
        if (getNonCompliantMediumCount() != null)
            sb.append("NonCompliantMediumCount: ").append(getNonCompliantMediumCount()).append(",");
        if (getNonCompliantUnspecifiedCount() != null)
            sb.append("NonCompliantUnspecifiedCount: ").append(getNonCompliantUnspecifiedCount()).append(",");
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSsmComplianceSummary == false)
            return false;
        AwsSsmComplianceSummary other = (AwsSsmComplianceSummary) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCompliantCriticalCount() == null ^ this.getCompliantCriticalCount() == null)
            return false;
        if (other.getCompliantCriticalCount() != null && other.getCompliantCriticalCount().equals(this.getCompliantCriticalCount()) == false)
            return false;
        if (other.getCompliantHighCount() == null ^ this.getCompliantHighCount() == null)
            return false;
        if (other.getCompliantHighCount() != null && other.getCompliantHighCount().equals(this.getCompliantHighCount()) == false)
            return false;
        if (other.getCompliantMediumCount() == null ^ this.getCompliantMediumCount() == null)
            return false;
        if (other.getCompliantMediumCount() != null && other.getCompliantMediumCount().equals(this.getCompliantMediumCount()) == false)
            return false;
        if (other.getExecutionType() == null ^ this.getExecutionType() == null)
            return false;
        if (other.getExecutionType() != null && other.getExecutionType().equals(this.getExecutionType()) == false)
            return false;
        if (other.getNonCompliantCriticalCount() == null ^ this.getNonCompliantCriticalCount() == null)
            return false;
        if (other.getNonCompliantCriticalCount() != null && other.getNonCompliantCriticalCount().equals(this.getNonCompliantCriticalCount()) == false)
            return false;
        if (other.getCompliantInformationalCount() == null ^ this.getCompliantInformationalCount() == null)
            return false;
        if (other.getCompliantInformationalCount() != null && other.getCompliantInformationalCount().equals(this.getCompliantInformationalCount()) == false)
            return false;
        if (other.getNonCompliantInformationalCount() == null ^ this.getNonCompliantInformationalCount() == null)
            return false;
        if (other.getNonCompliantInformationalCount() != null
                && other.getNonCompliantInformationalCount().equals(this.getNonCompliantInformationalCount()) == false)
            return false;
        if (other.getCompliantUnspecifiedCount() == null ^ this.getCompliantUnspecifiedCount() == null)
            return false;
        if (other.getCompliantUnspecifiedCount() != null && other.getCompliantUnspecifiedCount().equals(this.getCompliantUnspecifiedCount()) == false)
            return false;
        if (other.getNonCompliantLowCount() == null ^ this.getNonCompliantLowCount() == null)
            return false;
        if (other.getNonCompliantLowCount() != null && other.getNonCompliantLowCount().equals(this.getNonCompliantLowCount()) == false)
            return false;
        if (other.getNonCompliantHighCount() == null ^ this.getNonCompliantHighCount() == null)
            return false;
        if (other.getNonCompliantHighCount() != null && other.getNonCompliantHighCount().equals(this.getNonCompliantHighCount()) == false)
            return false;
        if (other.getCompliantLowCount() == null ^ this.getCompliantLowCount() == null)
            return false;
        if (other.getCompliantLowCount() != null && other.getCompliantLowCount().equals(this.getCompliantLowCount()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getPatchBaselineId() == null ^ this.getPatchBaselineId() == null)
            return false;
        if (other.getPatchBaselineId() != null && other.getPatchBaselineId().equals(this.getPatchBaselineId()) == false)
            return false;
        if (other.getOverallSeverity() == null ^ this.getOverallSeverity() == null)
            return false;
        if (other.getOverallSeverity() != null && other.getOverallSeverity().equals(this.getOverallSeverity()) == false)
            return false;
        if (other.getNonCompliantMediumCount() == null ^ this.getNonCompliantMediumCount() == null)
            return false;
        if (other.getNonCompliantMediumCount() != null && other.getNonCompliantMediumCount().equals(this.getNonCompliantMediumCount()) == false)
            return false;
        if (other.getNonCompliantUnspecifiedCount() == null ^ this.getNonCompliantUnspecifiedCount() == null)
            return false;
        if (other.getNonCompliantUnspecifiedCount() != null && other.getNonCompliantUnspecifiedCount().equals(this.getNonCompliantUnspecifiedCount()) == false)
            return false;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCompliantCriticalCount() == null) ? 0 : getCompliantCriticalCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantHighCount() == null) ? 0 : getCompliantHighCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantMediumCount() == null) ? 0 : getCompliantMediumCount().hashCode());
        hashCode = prime * hashCode + ((getExecutionType() == null) ? 0 : getExecutionType().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantCriticalCount() == null) ? 0 : getNonCompliantCriticalCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantInformationalCount() == null) ? 0 : getCompliantInformationalCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantInformationalCount() == null) ? 0 : getNonCompliantInformationalCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantUnspecifiedCount() == null) ? 0 : getCompliantUnspecifiedCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantLowCount() == null) ? 0 : getNonCompliantLowCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantHighCount() == null) ? 0 : getNonCompliantHighCount().hashCode());
        hashCode = prime * hashCode + ((getCompliantLowCount() == null) ? 0 : getCompliantLowCount().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getPatchBaselineId() == null) ? 0 : getPatchBaselineId().hashCode());
        hashCode = prime * hashCode + ((getOverallSeverity() == null) ? 0 : getOverallSeverity().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantMediumCount() == null) ? 0 : getNonCompliantMediumCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantUnspecifiedCount() == null) ? 0 : getNonCompliantUnspecifiedCount().hashCode());
        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        return hashCode;
    }

    @Override
    public AwsSsmComplianceSummary clone() {
        try {
            return (AwsSsmComplianceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSsmComplianceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
