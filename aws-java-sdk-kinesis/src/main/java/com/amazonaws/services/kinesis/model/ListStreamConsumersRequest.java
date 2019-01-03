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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListStreamConsumers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamConsumersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">
     * Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of consumers that are registered with the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListStreamConsumers</code> to list the next set of registered consumers.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of consumers
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListStreamConsumers</code> operation to list the next set of consumers.
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
     * The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the consumers for.
     * </p>
     * <p>
     * You can't specify this parameter if you specify the NextToken parameter.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;

    /**
     * <p>
     * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">
     * Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream for which you want to list the registered consumers. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">
     * Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the Kinesis data stream for which you want to list the registered consumers. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">
     * Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream for which you want to list the registered consumers. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * When the number of consumers that are registered with the data stream is greater than the default value for the
     * <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less
     * than the number of consumers that are registered with the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListStreamConsumers</code> to list the next set of registered consumers.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of consumers
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListStreamConsumers</code> operation to list the next set of consumers.
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
     *        <code>MaxResults</code> that is less than the number of consumers that are registered with the data
     *        stream, the response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to list the next set
     *        of registered consumers.</p>
     *        <p>
     *        Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *        <code>NextToken</code> because the latter unambiguously identifies the stream.
     *        </p>
     *        <p>
     *        You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *        <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *        consumers that the operation returns if you don't specify <code>MaxResults</code>, the response will
     *        contain a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a
     *        subsequent call to the <code>ListStreamConsumers</code> operation to list the next set of consumers.
     *        </p>
     *        <important>
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
     * than the number of consumers that are registered with the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListStreamConsumers</code> to list the next set of registered consumers.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of consumers
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListStreamConsumers</code> operation to list the next set of consumers.
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
     *         <code>MaxResults</code> that is less than the number of consumers that are registered with the data
     *         stream, the response includes a pagination token named <code>NextToken</code>. You can specify this
     *         <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to list the next
     *         set of registered consumers.</p>
     *         <p>
     *         Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *         <code>NextToken</code> because the latter unambiguously identifies the stream.
     *         </p>
     *         <p>
     *         You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *         <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *         consumers that the operation returns if you don't specify <code>MaxResults</code>, the response will
     *         contain a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a
     *         subsequent call to the <code>ListStreamConsumers</code> operation to list the next set of consumers.
     *         </p>
     *         <important>
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
     * than the number of consumers that are registered with the data stream, the response includes a pagination token
     * named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     * <code>ListStreamConsumers</code> to list the next set of registered consumers.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of consumers
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListStreamConsumers</code> operation to list the next set of consumers.
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
     *        <code>MaxResults</code> that is less than the number of consumers that are registered with the data
     *        stream, the response includes a pagination token named <code>NextToken</code>. You can specify this
     *        <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to list the next set
     *        of registered consumers.</p>
     *        <p>
     *        Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *        <code>NextToken</code> because the latter unambiguously identifies the stream.
     *        </p>
     *        <p>
     *        You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *        <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *        consumers that the operation returns if you don't specify <code>MaxResults</code>, the response will
     *        contain a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a
     *        subsequent call to the <code>ListStreamConsumers</code> operation to list the next set of consumers.
     *        </p>
     *        <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an
     *        expired token in a call to <code>ListStreamConsumers</code>, you get
     *        <code>ExpiredNextTokenException</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     * </p>
     * 
     * @return The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to
     *         return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the consumers for.
     * </p>
     * <p>
     * You can't specify this parameter if you specify the NextToken parameter.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *        create a data stream and then delete it, and you later create another data stream with the same name, you
     *        can use this input parameter to specify which of the two streams you want to list the consumers for. </p>
     *        <p>
     *        You can't specify this parameter if you specify the NextToken parameter.
     */

    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the consumers for.
     * </p>
     * <p>
     * You can't specify this parameter if you specify the NextToken parameter.
     * </p>
     * 
     * @return Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *         create a data stream and then delete it, and you later create another data stream with the same name, you
     *         can use this input parameter to specify which of the two streams you want to list the consumers for. </p>
     *         <p>
     *         You can't specify this parameter if you specify the NextToken parameter.
     */

    public java.util.Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the consumers for.
     * </p>
     * <p>
     * You can't specify this parameter if you specify the NextToken parameter.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *        create a data stream and then delete it, and you later create another data stream with the same name, you
     *        can use this input parameter to specify which of the two streams you want to list the consumers for. </p>
     *        <p>
     *        You can't specify this parameter if you specify the NextToken parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamConsumersRequest withStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        setStreamCreationTimestamp(streamCreationTimestamp);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: ").append(getStreamCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamConsumersRequest == false)
            return false;
        ListStreamConsumersRequest other = (ListStreamConsumersRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamConsumersRequest clone() {
        return (ListStreamConsumersRequest) super.clone();
    }

}
