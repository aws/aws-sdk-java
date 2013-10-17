/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#listJobs(ListJobsRequest) ListJobs operation}.
 * <p>
 * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished.
 * </p>
 * <p>
 * <b>NOTE:</b> Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes completed jobs. The
 * output of completed jobs can be retrieved. Retaining completed jobs for a period of time after they have completed enables you to get a job output in
 * the event you miss the job completion notification or your first attempt to download it fails. For example, suppose you start an archive retrieval job
 * to download an archive. After the job completes, you start to download the archive but encounter a network error. In this scenario, you can retry and
 * download the archive while the job exists.
 * </p>
 * <p>
 * To retrieve an archive or retrieve a vault inventory from Amazon Glacier, you first initiate a job, and after the job completes, you download the
 * data. For an archive retrieval, the output is the archive data, and for an inventory retrieval, it is the inventory list. The List Job operation
 * returns a list of these jobs sorted by job initiation time.
 * </p>
 * <p>
 * This List Jobs operation supports pagination. By default, this operation returns up to 1,000 jobs in the response. You should always check the
 * response for a <code>marker</code> at which to continue the list; if there are no more items the <code>marker</code> is <code>null</code> .
 * To return a list of jobs that begins at a specific job, set the <code>marker</code> request parameter to the value you obtained from a
 * previous List Jobs request. You can also limit the number of jobs returned in the response by specifying the <code>limit</code> parameter in the
 * request.
 * </p>
 * <p>
 * Additionally, you can filter the jobs list returned by specifying an optional <code>statuscode</code> (InProgress, Succeeded, or Failed) and
 * <code>completed</code> (true, false) parameter. The <code>statuscode</code> allows you to specify that only jobs that match a specified status are
 * returned. The <code>completed</code> parameter allows you to specify that only jobs in a specific completion state are returned.
 * </p>
 * <p>
 * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any
 * permissions by default. You must grant them explicit permission to perform specific actions. For more information, see <a
 * href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html"> Access Control Using AWS Identity and Access
 * Management (IAM) </a> .
 * </p>
 * <p>
 * For the underlying REST API, go to <a href="http://docs.amazonwebservices.com/amazonglacier/latest/dev/api-jobs-get.html"> List Jobs </a>
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#listJobs(ListJobsRequest)
 */
public class ListJobsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * Specifies that the response be limited to the specified number of
     * items or fewer. If not specified, the List Jobs operation returns up
     * to 1,000 jobs.
     */
    private String limit;

    /**
     * An opaque string used for pagination. This value specifies the job at
     * which the listing of jobs should begin. Get the marker value from a
     * previous List Jobs response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List
     * Jobs request.
     */
    private String marker;

    /**
     * Specifies the type of job status to return. You can specify the
     * following values: "InProgress", "Succeeded", or "Failed".
     */
    private String statuscode;

    /**
     * Specifies the state of the jobs to return. You can specify
     * <code>true</code> or <code>false</code>.
     */
    private String completed;

    /**
     * Default constructor for a new ListJobsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListJobsRequest() {}
    
    /**
     * Constructs a new ListJobsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName The name of the vault.
     */
    public ListJobsRequest(String vaultName) {
        setVaultName(vaultName);
    }

    /**
     * Constructs a new ListJobsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You
     * can specify either the AWS Account ID or optionally a '-', in which
     * case Amazon Glacier uses the AWS Account ID associated with the
     * credentials used to sign the request. If you specify your Account ID,
     * do not include hyphens in it.
     * @param vaultName The name of the vault.
     */
    public ListJobsRequest(String accountId, String vaultName) {
        setAccountId(accountId);
        setVaultName(vaultName);
    }

    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @return The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> is the AWS Account ID. You can specify
     * either the AWS Account ID or optionally a '-', in which case Amazon
     * Glacier uses the AWS Account ID associated with the credentials used
     * to sign the request. If you specify your Account ID, do not include
     * hyphens in it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> is the AWS Account ID. You can specify
     *         either the AWS Account ID or optionally a '-', in which case Amazon
     *         Glacier uses the AWS Account ID associated with the credentials used
     *         to sign the request. If you specify your Account ID, do not include
     *         hyphens in it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The name of the vault.
     *
     * @return The name of the vault.
     */
    public String getVaultName() {
        return vaultName;
    }
    
    /**
     * The name of the vault.
     *
     * @param vaultName The name of the vault.
     */
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }
    
    /**
     * The name of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultName The name of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Specifies that the response be limited to the specified number of
     * items or fewer. If not specified, the List Jobs operation returns up
     * to 1,000 jobs.
     *
     * @return Specifies that the response be limited to the specified number of
     *         items or fewer. If not specified, the List Jobs operation returns up
     *         to 1,000 jobs.
     */
    public String getLimit() {
        return limit;
    }
    
    /**
     * Specifies that the response be limited to the specified number of
     * items or fewer. If not specified, the List Jobs operation returns up
     * to 1,000 jobs.
     *
     * @param limit Specifies that the response be limited to the specified number of
     *         items or fewer. If not specified, the List Jobs operation returns up
     *         to 1,000 jobs.
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }
    
    /**
     * Specifies that the response be limited to the specified number of
     * items or fewer. If not specified, the List Jobs operation returns up
     * to 1,000 jobs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param limit Specifies that the response be limited to the specified number of
     *         items or fewer. If not specified, the List Jobs operation returns up
     *         to 1,000 jobs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * An opaque string used for pagination. This value specifies the job at
     * which the listing of jobs should begin. Get the marker value from a
     * previous List Jobs response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List
     * Jobs request.
     *
     * @return An opaque string used for pagination. This value specifies the job at
     *         which the listing of jobs should begin. Get the marker value from a
     *         previous List Jobs response. You need only include the marker if you
     *         are continuing the pagination of results started in a previous List
     *         Jobs request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the job at
     * which the listing of jobs should begin. Get the marker value from a
     * previous List Jobs response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List
     * Jobs request.
     *
     * @param marker An opaque string used for pagination. This value specifies the job at
     *         which the listing of jobs should begin. Get the marker value from a
     *         previous List Jobs response. You need only include the marker if you
     *         are continuing the pagination of results started in a previous List
     *         Jobs request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string used for pagination. This value specifies the job at
     * which the listing of jobs should begin. Get the marker value from a
     * previous List Jobs response. You need only include the marker if you
     * are continuing the pagination of results started in a previous List
     * Jobs request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string used for pagination. This value specifies the job at
     *         which the listing of jobs should begin. Get the marker value from a
     *         previous List Jobs response. You need only include the marker if you
     *         are continuing the pagination of results started in a previous List
     *         Jobs request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specifies the type of job status to return. You can specify the
     * following values: "InProgress", "Succeeded", or "Failed".
     *
     * @return Specifies the type of job status to return. You can specify the
     *         following values: "InProgress", "Succeeded", or "Failed".
     */
    public String getStatuscode() {
        return statuscode;
    }
    
    /**
     * Specifies the type of job status to return. You can specify the
     * following values: "InProgress", "Succeeded", or "Failed".
     *
     * @param statuscode Specifies the type of job status to return. You can specify the
     *         following values: "InProgress", "Succeeded", or "Failed".
     */
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }
    
    /**
     * Specifies the type of job status to return. You can specify the
     * following values: "InProgress", "Succeeded", or "Failed".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statuscode Specifies the type of job status to return. You can specify the
     *         following values: "InProgress", "Succeeded", or "Failed".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withStatuscode(String statuscode) {
        this.statuscode = statuscode;
        return this;
    }

    /**
     * Specifies the state of the jobs to return. You can specify
     * <code>true</code> or <code>false</code>.
     *
     * @return Specifies the state of the jobs to return. You can specify
     *         <code>true</code> or <code>false</code>.
     */
    public String getCompleted() {
        return completed;
    }
    
    /**
     * Specifies the state of the jobs to return. You can specify
     * <code>true</code> or <code>false</code>.
     *
     * @param completed Specifies the state of the jobs to return. You can specify
     *         <code>true</code> or <code>false</code>.
     */
    public void setCompleted(String completed) {
        this.completed = completed;
    }
    
    /**
     * Specifies the state of the jobs to return. You can specify
     * <code>true</code> or <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completed Specifies the state of the jobs to return. You can specify
     *         <code>true</code> or <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withCompleted(String completed) {
        this.completed = completed;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getStatuscode() != null) sb.append("Statuscode: " + getStatuscode() + ",");
        if (getCompleted() != null) sb.append("Completed: " + getCompleted() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getStatuscode() == null) ? 0 : getStatuscode().hashCode()); 
        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsRequest == false) return false;
        ListJobsRequest other = (ListJobsRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getStatuscode() == null ^ this.getStatuscode() == null) return false;
        if (other.getStatuscode() != null && other.getStatuscode().equals(this.getStatuscode()) == false) return false; 
        if (other.getCompleted() == null ^ this.getCompleted() == null) return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false) return false; 
        return true;
    }
    
}
    