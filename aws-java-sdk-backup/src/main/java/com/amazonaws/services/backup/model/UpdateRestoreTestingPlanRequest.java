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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRestoreTestingPlan" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRestoreTestingPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the body of a restore testing plan.
     * </p>
     */
    private RestoreTestingPlanForUpdate restoreTestingPlan;
    /**
     * <p>
     * This is the restore testing plan name you wish to update.
     * </p>
     */
    private String restoreTestingPlanName;

    /**
     * <p>
     * Specifies the body of a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlan
     *        Specifies the body of a restore testing plan.
     */

    public void setRestoreTestingPlan(RestoreTestingPlanForUpdate restoreTestingPlan) {
        this.restoreTestingPlan = restoreTestingPlan;
    }

    /**
     * <p>
     * Specifies the body of a restore testing plan.
     * </p>
     * 
     * @return Specifies the body of a restore testing plan.
     */

    public RestoreTestingPlanForUpdate getRestoreTestingPlan() {
        return this.restoreTestingPlan;
    }

    /**
     * <p>
     * Specifies the body of a restore testing plan.
     * </p>
     * 
     * @param restoreTestingPlan
     *        Specifies the body of a restore testing plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanRequest withRestoreTestingPlan(RestoreTestingPlanForUpdate restoreTestingPlan) {
        setRestoreTestingPlan(restoreTestingPlan);
        return this;
    }

    /**
     * <p>
     * This is the restore testing plan name you wish to update.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This is the restore testing plan name you wish to update.
     */

    public void setRestoreTestingPlanName(String restoreTestingPlanName) {
        this.restoreTestingPlanName = restoreTestingPlanName;
    }

    /**
     * <p>
     * This is the restore testing plan name you wish to update.
     * </p>
     * 
     * @return This is the restore testing plan name you wish to update.
     */

    public String getRestoreTestingPlanName() {
        return this.restoreTestingPlanName;
    }

    /**
     * <p>
     * This is the restore testing plan name you wish to update.
     * </p>
     * 
     * @param restoreTestingPlanName
     *        This is the restore testing plan name you wish to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRestoreTestingPlanRequest withRestoreTestingPlanName(String restoreTestingPlanName) {
        setRestoreTestingPlanName(restoreTestingPlanName);
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
        if (getRestoreTestingPlan() != null)
            sb.append("RestoreTestingPlan: ").append(getRestoreTestingPlan()).append(",");
        if (getRestoreTestingPlanName() != null)
            sb.append("RestoreTestingPlanName: ").append(getRestoreTestingPlanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRestoreTestingPlanRequest == false)
            return false;
        UpdateRestoreTestingPlanRequest other = (UpdateRestoreTestingPlanRequest) obj;
        if (other.getRestoreTestingPlan() == null ^ this.getRestoreTestingPlan() == null)
            return false;
        if (other.getRestoreTestingPlan() != null && other.getRestoreTestingPlan().equals(this.getRestoreTestingPlan()) == false)
            return false;
        if (other.getRestoreTestingPlanName() == null ^ this.getRestoreTestingPlanName() == null)
            return false;
        if (other.getRestoreTestingPlanName() != null && other.getRestoreTestingPlanName().equals(this.getRestoreTestingPlanName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreTestingPlan() == null) ? 0 : getRestoreTestingPlan().hashCode());
        hashCode = prime * hashCode + ((getRestoreTestingPlanName() == null) ? 0 : getRestoreTestingPlanName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRestoreTestingPlanRequest clone() {
        return (UpdateRestoreTestingPlanRequest) super.clone();
    }

}
