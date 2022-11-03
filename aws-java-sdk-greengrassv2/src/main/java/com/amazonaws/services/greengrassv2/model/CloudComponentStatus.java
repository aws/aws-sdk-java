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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the status of a component version in the IoT Greengrass service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/CloudComponentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudComponentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the component version.
     * </p>
     */
    private String componentState;
    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component version.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A dictionary of errors that communicate why the component version is in an error state. For example, if IoT
     * Greengrass can't access an artifact for the component version, then <code>errors</code> contains the artifact's
     * URI as a key, and the error message as the value for that key.
     * </p>
     */
    private java.util.Map<String, String> errors;
    /**
     * <p>
     * The vendor guidance state for the component version. This state indicates whether the component version has any
     * issues that you should consider before you deploy it. The vendor guidance state can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – This component version is available and recommended for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy this
     * component version, but we recommend that you use a different version of this component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it. If you
     * have any existing deployments that specify this component version, those deployments will fail.
     * </p>
     * </li>
     * </ul>
     */
    private String vendorGuidance;
    /**
     * <p>
     * A message that communicates details about the vendor guidance state of the component version. This message
     * communicates why a component version is discontinued or deleted.
     * </p>
     */
    private String vendorGuidanceMessage;

    /**
     * <p>
     * The state of the component version.
     * </p>
     * 
     * @param componentState
     *        The state of the component version.
     * @see CloudComponentState
     */

    public void setComponentState(String componentState) {
        this.componentState = componentState;
    }

    /**
     * <p>
     * The state of the component version.
     * </p>
     * 
     * @return The state of the component version.
     * @see CloudComponentState
     */

    public String getComponentState() {
        return this.componentState;
    }

    /**
     * <p>
     * The state of the component version.
     * </p>
     * 
     * @param componentState
     *        The state of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudComponentState
     */

    public CloudComponentStatus withComponentState(String componentState) {
        setComponentState(componentState);
        return this;
    }

    /**
     * <p>
     * The state of the component version.
     * </p>
     * 
     * @param componentState
     *        The state of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudComponentState
     */

    public CloudComponentStatus withComponentState(CloudComponentState componentState) {
        this.componentState = componentState.toString();
        return this;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component version.
     * </p>
     * 
     * @param message
     *        A message that communicates details, such as errors, about the status of the component version.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component version.
     * </p>
     * 
     * @return A message that communicates details, such as errors, about the status of the component version.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that communicates details, such as errors, about the status of the component version.
     * </p>
     * 
     * @param message
     *        A message that communicates details, such as errors, about the status of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component version is in an error state. For example, if IoT
     * Greengrass can't access an artifact for the component version, then <code>errors</code> contains the artifact's
     * URI as a key, and the error message as the value for that key.
     * </p>
     * 
     * @return A dictionary of errors that communicate why the component version is in an error state. For example, if
     *         IoT Greengrass can't access an artifact for the component version, then <code>errors</code> contains the
     *         artifact's URI as a key, and the error message as the value for that key.
     */

    public java.util.Map<String, String> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component version is in an error state. For example, if IoT
     * Greengrass can't access an artifact for the component version, then <code>errors</code> contains the artifact's
     * URI as a key, and the error message as the value for that key.
     * </p>
     * 
     * @param errors
     *        A dictionary of errors that communicate why the component version is in an error state. For example, if
     *        IoT Greengrass can't access an artifact for the component version, then <code>errors</code> contains the
     *        artifact's URI as a key, and the error message as the value for that key.
     */

    public void setErrors(java.util.Map<String, String> errors) {
        this.errors = errors;
    }

    /**
     * <p>
     * A dictionary of errors that communicate why the component version is in an error state. For example, if IoT
     * Greengrass can't access an artifact for the component version, then <code>errors</code> contains the artifact's
     * URI as a key, and the error message as the value for that key.
     * </p>
     * 
     * @param errors
     *        A dictionary of errors that communicate why the component version is in an error state. For example, if
     *        IoT Greengrass can't access an artifact for the component version, then <code>errors</code> contains the
     *        artifact's URI as a key, and the error message as the value for that key.
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
     * <p>
     * The vendor guidance state for the component version. This state indicates whether the component version has any
     * issues that you should consider before you deploy it. The vendor guidance state can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – This component version is available and recommended for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy this
     * component version, but we recommend that you use a different version of this component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it. If you
     * have any existing deployments that specify this component version, those deployments will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The vendor guidance state for the component version. This state indicates whether the component version
     *        has any issues that you should consider before you deploy it. The vendor guidance state can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – This component version is available and recommended for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy
     *        this component version, but we recommend that you use a different version of this component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it.
     *        If you have any existing deployments that specify this component version, those deployments will fail.
     *        </p>
     *        </li>
     * @see VendorGuidance
     */

    public void setVendorGuidance(String vendorGuidance) {
        this.vendorGuidance = vendorGuidance;
    }

    /**
     * <p>
     * The vendor guidance state for the component version. This state indicates whether the component version has any
     * issues that you should consider before you deploy it. The vendor guidance state can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – This component version is available and recommended for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy this
     * component version, but we recommend that you use a different version of this component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it. If you
     * have any existing deployments that specify this component version, those deployments will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The vendor guidance state for the component version. This state indicates whether the component version
     *         has any issues that you should consider before you deploy it. The vendor guidance state can be:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> – This component version is available and recommended for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy
     *         this component version, but we recommend that you use a different version of this component.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it.
     *         If you have any existing deployments that specify this component version, those deployments will fail.
     *         </p>
     *         </li>
     * @see VendorGuidance
     */

    public String getVendorGuidance() {
        return this.vendorGuidance;
    }

    /**
     * <p>
     * The vendor guidance state for the component version. This state indicates whether the component version has any
     * issues that you should consider before you deploy it. The vendor guidance state can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – This component version is available and recommended for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy this
     * component version, but we recommend that you use a different version of this component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it. If you
     * have any existing deployments that specify this component version, those deployments will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The vendor guidance state for the component version. This state indicates whether the component version
     *        has any issues that you should consider before you deploy it. The vendor guidance state can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – This component version is available and recommended for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy
     *        this component version, but we recommend that you use a different version of this component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it.
     *        If you have any existing deployments that specify this component version, those deployments will fail.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorGuidance
     */

    public CloudComponentStatus withVendorGuidance(String vendorGuidance) {
        setVendorGuidance(vendorGuidance);
        return this;
    }

    /**
     * <p>
     * The vendor guidance state for the component version. This state indicates whether the component version has any
     * issues that you should consider before you deploy it. The vendor guidance state can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – This component version is available and recommended for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy this
     * component version, but we recommend that you use a different version of this component.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it. If you
     * have any existing deployments that specify this component version, those deployments will fail.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vendorGuidance
     *        The vendor guidance state for the component version. This state indicates whether the component version
     *        has any issues that you should consider before you deploy it. The vendor guidance state can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – This component version is available and recommended for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISCONTINUED</code> – This component version has been discontinued by its publisher. You can deploy
     *        this component version, but we recommend that you use a different version of this component.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> – This component version has been deleted by its publisher, so you can't deploy it.
     *        If you have any existing deployments that specify this component version, those deployments will fail.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VendorGuidance
     */

    public CloudComponentStatus withVendorGuidance(VendorGuidance vendorGuidance) {
        this.vendorGuidance = vendorGuidance.toString();
        return this;
    }

    /**
     * <p>
     * A message that communicates details about the vendor guidance state of the component version. This message
     * communicates why a component version is discontinued or deleted.
     * </p>
     * 
     * @param vendorGuidanceMessage
     *        A message that communicates details about the vendor guidance state of the component version. This message
     *        communicates why a component version is discontinued or deleted.
     */

    public void setVendorGuidanceMessage(String vendorGuidanceMessage) {
        this.vendorGuidanceMessage = vendorGuidanceMessage;
    }

    /**
     * <p>
     * A message that communicates details about the vendor guidance state of the component version. This message
     * communicates why a component version is discontinued or deleted.
     * </p>
     * 
     * @return A message that communicates details about the vendor guidance state of the component version. This
     *         message communicates why a component version is discontinued or deleted.
     */

    public String getVendorGuidanceMessage() {
        return this.vendorGuidanceMessage;
    }

    /**
     * <p>
     * A message that communicates details about the vendor guidance state of the component version. This message
     * communicates why a component version is discontinued or deleted.
     * </p>
     * 
     * @param vendorGuidanceMessage
     *        A message that communicates details about the vendor guidance state of the component version. This message
     *        communicates why a component version is discontinued or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudComponentStatus withVendorGuidanceMessage(String vendorGuidanceMessage) {
        setVendorGuidanceMessage(vendorGuidanceMessage);
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
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getVendorGuidance() != null)
            sb.append("VendorGuidance: ").append(getVendorGuidance()).append(",");
        if (getVendorGuidanceMessage() != null)
            sb.append("VendorGuidanceMessage: ").append(getVendorGuidanceMessage());
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
        if (other.getVendorGuidance() == null ^ this.getVendorGuidance() == null)
            return false;
        if (other.getVendorGuidance() != null && other.getVendorGuidance().equals(this.getVendorGuidance()) == false)
            return false;
        if (other.getVendorGuidanceMessage() == null ^ this.getVendorGuidanceMessage() == null)
            return false;
        if (other.getVendorGuidanceMessage() != null && other.getVendorGuidanceMessage().equals(this.getVendorGuidanceMessage()) == false)
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
        hashCode = prime * hashCode + ((getVendorGuidance() == null) ? 0 : getVendorGuidance().hashCode());
        hashCode = prime * hashCode + ((getVendorGuidanceMessage() == null) ? 0 : getVendorGuidanceMessage().hashCode());
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
