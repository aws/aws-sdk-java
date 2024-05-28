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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutRuntimeManagementConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRuntimeManagementConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The runtime update mode.
     * </p>
     */
    private String updateRuntimeOn;
    /**
     * <p>
     * The ARN of the function
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     */
    private String runtimeVersionArn;

    /**
     * <p>
     * The runtime update mode.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The runtime update mode.
     * @see UpdateRuntimeOn
     */

    public void setUpdateRuntimeOn(String updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn;
    }

    /**
     * <p>
     * The runtime update mode.
     * </p>
     * 
     * @return The runtime update mode.
     * @see UpdateRuntimeOn
     */

    public String getUpdateRuntimeOn() {
        return this.updateRuntimeOn;
    }

    /**
     * <p>
     * The runtime update mode.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The runtime update mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public PutRuntimeManagementConfigResult withUpdateRuntimeOn(String updateRuntimeOn) {
        setUpdateRuntimeOn(updateRuntimeOn);
        return this;
    }

    /**
     * <p>
     * The runtime update mode.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The runtime update mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public PutRuntimeManagementConfigResult withUpdateRuntimeOn(UpdateRuntimeOn updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the function
     * </p>
     * 
     * @param functionArn
     *        The ARN of the function
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the function
     * </p>
     * 
     * @return The ARN of the function
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The ARN of the function
     * </p>
     * 
     * @param functionArn
     *        The ARN of the function
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuntimeManagementConfigResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the
     *        ARN is returned, otherwise <code>null</code> is returned.
     */

    public void setRuntimeVersionArn(String runtimeVersionArn) {
        this.runtimeVersionArn = runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @return The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>,
     *         the ARN is returned, otherwise <code>null</code> is returned.
     */

    public String getRuntimeVersionArn() {
        return this.runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime the function is configured to use. If the runtime update mode is <b>manual</b>, the
     *        ARN is returned, otherwise <code>null</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRuntimeManagementConfigResult withRuntimeVersionArn(String runtimeVersionArn) {
        setRuntimeVersionArn(runtimeVersionArn);
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
        if (getUpdateRuntimeOn() != null)
            sb.append("UpdateRuntimeOn: ").append(getUpdateRuntimeOn()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getRuntimeVersionArn() != null)
            sb.append("RuntimeVersionArn: ").append(getRuntimeVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRuntimeManagementConfigResult == false)
            return false;
        PutRuntimeManagementConfigResult other = (PutRuntimeManagementConfigResult) obj;
        if (other.getUpdateRuntimeOn() == null ^ this.getUpdateRuntimeOn() == null)
            return false;
        if (other.getUpdateRuntimeOn() != null && other.getUpdateRuntimeOn().equals(this.getUpdateRuntimeOn()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getRuntimeVersionArn() == null ^ this.getRuntimeVersionArn() == null)
            return false;
        if (other.getRuntimeVersionArn() != null && other.getRuntimeVersionArn().equals(this.getRuntimeVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateRuntimeOn() == null) ? 0 : getUpdateRuntimeOn().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersionArn() == null) ? 0 : getRuntimeVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public PutRuntimeManagementConfigResult clone() {
        try {
            return (PutRuntimeManagementConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
