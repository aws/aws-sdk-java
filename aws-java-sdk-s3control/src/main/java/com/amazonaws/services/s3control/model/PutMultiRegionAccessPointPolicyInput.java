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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the information associated with a <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
 * >PutMultiRegionAccessPoint</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutMultiRegionAccessPointPolicyInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMultiRegionAccessPointPolicyInput implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with the request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with the request.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point associated with the request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with the request.
     * </p>
     * 
     * @return The name of the Multi-Region Access Point associated with the request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Multi-Region Access Point associated with the request.
     * </p>
     * 
     * @param name
     *        The name of the Multi-Region Access Point associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMultiRegionAccessPointPolicyInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     * </p>
     * 
     * @param policy
     *        The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     * </p>
     * 
     * @return The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     * </p>
     * 
     * @param policy
     *        The policy details for the <code>PutMultiRegionAccessPoint</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMultiRegionAccessPointPolicyInput withPolicy(String policy) {
        setPolicy(policy);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMultiRegionAccessPointPolicyInput == false)
            return false;
        PutMultiRegionAccessPointPolicyInput other = (PutMultiRegionAccessPointPolicyInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutMultiRegionAccessPointPolicyInput clone() {
        try {
            return (PutMultiRegionAccessPointPolicyInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
