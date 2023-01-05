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
 * Information about all the available strategy options for migrating and modernizing an application component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/StrategyOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StrategyOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if a specific strategy is preferred for the application component.
     * </p>
     */
    private Boolean isPreferred;
    /**
     * <p>
     * Type of transformation. For example, Rehost, Replatform, and so on.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * Destination information about where the application component can migrate to. For example, <code>EC2</code>,
     * <code>ECS</code>, and so on.
     * </p>
     */
    private String targetDestination;
    /**
     * <p>
     * The name of the tool that can be used to transform an application component using this strategy.
     * </p>
     */
    private String toolName;

    /**
     * <p>
     * Indicates if a specific strategy is preferred for the application component.
     * </p>
     * 
     * @param isPreferred
     *        Indicates if a specific strategy is preferred for the application component.
     */

    public void setIsPreferred(Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }

    /**
     * <p>
     * Indicates if a specific strategy is preferred for the application component.
     * </p>
     * 
     * @return Indicates if a specific strategy is preferred for the application component.
     */

    public Boolean getIsPreferred() {
        return this.isPreferred;
    }

    /**
     * <p>
     * Indicates if a specific strategy is preferred for the application component.
     * </p>
     * 
     * @param isPreferred
     *        Indicates if a specific strategy is preferred for the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StrategyOption withIsPreferred(Boolean isPreferred) {
        setIsPreferred(isPreferred);
        return this;
    }

    /**
     * <p>
     * Indicates if a specific strategy is preferred for the application component.
     * </p>
     * 
     * @return Indicates if a specific strategy is preferred for the application component.
     */

    public Boolean isPreferred() {
        return this.isPreferred;
    }

    /**
     * <p>
     * Type of transformation. For example, Rehost, Replatform, and so on.
     * </p>
     * 
     * @param strategy
     *        Type of transformation. For example, Rehost, Replatform, and so on.
     * @see Strategy
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Type of transformation. For example, Rehost, Replatform, and so on.
     * </p>
     * 
     * @return Type of transformation. For example, Rehost, Replatform, and so on.
     * @see Strategy
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * Type of transformation. For example, Rehost, Replatform, and so on.
     * </p>
     * 
     * @param strategy
     *        Type of transformation. For example, Rehost, Replatform, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public StrategyOption withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * Type of transformation. For example, Rehost, Replatform, and so on.
     * </p>
     * 
     * @param strategy
     *        Type of transformation. For example, Rehost, Replatform, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Strategy
     */

    public StrategyOption withStrategy(Strategy strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * Destination information about where the application component can migrate to. For example, <code>EC2</code>,
     * <code>ECS</code>, and so on.
     * </p>
     * 
     * @param targetDestination
     *        Destination information about where the application component can migrate to. For example,
     *        <code>EC2</code>, <code>ECS</code>, and so on.
     * @see TargetDestination
     */

    public void setTargetDestination(String targetDestination) {
        this.targetDestination = targetDestination;
    }

    /**
     * <p>
     * Destination information about where the application component can migrate to. For example, <code>EC2</code>,
     * <code>ECS</code>, and so on.
     * </p>
     * 
     * @return Destination information about where the application component can migrate to. For example,
     *         <code>EC2</code>, <code>ECS</code>, and so on.
     * @see TargetDestination
     */

    public String getTargetDestination() {
        return this.targetDestination;
    }

    /**
     * <p>
     * Destination information about where the application component can migrate to. For example, <code>EC2</code>,
     * <code>ECS</code>, and so on.
     * </p>
     * 
     * @param targetDestination
     *        Destination information about where the application component can migrate to. For example,
     *        <code>EC2</code>, <code>ECS</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDestination
     */

    public StrategyOption withTargetDestination(String targetDestination) {
        setTargetDestination(targetDestination);
        return this;
    }

    /**
     * <p>
     * Destination information about where the application component can migrate to. For example, <code>EC2</code>,
     * <code>ECS</code>, and so on.
     * </p>
     * 
     * @param targetDestination
     *        Destination information about where the application component can migrate to. For example,
     *        <code>EC2</code>, <code>ECS</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDestination
     */

    public StrategyOption withTargetDestination(TargetDestination targetDestination) {
        this.targetDestination = targetDestination.toString();
        return this;
    }

    /**
     * <p>
     * The name of the tool that can be used to transform an application component using this strategy.
     * </p>
     * 
     * @param toolName
     *        The name of the tool that can be used to transform an application component using this strategy.
     * @see TransformationToolName
     */

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    /**
     * <p>
     * The name of the tool that can be used to transform an application component using this strategy.
     * </p>
     * 
     * @return The name of the tool that can be used to transform an application component using this strategy.
     * @see TransformationToolName
     */

    public String getToolName() {
        return this.toolName;
    }

    /**
     * <p>
     * The name of the tool that can be used to transform an application component using this strategy.
     * </p>
     * 
     * @param toolName
     *        The name of the tool that can be used to transform an application component using this strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformationToolName
     */

    public StrategyOption withToolName(String toolName) {
        setToolName(toolName);
        return this;
    }

    /**
     * <p>
     * The name of the tool that can be used to transform an application component using this strategy.
     * </p>
     * 
     * @param toolName
     *        The name of the tool that can be used to transform an application component using this strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransformationToolName
     */

    public StrategyOption withToolName(TransformationToolName toolName) {
        this.toolName = toolName.toString();
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
        if (getIsPreferred() != null)
            sb.append("IsPreferred: ").append(getIsPreferred()).append(",");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
        if (getTargetDestination() != null)
            sb.append("TargetDestination: ").append(getTargetDestination()).append(",");
        if (getToolName() != null)
            sb.append("ToolName: ").append(getToolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StrategyOption == false)
            return false;
        StrategyOption other = (StrategyOption) obj;
        if (other.getIsPreferred() == null ^ this.getIsPreferred() == null)
            return false;
        if (other.getIsPreferred() != null && other.getIsPreferred().equals(this.getIsPreferred()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
            return false;
        if (other.getTargetDestination() == null ^ this.getTargetDestination() == null)
            return false;
        if (other.getTargetDestination() != null && other.getTargetDestination().equals(this.getTargetDestination()) == false)
            return false;
        if (other.getToolName() == null ^ this.getToolName() == null)
            return false;
        if (other.getToolName() != null && other.getToolName().equals(this.getToolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsPreferred() == null) ? 0 : getIsPreferred().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getTargetDestination() == null) ? 0 : getTargetDestination().hashCode());
        hashCode = prime * hashCode + ((getToolName() == null) ? 0 : getToolName().hashCode());
        return hashCode;
    }

    @Override
    public StrategyOption clone() {
        try {
            return (StrategyOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.StrategyOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
