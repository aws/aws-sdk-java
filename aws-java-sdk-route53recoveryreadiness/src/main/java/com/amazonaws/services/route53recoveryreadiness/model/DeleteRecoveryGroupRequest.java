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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DeleteRecoveryGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRecoveryGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a recovery group.
     * </p>
     */
    private String recoveryGroupName;

    /**
     * <p>
     * The name of a recovery group.
     * </p>
     * 
     * @param recoveryGroupName
     *        The name of a recovery group.
     */

    public void setRecoveryGroupName(String recoveryGroupName) {
        this.recoveryGroupName = recoveryGroupName;
    }

    /**
     * <p>
     * The name of a recovery group.
     * </p>
     * 
     * @return The name of a recovery group.
     */

    public String getRecoveryGroupName() {
        return this.recoveryGroupName;
    }

    /**
     * <p>
     * The name of a recovery group.
     * </p>
     * 
     * @param recoveryGroupName
     *        The name of a recovery group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecoveryGroupRequest withRecoveryGroupName(String recoveryGroupName) {
        setRecoveryGroupName(recoveryGroupName);
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
        if (getRecoveryGroupName() != null)
            sb.append("RecoveryGroupName: ").append(getRecoveryGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRecoveryGroupRequest == false)
            return false;
        DeleteRecoveryGroupRequest other = (DeleteRecoveryGroupRequest) obj;
        if (other.getRecoveryGroupName() == null ^ this.getRecoveryGroupName() == null)
            return false;
        if (other.getRecoveryGroupName() != null && other.getRecoveryGroupName().equals(this.getRecoveryGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryGroupName() == null) ? 0 : getRecoveryGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRecoveryGroupRequest clone() {
        return (DeleteRecoveryGroupRequest) super.clone();
    }

}
