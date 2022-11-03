/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type that the version runs on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ResourceSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the SageMaker image that the image version belongs to.
     * </p>
     */
    private String sageMakerImageArn;
    /**
     * <p>
     * The ARN of the image version created on the instance.
     * </p>
     */
    private String sageMakerImageVersionArn;
    /**
     * <p>
     * The instance type that the image version runs on.
     * </p>
     * <note>
     * <p>
     * <b>JupyterServer apps</b> only support the <code>system</code> value.
     * </p>
     * <p>
     * For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     * KernelGateway apps also support all other values for available instance types.
     * </p>
     * </note>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * </p>
     */
    private String lifecycleConfigArn;

    /**
     * <p>
     * The ARN of the SageMaker image that the image version belongs to.
     * </p>
     * 
     * @param sageMakerImageArn
     *        The ARN of the SageMaker image that the image version belongs to.
     */

    public void setSageMakerImageArn(String sageMakerImageArn) {
        this.sageMakerImageArn = sageMakerImageArn;
    }

    /**
     * <p>
     * The ARN of the SageMaker image that the image version belongs to.
     * </p>
     * 
     * @return The ARN of the SageMaker image that the image version belongs to.
     */

    public String getSageMakerImageArn() {
        return this.sageMakerImageArn;
    }

    /**
     * <p>
     * The ARN of the SageMaker image that the image version belongs to.
     * </p>
     * 
     * @param sageMakerImageArn
     *        The ARN of the SageMaker image that the image version belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpec withSageMakerImageArn(String sageMakerImageArn) {
        setSageMakerImageArn(sageMakerImageArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the image version created on the instance.
     * </p>
     * 
     * @param sageMakerImageVersionArn
     *        The ARN of the image version created on the instance.
     */

    public void setSageMakerImageVersionArn(String sageMakerImageVersionArn) {
        this.sageMakerImageVersionArn = sageMakerImageVersionArn;
    }

    /**
     * <p>
     * The ARN of the image version created on the instance.
     * </p>
     * 
     * @return The ARN of the image version created on the instance.
     */

    public String getSageMakerImageVersionArn() {
        return this.sageMakerImageVersionArn;
    }

    /**
     * <p>
     * The ARN of the image version created on the instance.
     * </p>
     * 
     * @param sageMakerImageVersionArn
     *        The ARN of the image version created on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpec withSageMakerImageVersionArn(String sageMakerImageVersionArn) {
        setSageMakerImageVersionArn(sageMakerImageVersionArn);
        return this;
    }

    /**
     * <p>
     * The instance type that the image version runs on.
     * </p>
     * <note>
     * <p>
     * <b>JupyterServer apps</b> only support the <code>system</code> value.
     * </p>
     * <p>
     * For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     * KernelGateway apps also support all other values for available instance types.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type that the image version runs on.</p> <note>
     *        <p>
     *        <b>JupyterServer apps</b> only support the <code>system</code> value.
     *        </p>
     *        <p>
     *        For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     *        KernelGateway apps also support all other values for available instance types.
     *        </p>
     * @see AppInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type that the image version runs on.
     * </p>
     * <note>
     * <p>
     * <b>JupyterServer apps</b> only support the <code>system</code> value.
     * </p>
     * <p>
     * For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     * KernelGateway apps also support all other values for available instance types.
     * </p>
     * </note>
     * 
     * @return The instance type that the image version runs on.</p> <note>
     *         <p>
     *         <b>JupyterServer apps</b> only support the <code>system</code> value.
     *         </p>
     *         <p>
     *         For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     *         KernelGateway apps also support all other values for available instance types.
     *         </p>
     * @see AppInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type that the image version runs on.
     * </p>
     * <note>
     * <p>
     * <b>JupyterServer apps</b> only support the <code>system</code> value.
     * </p>
     * <p>
     * For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     * KernelGateway apps also support all other values for available instance types.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type that the image version runs on.</p> <note>
     *        <p>
     *        <b>JupyterServer apps</b> only support the <code>system</code> value.
     *        </p>
     *        <p>
     *        For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     *        KernelGateway apps also support all other values for available instance types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceType
     */

    public ResourceSpec withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type that the image version runs on.
     * </p>
     * <note>
     * <p>
     * <b>JupyterServer apps</b> only support the <code>system</code> value.
     * </p>
     * <p>
     * For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     * KernelGateway apps also support all other values for available instance types.
     * </p>
     * </note>
     * 
     * @param instanceType
     *        The instance type that the image version runs on.</p> <note>
     *        <p>
     *        <b>JupyterServer apps</b> only support the <code>system</code> value.
     *        </p>
     *        <p>
     *        For <b>KernelGateway apps</b>, the <code>system</code> value is translated to <code>ml.t3.medium</code>.
     *        KernelGateway apps also support all other values for available instance types.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceType
     */

    public ResourceSpec withInstanceType(AppInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * </p>
     * 
     * @param lifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     */

    public void setLifecycleConfigArn(String lifecycleConfigArn) {
        this.lifecycleConfigArn = lifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     */

    public String getLifecycleConfigArn() {
        return this.lifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * </p>
     * 
     * @param lifecycleConfigArn
     *        The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpec withLifecycleConfigArn(String lifecycleConfigArn) {
        setLifecycleConfigArn(lifecycleConfigArn);
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
        if (getSageMakerImageArn() != null)
            sb.append("SageMakerImageArn: ").append(getSageMakerImageArn()).append(",");
        if (getSageMakerImageVersionArn() != null)
            sb.append("SageMakerImageVersionArn: ").append(getSageMakerImageVersionArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLifecycleConfigArn() != null)
            sb.append("LifecycleConfigArn: ").append(getLifecycleConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpec == false)
            return false;
        ResourceSpec other = (ResourceSpec) obj;
        if (other.getSageMakerImageArn() == null ^ this.getSageMakerImageArn() == null)
            return false;
        if (other.getSageMakerImageArn() != null && other.getSageMakerImageArn().equals(this.getSageMakerImageArn()) == false)
            return false;
        if (other.getSageMakerImageVersionArn() == null ^ this.getSageMakerImageVersionArn() == null)
            return false;
        if (other.getSageMakerImageVersionArn() != null && other.getSageMakerImageVersionArn().equals(this.getSageMakerImageVersionArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLifecycleConfigArn() == null ^ this.getLifecycleConfigArn() == null)
            return false;
        if (other.getLifecycleConfigArn() != null && other.getLifecycleConfigArn().equals(this.getLifecycleConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSageMakerImageArn() == null) ? 0 : getSageMakerImageArn().hashCode());
        hashCode = prime * hashCode + ((getSageMakerImageVersionArn() == null) ? 0 : getSageMakerImageVersionArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLifecycleConfigArn() == null) ? 0 : getLifecycleConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSpec clone() {
        try {
            return (ResourceSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ResourceSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
