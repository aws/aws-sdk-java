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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * (MQ) The Secrets Manager secret that stores your broker credentials. To store your secret, use the following format:
 * <code> { "username": "your username", "password": "your password" }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/SourceAccessConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     */
    private String type;
    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     */
    private String uRI;

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @param type
     *        To reference the secret, use the following format:
     *        <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *        <p>
     *        The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *        customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *        requires <code>kms:Decrypt</code> permissions.
     * @see SourceAccessType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @return To reference the secret, use the following format:
     *         <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *         <p>
     *         The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *         customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *         requires <code>kms:Decrypt</code> permissions.
     * @see SourceAccessType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @param type
     *        To reference the secret, use the following format:
     *        <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *        <p>
     *        The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *        customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *        requires <code>kms:Decrypt</code> permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAccessType
     */

    public SourceAccessConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @param type
     *        To reference the secret, use the following format:
     *        <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *        <p>
     *        The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *        customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *        requires <code>kms:Decrypt</code> permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAccessType
     */

    public SourceAccessConfiguration withType(SourceAccessType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @param uRI
     *        To reference the secret, use the following format:
     *        <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *        <p>
     *        The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *        customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *        requires <code>kms:Decrypt</code> permissions.
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @return To reference the secret, use the following format:
     *         <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *         <p>
     *         The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *         customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *         requires <code>kms:Decrypt</code> permissions.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * To reference the secret, use the following format: <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code>
     * </p>
     * <p>
     * The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use customer or
     * service managed keys. When using a customer managed KMS key, the Lambda execution role requires
     * <code>kms:Decrypt</code> permissions.
     * </p>
     * 
     * @param uRI
     *        To reference the secret, use the following format:
     *        <code>[ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]</code> </p>
     *        <p>
     *        The value of <code>Type</code> is always <code>BASIC_AUTH</code>. To encrypt the secret, you can use
     *        customer or service managed keys. When using a customer managed KMS key, the Lambda execution role
     *        requires <code>kms:Decrypt</code> permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAccessConfiguration withURI(String uRI) {
        setURI(uRI);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getURI() != null)
            sb.append("URI: ").append(getURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAccessConfiguration == false)
            return false;
        SourceAccessConfiguration other = (SourceAccessConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        return hashCode;
    }

    @Override
    public SourceAccessConfiguration clone() {
        try {
            return (SourceAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.SourceAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
