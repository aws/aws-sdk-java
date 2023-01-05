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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the URI path route type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/UriPathRouteInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UriPathRouteInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     */
    private String activationState;
    /**
     * <p>
     * Indicates whether to match all subpaths of the given source path. If this value is <code>false</code>, requests
     * must match the source path exactly before they are forwarded to this route's service.
     * </p>
     */
    private Boolean includeChildPaths;
    /**
     * <p>
     * A list of HTTP methods to match. An empty list matches all values. If a method is present, only HTTP requests
     * using that method are forwarded to this route’s service.
     * </p>
     */
    private java.util.List<String> methods;
    /**
     * <p>
     * The path to use to match traffic. Paths must start with <code>/</code> and are relative to the base of the
     * application.
     * </p>
     */
    private String sourcePath;

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @see RouteActivationState
     */

    public void setActivationState(String activationState) {
        this.activationState = activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @return If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @see RouteActivationState
     */

    public String getActivationState() {
        return this.activationState;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public UriPathRouteInput withActivationState(String activationState) {
        setActivationState(activationState);
        return this;
    }

    /**
     * <p>
     * If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * </p>
     * 
     * @param activationState
     *        If set to <code>ACTIVE</code>, traffic is forwarded to this route’s service after the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteActivationState
     */

    public UriPathRouteInput withActivationState(RouteActivationState activationState) {
        this.activationState = activationState.toString();
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

    public UriPathRouteInput withIncludeChildPaths(Boolean includeChildPaths) {
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

    public UriPathRouteInput withMethods(String... methods) {
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

    public UriPathRouteInput withMethods(java.util.Collection<String> methods) {
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

    public UriPathRouteInput withMethods(HttpMethod... methods) {
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

    public UriPathRouteInput withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
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
        if (getActivationState() != null)
            sb.append("ActivationState: ").append(getActivationState()).append(",");
        if (getIncludeChildPaths() != null)
            sb.append("IncludeChildPaths: ").append(getIncludeChildPaths()).append(",");
        if (getMethods() != null)
            sb.append("Methods: ").append(getMethods()).append(",");
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UriPathRouteInput == false)
            return false;
        UriPathRouteInput other = (UriPathRouteInput) obj;
        if (other.getActivationState() == null ^ this.getActivationState() == null)
            return false;
        if (other.getActivationState() != null && other.getActivationState().equals(this.getActivationState()) == false)
            return false;
        if (other.getIncludeChildPaths() == null ^ this.getIncludeChildPaths() == null)
            return false;
        if (other.getIncludeChildPaths() != null && other.getIncludeChildPaths().equals(this.getIncludeChildPaths()) == false)
            return false;
        if (other.getMethods() == null ^ this.getMethods() == null)
            return false;
        if (other.getMethods() != null && other.getMethods().equals(this.getMethods()) == false)
            return false;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivationState() == null) ? 0 : getActivationState().hashCode());
        hashCode = prime * hashCode + ((getIncludeChildPaths() == null) ? 0 : getIncludeChildPaths().hashCode());
        hashCode = prime * hashCode + ((getMethods() == null) ? 0 : getMethods().hashCode());
        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        return hashCode;
    }

    @Override
    public UriPathRouteInput clone() {
        try {
            return (UriPathRouteInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.UriPathRouteInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
