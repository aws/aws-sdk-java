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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/GetBrowserSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBrowserSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The browser settings.
     * </p>
     */
    private BrowserSettings browserSettings;

    /**
     * <p>
     * The browser settings.
     * </p>
     * 
     * @param browserSettings
     *        The browser settings.
     */

    public void setBrowserSettings(BrowserSettings browserSettings) {
        this.browserSettings = browserSettings;
    }

    /**
     * <p>
     * The browser settings.
     * </p>
     * 
     * @return The browser settings.
     */

    public BrowserSettings getBrowserSettings() {
        return this.browserSettings;
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

    public GetBrowserSettingsResult withBrowserSettings(BrowserSettings browserSettings) {
        setBrowserSettings(browserSettings);
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
            sb.append("BrowserSettings: ").append(getBrowserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBrowserSettingsResult == false)
            return false;
        GetBrowserSettingsResult other = (GetBrowserSettingsResult) obj;
        if (other.getBrowserSettings() == null ^ this.getBrowserSettings() == null)
            return false;
        if (other.getBrowserSettings() != null && other.getBrowserSettings().equals(this.getBrowserSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrowserSettings() == null) ? 0 : getBrowserSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetBrowserSettingsResult clone() {
        try {
            return (GetBrowserSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
