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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CheckAccessNotGranted"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckAccessNotGrantedResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the specified
     * policy doesn't allow any of the specified permissions in the access object. If the result is <code>FAIL</code>,
     * the specified policy might allow some or all of the permissions in the access object.
     * </p>
     */
    private String result;
    /**
     * <p>
     * The message indicating whether the specified access is allowed.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A description of the reasoning of the result.
     * </p>
     */
    private java.util.List<ReasonSummary> reasons;

    /**
     * <p>
     * The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the specified
     * policy doesn't allow any of the specified permissions in the access object. If the result is <code>FAIL</code>,
     * the specified policy might allow some or all of the permissions in the access object.
     * </p>
     * 
     * @param result
     *        The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the
     *        specified policy doesn't allow any of the specified permissions in the access object. If the result is
     *        <code>FAIL</code>, the specified policy might allow some or all of the permissions in the access object.
     * @see CheckAccessNotGrantedResult
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the specified
     * policy doesn't allow any of the specified permissions in the access object. If the result is <code>FAIL</code>,
     * the specified policy might allow some or all of the permissions in the access object.
     * </p>
     * 
     * @return The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the
     *         specified policy doesn't allow any of the specified permissions in the access object. If the result is
     *         <code>FAIL</code>, the specified policy might allow some or all of the permissions in the access object.
     * @see CheckAccessNotGrantedResult
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the specified
     * policy doesn't allow any of the specified permissions in the access object. If the result is <code>FAIL</code>,
     * the specified policy might allow some or all of the permissions in the access object.
     * </p>
     * 
     * @param result
     *        The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the
     *        specified policy doesn't allow any of the specified permissions in the access object. If the result is
     *        <code>FAIL</code>, the specified policy might allow some or all of the permissions in the access object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckAccessNotGrantedResult
     */

    public CheckAccessNotGrantedResult withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the specified
     * policy doesn't allow any of the specified permissions in the access object. If the result is <code>FAIL</code>,
     * the specified policy might allow some or all of the permissions in the access object.
     * </p>
     * 
     * @param result
     *        The result of the check for whether the access is allowed. If the result is <code>PASS</code>, the
     *        specified policy doesn't allow any of the specified permissions in the access object. If the result is
     *        <code>FAIL</code>, the specified policy might allow some or all of the permissions in the access object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckAccessNotGrantedResult
     */

    public CheckAccessNotGrantedResult withResult(CheckAccessNotGrantedResult result) {
        this.result = result.toString();
        return this;
    }

    /**
     * <p>
     * The message indicating whether the specified access is allowed.
     * </p>
     * 
     * @param message
     *        The message indicating whether the specified access is allowed.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message indicating whether the specified access is allowed.
     * </p>
     * 
     * @return The message indicating whether the specified access is allowed.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message indicating whether the specified access is allowed.
     * </p>
     * 
     * @param message
     *        The message indicating whether the specified access is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A description of the reasoning of the result.
     * </p>
     * 
     * @return A description of the reasoning of the result.
     */

    public java.util.List<ReasonSummary> getReasons() {
        return reasons;
    }

    /**
     * <p>
     * A description of the reasoning of the result.
     * </p>
     * 
     * @param reasons
     *        A description of the reasoning of the result.
     */

    public void setReasons(java.util.Collection<ReasonSummary> reasons) {
        if (reasons == null) {
            this.reasons = null;
            return;
        }

        this.reasons = new java.util.ArrayList<ReasonSummary>(reasons);
    }

    /**
     * <p>
     * A description of the reasoning of the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReasons(java.util.Collection)} or {@link #withReasons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reasons
     *        A description of the reasoning of the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedResult withReasons(ReasonSummary... reasons) {
        if (this.reasons == null) {
            setReasons(new java.util.ArrayList<ReasonSummary>(reasons.length));
        }
        for (ReasonSummary ele : reasons) {
            this.reasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the reasoning of the result.
     * </p>
     * 
     * @param reasons
     *        A description of the reasoning of the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckAccessNotGrantedResult withReasons(java.util.Collection<ReasonSummary> reasons) {
        setReasons(reasons);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getReasons() != null)
            sb.append("Reasons: ").append(getReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckAccessNotGrantedResult == false)
            return false;
        CheckAccessNotGrantedResult other = (CheckAccessNotGrantedResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getReasons() == null ^ this.getReasons() == null)
            return false;
        if (other.getReasons() != null && other.getReasons().equals(this.getReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getReasons() == null) ? 0 : getReasons().hashCode());
        return hashCode;
    }

    @Override
    public CheckAccessNotGrantedResult clone() {
        try {
            return (CheckAccessNotGrantedResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
