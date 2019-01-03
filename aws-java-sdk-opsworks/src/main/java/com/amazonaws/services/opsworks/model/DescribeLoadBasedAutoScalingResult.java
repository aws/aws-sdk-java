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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeLoadBasedAutoScaling</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLoadBasedAutoScaling"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBasedAutoScalingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations;

    /**
     * <p>
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's configuration.
     * </p>
     * 
     * @return An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's
     *         configuration.
     */

    public java.util.List<LoadBasedAutoScalingConfiguration> getLoadBasedAutoScalingConfigurations() {
        if (loadBasedAutoScalingConfigurations == null) {
            loadBasedAutoScalingConfigurations = new com.amazonaws.internal.SdkInternalList<LoadBasedAutoScalingConfiguration>();
        }
        return loadBasedAutoScalingConfigurations;
    }

    /**
     * <p>
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's configuration.
     * </p>
     * 
     * @param loadBasedAutoScalingConfigurations
     *        An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's
     *        configuration.
     */

    public void setLoadBasedAutoScalingConfigurations(java.util.Collection<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations) {
        if (loadBasedAutoScalingConfigurations == null) {
            this.loadBasedAutoScalingConfigurations = null;
            return;
        }

        this.loadBasedAutoScalingConfigurations = new com.amazonaws.internal.SdkInternalList<LoadBasedAutoScalingConfiguration>(
                loadBasedAutoScalingConfigurations);
    }

    /**
     * <p>
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBasedAutoScalingConfigurations(java.util.Collection)} or
     * {@link #withLoadBasedAutoScalingConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param loadBasedAutoScalingConfigurations
     *        An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBasedAutoScalingResult withLoadBasedAutoScalingConfigurations(LoadBasedAutoScalingConfiguration... loadBasedAutoScalingConfigurations) {
        if (this.loadBasedAutoScalingConfigurations == null) {
            setLoadBasedAutoScalingConfigurations(new com.amazonaws.internal.SdkInternalList<LoadBasedAutoScalingConfiguration>(
                    loadBasedAutoScalingConfigurations.length));
        }
        for (LoadBasedAutoScalingConfiguration ele : loadBasedAutoScalingConfigurations) {
            this.loadBasedAutoScalingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's configuration.
     * </p>
     * 
     * @param loadBasedAutoScalingConfigurations
     *        An array of <code>LoadBasedAutoScalingConfiguration</code> objects that describe each layer's
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLoadBasedAutoScalingResult withLoadBasedAutoScalingConfigurations(
            java.util.Collection<LoadBasedAutoScalingConfiguration> loadBasedAutoScalingConfigurations) {
        setLoadBasedAutoScalingConfigurations(loadBasedAutoScalingConfigurations);
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
        if (getLoadBasedAutoScalingConfigurations() != null)
            sb.append("LoadBasedAutoScalingConfigurations: ").append(getLoadBasedAutoScalingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLoadBasedAutoScalingResult == false)
            return false;
        DescribeLoadBasedAutoScalingResult other = (DescribeLoadBasedAutoScalingResult) obj;
        if (other.getLoadBasedAutoScalingConfigurations() == null ^ this.getLoadBasedAutoScalingConfigurations() == null)
            return false;
        if (other.getLoadBasedAutoScalingConfigurations() != null
                && other.getLoadBasedAutoScalingConfigurations().equals(this.getLoadBasedAutoScalingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBasedAutoScalingConfigurations() == null) ? 0 : getLoadBasedAutoScalingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLoadBasedAutoScalingResult clone() {
        try {
            return (DescribeLoadBasedAutoScalingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
