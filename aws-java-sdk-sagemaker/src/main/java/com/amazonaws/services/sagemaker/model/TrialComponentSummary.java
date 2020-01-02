/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the properties of a trial component. To get all the properties, call the <a>DescribeTrialComponent</a>
 * API and provide the <code>TrialComponentName</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trial component.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     */
    private String trialComponentArn;
    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     */
    private String displayName;

    private TrialComponentSource trialComponentSource;
    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     */
    private TrialComponentStatus status;
    /**
     * <p>
     * When the component started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the component ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Who created the component.
     * </p>
     */
    private UserContext createdBy;
    /**
     * <p>
     * When the component was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Who last modified the component.
     * </p>
     */
    private UserContext lastModifiedBy;

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @return The name of the trial component.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The ARN of the trial component.
     */

    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @return The ARN of the trial component.
     */

    public String getTrialComponentArn() {
        return this.trialComponentArn;
    }

    /**
     * <p>
     * The ARN of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The ARN of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withTrialComponentArn(String trialComponentArn) {
        setTrialComponentArn(trialComponentArn);
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @return The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *         <code>TrialComponentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param trialComponentSource
     */

    public void setTrialComponentSource(TrialComponentSource trialComponentSource) {
        this.trialComponentSource = trialComponentSource;
    }

    /**
     * @return
     */

    public TrialComponentSource getTrialComponentSource() {
        return this.trialComponentSource;
    }

    /**
     * @param trialComponentSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withTrialComponentSource(TrialComponentSource trialComponentSource) {
        setTrialComponentSource(trialComponentSource);
        return this;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Completed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     */

    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the component. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         InProgress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Completed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed
     *         </p>
     *         </li>
     */

    public TrialComponentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Completed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withStatus(TrialComponentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @return When the component started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @return When the component ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @return When the component was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @param createdBy
     *        Who created the component.
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @return Who created the component.
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @param createdBy
     *        Who created the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @return When the component was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the component.
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @return Who last modified the component.
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentSummary withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: ").append(getTrialComponentArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getTrialComponentSource() != null)
            sb.append("TrialComponentSource: ").append(getTrialComponentSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentSummary == false)
            return false;
        TrialComponentSummary other = (TrialComponentSummary) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getTrialComponentSource() == null ^ this.getTrialComponentSource() == null)
            return false;
        if (other.getTrialComponentSource() != null && other.getTrialComponentSource().equals(this.getTrialComponentSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentSource() == null) ? 0 : getTrialComponentSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentSummary clone() {
        try {
            return (TrialComponentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
