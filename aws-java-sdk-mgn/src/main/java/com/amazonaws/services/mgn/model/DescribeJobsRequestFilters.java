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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request to describe Job log filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeJobsRequestFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to describe Job log filters by date.
     * </p>
     */
    private String fromDate;
    /**
     * <p>
     * Request to describe Job log filters by job ID.
     * </p>
     */
    private java.util.List<String> jobIDs;
    /**
     * <p>
     * Request to describe Job log by last date.
     * </p>
     */
    private String toDate;

    /**
     * <p>
     * Request to describe Job log filters by date.
     * </p>
     * 
     * @param fromDate
     *        Request to describe Job log filters by date.
     */

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * <p>
     * Request to describe Job log filters by date.
     * </p>
     * 
     * @return Request to describe Job log filters by date.
     */

    public String getFromDate() {
        return this.fromDate;
    }

    /**
     * <p>
     * Request to describe Job log filters by date.
     * </p>
     * 
     * @param fromDate
     *        Request to describe Job log filters by date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequestFilters withFromDate(String fromDate) {
        setFromDate(fromDate);
        return this;
    }

    /**
     * <p>
     * Request to describe Job log filters by job ID.
     * </p>
     * 
     * @return Request to describe Job log filters by job ID.
     */

    public java.util.List<String> getJobIDs() {
        return jobIDs;
    }

    /**
     * <p>
     * Request to describe Job log filters by job ID.
     * </p>
     * 
     * @param jobIDs
     *        Request to describe Job log filters by job ID.
     */

    public void setJobIDs(java.util.Collection<String> jobIDs) {
        if (jobIDs == null) {
            this.jobIDs = null;
            return;
        }

        this.jobIDs = new java.util.ArrayList<String>(jobIDs);
    }

    /**
     * <p>
     * Request to describe Job log filters by job ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobIDs(java.util.Collection)} or {@link #withJobIDs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobIDs
     *        Request to describe Job log filters by job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequestFilters withJobIDs(String... jobIDs) {
        if (this.jobIDs == null) {
            setJobIDs(new java.util.ArrayList<String>(jobIDs.length));
        }
        for (String ele : jobIDs) {
            this.jobIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to describe Job log filters by job ID.
     * </p>
     * 
     * @param jobIDs
     *        Request to describe Job log filters by job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequestFilters withJobIDs(java.util.Collection<String> jobIDs) {
        setJobIDs(jobIDs);
        return this;
    }

    /**
     * <p>
     * Request to describe Job log by last date.
     * </p>
     * 
     * @param toDate
     *        Request to describe Job log by last date.
     */

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    /**
     * <p>
     * Request to describe Job log by last date.
     * </p>
     * 
     * @return Request to describe Job log by last date.
     */

    public String getToDate() {
        return this.toDate;
    }

    /**
     * <p>
     * Request to describe Job log by last date.
     * </p>
     * 
     * @param toDate
     *        Request to describe Job log by last date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobsRequestFilters withToDate(String toDate) {
        setToDate(toDate);
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
        if (getFromDate() != null)
            sb.append("FromDate: ").append(getFromDate()).append(",");
        if (getJobIDs() != null)
            sb.append("JobIDs: ").append(getJobIDs()).append(",");
        if (getToDate() != null)
            sb.append("ToDate: ").append(getToDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobsRequestFilters == false)
            return false;
        DescribeJobsRequestFilters other = (DescribeJobsRequestFilters) obj;
        if (other.getFromDate() == null ^ this.getFromDate() == null)
            return false;
        if (other.getFromDate() != null && other.getFromDate().equals(this.getFromDate()) == false)
            return false;
        if (other.getJobIDs() == null ^ this.getJobIDs() == null)
            return false;
        if (other.getJobIDs() != null && other.getJobIDs().equals(this.getJobIDs()) == false)
            return false;
        if (other.getToDate() == null ^ this.getToDate() == null)
            return false;
        if (other.getToDate() != null && other.getToDate().equals(this.getToDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromDate() == null) ? 0 : getFromDate().hashCode());
        hashCode = prime * hashCode + ((getJobIDs() == null) ? 0 : getJobIDs().hashCode());
        hashCode = prime * hashCode + ((getToDate() == null) ? 0 : getToDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobsRequestFilters clone() {
        try {
            return (DescribeJobsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DescribeJobsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
