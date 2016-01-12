/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetQueueAttributesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;

    /**
     * Default constructor for GetQueueAttributesRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public GetQueueAttributesRequest() {
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.
     */
    public GetQueueAttributesRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * Constructs a new GetQueueAttributesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.
     * @param attributeNames
     *        A list of attributes to retrieve information for.
     */
    public GetQueueAttributesRequest(String queueUrl,
            java.util.List<String> attributeNames) {
        setQueueUrl(queueUrl);
        setAttributeNames(attributeNames);
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.
     */
    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue to take action on.
     */
    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue to take action on.
     * </p>
     * 
     * @param queueUrl
     *        The URL of the Amazon SQS queue to take action on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetQueueAttributesRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     * 
     * @return A list of attributes to retrieve information for.
     * @see QueueAttributeName
     */
    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes to retrieve information for.
     * @see QueueAttributeName
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(
                attributeNames);
    }

    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttributeNames(java.util.Collection)} or
     * {@link #withAttributeNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes to retrieve information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see QueueAttributeName
     */
    public GetQueueAttributesRequest withAttributeNames(
            String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(
                    attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes to retrieve information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see QueueAttributeName
     */
    public GetQueueAttributesRequest withAttributeNames(
            java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * A list of attributes to retrieve information for.
     * </p>
     * 
     * @param attributeNames
     *        A list of attributes to retrieve information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see QueueAttributeName
     */
    public GetQueueAttributesRequest withAttributeNames(
            QueueAttributeName... attributeNames) {
        com.amazonaws.internal.SdkInternalList<String> attributeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                attributeNames.length);
        for (QueueAttributeName value : attributeNames) {
            attributeNamesCopy.add(value.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl() + ",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueAttributesRequest == false)
            return false;
        GetQueueAttributesRequest other = (GetQueueAttributesRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null
                && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        if (other.getAttributeNames() == null
                ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetQueueAttributesRequest clone() {
        return (GetQueueAttributesRequest) super.clone();
    }
}