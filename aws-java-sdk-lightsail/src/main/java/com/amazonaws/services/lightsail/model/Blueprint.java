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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a blueprint (a virtual private server image).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Blueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Blueprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     */
    private String blueprintId;
    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     */
    private String group;
    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The description of the blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers
     * with existing instances but are not necessarily available for launch of new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new application releases.
     * </p>
     */
    private Boolean isActive;
    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500
     * or more to create an instance that uses a blueprint with a minimum power value of 500. <code>0</code> indicates
     * that the blueprint runs on all instance sizes.
     * </p>
     */
    private Integer minPower;
    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     * </p>
     */
    private String version;
    /**
     * <p>
     * The version code.
     * </p>
     */
    private String versionCode;
    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     */
    private String productUrl;
    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     */
    private String licenseUrl;
    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     */
    private String platform;

    /**
     * <p>
     * The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * 
     * @param blueprintId
     *        The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *        <code>app_lamp_7_0</code>).
     */

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * 
     * @return The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *         <code>app_lamp_7_0</code>).
     */

    public String getBlueprintId() {
        return this.blueprintId;
    }

    /**
     * <p>
     * The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or <code>app_lamp_7_0</code>).
     * </p>
     * 
     * @param blueprintId
     *        The ID for the virtual private server image (e.g., <code>app_wordpress_4_4</code> or
     *        <code>app_lamp_7_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withBlueprintId(String blueprintId) {
        setBlueprintId(blueprintId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @param name
     *        The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @return The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @param name
     *        The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * 
     * @param group
     *        The group name of the blueprint (e.g., <code>amazon-linux</code>).
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * 
     * @return The group name of the blueprint (e.g., <code>amazon-linux</code>).
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * </p>
     * 
     * @param group
     *        The group name of the blueprint (e.g., <code>amazon-linux</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * 
     * @param type
     *        The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * @see BlueprintType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * 
     * @return The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * @see BlueprintType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * 
     * @param type
     *        The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintType
     */

    public Blueprint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * 
     * @param type
     *        The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * @see BlueprintType
     */

    public void setType(BlueprintType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * </p>
     * 
     * @param type
     *        The type of the blueprint (e.g., <code>os</code> or <code>app</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BlueprintType
     */

    public Blueprint withType(BlueprintType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @param description
     *        The description of the blueprint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @return The description of the blueprint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the blueprint.
     * </p>
     * 
     * @param description
     *        The description of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers
     * with existing instances but are not necessarily available for launch of new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new application releases.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support
     *        customers with existing instances but are not necessarily available for launch of new instances.
     *        Blueprints are marked inactive when they become outdated due to operating system updates or new
     *        application releases.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers
     * with existing instances but are not necessarily available for launch of new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new application releases.
     * </p>
     * 
     * @return A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support
     *         customers with existing instances but are not necessarily available for launch of new instances.
     *         Blueprints are marked inactive when they become outdated due to operating system updates or new
     *         application releases.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers
     * with existing instances but are not necessarily available for launch of new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new application releases.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support
     *        customers with existing instances but are not necessarily available for launch of new instances.
     *        Blueprints are marked inactive when they become outdated due to operating system updates or new
     *        application releases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers
     * with existing instances but are not necessarily available for launch of new instances. Blueprints are marked
     * inactive when they become outdated due to operating system updates or new application releases.
     * </p>
     * 
     * @return A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support
     *         customers with existing instances but are not necessarily available for launch of new instances.
     *         Blueprints are marked inactive when they become outdated due to operating system updates or new
     *         application releases.
     */

    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500
     * or more to create an instance that uses a blueprint with a minimum power value of 500. <code>0</code> indicates
     * that the blueprint runs on all instance sizes.
     * </p>
     * 
     * @param minPower
     *        The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value
     *        of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
     *        <code>0</code> indicates that the blueprint runs on all instance sizes.
     */

    public void setMinPower(Integer minPower) {
        this.minPower = minPower;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500
     * or more to create an instance that uses a blueprint with a minimum power value of 500. <code>0</code> indicates
     * that the blueprint runs on all instance sizes.
     * </p>
     * 
     * @return The minimum bundle power required to run this blueprint. For example, you need a bundle with a power
     *         value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
     *         <code>0</code> indicates that the blueprint runs on all instance sizes.
     */

    public Integer getMinPower() {
        return this.minPower;
    }

    /**
     * <p>
     * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500
     * or more to create an instance that uses a blueprint with a minimum power value of 500. <code>0</code> indicates
     * that the blueprint runs on all instance sizes.
     * </p>
     * 
     * @param minPower
     *        The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value
     *        of 500 or more to create an instance that uses a blueprint with a minimum power value of 500.
     *        <code>0</code> indicates that the blueprint runs on all instance sizes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withMinPower(Integer minPower) {
        setMinPower(minPower);
        return this;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     * </p>
     * 
     * @param version
     *        The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     * </p>
     * 
     * @return The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     * </p>
     * 
     * @param version
     *        The version number of the operating system, application, or stack (e.g., <code>2016.03.0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The version code.
     * </p>
     * 
     * @param versionCode
     *        The version code.
     */

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * <p>
     * The version code.
     * </p>
     * 
     * @return The version code.
     */

    public String getVersionCode() {
        return this.versionCode;
    }

    /**
     * <p>
     * The version code.
     * </p>
     * 
     * @param versionCode
     *        The version code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withVersionCode(String versionCode) {
        setVersionCode(versionCode);
        return this;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     * 
     * @param productUrl
     *        The product URL to learn more about the image or blueprint.
     */

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     * 
     * @return The product URL to learn more about the image or blueprint.
     */

    public String getProductUrl() {
        return this.productUrl;
    }

    /**
     * <p>
     * The product URL to learn more about the image or blueprint.
     * </p>
     * 
     * @param productUrl
     *        The product URL to learn more about the image or blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withProductUrl(String productUrl) {
        setProductUrl(productUrl);
        return this;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     * 
     * @param licenseUrl
     *        The end-user license agreement URL for the image or blueprint.
     */

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     * 
     * @return The end-user license agreement URL for the image or blueprint.
     */

    public String getLicenseUrl() {
        return this.licenseUrl;
    }

    /**
     * <p>
     * The end-user license agreement URL for the image or blueprint.
     * </p>
     * 
     * @param licenseUrl
     *        The end-user license agreement URL for the image or blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Blueprint withLicenseUrl(String licenseUrl) {
        setLicenseUrl(licenseUrl);
        return this;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     * 
     * @param platform
     *        The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * @see InstancePlatform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     * 
     * @return The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * @see InstancePlatform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     * 
     * @param platform
     *        The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancePlatform
     */

    public Blueprint withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     * 
     * @param platform
     *        The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * @see InstancePlatform
     */

    public void setPlatform(InstancePlatform platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * </p>
     * 
     * @param platform
     *        The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancePlatform
     */

    public Blueprint withPlatform(InstancePlatform platform) {
        this.platform = platform.toString();
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
        if (getBlueprintId() != null)
            sb.append("BlueprintId: ").append(getBlueprintId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive()).append(",");
        if (getMinPower() != null)
            sb.append("MinPower: ").append(getMinPower()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionCode() != null)
            sb.append("VersionCode: ").append(getVersionCode()).append(",");
        if (getProductUrl() != null)
            sb.append("ProductUrl: ").append(getProductUrl()).append(",");
        if (getLicenseUrl() != null)
            sb.append("LicenseUrl: ").append(getLicenseUrl()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Blueprint == false)
            return false;
        Blueprint other = (Blueprint) obj;
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        if (other.getMinPower() == null ^ this.getMinPower() == null)
            return false;
        if (other.getMinPower() != null && other.getMinPower().equals(this.getMinPower()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionCode() == null ^ this.getVersionCode() == null)
            return false;
        if (other.getVersionCode() != null && other.getVersionCode().equals(this.getVersionCode()) == false)
            return false;
        if (other.getProductUrl() == null ^ this.getProductUrl() == null)
            return false;
        if (other.getProductUrl() != null && other.getProductUrl().equals(this.getProductUrl()) == false)
            return false;
        if (other.getLicenseUrl() == null ^ this.getLicenseUrl() == null)
            return false;
        if (other.getLicenseUrl() != null && other.getLicenseUrl().equals(this.getLicenseUrl()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getMinPower() == null) ? 0 : getMinPower().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionCode() == null) ? 0 : getVersionCode().hashCode());
        hashCode = prime * hashCode + ((getProductUrl() == null) ? 0 : getProductUrl().hashCode());
        hashCode = prime * hashCode + ((getLicenseUrl() == null) ? 0 : getLicenseUrl().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        return hashCode;
    }

    @Override
    public Blueprint clone() {
        try {
            return (Blueprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.BlueprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
