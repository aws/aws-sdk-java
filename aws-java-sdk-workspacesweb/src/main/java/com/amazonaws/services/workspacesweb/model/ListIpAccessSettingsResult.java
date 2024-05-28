/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListIpAccessSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIpAccessSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IP access settings.
     * </p>
     */
    private java.util.List<IpAccessSettingsSummary> ipAccessSettings;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @return The IP access settings.
     */

    public java.util.List<IpAccessSettingsSummary> getIpAccessSettings() {
        return ipAccessSettings;
    }

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @param ipAccessSettings
     *        The IP access settings.
     */

    public void setIpAccessSettings(java.util.Collection<IpAccessSettingsSummary> ipAccessSettings) {
        if (ipAccessSettings == null) {
            this.ipAccessSettings = null;
            return;
        }

        this.ipAccessSettings = new java.util.ArrayList<IpAccessSettingsSummary>(ipAccessSettings);
    }

    /**
     * <p>
     * The IP access settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAccessSettings(java.util.Collection)} or {@link #withIpAccessSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ipAccessSettings
     *        The IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpAccessSettingsResult withIpAccessSettings(IpAccessSettingsSummary... ipAccessSettings) {
        if (this.ipAccessSettings == null) {
            setIpAccessSettings(new java.util.ArrayList<IpAccessSettingsSummary>(ipAccessSettings.length));
        }
        for (IpAccessSettingsSummary ele : ipAccessSettings) {
            this.ipAccessSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP access settings.
     * </p>
     * 
     * @param ipAccessSettings
     *        The IP access settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpAccessSettingsResult withIpAccessSettings(java.util.Collection<IpAccessSettingsSummary> ipAccessSettings) {
        setIpAccessSettings(ipAccessSettings);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpAccessSettingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getIpAccessSettings() != null)
            sb.append("IpAccessSettings: ").append(getIpAccessSettings()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIpAccessSettingsResult == false)
            return false;
        ListIpAccessSettingsResult other = (ListIpAccessSettingsResult) obj;
        if (other.getIpAccessSettings() == null ^ this.getIpAccessSettings() == null)
            return false;
        if (other.getIpAccessSettings() != null && other.getIpAccessSettings().equals(this.getIpAccessSettings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpAccessSettings() == null) ? 0 : getIpAccessSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIpAccessSettingsResult clone() {
        try {
            return (ListIpAccessSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
