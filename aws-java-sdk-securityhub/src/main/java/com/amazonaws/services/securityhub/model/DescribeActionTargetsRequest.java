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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActionTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to retrieve.
     * </p>
     */
    private java.util.List<String> actionTargetArns;
    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to retrieve.
     * </p>
     * 
     * @return A list of custom action target ARNs for the custom action targets to retrieve.
     */

    public java.util.List<String> getActionTargetArns() {
        return actionTargetArns;
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to retrieve.
     * </p>
     * 
     * @param actionTargetArns
     *        A list of custom action target ARNs for the custom action targets to retrieve.
     */

    public void setActionTargetArns(java.util.Collection<String> actionTargetArns) {
        if (actionTargetArns == null) {
            this.actionTargetArns = null;
            return;
        }

        this.actionTargetArns = new java.util.ArrayList<String>(actionTargetArns);
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionTargetArns(java.util.Collection)} or {@link #withActionTargetArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param actionTargetArns
     *        A list of custom action target ARNs for the custom action targets to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionTargetsRequest withActionTargetArns(String... actionTargetArns) {
        if (this.actionTargetArns == null) {
            setActionTargetArns(new java.util.ArrayList<String>(actionTargetArns.length));
        }
        for (String ele : actionTargetArns) {
            this.actionTargetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom action target ARNs for the custom action targets to retrieve.
     * </p>
     * 
     * @param actionTargetArns
     *        A list of custom action target ARNs for the custom action targets to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionTargetsRequest withActionTargetArns(java.util.Collection<String> actionTargetArns) {
        setActionTargetArns(actionTargetArns);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @return The token that is required for pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionTargetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionTargetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getActionTargetArns() != null)
            sb.append("ActionTargetArns: ").append(getActionTargetArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActionTargetsRequest == false)
            return false;
        DescribeActionTargetsRequest other = (DescribeActionTargetsRequest) obj;
        if (other.getActionTargetArns() == null ^ this.getActionTargetArns() == null)
            return false;
        if (other.getActionTargetArns() != null && other.getActionTargetArns().equals(this.getActionTargetArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionTargetArns() == null) ? 0 : getActionTargetArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActionTargetsRequest clone() {
        return (DescribeActionTargetsRequest) super.clone();
    }

}
