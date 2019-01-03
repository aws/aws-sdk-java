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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ConnectCustomKeyStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectCustomKeyStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store,
     * use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     */
    private String customKeyStoreId;

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store,
     * use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key
     *        store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store,
     * use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @return Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key
     *         store, use the <a>DescribeCustomKeyStores</a> operation.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store,
     * use the <a>DescribeCustomKeyStores</a> operation.
     * </p>
     * 
     * @param customKeyStoreId
     *        Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key
     *        store, use the <a>DescribeCustomKeyStores</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectCustomKeyStoreRequest withCustomKeyStoreId(String customKeyStoreId) {
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

        if (obj instanceof ConnectCustomKeyStoreRequest == false)
            return false;
        ConnectCustomKeyStoreRequest other = (ConnectCustomKeyStoreRequest) obj;
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

        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        return hashCode;
    }

    @Override
    public ConnectCustomKeyStoreRequest clone() {
        return (ConnectCustomKeyStoreRequest) super.clone();
    }

}
