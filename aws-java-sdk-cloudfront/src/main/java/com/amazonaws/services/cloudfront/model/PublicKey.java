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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex data type of public keys you add to CloudFront to use with features like field-level encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/PublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKey implements Serializable, Cloneable {

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     */
    private PublicKeyConfig publicKeyConfig;

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     * 
     * @param id
     *        A unique ID assigned to a public key you've added to CloudFront.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     * 
     * @return A unique ID assigned to a public key you've added to CloudFront.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique ID assigned to a public key you've added to CloudFront.
     * </p>
     * 
     * @param id
     *        A unique ID assigned to a public key you've added to CloudFront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     * 
     * @param createdTime
     *        A time you added a public key to CloudFront.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     * 
     * @return A time you added a public key to CloudFront.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A time you added a public key to CloudFront.
     * </p>
     * 
     * @param createdTime
     *        A time you added a public key to CloudFront.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param publicKeyConfig
     *        A complex data type for a public key you add to CloudFront to use with features like field-level
     *        encryption.
     */

    public void setPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        this.publicKeyConfig = publicKeyConfig;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @return A complex data type for a public key you add to CloudFront to use with features like field-level
     *         encryption.
     */

    public PublicKeyConfig getPublicKeyConfig() {
        return this.publicKeyConfig;
    }

    /**
     * <p>
     * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param publicKeyConfig
     *        A complex data type for a public key you add to CloudFront to use with features like field-level
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKey withPublicKeyConfig(PublicKeyConfig publicKeyConfig) {
        setPublicKeyConfig(publicKeyConfig);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getPublicKeyConfig() != null)
            sb.append("PublicKeyConfig: ").append(getPublicKeyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKey == false)
            return false;
        PublicKey other = (PublicKey) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getPublicKeyConfig() == null ^ this.getPublicKeyConfig() == null)
            return false;
        if (other.getPublicKeyConfig() != null && other.getPublicKeyConfig().equals(this.getPublicKeyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getPublicKeyConfig() == null) ? 0 : getPublicKeyConfig().hashCode());
        return hashCode;
    }

    @Override
    public PublicKey clone() {
        try {
            return (PublicKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
