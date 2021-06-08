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
 * A list of identifiers for the public keys that CloudFront can use to verify the signatures of signed URLs and signed
 * cookies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KGKeyPairIds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KGKeyPairIds implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the key group that contains the public keys.
     * </p>
     */
    private String keyGroupId;

    private KeyPairIds keyPairIds;

    /**
     * <p>
     * The identifier of the key group that contains the public keys.
     * </p>
     * 
     * @param keyGroupId
     *        The identifier of the key group that contains the public keys.
     */

    public void setKeyGroupId(String keyGroupId) {
        this.keyGroupId = keyGroupId;
    }

    /**
     * <p>
     * The identifier of the key group that contains the public keys.
     * </p>
     * 
     * @return The identifier of the key group that contains the public keys.
     */

    public String getKeyGroupId() {
        return this.keyGroupId;
    }

    /**
     * <p>
     * The identifier of the key group that contains the public keys.
     * </p>
     * 
     * @param keyGroupId
     *        The identifier of the key group that contains the public keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KGKeyPairIds withKeyGroupId(String keyGroupId) {
        setKeyGroupId(keyGroupId);
        return this;
    }

    /**
     * @param keyPairIds
     */

    public void setKeyPairIds(KeyPairIds keyPairIds) {
        this.keyPairIds = keyPairIds;
    }

    /**
     * @return
     */

    public KeyPairIds getKeyPairIds() {
        return this.keyPairIds;
    }

    /**
     * @param keyPairIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KGKeyPairIds withKeyPairIds(KeyPairIds keyPairIds) {
        setKeyPairIds(keyPairIds);
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
        if (getKeyGroupId() != null)
            sb.append("KeyGroupId: ").append(getKeyGroupId()).append(",");
        if (getKeyPairIds() != null)
            sb.append("KeyPairIds: ").append(getKeyPairIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KGKeyPairIds == false)
            return false;
        KGKeyPairIds other = (KGKeyPairIds) obj;
        if (other.getKeyGroupId() == null ^ this.getKeyGroupId() == null)
            return false;
        if (other.getKeyGroupId() != null && other.getKeyGroupId().equals(this.getKeyGroupId()) == false)
            return false;
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null)
            return false;
        if (other.getKeyPairIds() != null && other.getKeyPairIds().equals(this.getKeyPairIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyGroupId() == null) ? 0 : getKeyGroupId().hashCode());
        hashCode = prime * hashCode + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode());
        return hashCode;
    }

    @Override
    public KGKeyPairIds clone() {
        try {
            return (KGKeyPairIds) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
