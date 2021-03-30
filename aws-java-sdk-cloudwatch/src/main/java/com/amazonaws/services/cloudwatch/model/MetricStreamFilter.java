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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure contains the name of one of the metric namespaces that is listed in a filter of a metric stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricStreamFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the metric namespace in the filter.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the metric namespace in the filter.
     * </p>
     * 
     * @param namespace
     *        The name of the metric namespace in the filter.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The name of the metric namespace in the filter.
     * </p>
     * 
     * @return The name of the metric namespace in the filter.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The name of the metric namespace in the filter.
     * </p>
     * 
     * @param namespace
     *        The name of the metric namespace in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricStreamFilter withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricStreamFilter == false)
            return false;
        MetricStreamFilter other = (MetricStreamFilter) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public MetricStreamFilter clone() {
        try {
            return (MetricStreamFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
