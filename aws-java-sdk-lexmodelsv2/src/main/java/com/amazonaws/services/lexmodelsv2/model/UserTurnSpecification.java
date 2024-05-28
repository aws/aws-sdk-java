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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the expected and input values for the user turn.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     */
    private UserTurnInputSpecification input;
    /**
     * <p>
     * Contains results about the expected output for the user turn.
     * </p>
     */
    private UserTurnOutputSpecification expected;

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @param input
     *        Contains information about the user messages in the turn in the input.
     */

    public void setInput(UserTurnInputSpecification input) {
        this.input = input;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @return Contains information about the user messages in the turn in the input.
     */

    public UserTurnInputSpecification getInput() {
        return this.input;
    }

    /**
     * <p>
     * Contains information about the user messages in the turn in the input.
     * </p>
     * 
     * @param input
     *        Contains information about the user messages in the turn in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSpecification withInput(UserTurnInputSpecification input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Contains results about the expected output for the user turn.
     * </p>
     * 
     * @param expected
     *        Contains results about the expected output for the user turn.
     */

    public void setExpected(UserTurnOutputSpecification expected) {
        this.expected = expected;
    }

    /**
     * <p>
     * Contains results about the expected output for the user turn.
     * </p>
     * 
     * @return Contains results about the expected output for the user turn.
     */

    public UserTurnOutputSpecification getExpected() {
        return this.expected;
    }

    /**
     * <p>
     * Contains results about the expected output for the user turn.
     * </p>
     * 
     * @param expected
     *        Contains results about the expected output for the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnSpecification withExpected(UserTurnOutputSpecification expected) {
        setExpected(expected);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getExpected() != null)
            sb.append("Expected: ").append(getExpected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserTurnSpecification == false)
            return false;
        UserTurnSpecification other = (UserTurnSpecification) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getExpected() == null ^ this.getExpected() == null)
            return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        return hashCode;
    }

    @Override
    public UserTurnSpecification clone() {
        try {
            return (UserTurnSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
