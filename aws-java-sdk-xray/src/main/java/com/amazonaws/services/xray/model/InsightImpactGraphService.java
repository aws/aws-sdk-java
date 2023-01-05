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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an application that processed requests, users that made requests, or downstream services,
 * resources, and applications that an application used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/InsightImpactGraphService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightImpactGraphService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     */
    private Integer referenceId;
    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services Resource - The type of an Amazon Web Services resource. For example, AWS::EC2::Instance for
     * an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * remote - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The canonical name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * Identifier of the Amazon Web Services account in which the service runs.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Connections to downstream services.
     * </p>
     */
    private java.util.List<InsightImpactGraphEdge> edges;

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier for the service. Unique within the service map.
     */

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @return Identifier for the service. Unique within the service map.
     */

    public Integer getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * 
     * @param referenceId
     *        Identifier for the service. Unique within the service map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withReferenceId(Integer referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services Resource - The type of an Amazon Web Services resource. For example, AWS::EC2::Instance for
     * an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * remote - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Identifier for the service. Unique within the service map.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Web Services Resource - The type of an Amazon Web Services resource. For example,
     *        AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB
     *        table that the application used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *        downstream calls to Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *        downstream calls to Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        remote - A downstream service of indeterminate type.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services Resource - The type of an Amazon Web Services resource. For example, AWS::EC2::Instance for
     * an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * remote - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifier for the service. Unique within the service map.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Web Services Resource - The type of an Amazon Web Services resource. For example,
     *         AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon
     *         DynamoDB table that the application used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *         downstream calls to Amazon DynamoDB that didn't target a specific table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *         downstream calls to Amazon DynamoDB that didn't target a specific table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         remote - A downstream service of indeterminate type.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Identifier for the service. Unique within the service map.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Web Services Resource - The type of an Amazon Web Services resource. For example, AWS::EC2::Instance for
     * an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application
     * used.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     * downstream calls to Amazon DynamoDB that didn't target a specific table.
     * </p>
     * </li>
     * <li>
     * <p>
     * remote - A downstream service of indeterminate type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Identifier for the service. Unique within the service map.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Web Services Resource - The type of an Amazon Web Services resource. For example,
     *        AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB
     *        table that the application used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *        downstream calls to Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Web Services Service - The type of an Amazon Web Services service. For example, AWS::DynamoDB for
     *        downstream calls to Amazon DynamoDB that didn't target a specific table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        remote - A downstream service of indeterminate type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @param name
     *        The canonical name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @return The canonical name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The canonical name of the service.
     * </p>
     * 
     * @param name
     *        The canonical name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @return A list of names for the service, including the canonical name.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names for the service, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the service, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * Identifier of the Amazon Web Services account in which the service runs.
     * </p>
     * 
     * @param accountId
     *        Identifier of the Amazon Web Services account in which the service runs.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Identifier of the Amazon Web Services account in which the service runs.
     * </p>
     * 
     * @return Identifier of the Amazon Web Services account in which the service runs.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Identifier of the Amazon Web Services account in which the service runs.
     * </p>
     * 
     * @param accountId
     *        Identifier of the Amazon Web Services account in which the service runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @return Connections to downstream services.
     */

    public java.util.List<InsightImpactGraphEdge> getEdges() {
        return edges;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     */

    public void setEdges(java.util.Collection<InsightImpactGraphEdge> edges) {
        if (edges == null) {
            this.edges = null;
            return;
        }

        this.edges = new java.util.ArrayList<InsightImpactGraphEdge>(edges);
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEdges(java.util.Collection)} or {@link #withEdges(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withEdges(InsightImpactGraphEdge... edges) {
        if (this.edges == null) {
            setEdges(new java.util.ArrayList<InsightImpactGraphEdge>(edges.length));
        }
        for (InsightImpactGraphEdge ele : edges) {
            this.edges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Connections to downstream services.
     * </p>
     * 
     * @param edges
     *        Connections to downstream services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightImpactGraphService withEdges(java.util.Collection<InsightImpactGraphEdge> edges) {
        setEdges(edges);
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
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEdges() != null)
            sb.append("Edges: ").append(getEdges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightImpactGraphService == false)
            return false;
        InsightImpactGraphService other = (InsightImpactGraphService) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEdges() == null ^ this.getEdges() == null)
            return false;
        if (other.getEdges() != null && other.getEdges().equals(this.getEdges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEdges() == null) ? 0 : getEdges().hashCode());
        return hashCode;
    }

    @Override
    public InsightImpactGraphService clone() {
        try {
            return (InsightImpactGraphService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.InsightImpactGraphServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
