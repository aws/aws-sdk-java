/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInsightResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ProactiveInsight proactiveInsight;

    private ReactiveInsight reactiveInsight;

    /**
     * @param proactiveInsight
     */

    public void setProactiveInsight(ProactiveInsight proactiveInsight) {
        this.proactiveInsight = proactiveInsight;
    }

    /**
     * @return
     */

    public ProactiveInsight getProactiveInsight() {
        return this.proactiveInsight;
    }

    /**
     * @param proactiveInsight
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightResult withProactiveInsight(ProactiveInsight proactiveInsight) {
        setProactiveInsight(proactiveInsight);
        return this;
    }

    /**
     * @param reactiveInsight
     */

    public void setReactiveInsight(ReactiveInsight reactiveInsight) {
        this.reactiveInsight = reactiveInsight;
    }

    /**
     * @return
     */

    public ReactiveInsight getReactiveInsight() {
        return this.reactiveInsight;
    }

    /**
     * @param reactiveInsight
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightResult withReactiveInsight(ReactiveInsight reactiveInsight) {
        setReactiveInsight(reactiveInsight);
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
        if (getProactiveInsight() != null)
            sb.append("ProactiveInsight: ").append(getProactiveInsight()).append(",");
        if (getReactiveInsight() != null)
            sb.append("ReactiveInsight: ").append(getReactiveInsight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInsightResult == false)
            return false;
        DescribeInsightResult other = (DescribeInsightResult) obj;
        if (other.getProactiveInsight() == null ^ this.getProactiveInsight() == null)
            return false;
        if (other.getProactiveInsight() != null && other.getProactiveInsight().equals(this.getProactiveInsight()) == false)
            return false;
        if (other.getReactiveInsight() == null ^ this.getReactiveInsight() == null)
            return false;
        if (other.getReactiveInsight() != null && other.getReactiveInsight().equals(this.getReactiveInsight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProactiveInsight() == null) ? 0 : getProactiveInsight().hashCode());
        hashCode = prime * hashCode + ((getReactiveInsight() == null) ? 0 : getReactiveInsight().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInsightResult clone() {
        try {
            return (DescribeInsightResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
