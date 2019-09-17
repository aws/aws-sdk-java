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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a crawl in the workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Crawl" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Crawl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the crawler.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     */
    private String logStream;

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * 
     * @param state
     *        The state of the crawler.
     * @see CrawlState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * 
     * @return The state of the crawler.
     * @see CrawlState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * 
     * @param state
     *        The state of the crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlState
     */

    public Crawl withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the crawler.
     * </p>
     * 
     * @param state
     *        The state of the crawler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrawlState
     */

    public Crawl withState(CrawlState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @param startedOn
     *        The date and time on which the crawl started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @return The date and time on which the crawl started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl started.
     * </p>
     * 
     * @param startedOn
     *        The date and time on which the crawl started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawl withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time on which the crawl completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     * 
     * @return The date and time on which the crawl completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * The date and time on which the crawl completed.
     * </p>
     * 
     * @param completedOn
     *        The date and time on which the crawl completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawl withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the crawl.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * 
     * @return The error message associated with the crawl.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message associated with the crawl.
     * </p>
     * 
     * @param errorMessage
     *        The error message associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawl withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group associated with the crawl.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @return The log group associated with the crawl.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The log group associated with the crawl.
     * </p>
     * 
     * @param logGroup
     *        The log group associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawl withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream associated with the crawl.
     */

    public void setLogStream(String logStream) {
        this.logStream = logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @return The log stream associated with the crawl.
     */

    public String getLogStream() {
        return this.logStream;
    }

    /**
     * <p>
     * The log stream associated with the crawl.
     * </p>
     * 
     * @param logStream
     *        The log stream associated with the crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Crawl withLogStream(String logStream) {
        setLogStream(logStream);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getLogStream() != null)
            sb.append("LogStream: ").append(getLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Crawl == false)
            return false;
        Crawl other = (Crawl) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getLogStream() == null ^ this.getLogStream() == null)
            return false;
        if (other.getLogStream() != null && other.getLogStream().equals(this.getLogStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getLogStream() == null) ? 0 : getLogStream().hashCode());
        return hashCode;
    }

    @Override
    public Crawl clone() {
        try {
            return (Crawl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
