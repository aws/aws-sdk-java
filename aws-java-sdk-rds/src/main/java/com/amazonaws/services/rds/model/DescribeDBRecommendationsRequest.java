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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter to include only the recommendations that were updated after this specified time.
     * </p>
     */
    private java.util.Date lastUpdatedAfter;
    /**
     * <p>
     * A filter to include only the recommendations that were updated before this specified time.
     * </p>
     */
    private java.util.Date lastUpdatedBefore;
    /**
     * <p>
     * The language that you choose to return the list of recommendations.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en_UK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>de</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt_BR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_TW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_CN</code>
     * </p>
     * </li>
     * </ul>
     */
    private String locale;
    /**
     * <p>
     * A filter that specifies one or more recommendations to describe.
     * </p>
     * <p>
     * Supported Filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only includes the
     * recommendations whose identifier is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - Accepts a list of recommendation statuses.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list only includes the recommendations whose status is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     * recommendations whose severity is one of the specified filter values.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes the
     * recommendations whose type is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only includes
     * the recommendations that generated for the specified databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only includes
     * the recommendations that generated for the specified clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the recommendations
     * that generated for the specified parameter groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only includes the
     * recommendations that generated for the specified cluster parameter groups.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of recommendations to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A filter to include only the recommendations that were updated after this specified time.
     * </p>
     * 
     * @param lastUpdatedAfter
     *        A filter to include only the recommendations that were updated after this specified time.
     */

    public void setLastUpdatedAfter(java.util.Date lastUpdatedAfter) {
        this.lastUpdatedAfter = lastUpdatedAfter;
    }

    /**
     * <p>
     * A filter to include only the recommendations that were updated after this specified time.
     * </p>
     * 
     * @return A filter to include only the recommendations that were updated after this specified time.
     */

    public java.util.Date getLastUpdatedAfter() {
        return this.lastUpdatedAfter;
    }

    /**
     * <p>
     * A filter to include only the recommendations that were updated after this specified time.
     * </p>
     * 
     * @param lastUpdatedAfter
     *        A filter to include only the recommendations that were updated after this specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withLastUpdatedAfter(java.util.Date lastUpdatedAfter) {
        setLastUpdatedAfter(lastUpdatedAfter);
        return this;
    }

    /**
     * <p>
     * A filter to include only the recommendations that were updated before this specified time.
     * </p>
     * 
     * @param lastUpdatedBefore
     *        A filter to include only the recommendations that were updated before this specified time.
     */

    public void setLastUpdatedBefore(java.util.Date lastUpdatedBefore) {
        this.lastUpdatedBefore = lastUpdatedBefore;
    }

    /**
     * <p>
     * A filter to include only the recommendations that were updated before this specified time.
     * </p>
     * 
     * @return A filter to include only the recommendations that were updated before this specified time.
     */

    public java.util.Date getLastUpdatedBefore() {
        return this.lastUpdatedBefore;
    }

    /**
     * <p>
     * A filter to include only the recommendations that were updated before this specified time.
     * </p>
     * 
     * @param lastUpdatedBefore
     *        A filter to include only the recommendations that were updated before this specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withLastUpdatedBefore(java.util.Date lastUpdatedBefore) {
        setLastUpdatedBefore(lastUpdatedBefore);
        return this;
    }

    /**
     * <p>
     * The language that you choose to return the list of recommendations.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en_UK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>de</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt_BR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_TW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_CN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param locale
     *        The language that you choose to return the list of recommendations.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en_UK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>de</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>es</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fr</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>it</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ja</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ko</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pt_BR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh_TW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh_CN</code>
     *        </p>
     *        </li>
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The language that you choose to return the list of recommendations.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en_UK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>de</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt_BR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_TW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_CN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The language that you choose to return the list of recommendations.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>en</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>en_UK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>de</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>es</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fr</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>id</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>it</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ja</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ko</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pt_BR</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh_TW</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>zh_CN</code>
     *         </p>
     *         </li>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The language that you choose to return the list of recommendations.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>en</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>en_UK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>de</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>es</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fr</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>id</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>it</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ja</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ko</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pt_BR</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_TW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>zh_CN</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param locale
     *        The language that you choose to return the list of recommendations.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>en</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>en_UK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>de</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>es</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fr</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>id</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>it</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ja</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ko</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pt_BR</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh_TW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>zh_CN</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * A filter that specifies one or more recommendations to describe.
     * </p>
     * <p>
     * Supported Filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only includes the
     * recommendations whose identifier is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - Accepts a list of recommendation statuses.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list only includes the recommendations whose status is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     * recommendations whose severity is one of the specified filter values.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes the
     * recommendations whose type is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only includes
     * the recommendations that generated for the specified databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only includes
     * the recommendations that generated for the specified clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the recommendations
     * that generated for the specified parameter groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only includes the
     * recommendations that generated for the specified cluster parameter groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A filter that specifies one or more recommendations to describe.</p>
     *         <p>
     *         Supported Filters:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only
     *         includes the recommendations whose identifier is one of the specified filter values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - Accepts a list of recommendation statuses.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - The recommendations which are ready for you to apply.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resolved</code> - The recommendations which are completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dismissed</code> - The recommendations that you dismissed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The results list only includes the recommendations whose status is one of the specified filter values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     *         recommendations whose severity is one of the specified filter values.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>high</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>medium</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>low</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>informational</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes
     *         the recommendations whose type is one of the specified filter values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only
     *         includes the recommendations that generated for the specified databases.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only
     *         includes the recommendations that generated for the specified clusters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the
     *         recommendations that generated for the specified parameter groups.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only
     *         includes the recommendations that generated for the specified cluster parameter groups.
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
     * A filter that specifies one or more recommendations to describe.
     * </p>
     * <p>
     * Supported Filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only includes the
     * recommendations whose identifier is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - Accepts a list of recommendation statuses.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list only includes the recommendations whose status is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     * recommendations whose severity is one of the specified filter values.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes the
     * recommendations whose type is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only includes
     * the recommendations that generated for the specified databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only includes
     * the recommendations that generated for the specified clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the recommendations
     * that generated for the specified parameter groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only includes the
     * recommendations that generated for the specified cluster parameter groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more recommendations to describe.</p>
     *        <p>
     *        Supported Filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only
     *        includes the recommendations whose identifier is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - Accepts a list of recommendation statuses.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The recommendations which are ready for you to apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code> - The recommendations which are completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dismissed</code> - The recommendations that you dismissed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list only includes the recommendations whose status is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     *        recommendations whose severity is one of the specified filter values.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>high</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>informational</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes
     *        the recommendations whose type is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only
     *        includes the recommendations that generated for the specified databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only
     *        includes the recommendations that generated for the specified clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the
     *        recommendations that generated for the specified parameter groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only
     *        includes the recommendations that generated for the specified cluster parameter groups.
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
     * A filter that specifies one or more recommendations to describe.
     * </p>
     * <p>
     * Supported Filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only includes the
     * recommendations whose identifier is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - Accepts a list of recommendation statuses.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list only includes the recommendations whose status is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     * recommendations whose severity is one of the specified filter values.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes the
     * recommendations whose type is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only includes
     * the recommendations that generated for the specified databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only includes
     * the recommendations that generated for the specified clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the recommendations
     * that generated for the specified parameter groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only includes the
     * recommendations that generated for the specified cluster parameter groups.
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
     *        A filter that specifies one or more recommendations to describe.</p>
     *        <p>
     *        Supported Filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only
     *        includes the recommendations whose identifier is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - Accepts a list of recommendation statuses.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The recommendations which are ready for you to apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code> - The recommendations which are completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dismissed</code> - The recommendations that you dismissed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list only includes the recommendations whose status is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     *        recommendations whose severity is one of the specified filter values.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>high</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>informational</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes
     *        the recommendations whose type is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only
     *        includes the recommendations that generated for the specified databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only
     *        includes the recommendations that generated for the specified clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the
     *        recommendations that generated for the specified parameter groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only
     *        includes the recommendations that generated for the specified cluster parameter groups.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withFilters(Filter... filters) {
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
     * A filter that specifies one or more recommendations to describe.
     * </p>
     * <p>
     * Supported Filters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only includes the
     * recommendations whose identifier is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - Accepts a list of recommendation statuses.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - The recommendations which are ready for you to apply.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The applied or scheduled recommendations which are in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code> - The recommendations which are completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dismissed</code> - The recommendations that you dismissed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The results list only includes the recommendations whose status is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     * recommendations whose severity is one of the specified filter values.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>high</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>medium</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>low</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>informational</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes the
     * recommendations whose type is one of the specified filter values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only includes
     * the recommendations that generated for the specified databases.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only includes
     * the recommendations that generated for the specified clusters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the recommendations
     * that generated for the specified parameter groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only includes the
     * recommendations that generated for the specified cluster parameter groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        A filter that specifies one or more recommendations to describe.</p>
     *        <p>
     *        Supported Filters:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>recommendation-id</code> - Accepts a list of recommendation identifiers. The results list only
     *        includes the recommendations whose identifier is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - Accepts a list of recommendation statuses.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - The recommendations which are ready for you to apply.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The applied or scheduled recommendations which are in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code> - The recommendations which are completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dismissed</code> - The recommendations that you dismissed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The results list only includes the recommendations whose status is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>severity</code> - Accepts a list of recommendation severities. The results list only includes the
     *        recommendations whose severity is one of the specified filter values.
     *        </p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>high</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>medium</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>low</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>informational</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type-id</code> - Accepts a list of recommendation type identifiers. The results list only includes
     *        the recommendations whose type is one of the specified filter values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>dbi-resource-id</code> - Accepts a list of database resource identifiers. The results list only
     *        includes the recommendations that generated for the specified databases.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-resource-id</code> - Accepts a list of cluster resource identifiers. The results list only
     *        includes the recommendations that generated for the specified clusters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pg-arn</code> - Accepts a list of parameter group ARNs. The results list only includes the
     *        recommendations that generated for the specified parameter groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>cluster-pg-arn</code> - Accepts a list of cluster parameter group ARNs. The results list only
     *        includes the recommendations that generated for the specified cluster parameter groups.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of recommendations to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of recommendations to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of recommendations to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @return The maximum number of recommendations to include in the response. If more records exist than the
     *         specified <code>MaxRecords</code> value, a pagination token called a marker is included in the response
     *         so that you can retrieve the remaining results.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of recommendations to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you can
     * retrieve the remaining results.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of recommendations to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a pagination token called a marker is included in the response so that you
     *        can retrieve the remaining results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If
     *         this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous <code>DescribeDBRecommendations</code> request. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBRecommendationsRequest withMarker(String marker) {
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
        if (getLastUpdatedAfter() != null)
            sb.append("LastUpdatedAfter: ").append(getLastUpdatedAfter()).append(",");
        if (getLastUpdatedBefore() != null)
            sb.append("LastUpdatedBefore: ").append(getLastUpdatedBefore()).append(",");
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
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

        if (obj instanceof DescribeDBRecommendationsRequest == false)
            return false;
        DescribeDBRecommendationsRequest other = (DescribeDBRecommendationsRequest) obj;
        if (other.getLastUpdatedAfter() == null ^ this.getLastUpdatedAfter() == null)
            return false;
        if (other.getLastUpdatedAfter() != null && other.getLastUpdatedAfter().equals(this.getLastUpdatedAfter()) == false)
            return false;
        if (other.getLastUpdatedBefore() == null ^ this.getLastUpdatedBefore() == null)
            return false;
        if (other.getLastUpdatedBefore() != null && other.getLastUpdatedBefore().equals(this.getLastUpdatedBefore()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
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

        hashCode = prime * hashCode + ((getLastUpdatedAfter() == null) ? 0 : getLastUpdatedAfter().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBefore() == null) ? 0 : getLastUpdatedBefore().hashCode());
        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBRecommendationsRequest clone() {
        return (DescribeDBRecommendationsRequest) super.clone();
    }

}
