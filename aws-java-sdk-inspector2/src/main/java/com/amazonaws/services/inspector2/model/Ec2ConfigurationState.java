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
 * Details about the state of the EC2 scan configuration for your environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Ec2ConfigurationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2ConfigurationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that contains details about the state of the Amazon EC2 scan mode.
     * </p>
     */
    private Ec2ScanModeState scanModeState;

    /**
     * <p>
     * An object that contains details about the state of the Amazon EC2 scan mode.
     * </p>
     * 
     * @param scanModeState
     *        An object that contains details about the state of the Amazon EC2 scan mode.
     */

    public void setScanModeState(Ec2ScanModeState scanModeState) {
        this.scanModeState = scanModeState;
    }

    /**
     * <p>
     * An object that contains details about the state of the Amazon EC2 scan mode.
     * </p>
     * 
     * @return An object that contains details about the state of the Amazon EC2 scan mode.
     */

    public Ec2ScanModeState getScanModeState() {
        return this.scanModeState;
    }

    /**
     * <p>
     * An object that contains details about the state of the Amazon EC2 scan mode.
     * </p>
     * 
     * @param scanModeState
     *        An object that contains details about the state of the Amazon EC2 scan mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2ConfigurationState withScanModeState(Ec2ScanModeState scanModeState) {
        setScanModeState(scanModeState);
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
        if (getScanModeState() != null)
            sb.append("ScanModeState: ").append(getScanModeState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2ConfigurationState == false)
            return false;
        Ec2ConfigurationState other = (Ec2ConfigurationState) obj;
        if (other.getScanModeState() == null ^ this.getScanModeState() == null)
            return false;
        if (other.getScanModeState() != null && other.getScanModeState().equals(this.getScanModeState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanModeState() == null) ? 0 : getScanModeState().hashCode());
        return hashCode;
    }

    @Override
    public Ec2ConfigurationState clone() {
        try {
            return (Ec2ConfigurationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Ec2ConfigurationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
