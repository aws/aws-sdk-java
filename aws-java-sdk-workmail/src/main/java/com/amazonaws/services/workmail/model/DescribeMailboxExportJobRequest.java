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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMailboxExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The mailbox export job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The organization ID.
     * </p>
     */
    private String organizationId;

    /**
     * <p>
     * The mailbox export job ID.
     * </p>
     * 
     * @param jobId
     *        The mailbox export job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The mailbox export job ID.
     * </p>
     * 
     * @return The mailbox export job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The mailbox export job ID.
     * </p>
     * 
     * @param jobId
     *        The mailbox export job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @param organizationId
     *        The organization ID.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @return The organization ID.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization ID.
     * </p>
     * 
     * @param organizationId
     *        The organization ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMailboxExportJobRequest == false)
            return false;
        DescribeMailboxExportJobRequest other = (DescribeMailboxExportJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMailboxExportJobRequest clone() {
        return (DescribeMailboxExportJobRequest) super.clone();
    }

}
