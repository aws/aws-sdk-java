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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An action taken by a <a>TestGridSession</a> browser instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/TestGridSessionAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestGridSessionAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action taken by the session.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The time that the session invoked the action.
     * </p>
     */
    private java.util.Date started;
    /**
     * <p>
     * The time, in milliseconds, that the action took to complete in the browser.
     * </p>
     */
    private Long duration;
    /**
     * <p>
     * HTTP status code returned to the browser when the action was taken.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * HTTP method that the browser used to make the request.
     * </p>
     */
    private String requestMethod;

    /**
     * <p>
     * The action taken by the session.
     * </p>
     * 
     * @param action
     *        The action taken by the session.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action taken by the session.
     * </p>
     * 
     * @return The action taken by the session.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action taken by the session.
     * </p>
     * 
     * @param action
     *        The action taken by the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionAction withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The time that the session invoked the action.
     * </p>
     * 
     * @param started
     *        The time that the session invoked the action.
     */

    public void setStarted(java.util.Date started) {
        this.started = started;
    }

    /**
     * <p>
     * The time that the session invoked the action.
     * </p>
     * 
     * @return The time that the session invoked the action.
     */

    public java.util.Date getStarted() {
        return this.started;
    }

    /**
     * <p>
     * The time that the session invoked the action.
     * </p>
     * 
     * @param started
     *        The time that the session invoked the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionAction withStarted(java.util.Date started) {
        setStarted(started);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds, that the action took to complete in the browser.
     * </p>
     * 
     * @param duration
     *        The time, in milliseconds, that the action took to complete in the browser.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The time, in milliseconds, that the action took to complete in the browser.
     * </p>
     * 
     * @return The time, in milliseconds, that the action took to complete in the browser.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The time, in milliseconds, that the action took to complete in the browser.
     * </p>
     * 
     * @param duration
     *        The time, in milliseconds, that the action took to complete in the browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionAction withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * HTTP status code returned to the browser when the action was taken.
     * </p>
     * 
     * @param statusCode
     *        HTTP status code returned to the browser when the action was taken.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * HTTP status code returned to the browser when the action was taken.
     * </p>
     * 
     * @return HTTP status code returned to the browser when the action was taken.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * HTTP status code returned to the browser when the action was taken.
     * </p>
     * 
     * @param statusCode
     *        HTTP status code returned to the browser when the action was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionAction withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * HTTP method that the browser used to make the request.
     * </p>
     * 
     * @param requestMethod
     *        HTTP method that the browser used to make the request.
     */

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * <p>
     * HTTP method that the browser used to make the request.
     * </p>
     * 
     * @return HTTP method that the browser used to make the request.
     */

    public String getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * <p>
     * HTTP method that the browser used to make the request.
     * </p>
     * 
     * @param requestMethod
     *        HTTP method that the browser used to make the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestGridSessionAction withRequestMethod(String requestMethod) {
        setRequestMethod(requestMethod);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStarted() != null)
            sb.append("Started: ").append(getStarted()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getRequestMethod() != null)
            sb.append("RequestMethod: ").append(getRequestMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestGridSessionAction == false)
            return false;
        TestGridSessionAction other = (TestGridSessionAction) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStarted() == null ^ this.getStarted() == null)
            return false;
        if (other.getStarted() != null && other.getStarted().equals(this.getStarted()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getRequestMethod() == null ^ this.getRequestMethod() == null)
            return false;
        if (other.getRequestMethod() != null && other.getRequestMethod().equals(this.getRequestMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStarted() == null) ? 0 : getStarted().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getRequestMethod() == null) ? 0 : getRequestMethod().hashCode());
        return hashCode;
    }

    @Override
    public TestGridSessionAction clone() {
        try {
            return (TestGridSessionAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.TestGridSessionActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
