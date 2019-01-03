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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about what was excluded from an assessment run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/Exclusion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Exclusion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN that specifies the exclusion.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the exclusion.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the exclusion.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The recommendation for the exclusion.
     * </p>
     */
    private String recommendation;
    /**
     * <p>
     * The AWS resources for which the exclusion pertains.
     * </p>
     */
    private java.util.List<Scope> scopes;
    /**
     * <p>
     * The system-defined attributes for the exclusion.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The ARN that specifies the exclusion.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the exclusion.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN that specifies the exclusion.
     * </p>
     * 
     * @return The ARN that specifies the exclusion.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN that specifies the exclusion.
     * </p>
     * 
     * @param arn
     *        The ARN that specifies the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the exclusion.
     * </p>
     * 
     * @param title
     *        The name of the exclusion.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The name of the exclusion.
     * </p>
     * 
     * @return The name of the exclusion.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The name of the exclusion.
     * </p>
     * 
     * @param title
     *        The name of the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the exclusion.
     * </p>
     * 
     * @param description
     *        The description of the exclusion.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the exclusion.
     * </p>
     * 
     * @return The description of the exclusion.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the exclusion.
     * </p>
     * 
     * @param description
     *        The description of the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The recommendation for the exclusion.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the exclusion.
     */

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * <p>
     * The recommendation for the exclusion.
     * </p>
     * 
     * @return The recommendation for the exclusion.
     */

    public String getRecommendation() {
        return this.recommendation;
    }

    /**
     * <p>
     * The recommendation for the exclusion.
     * </p>
     * 
     * @param recommendation
     *        The recommendation for the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withRecommendation(String recommendation) {
        setRecommendation(recommendation);
        return this;
    }

    /**
     * <p>
     * The AWS resources for which the exclusion pertains.
     * </p>
     * 
     * @return The AWS resources for which the exclusion pertains.
     */

    public java.util.List<Scope> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * The AWS resources for which the exclusion pertains.
     * </p>
     * 
     * @param scopes
     *        The AWS resources for which the exclusion pertains.
     */

    public void setScopes(java.util.Collection<Scope> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<Scope>(scopes);
    }

    /**
     * <p>
     * The AWS resources for which the exclusion pertains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        The AWS resources for which the exclusion pertains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withScopes(Scope... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<Scope>(scopes.length));
        }
        for (Scope ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS resources for which the exclusion pertains.
     * </p>
     * 
     * @param scopes
     *        The AWS resources for which the exclusion pertains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withScopes(java.util.Collection<Scope> scopes) {
        setScopes(scopes);
        return this;
    }

    /**
     * <p>
     * The system-defined attributes for the exclusion.
     * </p>
     * 
     * @return The system-defined attributes for the exclusion.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The system-defined attributes for the exclusion.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the exclusion.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The system-defined attributes for the exclusion.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The system-defined attributes for the exclusion.
     * </p>
     * 
     * @param attributes
     *        The system-defined attributes for the exclusion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Exclusion withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRecommendation() != null)
            sb.append("Recommendation: ").append(getRecommendation()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Exclusion == false)
            return false;
        Exclusion other = (Exclusion) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRecommendation() == null ^ this.getRecommendation() == null)
            return false;
        if (other.getRecommendation() != null && other.getRecommendation().equals(this.getRecommendation()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRecommendation() == null) ? 0 : getRecommendation().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Exclusion clone() {
        try {
            return (Exclusion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.ExclusionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
