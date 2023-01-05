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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stage plan information such as name, identifier, sub plans, and remote sources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/QueryStagePlanNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryStagePlanNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the query stage plan that describes the operation this stage is performing as part of query execution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the operation this query stage plan node is performing.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * </p>
     */
    private java.util.List<QueryStagePlanNode> children;
    /**
     * <p>
     * Source plan node IDs.
     * </p>
     */
    private java.util.List<String> remoteSources;

    /**
     * <p>
     * Name of the query stage plan that describes the operation this stage is performing as part of query execution.
     * </p>
     * 
     * @param name
     *        Name of the query stage plan that describes the operation this stage is performing as part of query
     *        execution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the query stage plan that describes the operation this stage is performing as part of query execution.
     * </p>
     * 
     * @return Name of the query stage plan that describes the operation this stage is performing as part of query
     *         execution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the query stage plan that describes the operation this stage is performing as part of query execution.
     * </p>
     * 
     * @param name
     *        Name of the query stage plan that describes the operation this stage is performing as part of query
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the operation this query stage plan node is performing.
     * </p>
     * 
     * @param identifier
     *        Information about the operation this query stage plan node is performing.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Information about the operation this query stage plan node is performing.
     * </p>
     * 
     * @return Information about the operation this query stage plan node is performing.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Information about the operation this query stage plan node is performing.
     * </p>
     * 
     * @param identifier
     *        Information about the operation this query stage plan node is performing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * </p>
     * 
     * @return Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     */

    public java.util.List<QueryStagePlanNode> getChildren() {
        return children;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * </p>
     * 
     * @param children
     *        Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     */

    public void setChildren(java.util.Collection<QueryStagePlanNode> children) {
        if (children == null) {
            this.children = null;
            return;
        }

        this.children = new java.util.ArrayList<QueryStagePlanNode>(children);
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildren(java.util.Collection)} or {@link #withChildren(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param children
     *        Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withChildren(QueryStagePlanNode... children) {
        if (this.children == null) {
            setChildren(new java.util.ArrayList<QueryStagePlanNode>(children.length));
        }
        for (QueryStagePlanNode ele : children) {
            this.children.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * </p>
     * 
     * @param children
     *        Stage plan information such as name, identifier, sub plans, and remote sources of child plan nodes/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withChildren(java.util.Collection<QueryStagePlanNode> children) {
        setChildren(children);
        return this;
    }

    /**
     * <p>
     * Source plan node IDs.
     * </p>
     * 
     * @return Source plan node IDs.
     */

    public java.util.List<String> getRemoteSources() {
        return remoteSources;
    }

    /**
     * <p>
     * Source plan node IDs.
     * </p>
     * 
     * @param remoteSources
     *        Source plan node IDs.
     */

    public void setRemoteSources(java.util.Collection<String> remoteSources) {
        if (remoteSources == null) {
            this.remoteSources = null;
            return;
        }

        this.remoteSources = new java.util.ArrayList<String>(remoteSources);
    }

    /**
     * <p>
     * Source plan node IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoteSources(java.util.Collection)} or {@link #withRemoteSources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param remoteSources
     *        Source plan node IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withRemoteSources(String... remoteSources) {
        if (this.remoteSources == null) {
            setRemoteSources(new java.util.ArrayList<String>(remoteSources.length));
        }
        for (String ele : remoteSources) {
            this.remoteSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source plan node IDs.
     * </p>
     * 
     * @param remoteSources
     *        Source plan node IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryStagePlanNode withRemoteSources(java.util.Collection<String> remoteSources) {
        setRemoteSources(remoteSources);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
        if (getRemoteSources() != null)
            sb.append("RemoteSources: ").append(getRemoteSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryStagePlanNode == false)
            return false;
        QueryStagePlanNode other = (QueryStagePlanNode) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
            return false;
        if (other.getRemoteSources() == null ^ this.getRemoteSources() == null)
            return false;
        if (other.getRemoteSources() != null && other.getRemoteSources().equals(this.getRemoteSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getRemoteSources() == null) ? 0 : getRemoteSources().hashCode());
        return hashCode;
    }

    @Override
    public QueryStagePlanNode clone() {
        try {
            return (QueryStagePlanNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.QueryStagePlanNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
