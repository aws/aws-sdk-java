/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetResourceSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified resource set.
     * </p>
     */
    private ResourceSet resourceSet;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource set.
     * </p>
     */
    private String resourceSetArn;

    /**
     * <p>
     * Information about the specified resource set.
     * </p>
     * 
     * @param resourceSet
     *        Information about the specified resource set.
     */

    public void setResourceSet(ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    /**
     * <p>
     * Information about the specified resource set.
     * </p>
     * 
     * @return Information about the specified resource set.
     */

    public ResourceSet getResourceSet() {
        return this.resourceSet;
    }

    /**
     * <p>
     * Information about the specified resource set.
     * </p>
     * 
     * @param resourceSet
     *        Information about the specified resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSetResult withResourceSet(ResourceSet resourceSet) {
        setResourceSet(resourceSet);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource set.
     * </p>
     * 
     * @param resourceSetArn
     *        The Amazon Resource Name (ARN) of the resource set.
     */

    public void setResourceSetArn(String resourceSetArn) {
        this.resourceSetArn = resourceSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource set.
     */

    public String getResourceSetArn() {
        return this.resourceSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource set.
     * </p>
     * 
     * @param resourceSetArn
     *        The Amazon Resource Name (ARN) of the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSetResult withResourceSetArn(String resourceSetArn) {
        setResourceSetArn(resourceSetArn);
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
        if (getResourceSet() != null)
            sb.append("ResourceSet: ").append(getResourceSet()).append(",");
        if (getResourceSetArn() != null)
            sb.append("ResourceSetArn: ").append(getResourceSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceSetResult == false)
            return false;
        GetResourceSetResult other = (GetResourceSetResult) obj;
        if (other.getResourceSet() == null ^ this.getResourceSet() == null)
            return false;
        if (other.getResourceSet() != null && other.getResourceSet().equals(this.getResourceSet()) == false)
            return false;
        if (other.getResourceSetArn() == null ^ this.getResourceSetArn() == null)
            return false;
        if (other.getResourceSetArn() != null && other.getResourceSetArn().equals(this.getResourceSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSet() == null) ? 0 : getResourceSet().hashCode());
        hashCode = prime * hashCode + ((getResourceSetArn() == null) ? 0 : getResourceSetArn().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceSetResult clone() {
        try {
            return (GetResourceSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
