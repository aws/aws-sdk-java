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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one link attached to this monitoring account sink.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListAttachedLinksItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttachedLinksItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The label that was assigned to this link at creation, with the variables resolved to their actual values.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The ARN of the link.
     * </p>
     */
    private String linkArn;
    /**
     * <p>
     * The resource types supported by this link.
     * </p>
     */
    private java.util.List<String> resourceTypes;

    /**
     * <p>
     * The label that was assigned to this link at creation, with the variables resolved to their actual values.
     * </p>
     * 
     * @param label
     *        The label that was assigned to this link at creation, with the variables resolved to their actual values.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label that was assigned to this link at creation, with the variables resolved to their actual values.
     * </p>
     * 
     * @return The label that was assigned to this link at creation, with the variables resolved to their actual values.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label that was assigned to this link at creation, with the variables resolved to their actual values.
     * </p>
     * 
     * @param label
     *        The label that was assigned to this link at creation, with the variables resolved to their actual values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksItem withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The ARN of the link.
     * </p>
     * 
     * @param linkArn
     *        The ARN of the link.
     */

    public void setLinkArn(String linkArn) {
        this.linkArn = linkArn;
    }

    /**
     * <p>
     * The ARN of the link.
     * </p>
     * 
     * @return The ARN of the link.
     */

    public String getLinkArn() {
        return this.linkArn;
    }

    /**
     * <p>
     * The ARN of the link.
     * </p>
     * 
     * @param linkArn
     *        The ARN of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksItem withLinkArn(String linkArn) {
        setLinkArn(linkArn);
        return this;
    }

    /**
     * <p>
     * The resource types supported by this link.
     * </p>
     * 
     * @return The resource types supported by this link.
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource types supported by this link.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types supported by this link.
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
     * The resource types supported by this link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types supported by this link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksItem withResourceTypes(String... resourceTypes) {
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
     * The resource types supported by this link.
     * </p>
     * 
     * @param resourceTypes
     *        The resource types supported by this link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttachedLinksItem withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getLinkArn() != null)
            sb.append("LinkArn: ").append(getLinkArn()).append(",");
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

        if (obj instanceof ListAttachedLinksItem == false)
            return false;
        ListAttachedLinksItem other = (ListAttachedLinksItem) obj;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getLinkArn() == null ^ this.getLinkArn() == null)
            return false;
        if (other.getLinkArn() != null && other.getLinkArn().equals(this.getLinkArn()) == false)
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

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getLinkArn() == null) ? 0 : getLinkArn().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public ListAttachedLinksItem clone() {
        try {
            return (ListAttachedLinksItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.oam.model.transform.ListAttachedLinksItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
