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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSimulationApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The current revision id for the simulation application. If you provide a value and it matches the latest revision
     * ID, a new version will be created.
     * </p>
     */
    private String currentRevisionId;
    /**
     * <p>
     * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * </p>
     */
    private java.util.List<String> s3Etags;
    /**
     * <p>
     * The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     * </p>
     */
    private String imageDigest;

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @return The application information for the simulation application.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application information for the simulation application.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationApplicationVersionRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The current revision id for the simulation application. If you provide a value and it matches the latest revision
     * ID, a new version will be created.
     * </p>
     * 
     * @param currentRevisionId
     *        The current revision id for the simulation application. If you provide a value and it matches the latest
     *        revision ID, a new version will be created.
     */

    public void setCurrentRevisionId(String currentRevisionId) {
        this.currentRevisionId = currentRevisionId;
    }

    /**
     * <p>
     * The current revision id for the simulation application. If you provide a value and it matches the latest revision
     * ID, a new version will be created.
     * </p>
     * 
     * @return The current revision id for the simulation application. If you provide a value and it matches the latest
     *         revision ID, a new version will be created.
     */

    public String getCurrentRevisionId() {
        return this.currentRevisionId;
    }

    /**
     * <p>
     * The current revision id for the simulation application. If you provide a value and it matches the latest revision
     * ID, a new version will be created.
     * </p>
     * 
     * @param currentRevisionId
     *        The current revision id for the simulation application. If you provide a value and it matches the latest
     *        revision ID, a new version will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationApplicationVersionRequest withCurrentRevisionId(String currentRevisionId) {
        setCurrentRevisionId(currentRevisionId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * </p>
     * 
     * @return The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     */

    public java.util.List<String> getS3Etags() {
        return s3Etags;
    }

    /**
     * <p>
     * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * </p>
     * 
     * @param s3Etags
     *        The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     */

    public void setS3Etags(java.util.Collection<String> s3Etags) {
        if (s3Etags == null) {
            this.s3Etags = null;
            return;
        }

        this.s3Etags = new java.util.ArrayList<String>(s3Etags);
    }

    /**
     * <p>
     * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setS3Etags(java.util.Collection)} or {@link #withS3Etags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param s3Etags
     *        The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationApplicationVersionRequest withS3Etags(String... s3Etags) {
        if (this.s3Etags == null) {
            setS3Etags(new java.util.ArrayList<String>(s3Etags.length));
        }
        for (String ele : s3Etags) {
            this.s3Etags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * </p>
     * 
     * @param s3Etags
     *        The Amazon S3 eTag identifier for the zip file bundle that you use to create the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationApplicationVersionRequest withS3Etags(java.util.Collection<String> s3Etags) {
        setS3Etags(s3Etags);
        return this;
    }

    /**
     * <p>
     * The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     * </p>
     * 
     * @param imageDigest
     *        The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     * </p>
     * 
     * @return The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     * </p>
     * 
     * @param imageDigest
     *        The SHA256 digest used to identify the Docker image URI used to created the simulation application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSimulationApplicationVersionRequest withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getCurrentRevisionId() != null)
            sb.append("CurrentRevisionId: ").append(getCurrentRevisionId()).append(",");
        if (getS3Etags() != null)
            sb.append("S3Etags: ").append(getS3Etags()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSimulationApplicationVersionRequest == false)
            return false;
        CreateSimulationApplicationVersionRequest other = (CreateSimulationApplicationVersionRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getCurrentRevisionId() == null ^ this.getCurrentRevisionId() == null)
            return false;
        if (other.getCurrentRevisionId() != null && other.getCurrentRevisionId().equals(this.getCurrentRevisionId()) == false)
            return false;
        if (other.getS3Etags() == null ^ this.getS3Etags() == null)
            return false;
        if (other.getS3Etags() != null && other.getS3Etags().equals(this.getS3Etags()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevisionId() == null) ? 0 : getCurrentRevisionId().hashCode());
        hashCode = prime * hashCode + ((getS3Etags() == null) ? 0 : getS3Etags().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        return hashCode;
    }

    @Override
    public CreateSimulationApplicationVersionRequest clone() {
        return (CreateSimulationApplicationVersionRequest) super.clone();
    }

}
