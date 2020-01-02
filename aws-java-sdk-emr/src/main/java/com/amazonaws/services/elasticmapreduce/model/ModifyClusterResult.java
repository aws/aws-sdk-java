/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of steps that can be executed concurrently.
     * </p>
     */
    private Integer stepConcurrencyLevel;

    /**
     * <p>
     * The number of steps that can be executed concurrently.
     * </p>
     * 
     * @param stepConcurrencyLevel
     *        The number of steps that can be executed concurrently.
     */

    public void setStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently.
     * </p>
     * 
     * @return The number of steps that can be executed concurrently.
     */

    public Integer getStepConcurrencyLevel() {
        return this.stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently.
     * </p>
     * 
     * @param stepConcurrencyLevel
     *        The number of steps that can be executed concurrently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterResult withStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        setStepConcurrencyLevel(stepConcurrencyLevel);
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
        if (getStepConcurrencyLevel() != null)
            sb.append("StepConcurrencyLevel: ").append(getStepConcurrencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterResult == false)
            return false;
        ModifyClusterResult other = (ModifyClusterResult) obj;
        if (other.getStepConcurrencyLevel() == null ^ this.getStepConcurrencyLevel() == null)
            return false;
        if (other.getStepConcurrencyLevel() != null && other.getStepConcurrencyLevel().equals(this.getStepConcurrencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepConcurrencyLevel() == null) ? 0 : getStepConcurrencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterResult clone() {
        try {
            return (ModifyClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
