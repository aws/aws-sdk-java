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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGraphqlApiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>GraphqlApi</code>.
     * </p>
     */
    private GraphqlApi graphqlApi;

    /**
     * <p>
     * The <code>GraphqlApi</code>.
     * </p>
     * 
     * @param graphqlApi
     *        The <code>GraphqlApi</code>.
     */

    public void setGraphqlApi(GraphqlApi graphqlApi) {
        this.graphqlApi = graphqlApi;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code>.
     * </p>
     * 
     * @return The <code>GraphqlApi</code>.
     */

    public GraphqlApi getGraphqlApi() {
        return this.graphqlApi;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code>.
     * </p>
     * 
     * @param graphqlApi
     *        The <code>GraphqlApi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiResult withGraphqlApi(GraphqlApi graphqlApi) {
        setGraphqlApi(graphqlApi);
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
        if (getGraphqlApi() != null)
            sb.append("GraphqlApi: ").append(getGraphqlApi());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGraphqlApiResult == false)
            return false;
        CreateGraphqlApiResult other = (CreateGraphqlApiResult) obj;
        if (other.getGraphqlApi() == null ^ this.getGraphqlApi() == null)
            return false;
        if (other.getGraphqlApi() != null && other.getGraphqlApi().equals(this.getGraphqlApi()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphqlApi() == null) ? 0 : getGraphqlApi().hashCode());
        return hashCode;
    }

    @Override
    public CreateGraphqlApiResult clone() {
        try {
            return (CreateGraphqlApiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
