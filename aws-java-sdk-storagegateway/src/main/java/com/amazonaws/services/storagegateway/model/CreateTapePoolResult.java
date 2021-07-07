/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CreateTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTapePoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     * operation to return a list of tape pools for your account and Region.
     * </p>
     */
    private String poolARN;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     * operation to return a list of tape pools for your account and Region.
     * </p>
     * 
     * @param poolARN
     *        The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     *        operation to return a list of tape pools for your account and Region.
     */

    public void setPoolARN(String poolARN) {
        this.poolARN = poolARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     * operation to return a list of tape pools for your account and Region.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     *         operation to return a list of tape pools for your account and Region.
     */

    public String getPoolARN() {
        return this.poolARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     * operation to return a list of tape pools for your account and Region.
     * </p>
     * 
     * @param poolARN
     *        The unique Amazon Resource Name (ARN) that represents the custom tape pool. Use the <a>ListTapePools</a>
     *        operation to return a list of tape pools for your account and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTapePoolResult withPoolARN(String poolARN) {
        setPoolARN(poolARN);
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
        if (getPoolARN() != null)
            sb.append("PoolARN: ").append(getPoolARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapePoolResult == false)
            return false;
        CreateTapePoolResult other = (CreateTapePoolResult) obj;
        if (other.getPoolARN() == null ^ this.getPoolARN() == null)
            return false;
        if (other.getPoolARN() != null && other.getPoolARN().equals(this.getPoolARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolARN() == null) ? 0 : getPoolARN().hashCode());
        return hashCode;
    }

    @Override
    public CreateTapePoolResult clone() {
        try {
            return (CreateTapePoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
