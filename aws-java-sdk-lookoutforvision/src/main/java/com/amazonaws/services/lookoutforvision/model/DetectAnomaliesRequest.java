/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DetectAnomalies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectAnomaliesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the model version that you want to use.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The version of the model that you want to use.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The unencrypted image bytes that you want to analyze.
     * </p>
     */
    private java.io.InputStream body;
    /**
     * <p>
     * The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format images)
     * and <code>image/jpeg</code> (JPG format images).
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The name of the project that contains the model version that you want to use.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model version that you want to use.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model version that you want to use.
     * </p>
     * 
     * @return The name of the project that contains the model version that you want to use.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the model version that you want to use.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the model version that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomaliesRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The version of the model that you want to use.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to use.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to use.
     * </p>
     * 
     * @return The version of the model that you want to use.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model that you want to use.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model that you want to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomaliesRequest withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The unencrypted image bytes that you want to analyze.
     * </p>
     * 
     * @param body
     *        The unencrypted image bytes that you want to analyze.
     */

    public void setBody(java.io.InputStream body) {
        this.body = body;
    }

    /**
     * <p>
     * The unencrypted image bytes that you want to analyze.
     * </p>
     * 
     * @return The unencrypted image bytes that you want to analyze.
     */

    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * <p>
     * The unencrypted image bytes that you want to analyze.
     * </p>
     * 
     * @param body
     *        The unencrypted image bytes that you want to analyze.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomaliesRequest withBody(java.io.InputStream body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format images)
     * and <code>image/jpeg</code> (JPG format images).
     * </p>
     * 
     * @param contentType
     *        The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format
     *        images) and <code>image/jpeg</code> (JPG format images).
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format images)
     * and <code>image/jpeg</code> (JPG format images).
     * </p>
     * 
     * @return The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format
     *         images) and <code>image/jpeg</code> (JPG format images).
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format images)
     * and <code>image/jpeg</code> (JPG format images).
     * </p>
     * 
     * @param contentType
     *        The type of the image passed in <code>Body</code>. Valid values are <code>image/png</code> (PNG format
     *        images) and <code>image/jpeg</code> (JPG format images).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectAnomaliesRequest withContentType(String contentType) {
        setContentType(contentType);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectAnomaliesRequest == false)
            return false;
        DetectAnomaliesRequest other = (DetectAnomaliesRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public DetectAnomaliesRequest clone() {
        return (DetectAnomaliesRequest) super.clone();
    }

}
