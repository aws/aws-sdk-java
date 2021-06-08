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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     */
    private String securityPolicyName;

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @return Specifies the name of the security policy that is attached to the server.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityPolicyRequest withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
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
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityPolicyRequest == false)
            return false;
        DescribeSecurityPolicyRequest other = (DescribeSecurityPolicyRequest) obj;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityPolicyRequest clone() {
        return (DescribeSecurityPolicyRequest) super.clone();
    }

}
