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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartReferenceImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReferenceImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The job's reference store ID.
     * </p>
     */
    private String referenceStoreId;
    /**
     * <p>
     * A service role for the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Sources for the job.
     * </p>
     */
    private java.util.List<StartReferenceImportJobSourceItem> sources;

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @param clientToken
     *        To ensure that jobs don't run multiple times, specify a unique token for each job.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @return To ensure that jobs don't run multiple times, specify a unique token for each job.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To ensure that jobs don't run multiple times, specify a unique token for each job.
     * </p>
     * 
     * @param clientToken
     *        To ensure that jobs don't run multiple times, specify a unique token for each job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReferenceImportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The job's reference store ID.
     */

    public void setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @return The job's reference store ID.
     */

    public String getReferenceStoreId() {
        return this.referenceStoreId;
    }

    /**
     * <p>
     * The job's reference store ID.
     * </p>
     * 
     * @param referenceStoreId
     *        The job's reference store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReferenceImportJobRequest withReferenceStoreId(String referenceStoreId) {
        setReferenceStoreId(referenceStoreId);
        return this;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @return A service role for the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A service role for the job.
     * </p>
     * 
     * @param roleArn
     *        A service role for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReferenceImportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @return Sources for the job.
     */

    public java.util.List<StartReferenceImportJobSourceItem> getSources() {
        return sources;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     */

    public void setSources(java.util.Collection<StartReferenceImportJobSourceItem> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<StartReferenceImportJobSourceItem>(sources);
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReferenceImportJobRequest withSources(StartReferenceImportJobSourceItem... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<StartReferenceImportJobSourceItem>(sources.length));
        }
        for (StartReferenceImportJobSourceItem ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Sources for the job.
     * </p>
     * 
     * @param sources
     *        Sources for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReferenceImportJobRequest withSources(java.util.Collection<StartReferenceImportJobSourceItem> sources) {
        setSources(sources);
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
        if (getReferenceStoreId() != null)
            sb.append("ReferenceStoreId: ").append(getReferenceStoreId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReferenceImportJobRequest == false)
            return false;
        StartReferenceImportJobRequest other = (StartReferenceImportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getReferenceStoreId() == null ^ this.getReferenceStoreId() == null)
            return false;
        if (other.getReferenceStoreId() != null && other.getReferenceStoreId().equals(this.getReferenceStoreId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getReferenceStoreId() == null) ? 0 : getReferenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public StartReferenceImportJobRequest clone() {
        return (StartReferenceImportJobRequest) super.clone();
    }

}
