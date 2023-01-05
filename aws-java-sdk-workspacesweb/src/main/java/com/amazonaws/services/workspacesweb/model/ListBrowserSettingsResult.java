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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListBrowserSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBrowserSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The browser settings.
     * </p>
     */
    private java.util.List<BrowserSettingsSummary> browserSettings;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The browser settings.
     * </p>
     * 
     * @return The browser settings.
     */

    public java.util.List<BrowserSettingsSummary> getBrowserSettings() {
        return browserSettings;
    }

    /**
     * <p>
     * The browser settings.
     * </p>
     * 
     * @param browserSettings
     *        The browser settings.
     */

    public void setBrowserSettings(java.util.Collection<BrowserSettingsSummary> browserSettings) {
        if (browserSettings == null) {
            this.browserSettings = null;
            return;
        }

        this.browserSettings = new java.util.ArrayList<BrowserSettingsSummary>(browserSettings);
    }

    /**
     * <p>
     * The browser settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBrowserSettings(java.util.Collection)} or {@link #withBrowserSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param browserSettings
     *        The browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBrowserSettingsResult withBrowserSettings(BrowserSettingsSummary... browserSettings) {
        if (this.browserSettings == null) {
            setBrowserSettings(new java.util.ArrayList<BrowserSettingsSummary>(browserSettings.length));
        }
        for (BrowserSettingsSummary ele : browserSettings) {
            this.browserSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The browser settings.
     * </p>
     * 
     * @param browserSettings
     *        The browser settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBrowserSettingsResult withBrowserSettings(java.util.Collection<BrowserSettingsSummary> browserSettings) {
        setBrowserSettings(browserSettings);
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

    public ListBrowserSettingsResult withNextToken(String nextToken) {
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
        if (getBrowserSettings() != null)
            sb.append("BrowserSettings: ").append(getBrowserSettings()).append(",");
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

        if (obj instanceof ListBrowserSettingsResult == false)
            return false;
        ListBrowserSettingsResult other = (ListBrowserSettingsResult) obj;
        if (other.getBrowserSettings() == null ^ this.getBrowserSettings() == null)
            return false;
        if (other.getBrowserSettings() != null && other.getBrowserSettings().equals(this.getBrowserSettings()) == false)
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

        hashCode = prime * hashCode + ((getBrowserSettings() == null) ? 0 : getBrowserSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBrowserSettingsResult clone() {
        try {
            return (ListBrowserSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
