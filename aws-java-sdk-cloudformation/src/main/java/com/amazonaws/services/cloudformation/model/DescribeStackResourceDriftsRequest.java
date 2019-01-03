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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResourceDrifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourceDriftsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackResourceDriftStatusFilters;
    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which you want drift information.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * 
     * @return The name of the stack for which you want drift information.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack for which you want drift information.
     * </p>
     * 
     * @param stackName
     *        The name of the stack for which you want drift information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource drift status values to use as filters for the resource drift results returned.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *         has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *         </p>
     *         </li>
     * @see StackResourceDriftStatus
     */

    public java.util.List<String> getStackResourceDriftStatusFilters() {
        if (stackResourceDriftStatusFilters == null) {
            stackResourceDriftStatusFilters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stackResourceDriftStatusFilters;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatusFilters
     *        The resource drift status values to use as filters for the resource drift results returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @see StackResourceDriftStatus
     */

    public void setStackResourceDriftStatusFilters(java.util.Collection<String> stackResourceDriftStatusFilters) {
        if (stackResourceDriftStatusFilters == null) {
            this.stackResourceDriftStatusFilters = null;
            return;
        }

        this.stackResourceDriftStatusFilters = new com.amazonaws.internal.SdkInternalList<String>(stackResourceDriftStatusFilters);
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackResourceDriftStatusFilters(java.util.Collection)} or
     * {@link #withStackResourceDriftStatusFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param stackResourceDriftStatusFilters
     *        The resource drift status values to use as filters for the resource drift results returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public DescribeStackResourceDriftsRequest withStackResourceDriftStatusFilters(String... stackResourceDriftStatusFilters) {
        if (this.stackResourceDriftStatusFilters == null) {
            setStackResourceDriftStatusFilters(new com.amazonaws.internal.SdkInternalList<String>(stackResourceDriftStatusFilters.length));
        }
        for (String ele : stackResourceDriftStatusFilters) {
            this.stackResourceDriftStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatusFilters
     *        The resource drift status values to use as filters for the resource drift results returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public DescribeStackResourceDriftsRequest withStackResourceDriftStatusFilters(java.util.Collection<String> stackResourceDriftStatusFilters) {
        setStackResourceDriftStatusFilters(stackResourceDriftStatusFilters);
        return this;
    }

    /**
     * <p>
     * The resource drift status values to use as filters for the resource drift results returned.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackResourceDriftStatusFilters
     *        The resource drift status values to use as filters for the resource drift results returned.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resources's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation does not currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public DescribeStackResourceDriftsRequest withStackResourceDriftStatusFilters(StackResourceDriftStatus... stackResourceDriftStatusFilters) {
        com.amazonaws.internal.SdkInternalList<String> stackResourceDriftStatusFiltersCopy = new com.amazonaws.internal.SdkInternalList<String>(
                stackResourceDriftStatusFilters.length);
        for (StackResourceDriftStatus value : stackResourceDriftStatusFilters) {
            stackResourceDriftStatusFiltersCopy.add(value.toString());
        }
        if (getStackResourceDriftStatusFilters() == null) {
            setStackResourceDriftStatusFilters(stackResourceDriftStatusFiltersCopy);
        } else {
            getStackResourceDriftStatusFilters().addAll(stackResourceDriftStatusFiltersCopy);
        }
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of stack resource drift results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * 
     * @return A string that identifies the next page of stack resource drift results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of stack resource drift results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of stack resource drift results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @return The maximum number of results to be returned with a single call. If the number of available results
     *         exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourceDriftsRequest withMaxResults(Integer maxResults) {
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getStackResourceDriftStatusFilters() != null)
            sb.append("StackResourceDriftStatusFilters: ").append(getStackResourceDriftStatusFilters()).append(",");
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

        if (obj instanceof DescribeStackResourceDriftsRequest == false)
            return false;
        DescribeStackResourceDriftsRequest other = (DescribeStackResourceDriftsRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackResourceDriftStatusFilters() == null ^ this.getStackResourceDriftStatusFilters() == null)
            return false;
        if (other.getStackResourceDriftStatusFilters() != null
                && other.getStackResourceDriftStatusFilters().equals(this.getStackResourceDriftStatusFilters()) == false)
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

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getStackResourceDriftStatusFilters() == null) ? 0 : getStackResourceDriftStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackResourceDriftsRequest clone() {
        return (DescribeStackResourceDriftsRequest) super.clone();
    }

}
