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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservationCoverageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     */
    private java.util.List<CoverageByTime> coveragesByTime;
    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     */
    private Coverage total;
    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * 
     * @return The amount of time that your reservations covered.
     */

    public java.util.List<CoverageByTime> getCoveragesByTime() {
        return coveragesByTime;
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * 
     * @param coveragesByTime
     *        The amount of time that your reservations covered.
     */

    public void setCoveragesByTime(java.util.Collection<CoverageByTime> coveragesByTime) {
        if (coveragesByTime == null) {
            this.coveragesByTime = null;
            return;
        }

        this.coveragesByTime = new java.util.ArrayList<CoverageByTime>(coveragesByTime);
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoveragesByTime(java.util.Collection)} or {@link #withCoveragesByTime(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param coveragesByTime
     *        The amount of time that your reservations covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageResult withCoveragesByTime(CoverageByTime... coveragesByTime) {
        if (this.coveragesByTime == null) {
            setCoveragesByTime(new java.util.ArrayList<CoverageByTime>(coveragesByTime.length));
        }
        for (CoverageByTime ele : coveragesByTime) {
            this.coveragesByTime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The amount of time that your reservations covered.
     * </p>
     * 
     * @param coveragesByTime
     *        The amount of time that your reservations covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageResult withCoveragesByTime(java.util.Collection<CoverageByTime> coveragesByTime) {
        setCoveragesByTime(coveragesByTime);
        return this;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     * 
     * @param total
     *        The total amount of instance usage that a reservation covered.
     */

    public void setTotal(Coverage total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     * 
     * @return The total amount of instance usage that a reservation covered.
     */

    public Coverage getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total amount of instance usage that a reservation covered.
     * </p>
     * 
     * @param total
     *        The total amount of instance usage that a reservation covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageResult withTotal(Coverage total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @return The token for the next set of retrievable results. AWS provides the token when the response from a
     *         previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getCoveragesByTime() != null)
            sb.append("CoveragesByTime: ").append(getCoveragesByTime()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationCoverageResult == false)
            return false;
        GetReservationCoverageResult other = (GetReservationCoverageResult) obj;
        if (other.getCoveragesByTime() == null ^ this.getCoveragesByTime() == null)
            return false;
        if (other.getCoveragesByTime() != null && other.getCoveragesByTime().equals(this.getCoveragesByTime()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoveragesByTime() == null) ? 0 : getCoveragesByTime().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReservationCoverageResult clone() {
        try {
            return (GetReservationCoverageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
