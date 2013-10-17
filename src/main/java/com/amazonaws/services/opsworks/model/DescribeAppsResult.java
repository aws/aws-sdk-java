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


/**
 * <p>
 * Contains the response to a <code>DescribeApps</code> request.
 * </p>
 */
public class DescribeAppsResult implements Serializable {

    /**
     * An array of <code>App</code> objects that describe the specified apps.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<App> apps;

    /**
     * An array of <code>App</code> objects that describe the specified apps.
     *
     * @return An array of <code>App</code> objects that describe the specified apps.
     */
    public java.util.List<App> getApps() {
        if (apps == null) {
              apps = new com.amazonaws.internal.ListWithAutoConstructFlag<App>();
              apps.setAutoConstruct(true);
        }
        return apps;
    }
    
    /**
     * An array of <code>App</code> objects that describe the specified apps.
     *
     * @param apps An array of <code>App</code> objects that describe the specified apps.
     */
    public void setApps(java.util.Collection<App> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<App> appsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<App>(apps.size());
        appsCopy.addAll(apps);
        this.apps = appsCopy;
    }
    
    /**
     * An array of <code>App</code> objects that describe the specified apps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param apps An array of <code>App</code> objects that describe the specified apps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAppsResult withApps(App... apps) {
        if (getApps() == null) setApps(new java.util.ArrayList<App>(apps.length));
        for (App value : apps) {
            getApps().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>App</code> objects that describe the specified apps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param apps An array of <code>App</code> objects that describe the specified apps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAppsResult withApps(java.util.Collection<App> apps) {
        if (apps == null) {
            this.apps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<App> appsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<App>(apps.size());
            appsCopy.addAll(apps);
            this.apps = appsCopy;
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
        if (getApps() != null) sb.append("Apps: " + getApps() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApps() == null) ? 0 : getApps().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAppsResult == false) return false;
        DescribeAppsResult other = (DescribeAppsResult)obj;
        
        if (other.getApps() == null ^ this.getApps() == null) return false;
        if (other.getApps() != null && other.getApps().equals(this.getApps()) == false) return false; 
        return true;
    }
    
}
    