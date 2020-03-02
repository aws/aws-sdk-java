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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the describeProfilingGroupResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/DescribeProfilingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProfilingGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a profiling group.
     * </p>
     */
    private ProfilingGroupDescription profilingGroup;

    /**
     * <p>
     * Information about a profiling group.
     * </p>
     * 
     * @param profilingGroup
     *        Information about a profiling group.
     */

    public void setProfilingGroup(ProfilingGroupDescription profilingGroup) {
        this.profilingGroup = profilingGroup;
    }

    /**
     * <p>
     * Information about a profiling group.
     * </p>
     * 
     * @return Information about a profiling group.
     */

    public ProfilingGroupDescription getProfilingGroup() {
        return this.profilingGroup;
    }

    /**
     * <p>
     * Information about a profiling group.
     * </p>
     * 
     * @param profilingGroup
     *        Information about a profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProfilingGroupResult withProfilingGroup(ProfilingGroupDescription profilingGroup) {
        setProfilingGroup(profilingGroup);
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
        if (getProfilingGroup() != null)
            sb.append("ProfilingGroup: ").append(getProfilingGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProfilingGroupResult == false)
            return false;
        DescribeProfilingGroupResult other = (DescribeProfilingGroupResult) obj;
        if (other.getProfilingGroup() == null ^ this.getProfilingGroup() == null)
            return false;
        if (other.getProfilingGroup() != null && other.getProfilingGroup().equals(this.getProfilingGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfilingGroup() == null) ? 0 : getProfilingGroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProfilingGroupResult clone() {
        try {
            return (DescribeProfilingGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
