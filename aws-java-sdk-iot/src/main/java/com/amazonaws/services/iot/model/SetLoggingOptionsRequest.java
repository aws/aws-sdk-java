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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the SetLoggingOptions operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetLoggingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The logging options payload.
     * </p>
     */
    private LoggingOptionsPayload loggingOptionsPayload;

    /**
     * <p>
     * The logging options payload.
     * </p>
     * 
     * @param loggingOptionsPayload
     *        The logging options payload.
     */

    public void setLoggingOptionsPayload(LoggingOptionsPayload loggingOptionsPayload) {
        this.loggingOptionsPayload = loggingOptionsPayload;
    }

    /**
     * <p>
     * The logging options payload.
     * </p>
     * 
     * @return The logging options payload.
     */

    public LoggingOptionsPayload getLoggingOptionsPayload() {
        return this.loggingOptionsPayload;
    }

    /**
     * <p>
     * The logging options payload.
     * </p>
     * 
     * @param loggingOptionsPayload
     *        The logging options payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetLoggingOptionsRequest withLoggingOptionsPayload(LoggingOptionsPayload loggingOptionsPayload) {
        setLoggingOptionsPayload(loggingOptionsPayload);
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
        if (getLoggingOptionsPayload() != null)
            sb.append("LoggingOptionsPayload: ").append(getLoggingOptionsPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoggingOptionsRequest == false)
            return false;
        SetLoggingOptionsRequest other = (SetLoggingOptionsRequest) obj;
        if (other.getLoggingOptionsPayload() == null ^ this.getLoggingOptionsPayload() == null)
            return false;
        if (other.getLoggingOptionsPayload() != null && other.getLoggingOptionsPayload().equals(this.getLoggingOptionsPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggingOptionsPayload() == null) ? 0 : getLoggingOptionsPayload().hashCode());
        return hashCode;
    }

    @Override
    public SetLoggingOptionsRequest clone() {
        return (SetLoggingOptionsRequest) super.clone();
    }

}
