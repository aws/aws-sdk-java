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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a version of an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS
 * Lambda layer</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/LayerVersionsListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayerVersionsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the layer version.
     * </p>
     */
    private String layerVersionArn;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The description of the version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, <code>2018-11-27T15:10:45.123+0000</code>
     * .
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * The layer's compatible runtimes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> compatibleRuntimes;
    /**
     * <p>
     * The layer's open-source license.
     * </p>
     */
    private String licenseInfo;

    /**
     * <p>
     * The ARN of the layer version.
     * </p>
     * 
     * @param layerVersionArn
     *        The ARN of the layer version.
     */

    public void setLayerVersionArn(String layerVersionArn) {
        this.layerVersionArn = layerVersionArn;
    }

    /**
     * <p>
     * The ARN of the layer version.
     * </p>
     * 
     * @return The ARN of the layer version.
     */

    public String getLayerVersionArn() {
        return this.layerVersionArn;
    }

    /**
     * <p>
     * The ARN of the layer version.
     * </p>
     * 
     * @param layerVersionArn
     *        The ARN of the layer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionsListItem withLayerVersionArn(String layerVersionArn) {
        setLayerVersionArn(layerVersionArn);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param version
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionsListItem withVersion(Long version) {
        setVersion(version);
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

    public LayerVersionsListItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, <code>2018-11-27T15:10:45.123+0000</code>
     * .
     * </p>
     * 
     * @param createdDate
     *        The date that the version was created, in ISO 8601 format. For example,
     *        <code>2018-11-27T15:10:45.123+0000</code>.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, <code>2018-11-27T15:10:45.123+0000</code>
     * .
     * </p>
     * 
     * @return The date that the version was created, in ISO 8601 format. For example,
     *         <code>2018-11-27T15:10:45.123+0000</code>.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example, <code>2018-11-27T15:10:45.123+0000</code>
     * .
     * </p>
     * 
     * @param createdDate
     *        The date that the version was created, in ISO 8601 format. For example,
     *        <code>2018-11-27T15:10:45.123+0000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionsListItem withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes.
     * </p>
     * 
     * @return The layer's compatible runtimes.
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
     * The layer's compatible runtimes.
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes.
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
     * The layer's compatible runtimes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleRuntimes(java.util.Collection)} or {@link #withCompatibleRuntimes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public LayerVersionsListItem withCompatibleRuntimes(String... compatibleRuntimes) {
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
     * The layer's compatible runtimes.
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public LayerVersionsListItem withCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        setCompatibleRuntimes(compatibleRuntimes);
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes.
     * </p>
     * 
     * @param compatibleRuntimes
     *        The layer's compatible runtimes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Runtime
     */

    public LayerVersionsListItem withCompatibleRuntimes(Runtime... compatibleRuntimes) {
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
     * The layer's open-source license.
     * </p>
     * 
     * @param licenseInfo
     *        The layer's open-source license.
     */

    public void setLicenseInfo(String licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    /**
     * <p>
     * The layer's open-source license.
     * </p>
     * 
     * @return The layer's open-source license.
     */

    public String getLicenseInfo() {
        return this.licenseInfo;
    }

    /**
     * <p>
     * The layer's open-source license.
     * </p>
     * 
     * @param licenseInfo
     *        The layer's open-source license.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayerVersionsListItem withLicenseInfo(String licenseInfo) {
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
        if (getLayerVersionArn() != null)
            sb.append("LayerVersionArn: ").append(getLayerVersionArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
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

        if (obj instanceof LayerVersionsListItem == false)
            return false;
        LayerVersionsListItem other = (LayerVersionsListItem) obj;
        if (other.getLayerVersionArn() == null ^ this.getLayerVersionArn() == null)
            return false;
        if (other.getLayerVersionArn() != null && other.getLayerVersionArn().equals(this.getLayerVersionArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
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

        hashCode = prime * hashCode + ((getLayerVersionArn() == null) ? 0 : getLayerVersionArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getCompatibleRuntimes() == null) ? 0 : getCompatibleRuntimes().hashCode());
        hashCode = prime * hashCode + ((getLicenseInfo() == null) ? 0 : getLicenseInfo().hashCode());
        return hashCode;
    }

    @Override
    public LayerVersionsListItem clone() {
        try {
            return (LayerVersionsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LayerVersionsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
