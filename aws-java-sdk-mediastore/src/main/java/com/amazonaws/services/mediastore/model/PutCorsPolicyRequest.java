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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutCorsPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCorsPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container that you want to assign the CORS policy to.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The CORS policy to apply to the container.
     * </p>
     */
    private java.util.List<CorsRule> corsPolicy;

    /**
     * <p>
     * The name of the container that you want to assign the CORS policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to assign the CORS policy to.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container that you want to assign the CORS policy to.
     * </p>
     * 
     * @return The name of the container that you want to assign the CORS policy to.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container that you want to assign the CORS policy to.
     * </p>
     * 
     * @param containerName
     *        The name of the container that you want to assign the CORS policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCorsPolicyRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The CORS policy to apply to the container.
     * </p>
     * 
     * @return The CORS policy to apply to the container.
     */

    public java.util.List<CorsRule> getCorsPolicy() {
        return corsPolicy;
    }

    /**
     * <p>
     * The CORS policy to apply to the container.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy to apply to the container.
     */

    public void setCorsPolicy(java.util.Collection<CorsRule> corsPolicy) {
        if (corsPolicy == null) {
            this.corsPolicy = null;
            return;
        }

        this.corsPolicy = new java.util.ArrayList<CorsRule>(corsPolicy);
    }

    /**
     * <p>
     * The CORS policy to apply to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCorsPolicy(java.util.Collection)} or {@link #withCorsPolicy(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy to apply to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCorsPolicyRequest withCorsPolicy(CorsRule... corsPolicy) {
        if (this.corsPolicy == null) {
            setCorsPolicy(new java.util.ArrayList<CorsRule>(corsPolicy.length));
        }
        for (CorsRule ele : corsPolicy) {
            this.corsPolicy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CORS policy to apply to the container.
     * </p>
     * 
     * @param corsPolicy
     *        The CORS policy to apply to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCorsPolicyRequest withCorsPolicy(java.util.Collection<CorsRule> corsPolicy) {
        setCorsPolicy(corsPolicy);
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
        if (getCorsPolicy() != null)
            sb.append("CorsPolicy: ").append(getCorsPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutCorsPolicyRequest == false)
            return false;
        PutCorsPolicyRequest other = (PutCorsPolicyRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getCorsPolicy() == null ^ this.getCorsPolicy() == null)
            return false;
        if (other.getCorsPolicy() != null && other.getCorsPolicy().equals(this.getCorsPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getCorsPolicy() == null) ? 0 : getCorsPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutCorsPolicyRequest clone() {
        return (PutCorsPolicyRequest) super.clone();
    }

}
