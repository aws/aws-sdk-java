/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a set of IP set references.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ReferenceSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceSets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of IP set references.
     * </p>
     */
    private java.util.Map<String, IPSetReference> iPSetReferences;

    /**
     * <p>
     * The list of IP set references.
     * </p>
     * 
     * @return The list of IP set references.
     */

    public java.util.Map<String, IPSetReference> getIPSetReferences() {
        return iPSetReferences;
    }

    /**
     * <p>
     * The list of IP set references.
     * </p>
     * 
     * @param iPSetReferences
     *        The list of IP set references.
     */

    public void setIPSetReferences(java.util.Map<String, IPSetReference> iPSetReferences) {
        this.iPSetReferences = iPSetReferences;
    }

    /**
     * <p>
     * The list of IP set references.
     * </p>
     * 
     * @param iPSetReferences
     *        The list of IP set references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSets withIPSetReferences(java.util.Map<String, IPSetReference> iPSetReferences) {
        setIPSetReferences(iPSetReferences);
        return this;
    }

    /**
     * Add a single IPSetReferences entry
     *
     * @see ReferenceSets#withIPSetReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSets addIPSetReferencesEntry(String key, IPSetReference value) {
        if (null == this.iPSetReferences) {
            this.iPSetReferences = new java.util.HashMap<String, IPSetReference>();
        }
        if (this.iPSetReferences.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.iPSetReferences.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IPSetReferences.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceSets clearIPSetReferencesEntries() {
        this.iPSetReferences = null;
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
        if (getIPSetReferences() != null)
            sb.append("IPSetReferences: ").append(getIPSetReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceSets == false)
            return false;
        ReferenceSets other = (ReferenceSets) obj;
        if (other.getIPSetReferences() == null ^ this.getIPSetReferences() == null)
            return false;
        if (other.getIPSetReferences() != null && other.getIPSetReferences().equals(this.getIPSetReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSetReferences() == null) ? 0 : getIPSetReferences().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceSets clone() {
        try {
            return (ReferenceSets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.ReferenceSetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
