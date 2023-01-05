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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint you want to get information about. For example,
     * <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The primary Region of the endpoint you want to get information about. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     */
    private String homeRegion;

    /**
     * <p>
     * The name of the endpoint you want to get information about. For example,
     * <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you want to get information about. For example,
     *        <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint you want to get information about. For example,
     * <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @return The name of the endpoint you want to get information about. For example,
     *         <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint you want to get information about. For example,
     * <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you want to get information about. For example,
     *        <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The primary Region of the endpoint you want to get information about. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @param homeRegion
     *        The primary Region of the endpoint you want to get information about. For example
     *        <code>"HomeRegion": "us-east-1"</code>.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The primary Region of the endpoint you want to get information about. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @return The primary Region of the endpoint you want to get information about. For example
     *         <code>"HomeRegion": "us-east-1"</code>.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The primary Region of the endpoint you want to get information about. For example
     * <code>"HomeRegion": "us-east-1"</code>.
     * </p>
     * 
     * @param homeRegion
     *        The primary Region of the endpoint you want to get information about. For example
     *        <code>"HomeRegion": "us-east-1"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointRequest withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointRequest == false)
            return false;
        DescribeEndpointRequest other = (DescribeEndpointRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointRequest clone() {
        return (DescribeEndpointRequest) super.clone();
    }

}
