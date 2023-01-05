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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeBlueGreenDeployments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBlueGreenDeploymentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The blue/green deployment identifier. If this parameter is specified, information from only the specific
     * blue/green deployment is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     */
    private String blueGreenDeploymentIdentifier;
    /**
     * <p>
     * A filter that specifies one or more blue/green deployments to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green deployments.
     * The results list only includes information about the blue/green deployments with the specified identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The results
     * list only includes information about the blue/green deployments with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified source databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified target databases.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
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
     * The blue/green deployment identifier. If this parameter is specified, information from only the specific
     * blue/green deployment is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The blue/green deployment identifier. If this parameter is specified, information from only the specific
     *        blue/green deployment is returned. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing blue/green deployment identifier.
     *        </p>
     *        </li>
     */

    public void setBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        this.blueGreenDeploymentIdentifier = blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The blue/green deployment identifier. If this parameter is specified, information from only the specific
     * blue/green deployment is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The blue/green deployment identifier. If this parameter is specified, information from only the specific
     *         blue/green deployment is returned. This parameter isn't case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match an existing blue/green deployment identifier.
     *         </p>
     *         </li>
     */

    public String getBlueGreenDeploymentIdentifier() {
        return this.blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The blue/green deployment identifier. If this parameter is specified, information from only the specific
     * blue/green deployment is returned. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match an existing blue/green deployment identifier.
     * </p>
     * </li>
     * </ul>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The blue/green deployment identifier. If this parameter is specified, information from only the specific
     *        blue/green deployment is returned. This parameter isn't case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match an existing blue/green deployment identifier.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsRequest withBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        setBlueGreenDeploymentIdentifier(blueGreenDeploymentIdentifier);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more blue/green deployments to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green deployments.
     * The results list only includes information about the blue/green deployments with the specified identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The results
     * list only includes information about the blue/green deployments with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified source databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified target databases.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more blue/green deployments to describe.</p>
     *         <p>
     *         Supported filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green
     *         deployments. The results list only includes information about the blue/green deployments with the
     *         specified identifiers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The
     *         results list only includes information about the blue/green deployments with the specified names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source</code> - Accepts source databases for a blue/green deployment. The results list only
     *         includes information about the blue/green deployments with the specified source databases.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target</code> - Accepts target databases for a blue/green deployment. The results list only
     *         includes information about the blue/green deployments with the specified target databases.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * A filter that specifies one or more blue/green deployments to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green deployments.
     * The results list only includes information about the blue/green deployments with the specified identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The results
     * list only includes information about the blue/green deployments with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified source databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified target databases.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more blue/green deployments to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green
     *        deployments. The results list only includes information about the blue/green deployments with the
     *        specified identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The
     *        results list only includes information about the blue/green deployments with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified source databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified target databases.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * A filter that specifies one or more blue/green deployments to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green deployments.
     * The results list only includes information about the blue/green deployments with the specified identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The results
     * list only includes information about the blue/green deployments with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified source databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified target databases.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A filter that specifies one or more blue/green deployments to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green
     *        deployments. The results list only includes information about the blue/green deployments with the
     *        specified identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The
     *        results list only includes information about the blue/green deployments with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified source databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified target databases.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more blue/green deployments to describe.
     * </p>
     * <p>
     * Supported filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green deployments.
     * The results list only includes information about the blue/green deployments with the specified identifiers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The results
     * list only includes information about the blue/green deployments with the specified names.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified source databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     * information about the blue/green deployments with the specified target databases.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more blue/green deployments to describe.</p>
     *        <p>
     *        Supported filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-identifier</code> - Accepts system-generated identifiers for blue/green
     *        deployments. The results list only includes information about the blue/green deployments with the
     *        specified identifiers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>blue-green-deployment-name</code> - Accepts user-supplied names for blue/green deployments. The
     *        results list only includes information about the blue/green deployments with the specified names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source</code> - Accepts source databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified source databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target</code> - Accepts target databases for a blue/green deployment. The results list only includes
     *        information about the blue/green deployments with the specified target databases.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If
     *         this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeBlueGreenDeployments</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
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
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
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
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
     * </p>
     * <p>
     * Default: 100
     * </p>
     * <p>
     * Constraints: Minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *         retrieve the remaining results.</p>
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
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can retrieve
     * the remaining results.
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
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so you can
     *        retrieve the remaining results.</p>
     *        <p>
     *        Default: 100
     *        </p>
     *        <p>
     *        Constraints: Minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBlueGreenDeploymentsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getBlueGreenDeploymentIdentifier() != null)
            sb.append("BlueGreenDeploymentIdentifier: ").append(getBlueGreenDeploymentIdentifier()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBlueGreenDeploymentsRequest == false)
            return false;
        DescribeBlueGreenDeploymentsRequest other = (DescribeBlueGreenDeploymentsRequest) obj;
        if (other.getBlueGreenDeploymentIdentifier() == null ^ this.getBlueGreenDeploymentIdentifier() == null)
            return false;
        if (other.getBlueGreenDeploymentIdentifier() != null
                && other.getBlueGreenDeploymentIdentifier().equals(this.getBlueGreenDeploymentIdentifier()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenDeploymentIdentifier() == null) ? 0 : getBlueGreenDeploymentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBlueGreenDeploymentsRequest clone() {
        return (DescribeBlueGreenDeploymentsRequest) super.clone();
    }

}
