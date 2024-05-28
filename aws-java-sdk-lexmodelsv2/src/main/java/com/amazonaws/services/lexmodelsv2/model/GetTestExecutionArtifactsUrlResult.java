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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GetTestExecutionArtifactsUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestExecutionArtifactsUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the completed test execution.
     * </p>
     */
    private String testExecutionId;
    /**
     * <p>
     * The pre-signed Amazon S3 URL to download completed test execution.
     * </p>
     */
    private String downloadArtifactsUrl;

    /**
     * <p>
     * The unique identifier of the completed test execution.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the completed test execution.
     */

    public void setTestExecutionId(String testExecutionId) {
        this.testExecutionId = testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the completed test execution.
     * </p>
     * 
     * @return The unique identifier of the completed test execution.
     */

    public String getTestExecutionId() {
        return this.testExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the completed test execution.
     * </p>
     * 
     * @param testExecutionId
     *        The unique identifier of the completed test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestExecutionArtifactsUrlResult withTestExecutionId(String testExecutionId) {
        setTestExecutionId(testExecutionId);
        return this;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL to download completed test execution.
     * </p>
     * 
     * @param downloadArtifactsUrl
     *        The pre-signed Amazon S3 URL to download completed test execution.
     */

    public void setDownloadArtifactsUrl(String downloadArtifactsUrl) {
        this.downloadArtifactsUrl = downloadArtifactsUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL to download completed test execution.
     * </p>
     * 
     * @return The pre-signed Amazon S3 URL to download completed test execution.
     */

    public String getDownloadArtifactsUrl() {
        return this.downloadArtifactsUrl;
    }

    /**
     * <p>
     * The pre-signed Amazon S3 URL to download completed test execution.
     * </p>
     * 
     * @param downloadArtifactsUrl
     *        The pre-signed Amazon S3 URL to download completed test execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestExecutionArtifactsUrlResult withDownloadArtifactsUrl(String downloadArtifactsUrl) {
        setDownloadArtifactsUrl(downloadArtifactsUrl);
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
        if (getTestExecutionId() != null)
            sb.append("TestExecutionId: ").append(getTestExecutionId()).append(",");
        if (getDownloadArtifactsUrl() != null)
            sb.append("DownloadArtifactsUrl: ").append(getDownloadArtifactsUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestExecutionArtifactsUrlResult == false)
            return false;
        GetTestExecutionArtifactsUrlResult other = (GetTestExecutionArtifactsUrlResult) obj;
        if (other.getTestExecutionId() == null ^ this.getTestExecutionId() == null)
            return false;
        if (other.getTestExecutionId() != null && other.getTestExecutionId().equals(this.getTestExecutionId()) == false)
            return false;
        if (other.getDownloadArtifactsUrl() == null ^ this.getDownloadArtifactsUrl() == null)
            return false;
        if (other.getDownloadArtifactsUrl() != null && other.getDownloadArtifactsUrl().equals(this.getDownloadArtifactsUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestExecutionId() == null) ? 0 : getTestExecutionId().hashCode());
        hashCode = prime * hashCode + ((getDownloadArtifactsUrl() == null) ? 0 : getDownloadArtifactsUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetTestExecutionArtifactsUrlResult clone() {
        try {
            return (GetTestExecutionArtifactsUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
