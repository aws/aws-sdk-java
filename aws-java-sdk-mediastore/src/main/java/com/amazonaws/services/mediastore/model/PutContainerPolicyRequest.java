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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutContainerPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The contents of the policy, which includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One <code>Version</code> tag
     * </p>
     * </li>
     * <li>
     * <p>
     * One <code>Statement</code> tag that contains the standard tags for the policy.
     * </p>
     * </li>
     * </ul>
     */
    private String policy;

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param containerName
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutContainerPolicyRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The contents of the policy, which includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One <code>Version</code> tag
     * </p>
     * </li>
     * <li>
     * <p>
     * One <code>Statement</code> tag that contains the standard tags for the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param policy
     *        The contents of the policy, which includes the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        One <code>Version</code> tag
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        One <code>Statement</code> tag that contains the standard tags for the policy.
     *        </p>
     *        </li>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The contents of the policy, which includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One <code>Version</code> tag
     * </p>
     * </li>
     * <li>
     * <p>
     * One <code>Statement</code> tag that contains the standard tags for the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The contents of the policy, which includes the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         One <code>Version</code> tag
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         One <code>Statement</code> tag that contains the standard tags for the policy.
     *         </p>
     *         </li>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The contents of the policy, which includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One <code>Version</code> tag
     * </p>
     * </li>
     * <li>
     * <p>
     * One <code>Statement</code> tag that contains the standard tags for the policy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param policy
     *        The contents of the policy, which includes the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        One <code>Version</code> tag
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        One <code>Statement</code> tag that contains the standard tags for the policy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutContainerPolicyRequest withPolicy(String policy) {
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
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

        if (obj instanceof PutContainerPolicyRequest == false)
            return false;
        PutContainerPolicyRequest other = (PutContainerPolicyRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
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

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutContainerPolicyRequest clone() {
        return (PutContainerPolicyRequest) super.clone();
    }

}
