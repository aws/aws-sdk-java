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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterThingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * .
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     */
    private java.util.Map<String, String> resourceArns;

    /**
     * <p>
     * .
     * </p>
     * 
     * @param certificatePem
     *        .
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * .
     * </p>
     * 
     * @return .
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * .
     * </p>
     * 
     * @param certificatePem
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingResult withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     * 
     * @return ARNs for the generated resources.
     */

    public java.util.Map<String, String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     * 
     * @param resourceArns
     *        ARNs for the generated resources.
     */

    public void setResourceArns(java.util.Map<String, String> resourceArns) {
        this.resourceArns = resourceArns;
    }

    /**
     * <p>
     * ARNs for the generated resources.
     * </p>
     * 
     * @param resourceArns
     *        ARNs for the generated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingResult withResourceArns(java.util.Map<String, String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    public RegisterThingResult addResourceArnsEntry(String key, String value) {
        if (null == this.resourceArns) {
            this.resourceArns = new java.util.HashMap<String, String>();
        }
        if (this.resourceArns.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceArns.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceArns.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingResult clearResourceArnsEntries() {
        this.resourceArns = null;
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
        if (getCertificatePem() != null)
            sb.append("CertificatePem: ").append(getCertificatePem()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterThingResult == false)
            return false;
        RegisterThingResult other = (RegisterThingResult) obj;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        return hashCode;
    }

    @Override
    public RegisterThingResult clone() {
        try {
            return (RegisterThingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
