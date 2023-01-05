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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing all the configuration information for the app monitor.
     * </p>
     */
    private AppMonitor appMonitor;

    /**
     * <p>
     * A structure containing all the configuration information for the app monitor.
     * </p>
     * 
     * @param appMonitor
     *        A structure containing all the configuration information for the app monitor.
     */

    public void setAppMonitor(AppMonitor appMonitor) {
        this.appMonitor = appMonitor;
    }

    /**
     * <p>
     * A structure containing all the configuration information for the app monitor.
     * </p>
     * 
     * @return A structure containing all the configuration information for the app monitor.
     */

    public AppMonitor getAppMonitor() {
        return this.appMonitor;
    }

    /**
     * <p>
     * A structure containing all the configuration information for the app monitor.
     * </p>
     * 
     * @param appMonitor
     *        A structure containing all the configuration information for the app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorResult withAppMonitor(AppMonitor appMonitor) {
        setAppMonitor(appMonitor);
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
        if (getAppMonitor() != null)
            sb.append("AppMonitor: ").append(getAppMonitor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppMonitorResult == false)
            return false;
        GetAppMonitorResult other = (GetAppMonitorResult) obj;
        if (other.getAppMonitor() == null ^ this.getAppMonitor() == null)
            return false;
        if (other.getAppMonitor() != null && other.getAppMonitor().equals(this.getAppMonitor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitor() == null) ? 0 : getAppMonitor().hashCode());
        return hashCode;
    }

    @Override
    public GetAppMonitorResult clone() {
        try {
            return (GetAppMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
