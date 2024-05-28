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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/DeleteKeyValueStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyValueStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the key value store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The key value store to delete, if a match occurs.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @param name
     *        The name of the key value store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @return The name of the key value store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the key value store.
     * </p>
     * 
     * @param name
     *        The name of the key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyValueStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The key value store to delete, if a match occurs.
     * </p>
     * 
     * @param ifMatch
     *        The key value store to delete, if a match occurs.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The key value store to delete, if a match occurs.
     * </p>
     * 
     * @return The key value store to delete, if a match occurs.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The key value store to delete, if a match occurs.
     * </p>
     * 
     * @param ifMatch
     *        The key value store to delete, if a match occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyValueStoreRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyValueStoreRequest == false)
            return false;
        DeleteKeyValueStoreRequest other = (DeleteKeyValueStoreRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyValueStoreRequest clone() {
        return (DeleteKeyValueStoreRequest) super.clone();
    }

}
