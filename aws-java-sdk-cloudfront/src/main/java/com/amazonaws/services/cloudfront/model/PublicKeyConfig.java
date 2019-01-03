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
 * Information about a public key you add to CloudFront to use with features like field-level encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/PublicKeyConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKeyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * The name for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * </p>
     */
    private String encodedKey;
    /**
     * <p>
     * An optional comment about a public key.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures that the request can't be replayed.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @return A unique number that ensures that the request can't be replayed.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique number that ensures that the request can't be replayed.
     * </p>
     * 
     * @param callerReference
     *        A unique number that ensures that the request can't be replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * The name for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param name
     *        The name for a public key you add to CloudFront to use with features like field-level encryption.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @return The name for a public key you add to CloudFront to use with features like field-level encryption.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for a public key you add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param name
     *        The name for a public key you add to CloudFront to use with features like field-level encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param encodedKey
     *        The encoded public key that you want to add to CloudFront to use with features like field-level
     *        encryption.
     */

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    /**
     * <p>
     * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @return The encoded public key that you want to add to CloudFront to use with features like field-level
     *         encryption.
     */

    public String getEncodedKey() {
        return this.encodedKey;
    }

    /**
     * <p>
     * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * </p>
     * 
     * @param encodedKey
     *        The encoded public key that you want to add to CloudFront to use with features like field-level
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withEncodedKey(String encodedKey) {
        setEncodedKey(encodedKey);
        return this;
    }

    /**
     * <p>
     * An optional comment about a public key.
     * </p>
     * 
     * @param comment
     *        An optional comment about a public key.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about a public key.
     * </p>
     * 
     * @return An optional comment about a public key.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about a public key.
     * </p>
     * 
     * @param comment
     *        An optional comment about a public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withComment(String comment) {
        setComment(comment);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEncodedKey() != null)
            sb.append("EncodedKey: ").append(getEncodedKey()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKeyConfig == false)
            return false;
        PublicKeyConfig other = (PublicKeyConfig) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEncodedKey() == null ^ this.getEncodedKey() == null)
            return false;
        if (other.getEncodedKey() != null && other.getEncodedKey().equals(this.getEncodedKey()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEncodedKey() == null) ? 0 : getEncodedKey().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public PublicKeyConfig clone() {
        try {
            return (PublicKeyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
