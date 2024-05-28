/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides an overview of the patch compliance status for an instance against a selected compliance standard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/PatchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the compliance standard that was used to determine the patch compliance status.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The number of patches from the compliance standard that were installed successfully.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer installedCount;
    /**
     * <p>
     * The number of patches that are part of the compliance standard but are not installed. The count includes patches
     * that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer missingCount;
    /**
     * <p>
     * The number of patches from the compliance standard that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer failedCount;
    /**
     * <p>
     * The number of installed patches that are not part of the compliance standard.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer installedOtherCount;
    /**
     * <p>
     * The number of patches that are installed but are also on a list of patches that the customer rejected.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer installedRejectedCount;
    /**
     * <p>
     * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as
     * installed.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     */
    private Integer installedPendingReboot;
    /**
     * <p>
     * Indicates when the operation started.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String operationStartTime;
    /**
     * <p>
     * Indicates when the operation completed.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String operationEndTime;
    /**
     * <p>
     * The reboot option specified for the instance.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     */
    private String rebootOption;
    /**
     * <p>
     * The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     * <code>INSTALL</code>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     */
    private String operation;

    /**
     * <p>
     * The identifier of the compliance standard that was used to determine the patch compliance status.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param id
     *        The identifier of the compliance standard that was used to determine the patch compliance status.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the compliance standard that was used to determine the patch compliance status.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @return The identifier of the compliance standard that was used to determine the patch compliance status.</p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the compliance standard that was used to determine the patch compliance status.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param id
     *        The identifier of the compliance standard that was used to determine the patch compliance status.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that were installed successfully.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedCount
     *        The number of patches from the compliance standard that were installed successfully.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that were installed successfully.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of patches from the compliance standard that were installed successfully.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getInstalledCount() {
        return this.installedCount;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that were installed successfully.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedCount
     *        The number of patches from the compliance standard that were installed successfully.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withInstalledCount(Integer installedCount) {
        setInstalledCount(installedCount);
        return this;
    }

    /**
     * <p>
     * The number of patches that are part of the compliance standard but are not installed. The count includes patches
     * that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param missingCount
     *        The number of patches that are part of the compliance standard but are not installed. The count includes
     *        patches that failed to install.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setMissingCount(Integer missingCount) {
        this.missingCount = missingCount;
    }

    /**
     * <p>
     * The number of patches that are part of the compliance standard but are not installed. The count includes patches
     * that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of patches that are part of the compliance standard but are not installed. The count includes
     *         patches that failed to install.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getMissingCount() {
        return this.missingCount;
    }

    /**
     * <p>
     * The number of patches that are part of the compliance standard but are not installed. The count includes patches
     * that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param missingCount
     *        The number of patches that are part of the compliance standard but are not installed. The count includes
     *        patches that failed to install.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withMissingCount(Integer missingCount) {
        setMissingCount(missingCount);
        return this;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param failedCount
     *        The number of patches from the compliance standard that failed to install.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of patches from the compliance standard that failed to install.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * <p>
     * The number of patches from the compliance standard that failed to install.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param failedCount
     *        The number of patches from the compliance standard that failed to install.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withFailedCount(Integer failedCount) {
        setFailedCount(failedCount);
        return this;
    }

    /**
     * <p>
     * The number of installed patches that are not part of the compliance standard.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedOtherCount
     *        The number of installed patches that are not part of the compliance standard.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setInstalledOtherCount(Integer installedOtherCount) {
        this.installedOtherCount = installedOtherCount;
    }

    /**
     * <p>
     * The number of installed patches that are not part of the compliance standard.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of installed patches that are not part of the compliance standard.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getInstalledOtherCount() {
        return this.installedOtherCount;
    }

    /**
     * <p>
     * The number of installed patches that are not part of the compliance standard.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedOtherCount
     *        The number of installed patches that are not part of the compliance standard.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withInstalledOtherCount(Integer installedOtherCount) {
        setInstalledOtherCount(installedOtherCount);
        return this;
    }

    /**
     * <p>
     * The number of patches that are installed but are also on a list of patches that the customer rejected.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedRejectedCount
     *        The number of patches that are installed but are also on a list of patches that the customer rejected.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setInstalledRejectedCount(Integer installedRejectedCount) {
        this.installedRejectedCount = installedRejectedCount;
    }

    /**
     * <p>
     * The number of patches that are installed but are also on a list of patches that the customer rejected.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of patches that are installed but are also on a list of patches that the customer
     *         rejected.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getInstalledRejectedCount() {
        return this.installedRejectedCount;
    }

    /**
     * <p>
     * The number of patches that are installed but are also on a list of patches that the customer rejected.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedRejectedCount
     *        The number of patches that are installed but are also on a list of patches that the customer rejected.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withInstalledRejectedCount(Integer installedRejectedCount) {
        setInstalledRejectedCount(installedRejectedCount);
        return this;
    }

    /**
     * <p>
     * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as
     * installed.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedPendingReboot
     *        The number of patches that were applied, but that require the instance to be rebooted in order to be
     *        marked as installed.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public void setInstalledPendingReboot(Integer installedPendingReboot) {
        this.installedPendingReboot = installedPendingReboot;
    }

    /**
     * <p>
     * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as
     * installed.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @return The number of patches that were applied, but that require the instance to be rebooted in order to be
     *         marked as installed.</p>
     *         <p>
     *         The value can be an integer from <code>0</code> to <code>100000</code>.
     */

    public Integer getInstalledPendingReboot() {
        return this.installedPendingReboot;
    }

    /**
     * <p>
     * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as
     * installed.
     * </p>
     * <p>
     * The value can be an integer from <code>0</code> to <code>100000</code>.
     * </p>
     * 
     * @param installedPendingReboot
     *        The number of patches that were applied, but that require the instance to be rebooted in order to be
     *        marked as installed.</p>
     *        <p>
     *        The value can be an integer from <code>0</code> to <code>100000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withInstalledPendingReboot(Integer installedPendingReboot) {
        setInstalledPendingReboot(installedPendingReboot);
        return this;
    }

    /**
     * <p>
     * Indicates when the operation started.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStartTime
     *        Indicates when the operation started.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setOperationStartTime(String operationStartTime) {
        this.operationStartTime = operationStartTime;
    }

    /**
     * <p>
     * Indicates when the operation started.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates when the operation started.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getOperationStartTime() {
        return this.operationStartTime;
    }

    /**
     * <p>
     * Indicates when the operation started.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStartTime
     *        Indicates when the operation started.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withOperationStartTime(String operationStartTime) {
        setOperationStartTime(operationStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates when the operation completed.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationEndTime
     *        Indicates when the operation completed.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setOperationEndTime(String operationEndTime) {
        this.operationEndTime = operationEndTime;
    }

    /**
     * <p>
     * Indicates when the operation completed.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates when the operation completed.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getOperationEndTime() {
        return this.operationEndTime;
    }

    /**
     * <p>
     * Indicates when the operation completed.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationEndTime
     *        Indicates when the operation completed.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withOperationEndTime(String operationEndTime) {
        setOperationEndTime(operationEndTime);
        return this;
    }

    /**
     * <p>
     * The reboot option specified for the instance.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param rebootOption
     *        The reboot option specified for the instance.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public void setRebootOption(String rebootOption) {
        this.rebootOption = rebootOption;
    }

    /**
     * <p>
     * The reboot option specified for the instance.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @return The reboot option specified for the instance.</p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public String getRebootOption() {
        return this.rebootOption;
    }

    /**
     * <p>
     * The reboot option specified for the instance.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param rebootOption
     *        The reboot option specified for the instance.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withRebootOption(String rebootOption) {
        setRebootOption(rebootOption);
        return this;
    }

    /**
     * <p>
     * The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     * <code>INSTALL</code>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param operation
     *        The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     *        <code>INSTALL</code>.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     * <code>INSTALL</code>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @return The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     *         <code>INSTALL</code>.</p>
     *         <p>
     *         Length Constraints: Minimum length of 1. Maximum length of 256.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     * <code>INSTALL</code>.
     * </p>
     * <p>
     * Length Constraints: Minimum length of 1. Maximum length of 256.
     * </p>
     * 
     * @param operation
     *        The type of patch operation performed. For Patch Manager, the values are <code>SCAN</code> and
     *        <code>INSTALL</code>.</p>
     *        <p>
     *        Length Constraints: Minimum length of 1. Maximum length of 256.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchSummary withOperation(String operation) {
        setOperation(operation);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInstalledCount() != null)
            sb.append("InstalledCount: ").append(getInstalledCount()).append(",");
        if (getMissingCount() != null)
            sb.append("MissingCount: ").append(getMissingCount()).append(",");
        if (getFailedCount() != null)
            sb.append("FailedCount: ").append(getFailedCount()).append(",");
        if (getInstalledOtherCount() != null)
            sb.append("InstalledOtherCount: ").append(getInstalledOtherCount()).append(",");
        if (getInstalledRejectedCount() != null)
            sb.append("InstalledRejectedCount: ").append(getInstalledRejectedCount()).append(",");
        if (getInstalledPendingReboot() != null)
            sb.append("InstalledPendingReboot: ").append(getInstalledPendingReboot()).append(",");
        if (getOperationStartTime() != null)
            sb.append("OperationStartTime: ").append(getOperationStartTime()).append(",");
        if (getOperationEndTime() != null)
            sb.append("OperationEndTime: ").append(getOperationEndTime()).append(",");
        if (getRebootOption() != null)
            sb.append("RebootOption: ").append(getRebootOption()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchSummary == false)
            return false;
        PatchSummary other = (PatchSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInstalledCount() == null ^ this.getInstalledCount() == null)
            return false;
        if (other.getInstalledCount() != null && other.getInstalledCount().equals(this.getInstalledCount()) == false)
            return false;
        if (other.getMissingCount() == null ^ this.getMissingCount() == null)
            return false;
        if (other.getMissingCount() != null && other.getMissingCount().equals(this.getMissingCount()) == false)
            return false;
        if (other.getFailedCount() == null ^ this.getFailedCount() == null)
            return false;
        if (other.getFailedCount() != null && other.getFailedCount().equals(this.getFailedCount()) == false)
            return false;
        if (other.getInstalledOtherCount() == null ^ this.getInstalledOtherCount() == null)
            return false;
        if (other.getInstalledOtherCount() != null && other.getInstalledOtherCount().equals(this.getInstalledOtherCount()) == false)
            return false;
        if (other.getInstalledRejectedCount() == null ^ this.getInstalledRejectedCount() == null)
            return false;
        if (other.getInstalledRejectedCount() != null && other.getInstalledRejectedCount().equals(this.getInstalledRejectedCount()) == false)
            return false;
        if (other.getInstalledPendingReboot() == null ^ this.getInstalledPendingReboot() == null)
            return false;
        if (other.getInstalledPendingReboot() != null && other.getInstalledPendingReboot().equals(this.getInstalledPendingReboot()) == false)
            return false;
        if (other.getOperationStartTime() == null ^ this.getOperationStartTime() == null)
            return false;
        if (other.getOperationStartTime() != null && other.getOperationStartTime().equals(this.getOperationStartTime()) == false)
            return false;
        if (other.getOperationEndTime() == null ^ this.getOperationEndTime() == null)
            return false;
        if (other.getOperationEndTime() != null && other.getOperationEndTime().equals(this.getOperationEndTime()) == false)
            return false;
        if (other.getRebootOption() == null ^ this.getRebootOption() == null)
            return false;
        if (other.getRebootOption() != null && other.getRebootOption().equals(this.getRebootOption()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInstalledCount() == null) ? 0 : getInstalledCount().hashCode());
        hashCode = prime * hashCode + ((getMissingCount() == null) ? 0 : getMissingCount().hashCode());
        hashCode = prime * hashCode + ((getFailedCount() == null) ? 0 : getFailedCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledOtherCount() == null) ? 0 : getInstalledOtherCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledRejectedCount() == null) ? 0 : getInstalledRejectedCount().hashCode());
        hashCode = prime * hashCode + ((getInstalledPendingReboot() == null) ? 0 : getInstalledPendingReboot().hashCode());
        hashCode = prime * hashCode + ((getOperationStartTime() == null) ? 0 : getOperationStartTime().hashCode());
        hashCode = prime * hashCode + ((getOperationEndTime() == null) ? 0 : getOperationEndTime().hashCode());
        hashCode = prime * hashCode + ((getRebootOption() == null) ? 0 : getRebootOption().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public PatchSummary clone() {
        try {
            return (PatchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.PatchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
