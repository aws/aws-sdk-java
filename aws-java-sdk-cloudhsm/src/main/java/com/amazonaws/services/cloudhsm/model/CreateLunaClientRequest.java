/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>CreateLunaClient</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateLunaClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLunaClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The label for the client.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     * </p>
     */
    private String certificate;

    /**
     * <p>
     * The label for the client.
     * </p>
     * 
     * @param label
     *        The label for the client.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label for the client.
     * </p>
     * 
     * @return The label for the client.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label for the client.
     * </p>
     * 
     * @param label
     *        The label for the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLunaClientRequest withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     * </p>
     * 
     * @param certificate
     *        The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     * </p>
     * 
     * @return The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     * </p>
     * 
     * @param certificate
     *        The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLunaClientRequest withCertificate(String certificate) {
        setCertificate(certificate);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLunaClientRequest == false)
            return false;
        CreateLunaClientRequest other = (CreateLunaClientRequest) obj;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        return hashCode;
    }

    @Override
    public CreateLunaClientRequest clone() {
        return (CreateLunaClientRequest) super.clone();
    }

}
