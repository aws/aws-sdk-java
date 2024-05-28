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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure of time range that you want to search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchContactsTimeRange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchContactsTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The start time of the time range.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the time range.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * 
     * @param type
     *        The type of timestamp to search.
     * @see SearchContactsTimeRangeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * 
     * @return The type of timestamp to search.
     * @see SearchContactsTimeRangeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * 
     * @param type
     *        The type of timestamp to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsTimeRangeType
     */

    public SearchContactsTimeRange withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * 
     * @param type
     *        The type of timestamp to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchContactsTimeRangeType
     */

    public SearchContactsTimeRange withType(SearchContactsTimeRangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * 
     * @param startTime
     *        The start time of the time range.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * 
     * @return The start time of the time range.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * 
     * @param startTime
     *        The start time of the time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsTimeRange withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * 
     * @param endTime
     *        The end time of the time range.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * 
     * @return The end time of the time range.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * 
     * @param endTime
     *        The end time of the time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchContactsTimeRange withEndTime(java.util.Date endTime) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof SearchContactsTimeRange == false)
            return false;
        SearchContactsTimeRange other = (SearchContactsTimeRange) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public SearchContactsTimeRange clone() {
        try {
            return (SearchContactsTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SearchContactsTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
