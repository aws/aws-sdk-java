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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteResourceSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourceSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of a resource set.
     * </p>
     */
    private String resourceSetName;

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @param resourceSetName
     *        Name of a resource set.
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @return Name of a resource set.
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @param resourceSetName
     *        Name of a resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourceSetRequest withResourceSetName(String resourceSetName) {
        setResourceSetName(resourceSetName);
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
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourceSetRequest == false)
            return false;
        DeleteResourceSetRequest other = (DeleteResourceSetRequest) obj;
        if (other.getResourceSetName() == null ^ this.getResourceSetName() == null)
            return false;
        if (other.getResourceSetName() != null && other.getResourceSetName().equals(this.getResourceSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourceSetRequest clone() {
        return (DeleteResourceSetRequest) super.clone();
    }

}
