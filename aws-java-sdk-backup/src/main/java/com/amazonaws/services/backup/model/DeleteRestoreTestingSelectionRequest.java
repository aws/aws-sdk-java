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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteRestoreTestingSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRestoreTestingSelectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Required unique name of the restore testing plan that contains the restore testing selection you wish to delete.
     * </p>
     */
    private String restoreTestingPlanName;
    /**
     * <p>
     * Required unique name of the restore testing selection you wish to delete.
     * </p>
     */
    private String restoreTestingSelectionName;

    /**
     * <p>
     * Required unique name of the restore testing plan that contains the restore testing selection you wish to delete.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Required unique name of the restore testing plan that contains the restore testing selection you wish to
     *        delete.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * Required unique name of the restore testing plan that contains the restore testing selection you wish to delete.
     * </p>
     * 
     * @return Required unique name of the restore testing plan that contains the restore testing selection you wish to
     *         delete.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * Required unique name of the restore testing plan that contains the restore testing selection you wish to delete.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        Required unique name of the restore testing plan that contains the restore testing selection you wish to
     *        delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRestoreTestingSelectionRequest withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
        return this;
    }

    /**
     * <p>
     * Required unique name of the restore testing selection you wish to delete.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        Required unique name of the restore testing selection you wish to delete.
     */

    public void setRestoreTestingSelectionName(String restoreTestingSelectionName) {
        this.restoreTestingSelectionName = restoreTestingSelectionName;
    }

    /**
     * <p>
     * Required unique name of the restore testing selection you wish to delete.
     * </p>
     * 
     * @return Required unique name of the restore testing selection you wish to delete.
     */

    public String getRestoreTestingSelectionName() {
        return this.restoreTestingSelectionName;
    }

    /**
     * <p>
     * Required unique name of the restore testing selection you wish to delete.
     * </p>
     * 
     * @param restoreTestingSelectionName
     *        Required unique name of the restore testing selection you wish to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRestoreTestingSelectionRequest withRestoreTestingSelectionName(String restoreTestingSelectionName) {
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

        if (obj instanceof DeleteRestoreTestingSelectionRequest == false)
            return false;
        DeleteRestoreTestingSelectionRequest other = (DeleteRestoreTestingSelectionRequest) obj;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
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
        hashCode = prime * hashCode + ((getRestoreTestingSelectionName() == null) ? 0 : getRestoreTestingSelectionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRestoreTestingSelectionRequest clone() {
        return (DeleteRestoreTestingSelectionRequest) super.clone();
    }

}
