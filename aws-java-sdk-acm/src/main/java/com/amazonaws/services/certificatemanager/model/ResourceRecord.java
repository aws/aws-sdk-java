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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a DNS record value that you can use to can use to validate ownership or control of a domain. This is used by
 * the <a>DescribeCertificate</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResourceRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DNS record to create in your domain. This is supplied by ACM.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of DNS record. Currently this can be <code>CNAME</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the DNS record to create in your domain. This is supplied by ACM.
     * </p>
     * 
     * @param name
     *        The name of the DNS record to create in your domain. This is supplied by ACM.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DNS record to create in your domain. This is supplied by ACM.
     * </p>
     * 
     * @return The name of the DNS record to create in your domain. This is supplied by ACM.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DNS record to create in your domain. This is supplied by ACM.
     * </p>
     * 
     * @param name
     *        The name of the DNS record to create in your domain. This is supplied by ACM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecord withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of DNS record. Currently this can be <code>CNAME</code>.
     * </p>
     * 
     * @param type
     *        The type of DNS record. Currently this can be <code>CNAME</code>.
     * @see RecordType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of DNS record. Currently this can be <code>CNAME</code>.
     * </p>
     * 
     * @return The type of DNS record. Currently this can be <code>CNAME</code>.
     * @see RecordType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of DNS record. Currently this can be <code>CNAME</code>.
     * </p>
     * 
     * @param type
     *        The type of DNS record. Currently this can be <code>CNAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public ResourceRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of DNS record. Currently this can be <code>CNAME</code>.
     * </p>
     * 
     * @param type
     *        The type of DNS record. Currently this can be <code>CNAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public ResourceRecord withType(RecordType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     * </p>
     * 
     * @param value
     *        The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     * </p>
     * 
     * @return The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     * </p>
     * 
     * @param value
     *        The value of the CNAME record to add to your DNS database. This is supplied by ACM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceRecord withValue(String value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceRecord == false)
            return false;
        ResourceRecord other = (ResourceRecord) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ResourceRecord clone() {
        try {
            return (ResourceRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.ResourceRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
