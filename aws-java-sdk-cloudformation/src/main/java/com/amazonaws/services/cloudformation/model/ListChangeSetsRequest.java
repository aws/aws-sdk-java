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
 * <p>
 * The input for the <a>ListChangeSets</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListChangeSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChangeSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change sets
     * that you want to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     * </p>
     * 
     * @param stackName
     *        The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     * </p>
     * 
     * @return The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     * </p>
     * 
     * @param stackName
     *        The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change sets
     * that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change
     *        sets that you want to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change sets
     * that you want to retrieve.
     * </p>
     * 
     * @return A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change
     *         sets that you want to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change sets
     * that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>ListChangeSets</a> response output) that identifies the next page of change
     *        sets that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChangeSetsRequest withNextToken(String nextToken) {
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
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

        if (obj instanceof ListChangeSetsRequest == false)
            return false;
        ListChangeSetsRequest other = (ListChangeSetsRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
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

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListChangeSetsRequest clone() {
        return (ListChangeSetsRequest) super.clone();
    }

}
