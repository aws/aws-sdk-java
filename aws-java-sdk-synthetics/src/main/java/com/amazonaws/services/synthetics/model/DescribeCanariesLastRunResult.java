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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/DescribeCanariesLastRun" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCanariesLastRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains the information from the most recent run of each canary.
     * </p>
     */
    private java.util.List<CanaryLastRun> canariesLastRun;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains the information from the most recent run of each canary.
     * </p>
     * 
     * @return An array that contains the information from the most recent run of each canary.
     */

    public java.util.List<CanaryLastRun> getCanariesLastRun() {
        return canariesLastRun;
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each canary.
     * </p>
     * 
     * @param canariesLastRun
     *        An array that contains the information from the most recent run of each canary.
     */

    public void setCanariesLastRun(java.util.Collection<CanaryLastRun> canariesLastRun) {
        if (canariesLastRun == null) {
            this.canariesLastRun = null;
            return;
        }

        this.canariesLastRun = new java.util.ArrayList<CanaryLastRun>(canariesLastRun);
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each canary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCanariesLastRun(java.util.Collection)} or {@link #withCanariesLastRun(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param canariesLastRun
     *        An array that contains the information from the most recent run of each canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunResult withCanariesLastRun(CanaryLastRun... canariesLastRun) {
        if (this.canariesLastRun == null) {
            setCanariesLastRun(new java.util.ArrayList<CanaryLastRun>(canariesLastRun.length));
        }
        for (CanaryLastRun ele : canariesLastRun) {
            this.canariesLastRun.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the information from the most recent run of each canary.
     * </p>
     * 
     * @param canariesLastRun
     *        An array that contains the information from the most recent run of each canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunResult withCanariesLastRun(java.util.Collection<CanaryLastRun> canariesLastRun) {
        setCanariesLastRun(canariesLastRun);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>DescribeCanariesLastRun</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCanariesLastRunResult withNextToken(String nextToken) {
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
        if (getCanariesLastRun() != null)
            sb.append("CanariesLastRun: ").append(getCanariesLastRun()).append(",");
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

        if (obj instanceof DescribeCanariesLastRunResult == false)
            return false;
        DescribeCanariesLastRunResult other = (DescribeCanariesLastRunResult) obj;
        if (other.getCanariesLastRun() == null ^ this.getCanariesLastRun() == null)
            return false;
        if (other.getCanariesLastRun() != null && other.getCanariesLastRun().equals(this.getCanariesLastRun()) == false)
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

        hashCode = prime * hashCode + ((getCanariesLastRun() == null) ? 0 : getCanariesLastRun().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCanariesLastRunResult clone() {
        try {
            return (DescribeCanariesLastRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
