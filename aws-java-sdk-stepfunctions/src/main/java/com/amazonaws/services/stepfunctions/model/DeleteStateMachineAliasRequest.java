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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DeleteStateMachineAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteStateMachineAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias to delete.
     * </p>
     */
    private String stateMachineAliasArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias to delete.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias to delete.
     */

    public void setStateMachineAliasArn(String stateMachineAliasArn) {
        this.stateMachineAliasArn = stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine alias to delete.
     */

    public String getStateMachineAliasArn() {
        return this.stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias to delete.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteStateMachineAliasRequest withStateMachineAliasArn(String stateMachineAliasArn) {
        setStateMachineAliasArn(stateMachineAliasArn);
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
        if (getStateMachineAliasArn() != null)
            sb.append("StateMachineAliasArn: ").append(getStateMachineAliasArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStateMachineAliasRequest == false)
            return false;
        DeleteStateMachineAliasRequest other = (DeleteStateMachineAliasRequest) obj;
        if (other.getStateMachineAliasArn() == null ^ this.getStateMachineAliasArn() == null)
            return false;
        if (other.getStateMachineAliasArn() != null && other.getStateMachineAliasArn().equals(this.getStateMachineAliasArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineAliasArn() == null) ? 0 : getStateMachineAliasArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStateMachineAliasRequest clone() {
        return (DeleteStateMachineAliasRequest) super.clone();
    }

}
