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
 * Defines a <code>PolicyInformation</code> qualifier. ACM Private CA supports the <a
 * href="https://tools.ietf.org/html/rfc5280#section-4.2.1.4">certification practice statement (CPS) qualifier</a>
 * defined in RFC 5280.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/Qualifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Qualifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a pointer to a certification practice statement (CPS) published by the CA.
     * </p>
     */
    private String cpsUri;

    /**
     * <p>
     * Contains a pointer to a certification practice statement (CPS) published by the CA.
     * </p>
     * 
     * @param cpsUri
     *        Contains a pointer to a certification practice statement (CPS) published by the CA.
     */

    public void setCpsUri(String cpsUri) {
        this.cpsUri = cpsUri;
    }

    /**
     * <p>
     * Contains a pointer to a certification practice statement (CPS) published by the CA.
     * </p>
     * 
     * @return Contains a pointer to a certification practice statement (CPS) published by the CA.
     */

    public String getCpsUri() {
        return this.cpsUri;
    }

    /**
     * <p>
     * Contains a pointer to a certification practice statement (CPS) published by the CA.
     * </p>
     * 
     * @param cpsUri
     *        Contains a pointer to a certification practice statement (CPS) published by the CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Qualifier withCpsUri(String cpsUri) {
        setCpsUri(cpsUri);
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
        if (getCpsUri() != null)
            sb.append("CpsUri: ").append(getCpsUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Qualifier == false)
            return false;
        Qualifier other = (Qualifier) obj;
        if (other.getCpsUri() == null ^ this.getCpsUri() == null)
            return false;
        if (other.getCpsUri() != null && other.getCpsUri().equals(this.getCpsUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpsUri() == null) ? 0 : getCpsUri().hashCode());
        return hashCode;
    }

    @Override
    public Qualifier clone() {
        try {
            return (Qualifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.QualifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
