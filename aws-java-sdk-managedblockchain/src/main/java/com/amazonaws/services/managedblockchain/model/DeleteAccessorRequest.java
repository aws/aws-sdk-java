/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/DeleteAccessor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAccessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     */
    private String accessorId;

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param accessorId
     *        The unique identifier of the accessor.
     */

    public void setAccessorId(String accessorId) {
        this.accessorId = accessorId;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @return The unique identifier of the accessor.
     */

    public String getAccessorId() {
        return this.accessorId;
    }

    /**
     * <p>
     * The unique identifier of the accessor.
     * </p>
     * 
     * @param accessorId
     *        The unique identifier of the accessor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAccessorRequest withAccessorId(String accessorId) {
        setAccessorId(accessorId);
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
        if (getAccessorId() != null)
            sb.append("AccessorId: ").append(getAccessorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAccessorRequest == false)
            return false;
        DeleteAccessorRequest other = (DeleteAccessorRequest) obj;
        if (other.getAccessorId() == null ^ this.getAccessorId() == null)
            return false;
        if (other.getAccessorId() != null && other.getAccessorId().equals(this.getAccessorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessorId() == null) ? 0 : getAccessorId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAccessorRequest clone() {
        return (DeleteAccessorRequest) super.clone();
    }

}
