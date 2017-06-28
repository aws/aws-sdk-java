/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DisassociateTagOptionFromResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTagOptionFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the resource from which to disassociate the TagOption.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Identifier of the TagOption to disassociate from the resource.
     * </p>
     */
    private String tagOptionId;

    /**
     * <p>
     * Identifier of the resource from which to disassociate the TagOption.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource from which to disassociate the TagOption.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Identifier of the resource from which to disassociate the TagOption.
     * </p>
     * 
     * @return Identifier of the resource from which to disassociate the TagOption.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Identifier of the resource from which to disassociate the TagOption.
     * </p>
     * 
     * @param resourceId
     *        Identifier of the resource from which to disassociate the TagOption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTagOptionFromResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Identifier of the TagOption to disassociate from the resource.
     * </p>
     * 
     * @param tagOptionId
     *        Identifier of the TagOption to disassociate from the resource.
     */

    public void setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
    }

    /**
     * <p>
     * Identifier of the TagOption to disassociate from the resource.
     * </p>
     * 
     * @return Identifier of the TagOption to disassociate from the resource.
     */

    public String getTagOptionId() {
        return this.tagOptionId;
    }

    /**
     * <p>
     * Identifier of the TagOption to disassociate from the resource.
     * </p>
     * 
     * @param tagOptionId
     *        Identifier of the TagOption to disassociate from the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTagOptionFromResourceRequest withTagOptionId(String tagOptionId) {
        setTagOptionId(tagOptionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTagOptionId() != null)
            sb.append("TagOptionId: ").append(getTagOptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTagOptionFromResourceRequest == false)
            return false;
        DisassociateTagOptionFromResourceRequest other = (DisassociateTagOptionFromResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagOptionId() == null ^ this.getTagOptionId() == null)
            return false;
        if (other.getTagOptionId() != null && other.getTagOptionId().equals(this.getTagOptionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagOptionId() == null) ? 0 : getTagOptionId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTagOptionFromResourceRequest clone() {
        return (DisassociateTagOptionFromResourceRequest) super.clone();
    }

}
