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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about contacts and times that an on-call override replaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PreviewOverride" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PreviewOverride implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about contacts to add to an on-call rotation override.
     * </p>
     */
    private java.util.List<String> newMembers;
    /**
     * <p>
     * Information about the time a rotation override would begin.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Information about the time a rotation override would end.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * Information about contacts to add to an on-call rotation override.
     * </p>
     * 
     * @return Information about contacts to add to an on-call rotation override.
     */

    public java.util.List<String> getNewMembers() {
        return newMembers;
    }

    /**
     * <p>
     * Information about contacts to add to an on-call rotation override.
     * </p>
     * 
     * @param newMembers
     *        Information about contacts to add to an on-call rotation override.
     */

    public void setNewMembers(java.util.Collection<String> newMembers) {
        if (newMembers == null) {
            this.newMembers = null;
            return;
        }

        this.newMembers = new java.util.ArrayList<String>(newMembers);
    }

    /**
     * <p>
     * Information about contacts to add to an on-call rotation override.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewMembers(java.util.Collection)} or {@link #withNewMembers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param newMembers
     *        Information about contacts to add to an on-call rotation override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewOverride withNewMembers(String... newMembers) {
        if (this.newMembers == null) {
            setNewMembers(new java.util.ArrayList<String>(newMembers.length));
        }
        for (String ele : newMembers) {
            this.newMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about contacts to add to an on-call rotation override.
     * </p>
     * 
     * @param newMembers
     *        Information about contacts to add to an on-call rotation override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewOverride withNewMembers(java.util.Collection<String> newMembers) {
        setNewMembers(newMembers);
        return this;
    }

    /**
     * <p>
     * Information about the time a rotation override would begin.
     * </p>
     * 
     * @param startTime
     *        Information about the time a rotation override would begin.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Information about the time a rotation override would begin.
     * </p>
     * 
     * @return Information about the time a rotation override would begin.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Information about the time a rotation override would begin.
     * </p>
     * 
     * @param startTime
     *        Information about the time a rotation override would begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewOverride withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Information about the time a rotation override would end.
     * </p>
     * 
     * @param endTime
     *        Information about the time a rotation override would end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Information about the time a rotation override would end.
     * </p>
     * 
     * @return Information about the time a rotation override would end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Information about the time a rotation override would end.
     * </p>
     * 
     * @param endTime
     *        Information about the time a rotation override would end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PreviewOverride withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getNewMembers() != null)
            sb.append("NewMembers: ").append(getNewMembers()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PreviewOverride == false)
            return false;
        PreviewOverride other = (PreviewOverride) obj;
        if (other.getNewMembers() == null ^ this.getNewMembers() == null)
            return false;
        if (other.getNewMembers() != null && other.getNewMembers().equals(this.getNewMembers()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNewMembers() == null) ? 0 : getNewMembers().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public PreviewOverride clone() {
        try {
            return (PreviewOverride) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.PreviewOverrideMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
