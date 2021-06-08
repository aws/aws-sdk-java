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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditSuppressionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String checkName;

    private ResourceIdentifier resourceIdentifier;
    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     */
    private java.util.Date expirationDate;
    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     */
    private Boolean suppressIndefinitely;
    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     */
    private String description;

    /**
     * @param checkName
     */

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * @return
     */

    public String getCheckName() {
        return this.checkName;
    }

    /**
     * @param checkName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditSuppressionResult withCheckName(String checkName) {
        setCheckName(checkName);
        return this;
    }

    /**
     * @param resourceIdentifier
     */

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * @return
     */

    public ResourceIdentifier getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * @param resourceIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditSuppressionResult withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     * 
     * @param expirationDate
     *        The epoch timestamp in seconds at which this suppression expires.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     * 
     * @return The epoch timestamp in seconds at which this suppression expires.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The epoch timestamp in seconds at which this suppression expires.
     * </p>
     * 
     * @param expirationDate
     *        The epoch timestamp in seconds at which this suppression expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditSuppressionResult withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     * 
     * @param suppressIndefinitely
     *        Indicates whether a suppression should exist indefinitely or not.
     */

    public void setSuppressIndefinitely(Boolean suppressIndefinitely) {
        this.suppressIndefinitely = suppressIndefinitely;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     * 
     * @return Indicates whether a suppression should exist indefinitely or not.
     */

    public Boolean getSuppressIndefinitely() {
        return this.suppressIndefinitely;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     * 
     * @param suppressIndefinitely
     *        Indicates whether a suppression should exist indefinitely or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditSuppressionResult withSuppressIndefinitely(Boolean suppressIndefinitely) {
        setSuppressIndefinitely(suppressIndefinitely);
        return this;
    }

    /**
     * <p>
     * Indicates whether a suppression should exist indefinitely or not.
     * </p>
     * 
     * @return Indicates whether a suppression should exist indefinitely or not.
     */

    public Boolean isSuppressIndefinitely() {
        return this.suppressIndefinitely;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * 
     * @param description
     *        The description of the audit suppression.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * 
     * @return The description of the audit suppression.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audit suppression.
     * </p>
     * 
     * @param description
     *        The description of the audit suppression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAuditSuppressionResult withDescription(String description) {
        setDescription(description);
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
        if (getCheckName() != null)
            sb.append("CheckName: ").append(getCheckName()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate()).append(",");
        if (getSuppressIndefinitely() != null)
            sb.append("SuppressIndefinitely: ").append(getSuppressIndefinitely()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAuditSuppressionResult == false)
            return false;
        DescribeAuditSuppressionResult other = (DescribeAuditSuppressionResult) obj;
        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        if (other.getSuppressIndefinitely() == null ^ this.getSuppressIndefinitely() == null)
            return false;
        if (other.getSuppressIndefinitely() != null && other.getSuppressIndefinitely().equals(this.getSuppressIndefinitely()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        hashCode = prime * hashCode + ((getSuppressIndefinitely() == null) ? 0 : getSuppressIndefinitely().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAuditSuppressionResult clone() {
        try {
            return (DescribeAuditSuppressionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
