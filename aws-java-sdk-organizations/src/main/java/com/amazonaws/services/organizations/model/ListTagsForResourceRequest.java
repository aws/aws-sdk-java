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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTagsForResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource with the tags to list.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceId;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the resource with the tags to list.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource with the tags to list.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource with the tags to list.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The ID of the resource with the tags to list.</p>
     *         <p>
     *         You can specify any of the following taggable resources.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS account – specify the account ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *         <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *         <code>r-<i>1a2b</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *         <code>p-<i>12abcdefg3</i> </code>
     *         </p>
     *         </li>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource with the tags to list.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceId
     *        The ID of the resource with the tags to list.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value of the previous call's <code>NextToken</code> response to indicate where the
     *         output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
