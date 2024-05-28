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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/ListKxScalingGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKxScalingGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of scaling groups available in a kdb environment.
     * </p>
     */
    private java.util.List<KxScalingGroup> scalingGroups;
    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of scaling groups available in a kdb environment.
     * </p>
     * 
     * @return A list of scaling groups available in a kdb environment.
     */

    public java.util.List<KxScalingGroup> getScalingGroups() {
        return scalingGroups;
    }

    /**
     * <p>
     * A list of scaling groups available in a kdb environment.
     * </p>
     * 
     * @param scalingGroups
     *        A list of scaling groups available in a kdb environment.
     */

    public void setScalingGroups(java.util.Collection<KxScalingGroup> scalingGroups) {
        if (scalingGroups == null) {
            this.scalingGroups = null;
            return;
        }

        this.scalingGroups = new java.util.ArrayList<KxScalingGroup>(scalingGroups);
    }

    /**
     * <p>
     * A list of scaling groups available in a kdb environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingGroups(java.util.Collection)} or {@link #withScalingGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param scalingGroups
     *        A list of scaling groups available in a kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxScalingGroupsResult withScalingGroups(KxScalingGroup... scalingGroups) {
        if (this.scalingGroups == null) {
            setScalingGroups(new java.util.ArrayList<KxScalingGroup>(scalingGroups.length));
        }
        for (KxScalingGroup ele : scalingGroups) {
            this.scalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scaling groups available in a kdb environment.
     * </p>
     * 
     * @param scalingGroups
     *        A list of scaling groups available in a kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxScalingGroupsResult withScalingGroups(java.util.Collection<KxScalingGroup> scalingGroups) {
        setScalingGroups(scalingGroups);
        return this;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @return A token that indicates where a results page should begin.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where a results page should begin.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where a results page should begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKxScalingGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getScalingGroups() != null)
            sb.append("ScalingGroups: ").append(getScalingGroups()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKxScalingGroupsResult == false)
            return false;
        ListKxScalingGroupsResult other = (ListKxScalingGroupsResult) obj;
        if (other.getScalingGroups() == null ^ this.getScalingGroups() == null)
            return false;
        if (other.getScalingGroups() != null && other.getScalingGroups().equals(this.getScalingGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingGroups() == null) ? 0 : getScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListKxScalingGroupsResult clone() {
        try {
            return (ListKxScalingGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
