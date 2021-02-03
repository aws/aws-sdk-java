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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the subject alternative names secured by the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/SubjectAlternativeNames" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectAlternativeNames implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents the criteria for determining a SANs match.
     * </p>
     */
    private SubjectAlternativeNameMatchers match;

    /**
     * <p>
     * An object that represents the criteria for determining a SANs match.
     * </p>
     * 
     * @param match
     *        An object that represents the criteria for determining a SANs match.
     */

    public void setMatch(SubjectAlternativeNameMatchers match) {
        this.match = match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a SANs match.
     * </p>
     * 
     * @return An object that represents the criteria for determining a SANs match.
     */

    public SubjectAlternativeNameMatchers getMatch() {
        return this.match;
    }

    /**
     * <p>
     * An object that represents the criteria for determining a SANs match.
     * </p>
     * 
     * @param match
     *        An object that represents the criteria for determining a SANs match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectAlternativeNames withMatch(SubjectAlternativeNameMatchers match) {
        setMatch(match);
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
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubjectAlternativeNames == false)
            return false;
        SubjectAlternativeNames other = (SubjectAlternativeNames) obj;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        return hashCode;
    }

    @Override
    public SubjectAlternativeNames clone() {
        try {
            return (SubjectAlternativeNames) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.SubjectAlternativeNamesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
