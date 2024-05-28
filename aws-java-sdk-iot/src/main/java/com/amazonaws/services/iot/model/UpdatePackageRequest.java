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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target software package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The package description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     */
    private String defaultVersionName;
    /**
     * <p>
     * Indicates whether you want to remove the named default package version from the software package. Set as
     * <code>true</code> to remove the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     */
    private Boolean unsetDefaultVersion;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the target software package.
     * </p>
     * 
     * @param packageName
     *        The name of the target software package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the target software package.
     * </p>
     * 
     * @return The name of the target software package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the target software package.
     * </p>
     * 
     * @param packageName
     *        The name of the target software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @param description
     *        The package description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @return The package description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The package description.
     * </p>
     * 
     * @param description
     *        The package description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @param defaultVersionName
     *        The name of the default package version.</p>
     *        <p>
     *        <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *        to <code>true</code> at the same time.
     */

    public void setDefaultVersionName(String defaultVersionName) {
        this.defaultVersionName = defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @return The name of the default package version.</p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *         to <code>true</code> at the same time.
     */

    public String getDefaultVersionName() {
        return this.defaultVersionName;
    }

    /**
     * <p>
     * The name of the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @param defaultVersionName
     *        The name of the default package version.</p>
     *        <p>
     *        <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *        to <code>true</code> at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withDefaultVersionName(String defaultVersionName) {
        setDefaultVersionName(defaultVersionName);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version from the software package. Set as
     * <code>true</code> to remove the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @param unsetDefaultVersion
     *        Indicates whether you want to remove the named default package version from the software package. Set as
     *        <code>true</code> to remove the default package version. </p>
     *        <p>
     *        <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *        to <code>true</code> at the same time.
     */

    public void setUnsetDefaultVersion(Boolean unsetDefaultVersion) {
        this.unsetDefaultVersion = unsetDefaultVersion;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version from the software package. Set as
     * <code>true</code> to remove the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @return Indicates whether you want to remove the named default package version from the software package. Set as
     *         <code>true</code> to remove the default package version. </p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *         to <code>true</code> at the same time.
     */

    public Boolean getUnsetDefaultVersion() {
        return this.unsetDefaultVersion;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version from the software package. Set as
     * <code>true</code> to remove the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @param unsetDefaultVersion
     *        Indicates whether you want to remove the named default package version from the software package. Set as
     *        <code>true</code> to remove the default package version. </p>
     *        <p>
     *        <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *        to <code>true</code> at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withUnsetDefaultVersion(Boolean unsetDefaultVersion) {
        setUnsetDefaultVersion(unsetDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to remove the named default package version from the software package. Set as
     * <code>true</code> to remove the default package version.
     * </p>
     * <p>
     * <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal to
     * <code>true</code> at the same time.
     * </p>
     * 
     * @return Indicates whether you want to remove the named default package version from the software package. Set as
     *         <code>true</code> to remove the default package version. </p>
     *         <p>
     *         <b>Note:</b> You cannot name a <code>defaultVersion</code> and set <code>unsetDefaultVersion</code> equal
     *         to <code>true</code> at the same time.
     */

    public Boolean isUnsetDefaultVersion() {
        return this.unsetDefaultVersion;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDefaultVersionName() != null)
            sb.append("DefaultVersionName: ").append(getDefaultVersionName()).append(",");
        if (getUnsetDefaultVersion() != null)
            sb.append("UnsetDefaultVersion: ").append(getUnsetDefaultVersion()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageRequest == false)
            return false;
        UpdatePackageRequest other = (UpdatePackageRequest) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultVersionName() == null ^ this.getDefaultVersionName() == null)
            return false;
        if (other.getDefaultVersionName() != null && other.getDefaultVersionName().equals(this.getDefaultVersionName()) == false)
            return false;
        if (other.getUnsetDefaultVersion() == null ^ this.getUnsetDefaultVersion() == null)
            return false;
        if (other.getUnsetDefaultVersion() != null && other.getUnsetDefaultVersion().equals(this.getUnsetDefaultVersion()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionName() == null) ? 0 : getDefaultVersionName().hashCode());
        hashCode = prime * hashCode + ((getUnsetDefaultVersion() == null) ? 0 : getUnsetDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageRequest clone() {
        return (UpdatePackageRequest) super.clone();
    }

}
