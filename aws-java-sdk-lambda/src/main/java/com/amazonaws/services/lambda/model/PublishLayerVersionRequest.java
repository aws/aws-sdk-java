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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishLayerVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishLayerVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * The description of the version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The function layer archive.
     * </p>
     */
    private LayerVersionContentInput content;
    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> compatibleRuntimes;
    /**
     * <p>
     * The layer's software license. It can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The full text of the license.
     * </p>
     * </li>
     * </ul>
     */
    private String licenseInfo;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishLayerVersionRequest withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @return The description of the version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the version.
     * </p>
     * 
     * @param description
     *        The description of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishLayerVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The function layer archive.
     * </p>
     * 
     * @param content
     *        The function layer archive.
     */

    public void setContent(LayerVersionContentInput content) {
        this.content = content;
    }

    /**
     * <p>
     * The function layer archive.
     * </p>
     * 
     * @return The function layer archive.
     */

    public LayerVersionContentInput getContent() {
        return this.content;
    }

    /**
     * <p>
     * The function layer archive.
     * </p>
     * 
     * @param content
     *        The function layer archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishLayerVersionRequest withContent(LayerVersionContentInput content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     * 
     * @return A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     *         runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * @see Runtime
     */

    public java.util.List<String> getCompatibleRuntimes() {
        if (compatibleRuntimes == null) {
            compatibleRuntimes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return compatibleRuntimes;
    }

    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     * 
     * @param compatibleRuntimes
     *        A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     *        runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * @see Runtime
     */

    public void setCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        if (compatibleRuntimes == null) {
            this.compatibleRuntimes = null;
            return;
        }

        this.compatibleRuntimes = new com.amazonaws.internal.SdkInternalList<String>(compatibleRuntimes);
    }

    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleRuntimes(java.util.Collection)} or {@link #withCompatibleRuntimes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param compatibleRuntimes
     *        A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     *        runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public PublishLayerVersionRequest withCompatibleRuntimes(String... compatibleRuntimes) {
        if (this.compatibleRuntimes == null) {
            setCompatibleRuntimes(new com.amazonaws.internal.SdkInternalList<String>(compatibleRuntimes.length));
        }
        for (String ele : compatibleRuntimes) {
            this.compatibleRuntimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     * 
     * @param compatibleRuntimes
     *        A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     *        runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public PublishLayerVersionRequest withCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        setCompatibleRuntimes(compatibleRuntimes);
        return this;
    }

    /**
     * <p>
     * A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     * runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * </p>
     * 
     * @param compatibleRuntimes
     *        A list of compatible <a href="https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html">function
     *        runtimes</a>. Used for filtering with <a>ListLayers</a> and <a>ListLayerVersions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public PublishLayerVersionRequest withCompatibleRuntimes(Runtime... compatibleRuntimes) {
        com.amazonaws.internal.SdkInternalList<String> compatibleRuntimesCopy = new com.amazonaws.internal.SdkInternalList<String>(compatibleRuntimes.length);
        for (Runtime value : compatibleRuntimes) {
            compatibleRuntimesCopy.add(value.toString());
        }
        if (getCompatibleRuntimes() == null) {
            setCompatibleRuntimes(compatibleRuntimesCopy);
        } else {
            getCompatibleRuntimes().addAll(compatibleRuntimesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The layer's software license. It can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The full text of the license.
     * </p>
     * </li>
     * </ul>
     * 
     * @param licenseInfo
     *        The layer's software license. It can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The full text of the license.
     *        </p>
     *        </li>
     */

    public void setLicenseInfo(String licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    /**
     * <p>
     * The layer's software license. It can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The full text of the license.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The layer's software license. It can be any of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The URL of a license hosted on the internet. For example,
     *         <code>https://opensource.org/licenses/MIT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The full text of the license.
     *         </p>
     *         </li>
     */

    public String getLicenseInfo() {
        return this.licenseInfo;
    }

    /**
     * <p>
     * The layer's software license. It can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The full text of the license.
     * </p>
     * </li>
     * </ul>
     * 
     * @param licenseInfo
     *        The layer's software license. It can be any of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        An <a href="https://spdx.org/licenses/">SPDX license identifier</a>. For example, <code>MIT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The URL of a license hosted on the internet. For example, <code>https://opensource.org/licenses/MIT</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The full text of the license.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishLayerVersionRequest withLicenseInfo(String licenseInfo) {
        setLicenseInfo(licenseInfo);
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
        if (getLayerName() != null)
            sb.append("LayerName: ").append(getLayerName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getCompatibleRuntimes() != null)
            sb.append("CompatibleRuntimes: ").append(getCompatibleRuntimes()).append(",");
        if (getLicenseInfo() != null)
            sb.append("LicenseInfo: ").append(getLicenseInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishLayerVersionRequest == false)
            return false;
        PublishLayerVersionRequest other = (PublishLayerVersionRequest) obj;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getCompatibleRuntimes() == null ^ this.getCompatibleRuntimes() == null)
            return false;
        if (other.getCompatibleRuntimes() != null && other.getCompatibleRuntimes().equals(this.getCompatibleRuntimes()) == false)
            return false;
        if (other.getLicenseInfo() == null ^ this.getLicenseInfo() == null)
            return false;
        if (other.getLicenseInfo() != null && other.getLicenseInfo().equals(this.getLicenseInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getCompatibleRuntimes() == null) ? 0 : getCompatibleRuntimes().hashCode());
        hashCode = prime * hashCode + ((getLicenseInfo() == null) ? 0 : getLicenseInfo().hashCode());
        return hashCode;
    }

    @Override
    public PublishLayerVersionRequest clone() {
        return (PublishLayerVersionRequest) super.clone();
    }

}
