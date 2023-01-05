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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListNetworkSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The network settings.
     * </p>
     */
    private java.util.List<NetworkSettingsSummary> networkSettings;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The network settings.
     * </p>
     * 
     * @return The network settings.
     */

    public java.util.List<NetworkSettingsSummary> getNetworkSettings() {
        return networkSettings;
    }

    /**
     * <p>
     * The network settings.
     * </p>
     * 
     * @param networkSettings
     *        The network settings.
     */

    public void setNetworkSettings(java.util.Collection<NetworkSettingsSummary> networkSettings) {
        if (networkSettings == null) {
            this.networkSettings = null;
            return;
        }

        this.networkSettings = new java.util.ArrayList<NetworkSettingsSummary>(networkSettings);
    }

    /**
     * <p>
     * The network settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkSettings(java.util.Collection)} or {@link #withNetworkSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkSettings
     *        The network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkSettingsResult withNetworkSettings(NetworkSettingsSummary... networkSettings) {
        if (this.networkSettings == null) {
            setNetworkSettings(new java.util.ArrayList<NetworkSettingsSummary>(networkSettings.length));
        }
        for (NetworkSettingsSummary ele : networkSettings) {
            this.networkSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network settings.
     * </p>
     * 
     * @param networkSettings
     *        The network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkSettingsResult withNetworkSettings(java.util.Collection<NetworkSettingsSummary> networkSettings) {
        setNetworkSettings(networkSettings);
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

    public ListNetworkSettingsResult withNextToken(String nextToken) {
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
        if (getNetworkSettings() != null)
            sb.append("NetworkSettings: ").append(getNetworkSettings()).append(",");
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

        if (obj instanceof ListNetworkSettingsResult == false)
            return false;
        ListNetworkSettingsResult other = (ListNetworkSettingsResult) obj;
        if (other.getNetworkSettings() == null ^ this.getNetworkSettings() == null)
            return false;
        if (other.getNetworkSettings() != null && other.getNetworkSettings().equals(this.getNetworkSettings()) == false)
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

        hashCode = prime * hashCode + ((getNetworkSettings() == null) ? 0 : getNetworkSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkSettingsResult clone() {
        try {
            return (ListNetworkSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
