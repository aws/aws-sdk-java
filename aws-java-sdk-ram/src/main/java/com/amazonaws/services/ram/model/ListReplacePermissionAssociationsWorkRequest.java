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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListReplacePermissionAssociationsWork"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReplacePermissionAssociationsWorkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IDs. These values come from the <code>id</code>field of the
     * <code>replacePermissionAssociationsWork</code>structure returned by the <a>ReplacePermissionAssociations</a>
     * operation.
     * </p>
     */
    private java.util.List<String> workIds;
    /**
     * <p>
     * Specifies that you want to see only the details about requests with a status that matches this value.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of IDs. These values come from the <code>id</code>field of the
     * <code>replacePermissionAssociationsWork</code>structure returned by the <a>ReplacePermissionAssociations</a>
     * operation.
     * </p>
     * 
     * @return A list of IDs. These values come from the <code>id</code>field of the
     *         <code>replacePermissionAssociationsWork</code>structure returned by the
     *         <a>ReplacePermissionAssociations</a> operation.
     */

    public java.util.List<String> getWorkIds() {
        return workIds;
    }

    /**
     * <p>
     * A list of IDs. These values come from the <code>id</code>field of the
     * <code>replacePermissionAssociationsWork</code>structure returned by the <a>ReplacePermissionAssociations</a>
     * operation.
     * </p>
     * 
     * @param workIds
     *        A list of IDs. These values come from the <code>id</code>field of the
     *        <code>replacePermissionAssociationsWork</code>structure returned by the
     *        <a>ReplacePermissionAssociations</a> operation.
     */

    public void setWorkIds(java.util.Collection<String> workIds) {
        if (workIds == null) {
            this.workIds = null;
            return;
        }

        this.workIds = new java.util.ArrayList<String>(workIds);
    }

    /**
     * <p>
     * A list of IDs. These values come from the <code>id</code>field of the
     * <code>replacePermissionAssociationsWork</code>structure returned by the <a>ReplacePermissionAssociations</a>
     * operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkIds(java.util.Collection)} or {@link #withWorkIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param workIds
     *        A list of IDs. These values come from the <code>id</code>field of the
     *        <code>replacePermissionAssociationsWork</code>structure returned by the
     *        <a>ReplacePermissionAssociations</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplacePermissionAssociationsWorkRequest withWorkIds(String... workIds) {
        if (this.workIds == null) {
            setWorkIds(new java.util.ArrayList<String>(workIds.length));
        }
        for (String ele : workIds) {
            this.workIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs. These values come from the <code>id</code>field of the
     * <code>replacePermissionAssociationsWork</code>structure returned by the <a>ReplacePermissionAssociations</a>
     * operation.
     * </p>
     * 
     * @param workIds
     *        A list of IDs. These values come from the <code>id</code>field of the
     *        <code>replacePermissionAssociationsWork</code>structure returned by the
     *        <a>ReplacePermissionAssociations</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplacePermissionAssociationsWorkRequest withWorkIds(java.util.Collection<String> workIds) {
        setWorkIds(workIds);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to see only the details about requests with a status that matches this value.
     * </p>
     * 
     * @param status
     *        Specifies that you want to see only the details about requests with a status that matches this value.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies that you want to see only the details about requests with a status that matches this value.
     * </p>
     * 
     * @return Specifies that you want to see only the details about requests with a status that matches this value.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies that you want to see only the details about requests with a status that matches this value.
     * </p>
     * 
     * @param status
     *        Specifies that you want to see only the details about requests with a status that matches this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public ListReplacePermissionAssociationsWorkRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to see only the details about requests with a status that matches this value.
     * </p>
     * 
     * @param status
     *        Specifies that you want to see only the details about requests with a status that matches this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplacePermissionAssociationsWorkStatus
     */

    public ListReplacePermissionAssociationsWorkRequest withStatus(ReplacePermissionAssociationsWorkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplacePermissionAssociationsWorkRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included on each page of the response. If you do not
     *         include this parameter, it defaults to a value that is specific to the operation. If additional items
     *         exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *         (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results. Note that the service might return fewer results
     *         than the maximum even when there are more results available. You should check <code>NextToken</code>
     *         after every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReplacePermissionAssociationsWorkRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getWorkIds() != null)
            sb.append("WorkIds: ").append(getWorkIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReplacePermissionAssociationsWorkRequest == false)
            return false;
        ListReplacePermissionAssociationsWorkRequest other = (ListReplacePermissionAssociationsWorkRequest) obj;
        if (other.getWorkIds() == null ^ this.getWorkIds() == null)
            return false;
        if (other.getWorkIds() != null && other.getWorkIds().equals(this.getWorkIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkIds() == null) ? 0 : getWorkIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListReplacePermissionAssociationsWorkRequest clone() {
        return (ListReplacePermissionAssociationsWorkRequest) super.clone();
    }

}
