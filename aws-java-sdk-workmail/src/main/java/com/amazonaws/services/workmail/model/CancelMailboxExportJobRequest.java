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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CancelMailboxExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelMailboxExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The job ID.
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
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @return The idempotency token for the client request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMailboxExportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @return The job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelMailboxExportJobRequest withJobId(String jobId) {
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

    public CancelMailboxExportJobRequest withOrganizationId(String organizationId) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CancelMailboxExportJobRequest == false)
            return false;
        CancelMailboxExportJobRequest other = (CancelMailboxExportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        return hashCode;
    }

    @Override
    public CancelMailboxExportJobRequest clone() {
        return (CancelMailboxExportJobRequest) super.clone();
    }

}
