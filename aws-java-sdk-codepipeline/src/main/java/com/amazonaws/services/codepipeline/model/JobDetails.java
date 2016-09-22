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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about the details of a job.
 * </p>
 */
public class JobDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     */
    private String id;

    private JobData data;
    /**
     * <p>
     * The AWS account ID associated with the job.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @param id
     *        The unique system-generated ID of the job.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @return The unique system-generated ID of the job.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @param id
     *        The unique system-generated ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param data
     */

    public void setData(JobData data) {
        this.data = data;
    }

    /**
     * @return
     */

    public JobData getData() {
        return this.data;
    }

    /**
     * @param data
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withData(JobData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The AWS account ID associated with the job.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID associated with the job.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID associated with the job.
     * </p>
     * 
     * @return The AWS account ID associated with the job.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID associated with the job.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getData() != null)
            sb.append("Data: " + getData() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetails == false)
            return false;
        JobDetails other = (JobDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public JobDetails clone() {
        try {
            return (JobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
