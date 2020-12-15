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
 * Contains the status of a component in the AWS IoT Greengrass service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CloudComponentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudComponentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the component.
     * </p>
     */
    private String componentState;
    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     * Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's URI as a
     * key, and the error message as the value for that key.
     * </p>
     */
    private java.util.Map<String, String> errors;

    /**
     * <p>
     * The state of the component.
     * </p>
     * 
     * @param componentState
     *        The state of the component.
     * @see CloudComponentState
     */

    public void setComponentState(String componentState) {
        this.componentState = componentState;
    }

    /**
     * <p>
     * The state of the component.
     * </p>
     * 
     * @return The state of the component.
     * @see CloudComponentState
     */

    public String getComponentState() {
        return this.componentState;
    }

    /**
     * <p>
     * The state of the component.
     * </p>
     * 
     * @param componentState
     *        The state of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudComponentState
     */

    public CloudComponentStatus withComponentState(String componentState) {
        setComponentState(componentState);
        return this;
    }

    /**
     * <p>
     * The state of the component.
     * </p>
     * 
     * @param componentState
     *        The state of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudComponentState
     */

    public CloudComponentStatus withComponentState(CloudComponentState componentState) {
        this.componentState = componentState.toString();
        return this;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component.
     * </p>
     * 
     * @param message
     *        A message that communicates details, such as errors, about the status of the component.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component.
     * </p>
     * 
     * @return A message that communicates details, such as errors, about the status of the component.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component.
     * </p>
     * 
     * @param message
     *        A message that communicates details, such as errors, about the status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     * Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's URI as a
     * key, and the error message as the value for that key.
     * </p>
     * 
     * @return A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     *         Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's
     *         URI as a key, and the error message as the value for that key.
     */

    public java.util.Map<String, String> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     * Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's URI as a
     * key, and the error message as the value for that key.
     * </p>
     * 
     * @param errors
     *        A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     *        Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's
     *        URI as a key, and the error message as the value for that key.
     */

    public void setErrors(java.util.Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     * Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's URI as a
     * key, and the error message as the value for that key.
     * </p>
     * 
     * @param errors
     *        A dictionary of errors that communicate why the component is in an error state. For example, if AWS IoT
     *        Greengrass can't access an artifact for the component, then <code>errors</code> contains the artifact's
     *        URI as a key, and the error message as the value for that key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus withErrors(java.util.Map<String, String> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * Add a single Errors entry
     *
     * @see CloudComponentStatus#withErrors
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus addErrorsEntry(String key, String value) {
        if (null == this.errors) {
            this.errors = new java.util.HashMap<String, String>();
        }
        if (this.errors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.errors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Errors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus clearErrorsEntries() {
        this.errors = null;
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
        if (getComponentState() != null)
            sb.append("ComponentState: ").append(getComponentState()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudComponentStatus == false)
            return false;
        CloudComponentStatus other = (CloudComponentStatus) obj;
        if (other.getComponentState() == null ^ this.getComponentState() == null)
            return false;
        if (other.getComponentState() != null && other.getComponentState().equals(this.getComponentState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentState() == null) ? 0 : getComponentState().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public CloudComponentStatus clone() {
        try {
            return (CloudComponentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.CloudComponentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
