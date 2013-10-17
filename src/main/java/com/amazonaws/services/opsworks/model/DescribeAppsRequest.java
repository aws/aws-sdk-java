/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeApps(DescribeAppsRequest) DescribeApps operation}.
 * <p>
 * Requests a description of a specified set of apps.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeApps(DescribeAppsRequest)
 */
public class DescribeAppsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The app stack ID. If you use this parameter, <code>DescribeApps</code>
     * returns a description of the apps in the specified stack.
     */
    private String stackId;

    /**
     * An array of app IDs for the apps to be described. If you use this
     * parameter, <code>DescribeApps</code> returns a description of the
     * specified apps. Otherwise, it returns a description of every app.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> appIds;

    /**
     * The app stack ID. If you use this parameter, <code>DescribeApps</code>
     * returns a description of the apps in the specified stack.
     *
     * @return The app stack ID. If you use this parameter, <code>DescribeApps</code>
     *         returns a description of the apps in the specified stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The app stack ID. If you use this parameter, <code>DescribeApps</code>
     * returns a description of the apps in the specified stack.
     *
     * @param stackId The app stack ID. If you use this parameter, <code>DescribeApps</code>
     *         returns a description of the apps in the specified stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The app stack ID. If you use this parameter, <code>DescribeApps</code>
     * returns a description of the apps in the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The app stack ID. If you use this parameter, <code>DescribeApps</code>
     *         returns a description of the apps in the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAppsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * An array of app IDs for the apps to be described. If you use this
     * parameter, <code>DescribeApps</code> returns a description of the
     * specified apps. Otherwise, it returns a description of every app.
     *
     * @return An array of app IDs for the apps to be described. If you use this
     *         parameter, <code>DescribeApps</code> returns a description of the
     *         specified apps. Otherwise, it returns a description of every app.
     */
    public java.util.List<String> getAppIds() {
        if (appIds == null) {
              appIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              appIds.setAutoConstruct(true);
        }
        return appIds;
    }
    
    /**
     * An array of app IDs for the apps to be described. If you use this
     * parameter, <code>DescribeApps</code> returns a description of the
     * specified apps. Otherwise, it returns a description of every app.
     *
     * @param appIds An array of app IDs for the apps to be described. If you use this
     *         parameter, <code>DescribeApps</code> returns a description of the
     *         specified apps. Otherwise, it returns a description of every app.
     */
    public void setAppIds(java.util.Collection<String> appIds) {
        if (appIds == null) {
            this.appIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> appIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(appIds.size());
        appIdsCopy.addAll(appIds);
        this.appIds = appIdsCopy;
    }
    
    /**
     * An array of app IDs for the apps to be described. If you use this
     * parameter, <code>DescribeApps</code> returns a description of the
     * specified apps. Otherwise, it returns a description of every app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appIds An array of app IDs for the apps to be described. If you use this
     *         parameter, <code>DescribeApps</code> returns a description of the
     *         specified apps. Otherwise, it returns a description of every app.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAppsRequest withAppIds(String... appIds) {
        if (getAppIds() == null) setAppIds(new java.util.ArrayList<String>(appIds.length));
        for (String value : appIds) {
            getAppIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of app IDs for the apps to be described. If you use this
     * parameter, <code>DescribeApps</code> returns a description of the
     * specified apps. Otherwise, it returns a description of every app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appIds An array of app IDs for the apps to be described. If you use this
     *         parameter, <code>DescribeApps</code> returns a description of the
     *         specified apps. Otherwise, it returns a description of every app.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAppsRequest withAppIds(java.util.Collection<String> appIds) {
        if (appIds == null) {
            this.appIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> appIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(appIds.size());
            appIdsCopy.addAll(appIds);
            this.appIds = appIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getAppIds() != null) sb.append("AppIds: " + getAppIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAppsRequest == false) return false;
        DescribeAppsRequest other = (DescribeAppsRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getAppIds() == null ^ this.getAppIds() == null) return false;
        if (other.getAppIds() != null && other.getAppIds().equals(this.getAppIds()) == false) return false; 
        return true;
    }
    
}
    