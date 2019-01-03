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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     */
    private String policyHashCondition;

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when this policy was set.
     */

    public void setPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * 
     * @return The hash value returned when this policy was set.
     */

    public String getPolicyHashCondition() {
        return this.policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * 
     * @param policyHashCondition
     *        The hash value returned when this policy was set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withPolicyHashCondition(String policyHashCondition) {
        setPolicyHashCondition(policyHashCondition);
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
        if (getPolicyHashCondition() != null)
            sb.append("PolicyHashCondition: ").append(getPolicyHashCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;
        if (other.getPolicyHashCondition() == null ^ this.getPolicyHashCondition() == null)
            return false;
        if (other.getPolicyHashCondition() != null && other.getPolicyHashCondition().equals(this.getPolicyHashCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyHashCondition() == null) ? 0 : getPolicyHashCondition().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyRequest clone() {
        return (DeleteResourcePolicyRequest) super.clone();
    }

}
