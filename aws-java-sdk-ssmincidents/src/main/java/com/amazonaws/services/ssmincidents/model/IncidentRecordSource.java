/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about how the incident record was created and when.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/IncidentRecordSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncidentRecordSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The principal that started the incident.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The principal the assumed the role specified of the <code>createdBy</code>.
     * </p>
     */
    private String invokedBy;
    /**
     * <p>
     * The resource that caused the incident to be created.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The service that started the incident. This can be manually created from Incident Manager, automatically created
     * using an AWS CloudWatch alarm, or Amazon EventBridge event.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The principal that started the incident.
     * </p>
     * 
     * @param createdBy
     *        The principal that started the incident.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that started the incident.
     * </p>
     * 
     * @return The principal that started the incident.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The principal that started the incident.
     * </p>
     * 
     * @param createdBy
     *        The principal that started the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSource withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The principal the assumed the role specified of the <code>createdBy</code>.
     * </p>
     * 
     * @param invokedBy
     *        The principal the assumed the role specified of the <code>createdBy</code>.
     */

    public void setInvokedBy(String invokedBy) {
        this.invokedBy = invokedBy;
    }

    /**
     * <p>
     * The principal the assumed the role specified of the <code>createdBy</code>.
     * </p>
     * 
     * @return The principal the assumed the role specified of the <code>createdBy</code>.
     */

    public String getInvokedBy() {
        return this.invokedBy;
    }

    /**
     * <p>
     * The principal the assumed the role specified of the <code>createdBy</code>.
     * </p>
     * 
     * @param invokedBy
     *        The principal the assumed the role specified of the <code>createdBy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSource withInvokedBy(String invokedBy) {
        setInvokedBy(invokedBy);
        return this;
    }

    /**
     * <p>
     * The resource that caused the incident to be created.
     * </p>
     * 
     * @param resourceArn
     *        The resource that caused the incident to be created.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource that caused the incident to be created.
     * </p>
     * 
     * @return The resource that caused the incident to be created.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource that caused the incident to be created.
     * </p>
     * 
     * @param resourceArn
     *        The resource that caused the incident to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The service that started the incident. This can be manually created from Incident Manager, automatically created
     * using an AWS CloudWatch alarm, or Amazon EventBridge event.
     * </p>
     * 
     * @param source
     *        The service that started the incident. This can be manually created from Incident Manager, automatically
     *        created using an AWS CloudWatch alarm, or Amazon EventBridge event.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The service that started the incident. This can be manually created from Incident Manager, automatically created
     * using an AWS CloudWatch alarm, or Amazon EventBridge event.
     * </p>
     * 
     * @return The service that started the incident. This can be manually created from Incident Manager, automatically
     *         created using an AWS CloudWatch alarm, or Amazon EventBridge event.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The service that started the incident. This can be manually created from Incident Manager, automatically created
     * using an AWS CloudWatch alarm, or Amazon EventBridge event.
     * </p>
     * 
     * @param source
     *        The service that started the incident. This can be manually created from Incident Manager, automatically
     *        created using an AWS CloudWatch alarm, or Amazon EventBridge event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSource withSource(String source) {
        setSource(source);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getInvokedBy() != null)
            sb.append("InvokedBy: ").append(getInvokedBy()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncidentRecordSource == false)
            return false;
        IncidentRecordSource other = (IncidentRecordSource) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getInvokedBy() == null ^ this.getInvokedBy() == null)
            return false;
        if (other.getInvokedBy() != null && other.getInvokedBy().equals(this.getInvokedBy()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getInvokedBy() == null) ? 0 : getInvokedBy().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public IncidentRecordSource clone() {
        try {
            return (IncidentRecordSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.IncidentRecordSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
