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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/TestMetricFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestMetricFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String filterPattern;
    /**
     * <p>
     * The log event messages to test.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logEventMessages;

    /**
     * @param filterPattern
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * @return
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @param filterPattern
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMetricFilterRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * 
     * @return The log event messages to test.
     */

    public java.util.List<String> getLogEventMessages() {
        if (logEventMessages == null) {
            logEventMessages = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logEventMessages;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * 
     * @param logEventMessages
     *        The log event messages to test.
     */

    public void setLogEventMessages(java.util.Collection<String> logEventMessages) {
        if (logEventMessages == null) {
            this.logEventMessages = null;
            return;
        }

        this.logEventMessages = new com.amazonaws.internal.SdkInternalList<String>(logEventMessages);
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogEventMessages(java.util.Collection)} or {@link #withLogEventMessages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param logEventMessages
     *        The log event messages to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMetricFilterRequest withLogEventMessages(String... logEventMessages) {
        if (this.logEventMessages == null) {
            setLogEventMessages(new com.amazonaws.internal.SdkInternalList<String>(logEventMessages.length));
        }
        for (String ele : logEventMessages) {
            this.logEventMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The log event messages to test.
     * </p>
     * 
     * @param logEventMessages
     *        The log event messages to test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMetricFilterRequest withLogEventMessages(java.util.Collection<String> logEventMessages) {
        setLogEventMessages(logEventMessages);
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
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getLogEventMessages() != null)
            sb.append("LogEventMessages: ").append(getLogEventMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMetricFilterRequest == false)
            return false;
        TestMetricFilterRequest other = (TestMetricFilterRequest) obj;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getLogEventMessages() == null ^ this.getLogEventMessages() == null)
            return false;
        if (other.getLogEventMessages() != null && other.getLogEventMessages().equals(this.getLogEventMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getLogEventMessages() == null) ? 0 : getLogEventMessages().hashCode());
        return hashCode;
    }

    @Override
    public TestMetricFilterRequest clone() {
        return (TestMetricFilterRequest) super.clone();
    }

}
