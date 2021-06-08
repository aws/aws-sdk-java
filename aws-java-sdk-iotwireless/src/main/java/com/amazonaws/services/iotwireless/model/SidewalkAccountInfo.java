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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkAccountInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkAccountInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     */
    private String amazonId;
    /**
     * <p>
     * The Sidewalk application server private key.
     * </p>
     */
    private String appServerPrivateKey;

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

    public SidewalkAccountInfo withAmazonId(String amazonId) {
        setAmazonId(amazonId);
        return this;
    }

    /**
     * <p>
     * The Sidewalk application server private key.
     * </p>
     * 
     * @param appServerPrivateKey
     *        The Sidewalk application server private key.
     */

    public void setAppServerPrivateKey(String appServerPrivateKey) {
        this.appServerPrivateKey = appServerPrivateKey;
    }

    /**
     * <p>
     * The Sidewalk application server private key.
     * </p>
     * 
     * @return The Sidewalk application server private key.
     */

    public String getAppServerPrivateKey() {
        return this.appServerPrivateKey;
    }

    /**
     * <p>
     * The Sidewalk application server private key.
     * </p>
     * 
     * @param appServerPrivateKey
     *        The Sidewalk application server private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkAccountInfo withAppServerPrivateKey(String appServerPrivateKey) {
        setAppServerPrivateKey(appServerPrivateKey);
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
        if (getAppServerPrivateKey() != null)
            sb.append("AppServerPrivateKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkAccountInfo == false)
            return false;
        SidewalkAccountInfo other = (SidewalkAccountInfo) obj;
        if (other.getAmazonId() == null ^ this.getAmazonId() == null)
            return false;
        if (other.getAmazonId() != null && other.getAmazonId().equals(this.getAmazonId()) == false)
            return false;
        if (other.getAppServerPrivateKey() == null ^ this.getAppServerPrivateKey() == null)
            return false;
        if (other.getAppServerPrivateKey() != null && other.getAppServerPrivateKey().equals(this.getAppServerPrivateKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonId() == null) ? 0 : getAmazonId().hashCode());
        hashCode = prime * hashCode + ((getAppServerPrivateKey() == null) ? 0 : getAppServerPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkAccountInfo clone() {
        try {
            return (SidewalkAccountInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkAccountInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
