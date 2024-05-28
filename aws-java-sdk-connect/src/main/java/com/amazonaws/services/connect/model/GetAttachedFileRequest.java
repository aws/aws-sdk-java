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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request to GetAttachedFile API.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetAttachedFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttachedFileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     */
    private String fileId;
    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     */
    private Integer urlExpiryInSeconds;
    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     */
    private String associatedResourceArn;

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @return The unique identifier of the Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     */

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @return The unique identifier of the attached file resource.
     */

    public String getFileId() {
        return this.fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileRequest withFileId(String fileId) {
        setFileId(fileId);
        return this;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @param urlExpiryInSeconds
     *        Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     */

    public void setUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @return Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     */

    public Integer getUrlExpiryInSeconds() {
        return this.urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @param urlExpiryInSeconds
     *        Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileRequest withUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        setUrlExpiryInSeconds(urlExpiryInSeconds);
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
     */

    public void setAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @return The resource to which the attached file is (being) uploaded to. <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.</p> <note>
     *         <p>
     *         This value must be a valid ARN.
     *         </p>
     */

    public String getAssociatedResourceArn() {
        return this.associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileRequest withAssociatedResourceArn(String associatedResourceArn) {
        setAssociatedResourceArn(associatedResourceArn);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getFileId() != null)
            sb.append("FileId: ").append(getFileId()).append(",");
        if (getUrlExpiryInSeconds() != null)
            sb.append("UrlExpiryInSeconds: ").append(getUrlExpiryInSeconds()).append(",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: ").append(getAssociatedResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttachedFileRequest == false)
            return false;
        GetAttachedFileRequest other = (GetAttachedFileRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        if (other.getUrlExpiryInSeconds() == null ^ this.getUrlExpiryInSeconds() == null)
            return false;
        if (other.getUrlExpiryInSeconds() != null && other.getUrlExpiryInSeconds().equals(this.getUrlExpiryInSeconds()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiryInSeconds() == null) ? 0 : getUrlExpiryInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAttachedFileRequest clone() {
        return (GetAttachedFileRequest) super.clone();
    }

}
