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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The environment template data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/EnvironmentTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the environment template was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * A description of the environment template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the environment template as displayed in the developer interface.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The customer provided encryption key for the environment template.
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * The time when the environment template was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The name of the environment template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     */
    private String provisioning;
    /**
     * <p>
     * The ID of the recommended version of the environment template.
     * </p>
     */
    private String recommendedVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the environment template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the environment template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the environment template was created.
     * </p>
     * 
     * @return The time when the environment template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the environment template was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the environment template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * A description of the environment template.
     * </p>
     * 
     * @param description
     *        A description of the environment template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment template.
     * </p>
     * 
     * @return A description of the environment template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment template.
     * </p>
     * 
     * @param description
     *        A description of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the environment template as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The name of the environment template as displayed in the developer interface.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the environment template as displayed in the developer interface.
     * </p>
     * 
     * @return The name of the environment template as displayed in the developer interface.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the environment template as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The name of the environment template as displayed in the developer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The customer provided encryption key for the environment template.
     * </p>
     * 
     * @param encryptionKey
     *        The customer provided encryption key for the environment template.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The customer provided encryption key for the environment template.
     * </p>
     * 
     * @return The customer provided encryption key for the environment template.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The customer provided encryption key for the environment template.
     * </p>
     * 
     * @param encryptionKey
     *        The customer provided encryption key for the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The time when the environment template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the environment template was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the environment template was last modified.
     * </p>
     * 
     * @return The time when the environment template was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the environment template was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the environment template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param name
     *        The name of the environment template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @return The name of the environment template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment template.
     * </p>
     * 
     * @param name
     *        The name of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @see Provisioning
     */

    public void setProvisioning(String provisioning) {
        this.provisioning = provisioning;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @return When included, indicates that the environment template is for customer provisioned and managed
     *         infrastructure.
     * @see Provisioning
     */

    public String getProvisioning() {
        return this.provisioning;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public EnvironmentTemplate withProvisioning(String provisioning) {
        setProvisioning(provisioning);
        return this;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public EnvironmentTemplate withProvisioning(Provisioning provisioning) {
        this.provisioning = provisioning.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the recommended version of the environment template.
     * </p>
     * 
     * @param recommendedVersion
     *        The ID of the recommended version of the environment template.
     */

    public void setRecommendedVersion(String recommendedVersion) {
        this.recommendedVersion = recommendedVersion;
    }

    /**
     * <p>
     * The ID of the recommended version of the environment template.
     * </p>
     * 
     * @return The ID of the recommended version of the environment template.
     */

    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    /**
     * <p>
     * The ID of the recommended version of the environment template.
     * </p>
     * 
     * @param recommendedVersion
     *        The ID of the recommended version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTemplate withRecommendedVersion(String recommendedVersion) {
        setRecommendedVersion(recommendedVersion);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvisioning() != null)
            sb.append("Provisioning: ").append(getProvisioning()).append(",");
        if (getRecommendedVersion() != null)
            sb.append("RecommendedVersion: ").append(getRecommendedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentTemplate == false)
            return false;
        EnvironmentTemplate other = (EnvironmentTemplate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvisioning() == null ^ this.getProvisioning() == null)
            return false;
        if (other.getProvisioning() != null && other.getProvisioning().equals(this.getProvisioning()) == false)
            return false;
        if (other.getRecommendedVersion() == null ^ this.getRecommendedVersion() == null)
            return false;
        if (other.getRecommendedVersion() != null && other.getRecommendedVersion().equals(this.getRecommendedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvisioning() == null) ? 0 : getProvisioning().hashCode());
        hashCode = prime * hashCode + ((getRecommendedVersion() == null) ? 0 : getRecommendedVersion().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentTemplate clone() {
        try {
            return (EnvironmentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.EnvironmentTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
