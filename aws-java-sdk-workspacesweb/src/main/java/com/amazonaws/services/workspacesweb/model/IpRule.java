/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The IP rules of the IP access settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/IpRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the IP rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IP range of the IP rule.
     * </p>
     */
    private String ipRange;

    /**
     * <p>
     * The description of the IP rule.
     * </p>
     * 
     * @param description
     *        The description of the IP rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the IP rule.
     * </p>
     * 
     * @return The description of the IP rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the IP rule.
     * </p>
     * 
     * @param description
     *        The description of the IP rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRule withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IP range of the IP rule.
     * </p>
     * 
     * @param ipRange
     *        The IP range of the IP rule.
     */

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    /**
     * <p>
     * The IP range of the IP rule.
     * </p>
     * 
     * @return The IP range of the IP rule.
     */

    public String getIpRange() {
        return this.ipRange;
    }

    /**
     * <p>
     * The IP range of the IP rule.
     * </p>
     * 
     * @param ipRange
     *        The IP range of the IP rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpRule withIpRange(String ipRange) {
        setIpRange(ipRange);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getIpRange() != null)
            sb.append("IpRange: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpRule == false)
            return false;
        IpRule other = (IpRule) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIpRange() == null ^ this.getIpRange() == null)
            return false;
        if (other.getIpRange() != null && other.getIpRange().equals(this.getIpRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIpRange() == null) ? 0 : getIpRange().hashCode());
        return hashCode;
    }

    @Override
    public IpRule clone() {
        try {
            return (IpRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.IpRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
