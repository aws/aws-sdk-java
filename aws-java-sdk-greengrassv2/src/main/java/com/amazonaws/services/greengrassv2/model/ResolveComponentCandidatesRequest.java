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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveComponentCandidatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The platform to use to resolve compatible components.
     * </p>
     */
    private ComponentPlatform platform;
    /**
     * <p>
     * The list of components to resolve.
     * </p>
     */
    private java.util.List<ComponentCandidate> componentCandidates;

    /**
     * <p>
     * The platform to use to resolve compatible components.
     * </p>
     * 
     * @param platform
     *        The platform to use to resolve compatible components.
     */

    public void setPlatform(ComponentPlatform platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform to use to resolve compatible components.
     * </p>
     * 
     * @return The platform to use to resolve compatible components.
     */

    public ComponentPlatform getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform to use to resolve compatible components.
     * </p>
     * 
     * @param platform
     *        The platform to use to resolve compatible components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveComponentCandidatesRequest withPlatform(ComponentPlatform platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The list of components to resolve.
     * </p>
     * 
     * @return The list of components to resolve.
     */

    public java.util.List<ComponentCandidate> getComponentCandidates() {
        return componentCandidates;
    }

    /**
     * <p>
     * The list of components to resolve.
     * </p>
     * 
     * @param componentCandidates
     *        The list of components to resolve.
     */

    public void setComponentCandidates(java.util.Collection<ComponentCandidate> componentCandidates) {
        if (componentCandidates == null) {
            this.componentCandidates = null;
            return;
        }

        this.componentCandidates = new java.util.ArrayList<ComponentCandidate>(componentCandidates);
    }

    /**
     * <p>
     * The list of components to resolve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentCandidates(java.util.Collection)} or {@link #withComponentCandidates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param componentCandidates
     *        The list of components to resolve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveComponentCandidatesRequest withComponentCandidates(ComponentCandidate... componentCandidates) {
        if (this.componentCandidates == null) {
            setComponentCandidates(new java.util.ArrayList<ComponentCandidate>(componentCandidates.length));
        }
        for (ComponentCandidate ele : componentCandidates) {
            this.componentCandidates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of components to resolve.
     * </p>
     * 
     * @param componentCandidates
     *        The list of components to resolve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveComponentCandidatesRequest withComponentCandidates(java.util.Collection<ComponentCandidate> componentCandidates) {
        setComponentCandidates(componentCandidates);
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
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getComponentCandidates() != null)
            sb.append("ComponentCandidates: ").append(getComponentCandidates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveComponentCandidatesRequest == false)
            return false;
        ResolveComponentCandidatesRequest other = (ResolveComponentCandidatesRequest) obj;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getComponentCandidates() == null ^ this.getComponentCandidates() == null)
            return false;
        if (other.getComponentCandidates() != null && other.getComponentCandidates().equals(this.getComponentCandidates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getComponentCandidates() == null) ? 0 : getComponentCandidates().hashCode());
        return hashCode;
    }

    @Override
    public ResolveComponentCandidatesRequest clone() {
        return (ResolveComponentCandidatesRequest) super.clone();
    }

}
