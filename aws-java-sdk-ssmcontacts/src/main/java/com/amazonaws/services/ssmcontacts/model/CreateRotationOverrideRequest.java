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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CreateRotationOverride"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRotationOverrideRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to create an override for.
     * </p>
     */
    private String rotationId;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with.
     * </p>
     * <p>
     * If you want to include any current team members in the override shift, you must include their ARNs in the new
     * contact ID list.
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
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to create an override for.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to create an override for.
     */

    public void setRotationId(String rotationId) {
        this.rotationId = rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to create an override for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rotation to create an override for.
     */

    public String getRotationId() {
        return this.rotationId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rotation to create an override for.
     * </p>
     * 
     * @param rotationId
     *        The Amazon Resource Name (ARN) of the rotation to create an override for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationOverrideRequest withRotationId(String rotationId) {
        setRotationId(rotationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with.
     * </p>
     * <p>
     * If you want to include any current team members in the override shift, you must include their ARNs in the new
     * contact ID list.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation
     *         with.</p>
     *         <p>
     *         If you want to include any current team members in the override shift, you must include their ARNs in the
     *         new contact ID list.
     */

    public java.util.List<String> getNewContactIds() {
        return newContactIds;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with.
     * </p>
     * <p>
     * If you want to include any current team members in the override shift, you must include their ARNs in the new
     * contact ID list.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation
     *        with.</p>
     *        <p>
     *        If you want to include any current team members in the override shift, you must include their ARNs in the
     *        new contact ID list.
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
     * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with.
     * </p>
     * <p>
     * If you want to include any current team members in the override shift, you must include their ARNs in the new
     * contact ID list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewContactIds(java.util.Collection)} or {@link #withNewContactIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation
     *        with.</p>
     *        <p>
     *        If you want to include any current team members in the override shift, you must include their ARNs in the
     *        new contact ID list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationOverrideRequest withNewContactIds(String... newContactIds) {
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
     * The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation with.
     * </p>
     * <p>
     * If you want to include any current team members in the override shift, you must include their ARNs in the new
     * contact ID list.
     * </p>
     * 
     * @param newContactIds
     *        The Amazon Resource Names (ARNs) of the contacts to replace those in the current on-call rotation
     *        with.</p>
     *        <p>
     *        If you want to include any current team members in the override shift, you must include their ARNs in the
     *        new contact ID list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationOverrideRequest withNewContactIds(java.util.Collection<String> newContactIds) {
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

    public CreateRotationOverrideRequest withStartTime(java.util.Date startTime) {
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

    public CreateRotationOverrideRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token that ensures that the operation is called only once with the specified details.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @return A token that ensures that the operation is called only once with the specified details.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A token that ensures that the operation is called only once with the specified details.
     * </p>
     * 
     * @param idempotencyToken
     *        A token that ensures that the operation is called only once with the specified details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRotationOverrideRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getRotationId() != null)
            sb.append("RotationId: ").append(getRotationId()).append(",");
        if (getNewContactIds() != null)
            sb.append("NewContactIds: ").append(getNewContactIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRotationOverrideRequest == false)
            return false;
        CreateRotationOverrideRequest other = (CreateRotationOverrideRequest) obj;
        if (other.getRotationId() == null ^ this.getRotationId() == null)
            return false;
        if (other.getRotationId() != null && other.getRotationId().equals(this.getRotationId()) == false)
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
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRotationId() == null) ? 0 : getRotationId().hashCode());
        hashCode = prime * hashCode + ((getNewContactIds() == null) ? 0 : getNewContactIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRotationOverrideRequest clone() {
        return (CreateRotationOverrideRequest) super.clone();
    }

}
