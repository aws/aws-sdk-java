/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2instanceconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-instance-connect-2018-04-02/SendSerialConsoleSSHPublicKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendSerialConsoleSSHPublicKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The serial port of the EC2 instance. Currently only port 0 is supported.
     * </p>
     * <p>
     * Default: 0
     * </p>
     */
    private Integer serialPort;
    /**
     * <p>
     * The public key material. To use the public key, you must have the matching private key. For information about the
     * supported key formats and lengths, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     * >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String sSHPublicKey;

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     * 
     * @return The ID of the EC2 instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSerialConsoleSSHPublicKeyRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The serial port of the EC2 instance. Currently only port 0 is supported.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param serialPort
     *        The serial port of the EC2 instance. Currently only port 0 is supported.</p>
     *        <p>
     *        Default: 0
     */

    public void setSerialPort(Integer serialPort) {
        this.serialPort = serialPort;
    }

    /**
     * <p>
     * The serial port of the EC2 instance. Currently only port 0 is supported.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @return The serial port of the EC2 instance. Currently only port 0 is supported.</p>
     *         <p>
     *         Default: 0
     */

    public Integer getSerialPort() {
        return this.serialPort;
    }

    /**
     * <p>
     * The serial port of the EC2 instance. Currently only port 0 is supported.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param serialPort
     *        The serial port of the EC2 instance. Currently only port 0 is supported.</p>
     *        <p>
     *        Default: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSerialConsoleSSHPublicKeyRequest withSerialPort(Integer serialPort) {
        setSerialPort(serialPort);
        return this;
    }

    /**
     * <p>
     * The public key material. To use the public key, you must have the matching private key. For information about the
     * supported key formats and lengths, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     * >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sSHPublicKey
     *        The public key material. To use the public key, you must have the matching private key. For information
     *        about the supported key formats and lengths, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     *        >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setSSHPublicKey(String sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
    }

    /**
     * <p>
     * The public key material. To use the public key, you must have the matching private key. For information about the
     * supported key formats and lengths, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     * >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return The public key material. To use the public key, you must have the matching private key. For information
     *         about the supported key formats and lengths, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     *         >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public String getSSHPublicKey() {
        return this.sSHPublicKey;
    }

    /**
     * <p>
     * The public key material. To use the public key, you must have the matching private key. For information about the
     * supported key formats and lengths, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     * >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param sSHPublicKey
     *        The public key material. To use the public key, you must have the matching private key. For information
     *        about the supported key formats and lengths, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html#how-to-generate-your-own-key-and-import-it-to-aws"
     *        >Requirements for key pairs</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendSerialConsoleSSHPublicKeyRequest withSSHPublicKey(String sSHPublicKey) {
        setSSHPublicKey(sSHPublicKey);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getSerialPort() != null)
            sb.append("SerialPort: ").append(getSerialPort()).append(",");
        if (getSSHPublicKey() != null)
            sb.append("SSHPublicKey: ").append(getSSHPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendSerialConsoleSSHPublicKeyRequest == false)
            return false;
        SendSerialConsoleSSHPublicKeyRequest other = (SendSerialConsoleSSHPublicKeyRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getSerialPort() == null ^ this.getSerialPort() == null)
            return false;
        if (other.getSerialPort() != null && other.getSerialPort().equals(this.getSerialPort()) == false)
            return false;
        if (other.getSSHPublicKey() == null ^ this.getSSHPublicKey() == null)
            return false;
        if (other.getSSHPublicKey() != null && other.getSSHPublicKey().equals(this.getSSHPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getSerialPort() == null) ? 0 : getSerialPort().hashCode());
        hashCode = prime * hashCode + ((getSSHPublicKey() == null) ? 0 : getSSHPublicKey().hashCode());
        return hashCode;
    }

    @Override
    public SendSerialConsoleSSHPublicKeyRequest clone() {
        return (SendSerialConsoleSSHPublicKeyRequest) super.clone();
    }

}
