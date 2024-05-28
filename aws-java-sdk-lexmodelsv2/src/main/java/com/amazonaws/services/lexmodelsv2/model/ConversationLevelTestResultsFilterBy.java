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
 * The selection to filter the test set results data at the conversation level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLevelTestResultsFilterBy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLevelTestResultsFilterBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The selection of matched or mismatched end-to-end status to filter test set results data at the conversation
     * level.
     * </p>
     */
    private String endToEndResult;

    /**
     * <p>
     * The selection of matched or mismatched end-to-end status to filter test set results data at the conversation
     * level.
     * </p>
     * 
     * @param endToEndResult
     *        The selection of matched or mismatched end-to-end status to filter test set results data at the
     *        conversation level.
     * @see TestResultMatchStatus
     */

    public void setEndToEndResult(String endToEndResult) {
        this.endToEndResult = endToEndResult;
    }

    /**
     * <p>
     * The selection of matched or mismatched end-to-end status to filter test set results data at the conversation
     * level.
     * </p>
     * 
     * @return The selection of matched or mismatched end-to-end status to filter test set results data at the
     *         conversation level.
     * @see TestResultMatchStatus
     */

    public String getEndToEndResult() {
        return this.endToEndResult;
    }

    /**
     * <p>
     * The selection of matched or mismatched end-to-end status to filter test set results data at the conversation
     * level.
     * </p>
     * 
     * @param endToEndResult
     *        The selection of matched or mismatched end-to-end status to filter test set results data at the
     *        conversation level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultsFilterBy withEndToEndResult(String endToEndResult) {
        setEndToEndResult(endToEndResult);
        return this;
    }

    /**
     * <p>
     * The selection of matched or mismatched end-to-end status to filter test set results data at the conversation
     * level.
     * </p>
     * 
     * @param endToEndResult
     *        The selection of matched or mismatched end-to-end status to filter test set results data at the
     *        conversation level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultMatchStatus
     */

    public ConversationLevelTestResultsFilterBy withEndToEndResult(TestResultMatchStatus endToEndResult) {
        this.endToEndResult = endToEndResult.toString();
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
        if (getEndToEndResult() != null)
            sb.append("EndToEndResult: ").append(getEndToEndResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLevelTestResultsFilterBy == false)
            return false;
        ConversationLevelTestResultsFilterBy other = (ConversationLevelTestResultsFilterBy) obj;
        if (other.getEndToEndResult() == null ^ this.getEndToEndResult() == null)
            return false;
        if (other.getEndToEndResult() != null && other.getEndToEndResult().equals(this.getEndToEndResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndToEndResult() == null) ? 0 : getEndToEndResult().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLevelTestResultsFilterBy clone() {
        try {
            return (ConversationLevelTestResultsFilterBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLevelTestResultsFilterByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
