/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Define and configure the output AMIs of the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/AmiDistributionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmiDistributionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of an account to which you want to distribute an image.
     * </p>
     */
    private java.util.List<String> targetAccountIds;
    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     */
    private java.util.Map<String, String> amiTags;
    /**
     * <p>
     * The KMS key identifier used to encrypt the distributed image.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * </p>
     */
    private LaunchPermissionConfiguration launchPermission;

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @param name
     *        The name of the distribution configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @return The name of the distribution configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the distribution configuration.
     * </p>
     * 
     * @param name
     *        The name of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the distribution configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @return The description of the distribution configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the distribution configuration.
     * </p>
     * 
     * @param description
     *        The description of the distribution configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of an account to which you want to distribute an image.
     * </p>
     * 
     * @return The ID of an account to which you want to distribute an image.
     */

    public java.util.List<String> getTargetAccountIds() {
        return targetAccountIds;
    }

    /**
     * <p>
     * The ID of an account to which you want to distribute an image.
     * </p>
     * 
     * @param targetAccountIds
     *        The ID of an account to which you want to distribute an image.
     */

    public void setTargetAccountIds(java.util.Collection<String> targetAccountIds) {
        if (targetAccountIds == null) {
            this.targetAccountIds = null;
            return;
        }

        this.targetAccountIds = new java.util.ArrayList<String>(targetAccountIds);
    }

    /**
     * <p>
     * The ID of an account to which you want to distribute an image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetAccountIds(java.util.Collection)} or {@link #withTargetAccountIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetAccountIds
     *        The ID of an account to which you want to distribute an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withTargetAccountIds(String... targetAccountIds) {
        if (this.targetAccountIds == null) {
            setTargetAccountIds(new java.util.ArrayList<String>(targetAccountIds.length));
        }
        for (String ele : targetAccountIds) {
            this.targetAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of an account to which you want to distribute an image.
     * </p>
     * 
     * @param targetAccountIds
     *        The ID of an account to which you want to distribute an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withTargetAccountIds(java.util.Collection<String> targetAccountIds) {
        setTargetAccountIds(targetAccountIds);
        return this;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     * 
     * @return The tags to apply to AMIs distributed to this Region.
     */

    public java.util.Map<String, String> getAmiTags() {
        return amiTags;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     * 
     * @param amiTags
     *        The tags to apply to AMIs distributed to this Region.
     */

    public void setAmiTags(java.util.Map<String, String> amiTags) {
        this.amiTags = amiTags;
    }

    /**
     * <p>
     * The tags to apply to AMIs distributed to this Region.
     * </p>
     * 
     * @param amiTags
     *        The tags to apply to AMIs distributed to this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withAmiTags(java.util.Map<String, String> amiTags) {
        setAmiTags(amiTags);
        return this;
    }

    /**
     * Add a single AmiTags entry
     *
     * @see AmiDistributionConfiguration#withAmiTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration addAmiTagsEntry(String key, String value) {
        if (null == this.amiTags) {
            this.amiTags = new java.util.HashMap<String, String>();
        }
        if (this.amiTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.amiTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AmiTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration clearAmiTagsEntries() {
        this.amiTags = null;
        return this;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the distributed image.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier used to encrypt the distributed image.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the distributed image.
     * </p>
     * 
     * @return The KMS key identifier used to encrypt the distributed image.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier used to encrypt the distributed image.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier used to encrypt the distributed image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * </p>
     * 
     * @param launchPermission
     *        Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     */

    public void setLaunchPermission(LaunchPermissionConfiguration launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * </p>
     * 
     * @return Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     */

    public LaunchPermissionConfiguration getLaunchPermission() {
        return this.launchPermission;
    }

    /**
     * <p>
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * </p>
     * 
     * @param launchPermission
     *        Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmiDistributionConfiguration withLaunchPermission(LaunchPermissionConfiguration launchPermission) {
        setLaunchPermission(launchPermission);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTargetAccountIds() != null)
            sb.append("TargetAccountIds: ").append(getTargetAccountIds()).append(",");
        if (getAmiTags() != null)
            sb.append("AmiTags: ").append(getAmiTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getLaunchPermission() != null)
            sb.append("LaunchPermission: ").append(getLaunchPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmiDistributionConfiguration == false)
            return false;
        AmiDistributionConfiguration other = (AmiDistributionConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetAccountIds() == null ^ this.getTargetAccountIds() == null)
            return false;
        if (other.getTargetAccountIds() != null && other.getTargetAccountIds().equals(this.getTargetAccountIds()) == false)
            return false;
        if (other.getAmiTags() == null ^ this.getAmiTags() == null)
            return false;
        if (other.getAmiTags() != null && other.getAmiTags().equals(this.getAmiTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getLaunchPermission() == null ^ this.getLaunchPermission() == null)
            return false;
        if (other.getLaunchPermission() != null && other.getLaunchPermission().equals(this.getLaunchPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountIds() == null) ? 0 : getTargetAccountIds().hashCode());
        hashCode = prime * hashCode + ((getAmiTags() == null) ? 0 : getAmiTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getLaunchPermission() == null) ? 0 : getLaunchPermission().hashCode());
        return hashCode;
    }

    @Override
    public AmiDistributionConfiguration clone() {
        try {
            return (AmiDistributionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.AmiDistributionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
