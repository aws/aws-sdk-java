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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/GetRotationOverride" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRotationOverrideResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the override to an on-call rotation.
     * </p>
     */
    private String rotationOverrideId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     * </p>
     */
    private String rotationArn;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * </p>
     */
    private java.util.List<String> newContactIds;
    /**
     * <p>
     * The date and time when the override goes into effect.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time when the override ends.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The date and time when the override was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the override to an on-call rotation.
     * </p>
     * 
     * @param rotationOverrideId
     *        The Amazon Resource Name (ARN) of the override to an on-call rotation.
     */

    public void setRotationOverrideId(String rotationOverrideId) {
        this.rotationOverrideId = rotationOverrideId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the override to an on-call rotation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the override to an on-call rotation.
     */

    public String getRotationOverrideId() {
        return this.rotationOverrideId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the override to an on-call rotation.
     * </p>
     * 
     * @param rotationOverrideId
     *        The Amazon Resource Name (ARN) of the override to an on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withRotationOverrideId(String rotationOverrideId) {
        setRotationOverrideId(rotationOverrideId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     */

    public void setRotationArn(String rotationArn) {
        this.rotationArn = rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     */

    public String getRotationArn() {
        return this.rotationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     * </p>
     * 
     * @param rotationArn
     *        The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withRotationArn(String rotationArn) {
        setRotationArn(rotationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     */

    public java.util.List<String> getNewContactIds() {
        return newContactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     */

    public void setNewContactIds(java.util.Collection<String> newContactIds) {
        if (newContactIds == null) {
            this.newContactIds = null;
            return;
        }

        this.newContactIds = new java.util.ArrayList<String>(newContactIds);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewContactIds(java.util.Collection)} or {@link #withNewContactIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withNewContactIds(String... newContactIds) {
        if (this.newContactIds == null) {
            setNewContactIds(new java.util.ArrayList<String>(newContactIds.length));
        }
        for (String ele : newContactIds) {
            this.newContactIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withNewContactIds(java.util.Collection<String> newContactIds) {
        setNewContactIds(newContactIds);
        return this;
    }

    /**
     * <p>
     * The date and time when the override goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time when the override goes into effect.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the override goes into effect.
     * </p>
     * 
     * @return The date and time when the override goes into effect.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the override goes into effect.
     * </p>
     * 
     * @param startTime
     *        The date and time when the override goes into effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the override ends.
     * </p>
     * 
     * @param endTime
     *        The date and time when the override ends.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time when the override ends.
     * </p>
     * 
     * @return The date and time when the override ends.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time when the override ends.
     * </p>
     * 
     * @param endTime
     *        The date and time when the override ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the override was created.
     * </p>
     * 
     * @param createTime
     *        The date and time when the override was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time when the override was created.
     * </p>
     * 
     * @return The date and time when the override was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time when the override was created.
     * </p>
     * 
     * @param createTime
     *        The date and time when the override was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRotationOverrideResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
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
        if (getRotationOverrideId() != null)
            sb.append("RotationOverrideId: ").append(getRotationOverrideId()).append(",");
        if (getRotationArn() != null)
            sb.append("RotationArn: ").append(getRotationArn()).append(",");
        if (getNewContactIds() != null)
            sb.append("NewContactIds: ").append(getNewContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRotationOverrideResult == false)
            return false;
        GetRotationOverrideResult other = (GetRotationOverrideResult) obj;
        if (other.getRotationOverrideId() == null ^ this.getRotationOverrideId() == null)
            return false;
        if (other.getRotationOverrideId() != null && other.getRotationOverrideId().equals(this.getRotationOverrideId()) == false)
            return false;
        if (other.getRotationArn() == null ^ this.getRotationArn() == null)
            return false;
        if (other.getRotationArn() != null && other.getRotationArn().equals(this.getRotationArn()) == false)
            return false;
        if (other.getNewContactIds() == null ^ this.getNewContactIds() == null)
            return false;
        if (other.getNewContactIds() != null && other.getNewContactIds().equals(this.getNewContactIds()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationOverrideId() == null) ? 0 : getRotationOverrideId().hashCode());
        hashCode = prime * hashCode + ((getRotationArn() == null) ? 0 : getRotationArn().hashCode());
        hashCode = prime * hashCode + ((getNewContactIds() == null) ? 0 : getNewContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetRotationOverrideResult clone() {
        try {
            return (GetRotationOverrideResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
