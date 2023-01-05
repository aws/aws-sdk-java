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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A directed edge connecting two lineage entities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Edge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Edge implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * The type of the Association(Edge) between the source and destination. For example <code>ContributedTo</code>,
     * <code>Produced</code>, or <code>DerivedFrom</code>.
     * </p>
     */
    private String associationType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the source lineage entity of the directed edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     * </p>
     * 
     * @param destinationArn
     *        The Amazon Resource Name (ARN) of the destination lineage entity of the directed edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Edge withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The type of the Association(Edge) between the source and destination. For example <code>ContributedTo</code>,
     * <code>Produced</code>, or <code>DerivedFrom</code>.
     * </p>
     * 
     * @param associationType
     *        The type of the Association(Edge) between the source and destination. For example
     *        <code>ContributedTo</code>, <code>Produced</code>, or <code>DerivedFrom</code>.
     * @see AssociationEdgeType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of the Association(Edge) between the source and destination. For example <code>ContributedTo</code>,
     * <code>Produced</code>, or <code>DerivedFrom</code>.
     * </p>
     * 
     * @return The type of the Association(Edge) between the source and destination. For example
     *         <code>ContributedTo</code>, <code>Produced</code>, or <code>DerivedFrom</code>.
     * @see AssociationEdgeType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of the Association(Edge) between the source and destination. For example <code>ContributedTo</code>,
     * <code>Produced</code>, or <code>DerivedFrom</code>.
     * </p>
     * 
     * @param associationType
     *        The type of the Association(Edge) between the source and destination. For example
     *        <code>ContributedTo</code>, <code>Produced</code>, or <code>DerivedFrom</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public Edge withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of the Association(Edge) between the source and destination. For example <code>ContributedTo</code>,
     * <code>Produced</code>, or <code>DerivedFrom</code>.
     * </p>
     * 
     * @param associationType
     *        The type of the Association(Edge) between the source and destination. For example
     *        <code>ContributedTo</code>, <code>Produced</code>, or <code>DerivedFrom</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public Edge withAssociationType(AssociationEdgeType associationType) {
        this.associationType = associationType.toString();
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
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Edge == false)
            return false;
        Edge other = (Edge) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        return hashCode;
    }

    @Override
    public Edge clone() {
        try {
            return (Edge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
