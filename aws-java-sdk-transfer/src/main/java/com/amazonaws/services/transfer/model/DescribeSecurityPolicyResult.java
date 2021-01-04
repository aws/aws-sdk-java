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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribeSecurityPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the properties of the security policy.
     * </p>
     */
    private DescribedSecurityPolicy securityPolicy;

    /**
     * <p>
     * An array containing the properties of the security policy.
     * </p>
     * 
     * @param securityPolicy
     *        An array containing the properties of the security policy.
     */

    public void setSecurityPolicy(DescribedSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * An array containing the properties of the security policy.
     * </p>
     * 
     * @return An array containing the properties of the security policy.
     */

    public DescribedSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * <p>
     * An array containing the properties of the security policy.
     * </p>
     * 
     * @param securityPolicy
     *        An array containing the properties of the security policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityPolicyResult withSecurityPolicy(DescribedSecurityPolicy securityPolicy) {
        setSecurityPolicy(securityPolicy);
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
        if (getSecurityPolicy() != null)
            sb.append("SecurityPolicy: ").append(getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecurityPolicyResult == false)
            return false;
        DescribeSecurityPolicyResult other = (DescribeSecurityPolicyResult) obj;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityPolicyResult clone() {
        try {
            return (DescribeSecurityPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
