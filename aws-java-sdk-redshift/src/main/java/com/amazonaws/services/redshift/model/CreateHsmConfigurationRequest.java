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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * </p>
     */
    private String hsmConfigurationIdentifier;
    /**
     * <p>
     * A text description of the HSM configuration to be created.
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
     * The password required to access the HSM partition.
     * </p>
     */
    private String hsmPartitionPassword;
    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * </p>
     */
    private String hsmServerPublicCertificate;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The identifier to be assigned to the new Amazon Redshift HSM configuration.
     */

    public void setHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        this.hsmConfigurationIdentifier = hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * </p>
     * 
     * @return The identifier to be assigned to the new Amazon Redshift HSM configuration.
     */

    public String getHsmConfigurationIdentifier() {
        return this.hsmConfigurationIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * </p>
     * 
     * @param hsmConfigurationIdentifier
     *        The identifier to be assigned to the new Amazon Redshift HSM configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withHsmConfigurationIdentifier(String hsmConfigurationIdentifier) {
        setHsmConfigurationIdentifier(hsmConfigurationIdentifier);
        return this;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     * 
     * @param description
     *        A text description of the HSM configuration to be created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     * 
     * @return A text description of the HSM configuration to be created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the HSM configuration to be created.
     * </p>
     * 
     * @param description
     *        A text description of the HSM configuration to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withDescription(String description) {
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

    public CreateHsmConfigurationRequest withHsmIpAddress(String hsmIpAddress) {
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

    public CreateHsmConfigurationRequest withHsmPartitionName(String hsmPartitionName) {
        setHsmPartitionName(hsmPartitionName);
        return this;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     * 
     * @param hsmPartitionPassword
     *        The password required to access the HSM partition.
     */

    public void setHsmPartitionPassword(String hsmPartitionPassword) {
        this.hsmPartitionPassword = hsmPartitionPassword;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     * 
     * @return The password required to access the HSM partition.
     */

    public String getHsmPartitionPassword() {
        return this.hsmPartitionPassword;
    }

    /**
     * <p>
     * The password required to access the HSM partition.
     * </p>
     * 
     * @param hsmPartitionPassword
     *        The password required to access the HSM partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withHsmPartitionPassword(String hsmPartitionPassword) {
        setHsmPartitionPassword(hsmPartitionPassword);
        return this;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * </p>
     * 
     * @param hsmServerPublicCertificate
     *        The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     */

    public void setHsmServerPublicCertificate(String hsmServerPublicCertificate) {
        this.hsmServerPublicCertificate = hsmServerPublicCertificate;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * </p>
     * 
     * @return The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     */

    public String getHsmServerPublicCertificate() {
        return this.hsmServerPublicCertificate;
    }

    /**
     * <p>
     * The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * </p>
     * 
     * @param hsmServerPublicCertificate
     *        The HSMs public certificate file. When using Cloud HSM, the file name is server.pem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withHsmServerPublicCertificate(String hsmServerPublicCertificate) {
        setHsmServerPublicCertificate(hsmServerPublicCertificate);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
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
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withTags(Tag... tags) {
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
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmConfigurationRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getHsmPartitionPassword() != null)
            sb.append("HsmPartitionPassword: ").append(getHsmPartitionPassword()).append(",");
        if (getHsmServerPublicCertificate() != null)
            sb.append("HsmServerPublicCertificate: ").append(getHsmServerPublicCertificate()).append(",");
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

        if (obj instanceof CreateHsmConfigurationRequest == false)
            return false;
        CreateHsmConfigurationRequest other = (CreateHsmConfigurationRequest) obj;
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
        if (other.getHsmPartitionPassword() == null ^ this.getHsmPartitionPassword() == null)
            return false;
        if (other.getHsmPartitionPassword() != null && other.getHsmPartitionPassword().equals(this.getHsmPartitionPassword()) == false)
            return false;
        if (other.getHsmServerPublicCertificate() == null ^ this.getHsmServerPublicCertificate() == null)
            return false;
        if (other.getHsmServerPublicCertificate() != null && other.getHsmServerPublicCertificate().equals(this.getHsmServerPublicCertificate()) == false)
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
        hashCode = prime * hashCode + ((getHsmPartitionPassword() == null) ? 0 : getHsmPartitionPassword().hashCode());
        hashCode = prime * hashCode + ((getHsmServerPublicCertificate() == null) ? 0 : getHsmServerPublicCertificate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateHsmConfigurationRequest clone() {
        return (CreateHsmConfigurationRequest) super.clone();
    }

}
