/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateNotebookInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotebookInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     */
    private String notebookInstanceName;
    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance to update.
     */

    public void setNotebookInstanceName(String notebookInstanceName) {
        this.notebookInstanceName = notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @return The name of the notebook instance to update.
     */

    public String getNotebookInstanceName() {
        return this.notebookInstanceName;
    }

    /**
     * <p>
     * The name of the notebook instance to update.
     * </p>
     * 
     * @param notebookInstanceName
     *        The name of the notebook instance to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withNotebookInstanceName(String notebookInstanceName) {
        setNotebookInstanceName(notebookInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @return The Amazon ML compute instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public UpdateNotebookInstanceRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon ML compute instance type.
     * </p>
     * 
     * @param instanceType
     *        The Amazon ML compute instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public UpdateNotebookInstanceRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     * </p>
     * 
     * @param roleArn
     *        Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     * </p>
     * 
     * @param roleArn
     *        Amazon Resource Name (ARN) of the IAM role to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNotebookInstanceName() != null)
            sb.append("NotebookInstanceName: ").append(getNotebookInstanceName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotebookInstanceRequest == false)
            return false;
        UpdateNotebookInstanceRequest other = (UpdateNotebookInstanceRequest) obj;
        if (other.getNotebookInstanceName() == null ^ this.getNotebookInstanceName() == null)
            return false;
        if (other.getNotebookInstanceName() != null && other.getNotebookInstanceName().equals(this.getNotebookInstanceName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookInstanceName() == null) ? 0 : getNotebookInstanceName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotebookInstanceRequest clone() {
        return (UpdateNotebookInstanceRequest) super.clone();
    }

}
