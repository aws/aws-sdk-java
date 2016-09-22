/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event source mapping ID.
     * </p>
     */
    private String uUID;

    /**
     * <p>
     * The event source mapping ID.
     * </p>
     * 
     * @param uUID
     *        The event source mapping ID.
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The event source mapping ID.
     * </p>
     * 
     * @return The event source mapping ID.
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The event source mapping ID.
     * </p>
     * 
     * @param uUID
     *        The event source mapping ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEventSourceMappingRequest withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUUID() != null)
            sb.append("UUID: " + getUUID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEventSourceMappingRequest == false)
            return false;
        DeleteEventSourceMappingRequest other = (DeleteEventSourceMappingRequest) obj;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEventSourceMappingRequest clone() {
        return (DeleteEventSourceMappingRequest) super.clone();
    }
}
