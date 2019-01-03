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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability
     * Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * </p>
     */
    private Boolean includeAvailabilityZones;
    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions
     * request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     */
    private Boolean includeRelationalDatabaseAvailabilityZones;

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability
     * Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * </p>
     * 
     * @param includeAvailabilityZones
     *        A Boolean value indicating whether to also include Availability Zones in your get regions request.
     *        Availability Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     */

    public void setIncludeAvailabilityZones(Boolean includeAvailabilityZones) {
        this.includeAvailabilityZones = includeAvailabilityZones;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability
     * Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * </p>
     * 
     * @return A Boolean value indicating whether to also include Availability Zones in your get regions request.
     *         Availability Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     */

    public Boolean getIncludeAvailabilityZones() {
        return this.includeAvailabilityZones;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability
     * Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * </p>
     * 
     * @param includeAvailabilityZones
     *        A Boolean value indicating whether to also include Availability Zones in your get regions request.
     *        Availability Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegionsRequest withIncludeAvailabilityZones(Boolean includeAvailabilityZones) {
        setIncludeAvailabilityZones(includeAvailabilityZones);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether to also include Availability Zones in your get regions request. Availability
     * Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     * </p>
     * 
     * @return A Boolean value indicating whether to also include Availability Zones in your get regions request.
     *         Availability Zones are indicated with a letter: e.g., <code>us-east-2a</code>.
     */

    public Boolean isIncludeAvailabilityZones() {
        return this.includeAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions
     * request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     * 
     * @param includeRelationalDatabaseAvailabilityZones
     *        &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get
     *        regions request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     */

    public void setIncludeRelationalDatabaseAvailabilityZones(Boolean includeRelationalDatabaseAvailabilityZones) {
        this.includeRelationalDatabaseAvailabilityZones = includeRelationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions
     * request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     * 
     * @return &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get
     *         regions request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     */

    public Boolean getIncludeRelationalDatabaseAvailabilityZones() {
        return this.includeRelationalDatabaseAvailabilityZones;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions
     * request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     * 
     * @param includeRelationalDatabaseAvailabilityZones
     *        &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get
     *        regions request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegionsRequest withIncludeRelationalDatabaseAvailabilityZones(Boolean includeRelationalDatabaseAvailabilityZones) {
        setIncludeRelationalDatabaseAvailabilityZones(includeRelationalDatabaseAvailabilityZones);
        return this;
    }

    /**
     * <p>
     * &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get regions
     * request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     * </p>
     * 
     * @return &gt;A Boolean value indicating whether to also include Availability Zones for databases in your get
     *         regions request. Availability Zones are indicated with a letter (e.g., <code>us-east-2a</code>).
     */

    public Boolean isIncludeRelationalDatabaseAvailabilityZones() {
        return this.includeRelationalDatabaseAvailabilityZones;
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
        if (getIncludeAvailabilityZones() != null)
            sb.append("IncludeAvailabilityZones: ").append(getIncludeAvailabilityZones()).append(",");
        if (getIncludeRelationalDatabaseAvailabilityZones() != null)
            sb.append("IncludeRelationalDatabaseAvailabilityZones: ").append(getIncludeRelationalDatabaseAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegionsRequest == false)
            return false;
        GetRegionsRequest other = (GetRegionsRequest) obj;
        if (other.getIncludeAvailabilityZones() == null ^ this.getIncludeAvailabilityZones() == null)
            return false;
        if (other.getIncludeAvailabilityZones() != null && other.getIncludeAvailabilityZones().equals(this.getIncludeAvailabilityZones()) == false)
            return false;
        if (other.getIncludeRelationalDatabaseAvailabilityZones() == null ^ this.getIncludeRelationalDatabaseAvailabilityZones() == null)
            return false;
        if (other.getIncludeRelationalDatabaseAvailabilityZones() != null
                && other.getIncludeRelationalDatabaseAvailabilityZones().equals(this.getIncludeRelationalDatabaseAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeAvailabilityZones() == null) ? 0 : getIncludeAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getIncludeRelationalDatabaseAvailabilityZones() == null) ? 0 : getIncludeRelationalDatabaseAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public GetRegionsRequest clone() {
        return (GetRegionsRequest) super.clone();
    }

}
