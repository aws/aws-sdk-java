/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Both the AssignmentReviewReport and the HITReviewReport elements contains the ReviewActionDetail data structure. This
 * structure is returned multiple times for each action specified in the Review Policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ReviewActionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewActionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting
     * results, and deciding which other actions will be necessary.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The specific HITId or AssignmentID targeted by the action.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The type of object in TargetId.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date when the action was completed.
     * </p>
     */
    private java.util.Date completeTime;
    /**
     * <p>
     * A description of the outcome of the review.
     * </p>
     */
    private String result;
    /**
     * <p>
     * Present only when the Results have a FAILED Status.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The unique identifier for the action.
     * </p>
     * 
     * @param actionId
     *        The unique identifier for the action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The unique identifier for the action.
     * </p>
     * 
     * @return The unique identifier for the action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The unique identifier for the action.
     * </p>
     * 
     * @param actionId
     *        The unique identifier for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting
     * results, and deciding which other actions will be necessary.
     * </p>
     * 
     * @param actionName
     *        The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments,
     *        emitting results, and deciding which other actions will be necessary.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting
     * results, and deciding which other actions will be necessary.
     * </p>
     * 
     * @return The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments,
     *         emitting results, and deciding which other actions will be necessary.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments, emitting
     * results, and deciding which other actions will be necessary.
     * </p>
     * 
     * @param actionName
     *        The nature of the action itself. The Review Policy is responsible for examining the HIT and Assignments,
     *        emitting results, and deciding which other actions will be necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The specific HITId or AssignmentID targeted by the action.
     * </p>
     * 
     * @param targetId
     *        The specific HITId or AssignmentID targeted by the action.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The specific HITId or AssignmentID targeted by the action.
     * </p>
     * 
     * @return The specific HITId or AssignmentID targeted by the action.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The specific HITId or AssignmentID targeted by the action.
     * </p>
     * 
     * @param targetId
     *        The specific HITId or AssignmentID targeted by the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The type of object in TargetId.
     * </p>
     * 
     * @param targetType
     *        The type of object in TargetId.
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of object in TargetId.
     * </p>
     * 
     * @return The type of object in TargetId.
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of object in TargetId.
     * </p>
     * 
     * @param targetType
     *        The type of object in TargetId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     * 
     * @param status
     *        The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * @see ReviewActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     * 
     * @return The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * @see ReviewActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     * 
     * @param status
     *        The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewActionStatus
     */

    public ReviewActionDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     * 
     * @param status
     *        The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * @see ReviewActionStatus
     */

    public void setStatus(ReviewActionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * </p>
     * 
     * @param status
     *        The current disposition of the action: INTENDED, SUCCEEDED, FAILED, or CANCELLED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewActionStatus
     */

    public ReviewActionDetail withStatus(ReviewActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date when the action was completed.
     * </p>
     * 
     * @param completeTime
     *        The date when the action was completed.
     */

    public void setCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * <p>
     * The date when the action was completed.
     * </p>
     * 
     * @return The date when the action was completed.
     */

    public java.util.Date getCompleteTime() {
        return this.completeTime;
    }

    /**
     * <p>
     * The date when the action was completed.
     * </p>
     * 
     * @param completeTime
     *        The date when the action was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withCompleteTime(java.util.Date completeTime) {
        setCompleteTime(completeTime);
        return this;
    }

    /**
     * <p>
     * A description of the outcome of the review.
     * </p>
     * 
     * @param result
     *        A description of the outcome of the review.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * A description of the outcome of the review.
     * </p>
     * 
     * @return A description of the outcome of the review.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * A description of the outcome of the review.
     * </p>
     * 
     * @param result
     *        A description of the outcome of the review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * Present only when the Results have a FAILED Status.
     * </p>
     * 
     * @param errorCode
     *        Present only when the Results have a FAILED Status.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Present only when the Results have a FAILED Status.
     * </p>
     * 
     * @return Present only when the Results have a FAILED Status.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Present only when the Results have a FAILED Status.
     * </p>
     * 
     * @param errorCode
     *        Present only when the Results have a FAILED Status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewActionDetail withErrorCode(String errorCode) {
        setErrorCode(errorCode);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCompleteTime() != null)
            sb.append("CompleteTime: ").append(getCompleteTime()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewActionDetail == false)
            return false;
        ReviewActionDetail other = (ReviewActionDetail) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCompleteTime() == null ^ this.getCompleteTime() == null)
            return false;
        if (other.getCompleteTime() != null && other.getCompleteTime().equals(this.getCompleteTime()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        return hashCode;
    }

    @Override
    public ReviewActionDetail clone() {
        try {
            return (ReviewActionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.ReviewActionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
