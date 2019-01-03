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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetLifecyclePolicyPreview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLifecyclePolicyPreviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     */
    private String lifecyclePolicyText;
    /**
     * <p>
     * The status of the lifecycle policy preview request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the
     * results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The results of the lifecycle policy preview request.
     * </p>
     */
    private java.util.List<LifecyclePolicyPreviewResult> previewResults;
    /**
     * <p>
     * The list of images that is returned as a result of the action.
     * </p>
     */
    private LifecyclePolicyPreviewSummary summary;

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @return The registry ID associated with the request.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The registry ID associated with the request.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @return The repository name associated with the request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the request.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON lifecycle policy text.
     */

    public void setLifecyclePolicyText(String lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @return The JSON lifecycle policy text.
     */

    public String getLifecyclePolicyText() {
        return this.lifecyclePolicyText;
    }

    /**
     * <p>
     * The JSON lifecycle policy text.
     * </p>
     * 
     * @param lifecyclePolicyText
     *        The JSON lifecycle policy text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withLifecyclePolicyText(String lifecyclePolicyText) {
        setLifecyclePolicyText(lifecyclePolicyText);
        return this;
    }

    /**
     * <p>
     * The status of the lifecycle policy preview request.
     * </p>
     * 
     * @param status
     *        The status of the lifecycle policy preview request.
     * @see LifecyclePolicyPreviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the lifecycle policy preview request.
     * </p>
     * 
     * @return The status of the lifecycle policy preview request.
     * @see LifecyclePolicyPreviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the lifecycle policy preview request.
     * </p>
     * 
     * @param status
     *        The status of the lifecycle policy preview request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyPreviewStatus
     */

    public GetLifecyclePolicyPreviewResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the lifecycle policy preview request.
     * </p>
     * 
     * @param status
     *        The status of the lifecycle policy preview request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyPreviewStatus
     */

    public GetLifecyclePolicyPreviewResult withStatus(LifecyclePolicyPreviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the
     * results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request.
     *        When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the
     * results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request.
     *         When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request. When the
     * results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>GetLifecyclePolicyPreview</code> request.
     *        When the results of a <code>GetLifecyclePolicyPreview</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The results of the lifecycle policy preview request.
     * </p>
     * 
     * @return The results of the lifecycle policy preview request.
     */

    public java.util.List<LifecyclePolicyPreviewResult> getPreviewResults() {
        return previewResults;
    }

    /**
     * <p>
     * The results of the lifecycle policy preview request.
     * </p>
     * 
     * @param previewResults
     *        The results of the lifecycle policy preview request.
     */

    public void setPreviewResults(java.util.Collection<LifecyclePolicyPreviewResult> previewResults) {
        if (previewResults == null) {
            this.previewResults = null;
            return;
        }

        this.previewResults = new java.util.ArrayList<LifecyclePolicyPreviewResult>(previewResults);
    }

    /**
     * <p>
     * The results of the lifecycle policy preview request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPreviewResults(java.util.Collection)} or {@link #withPreviewResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param previewResults
     *        The results of the lifecycle policy preview request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withPreviewResults(LifecyclePolicyPreviewResult... previewResults) {
        if (this.previewResults == null) {
            setPreviewResults(new java.util.ArrayList<LifecyclePolicyPreviewResult>(previewResults.length));
        }
        for (LifecyclePolicyPreviewResult ele : previewResults) {
            this.previewResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The results of the lifecycle policy preview request.
     * </p>
     * 
     * @param previewResults
     *        The results of the lifecycle policy preview request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withPreviewResults(java.util.Collection<LifecyclePolicyPreviewResult> previewResults) {
        setPreviewResults(previewResults);
        return this;
    }

    /**
     * <p>
     * The list of images that is returned as a result of the action.
     * </p>
     * 
     * @param summary
     *        The list of images that is returned as a result of the action.
     */

    public void setSummary(LifecyclePolicyPreviewSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The list of images that is returned as a result of the action.
     * </p>
     * 
     * @return The list of images that is returned as a result of the action.
     */

    public LifecyclePolicyPreviewSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The list of images that is returned as a result of the action.
     * </p>
     * 
     * @param summary
     *        The list of images that is returned as a result of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLifecyclePolicyPreviewResult withSummary(LifecyclePolicyPreviewSummary summary) {
        setSummary(summary);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getLifecyclePolicyText() != null)
            sb.append("LifecyclePolicyText: ").append(getLifecyclePolicyText()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPreviewResults() != null)
            sb.append("PreviewResults: ").append(getPreviewResults()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLifecyclePolicyPreviewResult == false)
            return false;
        GetLifecyclePolicyPreviewResult other = (GetLifecyclePolicyPreviewResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getLifecyclePolicyText() == null ^ this.getLifecyclePolicyText() == null)
            return false;
        if (other.getLifecyclePolicyText() != null && other.getLifecyclePolicyText().equals(this.getLifecyclePolicyText()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPreviewResults() == null ^ this.getPreviewResults() == null)
            return false;
        if (other.getPreviewResults() != null && other.getPreviewResults().equals(this.getPreviewResults()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyText() == null) ? 0 : getLifecyclePolicyText().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPreviewResults() == null) ? 0 : getPreviewResults().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetLifecyclePolicyPreviewResult clone() {
        try {
            return (GetLifecyclePolicyPreviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
