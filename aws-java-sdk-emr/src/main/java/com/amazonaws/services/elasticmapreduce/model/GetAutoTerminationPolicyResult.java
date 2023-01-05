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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/GetAutoTerminationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoTerminationPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     * </p>
     */
    private AutoTerminationPolicy autoTerminationPolicy;

    /**
     * <p>
     * Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     * </p>
     * 
     * @param autoTerminationPolicy
     *        Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     */

    public void setAutoTerminationPolicy(AutoTerminationPolicy autoTerminationPolicy) {
        this.autoTerminationPolicy = autoTerminationPolicy;
    }

    /**
     * <p>
     * Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     * </p>
     * 
     * @return Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     */

    public AutoTerminationPolicy getAutoTerminationPolicy() {
        return this.autoTerminationPolicy;
    }

    /**
     * <p>
     * Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     * </p>
     * 
     * @param autoTerminationPolicy
     *        Specifies the auto-termination policy that is attached to an Amazon EMR cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoTerminationPolicyResult withAutoTerminationPolicy(AutoTerminationPolicy autoTerminationPolicy) {
        setAutoTerminationPolicy(autoTerminationPolicy);
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
        if (getAutoTerminationPolicy() != null)
            sb.append("AutoTerminationPolicy: ").append(getAutoTerminationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoTerminationPolicyResult == false)
            return false;
        GetAutoTerminationPolicyResult other = (GetAutoTerminationPolicyResult) obj;
        if (other.getAutoTerminationPolicy() == null ^ this.getAutoTerminationPolicy() == null)
            return false;
        if (other.getAutoTerminationPolicy() != null && other.getAutoTerminationPolicy().equals(this.getAutoTerminationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoTerminationPolicy() == null) ? 0 : getAutoTerminationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoTerminationPolicyResult clone() {
        try {
            return (GetAutoTerminationPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
