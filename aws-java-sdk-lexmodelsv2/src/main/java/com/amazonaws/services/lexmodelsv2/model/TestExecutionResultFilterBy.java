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
 * Contains information about the method by which to filter the results of the test execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestExecutionResultFilterBy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestExecutionResultFilterBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies which results to filter. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     * details"&gt;Test results details</a> for details about different types of results.
     * </p>
     */
    private String resultTypeFilter;
    /**
     * <p>
     * Contains information about the method for filtering Conversation level test results.
     * </p>
     */
    private ConversationLevelTestResultsFilterBy conversationLevelTestResultsFilterBy;

    /**
     * <p>
     * Specifies which results to filter. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     * details"&gt;Test results details</a> for details about different types of results.
     * </p>
     * 
     * @param resultTypeFilter
     *        Specifies which results to filter. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     *        details"&gt;Test results details</a> for details about different types of results.
     * @see TestResultTypeFilter
     */

    public void setResultTypeFilter(String resultTypeFilter) {
        this.resultTypeFilter = resultTypeFilter;
    }

    /**
     * <p>
     * Specifies which results to filter. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     * details"&gt;Test results details</a> for details about different types of results.
     * </p>
     * 
     * @return Specifies which results to filter. See <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     *         details"&gt;Test results details</a> for details about different types of results.
     * @see TestResultTypeFilter
     */

    public String getResultTypeFilter() {
        return this.resultTypeFilter;
    }

    /**
     * <p>
     * Specifies which results to filter. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     * details"&gt;Test results details</a> for details about different types of results.
     * </p>
     * 
     * @param resultTypeFilter
     *        Specifies which results to filter. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     *        details"&gt;Test results details</a> for details about different types of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultTypeFilter
     */

    public TestExecutionResultFilterBy withResultTypeFilter(String resultTypeFilter) {
        setResultTypeFilter(resultTypeFilter);
        return this;
    }

    /**
     * <p>
     * Specifies which results to filter. See <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     * details"&gt;Test results details</a> for details about different types of results.
     * </p>
     * 
     * @param resultTypeFilter
     *        Specifies which results to filter. See <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/test-results-details-test-set.html">Test result
     *        details"&gt;Test results details</a> for details about different types of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TestResultTypeFilter
     */

    public TestExecutionResultFilterBy withResultTypeFilter(TestResultTypeFilter resultTypeFilter) {
        this.resultTypeFilter = resultTypeFilter.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the method for filtering Conversation level test results.
     * </p>
     * 
     * @param conversationLevelTestResultsFilterBy
     *        Contains information about the method for filtering Conversation level test results.
     */

    public void setConversationLevelTestResultsFilterBy(ConversationLevelTestResultsFilterBy conversationLevelTestResultsFilterBy) {
        this.conversationLevelTestResultsFilterBy = conversationLevelTestResultsFilterBy;
    }

    /**
     * <p>
     * Contains information about the method for filtering Conversation level test results.
     * </p>
     * 
     * @return Contains information about the method for filtering Conversation level test results.
     */

    public ConversationLevelTestResultsFilterBy getConversationLevelTestResultsFilterBy() {
        return this.conversationLevelTestResultsFilterBy;
    }

    /**
     * <p>
     * Contains information about the method for filtering Conversation level test results.
     * </p>
     * 
     * @param conversationLevelTestResultsFilterBy
     *        Contains information about the method for filtering Conversation level test results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestExecutionResultFilterBy withConversationLevelTestResultsFilterBy(ConversationLevelTestResultsFilterBy conversationLevelTestResultsFilterBy) {
        setConversationLevelTestResultsFilterBy(conversationLevelTestResultsFilterBy);
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
        if (getResultTypeFilter() != null)
            sb.append("ResultTypeFilter: ").append(getResultTypeFilter()).append(",");
        if (getConversationLevelTestResultsFilterBy() != null)
            sb.append("ConversationLevelTestResultsFilterBy: ").append(getConversationLevelTestResultsFilterBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestExecutionResultFilterBy == false)
            return false;
        TestExecutionResultFilterBy other = (TestExecutionResultFilterBy) obj;
        if (other.getResultTypeFilter() == null ^ this.getResultTypeFilter() == null)
            return false;
        if (other.getResultTypeFilter() != null && other.getResultTypeFilter().equals(this.getResultTypeFilter()) == false)
            return false;
        if (other.getConversationLevelTestResultsFilterBy() == null ^ this.getConversationLevelTestResultsFilterBy() == null)
            return false;
        if (other.getConversationLevelTestResultsFilterBy() != null
                && other.getConversationLevelTestResultsFilterBy().equals(this.getConversationLevelTestResultsFilterBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultTypeFilter() == null) ? 0 : getResultTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getConversationLevelTestResultsFilterBy() == null) ? 0 : getConversationLevelTestResultsFilterBy().hashCode());
        return hashCode;
    }

    @Override
    public TestExecutionResultFilterBy clone() {
        try {
            return (TestExecutionResultFilterBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestExecutionResultFilterByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
