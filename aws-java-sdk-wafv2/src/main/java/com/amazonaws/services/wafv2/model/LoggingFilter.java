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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filtering that specifies which web requests are kept in the logs and which are dropped, defined for a web ACL's
 * <a>LoggingConfiguration</a>.
 * </p>
 * <p>
 * You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL
 * evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/LoggingFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filters that you want to apply to the logs.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Default handling for logs that don't match any of the specified filtering conditions.
     * </p>
     */
    private String defaultBehavior;

    /**
     * <p>
     * The filters that you want to apply to the logs.
     * </p>
     * 
     * @return The filters that you want to apply to the logs.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters that you want to apply to the logs.
     * </p>
     * 
     * @param filters
     *        The filters that you want to apply to the logs.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters that you want to apply to the logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters that you want to apply to the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingFilter withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters that you want to apply to the logs.
     * </p>
     * 
     * @param filters
     *        The filters that you want to apply to the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingFilter withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Default handling for logs that don't match any of the specified filtering conditions.
     * </p>
     * 
     * @param defaultBehavior
     *        Default handling for logs that don't match any of the specified filtering conditions.
     * @see FilterBehavior
     */

    public void setDefaultBehavior(String defaultBehavior) {
        this.defaultBehavior = defaultBehavior;
    }

    /**
     * <p>
     * Default handling for logs that don't match any of the specified filtering conditions.
     * </p>
     * 
     * @return Default handling for logs that don't match any of the specified filtering conditions.
     * @see FilterBehavior
     */

    public String getDefaultBehavior() {
        return this.defaultBehavior;
    }

    /**
     * <p>
     * Default handling for logs that don't match any of the specified filtering conditions.
     * </p>
     * 
     * @param defaultBehavior
     *        Default handling for logs that don't match any of the specified filtering conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterBehavior
     */

    public LoggingFilter withDefaultBehavior(String defaultBehavior) {
        setDefaultBehavior(defaultBehavior);
        return this;
    }

    /**
     * <p>
     * Default handling for logs that don't match any of the specified filtering conditions.
     * </p>
     * 
     * @param defaultBehavior
     *        Default handling for logs that don't match any of the specified filtering conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterBehavior
     */

    public LoggingFilter withDefaultBehavior(FilterBehavior defaultBehavior) {
        this.defaultBehavior = defaultBehavior.toString();
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getDefaultBehavior() != null)
            sb.append("DefaultBehavior: ").append(getDefaultBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingFilter == false)
            return false;
        LoggingFilter other = (LoggingFilter) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getDefaultBehavior() == null ^ this.getDefaultBehavior() == null)
            return false;
        if (other.getDefaultBehavior() != null && other.getDefaultBehavior().equals(this.getDefaultBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getDefaultBehavior() == null) ? 0 : getDefaultBehavior().hashCode());
        return hashCode;
    }

    @Override
    public LoggingFilter clone() {
        try {
            return (LoggingFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.LoggingFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
