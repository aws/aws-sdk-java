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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response to describe the user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserPoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The container of metadata returned by the server to describe the pool.
     * </p>
     */
    private UserPoolType userPool;

    /**
     * <p>
     * The container of metadata returned by the server to describe the pool.
     * </p>
     * 
     * @param userPool
     *        The container of metadata returned by the server to describe the pool.
     */

    public void setUserPool(UserPoolType userPool) {
        this.userPool = userPool;
    }

    /**
     * <p>
     * The container of metadata returned by the server to describe the pool.
     * </p>
     * 
     * @return The container of metadata returned by the server to describe the pool.
     */

    public UserPoolType getUserPool() {
        return this.userPool;
    }

    /**
     * <p>
     * The container of metadata returned by the server to describe the pool.
     * </p>
     * 
     * @param userPool
     *        The container of metadata returned by the server to describe the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserPoolResult withUserPool(UserPoolType userPool) {
        setUserPool(userPool);
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
        if (getUserPool() != null)
            sb.append("UserPool: ").append(getUserPool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserPoolResult == false)
            return false;
        DescribeUserPoolResult other = (DescribeUserPoolResult) obj;
        if (other.getUserPool() == null ^ this.getUserPool() == null)
            return false;
        if (other.getUserPool() != null && other.getUserPool().equals(this.getUserPool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPool() == null) ? 0 : getUserPool().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserPoolResult clone() {
        try {
            return (DescribeUserPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
