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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AccessScopePath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessScopePath implements Serializable, Cloneable {

    /**
     * <p>
     * The source.
     * </p>
     */
    private PathStatement source;
    /**
     * <p>
     * The destination.
     * </p>
     */
    private PathStatement destination;
    /**
     * <p>
     * The through resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ThroughResourcesStatement> throughResources;

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @param source
     *        The source.
     */

    public void setSource(PathStatement source) {
        this.source = source;
    }

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @return The source.
     */

    public PathStatement getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @param source
     *        The source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopePath withSource(PathStatement source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     */

    public void setDestination(PathStatement destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @return The destination.
     */

    public PathStatement getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopePath withDestination(PathStatement destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The through resources.
     * </p>
     * 
     * @return The through resources.
     */

    public java.util.List<ThroughResourcesStatement> getThroughResources() {
        if (throughResources == null) {
            throughResources = new com.amazonaws.internal.SdkInternalList<ThroughResourcesStatement>();
        }
        return throughResources;
    }

    /**
     * <p>
     * The through resources.
     * </p>
     * 
     * @param throughResources
     *        The through resources.
     */

    public void setThroughResources(java.util.Collection<ThroughResourcesStatement> throughResources) {
        if (throughResources == null) {
            this.throughResources = null;
            return;
        }

        this.throughResources = new com.amazonaws.internal.SdkInternalList<ThroughResourcesStatement>(throughResources);
    }

    /**
     * <p>
     * The through resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThroughResources(java.util.Collection)} or {@link #withThroughResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param throughResources
     *        The through resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopePath withThroughResources(ThroughResourcesStatement... throughResources) {
        if (this.throughResources == null) {
            setThroughResources(new com.amazonaws.internal.SdkInternalList<ThroughResourcesStatement>(throughResources.length));
        }
        for (ThroughResourcesStatement ele : throughResources) {
            this.throughResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The through resources.
     * </p>
     * 
     * @param throughResources
     *        The through resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopePath withThroughResources(java.util.Collection<ThroughResourcesStatement> throughResources) {
        setThroughResources(throughResources);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getThroughResources() != null)
            sb.append("ThroughResources: ").append(getThroughResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessScopePath == false)
            return false;
        AccessScopePath other = (AccessScopePath) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getThroughResources() == null ^ this.getThroughResources() == null)
            return false;
        if (other.getThroughResources() != null && other.getThroughResources().equals(this.getThroughResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getThroughResources() == null) ? 0 : getThroughResources().hashCode());
        return hashCode;
    }

    @Override
    public AccessScopePath clone() {
        try {
            return (AccessScopePath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
