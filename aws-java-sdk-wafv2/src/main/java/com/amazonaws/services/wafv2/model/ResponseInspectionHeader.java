/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures inspection of the response header. This is part of the <code>ResponseInspection</code> configuration for
 * <code>AWSManagedRulesATPRuleSet</code> and <code>AWSManagedRulesACFPRuleSet</code>.
 * </p>
 * <note>
 * <p>
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ResponseInspectionHeader" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseInspectionHeader implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the header to match against. The name must be an exact match, including case.
     * </p>
     * <p>
     * JSON example: <code>"Name": [ "RequestResult" ]</code>
     * </p>
     */
    private String name;
    /**
     * <p>
     * Values in the response header with the specified name that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     * <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * </p>
     */
    private java.util.List<String> successValues;
    /**
     * <p>
     * Values in the response header with the specified name that indicate a failed login or account creation attempt.
     * To be counted as a failure, the value must be an exact match, including case. Each value must be unique among the
     * success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     * <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * </p>
     */
    private java.util.List<String> failureValues;

    /**
     * <p>
     * The name of the header to match against. The name must be an exact match, including case.
     * </p>
     * <p>
     * JSON example: <code>"Name": [ "RequestResult" ]</code>
     * </p>
     * 
     * @param name
     *        The name of the header to match against. The name must be an exact match, including case.</p>
     *        <p>
     *        JSON example: <code>"Name": [ "RequestResult" ]</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the header to match against. The name must be an exact match, including case.
     * </p>
     * <p>
     * JSON example: <code>"Name": [ "RequestResult" ]</code>
     * </p>
     * 
     * @return The name of the header to match against. The name must be an exact match, including case.</p>
     *         <p>
     *         JSON example: <code>"Name": [ "RequestResult" ]</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the header to match against. The name must be an exact match, including case.
     * </p>
     * <p>
     * JSON example: <code>"Name": [ "RequestResult" ]</code>
     * </p>
     * 
     * @param name
     *        The name of the header to match against. The name must be an exact match, including case.</p>
     *        <p>
     *        JSON example: <code>"Name": [ "RequestResult" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionHeader withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     * <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * </p>
     * 
     * @return Values in the response header with the specified name that indicate a successful login or account
     *         creation attempt. To be counted as a success, the value must be an exact match, including case. Each
     *         value must be unique among the success and failure values. </p>
     *         <p>
     *         JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     *         <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     */

    public java.util.List<String> getSuccessValues() {
        return successValues;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     * <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * </p>
     * 
     * @param successValues
     *        Values in the response header with the specified name that indicate a successful login or account creation
     *        attempt. To be counted as a success, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     *        <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     */

    public void setSuccessValues(java.util.Collection<String> successValues) {
        if (successValues == null) {
            this.successValues = null;
            return;
        }

        this.successValues = new java.util.ArrayList<String>(successValues);
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     * <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessValues(java.util.Collection)} or {@link #withSuccessValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param successValues
     *        Values in the response header with the specified name that indicate a successful login or account creation
     *        attempt. To be counted as a success, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     *        <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionHeader withSuccessValues(String... successValues) {
        if (this.successValues == null) {
            setSuccessValues(new java.util.ArrayList<String>(successValues.length));
        }
        for (String ele : successValues) {
            this.successValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     * <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * </p>
     * 
     * @param successValues
     *        Values in the response header with the specified name that indicate a successful login or account creation
     *        attempt. To be counted as a success, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"SuccessValues": [ "LoginPassed", "Successful login" ]</code> and
     *        <code>"SuccessValues": [ "AccountCreated", "Successful account creation" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionHeader withSuccessValues(java.util.Collection<String> successValues) {
        setSuccessValues(successValues);
        return this;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a failed login or account creation attempt.
     * To be counted as a failure, the value must be an exact match, including case. Each value must be unique among the
     * success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     * <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * </p>
     * 
     * @return Values in the response header with the specified name that indicate a failed login or account creation
     *         attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *         unique among the success and failure values. </p>
     *         <p>
     *         JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     *         <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     */

    public java.util.List<String> getFailureValues() {
        return failureValues;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a failed login or account creation attempt.
     * To be counted as a failure, the value must be an exact match, including case. Each value must be unique among the
     * success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     * <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * </p>
     * 
     * @param failureValues
     *        Values in the response header with the specified name that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     *        <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     */

    public void setFailureValues(java.util.Collection<String> failureValues) {
        if (failureValues == null) {
            this.failureValues = null;
            return;
        }

        this.failureValues = new java.util.ArrayList<String>(failureValues);
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a failed login or account creation attempt.
     * To be counted as a failure, the value must be an exact match, including case. Each value must be unique among the
     * success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     * <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureValues(java.util.Collection)} or {@link #withFailureValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureValues
     *        Values in the response header with the specified name that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     *        <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionHeader withFailureValues(String... failureValues) {
        if (this.failureValues == null) {
            setFailureValues(new java.util.ArrayList<String>(failureValues.length));
        }
        for (String ele : failureValues) {
            this.failureValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Values in the response header with the specified name that indicate a failed login or account creation attempt.
     * To be counted as a failure, the value must be an exact match, including case. Each value must be unique among the
     * success and failure values.
     * </p>
     * <p>
     * JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     * <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * </p>
     * 
     * @param failureValues
     *        Values in the response header with the specified name that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON examples: <code>"FailureValues": [ "LoginFailed", "Failed login" ]</code> and
     *        <code>"FailureValues": [ "AccountCreationFailed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionHeader withFailureValues(java.util.Collection<String> failureValues) {
        setFailureValues(failureValues);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSuccessValues() != null)
            sb.append("SuccessValues: ").append(getSuccessValues()).append(",");
        if (getFailureValues() != null)
            sb.append("FailureValues: ").append(getFailureValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseInspectionHeader == false)
            return false;
        ResponseInspectionHeader other = (ResponseInspectionHeader) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSuccessValues() == null ^ this.getSuccessValues() == null)
            return false;
        if (other.getSuccessValues() != null && other.getSuccessValues().equals(this.getSuccessValues()) == false)
            return false;
        if (other.getFailureValues() == null ^ this.getFailureValues() == null)
            return false;
        if (other.getFailureValues() != null && other.getFailureValues().equals(this.getFailureValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSuccessValues() == null) ? 0 : getSuccessValues().hashCode());
        hashCode = prime * hashCode + ((getFailureValues() == null) ? 0 : getFailureValues().hashCode());
        return hashCode;
    }

    @Override
    public ResponseInspectionHeader clone() {
        try {
            return (ResponseInspectionHeader) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ResponseInspectionHeaderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
