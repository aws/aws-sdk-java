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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformBranches"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformBranchesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     * conjunction (AND) of the separate <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most operators
     * take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SearchFilter> filters;
    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     * conjunction (AND) of the separate <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most operators
     * take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * </p>
     * 
     * @return Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     *         conjunction (AND) of the separate <code>SearchFilter</code> terms.</p>
     *         <p>
     *         The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most
     *         operators take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple
     *         values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Attribute = BranchName</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *         <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = LifecycleState</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *         <code>retired</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = PlatformName</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *         <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Attribute = TierType</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Operator</code>: <code>=</code> | <code>!=</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Array size: limited to 10 <code>SearchFilter</code> objects.
     *         </p>
     *         <p>
     *         Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     */

    public java.util.List<SearchFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<SearchFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     * conjunction (AND) of the separate <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most operators
     * take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * </p>
     * 
     * @param filters
     *        Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     *        conjunction (AND) of the separate <code>SearchFilter</code> terms.</p>
     *        <p>
     *        The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most
     *        operators take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple
     *        values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Attribute = BranchName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = LifecycleState</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = PlatformName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = TierType</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Array size: limited to 10 <code>SearchFilter</code> objects.
     *        </p>
     *        <p>
     *        Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     */

    public void setFilters(java.util.Collection<SearchFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<SearchFilter>(filters);
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     * conjunction (AND) of the separate <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most operators
     * take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     *        conjunction (AND) of the separate <code>SearchFilter</code> terms.</p>
     *        <p>
     *        The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most
     *        operators take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple
     *        values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Attribute = BranchName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = LifecycleState</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = PlatformName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = TierType</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Array size: limited to 10 <code>SearchFilter</code> objects.
     *        </p>
     *        <p>
     *        Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesRequest withFilters(SearchFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<SearchFilter>(filters.length));
        }
        for (SearchFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     * conjunction (AND) of the separate <code>SearchFilter</code> terms.
     * </p>
     * <p>
     * The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most operators
     * take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Attribute = BranchName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = LifecycleState</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = PlatformName</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> | <code>ends_with</code> |
     * <code>contains</code> | <code>in</code> | <code>not_in</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>Attribute = TierType</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Operator</code>: <code>=</code> | <code>!=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Array size: limited to 10 <code>SearchFilter</code> objects.
     * </p>
     * <p>
     * Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * </p>
     * 
     * @param filters
     *        Criteria for restricting the resulting list of platform branches. The filter is evaluated as a logical
     *        conjunction (AND) of the separate <code>SearchFilter</code> terms.</p>
     *        <p>
     *        The following list shows valid attribute values for each of the <code>SearchFilter</code> terms. Most
     *        operators take a single value. The <code>in</code> and <code>not_in</code> operators can take multiple
     *        values.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Attribute = BranchName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = LifecycleState</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = PlatformName</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code> | <code>begins_with</code> |
     *        <code>ends_with</code> | <code>contains</code> | <code>in</code> | <code>not_in</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Attribute = TierType</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Operator</code>: <code>=</code> | <code>!=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Values</code>: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Array size: limited to 10 <code>SearchFilter</code> objects.
     *        </p>
     *        <p>
     *        Within each <code>SearchFilter</code> item, the <code>Values</code> array is limited to 10 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesRequest withFilters(java.util.Collection<SearchFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of platform branch values returned in one call.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * 
     * @return The maximum number of platform branch values returned in one call.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform branch values returned in one call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of platform branch values returned in one call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request. Specify a token from a previous response page to retrieve the next response page.
     *        All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If no <code>NextToken</code> is specified, the first page is retrieved.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @return For a paginated request. Specify a token from a previous response page to retrieve the next response
     *         page. All other parameter values must be identical to the ones specified in the initial request.</p>
     *         <p>
     *         If no <code>NextToken</code> is specified, the first page is retrieved.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For a paginated request. Specify a token from a previous response page to retrieve the next response page. All
     * other parameter values must be identical to the ones specified in the initial request.
     * </p>
     * <p>
     * If no <code>NextToken</code> is specified, the first page is retrieved.
     * </p>
     * 
     * @param nextToken
     *        For a paginated request. Specify a token from a previous response page to retrieve the next response page.
     *        All other parameter values must be identical to the ones specified in the initial request.</p>
     *        <p>
     *        If no <code>NextToken</code> is specified, the first page is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformBranchesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPlatformBranchesRequest == false)
            return false;
        ListPlatformBranchesRequest other = (ListPlatformBranchesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformBranchesRequest clone() {
        return (ListPlatformBranchesRequest) super.clone();
    }

}
