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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the MAC Security (MACsec) secret key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/MacSecKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MacSecKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     */
    private String secretARN;
    /**
     * <p>
     * The Connection Key Name (CKN) for the MAC Security secret key.
     * </p>
     */
    private String ckn;
    /**
     * <p>
     * The state of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated with the
     * connection or LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the connection or
     * LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the connection or
     * LAG
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the connection or
     * LAG.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     * </p>
     */
    private String startOn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @param secretARN
     *        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     */

    public void setSecretARN(String secretARN) {
        this.secretARN = secretARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     */

    public String getSecretARN() {
        return this.secretARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * </p>
     * 
     * @param secretARN
     *        The Amazon Resource Name (ARN) of the MAC Security (MACsec) secret key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacSecKey withSecretARN(String secretARN) {
        setSecretARN(secretARN);
        return this;
    }

    /**
     * <p>
     * The Connection Key Name (CKN) for the MAC Security secret key.
     * </p>
     * 
     * @param ckn
     *        The Connection Key Name (CKN) for the MAC Security secret key.
     */

    public void setCkn(String ckn) {
        this.ckn = ckn;
    }

    /**
     * <p>
     * The Connection Key Name (CKN) for the MAC Security secret key.
     * </p>
     * 
     * @return The Connection Key Name (CKN) for the MAC Security secret key.
     */

    public String getCkn() {
        return this.ckn;
    }

    /**
     * <p>
     * The Connection Key Name (CKN) for the MAC Security secret key.
     * </p>
     * 
     * @param ckn
     *        The Connection Key Name (CKN) for the MAC Security secret key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacSecKey withCkn(String ckn) {
        setCkn(ckn);
        return this;
    }

    /**
     * <p>
     * The state of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated with the
     * connection or LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the connection or
     * LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the connection or
     * LAG
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the connection or
     * LAG.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the MAC Security (MACsec) secret key.</p>
     *        <p>
     *        The possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated
     *        with the connection or LAG.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the
     *        connection or LAG.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the
     *        connection or LAG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the
     *        connection or LAG.
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated with the
     * connection or LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the connection or
     * LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the connection or
     * LAG
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the connection or
     * LAG.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the MAC Security (MACsec) secret key.</p>
     *         <p>
     *         The possible values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated
     *         with the connection or LAG.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the
     *         connection or LAG.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the
     *         connection or LAG
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the
     *         connection or LAG.
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the MAC Security (MACsec) secret key.
     * </p>
     * <p>
     * The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated with the
     * connection or LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the connection or
     * LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the connection or
     * LAG
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the connection or
     * LAG.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the MAC Security (MACsec) secret key.</p>
     *        <p>
     *        The possible values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>associating</code>: The MAC Security (MACsec) secret key is being validated and not yet associated
     *        with the connection or LAG.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>associated</code>: The MAC Security (MACsec) secret key is validated and associated with the
     *        connection or LAG.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociating</code>: The MAC Security (MACsec) secret key is being disassociated from the
     *        connection or LAG
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>disassociated</code>: The MAC Security (MACsec) secret key is no longer associated with the
     *        connection or LAG.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacSecKey withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     * </p>
     * 
     * @param startOn
     *        The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     */

    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    /**
     * <p>
     * The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     * </p>
     * 
     * @return The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     */

    public String getStartOn() {
        return this.startOn;
    }

    /**
     * <p>
     * The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     * </p>
     * 
     * @param startOn
     *        The date that the MAC Security (MACsec) secret key takes effect. The value is displayed in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacSecKey withStartOn(String startOn) {
        setStartOn(startOn);
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
        if (getSecretARN() != null)
            sb.append("SecretARN: ").append(getSecretARN()).append(",");
        if (getCkn() != null)
            sb.append("Ckn: ").append(getCkn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStartOn() != null)
            sb.append("StartOn: ").append(getStartOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MacSecKey == false)
            return false;
        MacSecKey other = (MacSecKey) obj;
        if (other.getSecretARN() == null ^ this.getSecretARN() == null)
            return false;
        if (other.getSecretARN() != null && other.getSecretARN().equals(this.getSecretARN()) == false)
            return false;
        if (other.getCkn() == null ^ this.getCkn() == null)
            return false;
        if (other.getCkn() != null && other.getCkn().equals(this.getCkn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStartOn() == null ^ this.getStartOn() == null)
            return false;
        if (other.getStartOn() != null && other.getStartOn().equals(this.getStartOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretARN() == null) ? 0 : getSecretARN().hashCode());
        hashCode = prime * hashCode + ((getCkn() == null) ? 0 : getCkn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStartOn() == null) ? 0 : getStartOn().hashCode());
        return hashCode;
    }

    @Override
    public MacSecKey clone() {
        try {
            return (MacSecKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.MacSecKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
