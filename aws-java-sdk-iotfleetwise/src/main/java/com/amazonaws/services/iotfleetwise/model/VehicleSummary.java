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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a vehicle.
 * </p>
 * <p>
 * To return this information about vehicles in your account, you can use the API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/VehicleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VehicleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle.
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
     * The unique ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     * 
     * @return The unique ID of the vehicle.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehicleSummary withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vehicle.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vehicle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the vehicle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehicleSummary withArn(String arn) {
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

    public VehicleSummary withModelManifestArn(String modelManifestArn) {
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

    public VehicleSummary withDecoderManifestArn(String decoderManifestArn) {
        setDecoderManifestArn(decoderManifestArn);
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

    public VehicleSummary withCreationTime(java.util.Date creationTime) {
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

    public VehicleSummary withLastModificationTime(java.util.Date lastModificationTime) {
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

        if (obj instanceof VehicleSummary == false)
            return false;
        VehicleSummary other = (VehicleSummary) obj;
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
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public VehicleSummary clone() {
        try {
            return (VehicleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.VehicleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
