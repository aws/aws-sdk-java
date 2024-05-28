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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRestoreTestingSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRestoreTestingSelectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The restore testing plan name is required to update the indicated testing plan.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * To update your restore testing selection, you can use either protected resource ARNs or conditions, but not both.
     * That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the parameter
     * <code>ProtectedResourceConditions</code> will be unsuccessful.
     * </p>
     */
    private RestoreTestingSelectionForUpdate restoreTestingSelection;
    /**
     * <p>
     * This is the required restore testing selection name of the restore testing selection you wish to update.
     * </p>
     */
    private String restoreTestingSelectionName;

    /**
     * <p>
     * The restore testing plan name is required to update the indicated testing plan.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The restore testing plan name is required to update the indicated testing plan.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * The restore testing plan name is required to update the indicated testing plan.
     * </p>
     * 
     * @return The restore testing plan name is required to update the indicated testing plan.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * The restore testing plan name is required to update the indicated testing plan.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        The restore testing plan name is required to update the indicated testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingSelectionRequest withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * To update your restore testing selection, you can use either protected resource ARNs or conditions, but not both.
     * That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the parameter
     * <code>ProtectedResourceConditions</code> will be unsuccessful.
     * </p>
     * 
     * @param restoreTestingSelection
     *        To update your restore testing selection, you can use either protected resource ARNs or conditions, but
     *        not both. That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the
     *        parameter <code>ProtectedResourceConditions</code> will be unsuccessful.
     */

    public void setRestoreTestingSelection(RestoreTestingSelectionForUpdate restoreTestingSelection) {
        this.restoreTestingSelection = restoreTestingSelection;
    }

    /**
     * <p>
     * To update your restore testing selection, you can use either protected resource ARNs or conditions, but not both.
     * That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the parameter
     * <code>ProtectedResourceConditions</code> will be unsuccessful.
     * </p>
     * 
     * @return To update your restore testing selection, you can use either protected resource ARNs or conditions, but
     *         not both. That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with
     *         the parameter <code>ProtectedResourceConditions</code> will be unsuccessful.
     */

    public RestoreTestingSelectionForUpdate getRestoreTestingSelection() {
        return this.restoreTestingSelection;
    }

    /**
     * <p>
     * To update your restore testing selection, you can use either protected resource ARNs or conditions, but not both.
     * That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the parameter
     * <code>ProtectedResourceConditions</code> will be unsuccessful.
     * </p>
     * 
     * @param restoreTestingSelection
     *        To update your restore testing selection, you can use either protected resource ARNs or conditions, but
     *        not both. That is, if your selection has <code>ProtectedResourceArns</code>, requesting an update with the
     *        parameter <code>ProtectedResourceConditions</code> will be unsuccessful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingSelectionRequest withRestoreTestingSelection(RestoreTestingSelectionForUpdate restoreTestingSelection) {
        setRestoreTestingSelection(restoreTestingSelection);
        return this;
    }

    /**
     * <p>
     * This is the required restore testing selection name of the restore testing selection you wish to update.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the required restore testing selection name of the restore testing selection you wish to update.
     */

    public void setRestoreTestingSelectionName(String restoreTestingSelectionName) {
        this.restoreTestingSelectionName = restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the required restore testing selection name of the restore testing selection you wish to update.
     * </p>
     * 
     * @return This is the required restore testing selection name of the restore testing selection you wish to update.
     */

    public String getRestoreTestingSelectionName() {
        return this.restoreTestingSelectionName;
    }

    /**
     * <p>
     * This is the required restore testing selection name of the restore testing selection you wish to update.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        This is the required restore testing selection name of the restore testing selection you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingSelectionRequest withRestoreTestingSelectionName(String restoreTestingSelectionName) {
        setRestoreTestingSelectionName(restoreTestingSelectionName);
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
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName()).append(",");
        if (getRestoreTestingSelection() != null)
            sb.append("RestoreTestingSelection: ").append(getRestoreTestingSelection()).append(",");
        if (getRestoreTestingSelectionName() != null)
            sb.append("RestoreTestingSelectionName: ").append(getRestoreTestingSelectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRestoreTestingSelectionRequest == false)
            return false;
        UpdateRestoreTestingSelectionRequest other = (UpdateRestoreTestingSelectionRequest) obj;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        if (other.getRestoreTestingSelection() == null ^ this.getRestoreTestingSelection() == null)
            return false;
        if (other.getRestoreTestingSelection() != null && other.getRestoreTestingSelection().equals(this.getRestoreTestingSelection()) == false)
            return false;
        if (other.getRestoreTestingSelectionName() == null ^ this.getRestoreTestingSelectionName() == null)
            return false;
        if (other.getRestoreTestingSelectionName() != null && other.getRestoreTestingSelectionName().equals(this.getRestoreTestingSelectionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelection() == null) ? 0 : getRestoreTestingSelection().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRestoreTestingSelectionRequest clone() {
        return (UpdateRestoreTestingSelectionRequest) super.clone();
    }

}
