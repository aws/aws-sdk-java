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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeFolderResolvedPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFolderResolvedPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the folder.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the folder.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The namespace of the folder whose permissions you want described.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the folder.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the folder.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the folder.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that contains the folder.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the folder.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderResolvedPermissionsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @return The ID of the folder.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderResolvedPermissionsRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The namespace of the folder whose permissions you want described.
     * </p>
     * 
     * @param namespace
     *        The namespace of the folder whose permissions you want described.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the folder whose permissions you want described.
     * </p>
     * 
     * @return The namespace of the folder whose permissions you want described.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the folder whose permissions you want described.
     * </p>
     * 
     * @param namespace
     *        The namespace of the folder whose permissions you want described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderResolvedPermissionsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @return The maximum number of results to be returned per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderResolvedPermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * 
     * @return A pagination token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderResolvedPermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFolderResolvedPermissionsRequest == false)
            return false;
        DescribeFolderResolvedPermissionsRequest other = (DescribeFolderResolvedPermissionsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFolderResolvedPermissionsRequest clone() {
        return (DescribeFolderResolvedPermissionsRequest) super.clone();
    }

}
