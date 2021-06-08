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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSipMediaApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Region assigned to the SIP media application.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The SIP media application name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one
     * endpoint is supported.
     * </p>
     */
    private java.util.List<SipMediaApplicationEndpoint> endpoints;

    /**
     * <p>
     * The AWS Region assigned to the SIP media application.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region assigned to the SIP media application.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The AWS Region assigned to the SIP media application.
     * </p>
     * 
     * @return The AWS Region assigned to the SIP media application.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The AWS Region assigned to the SIP media application.
     * </p>
     * 
     * @param awsRegion
     *        The AWS Region assigned to the SIP media application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The SIP media application name.
     * </p>
     * 
     * @param name
     *        The SIP media application name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The SIP media application name.
     * </p>
     * 
     * @return The SIP media application name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The SIP media application name.
     * </p>
     * 
     * @param name
     *        The SIP media application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one
     * endpoint is supported.
     * </p>
     * 
     * @return List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only
     *         one endpoint is supported.
     */

    public java.util.List<SipMediaApplicationEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one
     * endpoint is supported.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only
     *        one endpoint is supported.
     */

    public void setEndpoints(java.util.Collection<SipMediaApplicationEndpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<SipMediaApplicationEndpoint>(endpoints);
    }

    /**
     * <p>
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one
     * endpoint is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only
     *        one endpoint is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationRequest withEndpoints(SipMediaApplicationEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<SipMediaApplicationEndpoint>(endpoints.length));
        }
        for (SipMediaApplicationEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one
     * endpoint is supported.
     * </p>
     * 
     * @param endpoints
     *        List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only
     *        one endpoint is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSipMediaApplicationRequest withEndpoints(java.util.Collection<SipMediaApplicationEndpoint> endpoints) {
        setEndpoints(endpoints);
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
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSipMediaApplicationRequest == false)
            return false;
        CreateSipMediaApplicationRequest other = (CreateSipMediaApplicationRequest) obj;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public CreateSipMediaApplicationRequest clone() {
        return (CreateSipMediaApplicationRequest) super.clone();
    }

}
