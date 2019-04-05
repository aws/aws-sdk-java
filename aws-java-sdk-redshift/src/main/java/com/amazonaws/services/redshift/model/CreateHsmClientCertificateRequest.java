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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateHsmClientCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHsmClientCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM
     * to use the database encryption keys.
     * </p>
     */
    private String hsmClientCertificateIdentifier;
    /**
     * <p>
     * A list of tag instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM
     * to use the database encryption keys.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to
     *        the HSM to use the database encryption keys.
     */

    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM
     * to use the database encryption keys.
     * </p>
     * 
     * @return The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to
     *         the HSM to use the database encryption keys.
     */

    public String getHsmClientCertificateIdentifier() {
        return this.hsmClientCertificateIdentifier;
    }

    /**
     * <p>
     * The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to the HSM
     * to use the database encryption keys.
     * </p>
     * 
     * @param hsmClientCertificateIdentifier
     *        The identifier to be assigned to the new HSM client certificate that the cluster will use to connect to
     *        the HSM to use the database encryption keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmClientCertificateRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        setHsmClientCertificateIdentifier(hsmClientCertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @return A list of tag instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmClientCertificateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag instances.
     * </p>
     * 
     * @param tags
     *        A list of tag instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHsmClientCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getHsmClientCertificateIdentifier() != null)
            sb.append("HsmClientCertificateIdentifier: ").append(getHsmClientCertificateIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHsmClientCertificateRequest == false)
            return false;
        CreateHsmClientCertificateRequest other = (CreateHsmClientCertificateRequest) obj;
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null)
            return false;
        if (other.getHsmClientCertificateIdentifier() != null
                && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateHsmClientCertificateRequest clone() {
        return (CreateHsmClientCertificateRequest) super.clone();
    }

}
