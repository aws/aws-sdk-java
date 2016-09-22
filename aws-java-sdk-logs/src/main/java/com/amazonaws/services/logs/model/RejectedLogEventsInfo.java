/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class RejectedLogEventsInfo implements Serializable, Cloneable {

    private Integer tooNewLogEventStartIndex;

    private Integer tooOldLogEventEndIndex;

    private Integer expiredLogEventEndIndex;

    /**
     * @param tooNewLogEventStartIndex
     */

    public void setTooNewLogEventStartIndex(Integer tooNewLogEventStartIndex) {
        this.tooNewLogEventStartIndex = tooNewLogEventStartIndex;
    }

    /**
     * @return
     */

    public Integer getTooNewLogEventStartIndex() {
        return this.tooNewLogEventStartIndex;
    }

    /**
     * @param tooNewLogEventStartIndex
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedLogEventsInfo withTooNewLogEventStartIndex(Integer tooNewLogEventStartIndex) {
        setTooNewLogEventStartIndex(tooNewLogEventStartIndex);
        return this;
    }

    /**
     * @param tooOldLogEventEndIndex
     */

    public void setTooOldLogEventEndIndex(Integer tooOldLogEventEndIndex) {
        this.tooOldLogEventEndIndex = tooOldLogEventEndIndex;
    }

    /**
     * @return
     */

    public Integer getTooOldLogEventEndIndex() {
        return this.tooOldLogEventEndIndex;
    }

    /**
     * @param tooOldLogEventEndIndex
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedLogEventsInfo withTooOldLogEventEndIndex(Integer tooOldLogEventEndIndex) {
        setTooOldLogEventEndIndex(tooOldLogEventEndIndex);
        return this;
    }

    /**
     * @param expiredLogEventEndIndex
     */

    public void setExpiredLogEventEndIndex(Integer expiredLogEventEndIndex) {
        this.expiredLogEventEndIndex = expiredLogEventEndIndex;
    }

    /**
     * @return
     */

    public Integer getExpiredLogEventEndIndex() {
        return this.expiredLogEventEndIndex;
    }

    /**
     * @param expiredLogEventEndIndex
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectedLogEventsInfo withExpiredLogEventEndIndex(Integer expiredLogEventEndIndex) {
        setExpiredLogEventEndIndex(expiredLogEventEndIndex);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTooNewLogEventStartIndex() != null)
            sb.append("TooNewLogEventStartIndex: " + getTooNewLogEventStartIndex() + ",");
        if (getTooOldLogEventEndIndex() != null)
            sb.append("TooOldLogEventEndIndex: " + getTooOldLogEventEndIndex() + ",");
        if (getExpiredLogEventEndIndex() != null)
            sb.append("ExpiredLogEventEndIndex: " + getExpiredLogEventEndIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectedLogEventsInfo == false)
            return false;
        RejectedLogEventsInfo other = (RejectedLogEventsInfo) obj;
        if (other.getTooNewLogEventStartIndex() == null ^ this.getTooNewLogEventStartIndex() == null)
            return false;
        if (other.getTooNewLogEventStartIndex() != null && other.getTooNewLogEventStartIndex().equals(this.getTooNewLogEventStartIndex()) == false)
            return false;
        if (other.getTooOldLogEventEndIndex() == null ^ this.getTooOldLogEventEndIndex() == null)
            return false;
        if (other.getTooOldLogEventEndIndex() != null && other.getTooOldLogEventEndIndex().equals(this.getTooOldLogEventEndIndex()) == false)
            return false;
        if (other.getExpiredLogEventEndIndex() == null ^ this.getExpiredLogEventEndIndex() == null)
            return false;
        if (other.getExpiredLogEventEndIndex() != null && other.getExpiredLogEventEndIndex().equals(this.getExpiredLogEventEndIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTooNewLogEventStartIndex() == null) ? 0 : getTooNewLogEventStartIndex().hashCode());
        hashCode = prime * hashCode + ((getTooOldLogEventEndIndex() == null) ? 0 : getTooOldLogEventEndIndex().hashCode());
        hashCode = prime * hashCode + ((getExpiredLogEventEndIndex() == null) ? 0 : getExpiredLogEventEndIndex().hashCode());
        return hashCode;
    }

    @Override
    public RejectedLogEventsInfo clone() {
        try {
            return (RejectedLogEventsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
