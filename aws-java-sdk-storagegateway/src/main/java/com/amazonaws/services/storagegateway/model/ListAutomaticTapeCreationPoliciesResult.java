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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/ListAutomaticTapeCreationPolicies"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAutomaticTapeCreationPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape
     * creation rules and the gateway that is using the policies.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos;

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape
     * creation rules and the gateway that is using the policies.
     * </p>
     * 
     * @return Gets a listing of information about the gateway's automatic tape creation policies, including the
     *         automatic tape creation rules and the gateway that is using the policies.
     */

    public java.util.List<AutomaticTapeCreationPolicyInfo> getAutomaticTapeCreationPolicyInfos() {
        if (automaticTapeCreationPolicyInfos == null) {
            automaticTapeCreationPolicyInfos = new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationPolicyInfo>();
        }
        return automaticTapeCreationPolicyInfos;
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape
     * creation rules and the gateway that is using the policies.
     * </p>
     * 
     * @param automaticTapeCreationPolicyInfos
     *        Gets a listing of information about the gateway's automatic tape creation policies, including the
     *        automatic tape creation rules and the gateway that is using the policies.
     */

    public void setAutomaticTapeCreationPolicyInfos(java.util.Collection<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos) {
        if (automaticTapeCreationPolicyInfos == null) {
            this.automaticTapeCreationPolicyInfos = null;
            return;
        }

        this.automaticTapeCreationPolicyInfos = new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationPolicyInfo>(automaticTapeCreationPolicyInfos);
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape
     * creation rules and the gateway that is using the policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomaticTapeCreationPolicyInfos(java.util.Collection)} or
     * {@link #withAutomaticTapeCreationPolicyInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param automaticTapeCreationPolicyInfos
     *        Gets a listing of information about the gateway's automatic tape creation policies, including the
     *        automatic tape creation rules and the gateway that is using the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutomaticTapeCreationPoliciesResult withAutomaticTapeCreationPolicyInfos(AutomaticTapeCreationPolicyInfo... automaticTapeCreationPolicyInfos) {
        if (this.automaticTapeCreationPolicyInfos == null) {
            setAutomaticTapeCreationPolicyInfos(new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationPolicyInfo>(
                    automaticTapeCreationPolicyInfos.length));
        }
        for (AutomaticTapeCreationPolicyInfo ele : automaticTapeCreationPolicyInfos) {
            this.automaticTapeCreationPolicyInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Gets a listing of information about the gateway's automatic tape creation policies, including the automatic tape
     * creation rules and the gateway that is using the policies.
     * </p>
     * 
     * @param automaticTapeCreationPolicyInfos
     *        Gets a listing of information about the gateway's automatic tape creation policies, including the
     *        automatic tape creation rules and the gateway that is using the policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutomaticTapeCreationPoliciesResult withAutomaticTapeCreationPolicyInfos(
            java.util.Collection<AutomaticTapeCreationPolicyInfo> automaticTapeCreationPolicyInfos) {
        setAutomaticTapeCreationPolicyInfos(automaticTapeCreationPolicyInfos);
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
        if (getAutomaticTapeCreationPolicyInfos() != null)
            sb.append("AutomaticTapeCreationPolicyInfos: ").append(getAutomaticTapeCreationPolicyInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutomaticTapeCreationPoliciesResult == false)
            return false;
        ListAutomaticTapeCreationPoliciesResult other = (ListAutomaticTapeCreationPoliciesResult) obj;
        if (other.getAutomaticTapeCreationPolicyInfos() == null ^ this.getAutomaticTapeCreationPolicyInfos() == null)
            return false;
        if (other.getAutomaticTapeCreationPolicyInfos() != null
                && other.getAutomaticTapeCreationPolicyInfos().equals(this.getAutomaticTapeCreationPolicyInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticTapeCreationPolicyInfos() == null) ? 0 : getAutomaticTapeCreationPolicyInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListAutomaticTapeCreationPoliciesResult clone() {
        try {
            return (ListAutomaticTapeCreationPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
