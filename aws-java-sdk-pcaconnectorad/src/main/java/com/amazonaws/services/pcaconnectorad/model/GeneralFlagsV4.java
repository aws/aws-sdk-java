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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * General flags for v4 template schema that defines if the template is for a machine or a user and if the template can
 * be issued using autoenrollment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/GeneralFlagsV4" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneralFlagsV4 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * </p>
     */
    private Boolean autoEnrollment;
    /**
     * <p>
     * Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to FALSE if
     * the template is for users
     * </p>
     */
    private Boolean machineType;

    /**
     * <p>
     * Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * </p>
     * 
     * @param autoEnrollment
     *        Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     */

    public void setAutoEnrollment(Boolean autoEnrollment) {
        this.autoEnrollment = autoEnrollment;
    }

    /**
     * <p>
     * Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * </p>
     * 
     * @return Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     */

    public Boolean getAutoEnrollment() {
        return this.autoEnrollment;
    }

    /**
     * <p>
     * Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * </p>
     * 
     * @param autoEnrollment
     *        Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralFlagsV4 withAutoEnrollment(Boolean autoEnrollment) {
        setAutoEnrollment(autoEnrollment);
        return this;
    }

    /**
     * <p>
     * Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     * </p>
     * 
     * @return Allows certificate issuance using autoenrollment. Set to TRUE to allow autoenrollment.
     */

    public Boolean isAutoEnrollment() {
        return this.autoEnrollment;
    }

    /**
     * <p>
     * Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to FALSE if
     * the template is for users
     * </p>
     * 
     * @param machineType
     *        Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to
     *        FALSE if the template is for users
     */

    public void setMachineType(Boolean machineType) {
        this.machineType = machineType;
    }

    /**
     * <p>
     * Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to FALSE if
     * the template is for users
     * </p>
     * 
     * @return Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to
     *         FALSE if the template is for users
     */

    public Boolean getMachineType() {
        return this.machineType;
    }

    /**
     * <p>
     * Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to FALSE if
     * the template is for users
     * </p>
     * 
     * @param machineType
     *        Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to
     *        FALSE if the template is for users
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralFlagsV4 withMachineType(Boolean machineType) {
        setMachineType(machineType);
        return this;
    }

    /**
     * <p>
     * Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to FALSE if
     * the template is for users
     * </p>
     * 
     * @return Defines if the template is for machines or users. Set to TRUE if the template is for machines. Set to
     *         FALSE if the template is for users
     */

    public Boolean isMachineType() {
        return this.machineType;
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
        if (getAutoEnrollment() != null)
            sb.append("AutoEnrollment: ").append(getAutoEnrollment()).append(",");
        if (getMachineType() != null)
            sb.append("MachineType: ").append(getMachineType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneralFlagsV4 == false)
            return false;
        GeneralFlagsV4 other = (GeneralFlagsV4) obj;
        if (other.getAutoEnrollment() == null ^ this.getAutoEnrollment() == null)
            return false;
        if (other.getAutoEnrollment() != null && other.getAutoEnrollment().equals(this.getAutoEnrollment()) == false)
            return false;
        if (other.getMachineType() == null ^ this.getMachineType() == null)
            return false;
        if (other.getMachineType() != null && other.getMachineType().equals(this.getMachineType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnrollment() == null) ? 0 : getAutoEnrollment().hashCode());
        hashCode = prime * hashCode + ((getMachineType() == null) ? 0 : getMachineType().hashCode());
        return hashCode;
    }

    @Override
    public GeneralFlagsV4 clone() {
        try {
            return (GeneralFlagsV4) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.GeneralFlagsV4Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
