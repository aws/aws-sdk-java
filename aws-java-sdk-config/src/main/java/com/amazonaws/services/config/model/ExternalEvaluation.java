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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ExternalEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalEvaluation implements Serializable, Cloneable, StructuredPojo {

    private String complianceResourceType;

    private String complianceResourceId;

    private String complianceType;

    private String annotation;

    private java.util.Date orderingTimestamp;

    /**
     * @param complianceResourceType
     */

    public void setComplianceResourceType(String complianceResourceType) {
        this.complianceResourceType = complianceResourceType;
    }

    /**
     * @return
     */

    public String getComplianceResourceType() {
        return this.complianceResourceType;
    }

    /**
     * @param complianceResourceType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEvaluation withComplianceResourceType(String complianceResourceType) {
        setComplianceResourceType(complianceResourceType);
        return this;
    }

    /**
     * @param complianceResourceId
     */

    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }

    /**
     * @return
     */

    public String getComplianceResourceId() {
        return this.complianceResourceId;
    }

    /**
     * @param complianceResourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEvaluation withComplianceResourceId(String complianceResourceId) {
        setComplianceResourceId(complianceResourceId);
        return this;
    }

    /**
     * @param complianceType
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * @return
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @param complianceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public ExternalEvaluation withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * @param complianceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public ExternalEvaluation withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * @param annotation
     */

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    /**
     * @return
     */

    public String getAnnotation() {
        return this.annotation;
    }

    /**
     * @param annotation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEvaluation withAnnotation(String annotation) {
        setAnnotation(annotation);
        return this;
    }

    /**
     * @param orderingTimestamp
     */

    public void setOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getOrderingTimestamp() {
        return this.orderingTimestamp;
    }

    /**
     * @param orderingTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEvaluation withOrderingTimestamp(java.util.Date orderingTimestamp) {
        setOrderingTimestamp(orderingTimestamp);
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
        if (getComplianceResourceType() != null)
            sb.append("ComplianceResourceType: ").append(getComplianceResourceType()).append(",");
        if (getComplianceResourceId() != null)
            sb.append("ComplianceResourceId: ").append(getComplianceResourceId()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getAnnotation() != null)
            sb.append("Annotation: ").append(getAnnotation()).append(",");
        if (getOrderingTimestamp() != null)
            sb.append("OrderingTimestamp: ").append(getOrderingTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalEvaluation == false)
            return false;
        ExternalEvaluation other = (ExternalEvaluation) obj;
        if (other.getComplianceResourceType() == null ^ this.getComplianceResourceType() == null)
            return false;
        if (other.getComplianceResourceType() != null && other.getComplianceResourceType().equals(this.getComplianceResourceType()) == false)
            return false;
        if (other.getComplianceResourceId() == null ^ this.getComplianceResourceId() == null)
            return false;
        if (other.getComplianceResourceId() != null && other.getComplianceResourceId().equals(this.getComplianceResourceId()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getAnnotation() == null ^ this.getAnnotation() == null)
            return false;
        if (other.getAnnotation() != null && other.getAnnotation().equals(this.getAnnotation()) == false)
            return false;
        if (other.getOrderingTimestamp() == null ^ this.getOrderingTimestamp() == null)
            return false;
        if (other.getOrderingTimestamp() != null && other.getOrderingTimestamp().equals(this.getOrderingTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceResourceType() == null) ? 0 : getComplianceResourceType().hashCode());
        hashCode = prime * hashCode + ((getComplianceResourceId() == null) ? 0 : getComplianceResourceId().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getAnnotation() == null) ? 0 : getAnnotation().hashCode());
        hashCode = prime * hashCode + ((getOrderingTimestamp() == null) ? 0 : getOrderingTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ExternalEvaluation clone() {
        try {
            return (ExternalEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ExternalEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
