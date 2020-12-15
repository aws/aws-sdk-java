/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains parameters for a Linux process that contains an AWS Lambda function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaLinuxProcessParams"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaLinuxProcessParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime
     * environment inside the AWS IoT Greengrass container, or as a regular process outside any container.
     * </p>
     * <p>
     * Default: <code>GreengrassContainer</code>
     * </p>
     */
    private String isolationMode;
    /**
     * <p>
     * The parameters for the container in which the Lambda function runs.
     * </p>
     */
    private LambdaContainerParams containerParams;

    /**
     * <p>
     * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime
     * environment inside the AWS IoT Greengrass container, or as a regular process outside any container.
     * </p>
     * <p>
     * Default: <code>GreengrassContainer</code>
     * </p>
     * 
     * @param isolationMode
     *        The isolation mode for the process that contains the Lambda function. The process can run in an isolated
     *        runtime environment inside the AWS IoT Greengrass container, or as a regular process outside any
     *        container.</p>
     *        <p>
     *        Default: <code>GreengrassContainer</code>
     * @see LambdaIsolationMode
     */

    public void setIsolationMode(String isolationMode) {
        this.isolationMode = isolationMode;
    }

    /**
     * <p>
     * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime
     * environment inside the AWS IoT Greengrass container, or as a regular process outside any container.
     * </p>
     * <p>
     * Default: <code>GreengrassContainer</code>
     * </p>
     * 
     * @return The isolation mode for the process that contains the Lambda function. The process can run in an isolated
     *         runtime environment inside the AWS IoT Greengrass container, or as a regular process outside any
     *         container.</p>
     *         <p>
     *         Default: <code>GreengrassContainer</code>
     * @see LambdaIsolationMode
     */

    public String getIsolationMode() {
        return this.isolationMode;
    }

    /**
     * <p>
     * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime
     * environment inside the AWS IoT Greengrass container, or as a regular process outside any container.
     * </p>
     * <p>
     * Default: <code>GreengrassContainer</code>
     * </p>
     * 
     * @param isolationMode
     *        The isolation mode for the process that contains the Lambda function. The process can run in an isolated
     *        runtime environment inside the AWS IoT Greengrass container, or as a regular process outside any
     *        container.</p>
     *        <p>
     *        Default: <code>GreengrassContainer</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaIsolationMode
     */

    public LambdaLinuxProcessParams withIsolationMode(String isolationMode) {
        setIsolationMode(isolationMode);
        return this;
    }

    /**
     * <p>
     * The isolation mode for the process that contains the Lambda function. The process can run in an isolated runtime
     * environment inside the AWS IoT Greengrass container, or as a regular process outside any container.
     * </p>
     * <p>
     * Default: <code>GreengrassContainer</code>
     * </p>
     * 
     * @param isolationMode
     *        The isolation mode for the process that contains the Lambda function. The process can run in an isolated
     *        runtime environment inside the AWS IoT Greengrass container, or as a regular process outside any
     *        container.</p>
     *        <p>
     *        Default: <code>GreengrassContainer</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaIsolationMode
     */

    public LambdaLinuxProcessParams withIsolationMode(LambdaIsolationMode isolationMode) {
        this.isolationMode = isolationMode.toString();
        return this;
    }

    /**
     * <p>
     * The parameters for the container in which the Lambda function runs.
     * </p>
     * 
     * @param containerParams
     *        The parameters for the container in which the Lambda function runs.
     */

    public void setContainerParams(LambdaContainerParams containerParams) {
        this.containerParams = containerParams;
    }

    /**
     * <p>
     * The parameters for the container in which the Lambda function runs.
     * </p>
     * 
     * @return The parameters for the container in which the Lambda function runs.
     */

    public LambdaContainerParams getContainerParams() {
        return this.containerParams;
    }

    /**
     * <p>
     * The parameters for the container in which the Lambda function runs.
     * </p>
     * 
     * @param containerParams
     *        The parameters for the container in which the Lambda function runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaLinuxProcessParams withContainerParams(LambdaContainerParams containerParams) {
        setContainerParams(containerParams);
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
        if (getIsolationMode() != null)
            sb.append("IsolationMode: ").append(getIsolationMode()).append(",");
        if (getContainerParams() != null)
            sb.append("ContainerParams: ").append(getContainerParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaLinuxProcessParams == false)
            return false;
        LambdaLinuxProcessParams other = (LambdaLinuxProcessParams) obj;
        if (other.getIsolationMode() == null ^ this.getIsolationMode() == null)
            return false;
        if (other.getIsolationMode() != null && other.getIsolationMode().equals(this.getIsolationMode()) == false)
            return false;
        if (other.getContainerParams() == null ^ this.getContainerParams() == null)
            return false;
        if (other.getContainerParams() != null && other.getContainerParams().equals(this.getContainerParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsolationMode() == null) ? 0 : getIsolationMode().hashCode());
        hashCode = prime * hashCode + ((getContainerParams() == null) ? 0 : getContainerParams().hashCode());
        return hashCode;
    }

    @Override
    public LambdaLinuxProcessParams clone() {
        try {
            return (LambdaLinuxProcessParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaLinuxProcessParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
