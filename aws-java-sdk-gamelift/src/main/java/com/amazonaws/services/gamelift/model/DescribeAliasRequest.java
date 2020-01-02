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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN
     * value.
     * </p>
     */
    private String aliasId;

    /**
     * <p>
     * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN
     * value.
     * </p>
     * 
     * @param aliasId
     *        The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or
     *        ARN value.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN
     * value.
     * </p>
     * 
     * @return The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or
     *         ARN value.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN
     * value.
     * </p>
     * 
     * @param aliasId
     *        The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or
     *        ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAliasRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
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
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAliasRequest == false)
            return false;
        DescribeAliasRequest other = (DescribeAliasRequest) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAliasRequest clone() {
        return (DescribeAliasRequest) super.clone();
    }

}
