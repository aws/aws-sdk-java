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
 * Configures inspection of the response status code. This is part of the <code>ResponseInspection</code> configuration
 * for <code>AWSManagedRulesATPRuleSet</code> and <code>AWSManagedRulesACFPRuleSet</code>.
 * </p>
 * <note>
 * <p>
 * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ResponseInspectionStatusCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseInspectionStatusCode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status codes in the response that indicate a successful login or account creation attempt. To be counted as a
     * success, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * </p>
     */
    private java.util.List<Integer> successCodes;
    /**
     * <p>
     * Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * </p>
     */
    private java.util.List<Integer> failureCodes;

    /**
     * <p>
     * Status codes in the response that indicate a successful login or account creation attempt. To be counted as a
     * success, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * </p>
     * 
     * @return Status codes in the response that indicate a successful login or account creation attempt. To be counted
     *         as a success, the response status code must match one of these. Each code must be unique among the
     *         success and failure status codes. </p>
     *         <p>
     *         JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     */

    public java.util.List<Integer> getSuccessCodes() {
        return successCodes;
    }

    /**
     * <p>
     * Status codes in the response that indicate a successful login or account creation attempt. To be counted as a
     * success, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * </p>
     * 
     * @param successCodes
     *        Status codes in the response that indicate a successful login or account creation attempt. To be counted
     *        as a success, the response status code must match one of these. Each code must be unique among the success
     *        and failure status codes. </p>
     *        <p>
     *        JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     */

    public void setSuccessCodes(java.util.Collection<Integer> successCodes) {
        if (successCodes == null) {
            this.successCodes = null;
            return;
        }

        this.successCodes = new java.util.ArrayList<Integer>(successCodes);
    }

    /**
     * <p>
     * Status codes in the response that indicate a successful login or account creation attempt. To be counted as a
     * success, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessCodes(java.util.Collection)} or {@link #withSuccessCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successCodes
     *        Status codes in the response that indicate a successful login or account creation attempt. To be counted
     *        as a success, the response status code must match one of these. Each code must be unique among the success
     *        and failure status codes. </p>
     *        <p>
     *        JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionStatusCode withSuccessCodes(Integer... successCodes) {
        if (this.successCodes == null) {
            setSuccessCodes(new java.util.ArrayList<Integer>(successCodes.length));
        }
        for (Integer ele : successCodes) {
            this.successCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status codes in the response that indicate a successful login or account creation attempt. To be counted as a
     * success, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * </p>
     * 
     * @param successCodes
     *        Status codes in the response that indicate a successful login or account creation attempt. To be counted
     *        as a success, the response status code must match one of these. Each code must be unique among the success
     *        and failure status codes. </p>
     *        <p>
     *        JSON example: <code>"SuccessCodes": [ 200, 201 ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionStatusCode withSuccessCodes(java.util.Collection<Integer> successCodes) {
        setSuccessCodes(successCodes);
        return this;
    }

    /**
     * <p>
     * Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * </p>
     * 
     * @return Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     *         failure, the response status code must match one of these. Each code must be unique among the success and
     *         failure status codes. </p>
     *         <p>
     *         JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     */

    public java.util.List<Integer> getFailureCodes() {
        return failureCodes;
    }

    /**
     * <p>
     * Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * </p>
     * 
     * @param failureCodes
     *        Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     *        failure, the response status code must match one of these. Each code must be unique among the success and
     *        failure status codes. </p>
     *        <p>
     *        JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     */

    public void setFailureCodes(java.util.Collection<Integer> failureCodes) {
        if (failureCodes == null) {
            this.failureCodes = null;
            return;
        }

        this.failureCodes = new java.util.ArrayList<Integer>(failureCodes);
    }

    /**
     * <p>
     * Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureCodes(java.util.Collection)} or {@link #withFailureCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failureCodes
     *        Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     *        failure, the response status code must match one of these. Each code must be unique among the success and
     *        failure status codes. </p>
     *        <p>
     *        JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionStatusCode withFailureCodes(Integer... failureCodes) {
        if (this.failureCodes == null) {
            setFailureCodes(new java.util.ArrayList<Integer>(failureCodes.length));
        }
        for (Integer ele : failureCodes) {
            this.failureCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     * failure, the response status code must match one of these. Each code must be unique among the success and failure
     * status codes.
     * </p>
     * <p>
     * JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * </p>
     * 
     * @param failureCodes
     *        Status codes in the response that indicate a failed login or account creation attempt. To be counted as a
     *        failure, the response status code must match one of these. Each code must be unique among the success and
     *        failure status codes. </p>
     *        <p>
     *        JSON example: <code>"FailureCodes": [ 400, 404 ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseInspectionStatusCode withFailureCodes(java.util.Collection<Integer> failureCodes) {
        setFailureCodes(failureCodes);
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
        if (getSuccessCodes() != null)
            sb.append("SuccessCodes: ").append(getSuccessCodes()).append(",");
        if (getFailureCodes() != null)
            sb.append("FailureCodes: ").append(getFailureCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseInspectionStatusCode == false)
            return false;
        ResponseInspectionStatusCode other = (ResponseInspectionStatusCode) obj;
        if (other.getSuccessCodes() == null ^ this.getSuccessCodes() == null)
            return false;
        if (other.getSuccessCodes() != null && other.getSuccessCodes().equals(this.getSuccessCodes()) == false)
            return false;
        if (other.getFailureCodes() == null ^ this.getFailureCodes() == null)
            return false;
        if (other.getFailureCodes() != null && other.getFailureCodes().equals(this.getFailureCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessCodes() == null) ? 0 : getSuccessCodes().hashCode());
        hashCode = prime * hashCode + ((getFailureCodes() == null) ? 0 : getFailureCodes().hashCode());
        return hashCode;
    }

    @Override
    public ResponseInspectionStatusCode clone() {
        try {
            return (ResponseInspectionStatusCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ResponseInspectionStatusCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
