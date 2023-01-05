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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A recommendation generated for your account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource affected by the recommendation, with values like
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are different
     * recommendations about your DKIM setup.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The first time this issue was encountered and the recommendation was generated.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The last time the recommendation was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * </p>
     */
    private String impact;

    /**
     * <p>
     * The resource affected by the recommendation, with values like
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param resourceArn
     *        The resource affected by the recommendation, with values like
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource affected by the recommendation, with values like
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @return The resource affected by the recommendation, with values like
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource affected by the recommendation, with values like
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param resourceArn
     *        The resource affected by the recommendation, with values like
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * </p>
     * 
     * @param type
     *        The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * @see RecommendationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * </p>
     * 
     * @return The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * @see RecommendationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * </p>
     * 
     * @param type
     *        The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public Recommendation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * </p>
     * 
     * @param type
     *        The recommendation type, with values like <code>DKIM</code>, <code>SPF</code> or <code>DMARC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationType
     */

    public Recommendation withType(RecommendationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are different
     * recommendations about your DKIM setup.
     * </p>
     * 
     * @param description
     *        The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are
     *        different recommendations about your DKIM setup.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are different
     * recommendations about your DKIM setup.
     * </p>
     * 
     * @return The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are
     *         different recommendations about your DKIM setup.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are different
     * recommendations about your DKIM setup.
     * </p>
     * 
     * @param description
     *        The recommendation description / disambiguator - e.g. <code>DKIM1</code> and <code>DKIM2</code> are
     *        different recommendations about your DKIM setup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * </p>
     * 
     * @param status
     *        The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * @see RecommendationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * </p>
     * 
     * @return The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * @see RecommendationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * </p>
     * 
     * @param status
     *        The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public Recommendation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * </p>
     * 
     * @param status
     *        The recommendation status, with values like <code>OPEN</code> or <code>FIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationStatus
     */

    public Recommendation withStatus(RecommendationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The first time this issue was encountered and the recommendation was generated.
     * </p>
     * 
     * @param createdTimestamp
     *        The first time this issue was encountered and the recommendation was generated.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The first time this issue was encountered and the recommendation was generated.
     * </p>
     * 
     * @return The first time this issue was encountered and the recommendation was generated.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The first time this issue was encountered and the recommendation was generated.
     * </p>
     * 
     * @param createdTimestamp
     *        The first time this issue was encountered and the recommendation was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time the recommendation was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The last time the recommendation was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The last time the recommendation was updated.
     * </p>
     * 
     * @return The last time the recommendation was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The last time the recommendation was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The last time the recommendation was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * </p>
     * 
     * @param impact
     *        The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * @see RecommendationImpact
     */

    public void setImpact(String impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * </p>
     * 
     * @return The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * @see RecommendationImpact
     */

    public String getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * </p>
     * 
     * @param impact
     *        The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationImpact
     */

    public Recommendation withImpact(String impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * </p>
     * 
     * @param impact
     *        The recommendation impact, with values like <code>HIGH</code> or <code>LOW</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationImpact
     */

    public Recommendation withImpact(RecommendationImpact impact) {
        this.impact = impact.toString();
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
