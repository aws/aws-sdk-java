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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Electronic Data Interchange (EDI) entity as described in as defined in <a
 * href="https://tools.ietf.org/html/rfc5280">Subject Alternative Name</a> in RFC 5280.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/EdiPartyName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdiPartyName implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the party name.
     * </p>
     */
    private String partyName;
    /**
     * <p>
     * Specifies the name assigner.
     * </p>
     */
    private String nameAssigner;

    /**
     * <p>
     * Specifies the party name.
     * </p>
     * 
     * @param partyName
     *        Specifies the party name.
     */

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    /**
     * <p>
     * Specifies the party name.
     * </p>
     * 
     * @return Specifies the party name.
     */

    public String getPartyName() {
        return this.partyName;
    }

    /**
     * <p>
     * Specifies the party name.
     * </p>
     * 
     * @param partyName
     *        Specifies the party name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiPartyName withPartyName(String partyName) {
        setPartyName(partyName);
        return this;
    }

    /**
     * <p>
     * Specifies the name assigner.
     * </p>
     * 
     * @param nameAssigner
     *        Specifies the name assigner.
     */

    public void setNameAssigner(String nameAssigner) {
        this.nameAssigner = nameAssigner;
    }

    /**
     * <p>
     * Specifies the name assigner.
     * </p>
     * 
     * @return Specifies the name assigner.
     */

    public String getNameAssigner() {
        return this.nameAssigner;
    }

    /**
     * <p>
     * Specifies the name assigner.
     * </p>
     * 
     * @param nameAssigner
     *        Specifies the name assigner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiPartyName withNameAssigner(String nameAssigner) {
        setNameAssigner(nameAssigner);
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
        if (getPartyName() != null)
            sb.append("PartyName: ").append(getPartyName()).append(",");
        if (getNameAssigner() != null)
            sb.append("NameAssigner: ").append(getNameAssigner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdiPartyName == false)
            return false;
        EdiPartyName other = (EdiPartyName) obj;
        if (other.getPartyName() == null ^ this.getPartyName() == null)
            return false;
        if (other.getPartyName() != null && other.getPartyName().equals(this.getPartyName()) == false)
            return false;
        if (other.getNameAssigner() == null ^ this.getNameAssigner() == null)
            return false;
        if (other.getNameAssigner() != null && other.getNameAssigner().equals(this.getNameAssigner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartyName() == null) ? 0 : getPartyName().hashCode());
        hashCode = prime * hashCode + ((getNameAssigner() == null) ? 0 : getNameAssigner().hashCode());
        return hashCode;
    }

    @Override
    public EdiPartyName clone() {
        try {
            return (EdiPartyName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.EdiPartyNameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
