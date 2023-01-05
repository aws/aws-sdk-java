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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UpdateLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the link that you want to update.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The ARN of the link that you want to update.
     * </p>
     * 
     * @param identifier
     *        The ARN of the link that you want to update.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ARN of the link that you want to update.
     * </p>
     * 
     * @return The ARN of the link that you want to update.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ARN of the link that you want to update.
     * </p>
     * 
     * @param identifier
     *        The ARN of the link that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLinkRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     * 
     * @return An array of strings that define which types of data that the source account will send to the monitoring
     *         account.</p>
     *         <p>
     *         Your input here replaces the current set of data types that are shared.
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account will send to the monitoring
     *        account.</p>
     *        <p>
     *        Your input here replaces the current set of data types that are shared.
     * @see ResourceType
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
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account will send to the monitoring
     *        account.</p>
     *        <p>
     *        Your input here replaces the current set of data types that are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public UpdateLinkRequest withResourceTypes(String... resourceTypes) {
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
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account will send to the monitoring
     *        account.</p>
     *        <p>
     *        Your input here replaces the current set of data types that are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public UpdateLinkRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account will send to the monitoring account.
     * </p>
     * <p>
     * Your input here replaces the current set of data types that are shared.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account will send to the monitoring
     *        account.</p>
     *        <p>
     *        Your input here replaces the current set of data types that are shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public UpdateLinkRequest withResourceTypes(ResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
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

        if (obj instanceof UpdateLinkRequest == false)
            return false;
        UpdateLinkRequest other = (UpdateLinkRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLinkRequest clone() {
        return (UpdateLinkRequest) super.clone();
    }

}
