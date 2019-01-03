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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The StackSummary Data Type
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSummary implements Serializable, Cloneable {

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     */
    private String templateDescription;
    /**
     * <p>
     * The time the stack was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     */
    private java.util.Date deletionTime;
    /**
     * <p>
     * The current status of the stack.
     * </p>
     */
    private String stackStatus;
    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;
    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String rootId;
    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackDriftInformationSummary driftInformation;

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @param stackId
     *        Unique stack identifier.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @return Unique stack identifier.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Unique stack identifier.
     * </p>
     * 
     * @param stackId
     *        Unique stack identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @return The name associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @param templateDescription
     *        The template description of the template used to create the stack.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @return The template description of the template used to create the stack.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * The template description of the template used to create the stack.
     * </p>
     * 
     * @param templateDescription
     *        The template description of the template used to create the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
        return this;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time the stack was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @return The time the stack was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @return The time the stack was last updated. This field will only be returned if the stack has been updated at
     *         least once.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     */

    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @return The time the stack was deleted.
     */

    public java.util.Date getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withDeletionTime(java.util.Date deletionTime) {
        setDeletionTime(deletionTime);
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @return The current status of the stack.
     * @see StackStatus
     */

    public String getStackStatus() {
        return this.stackStatus;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public StackSummary withStackStatus(String stackStatus) {
        setStackStatus(stackStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(StackStatus stackStatus) {
        withStackStatus(stackStatus);
    }

    /**
     * <p>
     * The current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        The current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public StackSummary withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/Failure message associated with the stack status.
     */

    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @return Success/Failure message associated with the stack status.
     */

    public String getStackStatusReason() {
        return this.stackStatusReason;
    }

    /**
     * <p>
     * Success/Failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/Failure message associated with the stack status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withStackStatusReason(String stackStatusReason) {
        setStackStatusReason(stackStatusReason);
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param parentId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *        this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *         this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *         with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param parentId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *        this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param rootId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *        to which the nested stack ultimately belongs.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *         to which the nested stack ultimately belongs.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *         with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getRootId() {
        return this.rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param rootId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *        to which the nested stack ultimately belongs.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withRootId(String rootId) {
        setRootId(rootId);
        return this;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     *        expected configuration, as defined in the stack template and any values specified as template parameters.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public void setDriftInformation(StackDriftInformationSummary driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @return Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from
     *         it's expected configuration, as defined in the stack template and any values specified as template
     *         parameters. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *         Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public StackDriftInformationSummary getDriftInformation() {
        return this.driftInformation;
    }

    /**
     * <p>
     * Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     * expected configuration, as defined in the stack template and any values specified as template parameters. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Summarizes information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's
     *        expected configuration, as defined in the stack template and any values specified as template parameters.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSummary withDriftInformation(StackDriftInformationSummary driftInformation) {
        setDriftInformation(driftInformation);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: ").append(getTemplateDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: ").append(getDeletionTime()).append(",");
        if (getStackStatus() != null)
            sb.append("StackStatus: ").append(getStackStatus()).append(",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: ").append(getStackStatusReason()).append(",");
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
        if (getRootId() != null)
            sb.append("RootId: ").append(getRootId()).append(",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: ").append(getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSummary == false)
            return false;
        StackSummary other = (StackSummary) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public StackSummary clone() {
        try {
            return (StackSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
