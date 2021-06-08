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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ResolveComponentCandidates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveComponentCandidatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of components that meet the requirements that you specify in the request. This list includes each
     * component's recipe that you can use to install the component.
     * </p>
     */
    private java.util.List<ResolvedComponentVersion> resolvedComponentVersions;

    /**
     * <p>
     * A list of components that meet the requirements that you specify in the request. This list includes each
     * component's recipe that you can use to install the component.
     * </p>
     * 
     * @return A list of components that meet the requirements that you specify in the request. This list includes each
     *         component's recipe that you can use to install the component.
     */

    public java.util.List<ResolvedComponentVersion> getResolvedComponentVersions() {
        return resolvedComponentVersions;
    }

    /**
     * <p>
     * A list of components that meet the requirements that you specify in the request. This list includes each
     * component's recipe that you can use to install the component.
     * </p>
     * 
     * @param resolvedComponentVersions
     *        A list of components that meet the requirements that you specify in the request. This list includes each
     *        component's recipe that you can use to install the component.
     */

    public void setResolvedComponentVersions(java.util.Collection<ResolvedComponentVersion> resolvedComponentVersions) {
        if (resolvedComponentVersions == null) {
            this.resolvedComponentVersions = null;
            return;
        }

        this.resolvedComponentVersions = new java.util.ArrayList<ResolvedComponentVersion>(resolvedComponentVersions);
    }

    /**
     * <p>
     * A list of components that meet the requirements that you specify in the request. This list includes each
     * component's recipe that you can use to install the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResolvedComponentVersions(java.util.Collection)} or
     * {@link #withResolvedComponentVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resolvedComponentVersions
     *        A list of components that meet the requirements that you specify in the request. This list includes each
     *        component's recipe that you can use to install the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveComponentCandidatesResult withResolvedComponentVersions(ResolvedComponentVersion... resolvedComponentVersions) {
        if (this.resolvedComponentVersions == null) {
            setResolvedComponentVersions(new java.util.ArrayList<ResolvedComponentVersion>(resolvedComponentVersions.length));
        }
        for (ResolvedComponentVersion ele : resolvedComponentVersions) {
            this.resolvedComponentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of components that meet the requirements that you specify in the request. This list includes each
     * component's recipe that you can use to install the component.
     * </p>
     * 
     * @param resolvedComponentVersions
     *        A list of components that meet the requirements that you specify in the request. This list includes each
     *        component's recipe that you can use to install the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveComponentCandidatesResult withResolvedComponentVersions(java.util.Collection<ResolvedComponentVersion> resolvedComponentVersions) {
        setResolvedComponentVersions(resolvedComponentVersions);
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
        if (getResolvedComponentVersions() != null)
            sb.append("ResolvedComponentVersions: ").append(getResolvedComponentVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveComponentCandidatesResult == false)
            return false;
        ResolveComponentCandidatesResult other = (ResolveComponentCandidatesResult) obj;
        if (other.getResolvedComponentVersions() == null ^ this.getResolvedComponentVersions() == null)
            return false;
        if (other.getResolvedComponentVersions() != null && other.getResolvedComponentVersions().equals(this.getResolvedComponentVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResolvedComponentVersions() == null) ? 0 : getResolvedComponentVersions().hashCode());
        return hashCode;
    }

    @Override
    public ResolveComponentCandidatesResult clone() {
        try {
            return (ResolveComponentCandidatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
