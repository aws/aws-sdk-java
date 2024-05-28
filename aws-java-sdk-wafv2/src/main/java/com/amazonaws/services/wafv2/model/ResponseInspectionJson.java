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
 * Configures inspection of the response JSON. WAF can inspect the first 65,536 bytes (64 KB) of the response JSON. This
 * is part of the <code>ResponseInspection</code> configuration for <code>AWSManagedRulesATPRuleSet</code> and
 * <code>AWSManagedRulesACFPRuleSet</code>.
 * </p>
 * <note>
 * <p>
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ResponseInspectionJson" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseInspectionJson implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the value to match against in the JSON. The identifier must be an exact match, including case.
     * </p>
     * <p>
     * JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     * <code>"Identifier": [ "/sign-up/success" ]</code>
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * </p>
     */
    private java.util.List<String> successValues;
    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a failed login or account creation
     * attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * </p>
     */
    private java.util.List<String> failureValues;

    /**
     * <p>
     * The identifier for the value to match against in the JSON. The identifier must be an exact match, including case.
     * </p>
     * <p>
     * JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     * <code>"Identifier": [ "/sign-up/success" ]</code>
     * </p>
     * 
     * @param identifier
     *        The identifier for the value to match against in the JSON. The identifier must be an exact match,
     *        including case.</p>
     *        <p>
     *        JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     *        <code>"Identifier": [ "/sign-up/success" ]</code>
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier for the value to match against in the JSON. The identifier must be an exact match, including case.
     * </p>
     * <p>
     * JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     * <code>"Identifier": [ "/sign-up/success" ]</code>
     * </p>
     * 
     * @return The identifier for the value to match against in the JSON. The identifier must be an exact match,
     *         including case.</p>
     *         <p>
     *         JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     *         <code>"Identifier": [ "/sign-up/success" ]</code>
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier for the value to match against in the JSON. The identifier must be an exact match, including case.
     * </p>
     * <p>
     * JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     * <code>"Identifier": [ "/sign-up/success" ]</code>
     * </p>
     * 
     * @param identifier
     *        The identifier for the value to match against in the JSON. The identifier must be an exact match,
     *        including case.</p>
     *        <p>
     *        JSON examples: <code>"Identifier": [ "/login/success" ]</code> and
     *        <code>"Identifier": [ "/sign-up/success" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionJson withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * </p>
     * 
     * @return Values for the specified identifier in the response JSON that indicate a successful login or account
     *         creation attempt. To be counted as a success, the value must be an exact match, including case. Each
     *         value must be unique among the success and failure values. </p>
     *         <p>
     *         JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     */

    public java.util.List<String> getSuccessValues() {
        return successValues;
    }

    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * </p>
     * 
     * @param successValues
     *        Values for the specified identifier in the response JSON that indicate a successful login or account
     *        creation attempt. To be counted as a success, the value must be an exact match, including case. Each value
     *        must be unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
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
     * Values for the specified identifier in the response JSON that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessValues(java.util.Collection)} or {@link #withSuccessValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param successValues
     *        Values for the specified identifier in the response JSON that indicate a successful login or account
     *        creation attempt. To be counted as a success, the value must be an exact match, including case. Each value
     *        must be unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionJson withSuccessValues(String... successValues) {
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
     * Values for the specified identifier in the response JSON that indicate a successful login or account creation
     * attempt. To be counted as a success, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * </p>
     * 
     * @param successValues
     *        Values for the specified identifier in the response JSON that indicate a successful login or account
     *        creation attempt. To be counted as a success, the value must be an exact match, including case. Each value
     *        must be unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"SuccessValues": [ "True", "Succeeded" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionJson withSuccessValues(java.util.Collection<String> successValues) {
        setSuccessValues(successValues);
        return this;
    }

    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a failed login or account creation
     * attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * </p>
     * 
     * @return Values for the specified identifier in the response JSON that indicate a failed login or account creation
     *         attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *         unique among the success and failure values. </p>
     *         <p>
     *         JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     */

    public java.util.List<String> getFailureValues() {
        return failureValues;
    }

    /**
     * <p>
     * Values for the specified identifier in the response JSON that indicate a failed login or account creation
     * attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * </p>
     * 
     * @param failureValues
     *        Values for the specified identifier in the response JSON that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
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
     * Values for the specified identifier in the response JSON that indicate a failed login or account creation
     * attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureValues(java.util.Collection)} or {@link #withFailureValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureValues
     *        Values for the specified identifier in the response JSON that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionJson withFailureValues(String... failureValues) {
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
     * Values for the specified identifier in the response JSON that indicate a failed login or account creation
     * attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be unique
     * among the success and failure values.
     * </p>
     * <p>
     * JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * </p>
     * 
     * @param failureValues
     *        Values for the specified identifier in the response JSON that indicate a failed login or account creation
     *        attempt. To be counted as a failure, the value must be an exact match, including case. Each value must be
     *        unique among the success and failure values. </p>
     *        <p>
     *        JSON example: <code>"FailureValues": [ "False", "Failed" ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionJson withFailureValues(java.util.Collection<String> failureValues) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof ResponseInspectionJson == false)
            return false;
        ResponseInspectionJson other = (ResponseInspectionJson) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSuccessValues() == null) ? 0 : getSuccessValues().hashCode());
        hashCode = prime * hashCode + ((getFailureValues() == null) ? 0 : getFailureValues().hashCode());
        return hashCode;
    }

    @Override
    public ResponseInspectionJson clone() {
        try {
            return (ResponseInspectionJson) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ResponseInspectionJsonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
