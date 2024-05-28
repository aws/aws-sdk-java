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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpdatePackageGroupOriginConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageGroupOriginConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The package group and information about it after processing the request.
     * </p>
     */
    private PackageGroupDescription packageGroup;
    /**
     * <p>
     * Information about the updated allowed repositories after processing the request.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, java.util.List<String>>> allowedRepositoryUpdates;

    /**
     * <p>
     * The package group and information about it after processing the request.
     * </p>
     * 
     * @param packageGroup
     *        The package group and information about it after processing the request.
     */

    public void setPackageGroup(PackageGroupDescription packageGroup) {
        this.packageGroup = packageGroup;
    }

    /**
     * <p>
     * The package group and information about it after processing the request.
     * </p>
     * 
     * @return The package group and information about it after processing the request.
     */

    public PackageGroupDescription getPackageGroup() {
        return this.packageGroup;
    }

    /**
     * <p>
     * The package group and information about it after processing the request.
     * </p>
     * 
     * @param packageGroup
     *        The package group and information about it after processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationResult withPackageGroup(PackageGroupDescription packageGroup) {
        setPackageGroup(packageGroup);
        return this;
    }

    /**
     * <p>
     * Information about the updated allowed repositories after processing the request.
     * </p>
     * 
     * @return Information about the updated allowed repositories after processing the request.
     */

    public java.util.Map<String, java.util.Map<String, java.util.List<String>>> getAllowedRepositoryUpdates() {
        return allowedRepositoryUpdates;
    }

    /**
     * <p>
     * Information about the updated allowed repositories after processing the request.
     * </p>
     * 
     * @param allowedRepositoryUpdates
     *        Information about the updated allowed repositories after processing the request.
     */

    public void setAllowedRepositoryUpdates(java.util.Map<String, java.util.Map<String, java.util.List<String>>> allowedRepositoryUpdates) {
        this.allowedRepositoryUpdates = allowedRepositoryUpdates;
    }

    /**
     * <p>
     * Information about the updated allowed repositories after processing the request.
     * </p>
     * 
     * @param allowedRepositoryUpdates
     *        Information about the updated allowed repositories after processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationResult withAllowedRepositoryUpdates(
            java.util.Map<String, java.util.Map<String, java.util.List<String>>> allowedRepositoryUpdates) {
        setAllowedRepositoryUpdates(allowedRepositoryUpdates);
        return this;
    }

    /**
     * Add a single AllowedRepositoryUpdates entry
     *
     * @see UpdatePackageGroupOriginConfigurationResult#withAllowedRepositoryUpdates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationResult addAllowedRepositoryUpdatesEntry(String key, java.util.Map<String, java.util.List<String>> value) {
        if (null == this.allowedRepositoryUpdates) {
            this.allowedRepositoryUpdates = new java.util.HashMap<String, java.util.Map<String, java.util.List<String>>>();
        }
        if (this.allowedRepositoryUpdates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.allowedRepositoryUpdates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AllowedRepositoryUpdates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageGroupOriginConfigurationResult clearAllowedRepositoryUpdatesEntries() {
        this.allowedRepositoryUpdates = null;
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
        if (getPackageGroup() != null)
            sb.append("PackageGroup: ").append(getPackageGroup()).append(",");
        if (getAllowedRepositoryUpdates() != null)
            sb.append("AllowedRepositoryUpdates: ").append(getAllowedRepositoryUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageGroupOriginConfigurationResult == false)
            return false;
        UpdatePackageGroupOriginConfigurationResult other = (UpdatePackageGroupOriginConfigurationResult) obj;
        if (other.getPackageGroup() == null ^ this.getPackageGroup() == null)
            return false;
        if (other.getPackageGroup() != null && other.getPackageGroup().equals(this.getPackageGroup()) == false)
            return false;
        if (other.getAllowedRepositoryUpdates() == null ^ this.getAllowedRepositoryUpdates() == null)
            return false;
        if (other.getAllowedRepositoryUpdates() != null && other.getAllowedRepositoryUpdates().equals(this.getAllowedRepositoryUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageGroup() == null) ? 0 : getPackageGroup().hashCode());
        hashCode = prime * hashCode + ((getAllowedRepositoryUpdates() == null) ? 0 : getAllowedRepositoryUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageGroupOriginConfigurationResult clone() {
        try {
            return (UpdatePackageGroupOriginConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
