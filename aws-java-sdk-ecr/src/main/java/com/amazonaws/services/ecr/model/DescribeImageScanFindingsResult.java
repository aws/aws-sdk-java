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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/DescribeImageScanFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageScanFindingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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

    private ImageIdentifier imageId;
    /**
     * <p>
     * The current state of the scan.
     * </p>
     */
    private ImageScanStatus imageScanStatus;
    /**
     * <p>
     * The information contained in the image scan findings.
     * </p>
     */
    private ImageScanFindings imageScanFindings;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the
     * results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;

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

    public DescribeImageScanFindingsResult withRegistryId(String registryId) {
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

    public DescribeImageScanFindingsResult withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * @param imageId
     */

    public void setImageId(ImageIdentifier imageId) {
        this.imageId = imageId;
    }

    /**
     * @return
     */

    public ImageIdentifier getImageId() {
        return this.imageId;
    }

    /**
     * @param imageId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageScanFindingsResult withImageId(ImageIdentifier imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The current state of the scan.
     * </p>
     * 
     * @param imageScanStatus
     *        The current state of the scan.
     */

    public void setImageScanStatus(ImageScanStatus imageScanStatus) {
        this.imageScanStatus = imageScanStatus;
    }

    /**
     * <p>
     * The current state of the scan.
     * </p>
     * 
     * @return The current state of the scan.
     */

    public ImageScanStatus getImageScanStatus() {
        return this.imageScanStatus;
    }

    /**
     * <p>
     * The current state of the scan.
     * </p>
     * 
     * @param imageScanStatus
     *        The current state of the scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageScanFindingsResult withImageScanStatus(ImageScanStatus imageScanStatus) {
        setImageScanStatus(imageScanStatus);
        return this;
    }

    /**
     * <p>
     * The information contained in the image scan findings.
     * </p>
     * 
     * @param imageScanFindings
     *        The information contained in the image scan findings.
     */

    public void setImageScanFindings(ImageScanFindings imageScanFindings) {
        this.imageScanFindings = imageScanFindings;
    }

    /**
     * <p>
     * The information contained in the image scan findings.
     * </p>
     * 
     * @return The information contained in the image scan findings.
     */

    public ImageScanFindings getImageScanFindings() {
        return this.imageScanFindings;
    }

    /**
     * <p>
     * The information contained in the image scan findings.
     * </p>
     * 
     * @param imageScanFindings
     *        The information contained in the image scan findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageScanFindingsResult withImageScanFindings(ImageScanFindings imageScanFindings) {
        setImageScanFindings(imageScanFindings);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the
     * results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request.
     *        When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the
     * results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request.
     *         When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request. When the
     * results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this value can be
     * used to retrieve the next page of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeImageScanFindings</code> request.
     *        When the results of a <code>DescribeImageScanFindings</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageScanFindingsResult withNextToken(String nextToken) {
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImageScanStatus() != null)
            sb.append("ImageScanStatus: ").append(getImageScanStatus()).append(",");
        if (getImageScanFindings() != null)
            sb.append("ImageScanFindings: ").append(getImageScanFindings()).append(",");
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

        if (obj instanceof DescribeImageScanFindingsResult == false)
            return false;
        DescribeImageScanFindingsResult other = (DescribeImageScanFindingsResult) obj;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageScanStatus() == null ^ this.getImageScanStatus() == null)
            return false;
        if (other.getImageScanStatus() != null && other.getImageScanStatus().equals(this.getImageScanStatus()) == false)
            return false;
        if (other.getImageScanFindings() == null ^ this.getImageScanFindings() == null)
            return false;
        if (other.getImageScanFindings() != null && other.getImageScanFindings().equals(this.getImageScanFindings()) == false)
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

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageScanStatus() == null) ? 0 : getImageScanStatus().hashCode());
        hashCode = prime * hashCode + ((getImageScanFindings() == null) ? 0 : getImageScanFindings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageScanFindingsResult clone() {
        try {
            return (DescribeImageScanFindingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
