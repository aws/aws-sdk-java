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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The following element is returned by the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetDedicatedIpPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDedicatedIpPoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about a dedicated IP pool.
     * </p>
     */
    private DedicatedIpPool dedicatedIpPool;

    /**
     * <p>
     * An object that contains information about a dedicated IP pool.
     * </p>
     * 
     * @param dedicatedIpPool
     *        An object that contains information about a dedicated IP pool.
     */

    public void setDedicatedIpPool(DedicatedIpPool dedicatedIpPool) {
        this.dedicatedIpPool = dedicatedIpPool;
    }

    /**
     * <p>
     * An object that contains information about a dedicated IP pool.
     * </p>
     * 
     * @return An object that contains information about a dedicated IP pool.
     */

    public DedicatedIpPool getDedicatedIpPool() {
        return this.dedicatedIpPool;
    }

    /**
     * <p>
     * An object that contains information about a dedicated IP pool.
     * </p>
     * 
     * @param dedicatedIpPool
     *        An object that contains information about a dedicated IP pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDedicatedIpPoolResult withDedicatedIpPool(DedicatedIpPool dedicatedIpPool) {
        setDedicatedIpPool(dedicatedIpPool);
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
        if (getDedicatedIpPool() != null)
            sb.append("DedicatedIpPool: ").append(getDedicatedIpPool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDedicatedIpPoolResult == false)
            return false;
        GetDedicatedIpPoolResult other = (GetDedicatedIpPoolResult) obj;
        if (other.getDedicatedIpPool() == null ^ this.getDedicatedIpPool() == null)
            return false;
        if (other.getDedicatedIpPool() != null && other.getDedicatedIpPool().equals(this.getDedicatedIpPool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDedicatedIpPool() == null) ? 0 : getDedicatedIpPool().hashCode());
        return hashCode;
    }

    @Override
    public GetDedicatedIpPoolResult clone() {
        try {
            return (GetDedicatedIpPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
