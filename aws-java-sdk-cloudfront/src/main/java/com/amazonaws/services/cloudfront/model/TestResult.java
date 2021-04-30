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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of testing a CloudFront function with <code>TestFunction</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/TestResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestResult implements Serializable, Cloneable {

    /**
     * <p>
     * Contains configuration information and metadata about the CloudFront function that was tested.
     * </p>
     */
    private FunctionSummary functionSummary;
    /**
     * <p>
     * The amount of time that the function took to run as a percentage of the maximum allowed time. For example, a
     * compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     * </p>
     */
    private String computeUtilization;
    /**
     * <p>
     * Contains the log lines that the function wrote (if any) when running the test.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> functionExecutionLogs;
    /**
     * <p>
     * If the result of testing the function was an error, this field contains the error message.
     * </p>
     */
    private String functionErrorMessage;
    /**
     * <p>
     * The event object returned by the function. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html">Event
     * object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String functionOutput;

    /**
     * <p>
     * Contains configuration information and metadata about the CloudFront function that was tested.
     * </p>
     * 
     * @param functionSummary
     *        Contains configuration information and metadata about the CloudFront function that was tested.
     */

    public void setFunctionSummary(FunctionSummary functionSummary) {
        this.functionSummary = functionSummary;
    }

    /**
     * <p>
     * Contains configuration information and metadata about the CloudFront function that was tested.
     * </p>
     * 
     * @return Contains configuration information and metadata about the CloudFront function that was tested.
     */

    public FunctionSummary getFunctionSummary() {
        return this.functionSummary;
    }

    /**
     * <p>
     * Contains configuration information and metadata about the CloudFront function that was tested.
     * </p>
     * 
     * @param functionSummary
     *        Contains configuration information and metadata about the CloudFront function that was tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withFunctionSummary(FunctionSummary functionSummary) {
        setFunctionSummary(functionSummary);
        return this;
    }

    /**
     * <p>
     * The amount of time that the function took to run as a percentage of the maximum allowed time. For example, a
     * compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     * </p>
     * 
     * @param computeUtilization
     *        The amount of time that the function took to run as a percentage of the maximum allowed time. For example,
     *        a compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     */

    public void setComputeUtilization(String computeUtilization) {
        this.computeUtilization = computeUtilization;
    }

    /**
     * <p>
     * The amount of time that the function took to run as a percentage of the maximum allowed time. For example, a
     * compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     * </p>
     * 
     * @return The amount of time that the function took to run as a percentage of the maximum allowed time. For
     *         example, a compute utilization of 35 means that the function completed in 35% of the maximum allowed
     *         time.
     */

    public String getComputeUtilization() {
        return this.computeUtilization;
    }

    /**
     * <p>
     * The amount of time that the function took to run as a percentage of the maximum allowed time. For example, a
     * compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     * </p>
     * 
     * @param computeUtilization
     *        The amount of time that the function took to run as a percentage of the maximum allowed time. For example,
     *        a compute utilization of 35 means that the function completed in 35% of the maximum allowed time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withComputeUtilization(String computeUtilization) {
        setComputeUtilization(computeUtilization);
        return this;
    }

    /**
     * <p>
     * Contains the log lines that the function wrote (if any) when running the test.
     * </p>
     * 
     * @return Contains the log lines that the function wrote (if any) when running the test.
     */

    public java.util.List<String> getFunctionExecutionLogs() {
        if (functionExecutionLogs == null) {
            functionExecutionLogs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return functionExecutionLogs;
    }

    /**
     * <p>
     * Contains the log lines that the function wrote (if any) when running the test.
     * </p>
     * 
     * @param functionExecutionLogs
     *        Contains the log lines that the function wrote (if any) when running the test.
     */

    public void setFunctionExecutionLogs(java.util.Collection<String> functionExecutionLogs) {
        if (functionExecutionLogs == null) {
            this.functionExecutionLogs = null;
            return;
        }

        this.functionExecutionLogs = new com.amazonaws.internal.SdkInternalList<String>(functionExecutionLogs);
    }

    /**
     * <p>
     * Contains the log lines that the function wrote (if any) when running the test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionExecutionLogs(java.util.Collection)} or
     * {@link #withFunctionExecutionLogs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param functionExecutionLogs
     *        Contains the log lines that the function wrote (if any) when running the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withFunctionExecutionLogs(String... functionExecutionLogs) {
        if (this.functionExecutionLogs == null) {
            setFunctionExecutionLogs(new com.amazonaws.internal.SdkInternalList<String>(functionExecutionLogs.length));
        }
        for (String ele : functionExecutionLogs) {
            this.functionExecutionLogs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the log lines that the function wrote (if any) when running the test.
     * </p>
     * 
     * @param functionExecutionLogs
     *        Contains the log lines that the function wrote (if any) when running the test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withFunctionExecutionLogs(java.util.Collection<String> functionExecutionLogs) {
        setFunctionExecutionLogs(functionExecutionLogs);
        return this;
    }

    /**
     * <p>
     * If the result of testing the function was an error, this field contains the error message.
     * </p>
     * 
     * @param functionErrorMessage
     *        If the result of testing the function was an error, this field contains the error message.
     */

    public void setFunctionErrorMessage(String functionErrorMessage) {
        this.functionErrorMessage = functionErrorMessage;
    }

    /**
     * <p>
     * If the result of testing the function was an error, this field contains the error message.
     * </p>
     * 
     * @return If the result of testing the function was an error, this field contains the error message.
     */

    public String getFunctionErrorMessage() {
        return this.functionErrorMessage;
    }

    /**
     * <p>
     * If the result of testing the function was an error, this field contains the error message.
     * </p>
     * 
     * @param functionErrorMessage
     *        If the result of testing the function was an error, this field contains the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withFunctionErrorMessage(String functionErrorMessage) {
        setFunctionErrorMessage(functionErrorMessage);
        return this;
    }

    /**
     * <p>
     * The event object returned by the function. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html">Event
     * object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param functionOutput
     *        The event object returned by the function. For more information about the structure of the event object,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html"
     *        >Event object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setFunctionOutput(String functionOutput) {
        this.functionOutput = functionOutput;
    }

    /**
     * <p>
     * The event object returned by the function. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html">Event
     * object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The event object returned by the function. For more information about the structure of the event object,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html">Event
     *         object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getFunctionOutput() {
        return this.functionOutput;
    }

    /**
     * <p>
     * The event object returned by the function. For more information about the structure of the event object, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html">Event
     * object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param functionOutput
     *        The event object returned by the function. For more information about the structure of the event object,
     *        see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/functions-event-structure.html"
     *        >Event object structure</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestResult withFunctionOutput(String functionOutput) {
        setFunctionOutput(functionOutput);
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
        if (getFunctionSummary() != null)
            sb.append("FunctionSummary: ").append(getFunctionSummary()).append(",");
        if (getComputeUtilization() != null)
            sb.append("ComputeUtilization: ").append(getComputeUtilization()).append(",");
        if (getFunctionExecutionLogs() != null)
            sb.append("FunctionExecutionLogs: ").append(getFunctionExecutionLogs()).append(",");
        if (getFunctionErrorMessage() != null)
            sb.append("FunctionErrorMessage: ").append(getFunctionErrorMessage()).append(",");
        if (getFunctionOutput() != null)
            sb.append("FunctionOutput: ").append(getFunctionOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestResult == false)
            return false;
        TestResult other = (TestResult) obj;
        if (other.getFunctionSummary() == null ^ this.getFunctionSummary() == null)
            return false;
        if (other.getFunctionSummary() != null && other.getFunctionSummary().equals(this.getFunctionSummary()) == false)
            return false;
        if (other.getComputeUtilization() == null ^ this.getComputeUtilization() == null)
            return false;
        if (other.getComputeUtilization() != null && other.getComputeUtilization().equals(this.getComputeUtilization()) == false)
            return false;
        if (other.getFunctionExecutionLogs() == null ^ this.getFunctionExecutionLogs() == null)
            return false;
        if (other.getFunctionExecutionLogs() != null && other.getFunctionExecutionLogs().equals(this.getFunctionExecutionLogs()) == false)
            return false;
        if (other.getFunctionErrorMessage() == null ^ this.getFunctionErrorMessage() == null)
            return false;
        if (other.getFunctionErrorMessage() != null && other.getFunctionErrorMessage().equals(this.getFunctionErrorMessage()) == false)
            return false;
        if (other.getFunctionOutput() == null ^ this.getFunctionOutput() == null)
            return false;
        if (other.getFunctionOutput() != null && other.getFunctionOutput().equals(this.getFunctionOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionSummary() == null) ? 0 : getFunctionSummary().hashCode());
        hashCode = prime * hashCode + ((getComputeUtilization() == null) ? 0 : getComputeUtilization().hashCode());
        hashCode = prime * hashCode + ((getFunctionExecutionLogs() == null) ? 0 : getFunctionExecutionLogs().hashCode());
        hashCode = prime * hashCode + ((getFunctionErrorMessage() == null) ? 0 : getFunctionErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFunctionOutput() == null) ? 0 : getFunctionOutput().hashCode());
        return hashCode;
    }

    @Override
    public TestResult clone() {
        try {
            return (TestResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
