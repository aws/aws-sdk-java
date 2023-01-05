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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Route 53 resource that a DNS target resource record points to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/R53ResourceRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class R53ResourceRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS target domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The Route 53 Resource Record Set ID.
     * </p>
     */
    private String recordSetId;

    /**
     * <p>
     * The DNS target domain name.
     * </p>
     * 
     * @param domainName
     *        The DNS target domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The DNS target domain name.
     * </p>
     * 
     * @return The DNS target domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The DNS target domain name.
     * </p>
     * 
     * @param domainName
     *        The DNS target domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public R53ResourceRecord withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The Route 53 Resource Record Set ID.
     * </p>
     * 
     * @param recordSetId
     *        The Route 53 Resource Record Set ID.
     */

    public void setRecordSetId(String recordSetId) {
        this.recordSetId = recordSetId;
    }

    /**
     * <p>
     * The Route 53 Resource Record Set ID.
     * </p>
     * 
     * @return The Route 53 Resource Record Set ID.
     */

    public String getRecordSetId() {
        return this.recordSetId;
    }

    /**
     * <p>
     * The Route 53 Resource Record Set ID.
     * </p>
     * 
     * @param recordSetId
     *        The Route 53 Resource Record Set ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public R53ResourceRecord withRecordSetId(String recordSetId) {
        setRecordSetId(recordSetId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getRecordSetId() != null)
            sb.append("RecordSetId: ").append(getRecordSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof R53ResourceRecord == false)
            return false;
        R53ResourceRecord other = (R53ResourceRecord) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getRecordSetId() == null ^ this.getRecordSetId() == null)
            return false;
        if (other.getRecordSetId() != null && other.getRecordSetId().equals(this.getRecordSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getRecordSetId() == null) ? 0 : getRecordSetId().hashCode());
        return hashCode;
    }

    @Override
    public R53ResourceRecord clone() {
        try {
            return (R53ResourceRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.R53ResourceRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
