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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutLifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecyclePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container that you want to assign the object lifecycle policy to.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The object lifecycle policy to apply to the container.
     * </p>
     */
    private String lifecyclePolicy;

    /**
     * <p>
     * The name of the container that you want to assign the object lifecycle policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to assign the object lifecycle policy to.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container that you want to assign the object lifecycle policy to.
     * </p>
     * 
     * @return The name of the container that you want to assign the object lifecycle policy to.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container that you want to assign the object lifecycle policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to assign the object lifecycle policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecyclePolicyRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The object lifecycle policy to apply to the container.
     * </p>
     * 
     * @param lifecyclePolicy
     *        The object lifecycle policy to apply to the container.
     */

    public void setLifecyclePolicy(String lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    /**
     * <p>
     * The object lifecycle policy to apply to the container.
     * </p>
     * 
     * @return The object lifecycle policy to apply to the container.
     */

    public String getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }

    /**
     * <p>
     * The object lifecycle policy to apply to the container.
     * </p>
     * 
     * @param lifecyclePolicy
     *        The object lifecycle policy to apply to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecyclePolicyRequest withLifecyclePolicy(String lifecyclePolicy) {
        setLifecyclePolicy(lifecyclePolicy);
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
        if (getLifecyclePolicy() != null)
            sb.append("LifecyclePolicy: ").append(getLifecyclePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecyclePolicyRequest == false)
            return false;
        PutLifecyclePolicyRequest other = (PutLifecyclePolicyRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getLifecyclePolicy() == null ^ this.getLifecyclePolicy() == null)
            return false;
        if (other.getLifecyclePolicy() != null && other.getLifecyclePolicy().equals(this.getLifecyclePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicy() == null) ? 0 : getLifecyclePolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecyclePolicyRequest clone() {
        return (PutLifecyclePolicyRequest) super.clone();
    }

}
