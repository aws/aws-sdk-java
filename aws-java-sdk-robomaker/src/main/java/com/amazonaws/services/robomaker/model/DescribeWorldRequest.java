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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeWorld" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorldRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world you want to describe.
     * </p>
     */
    private String world;

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world you want to describe.
     * </p>
     * 
     * @param world
     *        The Amazon Resource Name (arn) of the world you want to describe.
     */

    public void setWorld(String world) {
        this.world = world;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world you want to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world you want to describe.
     */

    public String getWorld() {
        return this.world;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world you want to describe.
     * </p>
     * 
     * @param world
     *        The Amazon Resource Name (arn) of the world you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorldRequest withWorld(String world) {
        setWorld(world);
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
        if (getWorld() != null)
            sb.append("World: ").append(getWorld());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorldRequest == false)
            return false;
        DescribeWorldRequest other = (DescribeWorldRequest) obj;
        if (other.getWorld() == null ^ this.getWorld() == null)
            return false;
        if (other.getWorld() != null && other.getWorld().equals(this.getWorld()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorld() == null) ? 0 : getWorld().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorldRequest clone() {
        return (DescribeWorldRequest) super.clone();
    }

}
