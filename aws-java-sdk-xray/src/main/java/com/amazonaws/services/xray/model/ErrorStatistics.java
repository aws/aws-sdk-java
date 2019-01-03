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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about requests that failed with a 4xx Client Error status code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ErrorStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of requests that failed with a 419 throttling status code.
     * </p>
     */
    private Long throttleCount;
    /**
     * <p>
     * The number of requests that failed with untracked 4xx Client Error status codes.
     * </p>
     */
    private Long otherCount;
    /**
     * <p>
     * The total number of requests that failed with a 4xx Client Error status code.
     * </p>
     */
    private Long totalCount;

    /**
     * <p>
     * The number of requests that failed with a 419 throttling status code.
     * </p>
     * 
     * @param throttleCount
     *        The number of requests that failed with a 419 throttling status code.
     */

    public void setThrottleCount(Long throttleCount) {
        this.throttleCount = throttleCount;
    }

    /**
     * <p>
     * The number of requests that failed with a 419 throttling status code.
     * </p>
     * 
     * @return The number of requests that failed with a 419 throttling status code.
     */

    public Long getThrottleCount() {
        return this.throttleCount;
    }

    /**
     * <p>
     * The number of requests that failed with a 419 throttling status code.
     * </p>
     * 
     * @param throttleCount
     *        The number of requests that failed with a 419 throttling status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorStatistics withThrottleCount(Long throttleCount) {
        setThrottleCount(throttleCount);
        return this;
    }

    /**
     * <p>
     * The number of requests that failed with untracked 4xx Client Error status codes.
     * </p>
     * 
     * @param otherCount
     *        The number of requests that failed with untracked 4xx Client Error status codes.
     */

    public void setOtherCount(Long otherCount) {
        this.otherCount = otherCount;
    }

    /**
     * <p>
     * The number of requests that failed with untracked 4xx Client Error status codes.
     * </p>
     * 
     * @return The number of requests that failed with untracked 4xx Client Error status codes.
     */

    public Long getOtherCount() {
        return this.otherCount;
    }

    /**
     * <p>
     * The number of requests that failed with untracked 4xx Client Error status codes.
     * </p>
     * 
     * @param otherCount
     *        The number of requests that failed with untracked 4xx Client Error status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorStatistics withOtherCount(Long otherCount) {
        setOtherCount(otherCount);
        return this;
    }

    /**
     * <p>
     * The total number of requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests that failed with a 4xx Client Error status code.
     */

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @return The total number of requests that failed with a 4xx Client Error status code.
     */

    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of requests that failed with a 4xx Client Error status code.
     * </p>
     * 
     * @param totalCount
     *        The total number of requests that failed with a 4xx Client Error status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorStatistics withTotalCount(Long totalCount) {
        setTotalCount(totalCount);
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
        if (getThrottleCount() != null)
            sb.append("ThrottleCount: ").append(getThrottleCount()).append(",");
        if (getOtherCount() != null)
            sb.append("OtherCount: ").append(getOtherCount()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorStatistics == false)
            return false;
        ErrorStatistics other = (ErrorStatistics) obj;
        if (other.getThrottleCount() == null ^ this.getThrottleCount() == null)
            return false;
        if (other.getThrottleCount() != null && other.getThrottleCount().equals(this.getThrottleCount()) == false)
            return false;
        if (other.getOtherCount() == null ^ this.getOtherCount() == null)
            return false;
        if (other.getOtherCount() != null && other.getOtherCount().equals(this.getOtherCount()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThrottleCount() == null) ? 0 : getThrottleCount().hashCode());
        hashCode = prime * hashCode + ((getOtherCount() == null) ? 0 : getOtherCount().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public ErrorStatistics clone() {
        try {
            return (ErrorStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ErrorStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
