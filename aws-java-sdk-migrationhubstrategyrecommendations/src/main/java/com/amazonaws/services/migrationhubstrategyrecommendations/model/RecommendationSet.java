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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a recommendation set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/RecommendationSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended strategy.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The recommended target destination.
     * </p>
     */
    private String targetDestination;
    /**
     * <p>
     * The target destination for the recommendation set.
     * </p>
     */
    private TransformationTool transformationTool;

    /**
     * <p>
     * The recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The recommended strategy.
     * @see Strategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * The recommended strategy.
     * </p>
     * 
     * @return The recommended strategy.
     * @see Strategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * The recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The recommended strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public RecommendationSet withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * The recommended strategy.
     * </p>
     * 
     * @param strategy
     *        The recommended strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public RecommendationSet withStrategy(Strategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The recommended target destination.
     * </p>
     * 
     * @param targetDestination
     *        The recommended target destination.
     * @see TargetDestination
     */

    public void setTargetDestination(String targetDestination) {
        this.targetDestination = targetDestination;
    }

    /**
     * <p>
     * The recommended target destination.
     * </p>
     * 
     * @return The recommended target destination.
     * @see TargetDestination
     */

    public String getTargetDestination() {
        return this.targetDestination;
    }

    /**
     * <p>
     * The recommended target destination.
     * </p>
     * 
     * @param targetDestination
     *        The recommended target destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDestination
     */

    public RecommendationSet withTargetDestination(String targetDestination) {
        setTargetDestination(targetDestination);
        return this;
    }

    /**
     * <p>
     * The recommended target destination.
     * </p>
     * 
     * @param targetDestination
     *        The recommended target destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDestination
     */

    public RecommendationSet withTargetDestination(TargetDestination targetDestination) {
        this.targetDestination = targetDestination.toString();
        return this;
    }

    /**
     * <p>
     * The target destination for the recommendation set.
     * </p>
     * 
     * @param transformationTool
     *        The target destination for the recommendation set.
     */

    public void setTransformationTool(TransformationTool transformationTool) {
        this.transformationTool = transformationTool;
    }

    /**
     * <p>
     * The target destination for the recommendation set.
     * </p>
     * 
     * @return The target destination for the recommendation set.
     */

    public TransformationTool getTransformationTool() {
        return this.transformationTool;
    }

    /**
     * <p>
     * The target destination for the recommendation set.
     * </p>
     * 
     * @param transformationTool
     *        The target destination for the recommendation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSet withTransformationTool(TransformationTool transformationTool) {
        setTransformationTool(transformationTool);
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
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getTargetDestination() != null)
            sb.append("TargetDestination: ").append(getTargetDestination()).append(",");
        if (getTransformationTool() != null)
            sb.append("TransformationTool: ").append(getTransformationTool());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationSet == false)
            return false;
        RecommendationSet other = (RecommendationSet) obj;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getTargetDestination() == null ^ this.getTargetDestination() == null)
            return false;
        if (other.getTargetDestination() != null && other.getTargetDestination().equals(this.getTargetDestination()) == false)
            return false;
        if (other.getTransformationTool() == null ^ this.getTransformationTool() == null)
            return false;
        if (other.getTransformationTool() != null && other.getTransformationTool().equals(this.getTransformationTool()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getTargetDestination() == null) ? 0 : getTargetDestination().hashCode());
        hashCode = prime * hashCode + ((getTransformationTool() == null) ? 0 : getTransformationTool().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationSet clone() {
        try {
            return (RecommendationSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.RecommendationSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
