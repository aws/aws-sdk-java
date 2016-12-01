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
package com.amazonaws.services.xray.model;

import java.io.Serializable;

/**
 * <p>
 * </p>
 */
public class BackendConnectionErrors implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private Integer timeoutCount;
    /**
     * <p>
     * </p>
     */
    private Integer connectionRefusedCount;
    /**
     * <p>
     * </p>
     */
    private Integer hTTPCode4XXCount;
    /**
     * <p>
     * </p>
     */
    private Integer hTTPCode5XXCount;
    /**
     * <p>
     * </p>
     */
    private Integer unknownHostCount;
    /**
     * <p>
     * </p>
     */
    private Integer otherCount;

    /**
     * <p>
     * </p>
     * 
     * @param timeoutCount
     */

    public void setTimeoutCount(Integer timeoutCount) {
        this.timeoutCount = timeoutCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getTimeoutCount() {
        return this.timeoutCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param timeoutCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withTimeoutCount(Integer timeoutCount) {
        setTimeoutCount(timeoutCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param connectionRefusedCount
     */

    public void setConnectionRefusedCount(Integer connectionRefusedCount) {
        this.connectionRefusedCount = connectionRefusedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getConnectionRefusedCount() {
        return this.connectionRefusedCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param connectionRefusedCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withConnectionRefusedCount(Integer connectionRefusedCount) {
        setConnectionRefusedCount(connectionRefusedCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param hTTPCode4XXCount
     */

    public void setHTTPCode4XXCount(Integer hTTPCode4XXCount) {
        this.hTTPCode4XXCount = hTTPCode4XXCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getHTTPCode4XXCount() {
        return this.hTTPCode4XXCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param hTTPCode4XXCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withHTTPCode4XXCount(Integer hTTPCode4XXCount) {
        setHTTPCode4XXCount(hTTPCode4XXCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param hTTPCode5XXCount
     */

    public void setHTTPCode5XXCount(Integer hTTPCode5XXCount) {
        this.hTTPCode5XXCount = hTTPCode5XXCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getHTTPCode5XXCount() {
        return this.hTTPCode5XXCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param hTTPCode5XXCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withHTTPCode5XXCount(Integer hTTPCode5XXCount) {
        setHTTPCode5XXCount(hTTPCode5XXCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param unknownHostCount
     */

    public void setUnknownHostCount(Integer unknownHostCount) {
        this.unknownHostCount = unknownHostCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getUnknownHostCount() {
        return this.unknownHostCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param unknownHostCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withUnknownHostCount(Integer unknownHostCount) {
        setUnknownHostCount(unknownHostCount);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param otherCount
     */

    public void setOtherCount(Integer otherCount) {
        this.otherCount = otherCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public Integer getOtherCount() {
        return this.otherCount;
    }

    /**
     * <p>
     * </p>
     * 
     * @param otherCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackendConnectionErrors withOtherCount(Integer otherCount) {
        setOtherCount(otherCount);
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
        if (getTimeoutCount() != null)
            sb.append("TimeoutCount: " + getTimeoutCount() + ",");
        if (getConnectionRefusedCount() != null)
            sb.append("ConnectionRefusedCount: " + getConnectionRefusedCount() + ",");
        if (getHTTPCode4XXCount() != null)
            sb.append("HTTPCode4XXCount: " + getHTTPCode4XXCount() + ",");
        if (getHTTPCode5XXCount() != null)
            sb.append("HTTPCode5XXCount: " + getHTTPCode5XXCount() + ",");
        if (getUnknownHostCount() != null)
            sb.append("UnknownHostCount: " + getUnknownHostCount() + ",");
        if (getOtherCount() != null)
            sb.append("OtherCount: " + getOtherCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackendConnectionErrors == false)
            return false;
        BackendConnectionErrors other = (BackendConnectionErrors) obj;
        if (other.getTimeoutCount() == null ^ this.getTimeoutCount() == null)
            return false;
        if (other.getTimeoutCount() != null && other.getTimeoutCount().equals(this.getTimeoutCount()) == false)
            return false;
        if (other.getConnectionRefusedCount() == null ^ this.getConnectionRefusedCount() == null)
            return false;
        if (other.getConnectionRefusedCount() != null && other.getConnectionRefusedCount().equals(this.getConnectionRefusedCount()) == false)
            return false;
        if (other.getHTTPCode4XXCount() == null ^ this.getHTTPCode4XXCount() == null)
            return false;
        if (other.getHTTPCode4XXCount() != null && other.getHTTPCode4XXCount().equals(this.getHTTPCode4XXCount()) == false)
            return false;
        if (other.getHTTPCode5XXCount() == null ^ this.getHTTPCode5XXCount() == null)
            return false;
        if (other.getHTTPCode5XXCount() != null && other.getHTTPCode5XXCount().equals(this.getHTTPCode5XXCount()) == false)
            return false;
        if (other.getUnknownHostCount() == null ^ this.getUnknownHostCount() == null)
            return false;
        if (other.getUnknownHostCount() != null && other.getUnknownHostCount().equals(this.getUnknownHostCount()) == false)
            return false;
        if (other.getOtherCount() == null ^ this.getOtherCount() == null)
            return false;
        if (other.getOtherCount() != null && other.getOtherCount().equals(this.getOtherCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutCount() == null) ? 0 : getTimeoutCount().hashCode());
        hashCode = prime * hashCode + ((getConnectionRefusedCount() == null) ? 0 : getConnectionRefusedCount().hashCode());
        hashCode = prime * hashCode + ((getHTTPCode4XXCount() == null) ? 0 : getHTTPCode4XXCount().hashCode());
        hashCode = prime * hashCode + ((getHTTPCode5XXCount() == null) ? 0 : getHTTPCode5XXCount().hashCode());
        hashCode = prime * hashCode + ((getUnknownHostCount() == null) ? 0 : getUnknownHostCount().hashCode());
        hashCode = prime * hashCode + ((getOtherCount() == null) ? 0 : getOtherCount().hashCode());
        return hashCode;
    }

    @Override
    public BackendConnectionErrors clone() {
        try {
            return (BackendConnectionErrors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
