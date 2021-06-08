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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeyGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of key groups.
     * </p>
     */
    private KeyGroupList keyGroupList;

    /**
     * <p>
     * A list of key groups.
     * </p>
     * 
     * @param keyGroupList
     *        A list of key groups.
     */

    public void setKeyGroupList(KeyGroupList keyGroupList) {
        this.keyGroupList = keyGroupList;
    }

    /**
     * <p>
     * A list of key groups.
     * </p>
     * 
     * @return A list of key groups.
     */

    public KeyGroupList getKeyGroupList() {
        return this.keyGroupList;
    }

    /**
     * <p>
     * A list of key groups.
     * </p>
     * 
     * @param keyGroupList
     *        A list of key groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyGroupsResult withKeyGroupList(KeyGroupList keyGroupList) {
        setKeyGroupList(keyGroupList);
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
        if (getKeyGroupList() != null)
            sb.append("KeyGroupList: ").append(getKeyGroupList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyGroupsResult == false)
            return false;
        ListKeyGroupsResult other = (ListKeyGroupsResult) obj;
        if (other.getKeyGroupList() == null ^ this.getKeyGroupList() == null)
            return false;
        if (other.getKeyGroupList() != null && other.getKeyGroupList().equals(this.getKeyGroupList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyGroupList() == null) ? 0 : getKeyGroupList().hashCode());
        return hashCode;
    }

    @Override
    public ListKeyGroupsResult clone() {
        try {
            return (ListKeyGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
