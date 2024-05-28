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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBShardGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBShardGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Teh name of the DB shard group to delete.
     * </p>
     */
    private String dBShardGroupIdentifier;

    /**
     * <p>
     * Teh name of the DB shard group to delete.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        Teh name of the DB shard group to delete.
     */

    public void setDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        this.dBShardGroupIdentifier = dBShardGroupIdentifier;
    }

    /**
     * <p>
     * Teh name of the DB shard group to delete.
     * </p>
     * 
     * @return Teh name of the DB shard group to delete.
     */

    public String getDBShardGroupIdentifier() {
        return this.dBShardGroupIdentifier;
    }

    /**
     * <p>
     * Teh name of the DB shard group to delete.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        Teh name of the DB shard group to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBShardGroupRequest withDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        setDBShardGroupIdentifier(dBShardGroupIdentifier);
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
        if (getDBShardGroupIdentifier() != null)
            sb.append("DBShardGroupIdentifier: ").append(getDBShardGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBShardGroupRequest == false)
            return false;
        DeleteDBShardGroupRequest other = (DeleteDBShardGroupRequest) obj;
        if (other.getDBShardGroupIdentifier() == null ^ this.getDBShardGroupIdentifier() == null)
            return false;
        if (other.getDBShardGroupIdentifier() != null && other.getDBShardGroupIdentifier().equals(this.getDBShardGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBShardGroupIdentifier() == null) ? 0 : getDBShardGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBShardGroupRequest clone() {
        return (DeleteDBShardGroupRequest) super.clone();
    }

}
