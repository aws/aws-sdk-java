/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the status of the query, including progress and bytes scannned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/QueryStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The progress of the query, expressed as a percentage.
     * </p>
     */
    private Double progressPercentage;
    /**
     * <p>
     * The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount of
     * bytes scanned since the query was started.
     * </p>
     */
    private Long cumulativeBytesScanned;
    /**
     * <p>
     * The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum and
     * represents the total amount of data that you will be charged for since the query was started. The charge is
     * applied only once and is either applied when the query completes execution or when the query is cancelled.
     * </p>
     */
    private Long cumulativeBytesMetered;

    /**
     * <p>
     * The progress of the query, expressed as a percentage.
     * </p>
     * 
     * @param progressPercentage
     *        The progress of the query, expressed as a percentage.
     */

    public void setProgressPercentage(Double progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    /**
     * <p>
     * The progress of the query, expressed as a percentage.
     * </p>
     * 
     * @return The progress of the query, expressed as a percentage.
     */

    public Double getProgressPercentage() {
        return this.progressPercentage;
    }

    /**
     * <p>
     * The progress of the query, expressed as a percentage.
     * </p>
     * 
     * @param progressPercentage
     *        The progress of the query, expressed as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatus withProgressPercentage(Double progressPercentage) {
        setProgressPercentage(progressPercentage);
        return this;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount of
     * bytes scanned since the query was started.
     * </p>
     * 
     * @param cumulativeBytesScanned
     *        The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount
     *        of bytes scanned since the query was started.
     */

    public void setCumulativeBytesScanned(Long cumulativeBytesScanned) {
        this.cumulativeBytesScanned = cumulativeBytesScanned;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount of
     * bytes scanned since the query was started.
     * </p>
     * 
     * @return The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total
     *         amount of bytes scanned since the query was started.
     */

    public Long getCumulativeBytesScanned() {
        return this.cumulativeBytesScanned;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount of
     * bytes scanned since the query was started.
     * </p>
     * 
     * @param cumulativeBytesScanned
     *        The amount of data scanned by the query in bytes. This is a cumulative sum and represents the total amount
     *        of bytes scanned since the query was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatus withCumulativeBytesScanned(Long cumulativeBytesScanned) {
        setCumulativeBytesScanned(cumulativeBytesScanned);
        return this;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum and
     * represents the total amount of data that you will be charged for since the query was started. The charge is
     * applied only once and is either applied when the query completes execution or when the query is cancelled.
     * </p>
     * 
     * @param cumulativeBytesMetered
     *        The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum
     *        and represents the total amount of data that you will be charged for since the query was started. The
     *        charge is applied only once and is either applied when the query completes execution or when the query is
     *        cancelled.
     */

    public void setCumulativeBytesMetered(Long cumulativeBytesMetered) {
        this.cumulativeBytesMetered = cumulativeBytesMetered;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum and
     * represents the total amount of data that you will be charged for since the query was started. The charge is
     * applied only once and is either applied when the query completes execution or when the query is cancelled.
     * </p>
     * 
     * @return The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum
     *         and represents the total amount of data that you will be charged for since the query was started. The
     *         charge is applied only once and is either applied when the query completes execution or when the query is
     *         cancelled.
     */

    public Long getCumulativeBytesMetered() {
        return this.cumulativeBytesMetered;
    }

    /**
     * <p>
     * The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum and
     * represents the total amount of data that you will be charged for since the query was started. The charge is
     * applied only once and is either applied when the query completes execution or when the query is cancelled.
     * </p>
     * 
     * @param cumulativeBytesMetered
     *        The amount of data scanned by the query in bytes that you will be charged for. This is a cumulative sum
     *        and represents the total amount of data that you will be charged for since the query was started. The
     *        charge is applied only once and is either applied when the query completes execution or when the query is
     *        cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStatus withCumulativeBytesMetered(Long cumulativeBytesMetered) {
        setCumulativeBytesMetered(cumulativeBytesMetered);
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
        if (getProgressPercentage() != null)
            sb.append("ProgressPercentage: ").append(getProgressPercentage()).append(",");
        if (getCumulativeBytesScanned() != null)
            sb.append("CumulativeBytesScanned: ").append(getCumulativeBytesScanned()).append(",");
        if (getCumulativeBytesMetered() != null)
            sb.append("CumulativeBytesMetered: ").append(getCumulativeBytesMetered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStatus == false)
            return false;
        QueryStatus other = (QueryStatus) obj;
        if (other.getProgressPercentage() == null ^ this.getProgressPercentage() == null)
            return false;
        if (other.getProgressPercentage() != null && other.getProgressPercentage().equals(this.getProgressPercentage()) == false)
            return false;
        if (other.getCumulativeBytesScanned() == null ^ this.getCumulativeBytesScanned() == null)
            return false;
        if (other.getCumulativeBytesScanned() != null && other.getCumulativeBytesScanned().equals(this.getCumulativeBytesScanned()) == false)
            return false;
        if (other.getCumulativeBytesMetered() == null ^ this.getCumulativeBytesMetered() == null)
            return false;
        if (other.getCumulativeBytesMetered() != null && other.getCumulativeBytesMetered().equals(this.getCumulativeBytesMetered()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressPercentage() == null) ? 0 : getProgressPercentage().hashCode());
        hashCode = prime * hashCode + ((getCumulativeBytesScanned() == null) ? 0 : getCumulativeBytesScanned().hashCode());
        hashCode = prime * hashCode + ((getCumulativeBytesMetered() == null) ? 0 : getCumulativeBytesMetered().hashCode());
        return hashCode;
    }

    @Override
    public QueryStatus clone() {
        try {
            return (QueryStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.QueryStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
