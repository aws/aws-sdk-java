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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentFrameworkShare"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssessmentFrameworkShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the share request to be deleted.
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
     * The unique identifier for the share request to be deleted.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the share request to be deleted.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The unique identifier for the share request to be deleted.
     * </p>
     * 
     * @return The unique identifier for the share request to be deleted.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The unique identifier for the share request to be deleted.
     * </p>
     * 
     * @param requestId
     *        The unique identifier for the share request to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssessmentFrameworkShareRequest withRequestId(String requestId) {
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

    public DeleteAssessmentFrameworkShareRequest withRequestType(String requestType) {
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

    public DeleteAssessmentFrameworkShareRequest withRequestType(ShareRequestType requestType) {
        this.requestType = requestType.toString();
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
            sb.append("RequestType: ").append(getRequestType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssessmentFrameworkShareRequest == false)
            return false;
        DeleteAssessmentFrameworkShareRequest other = (DeleteAssessmentFrameworkShareRequest) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRequestType() == null ^ this.getRequestType() == null)
            return false;
        if (other.getRequestType() != null && other.getRequestType().equals(this.getRequestType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRequestType() == null) ? 0 : getRequestType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssessmentFrameworkShareRequest clone() {
        return (DeleteAssessmentFrameworkShareRequest) super.clone();
    }

}
