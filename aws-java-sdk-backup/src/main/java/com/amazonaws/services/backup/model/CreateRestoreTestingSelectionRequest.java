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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateRestoreTestingSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRestoreTestingSelectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is an optional unique string that identifies the request and allows failed requests to be retried without
     * the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric or '-_.'
     * characters.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProtectedResourceArns</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProtectedResourceConditions</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each protected resource type can have one single value.
     * </p>
     * <p>
     * A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code> along with
     * <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific protected resource
     * ARNs in <code>ProtectedResourceArns</code>.
     * </p>
     */
    private RestoreTestingSelectionForCreate restoreTestingSelection;

    /**
     * <p>
     * This is an optional unique string that identifies the request and allows failed requests to be retried without
     * the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric or '-_.'
     * characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is an optional unique string that identifies the request and allows failed requests to be retried
     *        without the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric
     *        or '-_.' characters.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * This is an optional unique string that identifies the request and allows failed requests to be retried without
     * the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric or '-_.'
     * characters.
     * </p>
     * 
     * @return This is an optional unique string that identifies the request and allows failed requests to be retried
     *         without the risk of running the operation twice. If used, this parameter must contain 1 to 50
     *         alphanumeric or '-_.' characters.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * This is an optional unique string that identifies the request and allows failed requests to be retried without
     * the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric or '-_.'
     * characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is an optional unique string that identifies the request and allows failed requests to be retried
     *        without the risk of running the operation twice. If used, this parameter must contain 1 to 50 alphanumeric
     *        or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     * </p>
     * 
     * @return Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Input the restore testing plan name that was returned from the related CreateRestoreTestingPlan request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionRequest withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProtectedResourceArns</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProtectedResourceConditions</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each protected resource type can have one single value.
     * </p>
     * <p>
     * A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code> along with
     * <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific protected resource
     * ARNs in <code>ProtectedResourceArns</code>.
     * </p>
     * 
     * @param restoreTestingSelection
     *        This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProtectedResourceArns</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProtectedResourceConditions</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each protected resource type can have one single value.
     *        </p>
     *        <p>
     *        A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code>
     *        along with <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific
     *        protected resource ARNs in <code>ProtectedResourceArns</code>.
     */

    public void setRestoreTestingSelection(RestoreTestingSelectionForCreate restoreTestingSelection) {
        this.restoreTestingSelection = restoreTestingSelection;
    }

    /**
     * <p>
     * This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProtectedResourceArns</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProtectedResourceConditions</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each protected resource type can have one single value.
     * </p>
     * <p>
     * A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code> along with
     * <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific protected resource
     * ARNs in <code>ProtectedResourceArns</code>.
     * </p>
     * 
     * @return This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of
     *         the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ProtectedResourceArns</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProtectedResourceConditions</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Each protected resource type can have one single value.
     *         </p>
     *         <p>
     *         A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code>
     *         along with <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific
     *         protected resource ARNs in <code>ProtectedResourceArns</code>.
     */

    public RestoreTestingSelectionForCreate getRestoreTestingSelection() {
        return this.restoreTestingSelection;
    }

    /**
     * <p>
     * This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ProtectedResourceArns</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProtectedResourceConditions</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each protected resource type can have one single value.
     * </p>
     * <p>
     * A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code> along with
     * <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific protected resource
     * ARNs in <code>ProtectedResourceArns</code>.
     * </p>
     * 
     * @param restoreTestingSelection
     *        This consists of <code>RestoreTestingSelectionName</code>, <code>ProtectedResourceType</code>, and one of
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ProtectedResourceArns</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProtectedResourceConditions</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Each protected resource type can have one single value.
     *        </p>
     *        <p>
     *        A restore testing selection can include a wildcard value ("*") for <code>ProtectedResourceArns</code>
     *        along with <code>ProtectedResourceConditions</code>. Alternatively, you can include up to 30 specific
     *        protected resource ARNs in <code>ProtectedResourceArns</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRestoreTestingSelectionRequest withRestoreTestingSelection(RestoreTestingSelectionForCreate restoreTestingSelection) {
        setRestoreTestingSelection(restoreTestingSelection);
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getRestoreTestingSelection() != null)
            sb.append("RestoreTestingSelection: ").append(getRestoreTestingSelection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRestoreTestingSelectionRequest == false)
            return false;
        CreateRestoreTestingSelectionRequest other = (CreateRestoreTestingSelectionRequest) obj;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getRestoreTestingSelection() == null ^ this.getRestoreTestingSelection() == null)
            return false;
        if (other.getRestoreTestingSelection() != null && other.getRestoreTestingSelection().equals(this.getRestoreTestingSelection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelection() == null) ? 0 : getRestoreTestingSelection().hashCode());
        return hashCode;
    }

    @Override
    public CreateRestoreTestingSelectionRequest clone() {
        return (CreateRestoreTestingSelectionRequest) super.clone();
    }

}
