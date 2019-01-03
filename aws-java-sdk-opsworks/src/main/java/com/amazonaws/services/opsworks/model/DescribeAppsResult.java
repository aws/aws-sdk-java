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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeApps</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>App</code> objects that describe the specified apps.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<App> apps;

    /**
     * <p>
     * An array of <code>App</code> objects that describe the specified apps.
     * </p>
     * 
     * @return An array of <code>App</code> objects that describe the specified apps.
     */

    public java.util.List<App> getApps() {
        if (apps == null) {
            apps = new com.amazonaws.internal.SdkInternalList<App>();
        }
        return apps;
    }

    /**
     * <p>
     * An array of <code>App</code> objects that describe the specified apps.
     * </p>
     * 
     * @param apps
     *        An array of <code>App</code> objects that describe the specified apps.
     */

    public void setApps(java.util.Collection<App> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }

        this.apps = new com.amazonaws.internal.SdkInternalList<App>(apps);
    }

    /**
     * <p>
     * An array of <code>App</code> objects that describe the specified apps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApps(java.util.Collection)} or {@link #withApps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param apps
     *        An array of <code>App</code> objects that describe the specified apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppsResult withApps(App... apps) {
        if (this.apps == null) {
            setApps(new com.amazonaws.internal.SdkInternalList<App>(apps.length));
        }
        for (App ele : apps) {
            this.apps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>App</code> objects that describe the specified apps.
     * </p>
     * 
     * @param apps
     *        An array of <code>App</code> objects that describe the specified apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppsResult withApps(java.util.Collection<App> apps) {
        setApps(apps);
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
        if (getApps() != null)
            sb.append("Apps: ").append(getApps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppsResult == false)
            return false;
        DescribeAppsResult other = (DescribeAppsResult) obj;
        if (other.getApps() == null ^ this.getApps() == null)
            return false;
        if (other.getApps() != null && other.getApps().equals(this.getApps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApps() == null) ? 0 : getApps().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppsResult clone() {
        try {
            return (DescribeAppsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
