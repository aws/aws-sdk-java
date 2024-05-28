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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The key value store association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyValueStoreAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyValueStoreAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store association.
     * </p>
     */
    private String keyValueStoreARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store association.
     * </p>
     * 
     * @param keyValueStoreARN
     *        The Amazon Resource Name (ARN) of the key value store association.
     */

    public void setKeyValueStoreARN(String keyValueStoreARN) {
        this.keyValueStoreARN = keyValueStoreARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the key value store association.
     */

    public String getKeyValueStoreARN() {
        return this.keyValueStoreARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key value store association.
     * </p>
     * 
     * @param keyValueStoreARN
     *        The Amazon Resource Name (ARN) of the key value store association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreAssociation withKeyValueStoreARN(String keyValueStoreARN) {
        setKeyValueStoreARN(keyValueStoreARN);
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
        if (getKeyValueStoreARN() != null)
            sb.append("KeyValueStoreARN: ").append(getKeyValueStoreARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyValueStoreAssociation == false)
            return false;
        KeyValueStoreAssociation other = (KeyValueStoreAssociation) obj;
        if (other.getKeyValueStoreARN() == null ^ this.getKeyValueStoreARN() == null)
            return false;
        if (other.getKeyValueStoreARN() != null && other.getKeyValueStoreARN().equals(this.getKeyValueStoreARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyValueStoreARN() == null) ? 0 : getKeyValueStoreARN().hashCode());
        return hashCode;
    }

    @Override
    public KeyValueStoreAssociation clone() {
        try {
            return (KeyValueStoreAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
