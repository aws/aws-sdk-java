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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps in the
     * specified stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code> returns a
     * description of the specified apps. Otherwise, it returns a description of every app.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> appIds;

    /**
     * <p>
     * The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps in the
     * specified stack.
     * </p>
     * 
     * @param stackId
     *        The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps
     *        in the specified stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps in the
     * specified stack.
     * </p>
     * 
     * @return The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps
     *         in the specified stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps in the
     * specified stack.
     * </p>
     * 
     * @param stackId
     *        The app stack ID. If you use this parameter, <code>DescribeApps</code> returns a description of the apps
     *        in the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppsRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code> returns a
     * description of the specified apps. Otherwise, it returns a description of every app.
     * </p>
     * 
     * @return An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code>
     *         returns a description of the specified apps. Otherwise, it returns a description of every app.
     */

    public java.util.List<String> getAppIds() {
        if (appIds == null) {
            appIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return appIds;
    }

    /**
     * <p>
     * An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code> returns a
     * description of the specified apps. Otherwise, it returns a description of every app.
     * </p>
     * 
     * @param appIds
     *        An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code>
     *        returns a description of the specified apps. Otherwise, it returns a description of every app.
     */

    public void setAppIds(java.util.Collection<String> appIds) {
        if (appIds == null) {
            this.appIds = null;
            return;
        }

        this.appIds = new com.amazonaws.internal.SdkInternalList<String>(appIds);
    }

    /**
     * <p>
     * An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code> returns a
     * description of the specified apps. Otherwise, it returns a description of every app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppIds(java.util.Collection)} or {@link #withAppIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param appIds
     *        An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code>
     *        returns a description of the specified apps. Otherwise, it returns a description of every app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppsRequest withAppIds(String... appIds) {
        if (this.appIds == null) {
            setAppIds(new com.amazonaws.internal.SdkInternalList<String>(appIds.length));
        }
        for (String ele : appIds) {
            this.appIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code> returns a
     * description of the specified apps. Otherwise, it returns a description of every app.
     * </p>
     * 
     * @param appIds
     *        An array of app IDs for the apps to be described. If you use this parameter, <code>DescribeApps</code>
     *        returns a description of the specified apps. Otherwise, it returns a description of every app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppsRequest withAppIds(java.util.Collection<String> appIds) {
        setAppIds(appIds);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getAppIds() != null)
            sb.append("AppIds: ").append(getAppIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppsRequest == false)
            return false;
        DescribeAppsRequest other = (DescribeAppsRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getAppIds() == null ^ this.getAppIds() == null)
            return false;
        if (other.getAppIds() != null && other.getAppIds().equals(this.getAppIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getAppIds() == null) ? 0 : getAppIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppsRequest clone() {
        return (DescribeAppsRequest) super.clone();
    }

}
