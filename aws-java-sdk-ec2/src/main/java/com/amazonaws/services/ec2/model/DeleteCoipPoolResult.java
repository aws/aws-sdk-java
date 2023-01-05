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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCoipPoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the CoIP address pool.
     * </p>
     */
    private CoipPool coipPool;

    /**
     * <p>
     * Information about the CoIP address pool.
     * </p>
     * 
     * @param coipPool
     *        Information about the CoIP address pool.
     */

    public void setCoipPool(CoipPool coipPool) {
        this.coipPool = coipPool;
    }

    /**
     * <p>
     * Information about the CoIP address pool.
     * </p>
     * 
     * @return Information about the CoIP address pool.
     */

    public CoipPool getCoipPool() {
        return this.coipPool;
    }

    /**
     * <p>
     * Information about the CoIP address pool.
     * </p>
     * 
     * @param coipPool
     *        Information about the CoIP address pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoipPoolResult withCoipPool(CoipPool coipPool) {
        setCoipPool(coipPool);
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
        if (getCoipPool() != null)
            sb.append("CoipPool: ").append(getCoipPool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCoipPoolResult == false)
            return false;
        DeleteCoipPoolResult other = (DeleteCoipPoolResult) obj;
        if (other.getCoipPool() == null ^ this.getCoipPool() == null)
            return false;
        if (other.getCoipPool() != null && other.getCoipPool().equals(this.getCoipPool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPool() == null) ? 0 : getCoipPool().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCoipPoolResult clone() {
        try {
            return (DeleteCoipPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
