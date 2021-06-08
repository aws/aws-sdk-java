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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageVersionsStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageVersionsStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed to
     * update.
     * </p>
     */
    private java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions;
    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status that
     * successfully updated.
     * </p>
     */
    private java.util.Map<String, PackageVersionError> failedVersions;

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed to
     * update.
     * </p>
     * 
     * @return A list of <code>PackageVersionError</code> objects, one for each package version with a status that
     *         failed to update.
     */

    public java.util.Map<String, SuccessfulPackageVersionInfo> getSuccessfulVersions() {
        return successfulVersions;
    }

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed to
     * update.
     * </p>
     * 
     * @param successfulVersions
     *        A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed
     *        to update.
     */

    public void setSuccessfulVersions(java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
    }

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed to
     * update.
     * </p>
     * 
     * @param successfulVersions
     *        A list of <code>PackageVersionError</code> objects, one for each package version with a status that failed
     *        to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult withSuccessfulVersions(java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        setSuccessfulVersions(successfulVersions);
        return this;
    }

    /**
     * Add a single SuccessfulVersions entry
     *
     * @see UpdatePackageVersionsStatusResult#withSuccessfulVersions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult addSuccessfulVersionsEntry(String key, SuccessfulPackageVersionInfo value) {
        if (null == this.successfulVersions) {
            this.successfulVersions = new java.util.HashMap<String, SuccessfulPackageVersionInfo>();
        }
        if (this.successfulVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.successfulVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SuccessfulVersions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult clearSuccessfulVersionsEntries() {
        this.successfulVersions = null;
        return this;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status that
     * successfully updated.
     * </p>
     * 
     * @return A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status
     *         that successfully updated.
     */

    public java.util.Map<String, PackageVersionError> getFailedVersions() {
        return failedVersions;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status that
     * successfully updated.
     * </p>
     * 
     * @param failedVersions
     *        A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status
     *        that successfully updated.
     */

    public void setFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status that
     * successfully updated.
     * </p>
     * 
     * @param failedVersions
     *        A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each package version with a status
     *        that successfully updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult withFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        setFailedVersions(failedVersions);
        return this;
    }

    /**
     * Add a single FailedVersions entry
     *
     * @see UpdatePackageVersionsStatusResult#withFailedVersions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult addFailedVersionsEntry(String key, PackageVersionError value) {
        if (null == this.failedVersions) {
            this.failedVersions = new java.util.HashMap<String, PackageVersionError>();
        }
        if (this.failedVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedVersions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionsStatusResult clearFailedVersionsEntries() {
        this.failedVersions = null;
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
        if (getSuccessfulVersions() != null)
            sb.append("SuccessfulVersions: ").append(getSuccessfulVersions()).append(",");
        if (getFailedVersions() != null)
            sb.append("FailedVersions: ").append(getFailedVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageVersionsStatusResult == false)
            return false;
        UpdatePackageVersionsStatusResult other = (UpdatePackageVersionsStatusResult) obj;
        if (other.getSuccessfulVersions() == null ^ this.getSuccessfulVersions() == null)
            return false;
        if (other.getSuccessfulVersions() != null && other.getSuccessfulVersions().equals(this.getSuccessfulVersions()) == false)
            return false;
        if (other.getFailedVersions() == null ^ this.getFailedVersions() == null)
            return false;
        if (other.getFailedVersions() != null && other.getFailedVersions().equals(this.getFailedVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulVersions() == null) ? 0 : getSuccessfulVersions().hashCode());
        hashCode = prime * hashCode + ((getFailedVersions() == null) ? 0 : getFailedVersions().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageVersionsStatusResult clone() {
        try {
            return (UpdatePackageVersionsStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
