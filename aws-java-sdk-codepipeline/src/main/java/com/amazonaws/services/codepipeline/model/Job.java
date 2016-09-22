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
 * Represents information about a job.
 * </p>
 */
public class Job implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Additional data about a job.
     * </p>
     */
    private JobData data;
    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. This number must be returned in the response.
     * </p>
     */
    private String nonce;
    /**
     * <p>
     * The ID of the AWS account to use when performing the job.
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

    public Job withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Additional data about a job.
     * </p>
     * 
     * @param data
     *        Additional data about a job.
     */

    public void setData(JobData data) {
        this.data = data;
    }

    /**
     * <p>
     * Additional data about a job.
     * </p>
     * 
     * @return Additional data about a job.
     */

    public JobData getData() {
        return this.data;
    }

    /**
     * <p>
     * Additional data about a job.
     * </p>
     * 
     * @param data
     *        Additional data about a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withData(JobData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. This number must be returned in the response.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. This number must be returned in the response.
     */

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. This number must be returned in the response.
     * </p>
     * 
     * @return A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *         only one job worker. This number must be returned in the response.
     */

    public String getNonce() {
        return this.nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. This number must be returned in the response.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. This number must be returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withNonce(String nonce) {
        setNonce(nonce);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account to use when performing the job.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account to use when performing the job.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account to use when performing the job.
     * </p>
     * 
     * @return The ID of the AWS account to use when performing the job.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the AWS account to use when performing the job.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account to use when performing the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAccountId(String accountId) {
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
        if (getNonce() != null)
            sb.append("Nonce: " + getNonce() + ",");
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

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
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
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
