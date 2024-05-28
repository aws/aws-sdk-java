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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of your Amazon EC2 scan mode configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Ec2ScanModeState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2ScanModeState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     */
    private String scanMode;
    /**
     * <p>
     * The status of the Amazon EC2 scan mode setting.
     * </p>
     */
    private String scanModeStatus;

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @see Ec2ScanMode
     */

    public void setScanMode(String scanMode) {
        this.scanMode = scanMode;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @return The scan method that is applied to the instance.
     * @see Ec2ScanMode
     */

    public String getScanMode() {
        return this.scanMode;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2ScanMode
     */

    public Ec2ScanModeState withScanMode(String scanMode) {
        setScanMode(scanMode);
        return this;
    }

    /**
     * <p>
     * The scan method that is applied to the instance.
     * </p>
     * 
     * @param scanMode
     *        The scan method that is applied to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2ScanMode
     */

    public Ec2ScanModeState withScanMode(Ec2ScanMode scanMode) {
        this.scanMode = scanMode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the Amazon EC2 scan mode setting.
     * </p>
     * 
     * @param scanModeStatus
     *        The status of the Amazon EC2 scan mode setting.
     * @see Ec2ScanModeStatus
     */

    public void setScanModeStatus(String scanModeStatus) {
        this.scanModeStatus = scanModeStatus;
    }

    /**
     * <p>
     * The status of the Amazon EC2 scan mode setting.
     * </p>
     * 
     * @return The status of the Amazon EC2 scan mode setting.
     * @see Ec2ScanModeStatus
     */

    public String getScanModeStatus() {
        return this.scanModeStatus;
    }

    /**
     * <p>
     * The status of the Amazon EC2 scan mode setting.
     * </p>
     * 
     * @param scanModeStatus
     *        The status of the Amazon EC2 scan mode setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2ScanModeStatus
     */

    public Ec2ScanModeState withScanModeStatus(String scanModeStatus) {
        setScanModeStatus(scanModeStatus);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon EC2 scan mode setting.
     * </p>
     * 
     * @param scanModeStatus
     *        The status of the Amazon EC2 scan mode setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2ScanModeStatus
     */

    public Ec2ScanModeState withScanModeStatus(Ec2ScanModeStatus scanModeStatus) {
        this.scanModeStatus = scanModeStatus.toString();
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
        if (getScanMode() != null)
            sb.append("ScanMode: ").append(getScanMode()).append(",");
        if (getScanModeStatus() != null)
            sb.append("ScanModeStatus: ").append(getScanModeStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2ScanModeState == false)
            return false;
        Ec2ScanModeState other = (Ec2ScanModeState) obj;
        if (other.getScanMode() == null ^ this.getScanMode() == null)
            return false;
        if (other.getScanMode() != null && other.getScanMode().equals(this.getScanMode()) == false)
            return false;
        if (other.getScanModeStatus() == null ^ this.getScanModeStatus() == null)
            return false;
        if (other.getScanModeStatus() != null && other.getScanModeStatus().equals(this.getScanModeStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanMode() == null) ? 0 : getScanMode().hashCode());
        hashCode = prime * hashCode + ((getScanModeStatus() == null) ? 0 : getScanModeStatus().hashCode());
        return hashCode;
    }

    @Override
    public Ec2ScanModeState clone() {
        try {
            return (Ec2ScanModeState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Ec2ScanModeStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
