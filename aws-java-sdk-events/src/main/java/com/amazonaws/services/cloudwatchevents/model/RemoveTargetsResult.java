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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/RemoveTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of failed entries.
     * </p>
     */
    private Integer failedEntryCount;
    /**
     * <p>
     * The failed target entries.
     * </p>
     */
    private java.util.List<RemoveTargetsResultEntry> failedEntries;

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of failed entries.
     */

    public void setFailedEntryCount(Integer failedEntryCount) {
        this.failedEntryCount = failedEntryCount;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @return The number of failed entries.
     */

    public Integer getFailedEntryCount() {
        return this.failedEntryCount;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of failed entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResult withFailedEntryCount(Integer failedEntryCount) {
        setFailedEntryCount(failedEntryCount);
        return this;
    }

    /**
     * <p>
     * The failed target entries.
     * </p>
     * 
     * @return The failed target entries.
     */

    public java.util.List<RemoveTargetsResultEntry> getFailedEntries() {
        return failedEntries;
    }

    /**
     * <p>
     * The failed target entries.
     * </p>
     * 
     * @param failedEntries
     *        The failed target entries.
     */

    public void setFailedEntries(java.util.Collection<RemoveTargetsResultEntry> failedEntries) {
        if (failedEntries == null) {
            this.failedEntries = null;
            return;
        }

        this.failedEntries = new java.util.ArrayList<RemoveTargetsResultEntry>(failedEntries);
    }

    /**
     * <p>
     * The failed target entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedEntries(java.util.Collection)} or {@link #withFailedEntries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedEntries
     *        The failed target entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResult withFailedEntries(RemoveTargetsResultEntry... failedEntries) {
        if (this.failedEntries == null) {
            setFailedEntries(new java.util.ArrayList<RemoveTargetsResultEntry>(failedEntries.length));
        }
        for (RemoveTargetsResultEntry ele : failedEntries) {
            this.failedEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The failed target entries.
     * </p>
     * 
     * @param failedEntries
     *        The failed target entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTargetsResult withFailedEntries(java.util.Collection<RemoveTargetsResultEntry> failedEntries) {
        setFailedEntries(failedEntries);
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
        if (getFailedEntryCount() != null)
            sb.append("FailedEntryCount: ").append(getFailedEntryCount()).append(",");
        if (getFailedEntries() != null)
            sb.append("FailedEntries: ").append(getFailedEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTargetsResult == false)
            return false;
        RemoveTargetsResult other = (RemoveTargetsResult) obj;
        if (other.getFailedEntryCount() == null ^ this.getFailedEntryCount() == null)
            return false;
        if (other.getFailedEntryCount() != null && other.getFailedEntryCount().equals(this.getFailedEntryCount()) == false)
            return false;
        if (other.getFailedEntries() == null ^ this.getFailedEntries() == null)
            return false;
        if (other.getFailedEntries() != null && other.getFailedEntries().equals(this.getFailedEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedEntryCount() == null) ? 0 : getFailedEntryCount().hashCode());
        hashCode = prime * hashCode + ((getFailedEntries() == null) ? 0 : getFailedEntries().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTargetsResult clone() {
        try {
            return (RemoveTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
