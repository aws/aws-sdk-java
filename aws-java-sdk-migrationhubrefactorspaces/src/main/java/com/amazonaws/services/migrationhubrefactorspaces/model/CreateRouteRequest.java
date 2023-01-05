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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application within which the route is being created.
     * </p>
     */
    private String applicationIdentifier;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Configuration for the default route type.
     * </p>
     */
    private DefaultRouteInput defaultRoute;
    /**
     * <p>
     * The ID of the environment in which the route is created.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another route is
     * forwarded to the default route. Applications must have a default route before any other routes can be created.
     * <code>URI_PATH</code> indicates a route that is based on a URI path.
     * </p>
     */
    private String routeType;
    /**
     * <p>
     * The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     * service.
     * </p>
     */
    private String serviceIdentifier;
    /**
     * <p>
     * The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration for the URI path route type.
     * </p>
     */
    private UriPathRouteInput uriPathRoute;

    /**
     * <p>
     * The ID of the application within which the route is being created.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application within which the route is being created.
     */

    public void setApplicationIdentifier(String applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application within which the route is being created.
     * </p>
     * 
     * @return The ID of the application within which the route is being created.
     */

    public String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /**
     * <p>
     * The ID of the application within which the route is being created.
     * </p>
     * 
     * @param applicationIdentifier
     *        The ID of the application within which the route is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withApplicationIdentifier(String applicationIdentifier) {
        setApplicationIdentifier(applicationIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Configuration for the default route type.
     * </p>
     * 
     * @param defaultRoute
     *        Configuration for the default route type.
     */

    public void setDefaultRoute(DefaultRouteInput defaultRoute) {
        this.defaultRoute = defaultRoute;
    }

    /**
     * <p>
     * Configuration for the default route type.
     * </p>
     * 
     * @return Configuration for the default route type.
     */

    public DefaultRouteInput getDefaultRoute() {
        return this.defaultRoute;
    }

    /**
     * <p>
     * Configuration for the default route type.
     * </p>
     * 
     * @param defaultRoute
     *        Configuration for the default route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withDefaultRoute(DefaultRouteInput defaultRoute) {
        setDefaultRoute(defaultRoute);
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the route is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the route is created.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the route is created.
     * </p>
     * 
     * @return The ID of the environment in which the route is created.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the route is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another route is
     * forwarded to the default route. Applications must have a default route before any other routes can be created.
     * <code>URI_PATH</code> indicates a route that is based on a URI path.
     * </p>
     * 
     * @param routeType
     *        The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another
     *        route is forwarded to the default route. Applications must have a default route before any other routes
     *        can be created. <code>URI_PATH</code> indicates a route that is based on a URI path.
     * @see RouteType
     */

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * <p>
     * The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another route is
     * forwarded to the default route. Applications must have a default route before any other routes can be created.
     * <code>URI_PATH</code> indicates a route that is based on a URI path.
     * </p>
     * 
     * @return The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another
     *         route is forwarded to the default route. Applications must have a default route before any other routes
     *         can be created. <code>URI_PATH</code> indicates a route that is based on a URI path.
     * @see RouteType
     */

    public String getRouteType() {
        return this.routeType;
    }

    /**
     * <p>
     * The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another route is
     * forwarded to the default route. Applications must have a default route before any other routes can be created.
     * <code>URI_PATH</code> indicates a route that is based on a URI path.
     * </p>
     * 
     * @param routeType
     *        The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another
     *        route is forwarded to the default route. Applications must have a default route before any other routes
     *        can be created. <code>URI_PATH</code> indicates a route that is based on a URI path.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public CreateRouteRequest withRouteType(String routeType) {
        setRouteType(routeType);
        return this;
    }

    /**
     * <p>
     * The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another route is
     * forwarded to the default route. Applications must have a default route before any other routes can be created.
     * <code>URI_PATH</code> indicates a route that is based on a URI path.
     * </p>
     * 
     * @param routeType
     *        The route type of the route. <code>DEFAULT</code> indicates that all traffic that does not match another
     *        route is forwarded to the default route. Applications must have a default route before any other routes
     *        can be created. <code>URI_PATH</code> indicates a route that is based on a URI path.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public CreateRouteRequest withRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     * service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     *        service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     * service.
     * </p>
     * 
     * @return The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     *         service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     * service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID of the service in which the route is created. Traffic that matches this route is forwarded to this
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @return The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key-value pair..
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @param tags
     *        The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key-value pair..
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair..
     * </p>
     * 
     * @param tags
     *        The tags to assign to the route. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key-value pair..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRouteRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for the URI path route type.
     * </p>
     * 
     * @param uriPathRoute
     *        The configuration for the URI path route type.
     */

    public void setUriPathRoute(UriPathRouteInput uriPathRoute) {
        this.uriPathRoute = uriPathRoute;
    }

    /**
     * <p>
     * The configuration for the URI path route type.
     * </p>
     * 
     * @return The configuration for the URI path route type.
     */

    public UriPathRouteInput getUriPathRoute() {
        return this.uriPathRoute;
    }

    /**
     * <p>
     * The configuration for the URI path route type.
     * </p>
     * 
     * @param uriPathRoute
     *        The configuration for the URI path route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteRequest withUriPathRoute(UriPathRouteInput uriPathRoute) {
        setUriPathRoute(uriPathRoute);
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
        if (getApplicationIdentifier() != null)
            sb.append("ApplicationIdentifier: ").append(getApplicationIdentifier()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDefaultRoute() != null)
            sb.append("DefaultRoute: ").append(getDefaultRoute()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getRouteType() != null)
            sb.append("RouteType: ").append(getRouteType()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUriPathRoute() != null)
            sb.append("UriPathRoute: ").append(getUriPathRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteRequest == false)
            return false;
        CreateRouteRequest other = (CreateRouteRequest) obj;
        if (other.getApplicationIdentifier() == null ^ this.getApplicationIdentifier() == null)
            return false;
        if (other.getApplicationIdentifier() != null && other.getApplicationIdentifier().equals(this.getApplicationIdentifier()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDefaultRoute() == null ^ this.getDefaultRoute() == null)
            return false;
        if (other.getDefaultRoute() != null && other.getDefaultRoute().equals(this.getDefaultRoute()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getRouteType() == null ^ this.getRouteType() == null)
            return false;
        if (other.getRouteType() != null && other.getRouteType().equals(this.getRouteType()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUriPathRoute() == null ^ this.getUriPathRoute() == null)
            return false;
        if (other.getUriPathRoute() != null && other.getUriPathRoute().equals(this.getUriPathRoute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIdentifier() == null) ? 0 : getApplicationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultRoute() == null) ? 0 : getDefaultRoute().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUriPathRoute() == null) ? 0 : getUriPathRoute().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteRequest clone() {
        return (CreateRouteRequest) super.clone();
    }

}
