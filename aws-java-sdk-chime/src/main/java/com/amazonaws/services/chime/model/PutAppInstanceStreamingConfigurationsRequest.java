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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceStreamingConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAppInstanceStreamingConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     */
    private String appInstanceArn;
    /**
     * <p>
     * The streaming configurations set for an <code>AppInstance</code>.
     * </p>
     */
    private java.util.List<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     */

    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstance</code>.
     */

    public String getAppInstanceArn() {
        return this.appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceArn
     *        The ARN of the <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceStreamingConfigurationsRequest withAppInstanceArn(String appInstanceArn) {
        setAppInstanceArn(appInstanceArn);
        return this;
    }

    /**
     * <p>
     * The streaming configurations set for an <code>AppInstance</code>.
     * </p>
     * 
     * @return The streaming configurations set for an <code>AppInstance</code>.
     */

    public java.util.List<AppInstanceStreamingConfiguration> getAppInstanceStreamingConfigurations() {
        return appInstanceStreamingConfigurations;
    }

    /**
     * <p>
     * The streaming configurations set for an <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming configurations set for an <code>AppInstance</code>.
     */

    public void setAppInstanceStreamingConfigurations(java.util.Collection<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations) {
        if (appInstanceStreamingConfigurations == null) {
            this.appInstanceStreamingConfigurations = null;
            return;
        }

        this.appInstanceStreamingConfigurations = new java.util.ArrayList<AppInstanceStreamingConfiguration>(appInstanceStreamingConfigurations);
    }

    /**
     * <p>
     * The streaming configurations set for an <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInstanceStreamingConfigurations(java.util.Collection)} or
     * {@link #withAppInstanceStreamingConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming configurations set for an <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceStreamingConfigurationsRequest withAppInstanceStreamingConfigurations(
            AppInstanceStreamingConfiguration... appInstanceStreamingConfigurations) {
        if (this.appInstanceStreamingConfigurations == null) {
            setAppInstanceStreamingConfigurations(new java.util.ArrayList<AppInstanceStreamingConfiguration>(appInstanceStreamingConfigurations.length));
        }
        for (AppInstanceStreamingConfiguration ele : appInstanceStreamingConfigurations) {
            this.appInstanceStreamingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The streaming configurations set for an <code>AppInstance</code>.
     * </p>
     * 
     * @param appInstanceStreamingConfigurations
     *        The streaming configurations set for an <code>AppInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAppInstanceStreamingConfigurationsRequest withAppInstanceStreamingConfigurations(
            java.util.Collection<AppInstanceStreamingConfiguration> appInstanceStreamingConfigurations) {
        setAppInstanceStreamingConfigurations(appInstanceStreamingConfigurations);
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: ").append(getAppInstanceArn()).append(",");
        if (getAppInstanceStreamingConfigurations() != null)
            sb.append("AppInstanceStreamingConfigurations: ").append(getAppInstanceStreamingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceStreamingConfigurationsRequest == false)
            return false;
        PutAppInstanceStreamingConfigurationsRequest other = (PutAppInstanceStreamingConfigurationsRequest) obj;
        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceStreamingConfigurations() == null ^ this.getAppInstanceStreamingConfigurations() == null)
            return false;
        if (other.getAppInstanceStreamingConfigurations() != null
                && other.getAppInstanceStreamingConfigurations().equals(this.getAppInstanceStreamingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getAppInstanceStreamingConfigurations() == null) ? 0 : getAppInstanceStreamingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PutAppInstanceStreamingConfigurationsRequest clone() {
        return (PutAppInstanceStreamingConfigurationsRequest) super.clone();
    }

}
