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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the association between an instance and an elastic inference accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ElasticInferenceAcceleratorAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticInferenceAcceleratorAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     */
    private String elasticInferenceAcceleratorArn;
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String elasticInferenceAcceleratorAssociationId;
    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     */
    private String elasticInferenceAcceleratorAssociationState;
    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an instance.
     * </p>
     */
    private java.util.Date elasticInferenceAcceleratorAssociationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAcceleratorArn
     *        The Amazon Resource Name (ARN) of the elastic inference accelerator.
     */

    public void setElasticInferenceAcceleratorArn(String elasticInferenceAcceleratorArn) {
        this.elasticInferenceAcceleratorArn = elasticInferenceAcceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the elastic inference accelerator.
     */

    public String getElasticInferenceAcceleratorArn() {
        return this.elasticInferenceAcceleratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAcceleratorArn
     *        The Amazon Resource Name (ARN) of the elastic inference accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorArn(String elasticInferenceAcceleratorArn) {
        setElasticInferenceAcceleratorArn(elasticInferenceAcceleratorArn);
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationId
     *        The ID of the association.
     */

    public void setElasticInferenceAcceleratorAssociationId(String elasticInferenceAcceleratorAssociationId) {
        this.elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getElasticInferenceAcceleratorAssociationId() {
        return this.elasticInferenceAcceleratorAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationId(String elasticInferenceAcceleratorAssociationId) {
        setElasticInferenceAcceleratorAssociationId(elasticInferenceAcceleratorAssociationId);
        return this;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationState
     *        The state of the elastic inference accelerator.
     */

    public void setElasticInferenceAcceleratorAssociationState(String elasticInferenceAcceleratorAssociationState) {
        this.elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociationState;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     * 
     * @return The state of the elastic inference accelerator.
     */

    public String getElasticInferenceAcceleratorAssociationState() {
        return this.elasticInferenceAcceleratorAssociationState;
    }

    /**
     * <p>
     * The state of the elastic inference accelerator.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationState
     *        The state of the elastic inference accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationState(String elasticInferenceAcceleratorAssociationState) {
        setElasticInferenceAcceleratorAssociationState(elasticInferenceAcceleratorAssociationState);
        return this;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an instance.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationTime
     *        The time at which the elastic inference accelerator is associated with an instance.
     */

    public void setElasticInferenceAcceleratorAssociationTime(java.util.Date elasticInferenceAcceleratorAssociationTime) {
        this.elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociationTime;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an instance.
     * </p>
     * 
     * @return The time at which the elastic inference accelerator is associated with an instance.
     */

    public java.util.Date getElasticInferenceAcceleratorAssociationTime() {
        return this.elasticInferenceAcceleratorAssociationTime;
    }

    /**
     * <p>
     * The time at which the elastic inference accelerator is associated with an instance.
     * </p>
     * 
     * @param elasticInferenceAcceleratorAssociationTime
     *        The time at which the elastic inference accelerator is associated with an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAcceleratorAssociation withElasticInferenceAcceleratorAssociationTime(java.util.Date elasticInferenceAcceleratorAssociationTime) {
        setElasticInferenceAcceleratorAssociationTime(elasticInferenceAcceleratorAssociationTime);
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
        if (getElasticInferenceAcceleratorArn() != null)
            sb.append("ElasticInferenceAcceleratorArn: ").append(getElasticInferenceAcceleratorArn()).append(",");
        if (getElasticInferenceAcceleratorAssociationId() != null)
            sb.append("ElasticInferenceAcceleratorAssociationId: ").append(getElasticInferenceAcceleratorAssociationId()).append(",");
        if (getElasticInferenceAcceleratorAssociationState() != null)
            sb.append("ElasticInferenceAcceleratorAssociationState: ").append(getElasticInferenceAcceleratorAssociationState()).append(",");
        if (getElasticInferenceAcceleratorAssociationTime() != null)
            sb.append("ElasticInferenceAcceleratorAssociationTime: ").append(getElasticInferenceAcceleratorAssociationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAcceleratorAssociation == false)
            return false;
        ElasticInferenceAcceleratorAssociation other = (ElasticInferenceAcceleratorAssociation) obj;
        if (other.getElasticInferenceAcceleratorArn() == null ^ this.getElasticInferenceAcceleratorArn() == null)
            return false;
        if (other.getElasticInferenceAcceleratorArn() != null
                && other.getElasticInferenceAcceleratorArn().equals(this.getElasticInferenceAcceleratorArn()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationId() == null ^ this.getElasticInferenceAcceleratorAssociationId() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationId() != null
                && other.getElasticInferenceAcceleratorAssociationId().equals(this.getElasticInferenceAcceleratorAssociationId()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationState() == null ^ this.getElasticInferenceAcceleratorAssociationState() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationState() != null
                && other.getElasticInferenceAcceleratorAssociationState().equals(this.getElasticInferenceAcceleratorAssociationState()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationTime() == null ^ this.getElasticInferenceAcceleratorAssociationTime() == null)
            return false;
        if (other.getElasticInferenceAcceleratorAssociationTime() != null
                && other.getElasticInferenceAcceleratorAssociationTime().equals(this.getElasticInferenceAcceleratorAssociationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElasticInferenceAcceleratorArn() == null) ? 0 : getElasticInferenceAcceleratorArn().hashCode());
        hashCode = prime * hashCode + ((getElasticInferenceAcceleratorAssociationId() == null) ? 0 : getElasticInferenceAcceleratorAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getElasticInferenceAcceleratorAssociationState() == null) ? 0 : getElasticInferenceAcceleratorAssociationState().hashCode());
        hashCode = prime * hashCode
                + ((getElasticInferenceAcceleratorAssociationTime() == null) ? 0 : getElasticInferenceAcceleratorAssociationTime().hashCode());
        return hashCode;
    }

    @Override
    public ElasticInferenceAcceleratorAssociation clone() {
        try {
            return (ElasticInferenceAcceleratorAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
