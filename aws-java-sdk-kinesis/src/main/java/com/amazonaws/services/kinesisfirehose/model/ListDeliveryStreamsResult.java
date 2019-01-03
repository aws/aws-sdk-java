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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListDeliveryStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeliveryStreamsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the delivery streams.
     * </p>
     */
    private java.util.List<String> deliveryStreamNames;
    /**
     * <p>
     * Indicates whether there are more delivery streams available to list.
     * </p>
     */
    private Boolean hasMoreDeliveryStreams;

    /**
     * <p>
     * The names of the delivery streams.
     * </p>
     * 
     * @return The names of the delivery streams.
     */

    public java.util.List<String> getDeliveryStreamNames() {
        return deliveryStreamNames;
    }

    /**
     * <p>
     * The names of the delivery streams.
     * </p>
     * 
     * @param deliveryStreamNames
     *        The names of the delivery streams.
     */

    public void setDeliveryStreamNames(java.util.Collection<String> deliveryStreamNames) {
        if (deliveryStreamNames == null) {
            this.deliveryStreamNames = null;
            return;
        }

        this.deliveryStreamNames = new java.util.ArrayList<String>(deliveryStreamNames);
    }

    /**
     * <p>
     * The names of the delivery streams.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeliveryStreamNames(java.util.Collection)} or {@link #withDeliveryStreamNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param deliveryStreamNames
     *        The names of the delivery streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsResult withDeliveryStreamNames(String... deliveryStreamNames) {
        if (this.deliveryStreamNames == null) {
            setDeliveryStreamNames(new java.util.ArrayList<String>(deliveryStreamNames.length));
        }
        for (String ele : deliveryStreamNames) {
            this.deliveryStreamNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the delivery streams.
     * </p>
     * 
     * @param deliveryStreamNames
     *        The names of the delivery streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsResult withDeliveryStreamNames(java.util.Collection<String> deliveryStreamNames) {
        setDeliveryStreamNames(deliveryStreamNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more delivery streams available to list.
     * </p>
     * 
     * @param hasMoreDeliveryStreams
     *        Indicates whether there are more delivery streams available to list.
     */

    public void setHasMoreDeliveryStreams(Boolean hasMoreDeliveryStreams) {
        this.hasMoreDeliveryStreams = hasMoreDeliveryStreams;
    }

    /**
     * <p>
     * Indicates whether there are more delivery streams available to list.
     * </p>
     * 
     * @return Indicates whether there are more delivery streams available to list.
     */

    public Boolean getHasMoreDeliveryStreams() {
        return this.hasMoreDeliveryStreams;
    }

    /**
     * <p>
     * Indicates whether there are more delivery streams available to list.
     * </p>
     * 
     * @param hasMoreDeliveryStreams
     *        Indicates whether there are more delivery streams available to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsResult withHasMoreDeliveryStreams(Boolean hasMoreDeliveryStreams) {
        setHasMoreDeliveryStreams(hasMoreDeliveryStreams);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more delivery streams available to list.
     * </p>
     * 
     * @return Indicates whether there are more delivery streams available to list.
     */

    public Boolean isHasMoreDeliveryStreams() {
        return this.hasMoreDeliveryStreams;
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
        if (getDeliveryStreamNames() != null)
            sb.append("DeliveryStreamNames: ").append(getDeliveryStreamNames()).append(",");
        if (getHasMoreDeliveryStreams() != null)
            sb.append("HasMoreDeliveryStreams: ").append(getHasMoreDeliveryStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeliveryStreamsResult == false)
            return false;
        ListDeliveryStreamsResult other = (ListDeliveryStreamsResult) obj;
        if (other.getDeliveryStreamNames() == null ^ this.getDeliveryStreamNames() == null)
            return false;
        if (other.getDeliveryStreamNames() != null && other.getDeliveryStreamNames().equals(this.getDeliveryStreamNames()) == false)
            return false;
        if (other.getHasMoreDeliveryStreams() == null ^ this.getHasMoreDeliveryStreams() == null)
            return false;
        if (other.getHasMoreDeliveryStreams() != null && other.getHasMoreDeliveryStreams().equals(this.getHasMoreDeliveryStreams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamNames() == null) ? 0 : getDeliveryStreamNames().hashCode());
        hashCode = prime * hashCode + ((getHasMoreDeliveryStreams() == null) ? 0 : getHasMoreDeliveryStreams().hashCode());
        return hashCode;
    }

    @Override
    public ListDeliveryStreamsResult clone() {
        try {
            return (ListDeliveryStreamsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
