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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateKeySigningKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKeySigningKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ChangeInfo changeInfo;
    /**
     * <p>
     * The key-signing key (KSK) that the request creates.
     * </p>
     */
    private KeySigningKey keySigningKey;
    /**
     * <p>
     * The unique URL representing the new key-signing key (KSK).
     * </p>
     */
    private String location;

    /**
     * @param changeInfo
     */

    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * @return
     */

    public ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    /**
     * @param changeInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyResult withChangeInfo(ChangeInfo changeInfo) {
        setChangeInfo(changeInfo);
        return this;
    }

    /**
     * <p>
     * The key-signing key (KSK) that the request creates.
     * </p>
     * 
     * @param keySigningKey
     *        The key-signing key (KSK) that the request creates.
     */

    public void setKeySigningKey(KeySigningKey keySigningKey) {
        this.keySigningKey = keySigningKey;
    }

    /**
     * <p>
     * The key-signing key (KSK) that the request creates.
     * </p>
     * 
     * @return The key-signing key (KSK) that the request creates.
     */

    public KeySigningKey getKeySigningKey() {
        return this.keySigningKey;
    }

    /**
     * <p>
     * The key-signing key (KSK) that the request creates.
     * </p>
     * 
     * @param keySigningKey
     *        The key-signing key (KSK) that the request creates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyResult withKeySigningKey(KeySigningKey keySigningKey) {
        setKeySigningKey(keySigningKey);
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new key-signing key (KSK).
     * </p>
     * 
     * @param location
     *        The unique URL representing the new key-signing key (KSK).
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new key-signing key (KSK).
     * </p>
     * 
     * @return The unique URL representing the new key-signing key (KSK).
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The unique URL representing the new key-signing key (KSK).
     * </p>
     * 
     * @param location
     *        The unique URL representing the new key-signing key (KSK).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKeySigningKeyResult withLocation(String location) {
        setLocation(location);
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
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: ").append(getChangeInfo()).append(",");
        if (getKeySigningKey() != null)
            sb.append("KeySigningKey: ").append(getKeySigningKey()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKeySigningKeyResult == false)
            return false;
        CreateKeySigningKeyResult other = (CreateKeySigningKeyResult) obj;
        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        if (other.getKeySigningKey() == null ^ this.getKeySigningKey() == null)
            return false;
        if (other.getKeySigningKey() != null && other.getKeySigningKey().equals(this.getKeySigningKey()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        hashCode = prime * hashCode + ((getKeySigningKey() == null) ? 0 : getKeySigningKey().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateKeySigningKeyResult clone() {
        try {
            return (CreateKeySigningKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
