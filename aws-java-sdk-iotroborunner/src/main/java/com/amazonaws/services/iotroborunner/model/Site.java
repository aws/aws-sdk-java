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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Facility containing destinations, workers, activities, and tasks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/Site" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Site implements Serializable, Cloneable, StructuredPojo {

    private String arn;
    /**
     * <p>
     * The name of the site. Mutable after creation and unique within a given account.
     * </p>
     */
    private String name;

    private String countryCode;

    private java.util.Date createdAt;

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the site. Mutable after creation and unique within a given account.
     * </p>
     * 
     * @param name
     *        The name of the site. Mutable after creation and unique within a given account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the site. Mutable after creation and unique within a given account.
     * </p>
     * 
     * @return The name of the site. Mutable after creation and unique within a given account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the site. Mutable after creation and unique within a given account.
     * </p>
     * 
     * @param name
     *        The name of the site. Mutable after creation and unique within a given account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param countryCode
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @param countryCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Site withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Site == false)
            return false;
        Site other = (Site) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Site clone() {
        try {
            return (Site) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotroborunner.model.transform.SiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
