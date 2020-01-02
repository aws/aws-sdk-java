/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A MediaPackage VOD PackagingGroup resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/PackagingGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackagingGroup implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the PackagingGroup. */
    private String arn;
    /** The fully qualified domain name for Assets in the PackagingGroup. */
    private String domainName;
    /** The ID of the PackagingGroup. */
    private String id;

    /**
     * The ARN of the PackagingGroup.
     * 
     * @param arn
     *        The ARN of the PackagingGroup.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the PackagingGroup.
     * 
     * @return The ARN of the PackagingGroup.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the PackagingGroup.
     * 
     * @param arn
     *        The ARN of the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackagingGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @param domainName
     *        The fully qualified domain name for Assets in the PackagingGroup.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @return The fully qualified domain name for Assets in the PackagingGroup.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     * @param domainName
     *        The fully qualified domain name for Assets in the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackagingGroup withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @param id
     *        The ID of the PackagingGroup.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @return The ID of the PackagingGroup.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the PackagingGroup.
     * 
     * @param id
     *        The ID of the PackagingGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackagingGroup withId(String id) {
        setId(id);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackagingGroup == false)
            return false;
        PackagingGroup other = (PackagingGroup) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public PackagingGroup clone() {
        try {
            return (PackagingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.PackagingGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
