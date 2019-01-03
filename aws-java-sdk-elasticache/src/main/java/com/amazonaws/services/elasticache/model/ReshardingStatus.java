/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of an online resharding operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ReshardingStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReshardingStatus implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     */
    private SlotMigration slotMigration;

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     * 
     * @param slotMigration
     *        Represents the progress of an online resharding operation.
     */

    public void setSlotMigration(SlotMigration slotMigration) {
        this.slotMigration = slotMigration;
    }

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     * 
     * @return Represents the progress of an online resharding operation.
     */

    public SlotMigration getSlotMigration() {
        return this.slotMigration;
    }

    /**
     * <p>
     * Represents the progress of an online resharding operation.
     * </p>
     * 
     * @param slotMigration
     *        Represents the progress of an online resharding operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReshardingStatus withSlotMigration(SlotMigration slotMigration) {
        setSlotMigration(slotMigration);
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
        if (getSlotMigration() != null)
            sb.append("SlotMigration: ").append(getSlotMigration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReshardingStatus == false)
            return false;
        ReshardingStatus other = (ReshardingStatus) obj;
        if (other.getSlotMigration() == null ^ this.getSlotMigration() == null)
            return false;
        if (other.getSlotMigration() != null && other.getSlotMigration().equals(this.getSlotMigration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotMigration() == null) ? 0 : getSlotMigration().hashCode());
        return hashCode;
    }

    @Override
    public ReshardingStatus clone() {
        try {
            return (ReshardingStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
