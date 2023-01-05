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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeletePool" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for PoolId and
     * PoolArn .
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for PoolId and
     * PoolArn .
     * </p>
     * 
     * @param poolId
     *        The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for
     *        PoolId and PoolArn .
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for PoolId and
     * PoolArn .
     * </p>
     * 
     * @return The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for
     *         PoolId and PoolArn .
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for PoolId and
     * PoolArn .
     * </p>
     * 
     * @param poolId
     *        The PoolId or PoolArn of the pool to delete. You can use <a>DescribePools</a> to find the values for
     *        PoolId and PoolArn .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePoolRequest withPoolId(String poolId) {
        setPoolId(poolId);
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
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePoolRequest == false)
            return false;
        DeletePoolRequest other = (DeletePoolRequest) obj;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePoolRequest clone() {
        return (DeletePoolRequest) super.clone();
    }

}
