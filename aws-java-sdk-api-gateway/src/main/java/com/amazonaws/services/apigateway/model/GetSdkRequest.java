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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSdkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that the SDK will use.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     * <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and <code>ruby</code> are
     * supported.
     * </p>
     */
    private String sdkType;
    /**
     * <p>
     * A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK. For
     * <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named <code>classPrefix</code>
     * is required. For <code>sdkType</code> of <code>android</code>, parameters named <code>groupId</code>,
     * <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are required. For
     * <code>sdkType</code> of <code>java</code>, parameters named <code>serviceName</code> and
     * <code>javaPackageName</code> are required.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @param stageName
     *        [Required] The name of the <a>Stage</a> that the SDK will use.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @return [Required] The name of the <a>Stage</a> that the SDK will use.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * [Required] The name of the <a>Stage</a> that the SDK will use.
     * </p>
     * 
     * @param stageName
     *        [Required] The name of the <a>Stage</a> that the SDK will use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     * <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and <code>ruby</code> are
     * supported.
     * </p>
     * 
     * @param sdkType
     *        [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     *        <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and
     *        <code>ruby</code> are supported.
     */

    public void setSdkType(String sdkType) {
        this.sdkType = sdkType;
    }

    /**
     * <p>
     * [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     * <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and <code>ruby</code> are
     * supported.
     * </p>
     * 
     * @return [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     *         <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and
     *         <code>ruby</code> are supported.
     */

    public String getSdkType() {
        return this.sdkType;
    }

    /**
     * <p>
     * [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     * <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and <code>ruby</code> are
     * supported.
     * </p>
     * 
     * @param sdkType
     *        [Required] The language for the generated SDK. Currently <code>java</code>, <code>javascript</code>,
     *        <code>android</code>, <code>objectivec</code> (for iOS), <code>swift</code> (for iOS), and
     *        <code>ruby</code> are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSdkRequest withSdkType(String sdkType) {
        setSdkType(sdkType);
        return this;
    }

    /**
     * <p>
     * A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK. For
     * <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named <code>classPrefix</code>
     * is required. For <code>sdkType</code> of <code>android</code>, parameters named <code>groupId</code>,
     * <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are required. For
     * <code>sdkType</code> of <code>java</code>, parameters named <code>serviceName</code> and
     * <code>javaPackageName</code> are required.
     * </p>
     * 
     * @return A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the
     *         SDK. For <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named
     *         <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *         <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *         <code>invokerPackage</code> are required. For <code>sdkType</code> of <code>java</code>, parameters named
     *         <code>serviceName</code> and <code>javaPackageName</code> are required.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK. For
     * <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named <code>classPrefix</code>
     * is required. For <code>sdkType</code> of <code>android</code>, parameters named <code>groupId</code>,
     * <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are required. For
     * <code>sdkType</code> of <code>java</code>, parameters named <code>serviceName</code> and
     * <code>javaPackageName</code> are required.
     * </p>
     * 
     * @param parameters
     *        A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK.
     *        For <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named
     *        <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *        <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *        <code>invokerPackage</code> are required. For <code>sdkType</code> of <code>java</code>, parameters named
     *        <code>serviceName</code> and <code>javaPackageName</code> are required.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK. For
     * <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named <code>classPrefix</code>
     * is required. For <code>sdkType</code> of <code>android</code>, parameters named <code>groupId</code>,
     * <code>artifactId</code>, <code>artifactVersion</code>, and <code>invokerPackage</code> are required. For
     * <code>sdkType</code> of <code>java</code>, parameters named <code>serviceName</code> and
     * <code>javaPackageName</code> are required.
     * </p>
     * 
     * @param parameters
     *        A string-to-string key-value map of query parameters <code>sdkType</code>-dependent properties of the SDK.
     *        For <code>sdkType</code> of <code>objectivec</code> or <code>swift</code>, a parameter named
     *        <code>classPrefix</code> is required. For <code>sdkType</code> of <code>android</code>, parameters named
     *        <code>groupId</code>, <code>artifactId</code>, <code>artifactVersion</code>, and
     *        <code>invokerPackage</code> are required. For <code>sdkType</code> of <code>java</code>, parameters named
     *        <code>serviceName</code> and <code>javaPackageName</code> are required.
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getSdkType() != null)
            sb.append("SdkType: ").append(getSdkType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
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
