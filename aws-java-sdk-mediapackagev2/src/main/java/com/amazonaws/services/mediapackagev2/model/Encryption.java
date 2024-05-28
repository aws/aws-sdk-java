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
 * The parameters for encrypting content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/Encryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Encryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * </p>
     */
    private String constantInitializationVector;
    /**
     * <p>
     * The encryption method to use.
     * </p>
     */
    private EncryptionMethod encryptionMethod;
    /**
     * <p>
     * The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The service
     * retrieves content keys before the live content begins streaming, and then retrieves them as needed over the
     * lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum rotation
     * interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys aren't rotated.
     * </p>
     * <p>
     * The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     * </p>
     */
    private Integer keyRotationIntervalSeconds;
    /**
     * <p>
     * The parameters for the SPEKE key provider.
     * </p>
     */
    private SpekeKeyProvider spekeKeyProvider;

    /**
     * <p>
     * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * </p>
     * 
     * @param constantInitializationVector
     *        A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     *        encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization
     *        vector (IV).
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * <p>
     * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * </p>
     * 
     * @return A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     *         encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization
     *         vector (IV).
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * <p>
     * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * </p>
     * 
     * @param constantInitializationVector
     *        A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     *        encrypting content. If you don't specify a value, then MediaPackage creates the constant initialization
     *        vector (IV).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param encryptionMethod
     *        The encryption method to use.
     */

    public void setEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @return The encryption method to use.
     */

    public EncryptionMethod getEncryptionMethod() {
        return this.encryptionMethod;
    }

    /**
     * <p>
     * The encryption method to use.
     * </p>
     * 
     * @param encryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withEncryptionMethod(EncryptionMethod encryptionMethod) {
        setEncryptionMethod(encryptionMethod);
        return this;
    }

    /**
     * <p>
     * The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The service
     * retrieves content keys before the live content begins streaming, and then retrieves them as needed over the
     * lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum rotation
     * interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys aren't rotated.
     * </p>
     * <p>
     * The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     * </p>
     * 
     * @param keyRotationIntervalSeconds
     *        The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The
     *        service retrieves content keys before the live content begins streaming, and then retrieves them as needed
     *        over the lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum
     *        rotation interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys
     *        aren't rotated.</p>
     *        <p>
     *        The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     */

    public void setKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
    }

    /**
     * <p>
     * The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The service
     * retrieves content keys before the live content begins streaming, and then retrieves them as needed over the
     * lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum rotation
     * interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys aren't rotated.
     * </p>
     * <p>
     * The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     * </p>
     * 
     * @return The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The
     *         service retrieves content keys before the live content begins streaming, and then retrieves them as
     *         needed over the lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the
     *         minimum rotation interval, which is equivalent to setting it to 300. If you don't enter an interval,
     *         content keys aren't rotated.</p>
     *         <p>
     *         The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     */

    public Integer getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds;
    }

    /**
     * <p>
     * The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The service
     * retrieves content keys before the live content begins streaming, and then retrieves them as needed over the
     * lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum rotation
     * interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys aren't rotated.
     * </p>
     * <p>
     * The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     * </p>
     * 
     * @param keyRotationIntervalSeconds
     *        The frequency (in seconds) of key changes for live workflows, in which content is streamed real time. The
     *        service retrieves content keys before the live content begins streaming, and then retrieves them as needed
     *        over the lifetime of the workflow. By default, key rotation is set to 300 seconds (5 minutes), the minimum
     *        rotation interval, which is equivalent to setting it to 300. If you don't enter an interval, content keys
     *        aren't rotated.</p>
     *        <p>
     *        The following example setting causes the service to rotate keys every thirty minutes: <code>1800</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        setKeyRotationIntervalSeconds(keyRotationIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The parameters for the SPEKE key provider.
     * </p>
     * 
     * @param spekeKeyProvider
     *        The parameters for the SPEKE key provider.
     */

    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * <p>
     * The parameters for the SPEKE key provider.
     * </p>
     * 
     * @return The parameters for the SPEKE key provider.
     */

    public SpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * <p>
     * The parameters for the SPEKE key provider.
     * </p>
     * 
     * @param spekeKeyProvider
     *        The parameters for the SPEKE key provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
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
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: ").append(getConstantInitializationVector()).append(",");
        if (getEncryptionMethod() != null)
            sb.append("EncryptionMethod: ").append(getEncryptionMethod()).append(",");
        if (getKeyRotationIntervalSeconds() != null)
            sb.append("KeyRotationIntervalSeconds: ").append(getKeyRotationIntervalSeconds()).append(",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Encryption == false)
            return false;
        Encryption other = (Encryption) obj;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null)
            return false;
        if (other.getEncryptionMethod() != null && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false)
            return false;
        if (other.getKeyRotationIntervalSeconds() == null ^ this.getKeyRotationIntervalSeconds() == null)
            return false;
        if (other.getKeyRotationIntervalSeconds() != null && other.getKeyRotationIntervalSeconds().equals(this.getKeyRotationIntervalSeconds()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getKeyRotationIntervalSeconds() == null) ? 0 : getKeyRotationIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public Encryption clone() {
        try {
            return (Encryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.EncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
