/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
 * </p>
 */
public class GetSdkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> that the SDK will use.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the <a>Stage</a> that the SDK will use.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     * <code>objectivec</code> (for iOS) are supported.
     * </p>
     */
    private String sdkType;
    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     * <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     * <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     * <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are
     * required.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> that the SDK will use.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> that the SDK will use.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> that the SDK will use.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> that the SDK will use.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> that the SDK will use.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> that the SDK will use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> that the SDK will use.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @return The name of the <a>Stage</a> that the SDK will use.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> that the SDK will use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     * <code>objectivec</code> (for iOS) are supported.
     * </p>
     * 
     * @param sdkType
     *        The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     *        <code>objectivec</code> (for iOS) are supported.
     */

    public void setSdkType(String sdkType) {
        this.sdkType = sdkType;
    }

    /**
     * <p>
     * The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     * <code>objectivec</code> (for iOS) are supported.
     * </p>
     * 
     * @return The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     *         <code>objectivec</code> (for iOS) are supported.
     */

    public String getSdkType() {
        return this.sdkType;
    }

    /**
     * <p>
     * The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     * <code>objectivec</code> (for iOS) are supported.
     * </p>
     * 
     * @param sdkType
     *        The language for the generated SDK. Currently <code>javascript</code>, <code>android</code>, and
     *        <code>objectivec</code> (for iOS) are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withSdkType(String sdkType) {
        setSdkType(sdkType);
        return this;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     * <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     * <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     * <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are
     * required.
     * </p>
     * 
     * @return A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     *         <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     *         <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *         <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *         <code>invokerPackage</code> are required.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     * <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     * <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     * <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are
     * required.
     * </p>
     * 
     * @param parameters
     *        A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     *        <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     *        <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *        <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *        <code>invokerPackage</code> are required.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     * <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     * <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     * <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are
     * required.
     * </p>
     * 
     * @param parameters
     *        A key-value map of query string parameters that specify properties of the SDK, depending on the requested
     *        <code>sdkType</code>. For <code>sdkType</code> of <code>objectivec</code>, a parameter named
     *        <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *        <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *        <code>invokerPackage</code> are required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public GetSdkRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getSdkType() != null)
            sb.append("SdkType: " + getSdkType() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSdkRequest == false)
            return false;
        GetSdkRequest other = (GetSdkRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getSdkType() == null ^ this.getSdkType() == null)
            return false;
        if (other.getSdkType() != null && other.getSdkType().equals(this.getSdkType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getSdkType() == null) ? 0 : getSdkType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public GetSdkRequest clone() {
        return (GetSdkRequest) super.clone();
    }
}
