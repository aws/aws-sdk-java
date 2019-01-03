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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCommandInvocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CommandInvocation> commandInvocations;
    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * 
     * @return (Optional) A list of all invocations.
     */

    public java.util.List<CommandInvocation> getCommandInvocations() {
        if (commandInvocations == null) {
            commandInvocations = new com.amazonaws.internal.SdkInternalList<CommandInvocation>();
        }
        return commandInvocations;
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     */

    public void setCommandInvocations(java.util.Collection<CommandInvocation> commandInvocations) {
        if (commandInvocations == null) {
            this.commandInvocations = null;
            return;
        }

        this.commandInvocations = new com.amazonaws.internal.SdkInternalList<CommandInvocation>(commandInvocations);
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommandInvocations(java.util.Collection)} or {@link #withCommandInvocations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCommandInvocationsResult withCommandInvocations(CommandInvocation... commandInvocations) {
        if (this.commandInvocations == null) {
            setCommandInvocations(new com.amazonaws.internal.SdkInternalList<CommandInvocation>(commandInvocations.length));
        }
        for (CommandInvocation ele : commandInvocations) {
            this.commandInvocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) A list of all invocations.
     * </p>
     * 
     * @param commandInvocations
     *        (Optional) A list of all invocations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCommandInvocationsResult withCommandInvocations(java.util.Collection<CommandInvocation> commandInvocations) {
        setCommandInvocations(commandInvocations);
        return this;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        (Optional) The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCommandInvocationsResult withNextToken(String nextToken) {
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
        if (getCommandInvocations() != null)
            sb.append("CommandInvocations: ").append(getCommandInvocations()).append(",");
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

        if (obj instanceof ListCommandInvocationsResult == false)
            return false;
        ListCommandInvocationsResult other = (ListCommandInvocationsResult) obj;
        if (other.getCommandInvocations() == null ^ this.getCommandInvocations() == null)
            return false;
        if (other.getCommandInvocations() != null && other.getCommandInvocations().equals(this.getCommandInvocations()) == false)
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

        hashCode = prime * hashCode + ((getCommandInvocations() == null) ? 0 : getCommandInvocations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCommandInvocationsResult clone() {
        try {
            return (ListCommandInvocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
