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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetRuntimeManagementConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuntimeManagementConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current runtime update mode of the function.
     * </p>
     */
    private String updateRuntimeOn;
    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     */
    private String runtimeVersionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The current runtime update mode of the function.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The current runtime update mode of the function.
     * @see UpdateRuntimeOn
     */

    public void setUpdateRuntimeOn(String updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn;
    }

    /**
     * <p>
     * The current runtime update mode of the function.
     * </p>
     * 
     * @return The current runtime update mode of the function.
     * @see UpdateRuntimeOn
     */

    public String getUpdateRuntimeOn() {
        return this.updateRuntimeOn;
    }

    /**
     * <p>
     * The current runtime update mode of the function.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The current runtime update mode of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public GetRuntimeManagementConfigResult withUpdateRuntimeOn(String updateRuntimeOn) {
        setUpdateRuntimeOn(updateRuntimeOn);
        return this;
    }

    /**
     * <p>
     * The current runtime update mode of the function.
     * </p>
     * 
     * @param updateRuntimeOn
     *        The current runtime update mode of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRuntimeOn
     */

    public GetRuntimeManagementConfigResult withUpdateRuntimeOn(UpdateRuntimeOn updateRuntimeOn) {
        this.updateRuntimeOn = updateRuntimeOn.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the
     *        ARN is returned, otherwise <code>null</code> is returned.
     */

    public void setRuntimeVersionArn(String runtimeVersionArn) {
        this.runtimeVersionArn = runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @return The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>,
     *         the ARN is returned, otherwise <code>null</code> is returned.
     */

    public String getRuntimeVersionArn() {
        return this.runtimeVersionArn;
    }

    /**
     * <p>
     * The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the ARN is
     * returned, otherwise <code>null</code> is returned.
     * </p>
     * 
     * @param runtimeVersionArn
     *        The ARN of the runtime the function is configured to use. If the runtime update mode is <b>Manual</b>, the
     *        ARN is returned, otherwise <code>null</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuntimeManagementConfigResult withRuntimeVersionArn(String runtimeVersionArn) {
        setRuntimeVersionArn(runtimeVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of your function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your function.
     * </p>
     * 
     * @param functionArn
     *        The Amazon Resource Name (ARN) of your function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRuntimeManagementConfigResult withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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
        if (getRuntimeVersionArn() != null)
            sb.append("RuntimeVersionArn: ").append(getRuntimeVersionArn()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuntimeManagementConfigResult == false)
            return false;
        GetRuntimeManagementConfigResult other = (GetRuntimeManagementConfigResult) obj;
        if (other.getUpdateRuntimeOn() == null ^ this.getUpdateRuntimeOn() == null)
            return false;
        if (other.getUpdateRuntimeOn() != null && other.getUpdateRuntimeOn().equals(this.getUpdateRuntimeOn()) == false)
            return false;
        if (other.getRuntimeVersionArn() == null ^ this.getRuntimeVersionArn() == null)
            return false;
        if (other.getRuntimeVersionArn() != null && other.getRuntimeVersionArn().equals(this.getRuntimeVersionArn()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdateRuntimeOn() == null) ? 0 : getUpdateRuntimeOn().hashCode());
        hashCode = prime * hashCode + ((getRuntimeVersionArn() == null) ? 0 : getRuntimeVersionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public GetRuntimeManagementConfigResult clone() {
        try {
            return (GetRuntimeManagementConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
