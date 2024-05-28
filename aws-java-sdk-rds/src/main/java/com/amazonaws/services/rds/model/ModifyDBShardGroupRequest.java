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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBShardGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBShardGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB shard group to modify.
     * </p>
     */
    private String dBShardGroupIdentifier;
    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     */
    private Double maxACU;

    /**
     * <p>
     * The name of the DB shard group to modify.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        The name of the DB shard group to modify.
     */

    public void setDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        this.dBShardGroupIdentifier = dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The name of the DB shard group to modify.
     * </p>
     * 
     * @return The name of the DB shard group to modify.
     */

    public String getDBShardGroupIdentifier() {
        return this.dBShardGroupIdentifier;
    }

    /**
     * <p>
     * The name of the DB shard group to modify.
     * </p>
     * 
     * @param dBShardGroupIdentifier
     *        The name of the DB shard group to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBShardGroupRequest withDBShardGroupIdentifier(String dBShardGroupIdentifier) {
        setDBShardGroupIdentifier(dBShardGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @param maxACU
     *        The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     */

    public void setMaxACU(Double maxACU) {
        this.maxACU = maxACU;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @return The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     */

    public Double getMaxACU() {
        return this.maxACU;
    }

    /**
     * <p>
     * The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * </p>
     * 
     * @param maxACU
     *        The maximum capacity of the DB shard group in Aurora capacity units (ACUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBShardGroupRequest withMaxACU(Double maxACU) {
        setMaxACU(maxACU);
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
            sb.append("DBShardGroupIdentifier: ").append(getDBShardGroupIdentifier()).append(",");
        if (getMaxACU() != null)
            sb.append("MaxACU: ").append(getMaxACU());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBShardGroupRequest == false)
            return false;
        ModifyDBShardGroupRequest other = (ModifyDBShardGroupRequest) obj;
        if (other.getDBShardGroupIdentifier() == null ^ this.getDBShardGroupIdentifier() == null)
            return false;
        if (other.getDBShardGroupIdentifier() != null && other.getDBShardGroupIdentifier().equals(this.getDBShardGroupIdentifier()) == false)
            return false;
        if (other.getMaxACU() == null ^ this.getMaxACU() == null)
            return false;
        if (other.getMaxACU() != null && other.getMaxACU().equals(this.getMaxACU()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBShardGroupIdentifier() == null) ? 0 : getDBShardGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxACU() == null) ? 0 : getMaxACU().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBShardGroupRequest clone() {
        return (ModifyDBShardGroupRequest) super.clone();
    }

}
