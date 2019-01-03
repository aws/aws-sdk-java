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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Returns information about an HSM configuration, which is an object that describes to Amazon Redshift clusters the
 * information they require to connect to an HSM where they can store database encryption keys.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/HsmConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HsmConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Redshift HSM configuration.
     * </p>
     */
    private String hsmConfigurationIdentifier;
    /**
     * <p>
     * A text description of the HSM configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the HSM.
     * </p>
     */
    private String hsmIpAddress;
    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption
     * keys.
     * </p>
     */
    private String hsmPartitionName;
    /**
     * <p>
     * The list of tags for the HSM configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The name of the Amazon Redshift HSM configuration.
     */

    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The name of the Amazon Redshift HSM configuration.
     * </p>
     * 
     * @return The name of the Amazon Redshift HSM configuration.
     */

    public String getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The name of the Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The name of the Amazon Redshift HSM configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * A text description of the HSM configuration.
     * </p>
     * 
     * @param description
     *        A text description of the HSM configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the HSM configuration.
     * </p>
     * 
     * @return A text description of the HSM configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the HSM configuration.
     * </p>
     * 
     * @param description
     *        A text description of the HSM configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the HSM.
     * </p>
     * 
     * @param hsmIpAddress
     *        The IP address that the Amazon Redshift cluster must use to access the HSM.
     */

    public void setHsmIpAddress(String hsmIpAddress) {
        this.hsmIpAddress = hsmIpAddress;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the HSM.
     * </p>
     * 
     * @return The IP address that the Amazon Redshift cluster must use to access the HSM.
     */

    public String getHsmIpAddress() {
        return this.hsmIpAddress;
    }

    /**
     * <p>
     * The IP address that the Amazon Redshift cluster must use to access the HSM.
     * </p>
     * 
     * @param hsmIpAddress
     *        The IP address that the Amazon Redshift cluster must use to access the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withHsmIpAddress(String hsmIpAddress) {
        setHsmIpAddress(hsmIpAddress);
        return this;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption
     * keys.
     * </p>
     * 
     * @param hsmPartitionName
     *        The name of the partition in the HSM where the Amazon Redshift clusters will store their database
     *        encryption keys.
     */

    public void setHsmPartitionName(String hsmPartitionName) {
        this.hsmPartitionName = hsmPartitionName;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption
     * keys.
     * </p>
     * 
     * @return The name of the partition in the HSM where the Amazon Redshift clusters will store their database
     *         encryption keys.
     */

    public String getHsmPartitionName() {
        return this.hsmPartitionName;
    }

    /**
     * <p>
     * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption
     * keys.
     * </p>
     * 
     * @param hsmPartitionName
     *        The name of the partition in the HSM where the Amazon Redshift clusters will store their database
     *        encryption keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withHsmPartitionName(String hsmPartitionName) {
        setHsmPartitionName(hsmPartitionName);
        return this;
    }

    /**
     * <p>
     * The list of tags for the HSM configuration.
     * </p>
     * 
     * @return The list of tags for the HSM configuration.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the HSM configuration.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM configuration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the HSM configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the HSM configuration.
     * </p>
     * 
     * @param tags
     *        The list of tags for the HSM configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HsmConfiguration withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getHsmConfigurationIdentifier() != null)
            sb.append("HsmConfigurationIdentifier: ").append(getHsmConfigurationIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHsmIpAddress() != null)
            sb.append("HsmIpAddress: ").append(getHsmIpAddress()).append(",");
        if (getHsmPartitionName() != null)
            sb.append("HsmPartitionName: ").append(getHsmPartitionName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HsmConfiguration == false)
            return false;
        HsmConfiguration other = (HsmConfiguration) obj;
        if (other.getHsmConfigurationIdentifier() == null ^ this.getHsmConfigurationIdentifier() == null)
            return false;
        if (other.getHsmConfigurationIdentifier() != null && other.getHsmConfigurationIdentifier().equals(this.getHsmConfigurationIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHsmIpAddress() == null ^ this.getHsmIpAddress() == null)
            return false;
        if (other.getHsmIpAddress() != null && other.getHsmIpAddress().equals(this.getHsmIpAddress()) == false)
            return false;
        if (other.getHsmPartitionName() == null ^ this.getHsmPartitionName() == null)
            return false;
        if (other.getHsmPartitionName() != null && other.getHsmPartitionName().equals(this.getHsmPartitionName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmConfigurationIdentifier() == null) ? 0 : getHsmConfigurationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHsmIpAddress() == null) ? 0 : getHsmIpAddress().hashCode());
        hashCode = prime * hashCode + ((getHsmPartitionName() == null) ? 0 : getHsmPartitionName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public HsmConfiguration clone() {
        try {
            return (HsmConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
