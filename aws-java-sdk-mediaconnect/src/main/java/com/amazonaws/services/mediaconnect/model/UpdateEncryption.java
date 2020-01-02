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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about the encryption of the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEncryption implements Serializable, Cloneable, StructuredPojo {

    /** The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256). */
    private String algorithm;
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     * content. This parameter is not valid for static key encryption.
     */
    private String constantInitializationVector;
    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key
     * provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     */
    private String deviceId;
    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     */
    private String keyType;
    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     * encryption and is not valid for static key encryption.
     */
    private String region;
    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint.
     * The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid
     * for static key encryption.
     */
    private String resourceId;
    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     */
    private String roleArn;
    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is
     * required for static key encryption and is not valid for SPEKE encryption.
     */
    private String secretArn;
    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for
     * SPEKE encryption and is not valid for static key encryption.
     */
    private String url;

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @see Algorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @return The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @see Algorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Algorithm
     */

    public UpdateEncryption withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     * @param algorithm
     *        The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Algorithm
     */

    public UpdateEncryption withAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     * content. This parameter is not valid for static key encryption.
     * 
     * @param constantInitializationVector
     *        A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     *        content. This parameter is not valid for static key encryption.
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     * content. This parameter is not valid for static key encryption.
     * 
     * @return A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     *         content. This parameter is not valid for static key encryption.
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     * content. This parameter is not valid for static key encryption.
     * 
     * @param constantInitializationVector
     *        A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting
     *        content. This parameter is not valid for static key encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key
     * provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     * @param deviceId
     *        The value of one of the devices that you configured with your digital rights management (DRM) platform key
     *        provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key
     * provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     * @return The value of one of the devices that you configured with your digital rights management (DRM) platform
     *         key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * The value of one of the devices that you configured with your digital rights management (DRM) platform key
     * provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * 
     * @param deviceId
     *        The value of one of the devices that you configured with your digital rights management (DRM) platform key
     *        provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @return The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *         default setting (static-key).
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public UpdateEncryption withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default
     * setting (static-key).
     * 
     * @param keyType
     *        The type of key that is used for the encryption. If no keyType is provided, the service will use the
     *        default setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public UpdateEncryption withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     * encryption and is not valid for static key encryption.
     * 
     * @param region
     *        The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     *        encryption and is not valid for static key encryption.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     * encryption and is not valid for static key encryption.
     * 
     * @return The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     *         encryption and is not valid for static key encryption.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     * encryption and is not valid for static key encryption.
     * 
     * @param region
     *        The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE
     *        encryption and is not valid for static key encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint.
     * The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid
     * for static key encryption.
     * 
     * @param resourceId
     *        An identifier for the content. The service sends this value to the key server to identify the current
     *        endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption
     *        and is not valid for static key encryption.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint.
     * The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid
     * for static key encryption.
     * 
     * @return An identifier for the content. The service sends this value to the key server to identify the current
     *         endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE
     *         encryption and is not valid for static key encryption.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * An identifier for the content. The service sends this value to the key server to identify the current endpoint.
     * The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid
     * for static key encryption.
     * 
     * @param resourceId
     *        An identifier for the content. The service sends this value to the key server to identify the current
     *        endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption
     *        and is not valid for static key encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @param roleArn
     *        The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     *        entity).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @return The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a
     *         trusted entity).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     * entity).
     * 
     * @param roleArn
     *        The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted
     *        entity).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is
     * required for static key encryption and is not valid for SPEKE encryption.
     * 
     * @param secretArn
     *        The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter
     *        is required for static key encryption and is not valid for SPEKE encryption.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is
     * required for static key encryption and is not valid for SPEKE encryption.
     * 
     * @return The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter
     *         is required for static key encryption and is not valid for SPEKE encryption.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is
     * required for static key encryption and is not valid for SPEKE encryption.
     * 
     * @param secretArn
     *        The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter
     *        is required for static key encryption and is not valid for SPEKE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for
     * SPEKE encryption and is not valid for static key encryption.
     * 
     * @param url
     *        The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required
     *        for SPEKE encryption and is not valid for static key encryption.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for
     * SPEKE encryption and is not valid for static key encryption.
     * 
     * @return The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required
     *         for SPEKE encryption and is not valid for static key encryption.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for
     * SPEKE encryption and is not valid for static key encryption.
     * 
     * @param url
     *        The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required
     *        for SPEKE encryption and is not valid for static key encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEncryption withUrl(String url) {
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: ").append(getConstantInitializationVector()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
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

        if (obj instanceof UpdateEncryption == false)
            return false;
        UpdateEncryption other = (UpdateEncryption) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
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

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEncryption clone() {
        try {
            return (UpdateEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.UpdateEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
