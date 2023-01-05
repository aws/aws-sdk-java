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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains all error-related information for the deployment record. The status details will be null if the deployment
 * is in a success state.
 * </p>
 * <note>
 * <p>
 * Greengrass nucleus v2.8.0 or later is required to get an accurate <code>errorStack</code> and <code>errorTypes</code>
 * response. This field will not be returned for earlier Greengrass nucleus versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/EffectiveDeploymentStatusDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveDeploymentStatusDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains an ordered list of short error codes that range from the most generic error to the most specific one.
     * The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code> is in a
     * failed state. The response will be an empty list if there is no error.
     * </p>
     */
    private java.util.List<String> errorStack;
    /**
     * <p>
     * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating
     * the failure. The response will be an empty list if there is no error.
     * </p>
     */
    private java.util.List<String> errorTypes;

    /**
     * <p>
     * Contains an ordered list of short error codes that range from the most generic error to the most specific one.
     * The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code> is in a
     * failed state. The response will be an empty list if there is no error.
     * </p>
     * 
     * @return Contains an ordered list of short error codes that range from the most generic error to the most specific
     *         one. The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code>
     *         is in a failed state. The response will be an empty list if there is no error.
     */

    public java.util.List<String> getErrorStack() {
        return errorStack;
    }

    /**
     * <p>
     * Contains an ordered list of short error codes that range from the most generic error to the most specific one.
     * The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code> is in a
     * failed state. The response will be an empty list if there is no error.
     * </p>
     * 
     * @param errorStack
     *        Contains an ordered list of short error codes that range from the most generic error to the most specific
     *        one. The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code>
     *        is in a failed state. The response will be an empty list if there is no error.
     */

    public void setErrorStack(java.util.Collection<String> errorStack) {
        if (errorStack == null) {
            this.errorStack = null;
            return;
        }

        this.errorStack = new java.util.ArrayList<String>(errorStack);
    }

    /**
     * <p>
     * Contains an ordered list of short error codes that range from the most generic error to the most specific one.
     * The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code> is in a
     * failed state. The response will be an empty list if there is no error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorStack(java.util.Collection)} or {@link #withErrorStack(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorStack
     *        Contains an ordered list of short error codes that range from the most generic error to the most specific
     *        one. The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code>
     *        is in a failed state. The response will be an empty list if there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeploymentStatusDetails withErrorStack(String... errorStack) {
        if (this.errorStack == null) {
            setErrorStack(new java.util.ArrayList<String>(errorStack.length));
        }
        for (String ele : errorStack) {
            this.errorStack.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an ordered list of short error codes that range from the most generic error to the most specific one.
     * The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code> is in a
     * failed state. The response will be an empty list if there is no error.
     * </p>
     * 
     * @param errorStack
     *        Contains an ordered list of short error codes that range from the most generic error to the most specific
     *        one. The error codes describe the reason for failure whenever the <code>coreDeviceExecutionStatus</code>
     *        is in a failed state. The response will be an empty list if there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeploymentStatusDetails withErrorStack(java.util.Collection<String> errorStack) {
        setErrorStack(errorStack);
        return this;
    }

    /**
     * <p>
     * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating
     * the failure. The response will be an empty list if there is no error.
     * </p>
     * 
     * @return Contains tags which describe the error. You can use the error types to classify errors to assist with
     *         remediating the failure. The response will be an empty list if there is no error.
     */

    public java.util.List<String> getErrorTypes() {
        return errorTypes;
    }

    /**
     * <p>
     * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating
     * the failure. The response will be an empty list if there is no error.
     * </p>
     * 
     * @param errorTypes
     *        Contains tags which describe the error. You can use the error types to classify errors to assist with
     *        remediating the failure. The response will be an empty list if there is no error.
     */

    public void setErrorTypes(java.util.Collection<String> errorTypes) {
        if (errorTypes == null) {
            this.errorTypes = null;
            return;
        }

        this.errorTypes = new java.util.ArrayList<String>(errorTypes);
    }

    /**
     * <p>
     * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating
     * the failure. The response will be an empty list if there is no error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorTypes(java.util.Collection)} or {@link #withErrorTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param errorTypes
     *        Contains tags which describe the error. You can use the error types to classify errors to assist with
     *        remediating the failure. The response will be an empty list if there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeploymentStatusDetails withErrorTypes(String... errorTypes) {
        if (this.errorTypes == null) {
            setErrorTypes(new java.util.ArrayList<String>(errorTypes.length));
        }
        for (String ele : errorTypes) {
            this.errorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains tags which describe the error. You can use the error types to classify errors to assist with remediating
     * the failure. The response will be an empty list if there is no error.
     * </p>
     * 
     * @param errorTypes
     *        Contains tags which describe the error. You can use the error types to classify errors to assist with
     *        remediating the failure. The response will be an empty list if there is no error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveDeploymentStatusDetails withErrorTypes(java.util.Collection<String> errorTypes) {
        setErrorTypes(errorTypes);
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
        if (getErrorStack() != null)
            sb.append("ErrorStack: ").append(getErrorStack()).append(",");
        if (getErrorTypes() != null)
            sb.append("ErrorTypes: ").append(getErrorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectiveDeploymentStatusDetails == false)
            return false;
        EffectiveDeploymentStatusDetails other = (EffectiveDeploymentStatusDetails) obj;
        if (other.getErrorStack() == null ^ this.getErrorStack() == null)
            return false;
        if (other.getErrorStack() != null && other.getErrorStack().equals(this.getErrorStack()) == false)
            return false;
        if (other.getErrorTypes() == null ^ this.getErrorTypes() == null)
            return false;
        if (other.getErrorTypes() != null && other.getErrorTypes().equals(this.getErrorTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorStack() == null) ? 0 : getErrorStack().hashCode());
        hashCode = prime * hashCode + ((getErrorTypes() == null) ? 0 : getErrorTypes().hashCode());
        return hashCode;
    }

    @Override
    public EffectiveDeploymentStatusDetails clone() {
        try {
            return (EffectiveDeploymentStatusDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.EffectiveDeploymentStatusDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
