/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListCopyJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCopyJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return maxResults
     * number of items, NextToken allows you to return more items in your list starting at the location pointed to by
     * the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     * </p>
     */
    private String byResourceArn;
    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     */
    private String byState;
    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     */
    private java.util.Date byCreatedBefore;
    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     */
    private java.util.Date byCreatedAfter;
    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     */
    private String byResourceType;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     * arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     */
    private String byDestinationVaultArn;

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return maxResults
     * number of items, NextToken allows you to return more items in your list starting at the location pointed to by
     * the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        maxResults number of items, NextToken allows you to return more items in your list starting at the
     *        location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return maxResults
     * number of items, NextToken allows you to return more items in your list starting at the location pointed to by
     * the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         maxResults number of items, NextToken allows you to return more items in your list starting at the
     *         location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return maxResults
     * number of items, NextToken allows you to return more items in your list starting at the location pointed to by
     * the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        maxResults number of items, NextToken allows you to return more items in your list starting at the
     *        location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @return The maximum number of items to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param byResourceArn
     *        Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     */

    public void setByResourceArn(String byResourceArn) {
        this.byResourceArn = byResourceArn;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     */

    public String getByResourceArn() {
        return this.byResourceArn;
    }

    /**
     * <p>
     * Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     * </p>
     * 
     * @param byResourceArn
     *        Returns only copy jobs that match the specified resource Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withByResourceArn(String byResourceArn) {
        setByResourceArn(byResourceArn);
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * 
     * @param byState
     *        Returns only copy jobs that are in the specified state.
     * @see CopyJobState
     */

    public void setByState(String byState) {
        this.byState = byState;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * 
     * @return Returns only copy jobs that are in the specified state.
     * @see CopyJobState
     */

    public String getByState() {
        return this.byState;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * 
     * @param byState
     *        Returns only copy jobs that are in the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyJobState
     */

    public ListCopyJobsRequest withByState(String byState) {
        setByState(byState);
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that are in the specified state.
     * </p>
     * 
     * @param byState
     *        Returns only copy jobs that are in the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CopyJobState
     */

    public ListCopyJobsRequest withByState(CopyJobState byState) {
        this.byState = byState.toString();
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only copy jobs that were created before the specified date.
     */

    public void setByCreatedBefore(java.util.Date byCreatedBefore) {
        this.byCreatedBefore = byCreatedBefore;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     * 
     * @return Returns only copy jobs that were created before the specified date.
     */

    public java.util.Date getByCreatedBefore() {
        return this.byCreatedBefore;
    }

    /**
     * <p>
     * Returns only copy jobs that were created before the specified date.
     * </p>
     * 
     * @param byCreatedBefore
     *        Returns only copy jobs that were created before the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withByCreatedBefore(java.util.Date byCreatedBefore) {
        setByCreatedBefore(byCreatedBefore);
        return this;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only copy jobs that were created after the specified date.
     */

    public void setByCreatedAfter(java.util.Date byCreatedAfter) {
        this.byCreatedAfter = byCreatedAfter;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     * 
     * @return Returns only copy jobs that were created after the specified date.
     */

    public java.util.Date getByCreatedAfter() {
        return this.byCreatedAfter;
    }

    /**
     * <p>
     * Returns only copy jobs that were created after the specified date.
     * </p>
     * 
     * @param byCreatedAfter
     *        Returns only copy jobs that were created after the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withByCreatedAfter(java.util.Date byCreatedAfter) {
        setByCreatedAfter(byCreatedAfter);
        return this;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * 
     * @param byResourceType
     *        Returns only backup jobs for the specified resources:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DynamoDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Storage Gateway</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     */

    public void setByResourceType(String byResourceType) {
        this.byResourceType = byResourceType;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * 
     * @return Returns only backup jobs for the specified resources:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DynamoDB</code> for Amazon DynamoDB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EBS</code> for Amazon Elastic Block Store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EFS</code> for Amazon Elastic File System
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RDS</code> for Amazon Relational Database Service
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Storage Gateway</code> for AWS Storage Gateway
     *         </p>
     *         </li>
     */

    public String getByResourceType() {
        return this.byResourceType;
    }

    /**
     * <p>
     * Returns only backup jobs for the specified resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DynamoDB</code> for Amazon DynamoDB
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS</code> for Amazon Elastic Block Store
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EFS</code> for Amazon Elastic File System
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RDS</code> for Amazon Relational Database Service
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Storage Gateway</code> for AWS Storage Gateway
     * </p>
     * </li>
     * </ul>
     * 
     * @param byResourceType
     *        Returns only backup jobs for the specified resources:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DynamoDB</code> for Amazon DynamoDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS</code> for Amazon Elastic Block Store
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EFS</code> for Amazon Elastic File System
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RDS</code> for Amazon Relational Database Service
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Storage Gateway</code> for AWS Storage Gateway
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withByResourceType(String byResourceType) {
        setByResourceType(byResourceType);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     * arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @param byDestinationVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     *        arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     */

    public void setByDestinationVaultArn(String byDestinationVaultArn) {
        this.byDestinationVaultArn = byDestinationVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     * arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     *         arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     */

    public String getByDestinationVaultArn() {
        return this.byDestinationVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     * arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * </p>
     * 
     * @param byDestinationVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a source backup vault to copy from; for example,
     *        arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCopyJobsRequest withByDestinationVaultArn(String byDestinationVaultArn) {
        setByDestinationVaultArn(byDestinationVaultArn);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getByResourceArn() != null)
            sb.append("ByResourceArn: ").append(getByResourceArn()).append(",");
        if (getByState() != null)
            sb.append("ByState: ").append(getByState()).append(",");
        if (getByCreatedBefore() != null)
            sb.append("ByCreatedBefore: ").append(getByCreatedBefore()).append(",");
        if (getByCreatedAfter() != null)
            sb.append("ByCreatedAfter: ").append(getByCreatedAfter()).append(",");
        if (getByResourceType() != null)
            sb.append("ByResourceType: ").append(getByResourceType()).append(",");
        if (getByDestinationVaultArn() != null)
            sb.append("ByDestinationVaultArn: ").append(getByDestinationVaultArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCopyJobsRequest == false)
            return false;
        ListCopyJobsRequest other = (ListCopyJobsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getByResourceArn() == null ^ this.getByResourceArn() == null)
            return false;
        if (other.getByResourceArn() != null && other.getByResourceArn().equals(this.getByResourceArn()) == false)
            return false;
        if (other.getByState() == null ^ this.getByState() == null)
            return false;
        if (other.getByState() != null && other.getByState().equals(this.getByState()) == false)
            return false;
        if (other.getByCreatedBefore() == null ^ this.getByCreatedBefore() == null)
            return false;
        if (other.getByCreatedBefore() != null && other.getByCreatedBefore().equals(this.getByCreatedBefore()) == false)
            return false;
        if (other.getByCreatedAfter() == null ^ this.getByCreatedAfter() == null)
            return false;
        if (other.getByCreatedAfter() != null && other.getByCreatedAfter().equals(this.getByCreatedAfter()) == false)
            return false;
        if (other.getByResourceType() == null ^ this.getByResourceType() == null)
            return false;
        if (other.getByResourceType() != null && other.getByResourceType().equals(this.getByResourceType()) == false)
            return false;
        if (other.getByDestinationVaultArn() == null ^ this.getByDestinationVaultArn() == null)
            return false;
        if (other.getByDestinationVaultArn() != null && other.getByDestinationVaultArn().equals(this.getByDestinationVaultArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getByResourceArn() == null) ? 0 : getByResourceArn().hashCode());
        hashCode = prime * hashCode + ((getByState() == null) ? 0 : getByState().hashCode());
        hashCode = prime * hashCode + ((getByCreatedBefore() == null) ? 0 : getByCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getByCreatedAfter() == null) ? 0 : getByCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getByResourceType() == null) ? 0 : getByResourceType().hashCode());
        hashCode = prime * hashCode + ((getByDestinationVaultArn() == null) ? 0 : getByDestinationVaultArn().hashCode());
        return hashCode;
    }

    @Override
    public ListCopyJobsRequest clone() {
        return (ListCopyJobsRequest) super.clone();
    }

}
