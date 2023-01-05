/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentFrameworkShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentFrameworkShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     */
    private String requestType;
    /**
     * <p>
     * Specifies the update action for the share request.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the share request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @return The unique identifier for the share request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssessmentFrameworkShareRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @see ShareRequestType
     */

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @return Specifies whether the share request is a sent request or a received request.
     * @see ShareRequestType
     */

    public String getRequestType() {
        return this.requestType;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestType
     */

    public UpdateAssessmentFrameworkShareRequest withRequestType(String requestType) {
        setRequestType(requestType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the share request is a sent request or a received request.
     * </p>
     * 
     * @param requestType
     *        Specifies whether the share request is a sent request or a received request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestType
     */

    public UpdateAssessmentFrameworkShareRequest withRequestType(ShareRequestType requestType) {
        this.requestType = requestType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the update action for the share request.
     * </p>
     * 
     * @param action
     *        Specifies the update action for the share request.
     * @see ShareRequestAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the update action for the share request.
     * </p>
     * 
     * @return Specifies the update action for the share request.
     * @see ShareRequestAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the update action for the share request.
     * </p>
     * 
     * @param action
     *        Specifies the update action for the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestAction
     */

    public UpdateAssessmentFrameworkShareRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the update action for the share request.
     * </p>
     * 
     * @param action
     *        Specifies the update action for the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestAction
     */

    public UpdateAssessmentFrameworkShareRequest withAction(ShareRequestAction action) {
        this.action = action.toString();
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getRequestType() != null)
            sb.append("RequestType: ").append(getRequestType()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentFrameworkShareRequest == false)
            return false;
        UpdateAssessmentFrameworkShareRequest other = (UpdateAssessmentFrameworkShareRequest) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRequestType() == null ^ this.getRequestType() == null)
            return false;
        if (other.getRequestType() != null && other.getRequestType().equals(this.getRequestType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentFrameworkShareRequest clone() {
        return (UpdateAssessmentFrameworkShareRequest) super.clone();
    }

}
