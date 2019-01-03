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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeParameterGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of parameter groups. Each element in the array represents one parameter group.
     * </p>
     */
    private java.util.List<ParameterGroup> parameterGroups;

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @return Provides an identifier to allow retrieval of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Provides an identifier to allow retrieval of paginated results.
     * </p>
     * 
     * @param nextToken
     *        Provides an identifier to allow retrieval of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of parameter groups. Each element in the array represents one parameter group.
     * </p>
     * 
     * @return An array of parameter groups. Each element in the array represents one parameter group.
     */

    public java.util.List<ParameterGroup> getParameterGroups() {
        return parameterGroups;
    }

    /**
     * <p>
     * An array of parameter groups. Each element in the array represents one parameter group.
     * </p>
     * 
     * @param parameterGroups
     *        An array of parameter groups. Each element in the array represents one parameter group.
     */

    public void setParameterGroups(java.util.Collection<ParameterGroup> parameterGroups) {
        if (parameterGroups == null) {
            this.parameterGroups = null;
            return;
        }

        this.parameterGroups = new java.util.ArrayList<ParameterGroup>(parameterGroups);
    }

    /**
     * <p>
     * An array of parameter groups. Each element in the array represents one parameter group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterGroups(java.util.Collection)} or {@link #withParameterGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param parameterGroups
     *        An array of parameter groups. Each element in the array represents one parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsResult withParameterGroups(ParameterGroup... parameterGroups) {
        if (this.parameterGroups == null) {
            setParameterGroups(new java.util.ArrayList<ParameterGroup>(parameterGroups.length));
        }
        for (ParameterGroup ele : parameterGroups) {
            this.parameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of parameter groups. Each element in the array represents one parameter group.
     * </p>
     * 
     * @param parameterGroups
     *        An array of parameter groups. Each element in the array represents one parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsResult withParameterGroups(java.util.Collection<ParameterGroup> parameterGroups) {
        setParameterGroups(parameterGroups);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getParameterGroups() != null)
            sb.append("ParameterGroups: ").append(getParameterGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeParameterGroupsResult == false)
            return false;
        DescribeParameterGroupsResult other = (DescribeParameterGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getParameterGroups() == null ^ this.getParameterGroups() == null)
            return false;
        if (other.getParameterGroups() != null && other.getParameterGroups().equals(this.getParameterGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getParameterGroups() == null) ? 0 : getParameterGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeParameterGroupsResult clone() {
        try {
            return (DescribeParameterGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
