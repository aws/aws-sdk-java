/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     */
    private String roleArn;
    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a>notebook-lifecycle-config</a>.
     * </p>
     */
    private String lifecycleConfigName;
    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     */
    private Boolean disassociateLifecycleConfig;

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
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *        instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *         </p> <note>
     *         <p>
     *         To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *         <code>iam:PassRole</code> permission.
     *         </p>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook instance.
     * For more information, see <a href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon
     * SageMaker Roles</a>.
     * </p>
     * <note>
     * <p>
     * To be able to pass this role to Amazon SageMaker, the caller of this API must have the <code>iam:PassRole</code>
     * permission.
     * </p>
     * </note>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access the notebook
     *        instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html">Amazon SageMaker Roles</a>.
     *        </p> <note>
     *        <p>
     *        To be able to pass this role to Amazon SageMaker, the caller of this API must have the
     *        <code>iam:PassRole</code> permission.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a>notebook-lifecycle-config</a>.
     * </p>
     * 
     * @param lifecycleConfigName
     *        The name of a lifecycle configuration to associate with the notebook instance. For information about
     *        lifestyle configurations, see <a>notebook-lifecycle-config</a>.
     */

    public void setLifecycleConfigName(String lifecycleConfigName) {
        this.lifecycleConfigName = lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a>notebook-lifecycle-config</a>.
     * </p>
     * 
     * @return The name of a lifecycle configuration to associate with the notebook instance. For information about
     *         lifestyle configurations, see <a>notebook-lifecycle-config</a>.
     */

    public String getLifecycleConfigName() {
        return this.lifecycleConfigName;
    }

    /**
     * <p>
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle
     * configurations, see <a>notebook-lifecycle-config</a>.
     * </p>
     * 
     * @param lifecycleConfigName
     *        The name of a lifecycle configuration to associate with the notebook instance. For information about
     *        lifestyle configurations, see <a>notebook-lifecycle-config</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withLifecycleConfigName(String lifecycleConfigName) {
        setLifecycleConfigName(lifecycleConfigName);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @param disassociateLifecycleConfig
     *        Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with
     *        the notebook instance.
     */

    public void setDisassociateLifecycleConfig(Boolean disassociateLifecycleConfig) {
        this.disassociateLifecycleConfig = disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @return Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated
     *         with the notebook instance.
     */

    public Boolean getDisassociateLifecycleConfig() {
        return this.disassociateLifecycleConfig;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @param disassociateLifecycleConfig
     *        Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with
     *        the notebook instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotebookInstanceRequest withDisassociateLifecycleConfig(Boolean disassociateLifecycleConfig) {
        setDisassociateLifecycleConfig(disassociateLifecycleConfig);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated with the
     * notebook instance.
     * </p>
     * 
     * @return Set to <code>true</code> to remove the notebook instance lifecycle configuration currently associated
     *         with the notebook instance.
     */

    public Boolean isDisassociateLifecycleConfig() {
        return this.disassociateLifecycleConfig;
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
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLifecycleConfigName() != null)
            sb.append("LifecycleConfigName: ").append(getLifecycleConfigName()).append(",");
        if (getDisassociateLifecycleConfig() != null)
            sb.append("DisassociateLifecycleConfig: ").append(getDisassociateLifecycleConfig());
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
        if (other.getLifecycleConfigName() == null ^ this.getLifecycleConfigName() == null)
            return false;
        if (other.getLifecycleConfigName() != null && other.getLifecycleConfigName().equals(this.getLifecycleConfigName()) == false)
            return false;
        if (other.getDisassociateLifecycleConfig() == null ^ this.getDisassociateLifecycleConfig() == null)
            return false;
        if (other.getDisassociateLifecycleConfig() != null && other.getDisassociateLifecycleConfig().equals(this.getDisassociateLifecycleConfig()) == false)
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
        hashCode = prime * hashCode + ((getLifecycleConfigName() == null) ? 0 : getLifecycleConfigName().hashCode());
        hashCode = prime * hashCode + ((getDisassociateLifecycleConfig() == null) ? 0 : getDisassociateLifecycleConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotebookInstanceRequest clone() {
        return (UpdateNotebookInstanceRequest) super.clone();
    }

}
