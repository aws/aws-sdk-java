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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a site plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/SitePlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SitePlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options of the plan.
     * </p>
     */
    private java.util.List<NameValuePair> options;
    /**
     * <p>
     * The resource definitions of the plan.
     * </p>
     */
    private java.util.List<NetworkResourceDefinition> resourceDefinitions;

    /**
     * <p>
     * The options of the plan.
     * </p>
     * 
     * @return The options of the plan.
     */

    public java.util.List<NameValuePair> getOptions() {
        return options;
    }

    /**
     * <p>
     * The options of the plan.
     * </p>
     * 
     * @param options
     *        The options of the plan.
     */

    public void setOptions(java.util.Collection<NameValuePair> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<NameValuePair>(options);
    }

    /**
     * <p>
     * The options of the plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        The options of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SitePlan withOptions(NameValuePair... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<NameValuePair>(options.length));
        }
        for (NameValuePair ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The options of the plan.
     * </p>
     * 
     * @param options
     *        The options of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SitePlan withOptions(java.util.Collection<NameValuePair> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The resource definitions of the plan.
     * </p>
     * 
     * @return The resource definitions of the plan.
     */

    public java.util.List<NetworkResourceDefinition> getResourceDefinitions() {
        return resourceDefinitions;
    }

    /**
     * <p>
     * The resource definitions of the plan.
     * </p>
     * 
     * @param resourceDefinitions
     *        The resource definitions of the plan.
     */

    public void setResourceDefinitions(java.util.Collection<NetworkResourceDefinition> resourceDefinitions) {
        if (resourceDefinitions == null) {
            this.resourceDefinitions = null;
            return;
        }

        this.resourceDefinitions = new java.util.ArrayList<NetworkResourceDefinition>(resourceDefinitions);
    }

    /**
     * <p>
     * The resource definitions of the plan.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceDefinitions(java.util.Collection)} or {@link #withResourceDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resourceDefinitions
     *        The resource definitions of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SitePlan withResourceDefinitions(NetworkResourceDefinition... resourceDefinitions) {
        if (this.resourceDefinitions == null) {
            setResourceDefinitions(new java.util.ArrayList<NetworkResourceDefinition>(resourceDefinitions.length));
        }
        for (NetworkResourceDefinition ele : resourceDefinitions) {
            this.resourceDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource definitions of the plan.
     * </p>
     * 
     * @param resourceDefinitions
     *        The resource definitions of the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SitePlan withResourceDefinitions(java.util.Collection<NetworkResourceDefinition> resourceDefinitions) {
        setResourceDefinitions(resourceDefinitions);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getResourceDefinitions() != null)
            sb.append("ResourceDefinitions: ").append(getResourceDefinitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SitePlan == false)
            return false;
        SitePlan other = (SitePlan) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getResourceDefinitions() == null ^ this.getResourceDefinitions() == null)
            return false;
        if (other.getResourceDefinitions() != null && other.getResourceDefinitions().equals(this.getResourceDefinitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getResourceDefinitions() == null) ? 0 : getResourceDefinitions().hashCode());
        return hashCode;
    }

    @Override
    public SitePlan clone() {
        try {
            return (SitePlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.SitePlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
