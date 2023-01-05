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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/GetRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     */
    private String createdByAccountId;
    /**
     * <p>
     * The timestamp of when the route is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Any error associated with the route resource.
     * </p>
     */
    private ErrorResponse error;
    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     */
    private Boolean includeChildPaths;
    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     */
    private java.util.List<String> methods;
    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * A mapping of Amazon API Gateway path resources to resource IDs.
     * </p>
     */
    private java.util.Map<String, String> pathResourceToId;
    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * <p>
     * <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route. Applications
     * must have a default route before any other routes can be created.
     * </p>
     * <p>
     * <b>URI_PATH</b>: A route that is based on a URI path.
     * </p>
     */
    private String routeId;
    /**
     * <p>
     * The type of route.
     * </p>
     */
    private String routeType;
    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     * application.
     * </p>
     */
    private String sourcePath;
    /**
     * <p>
     * The current state of the route.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the route belongs to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @return The ID of the application that the route belongs to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application that the route belongs to.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application that the route belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the route.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the route creator.
     */

    public void setCreatedByAccountId(String createdByAccountId) {
        this.createdByAccountId = createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the route creator.
     */

    public String getCreatedByAccountId() {
        return this.createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the route creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withCreatedByAccountId(String createdByAccountId) {
        setCreatedByAccountId(createdByAccountId);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the route is created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the route is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp of when the route is created.
     * </p>
     * 
     * @return The timestamp of when the route is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp of when the route is created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp of when the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        Unique identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * Unique identifier of the environment.
     * </p>
     * 
     * @return Unique identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * Unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        Unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Any error associated with the route resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the route resource.
     */

    public void setError(ErrorResponse error) {
        this.error = error;
    }

    /**
     * <p>
     * Any error associated with the route resource.
     * </p>
     * 
     * @return Any error associated with the route resource.
     */

    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * <p>
     * Any error associated with the route resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the route resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withError(ErrorResponse error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     * 
     * @param includeChildPaths
     *        Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>,
     *        requests must match the source path exactly before they are forwarded to this route's service.
     */

    public void setIncludeChildPaths(Boolean includeChildPaths) {
        this.includeChildPaths = includeChildPaths;
    }

    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     * 
     * @return Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>,
     *         requests must match the source path exactly before they are forwarded to this route's service.
     */

    public Boolean getIncludeChildPaths() {
        return this.includeChildPaths;
    }

    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     * 
     * @param includeChildPaths
     *        Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>,
     *        requests must match the source path exactly before they are forwarded to this route's service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withIncludeChildPaths(Boolean includeChildPaths) {
        setIncludeChildPaths(includeChildPaths);
        return this;
    }

    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     * 
     * @return Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>,
     *         requests must match the source path exactly before they are forwarded to this route's service.
     */

    public Boolean isIncludeChildPaths() {
        return this.includeChildPaths;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the route was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     * 
     * @return A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP
     *         requests using that method are forwarded to this route’s service.
     * @see HttpMethod
     */

    public java.util.List<String> getMethods() {
        return methods;
    }

    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     * 
     * @param methods
     *        A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP
     *        requests using that method are forwarded to this route’s service.
     * @see HttpMethod
     */

    public void setMethods(java.util.Collection<String> methods) {
        if (methods == null) {
            this.methods = null;
            return;
        }

        this.methods = new java.util.ArrayList<String>(methods);
    }

    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMethods(java.util.Collection)} or {@link #withMethods(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param methods
     *        A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP
     *        requests using that method are forwarded to this route’s service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public GetRouteResult withMethods(String... methods) {
        if (this.methods == null) {
            setMethods(new java.util.ArrayList<String>(methods.length));
        }
        for (String ele : methods) {
            this.methods.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     * 
     * @param methods
     *        A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP
     *        requests using that method are forwarded to this route’s service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public GetRouteResult withMethods(java.util.Collection<String> methods) {
        setMethods(methods);
        return this;
    }

    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     * 
     * @param methods
     *        A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP
     *        requests using that method are forwarded to this route’s service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public GetRouteResult withMethods(HttpMethod... methods) {
        java.util.ArrayList<String> methodsCopy = new java.util.ArrayList<String>(methods.length);
        for (HttpMethod value : methods) {
            methodsCopy.add(value.toString());
        }
        if (getMethods() == null) {
            setMethods(methodsCopy);
        } else {
            getMethods().addAll(methodsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the route owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the route owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the route owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * A mapping of Amazon API Gateway path resources to resource IDs.
     * </p>
     * 
     * @return A mapping of Amazon API Gateway path resources to resource IDs.
     */

    public java.util.Map<String, String> getPathResourceToId() {
        return pathResourceToId;
    }

    /**
     * <p>
     * A mapping of Amazon API Gateway path resources to resource IDs.
     * </p>
     * 
     * @param pathResourceToId
     *        A mapping of Amazon API Gateway path resources to resource IDs.
     */

    public void setPathResourceToId(java.util.Map<String, String> pathResourceToId) {
        this.pathResourceToId = pathResourceToId;
    }

    /**
     * <p>
     * A mapping of Amazon API Gateway path resources to resource IDs.
     * </p>
     * 
     * @param pathResourceToId
     *        A mapping of Amazon API Gateway path resources to resource IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withPathResourceToId(java.util.Map<String, String> pathResourceToId) {
        setPathResourceToId(pathResourceToId);
        return this;
    }

    /**
     * Add a single PathResourceToId entry
     *
     * @see GetRouteResult#withPathResourceToId
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult addPathResourceToIdEntry(String key, String value) {
        if (null == this.pathResourceToId) {
            this.pathResourceToId = new java.util.HashMap<String, String>();
        }
        if (this.pathResourceToId.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.pathResourceToId.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PathResourceToId.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult clearPathResourceToIdEntries() {
        this.pathResourceToId = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * <p>
     * <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route. Applications
     * must have a default route before any other routes can be created.
     * </p>
     * <p>
     * <b>URI_PATH</b>: A route that is based on a URI path.
     * </p>
     * 
     * @param routeId
     *        The unique identifier of the route.</p>
     *        <p>
     *        <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route.
     *        Applications must have a default route before any other routes can be created.
     *        </p>
     *        <p>
     *        <b>URI_PATH</b>: A route that is based on a URI path.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * <p>
     * <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route. Applications
     * must have a default route before any other routes can be created.
     * </p>
     * <p>
     * <b>URI_PATH</b>: A route that is based on a URI path.
     * </p>
     * 
     * @return The unique identifier of the route.</p>
     *         <p>
     *         <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route.
     *         Applications must have a default route before any other routes can be created.
     *         </p>
     *         <p>
     *         <b>URI_PATH</b>: A route that is based on a URI path.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * <p>
     * <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route. Applications
     * must have a default route before any other routes can be created.
     * </p>
     * <p>
     * <b>URI_PATH</b>: A route that is based on a URI path.
     * </p>
     * 
     * @param routeId
     *        The unique identifier of the route.</p>
     *        <p>
     *        <b>DEFAULT</b>: All traffic that does not match another route is forwarded to the default route.
     *        Applications must have a default route before any other routes can be created.
     *        </p>
     *        <p>
     *        <b>URI_PATH</b>: A route that is based on a URI path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRouteId(String routeId) {
        setRouteId(routeId);
        return this;
    }

    /**
     * <p>
     * The type of route.
     * </p>
     * 
     * @param routeType
     *        The type of route.
     * @see RouteType
     */

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * <p>
     * The type of route.
     * </p>
     * 
     * @return The type of route.
     * @see RouteType
     */

    public String getRouteType() {
        return this.routeType;
    }

    /**
     * <p>
     * The type of route.
     * </p>
     * 
     * @param routeType
     *        The type of route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public GetRouteResult withRouteType(String routeType) {
        setRouteType(routeType);
        return this;
    }

    /**
     * <p>
     * The type of route.
     * </p>
     * 
     * @param routeType
     *        The type of route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public GetRouteResult withRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @return The unique identifier of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The unique identifier of the service.
     * </p>
     * 
     * @param serviceId
     *        The unique identifier of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     * application.
     * </p>
     * 
     * @param sourcePath
     *        The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     *        application.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     * application.
     * </p>
     * 
     * @return The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of
     *         the application.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * <p>
     * The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     * application.
     * </p>
     * 
     * @param sourcePath
     *        The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @see RouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @return The current state of the route.
     * @see RouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public GetRouteResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the route.
     * </p>
     * 
     * @param state
     *        The current state of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public GetRouteResult withState(RouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @return The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each
     *         tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the route. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetRouteResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult addTagsEntry(String key, String value) {
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

    public GetRouteResult clearTagsEntries() {
        this.tags = null;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedByAccountId() != null)
            sb.append("CreatedByAccountId: ").append(getCreatedByAccountId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getIncludeChildPaths() != null)
            sb.append("IncludeChildPaths: ").append(getIncludeChildPaths()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getMethods() != null)
            sb.append("Methods: ").append(getMethods()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getPathResourceToId() != null)
            sb.append("PathResourceToId: ").append(getPathResourceToId()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId()).append(",");
        if (getRouteType() != null)
            sb.append("RouteType: ").append(getRouteType()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRouteResult == false)
            return false;
        GetRouteResult other = (GetRouteResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedByAccountId() == null ^ this.getCreatedByAccountId() == null)
            return false;
        if (other.getCreatedByAccountId() != null && other.getCreatedByAccountId().equals(this.getCreatedByAccountId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getIncludeChildPaths() == null ^ this.getIncludeChildPaths() == null)
            return false;
        if (other.getIncludeChildPaths() != null && other.getIncludeChildPaths().equals(this.getIncludeChildPaths()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getMethods() == null ^ this.getMethods() == null)
            return false;
        if (other.getMethods() != null && other.getMethods().equals(this.getMethods()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getPathResourceToId() == null ^ this.getPathResourceToId() == null)
            return false;
        if (other.getPathResourceToId() != null && other.getPathResourceToId().equals(this.getPathResourceToId()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteType() == null ^ this.getRouteType() == null)
            return false;
        if (other.getRouteType() != null && other.getRouteType().equals(this.getRouteType()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedByAccountId() == null) ? 0 : getCreatedByAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getIncludeChildPaths() == null) ? 0 : getIncludeChildPaths().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getMethods() == null) ? 0 : getMethods().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getPathResourceToId() == null) ? 0 : getPathResourceToId().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetRouteResult clone() {
        try {
            return (GetRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
