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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/EnableTagPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableTagPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     */
    private String rootId;

    /**
     * <p>
     * The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @param rootId
     *        The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations
     *        <a href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a>
     *        API to find it.
     */

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @return The root identifier of the organization. If you don't know the root ID, you can call the AWS
     *         Organizations <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API
     *         to find it.
     */

    public String getRootId() {
        return this.rootId;
    }

    /**
     * <p>
     * The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @param rootId
     *        The root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations
     *        <a href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a>
     *        API to find it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableTagPoliciesRequest withRootId(String rootId) {
        setRootId(rootId);
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
        if (getRootId() != null)
            sb.append("RootId: ").append(getRootId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableTagPoliciesRequest == false)
            return false;
        EnableTagPoliciesRequest other = (EnableTagPoliciesRequest) obj;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        return hashCode;
    }

    @Override
    public EnableTagPoliciesRequest clone() {
        return (EnableTagPoliciesRequest) super.clone();
    }

}
