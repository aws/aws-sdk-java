/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of dependencies for the consumer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/DependencyCounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DependencyCounts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of consumers resolved.
     * </p>
     */
    private Integer consumersResolved;
    /**
     * <p>
     * The number of unresolved consumers.
     * </p>
     */
    private Integer consumersUnresolved;
    /**
     * <p>
     * The number of resolved dependencies.
     * </p>
     */
    private Integer dependenciesResolved;
    /**
     * <p>
     * The number of unresolved dependencies.
     * </p>
     */
    private Integer dependenciesUnresolved;

    /**
     * <p>
     * The number of consumers resolved.
     * </p>
     * 
     * @param consumersResolved
     *        The number of consumers resolved.
     */

    public void setConsumersResolved(Integer consumersResolved) {
        this.consumersResolved = consumersResolved;
    }

    /**
     * <p>
     * The number of consumers resolved.
     * </p>
     * 
     * @return The number of consumers resolved.
     */

    public Integer getConsumersResolved() {
        return this.consumersResolved;
    }

    /**
     * <p>
     * The number of consumers resolved.
     * </p>
     * 
     * @param consumersResolved
     *        The number of consumers resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependencyCounts withConsumersResolved(Integer consumersResolved) {
        setConsumersResolved(consumersResolved);
        return this;
    }

    /**
     * <p>
     * The number of unresolved consumers.
     * </p>
     * 
     * @param consumersUnresolved
     *        The number of unresolved consumers.
     */

    public void setConsumersUnresolved(Integer consumersUnresolved) {
        this.consumersUnresolved = consumersUnresolved;
    }

    /**
     * <p>
     * The number of unresolved consumers.
     * </p>
     * 
     * @return The number of unresolved consumers.
     */

    public Integer getConsumersUnresolved() {
        return this.consumersUnresolved;
    }

    /**
     * <p>
     * The number of unresolved consumers.
     * </p>
     * 
     * @param consumersUnresolved
     *        The number of unresolved consumers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependencyCounts withConsumersUnresolved(Integer consumersUnresolved) {
        setConsumersUnresolved(consumersUnresolved);
        return this;
    }

    /**
     * <p>
     * The number of resolved dependencies.
     * </p>
     * 
     * @param dependenciesResolved
     *        The number of resolved dependencies.
     */

    public void setDependenciesResolved(Integer dependenciesResolved) {
        this.dependenciesResolved = dependenciesResolved;
    }

    /**
     * <p>
     * The number of resolved dependencies.
     * </p>
     * 
     * @return The number of resolved dependencies.
     */

    public Integer getDependenciesResolved() {
        return this.dependenciesResolved;
    }

    /**
     * <p>
     * The number of resolved dependencies.
     * </p>
     * 
     * @param dependenciesResolved
     *        The number of resolved dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependencyCounts withDependenciesResolved(Integer dependenciesResolved) {
        setDependenciesResolved(dependenciesResolved);
        return this;
    }

    /**
     * <p>
     * The number of unresolved dependencies.
     * </p>
     * 
     * @param dependenciesUnresolved
     *        The number of unresolved dependencies.
     */

    public void setDependenciesUnresolved(Integer dependenciesUnresolved) {
        this.dependenciesUnresolved = dependenciesUnresolved;
    }

    /**
     * <p>
     * The number of unresolved dependencies.
     * </p>
     * 
     * @return The number of unresolved dependencies.
     */

    public Integer getDependenciesUnresolved() {
        return this.dependenciesUnresolved;
    }

    /**
     * <p>
     * The number of unresolved dependencies.
     * </p>
     * 
     * @param dependenciesUnresolved
     *        The number of unresolved dependencies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DependencyCounts withDependenciesUnresolved(Integer dependenciesUnresolved) {
        setDependenciesUnresolved(dependenciesUnresolved);
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
        if (getConsumersResolved() != null)
            sb.append("ConsumersResolved: ").append(getConsumersResolved()).append(",");
        if (getConsumersUnresolved() != null)
            sb.append("ConsumersUnresolved: ").append(getConsumersUnresolved()).append(",");
        if (getDependenciesResolved() != null)
            sb.append("DependenciesResolved: ").append(getDependenciesResolved()).append(",");
        if (getDependenciesUnresolved() != null)
            sb.append("DependenciesUnresolved: ").append(getDependenciesUnresolved());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DependencyCounts == false)
            return false;
        DependencyCounts other = (DependencyCounts) obj;
        if (other.getConsumersResolved() == null ^ this.getConsumersResolved() == null)
            return false;
        if (other.getConsumersResolved() != null && other.getConsumersResolved().equals(this.getConsumersResolved()) == false)
            return false;
        if (other.getConsumersUnresolved() == null ^ this.getConsumersUnresolved() == null)
            return false;
        if (other.getConsumersUnresolved() != null && other.getConsumersUnresolved().equals(this.getConsumersUnresolved()) == false)
            return false;
        if (other.getDependenciesResolved() == null ^ this.getDependenciesResolved() == null)
            return false;
        if (other.getDependenciesResolved() != null && other.getDependenciesResolved().equals(this.getDependenciesResolved()) == false)
            return false;
        if (other.getDependenciesUnresolved() == null ^ this.getDependenciesUnresolved() == null)
            return false;
        if (other.getDependenciesUnresolved() != null && other.getDependenciesUnresolved().equals(this.getDependenciesUnresolved()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumersResolved() == null) ? 0 : getConsumersResolved().hashCode());
        hashCode = prime * hashCode + ((getConsumersUnresolved() == null) ? 0 : getConsumersUnresolved().hashCode());
        hashCode = prime * hashCode + ((getDependenciesResolved() == null) ? 0 : getDependenciesResolved().hashCode());
        hashCode = prime * hashCode + ((getDependenciesUnresolved() == null) ? 0 : getDependenciesUnresolved().hashCode());
        return hashCode;
    }

    @Override
    public DependencyCounts clone() {
        try {
            return (DependencyCounts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.DependencyCountsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
