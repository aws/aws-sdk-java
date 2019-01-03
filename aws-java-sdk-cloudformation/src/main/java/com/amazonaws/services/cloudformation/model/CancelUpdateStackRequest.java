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
 * The input for the <a>CancelUpdateStack</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/CancelUpdateStack" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelUpdateStackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same
     * name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @return The name or the unique stack ID that is associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelUpdateStackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same
     * name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to
     *        retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack
     *        with the same name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS
     *        CloudFormation successfully received them.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same
     * name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @return A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to
     *         retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack
     *         with the same name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS
     *         CloudFormation successfully received them.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same
     * name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS CloudFormation successfully
     * received them.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>CancelUpdateStack</code> request. Specify this token if you plan to
     *        retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack
     *        with the same name. You might retry <code>CancelUpdateStack</code> requests to ensure that AWS
     *        CloudFormation successfully received them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelUpdateStackRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelUpdateStackRequest == false)
            return false;
        CancelUpdateStackRequest other = (CancelUpdateStackRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CancelUpdateStackRequest clone() {
        return (CancelUpdateStackRequest) super.clone();
    }

}
