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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for create a new deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The jobId for this deployment, will supply to start deployment api.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to
     * upload url.
     * </p>
     */
    private java.util.Map<String, String> fileUploadUrls;
    /**
     * <p>
     * When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     * </p>
     */
    private String zipUploadUrl;

    /**
     * <p>
     * The jobId for this deployment, will supply to start deployment api.
     * </p>
     * 
     * @param jobId
     *        The jobId for this deployment, will supply to start deployment api.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The jobId for this deployment, will supply to start deployment api.
     * </p>
     * 
     * @return The jobId for this deployment, will supply to start deployment api.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The jobId for this deployment, will supply to start deployment api.
     * </p>
     * 
     * @param jobId
     *        The jobId for this deployment, will supply to start deployment api.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to
     * upload url.
     * </p>
     * 
     * @return When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names
     *         to upload url.
     */

    public java.util.Map<String, String> getFileUploadUrls() {
        return fileUploadUrls;
    }

    /**
     * <p>
     * When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to
     * upload url.
     * </p>
     * 
     * @param fileUploadUrls
     *        When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names
     *        to upload url.
     */

    public void setFileUploadUrls(java.util.Map<String, String> fileUploadUrls) {
        this.fileUploadUrls = fileUploadUrls;
    }

    /**
     * <p>
     * When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to
     * upload url.
     * </p>
     * 
     * @param fileUploadUrls
     *        When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names
     *        to upload url.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withFileUploadUrls(java.util.Map<String, String> fileUploadUrls) {
        setFileUploadUrls(fileUploadUrls);
        return this;
    }

    /**
     * Add a single FileUploadUrls entry
     *
     * @see CreateDeploymentResult#withFileUploadUrls
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult addFileUploadUrlsEntry(String key, String value) {
        if (null == this.fileUploadUrls) {
            this.fileUploadUrls = new java.util.HashMap<String, String>();
        }
        if (this.fileUploadUrls.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fileUploadUrls.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FileUploadUrls.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult clearFileUploadUrlsEntries() {
        this.fileUploadUrls = null;
        return this;
    }

    /**
     * <p>
     * When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     * </p>
     * 
     * @param zipUploadUrl
     *        When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     */

    public void setZipUploadUrl(String zipUploadUrl) {
        this.zipUploadUrl = zipUploadUrl;
    }

    /**
     * <p>
     * When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     * </p>
     * 
     * @return When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     */

    public String getZipUploadUrl() {
        return this.zipUploadUrl;
    }

    /**
     * <p>
     * When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     * </p>
     * 
     * @param zipUploadUrl
     *        When the fileMap argument is NOT provided. This zipUploadUrl will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentResult withZipUploadUrl(String zipUploadUrl) {
        setZipUploadUrl(zipUploadUrl);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getFileUploadUrls() != null)
            sb.append("FileUploadUrls: ").append(getFileUploadUrls()).append(",");
        if (getZipUploadUrl() != null)
            sb.append("ZipUploadUrl: ").append(getZipUploadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentResult == false)
            return false;
        CreateDeploymentResult other = (CreateDeploymentResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getFileUploadUrls() == null ^ this.getFileUploadUrls() == null)
            return false;
        if (other.getFileUploadUrls() != null && other.getFileUploadUrls().equals(this.getFileUploadUrls()) == false)
            return false;
        if (other.getZipUploadUrl() == null ^ this.getZipUploadUrl() == null)
            return false;
        if (other.getZipUploadUrl() != null && other.getZipUploadUrl().equals(this.getZipUploadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getFileUploadUrls() == null) ? 0 : getFileUploadUrls().hashCode());
        hashCode = prime * hashCode + ((getZipUploadUrl() == null) ? 0 : getZipUploadUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentResult clone() {
        try {
            return (CreateDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
