/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a retry policy. Specify at least one value for at least one of the types of
 * <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HttpRetryPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRetryPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> httpRetryEvents;
    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     */
    private Long maxRetries;
    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     */
    private Duration perRetryTimeout;
    /**
     * <p>
     * Specify a valid value.
     * </p>
     */
    private java.util.List<String> tcpRetryEvents;

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify at least one of the following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>client-error</b> – HTTP status code 409
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>stream-error</b> – Retry on refused stream
     *         </p>
     *         </li>
     */

    public java.util.List<String> getHttpRetryEvents() {
        return httpRetryEvents;
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpRetryEvents
     *        Specify at least one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>client-error</b> – HTTP status code 409
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>stream-error</b> – Retry on refused stream
     *        </p>
     *        </li>
     */

    public void setHttpRetryEvents(java.util.Collection<String> httpRetryEvents) {
        if (httpRetryEvents == null) {
            this.httpRetryEvents = null;
            return;
        }

        this.httpRetryEvents = new java.util.ArrayList<String>(httpRetryEvents);
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHttpRetryEvents(java.util.Collection)} or {@link #withHttpRetryEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param httpRetryEvents
     *        Specify at least one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>client-error</b> – HTTP status code 409
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>stream-error</b> – Retry on refused stream
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRetryPolicy withHttpRetryEvents(String... httpRetryEvents) {
        if (this.httpRetryEvents == null) {
            setHttpRetryEvents(new java.util.ArrayList<String>(httpRetryEvents.length));
        }
        for (String ele : httpRetryEvents) {
            this.httpRetryEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * 
     * @param httpRetryEvents
     *        Specify at least one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>client-error</b> – HTTP status code 409
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>stream-error</b> – Retry on refused stream
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRetryPolicy withHttpRetryEvents(java.util.Collection<String> httpRetryEvents) {
        setHttpRetryEvents(httpRetryEvents);
        return this;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of retry attempts.
     */

    public void setMaxRetries(Long maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * 
     * @return The maximum number of retry attempts.
     */

    public Long getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of retry attempts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRetryPolicy withMaxRetries(Long maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     * 
     * @param perRetryTimeout
     *        An object that represents a duration of time.
     */

    public void setPerRetryTimeout(Duration perRetryTimeout) {
        this.perRetryTimeout = perRetryTimeout;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     * 
     * @return An object that represents a duration of time.
     */

    public Duration getPerRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     * 
     * @param perRetryTimeout
     *        An object that represents a duration of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpRetryPolicy withPerRetryTimeout(Duration perRetryTimeout) {
        setPerRetryTimeout(perRetryTimeout);
        return this;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * 
     * @return Specify a valid value.
     * @see TcpRetryPolicyEvent
     */

    public java.util.List<String> getTcpRetryEvents() {
        return tcpRetryEvents;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * 
     * @param tcpRetryEvents
     *        Specify a valid value.
     * @see TcpRetryPolicyEvent
     */

    public void setTcpRetryEvents(java.util.Collection<String> tcpRetryEvents) {
        if (tcpRetryEvents == null) {
            this.tcpRetryEvents = null;
            return;
        }

        this.tcpRetryEvents = new java.util.ArrayList<String>(tcpRetryEvents);
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTcpRetryEvents(java.util.Collection)} or {@link #withTcpRetryEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tcpRetryEvents
     *        Specify a valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TcpRetryPolicyEvent
     */

    public HttpRetryPolicy withTcpRetryEvents(String... tcpRetryEvents) {
        if (this.tcpRetryEvents == null) {
            setTcpRetryEvents(new java.util.ArrayList<String>(tcpRetryEvents.length));
        }
        for (String ele : tcpRetryEvents) {
            this.tcpRetryEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * 
     * @param tcpRetryEvents
     *        Specify a valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TcpRetryPolicyEvent
     */

    public HttpRetryPolicy withTcpRetryEvents(java.util.Collection<String> tcpRetryEvents) {
        setTcpRetryEvents(tcpRetryEvents);
        return this;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * 
     * @param tcpRetryEvents
     *        Specify a valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TcpRetryPolicyEvent
     */

    public HttpRetryPolicy withTcpRetryEvents(TcpRetryPolicyEvent... tcpRetryEvents) {
        java.util.ArrayList<String> tcpRetryEventsCopy = new java.util.ArrayList<String>(tcpRetryEvents.length);
        for (TcpRetryPolicyEvent value : tcpRetryEvents) {
            tcpRetryEventsCopy.add(value.toString());
        }
        if (getTcpRetryEvents() == null) {
            setTcpRetryEvents(tcpRetryEventsCopy);
        } else {
            getTcpRetryEvents().addAll(tcpRetryEventsCopy);
        }
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
        if (getHttpRetryEvents() != null)
            sb.append("HttpRetryEvents: ").append(getHttpRetryEvents()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getPerRetryTimeout() != null)
            sb.append("PerRetryTimeout: ").append(getPerRetryTimeout()).append(",");
        if (getTcpRetryEvents() != null)
            sb.append("TcpRetryEvents: ").append(getTcpRetryEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRetryPolicy == false)
            return false;
        HttpRetryPolicy other = (HttpRetryPolicy) obj;
        if (other.getHttpRetryEvents() == null ^ this.getHttpRetryEvents() == null)
            return false;
        if (other.getHttpRetryEvents() != null && other.getHttpRetryEvents().equals(this.getHttpRetryEvents()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getPerRetryTimeout() == null ^ this.getPerRetryTimeout() == null)
            return false;
        if (other.getPerRetryTimeout() != null && other.getPerRetryTimeout().equals(this.getPerRetryTimeout()) == false)
            return false;
        if (other.getTcpRetryEvents() == null ^ this.getTcpRetryEvents() == null)
            return false;
        if (other.getTcpRetryEvents() != null && other.getTcpRetryEvents().equals(this.getTcpRetryEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpRetryEvents() == null) ? 0 : getHttpRetryEvents().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getPerRetryTimeout() == null) ? 0 : getPerRetryTimeout().hashCode());
        hashCode = prime * hashCode + ((getTcpRetryEvents() == null) ? 0 : getTcpRetryEvents().hashCode());
        return hashCode;
    }

    @Override
    public HttpRetryPolicy clone() {
        try {
            return (HttpRetryPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HttpRetryPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
