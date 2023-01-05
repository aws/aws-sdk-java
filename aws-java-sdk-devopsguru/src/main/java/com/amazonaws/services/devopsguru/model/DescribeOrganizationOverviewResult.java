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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeOrganizationOverview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationOverviewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     */
    private Integer reactiveInsights;
    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     */
    private Integer proactiveInsights;

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param reactiveInsights
     *        An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     */

    public void setReactiveInsights(Integer reactiveInsights) {
        this.reactiveInsights = reactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @return An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     */

    public Integer getReactiveInsights() {
        return this.reactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param reactiveInsights
     *        An integer that specifies the number of open reactive insights in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationOverviewResult withReactiveInsights(Integer reactiveInsights) {
        setReactiveInsights(reactiveInsights);
        return this;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param proactiveInsights
     *        An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     */

    public void setProactiveInsights(Integer proactiveInsights) {
        this.proactiveInsights = proactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @return An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     */

    public Integer getProactiveInsights() {
        return this.proactiveInsights;
    }

    /**
     * <p>
     * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * </p>
     * 
     * @param proactiveInsights
     *        An integer that specifies the number of open proactive insights in your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationOverviewResult withProactiveInsights(Integer proactiveInsights) {
        setProactiveInsights(proactiveInsights);
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
        if (getReactiveInsights() != null)
            sb.append("ReactiveInsights: ").append(getReactiveInsights()).append(",");
        if (getProactiveInsights() != null)
            sb.append("ProactiveInsights: ").append(getProactiveInsights());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationOverviewResult == false)
            return false;
        DescribeOrganizationOverviewResult other = (DescribeOrganizationOverviewResult) obj;
        if (other.getReactiveInsights() == null ^ this.getReactiveInsights() == null)
            return false;
        if (other.getReactiveInsights() != null && other.getReactiveInsights().equals(this.getReactiveInsights()) == false)
            return false;
        if (other.getProactiveInsights() == null ^ this.getProactiveInsights() == null)
            return false;
        if (other.getProactiveInsights() != null && other.getProactiveInsights().equals(this.getProactiveInsights()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReactiveInsights() == null) ? 0 : getReactiveInsights().hashCode());
        hashCode = prime * hashCode + ((getProactiveInsights() == null) ? 0 : getProactiveInsights().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationOverviewResult clone() {
        try {
            return (DescribeOrganizationOverviewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
