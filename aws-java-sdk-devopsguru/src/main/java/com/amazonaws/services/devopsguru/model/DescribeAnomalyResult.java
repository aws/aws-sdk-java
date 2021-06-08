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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAnomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnomalyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     */
    private ProactiveAnomaly proactiveAnomaly;
    /**
     * <p>
     * A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     */
    private ReactiveAnomaly reactiveAnomaly;

    /**
     * <p>
     * A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @param proactiveAnomaly
     *        A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     */

    public void setProactiveAnomaly(ProactiveAnomaly proactiveAnomaly) {
        this.proactiveAnomaly = proactiveAnomaly;
    }

    /**
     * <p>
     * A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @return A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     */

    public ProactiveAnomaly getProactiveAnomaly() {
        return this.proactiveAnomaly;
    }

    /**
     * <p>
     * A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @param proactiveAnomaly
     *        A <code>ReactiveAnomaly</code> object that represents the requested anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyResult withProactiveAnomaly(ProactiveAnomaly proactiveAnomaly) {
        setProactiveAnomaly(proactiveAnomaly);
        return this;
    }

    /**
     * <p>
     * A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @param reactiveAnomaly
     *        A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     */

    public void setReactiveAnomaly(ReactiveAnomaly reactiveAnomaly) {
        this.reactiveAnomaly = reactiveAnomaly;
    }

    /**
     * <p>
     * A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @return A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     */

    public ReactiveAnomaly getReactiveAnomaly() {
        return this.reactiveAnomaly;
    }

    /**
     * <p>
     * A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     * </p>
     * 
     * @param reactiveAnomaly
     *        A <code>ProactiveAnomaly</code> object that represents the requested anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyResult withReactiveAnomaly(ReactiveAnomaly reactiveAnomaly) {
        setReactiveAnomaly(reactiveAnomaly);
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
        if (getProactiveAnomaly() != null)
            sb.append("ProactiveAnomaly: ").append(getProactiveAnomaly()).append(",");
        if (getReactiveAnomaly() != null)
            sb.append("ReactiveAnomaly: ").append(getReactiveAnomaly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnomalyResult == false)
            return false;
        DescribeAnomalyResult other = (DescribeAnomalyResult) obj;
        if (other.getProactiveAnomaly() == null ^ this.getProactiveAnomaly() == null)
            return false;
        if (other.getProactiveAnomaly() != null && other.getProactiveAnomaly().equals(this.getProactiveAnomaly()) == false)
            return false;
        if (other.getReactiveAnomaly() == null ^ this.getReactiveAnomaly() == null)
            return false;
        if (other.getReactiveAnomaly() != null && other.getReactiveAnomaly().equals(this.getReactiveAnomaly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProactiveAnomaly() == null) ? 0 : getProactiveAnomaly().hashCode());
        hashCode = prime * hashCode + ((getReactiveAnomaly() == null) ? 0 : getReactiveAnomaly().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnomalyResult clone() {
        try {
            return (DescribeAnomalyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
