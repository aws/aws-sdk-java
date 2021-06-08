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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about your account details review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ReviewDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the latest review of your account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your appeal
     * again.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The associated support center case ID (if any).
     * </p>
     */
    private String caseId;

    /**
     * <p>
     * The status of the latest review of your account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your appeal
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the latest review of your account. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your
     *        appeal again.
     *        </p>
     *        </li>
     * @see ReviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the latest review of your account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your appeal
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the latest review of your account. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your
     *         appeal again.
     *         </p>
     *         </li>
     * @see ReviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the latest review of your account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your appeal
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the latest review of your account. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your
     *        appeal again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public ReviewDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the latest review of your account. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your appeal
     * again.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the latest review of your account. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – We have received your appeal and are in the process of reviewing it.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GRANTED</code> – Your appeal has been reviewed and your production access has been granted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DENIED</code> – Your appeal has been reviewed and your production access has been denied.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – An internal error occurred and we didn't receive your appeal. You can submit your
     *        appeal again.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public ReviewDetails withStatus(ReviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The associated support center case ID (if any).
     * </p>
     * 
     * @param caseId
     *        The associated support center case ID (if any).
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The associated support center case ID (if any).
     * </p>
     * 
     * @return The associated support center case ID (if any).
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The associated support center case ID (if any).
     * </p>
     * 
     * @param caseId
     *        The associated support center case ID (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewDetails withCaseId(String caseId) {
        setCaseId(caseId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewDetails == false)
            return false;
        ReviewDetails other = (ReviewDetails) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        return hashCode;
    }

    @Override
    public ReviewDetails clone() {
        try {
            return (ReviewDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ReviewDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
