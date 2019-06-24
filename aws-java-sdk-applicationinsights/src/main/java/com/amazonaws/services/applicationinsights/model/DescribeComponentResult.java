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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeComponent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComponentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ApplicationComponent applicationComponent;
    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     */
    private java.util.List<String> resourceList;

    /**
     * @param applicationComponent
     */

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    /**
     * @return
     */

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

    /**
     * @param applicationComponent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentResult withApplicationComponent(ApplicationComponent applicationComponent) {
        setApplicationComponent(applicationComponent);
        return this;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @return The list of resource ARNs that belong to the component.
     */

    public java.util.List<String> getResourceList() {
        return resourceList;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     */

    public void setResourceList(java.util.Collection<String> resourceList) {
        if (resourceList == null) {
            this.resourceList = null;
            return;
        }

        this.resourceList = new java.util.ArrayList<String>(resourceList);
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceList(java.util.Collection)} or {@link #withResourceList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentResult withResourceList(String... resourceList) {
        if (this.resourceList == null) {
            setResourceList(new java.util.ArrayList<String>(resourceList.length));
        }
        for (String ele : resourceList) {
            this.resourceList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resource ARNs that belong to the component.
     * </p>
     * 
     * @param resourceList
     *        The list of resource ARNs that belong to the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComponentResult withResourceList(java.util.Collection<String> resourceList) {
        setResourceList(resourceList);
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
        if (getApplicationComponent() != null)
            sb.append("ApplicationComponent: ").append(getApplicationComponent()).append(",");
        if (getResourceList() != null)
            sb.append("ResourceList: ").append(getResourceList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComponentResult == false)
            return false;
        DescribeComponentResult other = (DescribeComponentResult) obj;
        if (other.getApplicationComponent() == null ^ this.getApplicationComponent() == null)
            return false;
        if (other.getApplicationComponent() != null && other.getApplicationComponent().equals(this.getApplicationComponent()) == false)
            return false;
        if (other.getResourceList() == null ^ this.getResourceList() == null)
            return false;
        if (other.getResourceList() != null && other.getResourceList().equals(this.getResourceList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationComponent() == null) ? 0 : getApplicationComponent().hashCode());
        hashCode = prime * hashCode + ((getResourceList() == null) ? 0 : getResourceList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComponentResult clone() {
        try {
            return (DescribeComponentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
