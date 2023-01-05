/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyPairRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     */
    private String keyPairName;
    /**
     * <p>
     * The RSA fingerprint of the Lightsail default key pair to delete.
     * </p>
     * <note>
     * <p>
     * The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail default key
     * pair.
     * </p>
     * </note>
     */
    private String expectedFingerprint;

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair to delete.
     */

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @return The name of the key pair to delete.
     */

    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * <p>
     * The name of the key pair to delete.
     * </p>
     * 
     * @param keyPairName
     *        The name of the key pair to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyPairRequest withKeyPairName(String keyPairName) {
        setKeyPairName(keyPairName);
        return this;
    }

    /**
     * <p>
     * The RSA fingerprint of the Lightsail default key pair to delete.
     * </p>
     * <note>
     * <p>
     * The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail default key
     * pair.
     * </p>
     * </note>
     * 
     * @param expectedFingerprint
     *        The RSA fingerprint of the Lightsail default key pair to delete.</p> <note>
     *        <p>
     *        The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail
     *        default key pair.
     *        </p>
     */

    public void setExpectedFingerprint(String expectedFingerprint) {
        this.expectedFingerprint = expectedFingerprint;
    }

    /**
     * <p>
     * The RSA fingerprint of the Lightsail default key pair to delete.
     * </p>
     * <note>
     * <p>
     * The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail default key
     * pair.
     * </p>
     * </note>
     * 
     * @return The RSA fingerprint of the Lightsail default key pair to delete.</p> <note>
     *         <p>
     *         The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail
     *         default key pair.
     *         </p>
     */

    public String getExpectedFingerprint() {
        return this.expectedFingerprint;
    }

    /**
     * <p>
     * The RSA fingerprint of the Lightsail default key pair to delete.
     * </p>
     * <note>
     * <p>
     * The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail default key
     * pair.
     * </p>
     * </note>
     * 
     * @param expectedFingerprint
     *        The RSA fingerprint of the Lightsail default key pair to delete.</p> <note>
     *        <p>
     *        The <code>expectedFingerprint</code> parameter is required only when specifying to delete a Lightsail
     *        default key pair.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyPairRequest withExpectedFingerprint(String expectedFingerprint) {
        setExpectedFingerprint(expectedFingerprint);
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
        if (getKeyPairName() != null)
            sb.append("KeyPairName: ").append(getKeyPairName()).append(",");
        if (getExpectedFingerprint() != null)
            sb.append("ExpectedFingerprint: ").append(getExpectedFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyPairRequest == false)
            return false;
        DeleteKeyPairRequest other = (DeleteKeyPairRequest) obj;
        if (other.getKeyPairName() == null ^ this.getKeyPairName() == null)
            return false;
        if (other.getKeyPairName() != null && other.getKeyPairName().equals(this.getKeyPairName()) == false)
            return false;
        if (other.getExpectedFingerprint() == null ^ this.getExpectedFingerprint() == null)
            return false;
        if (other.getExpectedFingerprint() != null && other.getExpectedFingerprint().equals(this.getExpectedFingerprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairName() == null) ? 0 : getKeyPairName().hashCode());
        hashCode = prime * hashCode + ((getExpectedFingerprint() == null) ? 0 : getExpectedFingerprint().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyPairRequest clone() {
        return (DeleteKeyPairRequest) super.clone();
    }

}
