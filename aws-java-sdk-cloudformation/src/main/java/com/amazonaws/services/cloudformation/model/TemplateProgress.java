/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A summary of the progress of the template generation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TemplateProgress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateProgress implements Serializable, Cloneable {

    /**
     * <p>
     * The number of resources that succeeded the template generation.
     * </p>
     */
    private Integer resourcesSucceeded;
    /**
     * <p>
     * The number of resources that failed the template generation.
     * </p>
     */
    private Integer resourcesFailed;
    /**
     * <p>
     * The number of resources that are in-process for the template generation.
     * </p>
     */
    private Integer resourcesProcessing;
    /**
     * <p>
     * The number of resources that are still pending the template generation.
     * </p>
     */
    private Integer resourcesPending;

    /**
     * <p>
     * The number of resources that succeeded the template generation.
     * </p>
     * 
     * @param resourcesSucceeded
     *        The number of resources that succeeded the template generation.
     */

    public void setResourcesSucceeded(Integer resourcesSucceeded) {
        this.resourcesSucceeded = resourcesSucceeded;
    }

    /**
     * <p>
     * The number of resources that succeeded the template generation.
     * </p>
     * 
     * @return The number of resources that succeeded the template generation.
     */

    public Integer getResourcesSucceeded() {
        return this.resourcesSucceeded;
    }

    /**
     * <p>
     * The number of resources that succeeded the template generation.
     * </p>
     * 
     * @param resourcesSucceeded
     *        The number of resources that succeeded the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateProgress withResourcesSucceeded(Integer resourcesSucceeded) {
        setResourcesSucceeded(resourcesSucceeded);
        return this;
    }

    /**
     * <p>
     * The number of resources that failed the template generation.
     * </p>
     * 
     * @param resourcesFailed
     *        The number of resources that failed the template generation.
     */

    public void setResourcesFailed(Integer resourcesFailed) {
        this.resourcesFailed = resourcesFailed;
    }

    /**
     * <p>
     * The number of resources that failed the template generation.
     * </p>
     * 
     * @return The number of resources that failed the template generation.
     */

    public Integer getResourcesFailed() {
        return this.resourcesFailed;
    }

    /**
     * <p>
     * The number of resources that failed the template generation.
     * </p>
     * 
     * @param resourcesFailed
     *        The number of resources that failed the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateProgress withResourcesFailed(Integer resourcesFailed) {
        setResourcesFailed(resourcesFailed);
        return this;
    }

    /**
     * <p>
     * The number of resources that are in-process for the template generation.
     * </p>
     * 
     * @param resourcesProcessing
     *        The number of resources that are in-process for the template generation.
     */

    public void setResourcesProcessing(Integer resourcesProcessing) {
        this.resourcesProcessing = resourcesProcessing;
    }

    /**
     * <p>
     * The number of resources that are in-process for the template generation.
     * </p>
     * 
     * @return The number of resources that are in-process for the template generation.
     */

    public Integer getResourcesProcessing() {
        return this.resourcesProcessing;
    }

    /**
     * <p>
     * The number of resources that are in-process for the template generation.
     * </p>
     * 
     * @param resourcesProcessing
     *        The number of resources that are in-process for the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateProgress withResourcesProcessing(Integer resourcesProcessing) {
        setResourcesProcessing(resourcesProcessing);
        return this;
    }

    /**
     * <p>
     * The number of resources that are still pending the template generation.
     * </p>
     * 
     * @param resourcesPending
     *        The number of resources that are still pending the template generation.
     */

    public void setResourcesPending(Integer resourcesPending) {
        this.resourcesPending = resourcesPending;
    }

    /**
     * <p>
     * The number of resources that are still pending the template generation.
     * </p>
     * 
     * @return The number of resources that are still pending the template generation.
     */

    public Integer getResourcesPending() {
        return this.resourcesPending;
    }

    /**
     * <p>
     * The number of resources that are still pending the template generation.
     * </p>
     * 
     * @param resourcesPending
     *        The number of resources that are still pending the template generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateProgress withResourcesPending(Integer resourcesPending) {
        setResourcesPending(resourcesPending);
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
        if (getResourcesSucceeded() != null)
            sb.append("ResourcesSucceeded: ").append(getResourcesSucceeded()).append(",");
        if (getResourcesFailed() != null)
            sb.append("ResourcesFailed: ").append(getResourcesFailed()).append(",");
        if (getResourcesProcessing() != null)
            sb.append("ResourcesProcessing: ").append(getResourcesProcessing()).append(",");
        if (getResourcesPending() != null)
            sb.append("ResourcesPending: ").append(getResourcesPending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateProgress == false)
            return false;
        TemplateProgress other = (TemplateProgress) obj;
        if (other.getResourcesSucceeded() == null ^ this.getResourcesSucceeded() == null)
            return false;
        if (other.getResourcesSucceeded() != null && other.getResourcesSucceeded().equals(this.getResourcesSucceeded()) == false)
            return false;
        if (other.getResourcesFailed() == null ^ this.getResourcesFailed() == null)
            return false;
        if (other.getResourcesFailed() != null && other.getResourcesFailed().equals(this.getResourcesFailed()) == false)
            return false;
        if (other.getResourcesProcessing() == null ^ this.getResourcesProcessing() == null)
            return false;
        if (other.getResourcesProcessing() != null && other.getResourcesProcessing().equals(this.getResourcesProcessing()) == false)
            return false;
        if (other.getResourcesPending() == null ^ this.getResourcesPending() == null)
            return false;
        if (other.getResourcesPending() != null && other.getResourcesPending().equals(this.getResourcesPending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcesSucceeded() == null) ? 0 : getResourcesSucceeded().hashCode());
        hashCode = prime * hashCode + ((getResourcesFailed() == null) ? 0 : getResourcesFailed().hashCode());
        hashCode = prime * hashCode + ((getResourcesProcessing() == null) ? 0 : getResourcesProcessing().hashCode());
        hashCode = prime * hashCode + ((getResourcesPending() == null) ? 0 : getResourcesPending().hashCode());
        return hashCode;
    }

    @Override
    public TemplateProgress clone() {
        try {
            return (TemplateProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
