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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/GetVehicle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVehicleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the vehicle.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of a vehicle model (model manifest) associated with the vehicle.
     * </p>
     */
    private String modelManifestArn;
    /**
     * <p>
     * The ARN of a decoder manifest associated with the vehicle.
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
     * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle.
     * </p>
     * 
     * @return The ID of the vehicle.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The ID of the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle to retrieve information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult withArn(String arn) {
        setArn(arn);
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

    public GetVehicleResult withModelManifestArn(String modelManifestArn) {
        setModelManifestArn(modelManifestArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a decoder manifest associated with the vehicle.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of a decoder manifest associated with the vehicle.
     */

    public void setDecoderManifestArn(String decoderManifestArn) {
        this.decoderManifestArn = decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of a decoder manifest associated with the vehicle.
     * </p>
     * 
     * @return The ARN of a decoder manifest associated with the vehicle.
     */

    public String getDecoderManifestArn() {
        return this.decoderManifestArn;
    }

    /**
     * <p>
     * The ARN of a decoder manifest associated with the vehicle.
     * </p>
     * 
     * @param decoderManifestArn
     *        The ARN of a decoder manifest associated with the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult withDecoderManifestArn(String decoderManifestArn) {
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

    public GetVehicleResult withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see GetVehicleResult#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult addAttributesEntry(String key, String value) {
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

    public GetVehicleResult clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param creationTime
     *        The time the vehicle was created in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @return The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * </p>
     * 
     * @param lastModificationTime
     *        The time the vehicle was last updated in seconds since epoch (January 1, 1970 at midnight UTC time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVehicleResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getModelManifestArn() != null)
            sb.append("ModelManifestArn: ").append(getModelManifestArn()).append(",");
        if (getDecoderManifestArn() != null)
            sb.append("DecoderManifestArn: ").append(getDecoderManifestArn()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVehicleResult == false)
            return false;
        GetVehicleResult other = (GetVehicleResult) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getModelManifestArn() == null) ? 0 : getModelManifestArn().hashCode());
        hashCode = prime * hashCode + ((getDecoderManifestArn() == null) ? 0 : getDecoderManifestArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public GetVehicleResult clone() {
        try {
            return (GetVehicleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
