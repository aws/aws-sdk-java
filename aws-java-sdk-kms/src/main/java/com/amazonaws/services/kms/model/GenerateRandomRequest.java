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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GenerateRandom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateRandomRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The length of the byte string.
     * </p>
     */
    private Integer numberOfBytes;
    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>. To find
     * the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the byte string.
     */

    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * 
     * @return The length of the byte string.
     */

    public Integer getNumberOfBytes() {
        return this.numberOfBytes;
    }

    /**
     * <p>
     * The length of the byte string.
     * </p>
     * 
     * @param numberOfBytes
     *        The length of the byte string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomRequest withNumberOfBytes(Integer numberOfBytes) {
        setNumberOfBytes(numberOfBytes);
        return this;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>. To find
     * the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>.
     *        To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>. To find
     * the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @return Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>.
     *         To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>. To find
     * the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>.
     *        To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateRandomRequest withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
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
        if (getNumberOfBytes() != null)
            sb.append("NumberOfBytes: ").append(getNumberOfBytes()).append(",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomRequest == false)
            return false;
        GenerateRandomRequest other = (GenerateRandomRequest) obj;
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null)
            return false;
        if (other.getNumberOfBytes() != null && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateRandomRequest clone() {
        return (GenerateRandomRequest) super.clone();
    }

}
