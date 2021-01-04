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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of an association. An association is an entity that links other lineage or
 * experiment entities. An example would be an association between a training job and a model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AssociationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the source.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The source type.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The destination type.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * The type of the association.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The name of the source.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The name of the destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * When the association was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;

    /**
     * <p>
     * The ARN of the source.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the source.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of the source.
     * </p>
     * 
     * @return The ARN of the source.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of the source.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the destination.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @return The source type.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @param destinationType
     *        The destination type.
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @return The destination type.
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * The destination type.
     * </p>
     * 
     * @param destinationType
     *        The destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * The type of the association.
     * </p>
     * 
     * @param associationType
     *        The type of the association.
     * @see AssociationEdgeType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of the association.
     * </p>
     * 
     * @return The type of the association.
     * @see AssociationEdgeType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of the association.
     * </p>
     * 
     * @param associationType
     *        The type of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public AssociationSummary withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of the association.
     * </p>
     * 
     * @param associationType
     *        The type of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public AssociationSummary withAssociationType(AssociationEdgeType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @param sourceName
     *        The name of the source.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @return The name of the source.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @param sourceName
     *        The name of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @return The name of the destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the destination.
     * </p>
     * 
     * @param destinationName
     *        The name of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * When the association was created.
     * </p>
     * 
     * @param creationTime
     *        When the association was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the association was created.
     * </p>
     * 
     * @return When the association was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the association was created.
     * </p>
     * 
     * @param creationTime
     *        When the association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationSummary withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationSummary == false)
            return false;
        AssociationSummary other = (AssociationSummary) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public AssociationSummary clone() {
        try {
            return (AssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
