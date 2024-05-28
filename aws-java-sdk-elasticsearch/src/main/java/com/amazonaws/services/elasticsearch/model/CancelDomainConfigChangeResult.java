/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of the cancelled domain config change.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelDomainConfigChangeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * The unique identifiers of the changes that were cancelled.
     * </p>
     */
    private java.util.List<String> cancelledChangeIds;
    /**
     * <p>
     * The domain change properties that were cancelled.
     * </p>
     */
    private java.util.List<CancelledChangeProperty> cancelledChangeProperties;

    /**
     * <p>
     * Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * </p>
     * 
     * @param dryRun
     *        Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * </p>
     * 
     * @return Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * </p>
     * 
     * @param dryRun
     *        Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeResult withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     * </p>
     * 
     * @return Whether or not the request was a dry run. If <b>True</b>, the changes were not actually cancelled.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * The unique identifiers of the changes that were cancelled.
     * </p>
     * 
     * @return The unique identifiers of the changes that were cancelled.
     */

    public java.util.List<String> getCancelledChangeIds() {
        return cancelledChangeIds;
    }

    /**
     * <p>
     * The unique identifiers of the changes that were cancelled.
     * </p>
     * 
     * @param cancelledChangeIds
     *        The unique identifiers of the changes that were cancelled.
     */

    public void setCancelledChangeIds(java.util.Collection<String> cancelledChangeIds) {
        if (cancelledChangeIds == null) {
            this.cancelledChangeIds = null;
            return;
        }

        this.cancelledChangeIds = new java.util.ArrayList<String>(cancelledChangeIds);
    }

    /**
     * <p>
     * The unique identifiers of the changes that were cancelled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCancelledChangeIds(java.util.Collection)} or {@link #withCancelledChangeIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cancelledChangeIds
     *        The unique identifiers of the changes that were cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeResult withCancelledChangeIds(String... cancelledChangeIds) {
        if (this.cancelledChangeIds == null) {
            setCancelledChangeIds(new java.util.ArrayList<String>(cancelledChangeIds.length));
        }
        for (String ele : cancelledChangeIds) {
            this.cancelledChangeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the changes that were cancelled.
     * </p>
     * 
     * @param cancelledChangeIds
     *        The unique identifiers of the changes that were cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeResult withCancelledChangeIds(java.util.Collection<String> cancelledChangeIds) {
        setCancelledChangeIds(cancelledChangeIds);
        return this;
    }

    /**
     * <p>
     * The domain change properties that were cancelled.
     * </p>
     * 
     * @return The domain change properties that were cancelled.
     */

    public java.util.List<CancelledChangeProperty> getCancelledChangeProperties() {
        return cancelledChangeProperties;
    }

    /**
     * <p>
     * The domain change properties that were cancelled.
     * </p>
     * 
     * @param cancelledChangeProperties
     *        The domain change properties that were cancelled.
     */

    public void setCancelledChangeProperties(java.util.Collection<CancelledChangeProperty> cancelledChangeProperties) {
        if (cancelledChangeProperties == null) {
            this.cancelledChangeProperties = null;
            return;
        }

        this.cancelledChangeProperties = new java.util.ArrayList<CancelledChangeProperty>(cancelledChangeProperties);
    }

    /**
     * <p>
     * The domain change properties that were cancelled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCancelledChangeProperties(java.util.Collection)} or
     * {@link #withCancelledChangeProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cancelledChangeProperties
     *        The domain change properties that were cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeResult withCancelledChangeProperties(CancelledChangeProperty... cancelledChangeProperties) {
        if (this.cancelledChangeProperties == null) {
            setCancelledChangeProperties(new java.util.ArrayList<CancelledChangeProperty>(cancelledChangeProperties.length));
        }
        for (CancelledChangeProperty ele : cancelledChangeProperties) {
            this.cancelledChangeProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The domain change properties that were cancelled.
     * </p>
     * 
     * @param cancelledChangeProperties
     *        The domain change properties that were cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelDomainConfigChangeResult withCancelledChangeProperties(java.util.Collection<CancelledChangeProperty> cancelledChangeProperties) {
        setCancelledChangeProperties(cancelledChangeProperties);
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
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getCancelledChangeIds() != null)
            sb.append("CancelledChangeIds: ").append(getCancelledChangeIds()).append(",");
        if (getCancelledChangeProperties() != null)
            sb.append("CancelledChangeProperties: ").append(getCancelledChangeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDomainConfigChangeResult == false)
            return false;
        CancelDomainConfigChangeResult other = (CancelDomainConfigChangeResult) obj;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getCancelledChangeIds() == null ^ this.getCancelledChangeIds() == null)
            return false;
        if (other.getCancelledChangeIds() != null && other.getCancelledChangeIds().equals(this.getCancelledChangeIds()) == false)
            return false;
        if (other.getCancelledChangeProperties() == null ^ this.getCancelledChangeProperties() == null)
            return false;
        if (other.getCancelledChangeProperties() != null && other.getCancelledChangeProperties().equals(this.getCancelledChangeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getCancelledChangeIds() == null) ? 0 : getCancelledChangeIds().hashCode());
        hashCode = prime * hashCode + ((getCancelledChangeProperties() == null) ? 0 : getCancelledChangeProperties().hashCode());
        return hashCode;
    }

    @Override
    public CancelDomainConfigChangeResult clone() {
        try {
            return (CancelDomainConfigChangeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
