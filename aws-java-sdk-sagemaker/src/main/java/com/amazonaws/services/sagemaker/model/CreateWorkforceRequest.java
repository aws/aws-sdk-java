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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkforce" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkforceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using
     * and corresponds to a single <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon Cognito
     * user pool</a>.
     * </p>
     * <p>
     * Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     * </p>
     */
    private CognitoConfig cognitoConfig;
    /**
     * <p>
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider.
     * </p>
     * <p>
     * Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     * </p>
     */
    private OidcConfig oidcConfig;

    private SourceIpConfig sourceIpConfig;
    /**
     * <p>
     * The name of the private workforce.
     * </p>
     */
    private String workforceName;
    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using
     * and corresponds to a single <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon Cognito
     * user pool</a>.
     * </p>
     * <p>
     * Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     * </p>
     * 
     * @param cognitoConfig
     *        Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created
     *        using and corresponds to a single <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *        Cognito user pool</a>.</p>
     *        <p>
     *        Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     */

    public void setCognitoConfig(CognitoConfig cognitoConfig) {
        this.cognitoConfig = cognitoConfig;
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using
     * and corresponds to a single <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon Cognito
     * user pool</a>.
     * </p>
     * <p>
     * Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     * </p>
     * 
     * @return Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is
     *         created using and corresponds to a single <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *         Cognito user pool</a>.</p>
     *         <p>
     *         Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     */

    public CognitoConfig getCognitoConfig() {
        return this.cognitoConfig;
    }

    /**
     * <p>
     * Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created using
     * and corresponds to a single <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon Cognito
     * user pool</a>.
     * </p>
     * <p>
     * Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     * </p>
     * 
     * @param cognitoConfig
     *        Use this parameter to configure an Amazon Cognito private workforce. A single Cognito workforce is created
     *        using and corresponds to a single <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html"> Amazon
     *        Cognito user pool</a>.</p>
     *        <p>
     *        Do not use <code>OidcConfig</code> if you specify values for <code>CognitoConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withCognitoConfig(CognitoConfig cognitoConfig) {
        setCognitoConfig(cognitoConfig);
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider.
     * </p>
     * <p>
     * Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     * </p>
     * 
     * @param oidcConfig
     *        Use this parameter to configure a private workforce using your own OIDC Identity Provider.</p>
     *        <p>
     *        Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     */

    public void setOidcConfig(OidcConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    /**
     * <p>
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider.
     * </p>
     * <p>
     * Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     * </p>
     * 
     * @return Use this parameter to configure a private workforce using your own OIDC Identity Provider.</p>
     *         <p>
     *         Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     */

    public OidcConfig getOidcConfig() {
        return this.oidcConfig;
    }

    /**
     * <p>
     * Use this parameter to configure a private workforce using your own OIDC Identity Provider.
     * </p>
     * <p>
     * Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     * </p>
     * 
     * @param oidcConfig
     *        Use this parameter to configure a private workforce using your own OIDC Identity Provider.</p>
     *        <p>
     *        Do not use <code>CognitoConfig</code> if you specify values for <code>OidcConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withOidcConfig(OidcConfig oidcConfig) {
        setOidcConfig(oidcConfig);
        return this;
    }

    /**
     * @param sourceIpConfig
     */

    public void setSourceIpConfig(SourceIpConfig sourceIpConfig) {
        this.sourceIpConfig = sourceIpConfig;
    }

    /**
     * @return
     */

    public SourceIpConfig getSourceIpConfig() {
        return this.sourceIpConfig;
    }

    /**
     * @param sourceIpConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withSourceIpConfig(SourceIpConfig sourceIpConfig) {
        setSourceIpConfig(sourceIpConfig);
        return this;
    }

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce.
     */

    public void setWorkforceName(String workforceName) {
        this.workforceName = workforceName;
    }

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @return The name of the private workforce.
     */

    public String getWorkforceName() {
        return this.workforceName;
    }

    /**
     * <p>
     * The name of the private workforce.
     * </p>
     * 
     * @param workforceName
     *        The name of the private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withWorkforceName(String workforceName) {
        setWorkforceName(workforceName);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @return An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each
     *         tag consists of a key and a value, both of which you define.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each
     *        tag consists of a key and a value, both of which you define.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each
     *        tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each tag
     * consists of a key and a value, both of which you define.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs that contain metadata to help you categorize and organize our workforce. Each
     *        tag consists of a key and a value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkforceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCognitoConfig() != null)
            sb.append("CognitoConfig: ").append(getCognitoConfig()).append(",");
        if (getOidcConfig() != null)
            sb.append("OidcConfig: ").append(getOidcConfig()).append(",");
        if (getSourceIpConfig() != null)
            sb.append("SourceIpConfig: ").append(getSourceIpConfig()).append(",");
        if (getWorkforceName() != null)
            sb.append("WorkforceName: ").append(getWorkforceName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkforceRequest == false)
            return false;
        CreateWorkforceRequest other = (CreateWorkforceRequest) obj;
        if (other.getCognitoConfig() == null ^ this.getCognitoConfig() == null)
            return false;
        if (other.getCognitoConfig() != null && other.getCognitoConfig().equals(this.getCognitoConfig()) == false)
            return false;
        if (other.getOidcConfig() == null ^ this.getOidcConfig() == null)
            return false;
        if (other.getOidcConfig() != null && other.getOidcConfig().equals(this.getOidcConfig()) == false)
            return false;
        if (other.getSourceIpConfig() == null ^ this.getSourceIpConfig() == null)
            return false;
        if (other.getSourceIpConfig() != null && other.getSourceIpConfig().equals(this.getSourceIpConfig()) == false)
            return false;
        if (other.getWorkforceName() == null ^ this.getWorkforceName() == null)
            return false;
        if (other.getWorkforceName() != null && other.getWorkforceName().equals(this.getWorkforceName()) == false)
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

        hashCode = prime * hashCode + ((getCognitoConfig() == null) ? 0 : getCognitoConfig().hashCode());
        hashCode = prime * hashCode + ((getOidcConfig() == null) ? 0 : getOidcConfig().hashCode());
        hashCode = prime * hashCode + ((getSourceIpConfig() == null) ? 0 : getSourceIpConfig().hashCode());
        hashCode = prime * hashCode + ((getWorkforceName() == null) ? 0 : getWorkforceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkforceRequest clone() {
        return (CreateWorkforceRequest) super.clone();
    }

}
