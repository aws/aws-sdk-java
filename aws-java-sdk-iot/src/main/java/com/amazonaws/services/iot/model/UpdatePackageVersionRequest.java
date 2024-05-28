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
public class UpdatePackageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the associated software package.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The name of the target package version.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The package version description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file location,
     * configuration options that are being sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited to 3KB.
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The status that the package version should be assigned. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the associated software package.
     * </p>
     * 
     * @param packageName
     *        The name of the associated software package.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the associated software package.
     * </p>
     * 
     * @return The name of the associated software package.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The name of the associated software package.
     * </p>
     * 
     * @param packageName
     *        The name of the associated software package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * 
     * @param versionName
     *        The name of the target package version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * 
     * @return The name of the target package version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name of the target package version.
     * </p>
     * 
     * @param versionName
     *        The name of the target package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @param description
     *        The package version description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @return The package version description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The package version description.
     * </p>
     * 
     * @param description
     *        The package version description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file location,
     * configuration options that are being sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited to 3KB.
     * </p>
     * 
     * @return Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file
     *         location, configuration options that are being sent to the device or fleet. </p>
     *         <p>
     *         <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     *         </p>
     *         <p>
     *         The combined size of all the attributes on a package version is limited to 3KB.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file location,
     * configuration options that are being sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited to 3KB.
     * </p>
     * 
     * @param attributes
     *        Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file
     *        location, configuration options that are being sent to the device or fleet. </p>
     *        <p>
     *        <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     *        </p>
     *        <p>
     *        The combined size of all the attributes on a package version is limited to 3KB.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file location,
     * configuration options that are being sent to the device or fleet.
     * </p>
     * <p>
     * <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     * </p>
     * <p>
     * The combined size of all the attributes on a package version is limited to 3KB.
     * </p>
     * 
     * @param attributes
     *        Metadata that can be used to define a package version’s configuration. For example, the Amazon S3 file
     *        location, configuration options that are being sent to the device or fleet. </p>
     *        <p>
     *        <b>Note:</b> Attributes can be updated only when the package version is in a draft state.
     *        </p>
     *        <p>
     *        The combined size of all the attributes on a package version is limited to 3KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see UpdatePackageVersionRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackageVersionRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param action
     *        The status that the package version should be assigned. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @see PackageVersionAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @return The status that the package version should be assigned. For more information, see <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *         >Package version lifecycle</a>.
     * @see PackageVersionAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param action
     *        The status that the package version should be assigned. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionAction
     */

    public UpdatePackageVersionRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The status that the package version should be assigned. For more information, see <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     * >Package version lifecycle</a>.
     * </p>
     * 
     * @param action
     *        The status that the package version should be assigned. For more information, see <a href=
     *        "https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle"
     *        >Package version lifecycle</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionAction
     */

    public UpdatePackageVersionRequest withAction(PackageVersionAction action) {
        this.action = action.toString();
        return this;
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

    public UpdatePackageVersionRequest withClientToken(String clientToken) {
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
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
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

        if (obj instanceof UpdatePackageVersionRequest == false)
            return false;
        UpdatePackageVersionRequest other = (UpdatePackageVersionRequest) obj;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
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
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackageVersionRequest clone() {
        return (UpdatePackageVersionRequest) super.clone();
    }

}
