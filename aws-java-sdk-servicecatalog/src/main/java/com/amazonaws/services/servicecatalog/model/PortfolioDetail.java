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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a portfolio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/PortfolioDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PortfolioDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN assigned to the portfolio.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the portfolio.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The name of the portfolio provider.
     * </p>
     */
    private String providerName;

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param id
     *        The portfolio identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @return The portfolio identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The portfolio identifier.
     * </p>
     * 
     * @param id
     *        The portfolio identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN assigned to the portfolio.
     * </p>
     * 
     * @param aRN
     *        The ARN assigned to the portfolio.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN assigned to the portfolio.
     * </p>
     * 
     * @return The ARN assigned to the portfolio.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN assigned to the portfolio.
     * </p>
     * 
     * @param aRN
     *        The ARN assigned to the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @param displayName
     *        The name to use for display purposes.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @return The name to use for display purposes.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name to use for display purposes.
     * </p>
     * 
     * @param displayName
     *        The name to use for display purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the portfolio.
     * </p>
     * 
     * @param description
     *        The description of the portfolio.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the portfolio.
     * </p>
     * 
     * @return The description of the portfolio.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the portfolio.
     * </p>
     * 
     * @param description
     *        The description of the portfolio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @return The UTC time stamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC time stamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The name of the portfolio provider.
     * </p>
     * 
     * @param providerName
     *        The name of the portfolio provider.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the portfolio provider.
     * </p>
     * 
     * @return The name of the portfolio provider.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the portfolio provider.
     * </p>
     * 
     * @param providerName
     *        The name of the portfolio provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PortfolioDetail withProviderName(String providerName) {
        setProviderName(providerName);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PortfolioDetail == false)
            return false;
        PortfolioDetail other = (PortfolioDetail) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        return hashCode;
    }

    @Override
    public PortfolioDetail clone() {
        try {
            return (PortfolioDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.PortfolioDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
