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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGraphqlApiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated <code>GraphqlApi</code> object.
     * </p>
     */
    private GraphqlApi graphqlApi;

    /**
     * <p>
     * The updated <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param graphqlApi
     *        The updated <code>GraphqlApi</code> object.
     */

    public void setGraphqlApi(GraphqlApi graphqlApi) {
        this.graphqlApi = graphqlApi;
    }

    /**
     * <p>
     * The updated <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The updated <code>GraphqlApi</code> object.
     */

    public GraphqlApi getGraphqlApi() {
        return this.graphqlApi;
    }

    /**
     * <p>
     * The updated <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param graphqlApi
     *        The updated <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiResult withGraphqlApi(GraphqlApi graphqlApi) {
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

        if (obj instanceof UpdateGraphqlApiResult == false)
            return false;
        UpdateGraphqlApiResult other = (UpdateGraphqlApiResult) obj;
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
    public UpdateGraphqlApiResult clone() {
        try {
            return (UpdateGraphqlApiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
