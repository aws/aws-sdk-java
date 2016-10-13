/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to delete an application version.
 * </p>
 */
public class DeleteApplicationVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to delete releases from.
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
     * Indicates whether to delete the associated source bundle from Amazon S3:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time of
     * creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
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
     *        The name of the application to delete releases from.
     * @param versionLabel
     *        The label of the version to delete.
     */
    public DeleteApplicationVersionRequest(String applicationName, String versionLabel) {
        setApplicationName(applicationName);
        setVersionLabel(versionLabel);
    }

    /**
     * <p>
     * The name of the application to delete releases from.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete releases from.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to delete releases from.
     * </p>
     * 
     * @return The name of the application to delete releases from.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to delete releases from.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to delete releases from.
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
     * Indicates whether to delete the associated source bundle from Amazon S3:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time of
     * creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param deleteSourceBundle
     *        Indicates whether to delete the associated source bundle from Amazon S3:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time
     *        of creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */

    public void setDeleteSourceBundle(Boolean deleteSourceBundle) {
        this.deleteSourceBundle = deleteSourceBundle;
    }

    /**
     * <p>
     * Indicates whether to delete the associated source bundle from Amazon S3:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time of
     * creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Indicates whether to delete the associated source bundle from Amazon S3:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time
     *         of creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean getDeleteSourceBundle() {
        return this.deleteSourceBundle;
    }

    /**
     * <p>
     * Indicates whether to delete the associated source bundle from Amazon S3:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time of
     * creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param deleteSourceBundle
     *        Indicates whether to delete the associated source bundle from Amazon S3:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time
     *        of creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationVersionRequest withDeleteSourceBundle(Boolean deleteSourceBundle) {
        setDeleteSourceBundle(deleteSourceBundle);
        return this;
    }

    /**
     * <p>
     * Indicates whether to delete the associated source bundle from Amazon S3:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time of
     * creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return Indicates whether to delete the associated source bundle from Amazon S3:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: An attempt is made to delete the associated Amazon S3 source bundle specified at time
     *         of creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: No action is taken on the Amazon S3 source bundle specified at time of creation.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */

    public Boolean isDeleteSourceBundle() {
        return this.deleteSourceBundle;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDeleteSourceBundle() != null)
            sb.append("DeleteSourceBundle: " + getDeleteSourceBundle());
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
