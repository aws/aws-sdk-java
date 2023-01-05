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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRouteAnalysisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The source from which traffic originates.
     * </p>
     */
    private RouteAnalysisEndpointOptionsSpecification source;
    /**
     * <p>
     * The destination.
     * </p>
     */
    private RouteAnalysisEndpointOptionsSpecification destination;
    /**
     * <p>
     * Indicates whether to analyze the return path. The default is <code>false</code>.
     * </p>
     */
    private Boolean includeReturnPath;
    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     * <code>false</code>.
     * </p>
     */
    private Boolean useMiddleboxes;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The source from which traffic originates.
     * </p>
     * 
     * @param source
     *        The source from which traffic originates.
     */

    public void setSource(RouteAnalysisEndpointOptionsSpecification source) {
        this.source = source;
    }

    /**
     * <p>
     * The source from which traffic originates.
     * </p>
     * 
     * @return The source from which traffic originates.
     */

    public RouteAnalysisEndpointOptionsSpecification getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source from which traffic originates.
     * </p>
     * 
     * @param source
     *        The source from which traffic originates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisRequest withSource(RouteAnalysisEndpointOptionsSpecification source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     */

    public void setDestination(RouteAnalysisEndpointOptionsSpecification destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @return The destination.
     */

    public RouteAnalysisEndpointOptionsSpecification getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisRequest withDestination(RouteAnalysisEndpointOptionsSpecification destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The default is <code>false</code>.
     * </p>
     * 
     * @param includeReturnPath
     *        Indicates whether to analyze the return path. The default is <code>false</code>.
     */

    public void setIncludeReturnPath(Boolean includeReturnPath) {
        this.includeReturnPath = includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The default is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether to analyze the return path. The default is <code>false</code>.
     */

    public Boolean getIncludeReturnPath() {
        return this.includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The default is <code>false</code>.
     * </p>
     * 
     * @param includeReturnPath
     *        Indicates whether to analyze the return path. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisRequest withIncludeReturnPath(Boolean includeReturnPath) {
        setIncludeReturnPath(includeReturnPath);
        return this;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The default is <code>false</code>.
     * </p>
     * 
     * @return Indicates whether to analyze the return path. The default is <code>false</code>.
     */

    public Boolean isIncludeReturnPath() {
        return this.includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param useMiddleboxes
     *        Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     *        <code>false</code>.
     */

    public void setUseMiddleboxes(Boolean useMiddleboxes) {
        this.useMiddleboxes = useMiddleboxes;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     *         <code>false</code>.
     */

    public Boolean getUseMiddleboxes() {
        return this.useMiddleboxes;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param useMiddleboxes
     *        Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisRequest withUseMiddleboxes(Boolean useMiddleboxes) {
        setUseMiddleboxes(useMiddleboxes);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Indicates whether to include the location of middlebox appliances in the route analysis. The default is
     *         <code>false</code>.
     */

    public Boolean isUseMiddleboxes() {
        return this.useMiddleboxes;
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getIncludeReturnPath() != null)
            sb.append("IncludeReturnPath: ").append(getIncludeReturnPath()).append(",");
        if (getUseMiddleboxes() != null)
            sb.append("UseMiddleboxes: ").append(getUseMiddleboxes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRouteAnalysisRequest == false)
            return false;
        StartRouteAnalysisRequest other = (StartRouteAnalysisRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getIncludeReturnPath() == null ^ this.getIncludeReturnPath() == null)
            return false;
        if (other.getIncludeReturnPath() != null && other.getIncludeReturnPath().equals(this.getIncludeReturnPath()) == false)
            return false;
        if (other.getUseMiddleboxes() == null ^ this.getUseMiddleboxes() == null)
            return false;
        if (other.getUseMiddleboxes() != null && other.getUseMiddleboxes().equals(this.getUseMiddleboxes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getIncludeReturnPath() == null) ? 0 : getIncludeReturnPath().hashCode());
        hashCode = prime * hashCode + ((getUseMiddleboxes() == null) ? 0 : getUseMiddleboxes().hashCode());
        return hashCode;
    }

    @Override
    public StartRouteAnalysisRequest clone() {
        return (StartRouteAnalysisRequest) super.clone();
    }

}
