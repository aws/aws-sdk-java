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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a conversion task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ConversionTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversionTask implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     */
    private String conversionTaskId;
    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel
     * the task.
     * </p>
     */
    private String expirationTime;
    /**
     * <p>
     * If the task is for importing an instance, this contains information about the import instance task.
     * </p>
     */
    private ImportInstanceTaskDetails importInstance;
    /**
     * <p>
     * If the task is for importing a volume, this contains information about the import volume task.
     * </p>
     */
    private ImportVolumeTaskDetails importVolume;
    /**
     * <p>
     * The state of the conversion task.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @param conversionTaskId
     *        The ID of the conversion task.
     */

    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @return The ID of the conversion task.
     */

    public String getConversionTaskId() {
        return this.conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * 
     * @param conversionTaskId
     *        The ID of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withConversionTaskId(String conversionTaskId) {
        setConversionTaskId(conversionTaskId);
        return this;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel
     * the task.
     * </p>
     * 
     * @param expirationTime
     *        The time when the task expires. If the upload isn't complete before the expiration time, we automatically
     *        cancel the task.
     */

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel
     * the task.
     * </p>
     * 
     * @return The time when the task expires. If the upload isn't complete before the expiration time, we automatically
     *         cancel the task.
     */

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The time when the task expires. If the upload isn't complete before the expiration time, we automatically cancel
     * the task.
     * </p>
     * 
     * @param expirationTime
     *        The time when the task expires. If the upload isn't complete before the expiration time, we automatically
     *        cancel the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withExpirationTime(String expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about the import instance task.
     * </p>
     * 
     * @param importInstance
     *        If the task is for importing an instance, this contains information about the import instance task.
     */

    public void setImportInstance(ImportInstanceTaskDetails importInstance) {
        this.importInstance = importInstance;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about the import instance task.
     * </p>
     * 
     * @return If the task is for importing an instance, this contains information about the import instance task.
     */

    public ImportInstanceTaskDetails getImportInstance() {
        return this.importInstance;
    }

    /**
     * <p>
     * If the task is for importing an instance, this contains information about the import instance task.
     * </p>
     * 
     * @param importInstance
     *        If the task is for importing an instance, this contains information about the import instance task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withImportInstance(ImportInstanceTaskDetails importInstance) {
        setImportInstance(importInstance);
        return this;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about the import volume task.
     * </p>
     * 
     * @param importVolume
     *        If the task is for importing a volume, this contains information about the import volume task.
     */

    public void setImportVolume(ImportVolumeTaskDetails importVolume) {
        this.importVolume = importVolume;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about the import volume task.
     * </p>
     * 
     * @return If the task is for importing a volume, this contains information about the import volume task.
     */

    public ImportVolumeTaskDetails getImportVolume() {
        return this.importVolume;
    }

    /**
     * <p>
     * If the task is for importing a volume, this contains information about the import volume task.
     * </p>
     * 
     * @param importVolume
     *        If the task is for importing a volume, this contains information about the import volume task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withImportVolume(ImportVolumeTaskDetails importVolume) {
        setImportVolume(importVolume);
        return this;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * 
     * @param state
     *        The state of the conversion task.
     * @see ConversionTaskState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * 
     * @return The state of the conversion task.
     * @see ConversionTaskState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * 
     * @param state
     *        The state of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversionTaskState
     */

    public ConversionTask withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * 
     * @param state
     *        The state of the conversion task.
     * @see ConversionTaskState
     */

    public void setState(ConversionTaskState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the conversion task.
     * </p>
     * 
     * @param state
     *        The state of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConversionTaskState
     */

    public ConversionTask withState(ConversionTaskState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     * 
     * @param statusMessage
     *        The status message related to the conversion task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     * 
     * @return The status message related to the conversion task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message related to the conversion task.
     * </p>
     * 
     * @param statusMessage
     *        The status message related to the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     * 
     * @return Any tags assigned to the task.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the task.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the task.
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
     * Any tags assigned to the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withTags(Tag... tags) {
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
     * Any tags assigned to the task.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversionTask withTags(java.util.Collection<Tag> tags) {
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
        if (getConversionTaskId() != null)
            sb.append("ConversionTaskId: ").append(getConversionTaskId()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getImportInstance() != null)
            sb.append("ImportInstance: ").append(getImportInstance()).append(",");
        if (getImportVolume() != null)
            sb.append("ImportVolume: ").append(getImportVolume()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
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

        if (obj instanceof ConversionTask == false)
            return false;
        ConversionTask other = (ConversionTask) obj;
        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null)
            return false;
        if (other.getConversionTaskId() != null && other.getConversionTaskId().equals(this.getConversionTaskId()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getImportInstance() == null ^ this.getImportInstance() == null)
            return false;
        if (other.getImportInstance() != null && other.getImportInstance().equals(this.getImportInstance()) == false)
            return false;
        if (other.getImportVolume() == null ^ this.getImportVolume() == null)
            return false;
        if (other.getImportVolume() != null && other.getImportVolume().equals(this.getImportVolume()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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

        hashCode = prime * hashCode + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getImportInstance() == null) ? 0 : getImportInstance().hashCode());
        hashCode = prime * hashCode + ((getImportVolume() == null) ? 0 : getImportVolume().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ConversionTask clone() {
        try {
            return (ConversionTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
