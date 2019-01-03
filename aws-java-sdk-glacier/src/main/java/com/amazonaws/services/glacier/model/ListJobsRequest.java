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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for retrieving a job list for an Amazon Glacier vault.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the vault.
     * </p>
     */
    private String vaultName;
    /**
     * <p>
     * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer
     * than the specified limit, but the number of returned jobs never exceeds the limit.
     * </p>
     */
    private String limit;
    /**
     * <p>
     * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get
     * the marker value from a previous List Jobs response. You only need to include the marker if you are continuing
     * the pagination of results started in a previous List Jobs request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The type of job status to return. You can specify the following values: <code>InProgress</code>,
     * <code>Succeeded</code>, or <code>Failed</code>.
     * </p>
     */
    private String statuscode;
    /**
     * <p>
     * The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     * </p>
     */
    private String completed;

    /**
     * Default constructor for ListJobsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public ListJobsRequest() {
    }

    /**
     * Constructs a new ListJobsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param vaultName
     *        The name of the vault.
     */
    public ListJobsRequest(String vaultName) {
        setVaultName(vaultName);
    }

    /**
     * Constructs a new ListJobsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @param vaultName
     *        The name of the vault.
     */
    public ListJobsRequest(String accountId, String vaultName) {
        setAccountId(accountId);
        setVaultName(vaultName);
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @return The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *         specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *         uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *         ID, do not include any hyphens ('-') in the ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify
     * an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS
     * account ID associated with the credentials used to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * </p>
     * 
     * @param accountId
     *        The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either
     *        specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier
     *        uses the AWS account ID associated with the credentials used to sign the request. If you use an account
     *        ID, do not include any hyphens ('-') in the ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     */

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @return The name of the vault.
     */

    public String getVaultName() {
        return this.vaultName;
    }

    /**
     * <p>
     * The name of the vault.
     * </p>
     * 
     * @param vaultName
     *        The name of the vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withVaultName(String vaultName) {
        setVaultName(vaultName);
        return this;
    }

    /**
     * <p>
     * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer
     * than the specified limit, but the number of returned jobs never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be
     *        fewer than the specified limit, but the number of returned jobs never exceeds the limit.
     */

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer
     * than the specified limit, but the number of returned jobs never exceeds the limit.
     * </p>
     * 
     * @return The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be
     *         fewer than the specified limit, but the number of returned jobs never exceeds the limit.
     */

    public String getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer
     * than the specified limit, but the number of returned jobs never exceeds the limit.
     * </p>
     * 
     * @param limit
     *        The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be
     *        fewer than the specified limit, but the number of returned jobs never exceeds the limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withLimit(String limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get
     * the marker value from a previous List Jobs response. You only need to include the marker if you are continuing
     * the pagination of results started in a previous List Jobs request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination. This value specifies the job at which the listing of jobs should
     *        begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you
     *        are continuing the pagination of results started in a previous List Jobs request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get
     * the marker value from a previous List Jobs response. You only need to include the marker if you are continuing
     * the pagination of results started in a previous List Jobs request.
     * </p>
     * 
     * @return An opaque string used for pagination. This value specifies the job at which the listing of jobs should
     *         begin. Get the marker value from a previous List Jobs response. You only need to include the marker if
     *         you are continuing the pagination of results started in a previous List Jobs request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get
     * the marker value from a previous List Jobs response. You only need to include the marker if you are continuing
     * the pagination of results started in a previous List Jobs request.
     * </p>
     * 
     * @param marker
     *        An opaque string used for pagination. This value specifies the job at which the listing of jobs should
     *        begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you
     *        are continuing the pagination of results started in a previous List Jobs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The type of job status to return. You can specify the following values: <code>InProgress</code>,
     * <code>Succeeded</code>, or <code>Failed</code>.
     * </p>
     * 
     * @param statuscode
     *        The type of job status to return. You can specify the following values: <code>InProgress</code>,
     *        <code>Succeeded</code>, or <code>Failed</code>.
     */

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * <p>
     * The type of job status to return. You can specify the following values: <code>InProgress</code>,
     * <code>Succeeded</code>, or <code>Failed</code>.
     * </p>
     * 
     * @return The type of job status to return. You can specify the following values: <code>InProgress</code>,
     *         <code>Succeeded</code>, or <code>Failed</code>.
     */

    public String getStatuscode() {
        return this.statuscode;
    }

    /**
     * <p>
     * The type of job status to return. You can specify the following values: <code>InProgress</code>,
     * <code>Succeeded</code>, or <code>Failed</code>.
     * </p>
     * 
     * @param statuscode
     *        The type of job status to return. You can specify the following values: <code>InProgress</code>,
     *        <code>Succeeded</code>, or <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withStatuscode(String statuscode) {
        setStatuscode(statuscode);
        return this;
    }

    /**
     * <p>
     * The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     * </p>
     * 
     * @param completed
     *        The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     */

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     * </p>
     * 
     * @return The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     */

    public String getCompleted() {
        return this.completed;
    }

    /**
     * <p>
     * The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     * </p>
     * 
     * @param completed
     *        The state of the jobs to return. You can specify <code>true</code> or <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withCompleted(String completed) {
        setCompleted(completed);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getVaultName() != null)
            sb.append("VaultName: ").append(getVaultName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getStatuscode() != null)
            sb.append("Statuscode: ").append(getStatuscode()).append(",");
        if (getCompleted() != null)
            sb.append("Completed: ").append(getCompleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getVaultName() == null ^ this.getVaultName() == null)
            return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getStatuscode() == null ^ this.getStatuscode() == null)
            return false;
        if (other.getStatuscode() != null && other.getStatuscode().equals(this.getStatuscode()) == false)
            return false;
        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        return true;
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
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
