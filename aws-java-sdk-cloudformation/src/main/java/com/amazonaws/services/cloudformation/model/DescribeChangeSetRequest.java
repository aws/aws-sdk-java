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
 * The input for the <a>DescribeChangeSet</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeChangeSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to
     * describe.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of information
     * that you want to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     * </p>
     * 
     * @param changeSetName
     *        The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     * </p>
     * 
     * @param changeSetName
     *        The name or Amazon Resource Name (ARN) of the change set that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetRequest withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to
     * describe.
     * </p>
     * 
     * @param stackName
     *        If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want
     *        to describe.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to
     * describe.
     * </p>
     * 
     * @return If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want
     *         to describe.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to
     * describe.
     * </p>
     * 
     * @param stackName
     *        If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want
     *        to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of information
     * that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of
     *        information that you want to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of information
     * that you want to retrieve.
     * </p>
     * 
     * @return A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of
     *         information that you want to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of information
     * that you want to retrieve.
     * </p>
     * 
     * @param nextToken
     *        A string (provided by the <a>DescribeChangeSet</a> response output) that identifies the next page of
     *        information that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetRequest withNextToken(String nextToken) {
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
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
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

        if (obj instanceof DescribeChangeSetRequest == false)
            return false;
        DescribeChangeSetRequest other = (DescribeChangeSetRequest) obj;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChangeSetRequest clone() {
        return (DescribeChangeSetRequest) super.clone();
    }

}
