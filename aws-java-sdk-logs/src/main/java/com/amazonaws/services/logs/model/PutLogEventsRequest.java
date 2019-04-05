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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutLogEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The name of the log stream.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The log events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InputLogEvent> logEvents;
    /**
     * <p>
     * The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in a
     * newly created log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * </p>
     */
    private String sequenceToken;

    /**
     * Default constructor for PutLogEventsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public PutLogEventsRequest() {
    }

    /**
     * Constructs a new PutLogEventsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     *        The name of the log group.
     * @param logStreamName
     *        The name of the log stream.
     * @param logEvents
     *        The log events.
     */
    public PutLogEventsRequest(String logGroupName, String logStreamName, java.util.List<InputLogEvent> logEvents) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
        setLogEvents(logEvents);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @return The name of the log stream.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsRequest withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The log events.
     * </p>
     * 
     * @return The log events.
     */

    public java.util.List<InputLogEvent> getLogEvents() {
        if (logEvents == null) {
            logEvents = new com.amazonaws.internal.SdkInternalList<InputLogEvent>();
        }
        return logEvents;
    }

    /**
     * <p>
     * The log events.
     * </p>
     * 
     * @param logEvents
     *        The log events.
     */

    public void setLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        if (logEvents == null) {
            this.logEvents = null;
            return;
        }

        this.logEvents = new com.amazonaws.internal.SdkInternalList<InputLogEvent>(logEvents);
    }

    /**
     * <p>
     * The log events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogEvents(java.util.Collection)} or {@link #withLogEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logEvents
     *        The log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsRequest withLogEvents(InputLogEvent... logEvents) {
        if (this.logEvents == null) {
            setLogEvents(new com.amazonaws.internal.SdkInternalList<InputLogEvent>(logEvents.length));
        }
        for (InputLogEvent ele : logEvents) {
            this.logEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log events.
     * </p>
     * 
     * @param logEvents
     *        The log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsRequest withLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        setLogEvents(logEvents);
        return this;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in a
     * newly created log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * </p>
     * 
     * @param sequenceToken
     *        The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in
     *        a newly created log stream does not require a sequence token. You can also get the sequence token using
     *        <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using
     *        the same value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     */

    public void setSequenceToken(String sequenceToken) {
        this.sequenceToken = sequenceToken;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in a
     * newly created log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * </p>
     * 
     * @return The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload
     *         in a newly created log stream does not require a sequence token. You can also get the sequence token
     *         using <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period
     *         using the same value for <code>sequenceToken</code>, both calls may be successful, or one may be
     *         rejected.
     */

    public String getSequenceToken() {
        return this.sequenceToken;
    }

    /**
     * <p>
     * The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in a
     * newly created log stream does not require a sequence token. You can also get the sequence token using
     * <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using the same
     * value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * </p>
     * 
     * @param sequenceToken
     *        The sequence token obtained from the response of the previous <code>PutLogEvents</code> call. An upload in
     *        a newly created log stream does not require a sequence token. You can also get the sequence token using
     *        <a>DescribeLogStreams</a>. If you call <code>PutLogEvents</code> twice within a narrow time period using
     *        the same value for <code>sequenceToken</code>, both calls may be successful, or one may be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLogEventsRequest withSequenceToken(String sequenceToken) {
        setSequenceToken(sequenceToken);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getLogEvents() != null)
            sb.append("LogEvents: ").append(getLogEvents()).append(",");
        if (getSequenceToken() != null)
            sb.append("SequenceToken: ").append(getSequenceToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLogEventsRequest == false)
            return false;
        PutLogEventsRequest other = (PutLogEventsRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getLogEvents() == null ^ this.getLogEvents() == null)
            return false;
        if (other.getLogEvents() != null && other.getLogEvents().equals(this.getLogEvents()) == false)
            return false;
        if (other.getSequenceToken() == null ^ this.getSequenceToken() == null)
            return false;
        if (other.getSequenceToken() != null && other.getSequenceToken().equals(this.getSequenceToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getLogEvents() == null) ? 0 : getLogEvents().hashCode());
        hashCode = prime * hashCode + ((getSequenceToken() == null) ? 0 : getSequenceToken().hashCode());
        return hashCode;
    }

    @Override
    public PutLogEventsRequest clone() {
        return (PutLogEventsRequest) super.clone();
    }

}
