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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions
     * on their use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example,
     * the training data contributed to the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with
     * a model deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input
     * for a processing job is derived from the original inputs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Produced - The source generated the destination. For example, a training job produced a model artifact.
     * </p>
     * </li>
     * </ul>
     */
    private String associationType;

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

    public AddAssociationRequest withSourceArn(String sourceArn) {
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

    public AddAssociationRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions
     * on their use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example,
     * the training data contributed to the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with
     * a model deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input
     * for a processing job is derived from the original inputs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Produced - The source generated the destination. For example, a training job produced a model artifact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        The type of association. The following are suggested uses for each type. Amazon SageMaker places no
     *        restrictions on their use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ContributedTo - The source contributed to the destination or had a part in enabling the destination. For
     *        example, the training data contributed to the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AssociatedWith - The source is connected to the destination. For example, an approval workflow is
     *        associated with a model deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel
     *        input for a processing job is derived from the original inputs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Produced - The source generated the destination. For example, a training job produced a model artifact.
     *        </p>
     *        </li>
     * @see AssociationEdgeType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions
     * on their use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example,
     * the training data contributed to the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with
     * a model deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input
     * for a processing job is derived from the original inputs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Produced - The source generated the destination. For example, a training job produced a model artifact.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of association. The following are suggested uses for each type. Amazon SageMaker places no
     *         restrictions on their use.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ContributedTo - The source contributed to the destination or had a part in enabling the destination. For
     *         example, the training data contributed to the training job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AssociatedWith - The source is connected to the destination. For example, an approval workflow is
     *         associated with a model deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel
     *         input for a processing job is derived from the original inputs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Produced - The source generated the destination. For example, a training job produced a model artifact.
     *         </p>
     *         </li>
     * @see AssociationEdgeType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions
     * on their use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example,
     * the training data contributed to the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with
     * a model deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input
     * for a processing job is derived from the original inputs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Produced - The source generated the destination. For example, a training job produced a model artifact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        The type of association. The following are suggested uses for each type. Amazon SageMaker places no
     *        restrictions on their use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ContributedTo - The source contributed to the destination or had a part in enabling the destination. For
     *        example, the training data contributed to the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AssociatedWith - The source is connected to the destination. For example, an approval workflow is
     *        associated with a model deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel
     *        input for a processing job is derived from the original inputs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Produced - The source generated the destination. For example, a training job produced a model artifact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public AddAssociationRequest withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of association. The following are suggested uses for each type. Amazon SageMaker places no restrictions
     * on their use.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ContributedTo - The source contributed to the destination or had a part in enabling the destination. For example,
     * the training data contributed to the training job.
     * </p>
     * </li>
     * <li>
     * <p>
     * AssociatedWith - The source is connected to the destination. For example, an approval workflow is associated with
     * a model deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel input
     * for a processing job is derived from the original inputs.
     * </p>
     * </li>
     * <li>
     * <p>
     * Produced - The source generated the destination. For example, a training job produced a model artifact.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associationType
     *        The type of association. The following are suggested uses for each type. Amazon SageMaker places no
     *        restrictions on their use.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ContributedTo - The source contributed to the destination or had a part in enabling the destination. For
     *        example, the training data contributed to the training job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AssociatedWith - The source is connected to the destination. For example, an approval workflow is
     *        associated with a model deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DerivedFrom - The destination is a modification of the source. For example, a digest output of a channel
     *        input for a processing job is derived from the original inputs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Produced - The source generated the destination. For example, a training job produced a model artifact.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public AddAssociationRequest withAssociationType(AssociationEdgeType associationType) {
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

        if (obj instanceof AddAssociationRequest == false)
            return false;
        AddAssociationRequest other = (AddAssociationRequest) obj;
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
    public AddAssociationRequest clone() {
        return (AddAssociationRequest) super.clone();
    }

}
