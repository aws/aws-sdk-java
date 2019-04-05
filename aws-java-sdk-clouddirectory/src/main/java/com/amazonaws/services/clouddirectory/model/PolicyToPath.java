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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used when a regular object exists in a <a>Directory</a> and you want to find all of the policies that are associated
 * with that object and the parent to that object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PolicyToPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyToPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path that is referenced from the root.
     * </p>
     */
    private String path;
    /**
     * <p>
     * List of policy objects.
     * </p>
     */
    private java.util.List<PolicyAttachment> policies;

    /**
     * <p>
     * The path that is referenced from the root.
     * </p>
     * 
     * @param path
     *        The path that is referenced from the root.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path that is referenced from the root.
     * </p>
     * 
     * @return The path that is referenced from the root.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path that is referenced from the root.
     * </p>
     * 
     * @param path
     *        The path that is referenced from the root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyToPath withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * List of policy objects.
     * </p>
     * 
     * @return List of policy objects.
     */

    public java.util.List<PolicyAttachment> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * List of policy objects.
     * </p>
     * 
     * @param policies
     *        List of policy objects.
     */

    public void setPolicies(java.util.Collection<PolicyAttachment> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<PolicyAttachment>(policies);
    }

    /**
     * <p>
     * List of policy objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        List of policy objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyToPath withPolicies(PolicyAttachment... policies) {
        if (this.policies == null) {
            setPolicies(new java.util.ArrayList<PolicyAttachment>(policies.length));
        }
        for (PolicyAttachment ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of policy objects.
     * </p>
     * 
     * @param policies
     *        List of policy objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyToPath withPolicies(java.util.Collection<PolicyAttachment> policies) {
        setPolicies(policies);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyToPath == false)
            return false;
        PolicyToPath other = (PolicyToPath) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public PolicyToPath clone() {
        try {
            return (PolicyToPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.PolicyToPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
