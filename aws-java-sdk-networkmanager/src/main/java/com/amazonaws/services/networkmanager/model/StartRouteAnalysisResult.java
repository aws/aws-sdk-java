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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRouteAnalysisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The route analysis.
     * </p>
     */
    private RouteAnalysis routeAnalysis;

    /**
     * <p>
     * The route analysis.
     * </p>
     * 
     * @param routeAnalysis
     *        The route analysis.
     */

    public void setRouteAnalysis(RouteAnalysis routeAnalysis) {
        this.routeAnalysis = routeAnalysis;
    }

    /**
     * <p>
     * The route analysis.
     * </p>
     * 
     * @return The route analysis.
     */

    public RouteAnalysis getRouteAnalysis() {
        return this.routeAnalysis;
    }

    /**
     * <p>
     * The route analysis.
     * </p>
     * 
     * @param routeAnalysis
     *        The route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRouteAnalysisResult withRouteAnalysis(RouteAnalysis routeAnalysis) {
        setRouteAnalysis(routeAnalysis);
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
        if (getRouteAnalysis() != null)
            sb.append("RouteAnalysis: ").append(getRouteAnalysis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRouteAnalysisResult == false)
            return false;
        StartRouteAnalysisResult other = (StartRouteAnalysisResult) obj;
        if (other.getRouteAnalysis() == null ^ this.getRouteAnalysis() == null)
            return false;
        if (other.getRouteAnalysis() != null && other.getRouteAnalysis().equals(this.getRouteAnalysis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRouteAnalysis() == null) ? 0 : getRouteAnalysis().hashCode());
        return hashCode;
    }

    @Override
    public StartRouteAnalysisResult clone() {
        try {
            return (StartRouteAnalysisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
