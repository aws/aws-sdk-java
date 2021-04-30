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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Configuration information about a public key that you can use with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and signed
 * cookies</a>, or with <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
 * encryption</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/PublicKeyConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKeyConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A string included in the request to help make sure that the request can’t be replayed.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The public key that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     */
    private String encodedKey;
    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * A string included in the request to help make sure that the request can’t be replayed.
     * </p>
     * 
     * @param callerReference
     *        A string included in the request to help make sure that the request can’t be replayed.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A string included in the request to help make sure that the request can’t be replayed.
     * </p>
     * 
     * @return A string included in the request to help make sure that the request can’t be replayed.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A string included in the request to help make sure that the request can’t be replayed.
     * </p>
     * 
     * @param callerReference
     *        A string included in the request to help make sure that the request can’t be replayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @param name
     *        A name to help identify the public key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @return A name to help identify the public key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name to help identify the public key.
     * </p>
     * 
     * @param name
     *        A name to help identify the public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The public key that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param encodedKey
     *        The public key that you can use with <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs
     *        and signed cookies</a>, or with <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html"
     *        >field-level encryption</a>.
     */

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    /**
     * <p>
     * The public key that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @return The public key that you can use with <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs
     *         and signed cookies</a>, or with <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html"
     *         >field-level encryption</a>.
     */

    public String getEncodedKey() {
        return this.encodedKey;
    }

    /**
     * <p>
     * The public key that you can use with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs and
     * signed cookies</a>, or with <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html">field-level
     * encryption</a>.
     * </p>
     * 
     * @param encodedKey
     *        The public key that you can use with <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">signed URLs
     *        and signed cookies</a>, or with <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html"
     *        >field-level encryption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicKeyConfig withEncodedKey(String encodedKey) {
        setEncodedKey(encodedKey);
        return this;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the public key. The comment cannot be longer than 128 characters.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @return A comment to describe the public key. The comment cannot be longer than 128 characters.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment to describe the public key. The comment cannot be longer than 128 characters.
     * </p>
     * 
     * @param comment
     *        A comment to describe the public key. The comment cannot be longer than 128 characters.
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
