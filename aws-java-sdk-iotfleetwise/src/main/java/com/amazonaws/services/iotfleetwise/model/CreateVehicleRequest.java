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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateVehicle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVehicleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The Amazon Resource Name ARN of a vehicle model.
     * </p>
     */
    private String modelManifestArn;
    /**
     * <p>
     * The ARN of a decoder manifest.
     * </p>
     */
    private String decoderManifestArn;
    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     * <code>"1.3 L R2"</code>
     * </p>
     */
    private java.util.Map<String, String> attributes;
    /**
     * <p>
     * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing
     * Amazon Web Services IoT thing as a vehicle.
     * </p>
     * <p>
     * Default: <code/>
     * </p>
     */
    private String associationBehavior;
    /**
     * <p>
     * Metadata that can be used to manage the vehicle.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to create.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @return The unique ID of the vehicle to create.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to create.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name ARN of a vehicle model.
     * </p>
     * 
     * @param modelManifestArn
     *        The Amazon Resource Name ARN of a vehicle model.
     */

    public void setModelManifestArn(String modelManifestArn) {
        this.modelManifestArn = modelManifestArn;
    }

    /**
     * <p>
     * The Amazon Resource Name ARN of a vehicle model.
     * </p>
     * 
     * @return The Amazon Resource Name ARN of a vehicle model.
     */

    public String getModelManifestArn() {
        return this.modelManifestArn;
    }

    /**
     * <p>
     * The Amazon Resource Name ARN of a vehicle model.
     * </p>
     * 
     * @param modelManifestArn
     *        The Amazon Resource Name ARN of a vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withModelManifestArn(String modelManifestArn) {
        setModelManifestArn(modelManifestArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a decoder manifest.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of a decoder manifest.
     */

    public void setDecoderManifestArn(String decoderManifestArn) {
        this.decoderManifestArn = decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of a decoder manifest.
     * </p>
     * 
     * @return The ARN of a decoder manifest.
     */

    public String getDecoderManifestArn() {
        return this.decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of a decoder manifest.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of a decoder manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withDecoderManifestArn(String decoderManifestArn) {
        setDecoderManifestArn(decoderManifestArn);
        return this;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     * <code>"1.3 L R2"</code>
     * </p>
     * 
     * @return Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     *         <code>"1.3 L R2"</code>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     * <code>"1.3 L R2"</code>
     * </p>
     * 
     * @param attributes
     *        Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     *        <code>"1.3 L R2"</code>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     * <code>"1.3 L R2"</code>
     * </p>
     * 
     * @param attributes
     *        Static information about a vehicle in a key-value pair. For example: <code>"engineType"</code> :
     *        <code>"1.3 L R2"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateVehicleRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest addAttributesEntry(String key, String value) {
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

    public CreateVehicleRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing
     * Amazon Web Services IoT thing as a vehicle.
     * </p>
     * <p>
     * Default: <code/>
     * </p>
     * 
     * @param associationBehavior
     *        An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an
     *        existing Amazon Web Services IoT thing as a vehicle. </p>
     *        <p>
     *        Default: <code/>
     * @see VehicleAssociationBehavior
     */

    public void setAssociationBehavior(String associationBehavior) {
        this.associationBehavior = associationBehavior;
    }

    /**
     * <p>
     * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing
     * Amazon Web Services IoT thing as a vehicle.
     * </p>
     * <p>
     * Default: <code/>
     * </p>
     * 
     * @return An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an
     *         existing Amazon Web Services IoT thing as a vehicle. </p>
     *         <p>
     *         Default: <code/>
     * @see VehicleAssociationBehavior
     */

    public String getAssociationBehavior() {
        return this.associationBehavior;
    }

    /**
     * <p>
     * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing
     * Amazon Web Services IoT thing as a vehicle.
     * </p>
     * <p>
     * Default: <code/>
     * </p>
     * 
     * @param associationBehavior
     *        An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an
     *        existing Amazon Web Services IoT thing as a vehicle. </p>
     *        <p>
     *        Default: <code/>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleAssociationBehavior
     */

    public CreateVehicleRequest withAssociationBehavior(String associationBehavior) {
        setAssociationBehavior(associationBehavior);
        return this;
    }

    /**
     * <p>
     * An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an existing
     * Amazon Web Services IoT thing as a vehicle.
     * </p>
     * <p>
     * Default: <code/>
     * </p>
     * 
     * @param associationBehavior
     *        An option to create a new Amazon Web Services IoT thing when creating a vehicle, or to validate an
     *        existing Amazon Web Services IoT thing as a vehicle. </p>
     *        <p>
     *        Default: <code/>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleAssociationBehavior
     */

    public CreateVehicleRequest withAssociationBehavior(VehicleAssociationBehavior associationBehavior) {
        this.associationBehavior = associationBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle.
     * </p>
     * 
     * @return Metadata that can be used to manage the vehicle.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVehicleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAssociationBehavior() != null)
            sb.append("AssociationBehavior: ").append(getAssociationBehavior()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVehicleRequest == false)
            return false;
        CreateVehicleRequest other = (CreateVehicleRequest) obj;
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
        if (other.getAssociationBehavior() == null ^ this.getAssociationBehavior() == null)
            return false;
        if (other.getAssociationBehavior() != null && other.getAssociationBehavior().equals(this.getAssociationBehavior()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getAssociationBehavior() == null) ? 0 : getAssociationBehavior().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVehicleRequest clone() {
        return (CreateVehicleRequest) super.clone();
    }

}
