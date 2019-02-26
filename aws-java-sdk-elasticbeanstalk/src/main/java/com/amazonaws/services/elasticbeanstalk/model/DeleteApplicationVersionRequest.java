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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to delete an application version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DeleteApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The label of the version to delete.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application version
     * is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     */
    private Boolean deleteSourceBundle;

    /**
     * Default constructor for DeleteApplicationVersionRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteApplicationVersionRequest() {
    }

    /**
     * Constructs a new DeleteApplicationVersionRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application to which the version belongs.
     * @param versionLabel
     *        The label of the version to delete.
     */
    public DeleteApplicationVersionRequest(String applicationName, String versionLabel) {
        setApplicationName(applicationName);
        setVersionLabel(versionLabel);
    }

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the version belongs.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * 
     * @return The name of the application to which the version belongs.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to which the version belongs.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVersionRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * 
     * @param versionLabel
     *        The label of the version to delete.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * 
     * @return The label of the version to delete.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The label of the version to delete.
     * </p>
     * 
     * @param versionLabel
     *        The label of the version to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVersionRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application version
     * is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     * 
     * @param deleteSourceBundle
     *        Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application
     *        version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     */

    public void setDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application version
     * is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     * 
     * @return Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application
     *         version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     */

    public Boolean getDeleteSourceBundle() {
        return this.deleteSourceBundle;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application version
     * is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     * 
     * @param deleteSourceBundle
     *        Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application
     *        version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVersionRequest withDeleteSourceBundle(Boolean deleteSourceBundle) {
        setDeleteSourceBundle(deleteSourceBundle);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application version
     * is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     * </p>
     * 
     * @return Set to <code>true</code> to delete the source bundle from your storage bucket. Otherwise, the application
     *         version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
     */

    public Boolean isDeleteSourceBundle() {
        return this.deleteSourceBundle;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getDeleteSourceBundle() != null)
            sb.append("DeleteSourceBundle: ").append(getDeleteSourceBundle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationVersionRequest == false)
            return false;
        DeleteApplicationVersionRequest other = (DeleteApplicationVersionRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDeleteSourceBundle() == null ^ this.getDeleteSourceBundle() == null)
            return false;
        if (other.getDeleteSourceBundle() != null && other.getDeleteSourceBundle().equals(this.getDeleteSourceBundle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getDeleteSourceBundle() == null) ? 0 : getDeleteSourceBundle().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationVersionRequest clone() {
        return (DeleteApplicationVersionRequest) super.clone();
    }

}
