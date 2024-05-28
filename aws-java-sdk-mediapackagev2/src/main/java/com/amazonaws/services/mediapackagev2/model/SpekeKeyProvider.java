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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for the SPEKE key provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/SpekeKeyProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpekeKeyProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The encryption
     * contract defines which content keys are used to encrypt the audio and video tracks in your stream. To configure
     * the encryption contract, specify which audio and video encryption presets to use.
     * </p>
     */
    private EncryptionContractConfiguration encryptionContractConfiguration;
    /**
     * <p>
     * The unique identifier for the content. The service sends this to the key server to identify the current endpoint.
     * How unique you make this depends on how fine-grained you want access controls to be. The service does not permit
     * you to use the same ID for two simultaneous encryption processes. The resource ID is also known as the content
     * ID.
     * </p>
     * <p>
     * The following example shows a resource ID: <code>MovieNight20171126093045</code>
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     */
    private java.util.List<String> drmSystems;
    /**
     * <p>
     * The ARN for the IAM role granted by the key provider that provides access to the key provider API. This role must
     * have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient permissions policy
     * to allow access to the specific key retrieval URL. Get this from your DRM solution provider.
     * </p>
     * <p>
     * Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     * <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must reside in
     * the same AWS Region as MediaPackage and must start with https://.
     * </p>
     * <p>
     * The following example shows a URL:
     * <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     * </p>
     */
    private String url;

    /**
     * <p>
     * Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The encryption
     * contract defines which content keys are used to encrypt the audio and video tracks in your stream. To configure
     * the encryption contract, specify which audio and video encryption presets to use.
     * </p>
     * 
     * @param encryptionContractConfiguration
     *        Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
     *        encryption contract defines which content keys are used to encrypt the audio and video tracks in your
     *        stream. To configure the encryption contract, specify which audio and video encryption presets to use.
     */

    public void setEncryptionContractConfiguration(EncryptionContractConfiguration encryptionContractConfiguration) {
        this.encryptionContractConfiguration = encryptionContractConfiguration;
    }

    /**
     * <p>
     * Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The encryption
     * contract defines which content keys are used to encrypt the audio and video tracks in your stream. To configure
     * the encryption contract, specify which audio and video encryption presets to use.
     * </p>
     * 
     * @return Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
     *         encryption contract defines which content keys are used to encrypt the audio and video tracks in your
     *         stream. To configure the encryption contract, specify which audio and video encryption presets to use.
     */

    public EncryptionContractConfiguration getEncryptionContractConfiguration() {
        return this.encryptionContractConfiguration;
    }

    /**
     * <p>
     * Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The encryption
     * contract defines which content keys are used to encrypt the audio and video tracks in your stream. To configure
     * the encryption contract, specify which audio and video encryption presets to use.
     * </p>
     * 
     * @param encryptionContractConfiguration
     *        Configure one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
     *        encryption contract defines which content keys are used to encrypt the audio and video tracks in your
     *        stream. To configure the encryption contract, specify which audio and video encryption presets to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withEncryptionContractConfiguration(EncryptionContractConfiguration encryptionContractConfiguration) {
        setEncryptionContractConfiguration(encryptionContractConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the content. The service sends this to the key server to identify the current endpoint.
     * How unique you make this depends on how fine-grained you want access controls to be. The service does not permit
     * you to use the same ID for two simultaneous encryption processes. The resource ID is also known as the content
     * ID.
     * </p>
     * <p>
     * The following example shows a resource ID: <code>MovieNight20171126093045</code>
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the content. The service sends this to the key server to identify the current
     *        endpoint. How unique you make this depends on how fine-grained you want access controls to be. The service
     *        does not permit you to use the same ID for two simultaneous encryption processes. The resource ID is also
     *        known as the content ID.</p>
     *        <p>
     *        The following example shows a resource ID: <code>MovieNight20171126093045</code>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique identifier for the content. The service sends this to the key server to identify the current endpoint.
     * How unique you make this depends on how fine-grained you want access controls to be. The service does not permit
     * you to use the same ID for two simultaneous encryption processes. The resource ID is also known as the content
     * ID.
     * </p>
     * <p>
     * The following example shows a resource ID: <code>MovieNight20171126093045</code>
     * </p>
     * 
     * @return The unique identifier for the content. The service sends this to the key server to identify the current
     *         endpoint. How unique you make this depends on how fine-grained you want access controls to be. The
     *         service does not permit you to use the same ID for two simultaneous encryption processes. The resource ID
     *         is also known as the content ID.</p>
     *         <p>
     *         The following example shows a resource ID: <code>MovieNight20171126093045</code>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique identifier for the content. The service sends this to the key server to identify the current endpoint.
     * How unique you make this depends on how fine-grained you want access controls to be. The service does not permit
     * you to use the same ID for two simultaneous encryption processes. The resource ID is also known as the content
     * ID.
     * </p>
     * <p>
     * The following example shows a resource ID: <code>MovieNight20171126093045</code>
     * </p>
     * 
     * @param resourceId
     *        The unique identifier for the content. The service sends this to the key server to identify the current
     *        endpoint. How unique you make this depends on how fine-grained you want access controls to be. The service
     *        does not permit you to use the same ID for two simultaneous encryption processes. The resource ID is also
     *        known as the content ID.</p>
     *        <p>
     *        The following example shows a resource ID: <code>MovieNight20171126093045</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     * 
     * @return The DRM solution provider you're using to protect your content during distribution.
     * @see DrmSystem
     */

    public java.util.List<String> getDrmSystems() {
        return drmSystems;
    }

    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     * 
     * @param drmSystems
     *        The DRM solution provider you're using to protect your content during distribution.
     * @see DrmSystem
     */

    public void setDrmSystems(java.util.Collection<String> drmSystems) {
        if (drmSystems == null) {
            this.drmSystems = null;
            return;
        }

        this.drmSystems = new java.util.ArrayList<String>(drmSystems);
    }

    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDrmSystems(java.util.Collection)} or {@link #withDrmSystems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param drmSystems
     *        The DRM solution provider you're using to protect your content during distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DrmSystem
     */

    public SpekeKeyProvider withDrmSystems(String... drmSystems) {
        if (this.drmSystems == null) {
            setDrmSystems(new java.util.ArrayList<String>(drmSystems.length));
        }
        for (String ele : drmSystems) {
            this.drmSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     * 
     * @param drmSystems
     *        The DRM solution provider you're using to protect your content during distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DrmSystem
     */

    public SpekeKeyProvider withDrmSystems(java.util.Collection<String> drmSystems) {
        setDrmSystems(drmSystems);
        return this;
    }

    /**
     * <p>
     * The DRM solution provider you're using to protect your content during distribution.
     * </p>
     * 
     * @param drmSystems
     *        The DRM solution provider you're using to protect your content during distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DrmSystem
     */

    public SpekeKeyProvider withDrmSystems(DrmSystem... drmSystems) {
        java.util.ArrayList<String> drmSystemsCopy = new java.util.ArrayList<String>(drmSystems.length);
        for (DrmSystem value : drmSystems) {
            drmSystemsCopy.add(value.toString());
        }
        if (getDrmSystems() == null) {
            setDrmSystems(drmSystemsCopy);
        } else {
            getDrmSystems().addAll(drmSystemsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role granted by the key provider that provides access to the key provider API. This role must
     * have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient permissions policy
     * to allow access to the specific key retrieval URL. Get this from your DRM solution provider.
     * </p>
     * <p>
     * Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     * <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     * </p>
     * 
     * @param roleArn
     *        The ARN for the IAM role granted by the key provider that provides access to the key provider API. This
     *        role must have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient
     *        permissions policy to allow access to the specific key retrieval URL. Get this from your DRM solution
     *        provider.</p>
     *        <p>
     *        Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     *        <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role granted by the key provider that provides access to the key provider API. This role must
     * have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient permissions policy
     * to allow access to the specific key retrieval URL. Get this from your DRM solution provider.
     * </p>
     * <p>
     * Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     * <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     * </p>
     * 
     * @return The ARN for the IAM role granted by the key provider that provides access to the key provider API. This
     *         role must have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient
     *         permissions policy to allow access to the specific key retrieval URL. Get this from your DRM solution
     *         provider.</p>
     *         <p>
     *         Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     *         <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role granted by the key provider that provides access to the key provider API. This role must
     * have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient permissions policy
     * to allow access to the specific key retrieval URL. Get this from your DRM solution provider.
     * </p>
     * <p>
     * Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     * <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     * </p>
     * 
     * @param roleArn
     *        The ARN for the IAM role granted by the key provider that provides access to the key provider API. This
     *        role must have a trust policy that allows MediaPackage to assume the role, and it must have a sufficient
     *        permissions policy to allow access to the specific key retrieval URL. Get this from your DRM solution
     *        provider.</p>
     *        <p>
     *        Valid format: <code>arn:aws:iam::{accountID}:role/{name}</code>. The following example shows a role ARN:
     *        <code>arn:aws:iam::444455556666:role/SpekeAccess</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must reside in
     * the same AWS Region as MediaPackage and must start with https://.
     * </p>
     * <p>
     * The following example shows a URL:
     * <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     * </p>
     * 
     * @param url
     *        The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must
     *        reside in the same AWS Region as MediaPackage and must start with https://.</p>
     *        <p>
     *        The following example shows a URL:
     *        <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must reside in
     * the same AWS Region as MediaPackage and must start with https://.
     * </p>
     * <p>
     * The following example shows a URL:
     * <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     * </p>
     * 
     * @return The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must
     *         reside in the same AWS Region as MediaPackage and must start with https://.</p>
     *         <p>
     *         The following example shows a URL:
     *         <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must reside in
     * the same AWS Region as MediaPackage and must start with https://.
     * </p>
     * <p>
     * The following example shows a URL:
     * <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     * </p>
     * 
     * @param url
     *        The URL of the API Gateway proxy that you set up to talk to your key server. The API Gateway proxy must
     *        reside in the same AWS Region as MediaPackage and must start with https://.</p>
     *        <p>
     *        The following example shows a URL:
     *        <code>https://1wm2dx1f33.execute-api.us-west-2.amazonaws.com/SpekeSample/copyProtection</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpekeKeyProvider withUrl(String url) {
        setUrl(url);
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
        if (getEncryptionContractConfiguration() != null)
            sb.append("EncryptionContractConfiguration: ").append(getEncryptionContractConfiguration()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getDrmSystems() != null)
            sb.append("DrmSystems: ").append(getDrmSystems()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpekeKeyProvider == false)
            return false;
        SpekeKeyProvider other = (SpekeKeyProvider) obj;
        if (other.getEncryptionContractConfiguration() == null ^ this.getEncryptionContractConfiguration() == null)
            return false;
        if (other.getEncryptionContractConfiguration() != null
                && other.getEncryptionContractConfiguration().equals(this.getEncryptionContractConfiguration()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getDrmSystems() == null ^ this.getDrmSystems() == null)
            return false;
        if (other.getDrmSystems() != null && other.getDrmSystems().equals(this.getDrmSystems()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionContractConfiguration() == null) ? 0 : getEncryptionContractConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getDrmSystems() == null) ? 0 : getDrmSystems().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public SpekeKeyProvider clone() {
        try {
            return (SpekeKeyProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.SpekeKeyProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
