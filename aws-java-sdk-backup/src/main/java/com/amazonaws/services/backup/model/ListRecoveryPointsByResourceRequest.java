/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecoveryPointsByResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <note>
     * <p>
     * Amazon RDS requires a value of at least 20.
     * </p>
     * </note>
     */
    private Integer maxResults;
    /**
     * <p>
     * This attribute filters recovery points based on ownership.
     * </p>
     * <p>
     * If this is set to <code>TRUE</code>, the response will contain recovery points associated with the selected
     * resources that are managed by Backup.
     * </p>
     * <p>
     * If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the selected
     * resource.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     */
    private Boolean managedByAWSBackupOnly;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @return An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>MaxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <note>
     * <p>
     * Amazon RDS requires a value of at least 20.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.</p> <note>
     *        <p>
     *        Amazon RDS requires a value of at least 20.
     *        </p>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <note>
     * <p>
     * Amazon RDS requires a value of at least 20.
     * </p>
     * </note>
     * 
     * @return The maximum number of items to be returned.</p> <note>
     *         <p>
     *         Amazon RDS requires a value of at least 20.
     *         </p>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to be returned.
     * </p>
     * <note>
     * <p>
     * Amazon RDS requires a value of at least 20.
     * </p>
     * </note>
     * 
     * @param maxResults
     *        The maximum number of items to be returned.</p> <note>
     *        <p>
     *        Amazon RDS requires a value of at least 20.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * This attribute filters recovery points based on ownership.
     * </p>
     * <p>
     * If this is set to <code>TRUE</code>, the response will contain recovery points associated with the selected
     * resources that are managed by Backup.
     * </p>
     * <p>
     * If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the selected
     * resource.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param managedByAWSBackupOnly
     *        This attribute filters recovery points based on ownership.</p>
     *        <p>
     *        If this is set to <code>TRUE</code>, the response will contain recovery points associated with the
     *        selected resources that are managed by Backup.
     *        </p>
     *        <p>
     *        If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the
     *        selected resource.
     *        </p>
     *        <p>
     *        Type: Boolean
     */

    public void setManagedByAWSBackupOnly(Boolean managedByAWSBackupOnly) {
        this.managedByAWSBackupOnly = managedByAWSBackupOnly;
    }

    /**
     * <p>
     * This attribute filters recovery points based on ownership.
     * </p>
     * <p>
     * If this is set to <code>TRUE</code>, the response will contain recovery points associated with the selected
     * resources that are managed by Backup.
     * </p>
     * <p>
     * If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the selected
     * resource.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return This attribute filters recovery points based on ownership.</p>
     *         <p>
     *         If this is set to <code>TRUE</code>, the response will contain recovery points associated with the
     *         selected resources that are managed by Backup.
     *         </p>
     *         <p>
     *         If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the
     *         selected resource.
     *         </p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean getManagedByAWSBackupOnly() {
        return this.managedByAWSBackupOnly;
    }

    /**
     * <p>
     * This attribute filters recovery points based on ownership.
     * </p>
     * <p>
     * If this is set to <code>TRUE</code>, the response will contain recovery points associated with the selected
     * resources that are managed by Backup.
     * </p>
     * <p>
     * If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the selected
     * resource.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @param managedByAWSBackupOnly
     *        This attribute filters recovery points based on ownership.</p>
     *        <p>
     *        If this is set to <code>TRUE</code>, the response will contain recovery points associated with the
     *        selected resources that are managed by Backup.
     *        </p>
     *        <p>
     *        If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the
     *        selected resource.
     *        </p>
     *        <p>
     *        Type: Boolean
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecoveryPointsByResourceRequest withManagedByAWSBackupOnly(Boolean managedByAWSBackupOnly) {
        setManagedByAWSBackupOnly(managedByAWSBackupOnly);
        return this;
    }

    /**
     * <p>
     * This attribute filters recovery points based on ownership.
     * </p>
     * <p>
     * If this is set to <code>TRUE</code>, the response will contain recovery points associated with the selected
     * resources that are managed by Backup.
     * </p>
     * <p>
     * If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the selected
     * resource.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * 
     * @return This attribute filters recovery points based on ownership.</p>
     *         <p>
     *         If this is set to <code>TRUE</code>, the response will contain recovery points associated with the
     *         selected resources that are managed by Backup.
     *         </p>
     *         <p>
     *         If this is set to <code>FALSE</code>, the response will contain all recovery points associated with the
     *         selected resource.
     *         </p>
     *         <p>
     *         Type: Boolean
     */

    public Boolean isManagedByAWSBackupOnly() {
        return this.managedByAWSBackupOnly;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getManagedByAWSBackupOnly() != null)
            sb.append("ManagedByAWSBackupOnly: ").append(getManagedByAWSBackupOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecoveryPointsByResourceRequest == false)
            return false;
        ListRecoveryPointsByResourceRequest other = (ListRecoveryPointsByResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getManagedByAWSBackupOnly() == null ^ this.getManagedByAWSBackupOnly() == null)
            return false;
        if (other.getManagedByAWSBackupOnly() != null && other.getManagedByAWSBackupOnly().equals(this.getManagedByAWSBackupOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getManagedByAWSBackupOnly() == null) ? 0 : getManagedByAWSBackupOnly().hashCode());
        return hashCode;
    }

    @Override
    public ListRecoveryPointsByResourceRequest clone() {
        return (ListRecoveryPointsByResourceRequest) super.clone();
    }

}
