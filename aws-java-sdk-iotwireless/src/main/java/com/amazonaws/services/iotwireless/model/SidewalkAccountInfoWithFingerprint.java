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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Sidewalk account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkAccountInfoWithFingerprint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkAccountInfoWithFingerprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     */
    private String amazonId;
    /**
     * <p>
     * The fingerprint of the Sidewalk application server private key.
     * </p>
     */
    private String fingerprint;
    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @param amazonId
     *        The Sidewalk Amazon ID.
     */

    public void setAmazonId(String amazonId) {
        this.amazonId = amazonId;
    }

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @return The Sidewalk Amazon ID.
     */

    public String getAmazonId() {
        return this.amazonId;
    }

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @param amazonId
     *        The Sidewalk Amazon ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkAccountInfoWithFingerprint withAmazonId(String amazonId) {
        setAmazonId(amazonId);
        return this;
    }

    /**
     * <p>
     * The fingerprint of the Sidewalk application server private key.
     * </p>
     * 
     * @param fingerprint
     *        The fingerprint of the Sidewalk application server private key.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The fingerprint of the Sidewalk application server private key.
     * </p>
     * 
     * @return The fingerprint of the Sidewalk application server private key.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * The fingerprint of the Sidewalk application server private key.
     * </p>
     * 
     * @param fingerprint
     *        The fingerprint of the Sidewalk application server private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkAccountInfoWithFingerprint withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkAccountInfoWithFingerprint withArn(String arn) {
        setArn(arn);
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
        if (getAmazonId() != null)
            sb.append("AmazonId: ").append(getAmazonId()).append(",");
        if (getFingerprint() != null)
            sb.append("Fingerprint: ").append("***Sensitive Data Redacted***").append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkAccountInfoWithFingerprint == false)
            return false;
        SidewalkAccountInfoWithFingerprint other = (SidewalkAccountInfoWithFingerprint) obj;
        if (other.getAmazonId() == null ^ this.getAmazonId() == null)
            return false;
        if (other.getAmazonId() != null && other.getAmazonId().equals(this.getAmazonId()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonId() == null) ? 0 : getAmazonId().hashCode());
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkAccountInfoWithFingerprint clone() {
        try {
            return (SidewalkAccountInfoWithFingerprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkAccountInfoWithFingerprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
