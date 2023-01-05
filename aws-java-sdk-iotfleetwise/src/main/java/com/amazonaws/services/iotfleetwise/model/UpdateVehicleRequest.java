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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateVehicle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVehicleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the vehicle to update.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the vehicle.
     * </p>
     */
    private String modelManifestArn;
    /**
     * <p>
     * The ARN of the decoder manifest associated with this vehicle.
     * </p>
     */
    private String decoderManifestArn;
    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example:
     * </p>
     * <p>
     * <code>"engineType"</code> : <code>"1.3 L R2"</code>
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * The method the specified attributes will update the existing attributes on the vehicle. Use<code>Overwite</code>
     * to replace the vehicle attributes with the specified attributes. Or use <code>Merge</code> to combine all
     * attributes.
     * </p>
     * <p>
     * This is required if attributes are present in the input.
     * </p>
     */
    private String attributeUpdateMode;

    /**
     * <p>
     * The unique ID of the vehicle to update.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to update.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to update.
     * </p>
     * 
     * @return The unique ID of the vehicle to update.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to update.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the vehicle.
     * </p>
     * 
     * @param modelManifestArn
     *        The ARN of a vehicle model (model manifest) associated with the vehicle.
     */

    public void setModelManifestArn(String modelManifestArn) {
        this.modelManifestArn = modelManifestArn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the vehicle.
     * </p>
     * 
     * @return The ARN of a vehicle model (model manifest) associated with the vehicle.
     */

    public String getModelManifestArn() {
        return this.modelManifestArn;
    }

    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the vehicle.
     * </p>
     * 
     * @param modelManifestArn
     *        The ARN of a vehicle model (model manifest) associated with the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest withModelManifestArn(String modelManifestArn) {
        setModelManifestArn(modelManifestArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the decoder manifest associated with this vehicle.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of the decoder manifest associated with this vehicle.
     */

    public void setDecoderManifestArn(String decoderManifestArn) {
        this.decoderManifestArn = decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of the decoder manifest associated with this vehicle.
     * </p>
     * 
     * @return The ARN of the decoder manifest associated with this vehicle.
     */

    public String getDecoderManifestArn() {
        return this.decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of the decoder manifest associated with this vehicle.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of the decoder manifest associated with this vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest withDecoderManifestArn(String decoderManifestArn) {
        setDecoderManifestArn(decoderManifestArn);
        return this;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example:
     * </p>
     * <p>
     * <code>"engineType"</code> : <code>"1.3 L R2"</code>
     * </p>
     * 
     * @return Static information about a vehicle in a key-value pair. For example:</p>
     *         <p>
     *         <code>"engineType"</code> : <code>"1.3 L R2"</code>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example:
     * </p>
     * <p>
     * <code>"engineType"</code> : <code>"1.3 L R2"</code>
     * </p>
     * 
     * @param attributes
     *        Static information about a vehicle in a key-value pair. For example:</p>
     *        <p>
     *        <code>"engineType"</code> : <code>"1.3 L R2"</code>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example:
     * </p>
     * <p>
     * <code>"engineType"</code> : <code>"1.3 L R2"</code>
     * </p>
     * 
     * @param attributes
     *        Static information about a vehicle in a key-value pair. For example:</p>
     *        <p>
     *        <code>"engineType"</code> : <code>"1.3 L R2"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see UpdateVehicleRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVehicleRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The method the specified attributes will update the existing attributes on the vehicle. Use<code>Overwite</code>
     * to replace the vehicle attributes with the specified attributes. Or use <code>Merge</code> to combine all
     * attributes.
     * </p>
     * <p>
     * This is required if attributes are present in the input.
     * </p>
     * 
     * @param attributeUpdateMode
     *        The method the specified attributes will update the existing attributes on the vehicle. Use
     *        <code>Overwite</code> to replace the vehicle attributes with the specified attributes. Or use
     *        <code>Merge</code> to combine all attributes.</p>
     *        <p>
     *        This is required if attributes are present in the input.
     * @see UpdateMode
     */

    public void setAttributeUpdateMode(String attributeUpdateMode) {
        this.attributeUpdateMode = attributeUpdateMode;
    }

    /**
     * <p>
     * The method the specified attributes will update the existing attributes on the vehicle. Use<code>Overwite</code>
     * to replace the vehicle attributes with the specified attributes. Or use <code>Merge</code> to combine all
     * attributes.
     * </p>
     * <p>
     * This is required if attributes are present in the input.
     * </p>
     * 
     * @return The method the specified attributes will update the existing attributes on the vehicle. Use
     *         <code>Overwite</code> to replace the vehicle attributes with the specified attributes. Or use
     *         <code>Merge</code> to combine all attributes.</p>
     *         <p>
     *         This is required if attributes are present in the input.
     * @see UpdateMode
     */

    public String getAttributeUpdateMode() {
        return this.attributeUpdateMode;
    }

    /**
     * <p>
     * The method the specified attributes will update the existing attributes on the vehicle. Use<code>Overwite</code>
     * to replace the vehicle attributes with the specified attributes. Or use <code>Merge</code> to combine all
     * attributes.
     * </p>
     * <p>
     * This is required if attributes are present in the input.
     * </p>
     * 
     * @param attributeUpdateMode
     *        The method the specified attributes will update the existing attributes on the vehicle. Use
     *        <code>Overwite</code> to replace the vehicle attributes with the specified attributes. Or use
     *        <code>Merge</code> to combine all attributes.</p>
     *        <p>
     *        This is required if attributes are present in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateMode
     */

    public UpdateVehicleRequest withAttributeUpdateMode(String attributeUpdateMode) {
        setAttributeUpdateMode(attributeUpdateMode);
        return this;
    }

    /**
     * <p>
     * The method the specified attributes will update the existing attributes on the vehicle. Use<code>Overwite</code>
     * to replace the vehicle attributes with the specified attributes. Or use <code>Merge</code> to combine all
     * attributes.
     * </p>
     * <p>
     * This is required if attributes are present in the input.
     * </p>
     * 
     * @param attributeUpdateMode
     *        The method the specified attributes will update the existing attributes on the vehicle. Use
     *        <code>Overwite</code> to replace the vehicle attributes with the specified attributes. Or use
     *        <code>Merge</code> to combine all attributes.</p>
     *        <p>
     *        This is required if attributes are present in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateMode
     */

    public UpdateVehicleRequest withAttributeUpdateMode(UpdateMode attributeUpdateMode) {
        this.attributeUpdateMode = attributeUpdateMode.toString();
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
        if (getVehicleName() != null)
            sb.append("VehicleName: ").append(getVehicleName()).append(",");
        if (getModelManifestArn() != null)
            sb.append("ModelManifestArn: ").append(getModelManifestArn()).append(",");
        if (getDecoderManifestArn() != null)
            sb.append("DecoderManifestArn: ").append(getDecoderManifestArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getAttributeUpdateMode() != null)
            sb.append("AttributeUpdateMode: ").append(getAttributeUpdateMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVehicleRequest == false)
            return false;
        UpdateVehicleRequest other = (UpdateVehicleRequest) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getModelManifestArn() == null ^ this.getModelManifestArn() == null)
            return false;
        if (other.getModelManifestArn() != null && other.getModelManifestArn().equals(this.getModelManifestArn()) == false)
            return false;
        if (other.getDecoderManifestArn() == null ^ this.getDecoderManifestArn() == null)
            return false;
        if (other.getDecoderManifestArn() != null && other.getDecoderManifestArn().equals(this.getDecoderManifestArn()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getAttributeUpdateMode() == null ^ this.getAttributeUpdateMode() == null)
            return false;
        if (other.getAttributeUpdateMode() != null && other.getAttributeUpdateMode().equals(this.getAttributeUpdateMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getModelManifestArn() == null) ? 0 : getModelManifestArn().hashCode());
        hashCode = prime * hashCode + ((getDecoderManifestArn() == null) ? 0 : getDecoderManifestArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdateMode() == null) ? 0 : getAttributeUpdateMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVehicleRequest clone() {
        return (UpdateVehicleRequest) super.clone();
    }

}
