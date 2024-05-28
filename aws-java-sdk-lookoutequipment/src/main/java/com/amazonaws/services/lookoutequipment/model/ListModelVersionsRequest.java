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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModelVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Then name of the machine learning model for which the model versions are to be listed.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of machine learning model versions to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filter the results based on the current status of the model version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Filter the results based on the way the model version was generated.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * Filter results to return all the model versions created before this time.
     * </p>
     */
    private java.util.Date createdAtEndTime;
    /**
     * <p>
     * Filter results to return all the model versions created after this time.
     * </p>
     */
    private java.util.Date createdAtStartTime;
    /**
     * <p>
     * Specifies the highest version of the model to return in the list.
     * </p>
     */
    private Long maxModelVersion;
    /**
     * <p>
     * Specifies the lowest version of the model to return in the list.
     * </p>
     */
    private Long minModelVersion;

    /**
     * <p>
     * Then name of the machine learning model for which the model versions are to be listed.
     * </p>
     * 
     * @param modelName
     *        Then name of the machine learning model for which the model versions are to be listed.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * Then name of the machine learning model for which the model versions are to be listed.
     * </p>
     * 
     * @return Then name of the machine learning model for which the model versions are to be listed.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * Then name of the machine learning model for which the model versions are to be listed.
     * </p>
     * 
     * @param modelName
     *        Then name of the machine learning model for which the model versions are to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results exceeds the limit that the response can display, the response returns an
     *        opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *        this token in the <code>NextToken</code> field in the request to list the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @return If the total number of results exceeds the limit that the response can display, the response returns an
     *         opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *         this token in the <code>NextToken</code> field in the request to list the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results exceeds the limit that the response can display, the response returns an opaque
     * pagination token indicating where to continue the listing of machine learning model versions. Use this token in
     * the <code>NextToken</code> field in the request to list the next page of results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results exceeds the limit that the response can display, the response returns an
     *        opaque pagination token indicating where to continue the listing of machine learning model versions. Use
     *        this token in the <code>NextToken</code> field in the request to list the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of machine learning model versions to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of machine learning model versions to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of machine learning model versions to list.
     * </p>
     * 
     * @return Specifies the maximum number of machine learning model versions to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of machine learning model versions to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of machine learning model versions to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filter the results based on the current status of the model version.
     * </p>
     * 
     * @param status
     *        Filter the results based on the current status of the model version.
     * @see ModelVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filter the results based on the current status of the model version.
     * </p>
     * 
     * @return Filter the results based on the current status of the model version.
     * @see ModelVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filter the results based on the current status of the model version.
     * </p>
     * 
     * @param status
     *        Filter the results based on the current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ListModelVersionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filter the results based on the current status of the model version.
     * </p>
     * 
     * @param status
     *        Filter the results based on the current status of the model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionStatus
     */

    public ListModelVersionsRequest withStatus(ModelVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filter the results based on the way the model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Filter the results based on the way the model version was generated.
     * @see ModelVersionSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Filter the results based on the way the model version was generated.
     * </p>
     * 
     * @return Filter the results based on the way the model version was generated.
     * @see ModelVersionSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Filter the results based on the way the model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Filter the results based on the way the model version was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public ListModelVersionsRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Filter the results based on the way the model version was generated.
     * </p>
     * 
     * @param sourceType
     *        Filter the results based on the way the model version was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelVersionSourceType
     */

    public ListModelVersionsRequest withSourceType(ModelVersionSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Filter results to return all the model versions created before this time.
     * </p>
     * 
     * @param createdAtEndTime
     *        Filter results to return all the model versions created before this time.
     */

    public void setCreatedAtEndTime(java.util.Date createdAtEndTime) {
        this.createdAtEndTime = createdAtEndTime;
    }

    /**
     * <p>
     * Filter results to return all the model versions created before this time.
     * </p>
     * 
     * @return Filter results to return all the model versions created before this time.
     */

    public java.util.Date getCreatedAtEndTime() {
        return this.createdAtEndTime;
    }

    /**
     * <p>
     * Filter results to return all the model versions created before this time.
     * </p>
     * 
     * @param createdAtEndTime
     *        Filter results to return all the model versions created before this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withCreatedAtEndTime(java.util.Date createdAtEndTime) {
        setCreatedAtEndTime(createdAtEndTime);
        return this;
    }

    /**
     * <p>
     * Filter results to return all the model versions created after this time.
     * </p>
     * 
     * @param createdAtStartTime
     *        Filter results to return all the model versions created after this time.
     */

    public void setCreatedAtStartTime(java.util.Date createdAtStartTime) {
        this.createdAtStartTime = createdAtStartTime;
    }

    /**
     * <p>
     * Filter results to return all the model versions created after this time.
     * </p>
     * 
     * @return Filter results to return all the model versions created after this time.
     */

    public java.util.Date getCreatedAtStartTime() {
        return this.createdAtStartTime;
    }

    /**
     * <p>
     * Filter results to return all the model versions created after this time.
     * </p>
     * 
     * @param createdAtStartTime
     *        Filter results to return all the model versions created after this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withCreatedAtStartTime(java.util.Date createdAtStartTime) {
        setCreatedAtStartTime(createdAtStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the highest version of the model to return in the list.
     * </p>
     * 
     * @param maxModelVersion
     *        Specifies the highest version of the model to return in the list.
     */

    public void setMaxModelVersion(Long maxModelVersion) {
        this.maxModelVersion = maxModelVersion;
    }

    /**
     * <p>
     * Specifies the highest version of the model to return in the list.
     * </p>
     * 
     * @return Specifies the highest version of the model to return in the list.
     */

    public Long getMaxModelVersion() {
        return this.maxModelVersion;
    }

    /**
     * <p>
     * Specifies the highest version of the model to return in the list.
     * </p>
     * 
     * @param maxModelVersion
     *        Specifies the highest version of the model to return in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withMaxModelVersion(Long maxModelVersion) {
        setMaxModelVersion(maxModelVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the lowest version of the model to return in the list.
     * </p>
     * 
     * @param minModelVersion
     *        Specifies the lowest version of the model to return in the list.
     */

    public void setMinModelVersion(Long minModelVersion) {
        this.minModelVersion = minModelVersion;
    }

    /**
     * <p>
     * Specifies the lowest version of the model to return in the list.
     * </p>
     * 
     * @return Specifies the lowest version of the model to return in the list.
     */

    public Long getMinModelVersion() {
        return this.minModelVersion;
    }

    /**
     * <p>
     * Specifies the lowest version of the model to return in the list.
     * </p>
     * 
     * @param minModelVersion
     *        Specifies the lowest version of the model to return in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelVersionsRequest withMinModelVersion(Long minModelVersion) {
        setMinModelVersion(minModelVersion);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getCreatedAtEndTime() != null)
            sb.append("CreatedAtEndTime: ").append(getCreatedAtEndTime()).append(",");
        if (getCreatedAtStartTime() != null)
            sb.append("CreatedAtStartTime: ").append(getCreatedAtStartTime()).append(",");
        if (getMaxModelVersion() != null)
            sb.append("MaxModelVersion: ").append(getMaxModelVersion()).append(",");
        if (getMinModelVersion() != null)
            sb.append("MinModelVersion: ").append(getMinModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelVersionsRequest == false)
            return false;
        ListModelVersionsRequest other = (ListModelVersionsRequest) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getCreatedAtEndTime() == null ^ this.getCreatedAtEndTime() == null)
            return false;
        if (other.getCreatedAtEndTime() != null && other.getCreatedAtEndTime().equals(this.getCreatedAtEndTime()) == false)
            return false;
        if (other.getCreatedAtStartTime() == null ^ this.getCreatedAtStartTime() == null)
            return false;
        if (other.getCreatedAtStartTime() != null && other.getCreatedAtStartTime().equals(this.getCreatedAtStartTime()) == false)
            return false;
        if (other.getMaxModelVersion() == null ^ this.getMaxModelVersion() == null)
            return false;
        if (other.getMaxModelVersion() != null && other.getMaxModelVersion().equals(this.getMaxModelVersion()) == false)
            return false;
        if (other.getMinModelVersion() == null ^ this.getMinModelVersion() == null)
            return false;
        if (other.getMinModelVersion() != null && other.getMinModelVersion().equals(this.getMinModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAtEndTime() == null) ? 0 : getCreatedAtEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedAtStartTime() == null) ? 0 : getCreatedAtStartTime().hashCode());
        hashCode = prime * hashCode + ((getMaxModelVersion() == null) ? 0 : getMaxModelVersion().hashCode());
        hashCode = prime * hashCode + ((getMinModelVersion() == null) ? 0 : getMinModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public ListModelVersionsRequest clone() {
        return (ListModelVersionsRequest) super.clone();
    }

}
