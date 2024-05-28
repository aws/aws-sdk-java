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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRestoreTestingPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRestoreTestingPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     * </p>
     */
    private RestoreTestingPlanForGet restoreTestingPlan;

    /**
     * <p>
     * Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     * </p>
     * 
     * @param restoreTestingPlan
     *        Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     */

    public void setRestoreTestingPlan(RestoreTestingPlanForGet restoreTestingPlan) {
        this.restoreTestingPlan = restoreTestingPlan;
    }

    /**
     * <p>
     * Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     * </p>
     * 
     * @return Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     */

    public RestoreTestingPlanForGet getRestoreTestingPlan() {
        return this.restoreTestingPlan;
    }

    /**
     * <p>
     * Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     * </p>
     * 
     * @param restoreTestingPlan
     *        Specifies the body of a restore testing plan. Includes <code>RestoreTestingPlanName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRestoreTestingPlanResult withRestoreTestingPlan(RestoreTestingPlanForGet restoreTestingPlan) {
        setRestoreTestingPlan(restoreTestingPlan);
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
            sb.append("RestoreTestingPlan: ").append(getRestoreTestingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRestoreTestingPlanResult == false)
            return false;
        GetRestoreTestingPlanResult other = (GetRestoreTestingPlanResult) obj;
        if (other.getRestoreTestingPlan() == null ^ this.getRestoreTestingPlan() == null)
            return false;
        if (other.getRestoreTestingPlan() != null && other.getRestoreTestingPlan().equals(this.getRestoreTestingPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreTestingPlan() == null) ? 0 : getRestoreTestingPlan().hashCode());
        return hashCode;
    }

    @Override
    public GetRestoreTestingPlanResult clone() {
        try {
            return (GetRestoreTestingPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
