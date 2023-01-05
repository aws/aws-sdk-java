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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListServicesByNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesByNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services in.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     * indicates that more results are available to fulfill the request and further calls are needed. If
     * <code>maxResults</code> is returned, it is possible the number of results is less than <code>maxResults</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated output. When
     * this parameter is used, <code>ListServicesByNamespace</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListServicesByNamespace</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter isn't used, then
     * <code>ListServicesByNamespace</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services in.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services
     *        in.</p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services in.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services
     *         in.</p>
     *         <p>
     *         Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *         connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *         container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS
     *         services create are supported with Service Connect. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services in.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services
     *        in.</p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesByNamespaceRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     * indicates that more results are available to fulfill the request and further calls are needed. If
     * <code>maxResults</code> is returned, it is possible the number of results is less than <code>maxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     *        indicates that more results are available to fulfill the request and further calls are needed. If
     *        <code>maxResults</code> is returned, it is possible the number of results is less than
     *        <code>maxResults</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     * indicates that more results are available to fulfill the request and further calls are needed. If
     * <code>maxResults</code> is returned, it is possible the number of results is less than <code>maxResults</code>.
     * </p>
     * 
     * @return The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     *         indicates that more results are available to fulfill the request and further calls are needed. If
     *         <code>maxResults</code> is returned, it is possible the number of results is less than
     *         <code>maxResults</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     * indicates that more results are available to fulfill the request and further calls are needed. If
     * <code>maxResults</code> is returned, it is possible the number of results is less than <code>maxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value that's returned from a <code>ListServicesByNamespace</code> request. It
     *        indicates that more results are available to fulfill the request and further calls are needed. If
     *        <code>maxResults</code> is returned, it is possible the number of results is less than
     *        <code>maxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesByNamespaceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated output. When
     * this parameter is used, <code>ListServicesByNamespace</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListServicesByNamespace</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter isn't used, then
     * <code>ListServicesByNamespace</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated
     *        output. When this parameter is used, <code>ListServicesByNamespace</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListServicesByNamespace</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter isn't used, then <code>ListServicesByNamespace</code> returns
     *        up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated output. When
     * this parameter is used, <code>ListServicesByNamespace</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListServicesByNamespace</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter isn't used, then
     * <code>ListServicesByNamespace</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated
     *         output. When this parameter is used, <code>ListServicesByNamespace</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListServicesByNamespace</code> request with the returned <code>nextToken</code> value. This value
     *         can be between 1 and 100. If this parameter isn't used, then <code>ListServicesByNamespace</code> returns
     *         up to 10 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated output. When
     * this parameter is used, <code>ListServicesByNamespace</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListServicesByNamespace</code> request with the returned
     * <code>nextToken</code> value. This value can be between 1 and 100. If this parameter isn't used, then
     * <code>ListServicesByNamespace</code> returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of service results that <code>ListServicesByNamespace</code> returns in paginated
     *        output. When this parameter is used, <code>ListServicesByNamespace</code> only returns
     *        <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>ListServicesByNamespace</code> request with the returned <code>nextToken</code> value. This value
     *        can be between 1 and 100. If this parameter isn't used, then <code>ListServicesByNamespace</code> returns
     *        up to 10 results and a <code>nextToken</code> value if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesByNamespaceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServicesByNamespaceRequest == false)
            return false;
        ListServicesByNamespaceRequest other = (ListServicesByNamespaceRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesByNamespaceRequest clone() {
        return (ListServicesByNamespaceRequest) super.clone();
    }

}
