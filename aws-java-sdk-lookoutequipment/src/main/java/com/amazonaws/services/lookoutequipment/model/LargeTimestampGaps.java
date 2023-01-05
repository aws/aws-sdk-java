/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Entity that comprises information on large gaps between consecutive timestamps in data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/LargeTimestampGaps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LargeTimestampGaps implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether there is a potential data issue related to large gaps in timestamps.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the number of large timestamp gaps, if there are any.
     * </p>
     */
    private Integer numberOfLargeTimestampGaps;
    /**
     * <p>
     * Indicates the size of the largest timestamp gap, in days.
     * </p>
     */
    private Integer maxTimestampGapInDays;

    /**
     * <p>
     * Indicates whether there is a potential data issue related to large gaps in timestamps.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to large gaps in timestamps.
     * @see StatisticalIssueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to large gaps in timestamps.
     * </p>
     * 
     * @return Indicates whether there is a potential data issue related to large gaps in timestamps.
     * @see StatisticalIssueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to large gaps in timestamps.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to large gaps in timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public LargeTimestampGaps withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether there is a potential data issue related to large gaps in timestamps.
     * </p>
     * 
     * @param status
     *        Indicates whether there is a potential data issue related to large gaps in timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatisticalIssueStatus
     */

    public LargeTimestampGaps withStatus(StatisticalIssueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the number of large timestamp gaps, if there are any.
     * </p>
     * 
     * @param numberOfLargeTimestampGaps
     *        Indicates the number of large timestamp gaps, if there are any.
     */

    public void setNumberOfLargeTimestampGaps(Integer numberOfLargeTimestampGaps) {
        this.numberOfLargeTimestampGaps = numberOfLargeTimestampGaps;
    }

    /**
     * <p>
     * Indicates the number of large timestamp gaps, if there are any.
     * </p>
     * 
     * @return Indicates the number of large timestamp gaps, if there are any.
     */

    public Integer getNumberOfLargeTimestampGaps() {
        return this.numberOfLargeTimestampGaps;
    }

    /**
     * <p>
     * Indicates the number of large timestamp gaps, if there are any.
     * </p>
     * 
     * @param numberOfLargeTimestampGaps
     *        Indicates the number of large timestamp gaps, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LargeTimestampGaps withNumberOfLargeTimestampGaps(Integer numberOfLargeTimestampGaps) {
        setNumberOfLargeTimestampGaps(numberOfLargeTimestampGaps);
        return this;
    }

    /**
     * <p>
     * Indicates the size of the largest timestamp gap, in days.
     * </p>
     * 
     * @param maxTimestampGapInDays
     *        Indicates the size of the largest timestamp gap, in days.
     */

    public void setMaxTimestampGapInDays(Integer maxTimestampGapInDays) {
        this.maxTimestampGapInDays = maxTimestampGapInDays;
    }

    /**
     * <p>
     * Indicates the size of the largest timestamp gap, in days.
     * </p>
     * 
     * @return Indicates the size of the largest timestamp gap, in days.
     */

    public Integer getMaxTimestampGapInDays() {
        return this.maxTimestampGapInDays;
    }

    /**
     * <p>
     * Indicates the size of the largest timestamp gap, in days.
     * </p>
     * 
     * @param maxTimestampGapInDays
     *        Indicates the size of the largest timestamp gap, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LargeTimestampGaps withMaxTimestampGapInDays(Integer maxTimestampGapInDays) {
        setMaxTimestampGapInDays(maxTimestampGapInDays);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNumberOfLargeTimestampGaps() != null)
            sb.append("NumberOfLargeTimestampGaps: ").append(getNumberOfLargeTimestampGaps()).append(",");
        if (getMaxTimestampGapInDays() != null)
            sb.append("MaxTimestampGapInDays: ").append(getMaxTimestampGapInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LargeTimestampGaps == false)
            return false;
        LargeTimestampGaps other = (LargeTimestampGaps) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNumberOfLargeTimestampGaps() == null ^ this.getNumberOfLargeTimestampGaps() == null)
            return false;
        if (other.getNumberOfLargeTimestampGaps() != null && other.getNumberOfLargeTimestampGaps().equals(this.getNumberOfLargeTimestampGaps()) == false)
            return false;
        if (other.getMaxTimestampGapInDays() == null ^ this.getMaxTimestampGapInDays() == null)
            return false;
        if (other.getMaxTimestampGapInDays() != null && other.getMaxTimestampGapInDays().equals(this.getMaxTimestampGapInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNumberOfLargeTimestampGaps() == null) ? 0 : getNumberOfLargeTimestampGaps().hashCode());
        hashCode = prime * hashCode + ((getMaxTimestampGapInDays() == null) ? 0 : getMaxTimestampGapInDays().hashCode());
        return hashCode;
    }

    @Override
    public LargeTimestampGaps clone() {
        try {
            return (LargeTimestampGaps) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.LargeTimestampGapsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
