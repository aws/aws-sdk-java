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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the status of the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ApplicationInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource group used for the application.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The lifecycle of the application.
     * </p>
     */
    private String lifeCycle;
    /**
     * <p>
     * The issues on the user side that are blocking Application Insights from fully monitoring the application.
     * </p>
     */
    private String remarks;

    /**
     * <p>
     * The name of the resource group used for the application.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group used for the application.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group used for the application.
     * </p>
     * 
     * @return The name of the resource group used for the application.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group used for the application.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group used for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The lifecycle of the application.
     * </p>
     * 
     * @param lifeCycle
     *        The lifecycle of the application.
     */

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    /**
     * <p>
     * The lifecycle of the application.
     * </p>
     * 
     * @return The lifecycle of the application.
     */

    public String getLifeCycle() {
        return this.lifeCycle;
    }

    /**
     * <p>
     * The lifecycle of the application.
     * </p>
     * 
     * @param lifeCycle
     *        The lifecycle of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withLifeCycle(String lifeCycle) {
        setLifeCycle(lifeCycle);
        return this;
    }

    /**
     * <p>
     * The issues on the user side that are blocking Application Insights from fully monitoring the application.
     * </p>
     * 
     * @param remarks
     *        The issues on the user side that are blocking Application Insights from fully monitoring the application.
     */

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * <p>
     * The issues on the user side that are blocking Application Insights from fully monitoring the application.
     * </p>
     * 
     * @return The issues on the user side that are blocking Application Insights from fully monitoring the application.
     */

    public String getRemarks() {
        return this.remarks;
    }

    /**
     * <p>
     * The issues on the user side that are blocking Application Insights from fully monitoring the application.
     * </p>
     * 
     * @param remarks
     *        The issues on the user side that are blocking Application Insights from fully monitoring the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationInfo withRemarks(String remarks) {
        setRemarks(remarks);
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getLifeCycle() != null)
            sb.append("LifeCycle: ").append(getLifeCycle()).append(",");
        if (getRemarks() != null)
            sb.append("Remarks: ").append(getRemarks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationInfo == false)
            return false;
        ApplicationInfo other = (ApplicationInfo) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getLifeCycle() == null ^ this.getLifeCycle() == null)
            return false;
        if (other.getLifeCycle() != null && other.getLifeCycle().equals(this.getLifeCycle()) == false)
            return false;
        if (other.getRemarks() == null ^ this.getRemarks() == null)
            return false;
        if (other.getRemarks() != null && other.getRemarks().equals(this.getRemarks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getLifeCycle() == null) ? 0 : getLifeCycle().hashCode());
        hashCode = prime * hashCode + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationInfo clone() {
        try {
            return (ApplicationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.ApplicationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
