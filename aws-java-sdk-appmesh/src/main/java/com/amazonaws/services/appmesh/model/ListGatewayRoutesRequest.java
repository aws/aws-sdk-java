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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListGatewayRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewayRoutesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use this
     * parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListGatewayRoutes</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of the service mesh to list gateway routes in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the virtual gateway to list gateway routes in.
     * </p>
     */
    private String virtualGatewayName;

    /**
     * <p>
     * The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use this
     * parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListGatewayRoutes</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use
     *        this parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code>
     *        value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListGatewayRoutes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use this
     * parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListGatewayRoutes</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you
     *         use this parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single
     *         page along with a <code>nextToken</code> response element. You can see the remaining results of the
     *         initial request by sending another <code>ListGatewayRoutes</code> request with the returned
     *         <code>nextToken</code> value. This value can be between 1 and 100. If you don't use this parameter,
     *         <code>ListGatewayRoutes</code> returns up to 100 results and a <code>nextToken</code> value if
     *         applicable.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use this
     * parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page along with a
     * <code>nextToken</code> response element. You can see the remaining results of the initial request by sending
     * another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code> value. This value can be
     * between 1 and 100. If you don't use this parameter, <code>ListGatewayRoutes</code> returns up to 100 results and
     * a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param limit
     *        The maximum number of results returned by <code>ListGatewayRoutes</code> in paginated output. When you use
     *        this parameter, <code>ListGatewayRoutes</code> returns only <code>limit</code> results in a single page
     *        along with a <code>nextToken</code> response element. You can see the remaining results of the initial
     *        request by sending another <code>ListGatewayRoutes</code> request with the returned <code>nextToken</code>
     *        value. This value can be between 1 and 100. If you don't use this parameter,
     *        <code>ListGatewayRoutes</code> returns up to 100 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to list gateway routes in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to list gateway routes in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to list gateway routes in.
     * </p>
     * 
     * @return The name of the service mesh to list gateway routes in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh to list gateway routes in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to list gateway routes in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *         the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesRequest withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request
     *        where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code>
     *         request where <code>limit</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code> value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request where
     * <code>limit</code> was used and the results exceeded the value of that parameter. Pagination continues from the
     * end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListGatewayRoutes</code> request
     *        where <code>limit</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the virtual gateway to list gateway routes in.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to list gateway routes in.
     */

    public void setVirtualGatewayName(String virtualGatewayName) {
        this.virtualGatewayName = virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to list gateway routes in.
     * </p>
     * 
     * @return The name of the virtual gateway to list gateway routes in.
     */

    public String getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to list gateway routes in.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to list gateway routes in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayRoutesRequest withVirtualGatewayName(String virtualGatewayName) {
        setVirtualGatewayName(virtualGatewayName);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getVirtualGatewayName() != null)
            sb.append("VirtualGatewayName: ").append(getVirtualGatewayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGatewayRoutesRequest == false)
            return false;
        ListGatewayRoutesRequest other = (ListGatewayRoutesRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualGatewayName() == null ^ this.getVirtualGatewayName() == null)
            return false;
        if (other.getVirtualGatewayName() != null && other.getVirtualGatewayName().equals(this.getVirtualGatewayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayName() == null) ? 0 : getVirtualGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewayRoutesRequest clone() {
        return (ListGatewayRoutesRequest) super.clone();
    }

}
