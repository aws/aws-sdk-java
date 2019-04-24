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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResourceDrifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourceDriftsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Drift information for the resources that have been checked for drift in the specified stack. This includes actual
     * and expected configuration values for resources where AWS CloudFormation detects drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackResourceDrift> stackResourceDrifts;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Drift information for the resources that have been checked for drift in the specified stack. This includes actual
     * and expected configuration values for resources where AWS CloudFormation detects drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @return Drift information for the resources that have been checked for drift in the specified stack. This
     *         includes actual and expected configuration values for resources where AWS CloudFormation detects
     *         drift.</p>
     *         <p>
     *         For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has
     *         been checked for drift. Resources that have not yet been checked for drift are not included. Resources
     *         that do not currently support drift detection are not checked, and so not included. For a list of
     *         resources that support drift detection, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *         >Resources that Support Drift Detection</a>.
     */

    public java.util.List<StackResourceDrift> getStackResourceDrifts() {
        if (stackResourceDrifts == null) {
            stackResourceDrifts = new com.amazonaws.internal.SdkInternalList<StackResourceDrift>();
        }
        return stackResourceDrifts;
    }

    /**
     * <p>
     * Drift information for the resources that have been checked for drift in the specified stack. This includes actual
     * and expected configuration values for resources where AWS CloudFormation detects drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param stackResourceDrifts
     *        Drift information for the resources that have been checked for drift in the specified stack. This includes
     *        actual and expected configuration values for resources where AWS CloudFormation detects drift.</p>
     *        <p>
     *        For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     *        checked for drift. Resources that have not yet been checked for drift are not included. Resources that do
     *        not currently support drift detection are not checked, and so not included. For a list of resources that
     *        support drift detection, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     */

    public void setStackResourceDrifts(java.util.Collection<StackResourceDrift> stackResourceDrifts) {
        if (stackResourceDrifts == null) {
            this.stackResourceDrifts = null;
            return;
        }

        this.stackResourceDrifts = new com.amazonaws.internal.SdkInternalList<StackResourceDrift>(stackResourceDrifts);
    }

    /**
     * <p>
     * Drift information for the resources that have been checked for drift in the specified stack. This includes actual
     * and expected configuration values for resources where AWS CloudFormation detects drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackResourceDrifts(java.util.Collection)} or {@link #withStackResourceDrifts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param stackResourceDrifts
     *        Drift information for the resources that have been checked for drift in the specified stack. This includes
     *        actual and expected configuration values for resources where AWS CloudFormation detects drift.</p>
     *        <p>
     *        For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     *        checked for drift. Resources that have not yet been checked for drift are not included. Resources that do
     *        not currently support drift detection are not checked, and so not included. For a list of resources that
     *        support drift detection, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsResult withStackResourceDrifts(StackResourceDrift... stackResourceDrifts) {
        if (this.stackResourceDrifts == null) {
            setStackResourceDrifts(new com.amazonaws.internal.SdkInternalList<StackResourceDrift>(stackResourceDrifts.length));
        }
        for (StackResourceDrift ele : stackResourceDrifts) {
            this.stackResourceDrifts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Drift information for the resources that have been checked for drift in the specified stack. This includes actual
     * and expected configuration values for resources where AWS CloudFormation detects drift.
     * </p>
     * <p>
     * For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     * checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not
     * currently support drift detection are not checked, and so not included. For a list of resources that support
     * drift detection, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     * >Resources that Support Drift Detection</a>.
     * </p>
     * 
     * @param stackResourceDrifts
     *        Drift information for the resources that have been checked for drift in the specified stack. This includes
     *        actual and expected configuration values for resources where AWS CloudFormation detects drift.</p>
     *        <p>
     *        For a given stack, there will be one <code>StackResourceDrift</code> for each stack resource that has been
     *        checked for drift. Resources that have not yet been checked for drift are not included. Resources that do
     *        not currently support drift detection are not checked, and so not included. For a list of resources that
     *        support drift detection, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift-resource-list.html"
     *        >Resources that Support Drift Detection</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsResult withStackResourceDrifts(java.util.Collection<StackResourceDrift> stackResourceDrifts) {
        setStackResourceDrifts(stackResourceDrifts);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that
     *        token to the request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that
     *         token to the request object's <code>NextToken</code> parameter. If the request returns all results,
     *         <code>NextToken</code> is set to <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that token to the request
     * object's <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>DescribeStackResourceDrifts</code> again and assign that
     *        token to the request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsResult withNextToken(String nextToken) {
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
        if (getStackResourceDrifts() != null)
            sb.append("StackResourceDrifts: ").append(getStackResourceDrifts()).append(",");
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

        if (obj instanceof DescribeStackResourceDriftsResult == false)
            return false;
        DescribeStackResourceDriftsResult other = (DescribeStackResourceDriftsResult) obj;
        if (other.getStackResourceDrifts() == null ^ this.getStackResourceDrifts() == null)
            return false;
        if (other.getStackResourceDrifts() != null && other.getStackResourceDrifts().equals(this.getStackResourceDrifts()) == false)
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

        hashCode = prime * hashCode + ((getStackResourceDrifts() == null) ? 0 : getStackResourceDrifts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackResourceDriftsResult clone() {
        try {
            return (DescribeStackResourceDriftsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
