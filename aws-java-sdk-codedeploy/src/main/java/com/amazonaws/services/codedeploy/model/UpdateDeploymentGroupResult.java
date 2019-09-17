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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of an UpdateDeploymentGroup operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateDeploymentGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeploymentGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group,
     * AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If
     * the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS
     * account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingGroup> hooksNotCleanedUp;

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group,
     * AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If
     * the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS
     * account.
     * </p>
     * 
     * @return If the output contains no data, and the corresponding deployment group contained at least one Auto
     *         Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks
     *         from the AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling
     *         lifecycle event hooks from the AWS account.
     */

    public java.util.List<AutoScalingGroup> getHooksNotCleanedUp() {
        if (hooksNotCleanedUp == null) {
            hooksNotCleanedUp = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>();
        }
        return hooksNotCleanedUp;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group,
     * AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If
     * the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS
     * account.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling
     *        group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the
     *        AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle
     *        event hooks from the AWS account.
     */

    public void setHooksNotCleanedUp(java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        if (hooksNotCleanedUp == null) {
            this.hooksNotCleanedUp = null;
            return;
        }

        this.hooksNotCleanedUp = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(hooksNotCleanedUp);
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group,
     * AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If
     * the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS
     * account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHooksNotCleanedUp(java.util.Collection)} or {@link #withHooksNotCleanedUp(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling
     *        group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the
     *        AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle
     *        event hooks from the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupResult withHooksNotCleanedUp(AutoScalingGroup... hooksNotCleanedUp) {
        if (this.hooksNotCleanedUp == null) {
            setHooksNotCleanedUp(new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(hooksNotCleanedUp.length));
        }
        for (AutoScalingGroup ele : hooksNotCleanedUp) {
            this.hooksNotCleanedUp.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group,
     * AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If
     * the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS
     * account.
     * </p>
     * 
     * @param hooksNotCleanedUp
     *        If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling
     *        group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the
     *        AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle
     *        event hooks from the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupResult withHooksNotCleanedUp(java.util.Collection<AutoScalingGroup> hooksNotCleanedUp) {
        setHooksNotCleanedUp(hooksNotCleanedUp);
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
        if (getHooksNotCleanedUp() != null)
            sb.append("HooksNotCleanedUp: ").append(getHooksNotCleanedUp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentGroupResult == false)
            return false;
        UpdateDeploymentGroupResult other = (UpdateDeploymentGroupResult) obj;
        if (other.getHooksNotCleanedUp() == null ^ this.getHooksNotCleanedUp() == null)
            return false;
        if (other.getHooksNotCleanedUp() != null && other.getHooksNotCleanedUp().equals(this.getHooksNotCleanedUp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHooksNotCleanedUp() == null) ? 0 : getHooksNotCleanedUp().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeploymentGroupResult clone() {
        try {
            return (UpdateDeploymentGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
