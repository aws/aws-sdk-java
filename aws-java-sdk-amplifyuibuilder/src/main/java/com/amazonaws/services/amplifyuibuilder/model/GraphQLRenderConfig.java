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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the GraphQL configuration for an API for a code generation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/GraphQLRenderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GraphQLRenderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the GraphQL types file, relative to the component output directory.
     * </p>
     */
    private String typesFilePath;
    /**
     * <p>
     * The path to the GraphQL queries file, relative to the component output directory.
     * </p>
     */
    private String queriesFilePath;
    /**
     * <p>
     * The path to the GraphQL mutations file, relative to the component output directory.
     * </p>
     */
    private String mutationsFilePath;
    /**
     * <p>
     * The path to the GraphQL subscriptions file, relative to the component output directory.
     * </p>
     */
    private String subscriptionsFilePath;
    /**
     * <p>
     * The path to the GraphQL fragments file, relative to the component output directory.
     * </p>
     */
    private String fragmentsFilePath;

    /**
     * <p>
     * The path to the GraphQL types file, relative to the component output directory.
     * </p>
     * 
     * @param typesFilePath
     *        The path to the GraphQL types file, relative to the component output directory.
     */

    public void setTypesFilePath(String typesFilePath) {
        this.typesFilePath = typesFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL types file, relative to the component output directory.
     * </p>
     * 
     * @return The path to the GraphQL types file, relative to the component output directory.
     */

    public String getTypesFilePath() {
        return this.typesFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL types file, relative to the component output directory.
     * </p>
     * 
     * @param typesFilePath
     *        The path to the GraphQL types file, relative to the component output directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphQLRenderConfig withTypesFilePath(String typesFilePath) {
        setTypesFilePath(typesFilePath);
        return this;
    }

    /**
     * <p>
     * The path to the GraphQL queries file, relative to the component output directory.
     * </p>
     * 
     * @param queriesFilePath
     *        The path to the GraphQL queries file, relative to the component output directory.
     */

    public void setQueriesFilePath(String queriesFilePath) {
        this.queriesFilePath = queriesFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL queries file, relative to the component output directory.
     * </p>
     * 
     * @return The path to the GraphQL queries file, relative to the component output directory.
     */

    public String getQueriesFilePath() {
        return this.queriesFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL queries file, relative to the component output directory.
     * </p>
     * 
     * @param queriesFilePath
     *        The path to the GraphQL queries file, relative to the component output directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphQLRenderConfig withQueriesFilePath(String queriesFilePath) {
        setQueriesFilePath(queriesFilePath);
        return this;
    }

    /**
     * <p>
     * The path to the GraphQL mutations file, relative to the component output directory.
     * </p>
     * 
     * @param mutationsFilePath
     *        The path to the GraphQL mutations file, relative to the component output directory.
     */

    public void setMutationsFilePath(String mutationsFilePath) {
        this.mutationsFilePath = mutationsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL mutations file, relative to the component output directory.
     * </p>
     * 
     * @return The path to the GraphQL mutations file, relative to the component output directory.
     */

    public String getMutationsFilePath() {
        return this.mutationsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL mutations file, relative to the component output directory.
     * </p>
     * 
     * @param mutationsFilePath
     *        The path to the GraphQL mutations file, relative to the component output directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphQLRenderConfig withMutationsFilePath(String mutationsFilePath) {
        setMutationsFilePath(mutationsFilePath);
        return this;
    }

    /**
     * <p>
     * The path to the GraphQL subscriptions file, relative to the component output directory.
     * </p>
     * 
     * @param subscriptionsFilePath
     *        The path to the GraphQL subscriptions file, relative to the component output directory.
     */

    public void setSubscriptionsFilePath(String subscriptionsFilePath) {
        this.subscriptionsFilePath = subscriptionsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL subscriptions file, relative to the component output directory.
     * </p>
     * 
     * @return The path to the GraphQL subscriptions file, relative to the component output directory.
     */

    public String getSubscriptionsFilePath() {
        return this.subscriptionsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL subscriptions file, relative to the component output directory.
     * </p>
     * 
     * @param subscriptionsFilePath
     *        The path to the GraphQL subscriptions file, relative to the component output directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphQLRenderConfig withSubscriptionsFilePath(String subscriptionsFilePath) {
        setSubscriptionsFilePath(subscriptionsFilePath);
        return this;
    }

    /**
     * <p>
     * The path to the GraphQL fragments file, relative to the component output directory.
     * </p>
     * 
     * @param fragmentsFilePath
     *        The path to the GraphQL fragments file, relative to the component output directory.
     */

    public void setFragmentsFilePath(String fragmentsFilePath) {
        this.fragmentsFilePath = fragmentsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL fragments file, relative to the component output directory.
     * </p>
     * 
     * @return The path to the GraphQL fragments file, relative to the component output directory.
     */

    public String getFragmentsFilePath() {
        return this.fragmentsFilePath;
    }

    /**
     * <p>
     * The path to the GraphQL fragments file, relative to the component output directory.
     * </p>
     * 
     * @param fragmentsFilePath
     *        The path to the GraphQL fragments file, relative to the component output directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GraphQLRenderConfig withFragmentsFilePath(String fragmentsFilePath) {
        setFragmentsFilePath(fragmentsFilePath);
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
        if (getTypesFilePath() != null)
            sb.append("TypesFilePath: ").append(getTypesFilePath()).append(",");
        if (getQueriesFilePath() != null)
            sb.append("QueriesFilePath: ").append(getQueriesFilePath()).append(",");
        if (getMutationsFilePath() != null)
            sb.append("MutationsFilePath: ").append(getMutationsFilePath()).append(",");
        if (getSubscriptionsFilePath() != null)
            sb.append("SubscriptionsFilePath: ").append(getSubscriptionsFilePath()).append(",");
        if (getFragmentsFilePath() != null)
            sb.append("FragmentsFilePath: ").append(getFragmentsFilePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GraphQLRenderConfig == false)
            return false;
        GraphQLRenderConfig other = (GraphQLRenderConfig) obj;
        if (other.getTypesFilePath() == null ^ this.getTypesFilePath() == null)
            return false;
        if (other.getTypesFilePath() != null && other.getTypesFilePath().equals(this.getTypesFilePath()) == false)
            return false;
        if (other.getQueriesFilePath() == null ^ this.getQueriesFilePath() == null)
            return false;
        if (other.getQueriesFilePath() != null && other.getQueriesFilePath().equals(this.getQueriesFilePath()) == false)
            return false;
        if (other.getMutationsFilePath() == null ^ this.getMutationsFilePath() == null)
            return false;
        if (other.getMutationsFilePath() != null && other.getMutationsFilePath().equals(this.getMutationsFilePath()) == false)
            return false;
        if (other.getSubscriptionsFilePath() == null ^ this.getSubscriptionsFilePath() == null)
            return false;
        if (other.getSubscriptionsFilePath() != null && other.getSubscriptionsFilePath().equals(this.getSubscriptionsFilePath()) == false)
            return false;
        if (other.getFragmentsFilePath() == null ^ this.getFragmentsFilePath() == null)
            return false;
        if (other.getFragmentsFilePath() != null && other.getFragmentsFilePath().equals(this.getFragmentsFilePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypesFilePath() == null) ? 0 : getTypesFilePath().hashCode());
        hashCode = prime * hashCode + ((getQueriesFilePath() == null) ? 0 : getQueriesFilePath().hashCode());
        hashCode = prime * hashCode + ((getMutationsFilePath() == null) ? 0 : getMutationsFilePath().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionsFilePath() == null) ? 0 : getSubscriptionsFilePath().hashCode());
        hashCode = prime * hashCode + ((getFragmentsFilePath() == null) ? 0 : getFragmentsFilePath().hashCode());
        return hashCode;
    }

    @Override
    public GraphQLRenderConfig clone() {
        try {
            return (GraphQLRenderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.GraphQLRenderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
