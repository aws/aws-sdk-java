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
 * Configures inspection of the response body. WAF can inspect the first 65,536 bytes (64 KB) of the response body. This
 * is part of the <code>ResponseInspection</code> configuration for <code>AWSManagedRulesATPRuleSet</code> and
 * <code>AWSManagedRulesACFPRuleSet</code>.
 * </p>
 * <note>
 * <p>
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ResponseInspectionBodyContains"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseInspectionBodyContains implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Strings in the body of the response that indicate a successful login or account creation attempt. To be counted
     * as a success, the string can be anywhere in the body and must be an exact match, including case. Each string must
     * be unique among the success and failure strings.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     * <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * </p>
     */
    private java.util.List<String> successStrings;
    /**
     * <p>
     * Strings in the body of the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the string can be anywhere in the body and must be an exact match, including case. Each string must be
     * unique among the success and failure strings.
     * </p>
     * <p>
     * JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * </p>
     */
    private java.util.List<String> failureStrings;

    /**
     * <p>
     * Strings in the body of the response that indicate a successful login or account creation attempt. To be counted
     * as a success, the string can be anywhere in the body and must be an exact match, including case. Each string must
     * be unique among the success and failure strings.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     * <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * </p>
     * 
     * @return Strings in the body of the response that indicate a successful login or account creation attempt. To be
     *         counted as a success, the string can be anywhere in the body and must be an exact match, including case.
     *         Each string must be unique among the success and failure strings. </p>
     *         <p>
     *         JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     *         <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     */

    public java.util.List<String> getSuccessStrings() {
        return successStrings;
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a successful login or account creation attempt. To be counted
     * as a success, the string can be anywhere in the body and must be an exact match, including case. Each string must
     * be unique among the success and failure strings.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     * <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * </p>
     * 
     * @param successStrings
     *        Strings in the body of the response that indicate a successful login or account creation attempt. To be
     *        counted as a success, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     *        <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     */

    public void setSuccessStrings(java.util.Collection<String> successStrings) {
        if (successStrings == null) {
            this.successStrings = null;
            return;
        }

        this.successStrings = new java.util.ArrayList<String>(successStrings);
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a successful login or account creation attempt. To be counted
     * as a success, the string can be anywhere in the body and must be an exact match, including case. Each string must
     * be unique among the success and failure strings.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     * <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessStrings(java.util.Collection)} or {@link #withSuccessStrings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param successStrings
     *        Strings in the body of the response that indicate a successful login or account creation attempt. To be
     *        counted as a success, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     *        <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionBodyContains withSuccessStrings(String... successStrings) {
        if (this.successStrings == null) {
            setSuccessStrings(new java.util.ArrayList<String>(successStrings.length));
        }
        for (String ele : successStrings) {
            this.successStrings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a successful login or account creation attempt. To be counted
     * as a success, the string can be anywhere in the body and must be an exact match, including case. Each string must
     * be unique among the success and failure strings.
     * </p>
     * <p>
     * JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     * <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * </p>
     * 
     * @param successStrings
     *        Strings in the body of the response that indicate a successful login or account creation attempt. To be
     *        counted as a success, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON examples: <code>"SuccessStrings": [ "Login successful" ]</code> and
     *        <code>"SuccessStrings": [ "Account creation successful", "Welcome to our site!" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionBodyContains withSuccessStrings(java.util.Collection<String> successStrings) {
        setSuccessStrings(successStrings);
        return this;
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the string can be anywhere in the body and must be an exact match, including case. Each string must be
     * unique among the success and failure strings.
     * </p>
     * <p>
     * JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * </p>
     * 
     * @return Strings in the body of the response that indicate a failed login or account creation attempt. To be
     *         counted as a failure, the string can be anywhere in the body and must be an exact match, including case.
     *         Each string must be unique among the success and failure strings. </p>
     *         <p>
     *         JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     */

    public java.util.List<String> getFailureStrings() {
        return failureStrings;
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the string can be anywhere in the body and must be an exact match, including case. Each string must be
     * unique among the success and failure strings.
     * </p>
     * <p>
     * JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * </p>
     * 
     * @param failureStrings
     *        Strings in the body of the response that indicate a failed login or account creation attempt. To be
     *        counted as a failure, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     */

    public void setFailureStrings(java.util.Collection<String> failureStrings) {
        if (failureStrings == null) {
            this.failureStrings = null;
            return;
        }

        this.failureStrings = new java.util.ArrayList<String>(failureStrings);
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the string can be anywhere in the body and must be an exact match, including case. Each string must be
     * unique among the success and failure strings.
     * </p>
     * <p>
     * JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureStrings(java.util.Collection)} or {@link #withFailureStrings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureStrings
     *        Strings in the body of the response that indicate a failed login or account creation attempt. To be
     *        counted as a failure, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionBodyContains withFailureStrings(String... failureStrings) {
        if (this.failureStrings == null) {
            setFailureStrings(new java.util.ArrayList<String>(failureStrings.length));
        }
        for (String ele : failureStrings) {
            this.failureStrings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Strings in the body of the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the string can be anywhere in the body and must be an exact match, including case. Each string must be
     * unique among the success and failure strings.
     * </p>
     * <p>
     * JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * </p>
     * 
     * @param failureStrings
     *        Strings in the body of the response that indicate a failed login or account creation attempt. To be
     *        counted as a failure, the string can be anywhere in the body and must be an exact match, including case.
     *        Each string must be unique among the success and failure strings. </p>
     *        <p>
     *        JSON example: <code>"FailureStrings": [ "Request failed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionBodyContains withFailureStrings(java.util.Collection<String> failureStrings) {
        setFailureStrings(failureStrings);
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
        if (getSuccessStrings() != null)
            sb.append("SuccessStrings: ").append(getSuccessStrings()).append(",");
        if (getFailureStrings() != null)
            sb.append("FailureStrings: ").append(getFailureStrings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseInspectionBodyContains == false)
            return false;
        ResponseInspectionBodyContains other = (ResponseInspectionBodyContains) obj;
        if (other.getSuccessStrings() == null ^ this.getSuccessStrings() == null)
            return false;
        if (other.getSuccessStrings() != null && other.getSuccessStrings().equals(this.getSuccessStrings()) == false)
            return false;
        if (other.getFailureStrings() == null ^ this.getFailureStrings() == null)
            return false;
        if (other.getFailureStrings() != null && other.getFailureStrings().equals(this.getFailureStrings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessStrings() == null) ? 0 : getSuccessStrings().hashCode());
        hashCode = prime * hashCode + ((getFailureStrings() == null) ? 0 : getFailureStrings().hashCode());
        return hashCode;
    }

    @Override
    public ResponseInspectionBodyContains clone() {
        try {
            return (ResponseInspectionBodyContains) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ResponseInspectionBodyContainsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
