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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Configuration information that specifies how a Lambda function runs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionDefaultExecutionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionDefaultExecutionConfig implements Serializable, Cloneable, StructuredPojo {

    private String isolationMode;

    private FunctionRunAsConfig runAs;

    /**
     * @param isolationMode
     * @see FunctionIsolationMode
     */

    public void setIsolationMode(String isolationMode) {
        this.isolationMode = isolationMode;
    }

    /**
     * @return
     * @see FunctionIsolationMode
     */

    public String getIsolationMode() {
        return this.isolationMode;
    }

    /**
     * @param isolationMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionIsolationMode
     */

    public FunctionDefaultExecutionConfig withIsolationMode(String isolationMode) {
        setIsolationMode(isolationMode);
        return this;
    }

    /**
     * @param isolationMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FunctionIsolationMode
     */

    public FunctionDefaultExecutionConfig withIsolationMode(FunctionIsolationMode isolationMode) {
        this.isolationMode = isolationMode.toString();
        return this;
    }

    /**
     * @param runAs
     */

    public void setRunAs(FunctionRunAsConfig runAs) {
        this.runAs = runAs;
    }

    /**
     * @return
     */

    public FunctionRunAsConfig getRunAs() {
        return this.runAs;
    }

    /**
     * @param runAs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionDefaultExecutionConfig withRunAs(FunctionRunAsConfig runAs) {
        setRunAs(runAs);
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
        if (getRunAs() != null)
            sb.append("RunAs: ").append(getRunAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionDefaultExecutionConfig == false)
            return false;
        FunctionDefaultExecutionConfig other = (FunctionDefaultExecutionConfig) obj;
        if (other.getIsolationMode() == null ^ this.getIsolationMode() == null)
            return false;
        if (other.getIsolationMode() != null && other.getIsolationMode().equals(this.getIsolationMode()) == false)
            return false;
        if (other.getRunAs() == null ^ this.getRunAs() == null)
            return false;
        if (other.getRunAs() != null && other.getRunAs().equals(this.getRunAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsolationMode() == null) ? 0 : getIsolationMode().hashCode());
        hashCode = prime * hashCode + ((getRunAs() == null) ? 0 : getRunAs().hashCode());
        return hashCode;
    }

    @Override
    public FunctionDefaultExecutionConfig clone() {
        try {
            return (FunctionDefaultExecutionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionDefaultExecutionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
