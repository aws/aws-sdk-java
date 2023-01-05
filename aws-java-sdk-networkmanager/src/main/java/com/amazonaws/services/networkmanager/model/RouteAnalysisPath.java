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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a route analysis path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RouteAnalysisPath" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteAnalysisPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the analysis at completion.
     * </p>
     */
    private RouteAnalysisCompletion completionStatus;
    /**
     * <p>
     * The route analysis path.
     * </p>
     */
    private java.util.List<PathComponent> path;

    /**
     * <p>
     * The status of the analysis at completion.
     * </p>
     * 
     * @param completionStatus
     *        The status of the analysis at completion.
     */

    public void setCompletionStatus(RouteAnalysisCompletion completionStatus) {
        this.completionStatus = completionStatus;
    }

    /**
     * <p>
     * The status of the analysis at completion.
     * </p>
     * 
     * @return The status of the analysis at completion.
     */

    public RouteAnalysisCompletion getCompletionStatus() {
        return this.completionStatus;
    }

    /**
     * <p>
     * The status of the analysis at completion.
     * </p>
     * 
     * @param completionStatus
     *        The status of the analysis at completion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisPath withCompletionStatus(RouteAnalysisCompletion completionStatus) {
        setCompletionStatus(completionStatus);
        return this;
    }

    /**
     * <p>
     * The route analysis path.
     * </p>
     * 
     * @return The route analysis path.
     */

    public java.util.List<PathComponent> getPath() {
        return path;
    }

    /**
     * <p>
     * The route analysis path.
     * </p>
     * 
     * @param path
     *        The route analysis path.
     */

    public void setPath(java.util.Collection<PathComponent> path) {
        if (path == null) {
            this.path = null;
            return;
        }

        this.path = new java.util.ArrayList<PathComponent>(path);
    }

    /**
     * <p>
     * The route analysis path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPath(java.util.Collection)} or {@link #withPath(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param path
     *        The route analysis path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisPath withPath(PathComponent... path) {
        if (this.path == null) {
            setPath(new java.util.ArrayList<PathComponent>(path.length));
        }
        for (PathComponent ele : path) {
            this.path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The route analysis path.
     * </p>
     * 
     * @param path
     *        The route analysis path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisPath withPath(java.util.Collection<PathComponent> path) {
        setPath(path);
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
        if (getCompletionStatus() != null)
            sb.append("CompletionStatus: ").append(getCompletionStatus()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteAnalysisPath == false)
            return false;
        RouteAnalysisPath other = (RouteAnalysisPath) obj;
        if (other.getCompletionStatus() == null ^ this.getCompletionStatus() == null)
            return false;
        if (other.getCompletionStatus() != null && other.getCompletionStatus().equals(this.getCompletionStatus()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionStatus() == null) ? 0 : getCompletionStatus().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public RouteAnalysisPath clone() {
        try {
            return (RouteAnalysisPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RouteAnalysisPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
