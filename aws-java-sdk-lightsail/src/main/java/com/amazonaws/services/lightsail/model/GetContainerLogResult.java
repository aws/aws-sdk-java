/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerLog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerLogResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that describe the log events of a container.
     * </p>
     */
    private java.util.List<ContainerServiceLogEvent> logEvents;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of objects that describe the log events of a container.
     * </p>
     * 
     * @return An array of objects that describe the log events of a container.
     */

    public java.util.List<ContainerServiceLogEvent> getLogEvents() {
        return logEvents;
    }

    /**
     * <p>
     * An array of objects that describe the log events of a container.
     * </p>
     * 
     * @param logEvents
     *        An array of objects that describe the log events of a container.
     */

    public void setLogEvents(java.util.Collection<ContainerServiceLogEvent> logEvents) {
        if (logEvents == null) {
            this.logEvents = null;
            return;
        }

        this.logEvents = new java.util.ArrayList<ContainerServiceLogEvent>(logEvents);
    }

    /**
     * <p>
     * An array of objects that describe the log events of a container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogEvents(java.util.Collection)} or {@link #withLogEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logEvents
     *        An array of objects that describe the log events of a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogResult withLogEvents(ContainerServiceLogEvent... logEvents) {
        if (this.logEvents == null) {
            setLogEvents(new java.util.ArrayList<ContainerServiceLogEvent>(logEvents.length));
        }
        for (ContainerServiceLogEvent ele : logEvents) {
            this.logEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the log events of a container.
     * </p>
     * 
     * @param logEvents
     *        An array of objects that describe the log events of a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogResult withLogEvents(java.util.Collection<ContainerServiceLogEvent> logEvents) {
        setLogEvents(logEvents);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next
     *        page token using the <code>pageToken</code> parameter.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         A next page token is not returned if there are no more results to display.
     *         </p>
     *         <p>
     *         To get the next page of results, perform another <code>GetContainerLog</code> request and specify the
     *         next page token using the <code>pageToken</code> parameter.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * A next page token is not returned if there are no more results to display.
     * </p>
     * <p>
     * To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next page
     * token using the <code>pageToken</code> parameter.
     * </p>
     * 
     * @param nextPageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        A next page token is not returned if there are no more results to display.
     *        </p>
     *        <p>
     *        To get the next page of results, perform another <code>GetContainerLog</code> request and specify the next
     *        page token using the <code>pageToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerLogResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getLogEvents() != null)
            sb.append("LogEvents: ").append(getLogEvents()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContainerLogResult == false)
            return false;
        GetContainerLogResult other = (GetContainerLogResult) obj;
        if (other.getLogEvents() == null ^ this.getLogEvents() == null)
            return false;
        if (other.getLogEvents() != null && other.getLogEvents().equals(this.getLogEvents()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogEvents() == null) ? 0 : getLogEvents().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerLogResult clone() {
        try {
            return (GetContainerLogResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
