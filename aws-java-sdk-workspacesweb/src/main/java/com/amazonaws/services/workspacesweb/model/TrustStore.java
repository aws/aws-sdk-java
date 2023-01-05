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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A trust store that can be associated with a web portal. A trust store contains certificate authority (CA)
 * certificates. Once associated with a web portal, the browser in a streaming session will recognize certificates that
 * have been issued using any of the CAs in the trust store. If your organization has internal websites that use
 * certificates issued by private CAs, you should add the private CA certificate to the trust store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/TrustStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustStore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of web portal ARNs that this trust store is associated with.
     * </p>
     */
    private java.util.List<String> associatedPortalArns;
    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     */
    private String trustStoreArn;

    /**
     * <p>
     * A list of web portal ARNs that this trust store is associated with.
     * </p>
     * 
     * @return A list of web portal ARNs that this trust store is associated with.
     */

    public java.util.List<String> getAssociatedPortalArns() {
        return associatedPortalArns;
    }

    /**
     * <p>
     * A list of web portal ARNs that this trust store is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this trust store is associated with.
     */

    public void setAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        if (associatedPortalArns == null) {
            this.associatedPortalArns = null;
            return;
        }

        this.associatedPortalArns = new java.util.ArrayList<String>(associatedPortalArns);
    }

    /**
     * <p>
     * A list of web portal ARNs that this trust store is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedPortalArns(java.util.Collection)} or {@link #withAssociatedPortalArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this trust store is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withAssociatedPortalArns(String... associatedPortalArns) {
        if (this.associatedPortalArns == null) {
            setAssociatedPortalArns(new java.util.ArrayList<String>(associatedPortalArns.length));
        }
        for (String ele : associatedPortalArns) {
            this.associatedPortalArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of web portal ARNs that this trust store is associated with.
     * </p>
     * 
     * @param associatedPortalArns
     *        A list of web portal ARNs that this trust store is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withAssociatedPortalArns(java.util.Collection<String> associatedPortalArns) {
        setAssociatedPortalArns(associatedPortalArns);
        return this;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @return The ARN of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustStore withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
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
        if (getAssociatedPortalArns() != null)
            sb.append("AssociatedPortalArns: ").append(getAssociatedPortalArns()).append(",");
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustStore == false)
            return false;
        TrustStore other = (TrustStore) obj;
        if (other.getAssociatedPortalArns() == null ^ this.getAssociatedPortalArns() == null)
            return false;
        if (other.getAssociatedPortalArns() != null && other.getAssociatedPortalArns().equals(this.getAssociatedPortalArns()) == false)
            return false;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedPortalArns() == null) ? 0 : getAssociatedPortalArns().hashCode());
        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        return hashCode;
    }

    @Override
    public TrustStore clone() {
        try {
            return (TrustStore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.TrustStoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
