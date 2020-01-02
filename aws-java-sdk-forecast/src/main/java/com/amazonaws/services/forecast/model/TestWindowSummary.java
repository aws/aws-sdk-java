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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status, start time, and end time of a backtest, as well as a failure reason if applicable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TestWindowSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestWindowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the test began.
     * </p>
     */
    private java.util.Date testWindowStart;
    /**
     * <p>
     * The time at which the test ended.
     * </p>
     */
    private java.util.Date testWindowEnd;
    /**
     * <p>
     * The status of the test. Possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If the test failed, the reason why it failed.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The time at which the test began.
     * </p>
     * 
     * @param testWindowStart
     *        The time at which the test began.
     */

    public void setTestWindowStart(java.util.Date testWindowStart) {
        this.testWindowStart = testWindowStart;
    }

    /**
     * <p>
     * The time at which the test began.
     * </p>
     * 
     * @return The time at which the test began.
     */

    public java.util.Date getTestWindowStart() {
        return this.testWindowStart;
    }

    /**
     * <p>
     * The time at which the test began.
     * </p>
     * 
     * @param testWindowStart
     *        The time at which the test began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestWindowSummary withTestWindowStart(java.util.Date testWindowStart) {
        setTestWindowStart(testWindowStart);
        return this;
    }

    /**
     * <p>
     * The time at which the test ended.
     * </p>
     * 
     * @param testWindowEnd
     *        The time at which the test ended.
     */

    public void setTestWindowEnd(java.util.Date testWindowEnd) {
        this.testWindowEnd = testWindowEnd;
    }

    /**
     * <p>
     * The time at which the test ended.
     * </p>
     * 
     * @return The time at which the test ended.
     */

    public java.util.Date getTestWindowEnd() {
        return this.testWindowEnd;
    }

    /**
     * <p>
     * The time at which the test ended.
     * </p>
     * 
     * @param testWindowEnd
     *        The time at which the test ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestWindowSummary withTestWindowEnd(java.util.Date testWindowEnd) {
        setTestWindowEnd(testWindowEnd);
        return this;
    }

    /**
     * <p>
     * The status of the test. Possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the test. Possible status values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the test. Possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the test. Possible status values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the test. Possible status values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the test. Possible status values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestWindowSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If the test failed, the reason why it failed.
     * </p>
     * 
     * @param message
     *        If the test failed, the reason why it failed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If the test failed, the reason why it failed.
     * </p>
     * 
     * @return If the test failed, the reason why it failed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If the test failed, the reason why it failed.
     * </p>
     * 
     * @param message
     *        If the test failed, the reason why it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestWindowSummary withMessage(String message) {
        setMessage(message);
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
        if (getTestWindowStart() != null)
            sb.append("TestWindowStart: ").append(getTestWindowStart()).append(",");
        if (getTestWindowEnd() != null)
            sb.append("TestWindowEnd: ").append(getTestWindowEnd()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestWindowSummary == false)
            return false;
        TestWindowSummary other = (TestWindowSummary) obj;
        if (other.getTestWindowStart() == null ^ this.getTestWindowStart() == null)
            return false;
        if (other.getTestWindowStart() != null && other.getTestWindowStart().equals(this.getTestWindowStart()) == false)
            return false;
        if (other.getTestWindowEnd() == null ^ this.getTestWindowEnd() == null)
            return false;
        if (other.getTestWindowEnd() != null && other.getTestWindowEnd().equals(this.getTestWindowEnd()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestWindowStart() == null) ? 0 : getTestWindowStart().hashCode());
        hashCode = prime * hashCode + ((getTestWindowEnd() == null) ? 0 : getTestWindowEnd().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public TestWindowSummary clone() {
        try {
            return (TestWindowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.TestWindowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
