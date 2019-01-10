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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>DescribeOrderableDBInstanceOptions</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DescribeOrderableDBInstanceOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrderableDBInstanceOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the available offerings that match the
     * specified engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only the available offerings that match the
     * specified DB instance class.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the available offerings that match the
     * specified license model.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC
     * offerings.
     * </p>
     */
    private Boolean vpc;
    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     * 
     * @param engine
     *        The name of the engine to retrieve DB instance options for.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     * 
     * @return The name of the engine to retrieve DB instance options for.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the engine to retrieve DB instance options for.
     * </p>
     * 
     * @param engine
     *        The name of the engine to retrieve DB instance options for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the available offerings that match the
     * specified engine version.
     * </p>
     * 
     * @param engineVersion
     *        The engine version filter value. Specify this parameter to show only the available offerings that match
     *        the specified engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the available offerings that match the
     * specified engine version.
     * </p>
     * 
     * @return The engine version filter value. Specify this parameter to show only the available offerings that match
     *         the specified engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version filter value. Specify this parameter to show only the available offerings that match the
     * specified engine version.
     * </p>
     * 
     * @param engineVersion
     *        The engine version filter value. Specify this parameter to show only the available offerings that match
     *        the specified engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only the available offerings that match the
     * specified DB instance class.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class filter value. Specify this parameter to show only the available offerings that match
     *        the specified DB instance class.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only the available offerings that match the
     * specified DB instance class.
     * </p>
     * 
     * @return The DB instance class filter value. Specify this parameter to show only the available offerings that
     *         match the specified DB instance class.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class filter value. Specify this parameter to show only the available offerings that match the
     * specified DB instance class.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class filter value. Specify this parameter to show only the available offerings that match
     *        the specified DB instance class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the available offerings that match the
     * specified license model.
     * </p>
     * 
     * @param licenseModel
     *        The license model filter value. Specify this parameter to show only the available offerings that match the
     *        specified license model.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the available offerings that match the
     * specified license model.
     * </p>
     * 
     * @return The license model filter value. Specify this parameter to show only the available offerings that match
     *         the specified license model.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model filter value. Specify this parameter to show only the available offerings that match the
     * specified license model.
     * </p>
     * 
     * @param licenseModel
     *        The license model filter value. Specify this parameter to show only the available offerings that match the
     *        specified license model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC
     * offerings.
     * </p>
     * 
     * @param vpc
     *        The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or
     *        non-VPC offerings.
     */

    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC
     * offerings.
     * </p>
     * 
     * @return The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or
     *         non-VPC offerings.
     */

    public Boolean getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC
     * offerings.
     * </p>
     * 
     * @param vpc
     *        The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or
     *        non-VPC offerings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withVpc(Boolean vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or non-VPC
     * offerings.
     * </p>
     * 
     * @return The virtual private cloud (VPC) filter value. Specify this parameter to show only the available VPC or
     *         non-VPC offerings.
     */

    public Boolean isVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @return This parameter is not currently supported.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is not currently supported.
     * </p>
     * 
     * @param filters
     *        This parameter is not currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *        remaining results can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *         remaining results can be retrieved.</p>
     *         <p>
     *         Default: 100
     *         </p>
     *         <p>
     *         Constraints: Minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the remaining
     * results can be retrieved.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token (marker) is included in the response so that the
     *        remaining results can be retrieved.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrderableDBInstanceOptionsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrderableDBInstanceOptionsRequest == false)
            return false;
        DescribeOrderableDBInstanceOptionsRequest other = (DescribeOrderableDBInstanceOptionsRequest) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrderableDBInstanceOptionsRequest clone() {
        return (DescribeOrderableDBInstanceOptionsRequest) super.clone();
    }

}
