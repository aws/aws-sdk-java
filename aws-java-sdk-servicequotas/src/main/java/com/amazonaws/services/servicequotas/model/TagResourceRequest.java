/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service Quotas
     * console, or by listing the quotas using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     * >list-service-quotas</a> AWS CLI command or the <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     * >ListServiceQuotas</a> AWS API operation.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The tags that you want to add to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service Quotas
     * console, or by listing the quotas using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     * >list-service-quotas</a> AWS CLI command or the <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     * >ListServiceQuotas</a> AWS API operation.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service
     *        Quotas console, or by listing the quotas using the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     *        >list-service-quotas</a> AWS CLI command or the <a
     *        href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     *        >ListServiceQuotas</a> AWS API operation.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service Quotas
     * console, or by listing the quotas using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     * >list-service-quotas</a> AWS CLI command or the <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     * >ListServiceQuotas</a> AWS API operation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service
     *         Quotas console, or by listing the quotas using the <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     *         >list-service-quotas</a> AWS CLI command or the <a
     *         href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     *         >ListServiceQuotas</a> AWS API operation.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service Quotas
     * console, or by listing the quotas using the <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     * >list-service-quotas</a> AWS CLI command or the <a
     * href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     * >ListServiceQuotas</a> AWS API operation.
     * </p>
     * 
     * @param resourceARN
     *        The Amazon Resource Name (ARN) for the applied quota. You can get this information by using the Service
     *        Quotas console, or by listing the quotas using the <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html"
     *        >list-service-quotas</a> AWS CLI command or the <a
     *        href="https://docs.aws.amazon.com/servicequotas/2019-06-24/apireference/API_ListServiceQuotas.html"
     *        >ListServiceQuotas</a> AWS API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the resource.
     * </p>
     * 
     * @return The tags that you want to add to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you want to add to the resource.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags that you want to add to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the resource.
     * </p>
     * 
     * @param tags
     *        The tags that you want to add to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
