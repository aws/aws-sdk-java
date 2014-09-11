/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#putLogEvents(PutLogEventsRequest) PutLogEvents operation}.
 * <p>
 * Uploads a batch of log events to the specified log stream.
 * </p>
 * <p>
 * Every PutLogEvents request must include the
 * <code>sequenceToken</code> obtained from the response of the previous
 * request. An upload in a newly created log stream does not require a
 * <code>sequenceToken</code> .
 * 
 * </p>
 * <p>
 * The batch of events must satisfy the following constraints:
 * <ul>
 * <li>The maximum batch size is 32,768 bytes, and this size is
 * calculated as the sum of all event messages in UTF-8, plus 26 bytes
 * for each log event.</li>
 * <li>None of the log events in the batch can be more than 2 hours in
 * the future.</li>
 * <li>None of the log events in the batch can be older than 14 days or
 * the retention period of the log group.</li>
 * <li>The log events in the batch must be in chronological ordered by
 * their <code>timestamp</code> .</li>
 * <li>The maximum number of log events in a batch is 1,000.</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#putLogEvents(PutLogEventsRequest)
 */
public class PutLogEventsRequest extends AmazonWebServiceRequest implements Serializable {

    private String logGroupName;

    private String logStreamName;

    /**
     * A list of events belonging to a log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent> logEvents;

    /**
     * A string token that must be obtained from the response of the previous
     * <code class="code">PutLogEvents</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String sequenceToken;

    /**
     * Default constructor for a new PutLogEventsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutLogEventsRequest() {}
    
    /**
     * Constructs a new PutLogEventsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     * @param logStreamName
     * @param logEvents A list of events belonging to a log stream.
     */
    public PutLogEventsRequest(String logGroupName, String logStreamName, java.util.List<InputLogEvent> logEvents) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
        setLogEvents(logEvents);
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Returns the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the LogStreamName property for this object.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * A list of events belonging to a log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return A list of events belonging to a log stream.
     */
    public java.util.List<InputLogEvent> getLogEvents() {
        if (logEvents == null) {
              logEvents = new com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent>();
              logEvents.setAutoConstruct(true);
        }
        return logEvents;
    }
    
    /**
     * A list of events belonging to a log stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param logEvents A list of events belonging to a log stream.
     */
    public void setLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        if (logEvents == null) {
            this.logEvents = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent> logEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent>(logEvents.size());
        logEventsCopy.addAll(logEvents);
        this.logEvents = logEventsCopy;
    }
    
    /**
     * A list of events belonging to a log stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param logEvents A list of events belonging to a log stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsRequest withLogEvents(InputLogEvent... logEvents) {
        if (getLogEvents() == null) setLogEvents(new java.util.ArrayList<InputLogEvent>(logEvents.length));
        for (InputLogEvent value : logEvents) {
            getLogEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of events belonging to a log stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param logEvents A list of events belonging to a log stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsRequest withLogEvents(java.util.Collection<InputLogEvent> logEvents) {
        if (logEvents == null) {
            this.logEvents = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent> logEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InputLogEvent>(logEvents.size());
            logEventsCopy.addAll(logEvents);
            this.logEvents = logEventsCopy;
        }

        return this;
    }

    /**
     * A string token that must be obtained from the response of the previous
     * <code class="code">PutLogEvents</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A string token that must be obtained from the response of the previous
     *         <code class="code">PutLogEvents</code> request.
     */
    public String getSequenceToken() {
        return sequenceToken;
    }
    
    /**
     * A string token that must be obtained from the response of the previous
     * <code class="code">PutLogEvents</code> request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sequenceToken A string token that must be obtained from the response of the previous
     *         <code class="code">PutLogEvents</code> request.
     */
    public void setSequenceToken(String sequenceToken) {
        this.sequenceToken = sequenceToken;
    }
    
    /**
     * A string token that must be obtained from the response of the previous
     * <code class="code">PutLogEvents</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param sequenceToken A string token that must be obtained from the response of the previous
     *         <code class="code">PutLogEvents</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutLogEventsRequest withSequenceToken(String sequenceToken) {
        this.sequenceToken = sequenceToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamName() != null) sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (getLogEvents() != null) sb.append("LogEvents: " + getLogEvents() + ",");
        if (getSequenceToken() != null) sb.append("SequenceToken: " + getSequenceToken() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutLogEventsRequest == false) return false;
        PutLogEventsRequest other = (PutLogEventsRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        if (other.getLogEvents() == null ^ this.getLogEvents() == null) return false;
        if (other.getLogEvents() != null && other.getLogEvents().equals(this.getLogEvents()) == false) return false; 
        if (other.getSequenceToken() == null ^ this.getSequenceToken() == null) return false;
        if (other.getSequenceToken() != null && other.getSequenceToken().equals(this.getSequenceToken()) == false) return false; 
        return true;
    }
    
}
    