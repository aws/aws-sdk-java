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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBucketAccessKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketAccessKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes the access keys for the specified bucket.
     * </p>
     */
    private java.util.List<AccessKey> accessKeys;

    /**
     * <p>
     * An object that describes the access keys for the specified bucket.
     * </p>
     * 
     * @return An object that describes the access keys for the specified bucket.
     */

    public java.util.List<AccessKey> getAccessKeys() {
        return accessKeys;
    }

    /**
     * <p>
     * An object that describes the access keys for the specified bucket.
     * </p>
     * 
     * @param accessKeys
     *        An object that describes the access keys for the specified bucket.
     */

    public void setAccessKeys(java.util.Collection<AccessKey> accessKeys) {
        if (accessKeys == null) {
            this.accessKeys = null;
            return;
        }

        this.accessKeys = new java.util.ArrayList<AccessKey>(accessKeys);
    }

    /**
     * <p>
     * An object that describes the access keys for the specified bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessKeys(java.util.Collection)} or {@link #withAccessKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessKeys
     *        An object that describes the access keys for the specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketAccessKeysResult withAccessKeys(AccessKey... accessKeys) {
        if (this.accessKeys == null) {
            setAccessKeys(new java.util.ArrayList<AccessKey>(accessKeys.length));
        }
        for (AccessKey ele : accessKeys) {
            this.accessKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes the access keys for the specified bucket.
     * </p>
     * 
     * @param accessKeys
     *        An object that describes the access keys for the specified bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketAccessKeysResult withAccessKeys(java.util.Collection<AccessKey> accessKeys) {
        setAccessKeys(accessKeys);
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
        if (getAccessKeys() != null)
            sb.append("AccessKeys: ").append(getAccessKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketAccessKeysResult == false)
            return false;
        GetBucketAccessKeysResult other = (GetBucketAccessKeysResult) obj;
        if (other.getAccessKeys() == null ^ this.getAccessKeys() == null)
            return false;
        if (other.getAccessKeys() != null && other.getAccessKeys().equals(this.getAccessKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeys() == null) ? 0 : getAccessKeys().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketAccessKeysResult clone() {
        try {
            return (GetBucketAccessKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
