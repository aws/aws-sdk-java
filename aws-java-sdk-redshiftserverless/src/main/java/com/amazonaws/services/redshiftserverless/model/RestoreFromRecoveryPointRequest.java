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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreFromRecoveryPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the namespace to restore data into.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The unique identifier of the recovery point to restore from.
     * </p>
     */
    private String recoveryPointId;
    /**
     * <p>
     * The name of the workgroup used to restore data.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The name of the namespace to restore data into.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to restore data into.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to restore data into.
     * </p>
     * 
     * @return The name of the namespace to restore data into.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to restore data into.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to restore data into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromRecoveryPointRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the recovery point to restore from.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point to restore from.
     */

    public void setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point to restore from.
     * </p>
     * 
     * @return The unique identifier of the recovery point to restore from.
     */

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point to restore from.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point to restore from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromRecoveryPointRequest withRecoveryPointId(String recoveryPointId) {
        setRecoveryPointId(recoveryPointId);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup used to restore data.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup used to restore data.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup used to restore data.
     * </p>
     * 
     * @return The name of the workgroup used to restore data.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup used to restore data.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup used to restore data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromRecoveryPointRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getRecoveryPointId() != null)
            sb.append("RecoveryPointId: ").append(getRecoveryPointId()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromRecoveryPointRequest == false)
            return false;
        RestoreFromRecoveryPointRequest other = (RestoreFromRecoveryPointRequest) obj;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getRecoveryPointId() == null ^ this.getRecoveryPointId() == null)
            return false;
        if (other.getRecoveryPointId() != null && other.getRecoveryPointId().equals(this.getRecoveryPointId()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointId() == null) ? 0 : getRecoveryPointId().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreFromRecoveryPointRequest clone() {
        return (RestoreFromRecoveryPointRequest) super.clone();
    }

}
