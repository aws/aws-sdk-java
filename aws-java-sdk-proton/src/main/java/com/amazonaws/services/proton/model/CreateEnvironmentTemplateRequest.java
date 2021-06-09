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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/CreateEnvironmentTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the environment template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The environment template name as displayed in the developer interface.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * A customer provided encryption key that AWS Proton uses to encrypt data.
     * </p>
     */
    private String encryptionKey;
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
     * Create tags for your environment template. For more information, see <i>AWS Proton resources and tagging</i> in
     * the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     * Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     * Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateEnvironmentTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The environment template name as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The environment template name as displayed in the developer interface.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The environment template name as displayed in the developer interface.
     * </p>
     * 
     * @return The environment template name as displayed in the developer interface.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The environment template name as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The environment template name as displayed in the developer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentTemplateRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * A customer provided encryption key that AWS Proton uses to encrypt data.
     * </p>
     * 
     * @param encryptionKey
     *        A customer provided encryption key that AWS Proton uses to encrypt data.
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * A customer provided encryption key that AWS Proton uses to encrypt data.
     * </p>
     * 
     * @return A customer provided encryption key that AWS Proton uses to encrypt data.
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * A customer provided encryption key that AWS Proton uses to encrypt data.
     * </p>
     * 
     * @param encryptionKey
     *        A customer provided encryption key that AWS Proton uses to encrypt data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentTemplateRequest withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
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

    public CreateEnvironmentTemplateRequest withName(String name) {
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

    public CreateEnvironmentTemplateRequest withProvisioning(String provisioning) {
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

    public CreateEnvironmentTemplateRequest withProvisioning(Provisioning provisioning) {
        this.provisioning = provisioning.toString();
        return this;
    }

    /**
     * <p>
     * Create tags for your environment template. For more information, see <i>AWS Proton resources and tagging</i> in
     * the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     * Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @return Create tags for your environment template. For more information, see <i>AWS Proton resources and
     *         tagging</i> in the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS
     *         Proton Administration Guide</a> or <a
     *         href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Create tags for your environment template. For more information, see <i>AWS Proton resources and tagging</i> in
     * the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     * Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your environment template. For more information, see <i>AWS Proton resources and
     *        tagging</i> in the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS
     *        Proton Administration Guide</a> or <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Create tags for your environment template. For more information, see <i>AWS Proton resources and tagging</i> in
     * the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     * Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Create tags for your environment template. For more information, see <i>AWS Proton resources and
     *        tagging</i> in the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS
     *        Proton Administration Guide</a> or <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentTemplateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Create tags for your environment template. For more information, see <i>AWS Proton resources and tagging</i> in
     * the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS Proton Administration
     * Guide</a> or <a href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        Create tags for your environment template. For more information, see <i>AWS Proton resources and
     *        tagging</i> in the <a href="https://docs.aws.amazon.com/proton/latest/adminguide/resources.html">AWS
     *        Proton Administration Guide</a> or <a
     *        href="https://docs.aws.amazon.com/proton/latest/userguide/resources.html">AWS Proton User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentTemplateRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvisioning() != null)
            sb.append("Provisioning: ").append(getProvisioning()).append(",");
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

        if (obj instanceof CreateEnvironmentTemplateRequest == false)
            return false;
        CreateEnvironmentTemplateRequest other = (CreateEnvironmentTemplateRequest) obj;
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvisioning() == null ^ this.getProvisioning() == null)
            return false;
        if (other.getProvisioning() != null && other.getProvisioning().equals(this.getProvisioning()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvisioning() == null) ? 0 : getProvisioning().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentTemplateRequest clone() {
        return (CreateEnvironmentTemplateRequest) super.clone();
    }

}
