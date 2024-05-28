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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxVolumesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     */
    private String volumeType;

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, whose clusters can attach to the volume.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, whose clusters can attach to the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @return The maximum number of results to return in this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxVolumesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @see KxVolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @return The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @see KxVolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public ListKxVolumesRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * </p>
     * 
     * @param volumeType
     *        The type of file system volume. Currently, FinSpace only supports <code>NAS_1</code> volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxVolumeType
     */

    public ListKxVolumesRequest withVolumeType(KxVolumeType volumeType) {
        this.volumeType = volumeType.toString();
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKxVolumesRequest == false)
            return false;
        ListKxVolumesRequest other = (ListKxVolumesRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        return hashCode;
    }

    @Override
    public ListKxVolumesRequest clone() {
        return (ListKxVolumesRequest) super.clone();
    }

}
