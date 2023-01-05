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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Disable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of account IDs you want to disable Amazon Inspector scans for.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * An array of account IDs you want to disable Amazon Inspector scans for.
     * </p>
     * 
     * @return An array of account IDs you want to disable Amazon Inspector scans for.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * An array of account IDs you want to disable Amazon Inspector scans for.
     * </p>
     * 
     * @param accountIds
     *        An array of account IDs you want to disable Amazon Inspector scans for.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * An array of account IDs you want to disable Amazon Inspector scans for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        An array of account IDs you want to disable Amazon Inspector scans for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of account IDs you want to disable Amazon Inspector scans for.
     * </p>
     * 
     * @param accountIds
     *        An array of account IDs you want to disable Amazon Inspector scans for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     * 
     * @return The resource scan types you want to disable.
     * @see ResourceScanType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     * 
     * @param resourceTypes
     *        The resource scan types you want to disable.
     * @see ResourceScanType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource scan types you want to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanType
     */

    public DisableRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     * 
     * @param resourceTypes
     *        The resource scan types you want to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanType
     */

    public DisableRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource scan types you want to disable.
     * </p>
     * 
     * @param resourceTypes
     *        The resource scan types you want to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceScanType
     */

    public DisableRequest withResourceTypes(ResourceScanType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceScanType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableRequest == false)
            return false;
        DisableRequest other = (DisableRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public DisableRequest clone() {
        return (DisableRequest) super.clone();
    }

}
