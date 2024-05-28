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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the privacy budget template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/PrivacyBudgetTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrivacyBudgetTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The unique ID of the collaboration that contains this privacy budget template.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget template.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * The time at which the privacy budget template was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The most recent time at which the privacy budget template was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     */
    private String privacyBudgetType;
    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to automatically
     * get a new privacy budget for the collaboration every calendar month. Choosing this option allows arbitrary
     * amounts of information to be revealed about rows of the data when repeatedly queried across refreshes. Avoid
     * choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     */
    private String autoRefresh;
    /**
     * <p>
     * Specifies the epislon and noise parameters for the privacy budget template.
     * </p>
     */
    private PrivacyBudgetTemplateParametersOutput parameters;

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @param id
     *        The unique identifier of the privacy budget template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @return The unique identifier of the privacy budget template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the privacy budget template.
     * </p>
     * 
     * @param id
     *        The unique identifier of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @param arn
     *        The ARN of the privacy budget template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @return The ARN of the privacy budget template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the privacy budget template.
     * </p>
     * 
     * @param arn
     *        The ARN of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a membership resource.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @return The identifier for a membership resource.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The identifier for a membership resource.
     * </p>
     * 
     * @param membershipId
     *        The identifier for a membership resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     * </p>
     * 
     * @param membershipArn
     *        The Amazon Resource Name (ARN) of the member who created the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The unique ID of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID of the collaboration that contains this privacy budget template.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique ID of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @return The unique ID of the collaboration that contains this privacy budget template.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique ID of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID of the collaboration that contains this privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that contains this privacy budget template.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @return The ARN of the collaboration that contains this privacy budget template.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The ARN of the collaboration that contains this privacy budget template.
     * </p>
     * 
     * @param collaborationArn
     *        The ARN of the collaboration that contains this privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The time at which the privacy budget template was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the privacy budget template was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the privacy budget template was created.
     * </p>
     * 
     * @return The time at which the privacy budget template was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the privacy budget template was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the privacy budget template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget template was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the privacy budget template was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget template was updated.
     * </p>
     * 
     * @return The most recent time at which the privacy budget template was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the privacy budget template was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the privacy budget template was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public void setPrivacyBudgetType(String privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @return Specifies the type of the privacy budget template.
     * @see PrivacyBudgetType
     */

    public String getPrivacyBudgetType() {
        return this.privacyBudgetType;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public PrivacyBudgetTemplate withPrivacyBudgetType(String privacyBudgetType) {
        setPrivacyBudgetType(privacyBudgetType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the privacy budget template.
     * </p>
     * 
     * @param privacyBudgetType
     *        Specifies the type of the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetType
     */

    public PrivacyBudgetTemplate withPrivacyBudgetType(PrivacyBudgetType privacyBudgetType) {
        this.privacyBudgetType = privacyBudgetType.toString();
        return this;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to automatically
     * get a new privacy budget for the collaboration every calendar month. Choosing this option allows arbitrary
     * amounts of information to be revealed about rows of the data when repeatedly queried across refreshes. Avoid
     * choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queried
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public void setAutoRefresh(String autoRefresh) {
        this.autoRefresh = autoRefresh;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to automatically
     * get a new privacy budget for the collaboration every calendar month. Choosing this option allows arbitrary
     * amounts of information to be revealed about rows of the data when repeatedly queried across refreshes. Avoid
     * choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @return How often the privacy budget refreshes.</p> <important>
     *         <p>
     *         If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to
     *         automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *         allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queried
     *         across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *         refreshes.
     *         </p>
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public String getAutoRefresh() {
        return this.autoRefresh;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to automatically
     * get a new privacy budget for the collaboration every calendar month. Choosing this option allows arbitrary
     * amounts of information to be revealed about rows of the data when repeatedly queried across refreshes. Avoid
     * choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queried
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public PrivacyBudgetTemplate withAutoRefresh(String autoRefresh) {
        setAutoRefresh(autoRefresh);
        return this;
    }

    /**
     * <p>
     * How often the privacy budget refreshes.
     * </p>
     * <important>
     * <p>
     * If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to automatically
     * get a new privacy budget for the collaboration every calendar month. Choosing this option allows arbitrary
     * amounts of information to be revealed about rows of the data when repeatedly queried across refreshes. Avoid
     * choosing this if the same rows will be repeatedly queried between privacy budget refreshes.
     * </p>
     * </important>
     * 
     * @param autoRefresh
     *        How often the privacy budget refreshes.</p> <important>
     *        <p>
     *        If you plan to regularly bring new data into the collaboration, use <code>CALENDAR_MONTH</code> to
     *        automatically get a new privacy budget for the collaboration every calendar month. Choosing this option
     *        allows arbitrary amounts of information to be revealed about rows of the data when repeatedly queried
     *        across refreshes. Avoid choosing this if the same rows will be repeatedly queried between privacy budget
     *        refreshes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrivacyBudgetTemplateAutoRefresh
     */

    public PrivacyBudgetTemplate withAutoRefresh(PrivacyBudgetTemplateAutoRefresh autoRefresh) {
        this.autoRefresh = autoRefresh.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the epislon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies the epislon and noise parameters for the privacy budget template.
     */

    public void setParameters(PrivacyBudgetTemplateParametersOutput parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Specifies the epislon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @return Specifies the epislon and noise parameters for the privacy budget template.
     */

    public PrivacyBudgetTemplateParametersOutput getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Specifies the epislon and noise parameters for the privacy budget template.
     * </p>
     * 
     * @param parameters
     *        Specifies the epislon and noise parameters for the privacy budget template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrivacyBudgetTemplate withParameters(PrivacyBudgetTemplateParametersOutput parameters) {
        setParameters(parameters);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getPrivacyBudgetType() != null)
            sb.append("PrivacyBudgetType: ").append(getPrivacyBudgetType()).append(",");
        if (getAutoRefresh() != null)
            sb.append("AutoRefresh: ").append(getAutoRefresh()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivacyBudgetTemplate == false)
            return false;
        PrivacyBudgetTemplate other = (PrivacyBudgetTemplate) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getPrivacyBudgetType() == null ^ this.getPrivacyBudgetType() == null)
            return false;
        if (other.getPrivacyBudgetType() != null && other.getPrivacyBudgetType().equals(this.getPrivacyBudgetType()) == false)
            return false;
        if (other.getAutoRefresh() == null ^ this.getAutoRefresh() == null)
            return false;
        if (other.getAutoRefresh() != null && other.getAutoRefresh().equals(this.getAutoRefresh()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getPrivacyBudgetType() == null) ? 0 : getPrivacyBudgetType().hashCode());
        hashCode = prime * hashCode + ((getAutoRefresh() == null) ? 0 : getAutoRefresh().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public PrivacyBudgetTemplate clone() {
        try {
            return (PrivacyBudgetTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.PrivacyBudgetTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
