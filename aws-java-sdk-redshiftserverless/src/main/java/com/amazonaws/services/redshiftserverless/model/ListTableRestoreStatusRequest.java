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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTableRestoreStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display
     * the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the returned
     * <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will return results on
     * the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display
     * the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use nextToken to
     *        display the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display
     * the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use nextToken to
     *         display the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use nextToken to display
     * the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use nextToken to
     *        display the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     * </p>
     * 
     * @param namespaceName
     *        The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     * </p>
     * 
     * @return The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations
     *         .
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     * </p>
     * 
     * @param namespaceName
     *        The namespace from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the returned
     * <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will return results on
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the
     *        returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     *        return results on the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the returned
     * <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will return results on
     * the next page.
     * </p>
     * 
     * @return If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the
     *         returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     *         return results on the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the returned
     * <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will return results on
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListTableRestoreStatus</code> operation returns a nextToken, you can include the
     *        returned <code>nextToken</code> in following <code>ListTableRestoreStatus</code> operations. This will
     *        return results on the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     * </p>
     * 
     * @param workgroupName
     *        The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     * </p>
     * 
     * @return The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     * </p>
     * 
     * @param workgroupName
     *        The workgroup from which to list all of the statuses of <code>RestoreTableFromSnapshot</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTableRestoreStatusRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTableRestoreStatusRequest == false)
            return false;
        ListTableRestoreStatusRequest other = (ListTableRestoreStatusRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public ListTableRestoreStatusRequest clone() {
        return (ListTableRestoreStatusRequest) super.clone();
    }

}
