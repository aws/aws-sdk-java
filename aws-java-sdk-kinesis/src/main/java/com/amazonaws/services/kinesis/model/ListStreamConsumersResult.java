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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreamConsumers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamConsumersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of JSON objects. Each object represents one registered consumer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Consumer> consumers;
    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of registered consumers, the response includes a pagination token named <code>NextToken</code>.
     * You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to
     * list the next set of registered consumers. For more information about the use of this pagination token when
     * calling the <code>ListStreamConsumers</code> operation, see <a>ListStreamConsumersInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a
     * call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * An array of JSON objects. Each object represents one registered consumer.
     * </p>
     * 
     * @return An array of JSON objects. Each object represents one registered consumer.
     */

    public java.util.List<Consumer> getConsumers() {
        if (consumers == null) {
            consumers = new com.amazonaws.internal.SdkInternalList<Consumer>();
        }
        return consumers;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one registered consumer.
     * </p>
     * 
     * @param consumers
     *        An array of JSON objects. Each object represents one registered consumer.
     */

    public void setConsumers(java.util.Collection<Consumer> consumers) {
        if (consumers == null) {
            this.consumers = null;
            return;
        }

        this.consumers = new com.amazonaws.internal.SdkInternalList<Consumer>(consumers);
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one registered consumer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumers(java.util.Collection)} or {@link #withConsumers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param consumers
     *        An array of JSON objects. Each object represents one registered consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersResult withConsumers(Consumer... consumers) {
        if (this.consumers == null) {
            setConsumers(new com.amazonaws.internal.SdkInternalList<Consumer>(consumers.length));
        }
        for (Consumer ele : consumers) {
            this.consumers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one registered consumer.
     * </p>
     * 
     * @param consumers
     *        An array of JSON objects. Each object represents one registered consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersResult withConsumers(java.util.Collection<Consumer> consumers) {
        setConsumers(consumers);
        return this;
    }

    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of registered consumers, the response includes a pagination token named <code>NextToken</code>.
     * You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to
     * list the next set of registered consumers. For more information about the use of this pagination token when
     * calling the <code>ListStreamConsumers</code> operation, see <a>ListStreamConsumersInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a
     * call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        When the number of consumers that are registered with the data stream is greater than the default value
     *        for the <code>MaxResults</code> parameter, or if you explicitly specify a value for
     *        <code>MaxResults</code> that is less than the number of registered consumers, the response includes a
     *        pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     *        subsequent call to <code>ListStreamConsumers</code> to list the next set of registered consumers. For more
     *        information about the use of this pagination token when calling the <code>ListStreamConsumers</code>
     *        operation, see <a>ListStreamConsumersInput$NextToken</a>.</p> <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an
     *        expired token in a call to <code>ListStreamConsumers</code>, you get
     *        <code>ExpiredNextTokenException</code>.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of registered consumers, the response includes a pagination token named <code>NextToken</code>.
     * You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to
     * list the next set of registered consumers. For more information about the use of this pagination token when
     * calling the <code>ListStreamConsumers</code> operation, see <a>ListStreamConsumersInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a
     * call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @return When the number of consumers that are registered with the data stream is greater than the default value
     *         for the <code>MaxResults</code> parameter, or if you explicitly specify a value for
     *         <code>MaxResults</code> that is less than the number of registered consumers, the response includes a
     *         pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     *         subsequent call to <code>ListStreamConsumers</code> to list the next set of registered consumers. For
     *         more information about the use of this pagination token when calling the <code>ListStreamConsumers</code>
     *         operation, see <a>ListStreamConsumersInput$NextToken</a>.</p> <important>
     *         <p>
     *         Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *         call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an
     *         expired token in a call to <code>ListStreamConsumers</code>, you get
     *         <code>ExpiredNextTokenException</code>.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of registered consumers, the response includes a pagination token named <code>NextToken</code>.
     * You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to
     * list the next set of registered consumers. For more information about the use of this pagination token when
     * calling the <code>ListStreamConsumers</code> operation, see <a>ListStreamConsumersInput$NextToken</a>.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a
     * call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        When the number of consumers that are registered with the data stream is greater than the default value
     *        for the <code>MaxResults</code> parameter, or if you explicitly specify a value for
     *        <code>MaxResults</code> that is less than the number of registered consumers, the response includes a
     *        pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a
     *        subsequent call to <code>ListStreamConsumers</code> to list the next set of registered consumers. For more
     *        information about the use of this pagination token when calling the <code>ListStreamConsumers</code>
     *        operation, see <a>ListStreamConsumersInput$NextToken</a>.</p> <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an
     *        expired token in a call to <code>ListStreamConsumers</code>, you get
     *        <code>ExpiredNextTokenException</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersResult withNextToken(String nextToken) {
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
        if (getConsumers() != null)
            sb.append("Consumers: ").append(getConsumers()).append(",");
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

        if (obj instanceof ListStreamConsumersResult == false)
            return false;
        ListStreamConsumersResult other = (ListStreamConsumersResult) obj;
        if (other.getConsumers() == null ^ this.getConsumers() == null)
            return false;
        if (other.getConsumers() != null && other.getConsumers().equals(this.getConsumers()) == false)
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

        hashCode = prime * hashCode + ((getConsumers() == null) ? 0 : getConsumers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamConsumersResult clone() {
        try {
            return (ListStreamConsumersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
