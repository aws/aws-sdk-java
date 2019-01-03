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

/**
 * <p>
 * Describes an IP range used in a security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/IPRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPRange implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     */
    private String status;
    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     */
    private String cIDRIP;
    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     * 
     * @param status
     *        The status of the IP range, for example, "authorized".
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     * 
     * @return The status of the IP range, for example, "authorized".
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the IP range, for example, "authorized".
     * </p>
     * 
     * @param status
     *        The status of the IP range, for example, "authorized".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     * 
     * @param cIDRIP
     *        The IP range in Classless Inter-Domain Routing (CIDR) notation.
     */

    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     * 
     * @return The IP range in Classless Inter-Domain Routing (CIDR) notation.
     */

    public String getCIDRIP() {
        return this.cIDRIP;
    }

    /**
     * <p>
     * The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * </p>
     * 
     * @param cIDRIP
     *        The IP range in Classless Inter-Domain Routing (CIDR) notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withCIDRIP(String cIDRIP) {
        setCIDRIP(cIDRIP);
        return this;
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     * 
     * @return The list of tags for the IP range.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the IP range.
     * </p>
     * 
     * @param tags
     *        The list of tags for the IP range.
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
     * The list of tags for the IP range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the IP range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withTags(Tag... tags) {
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
     * The list of tags for the IP range.
     * </p>
     * 
     * @param tags
     *        The list of tags for the IP range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPRange withTags(java.util.Collection<Tag> tags) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCIDRIP() != null)
            sb.append("CIDRIP: ").append(getCIDRIP()).append(",");
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

        if (obj instanceof IPRange == false)
            return false;
        IPRange other = (IPRange) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCIDRIP() == null ^ this.getCIDRIP() == null)
            return false;
        if (other.getCIDRIP() != null && other.getCIDRIP().equals(this.getCIDRIP()) == false)
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCIDRIP() == null) ? 0 : getCIDRIP().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public IPRange clone() {
        try {
            return (IPRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
